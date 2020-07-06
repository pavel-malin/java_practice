import java.util.Stack;

interface IGenStack<T> {
    void push(T obj) throws StackFullException;
    T pop() throws StackEmptyException;
}

class StackFullException extends Exception {
    int size;

    StackFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nThe stack is full. Max stack size: " + size;
    }
}

class StackEmptyException extends Exception {
    public String toString() {
        return "\nStack is empty.";
    }
}

class GenStack<T> implements IGenStack<T> {
    private T stck[];
    private int tos;

    GenStack(T[] stckArray) {
        stck = stckArray;
        tos = 0;
    }

    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;
        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        for (int i=0; i<tos; i++)
            stck[i] = ob.stck[i];
    }

    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;
        for (int i=0; i<a.length; i++) {
            try {
                push(a[i]);
            }
            catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    public void push(T obj) throws StackFullException {
        if (tos == stck.length)
            throw new StackFullException(stck.length);
        stck[tos] = obj;
        tos++;
    }

    public T pop() throws StackEmptyException {
        if (tos == 0)
            throw new StackEmptyException();
        tos--;
        return stck[tos];
    }
}

public class GenStackDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenStack<Integer> stck1 = new GenStack<Integer>(iStore);

        String name[] = {"One", "Two", "Three"};
        String strStore[] = new String[3];
        GenStack<String> stck2 = new GenStack<String>(strStore, name);
        String str;
        int n;

        try {
            for (int i=0; i<10; i++)
                stck1.push(1);
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        String strStore2[] = new String[3];
        GenStack<String> stck3 = new GenStack<>(strStore2, stck2);

        try {
            System.out.println("Content stck1: ");
            for (int i=0; i<10; i++) {
                n = stck1.pop();
                System.out.print(n + " ");
            }
            System.out.println("\n");

            System.out.println("Content stck2: ");
            for (int i=0; i<3; i++) {
                str = stck2.pop();
                System.out.print(str + " ");
            }
            System.out.println("\n");

            System.out.print("Content stck3: ");
            for (int i=0; i<3; i++) {
                str = stck3.pop();
                System.out.print(str + " ");
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
    }
}
