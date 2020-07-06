interface MyFunc3 {
    MyClass3 func(String s);
}

class MyClass3 {
    private String str;

    MyClass3(String s) {
        str = s;
    }

    MyClass3() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc3 myClassCons = MyClass3::new;
        MyClass3 mc = myClassCons.func("Testing ");
        System.out.println("String str in mc: " + mc.getStr());
    }
}
