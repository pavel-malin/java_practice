@Deprecated
class MyClass1 {
    private String msg;

    MyClass1(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }

    // ...
}

public class AnnoDemo {
    public static void main(String[] args) {
        MyClass1 myObj = new MyClass1("test");
        System.out.println(myObj.getMsg());
    }
}
