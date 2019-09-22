class A{
    {
        System.out.println("A ");
    }
    public A(){
        System.out.println("A con");
    }

    static{
        System.out.println("A sts");
    }
}

public class Test extends A{
    {
        System.out.println("Test ");
    }
    public Test(){
        System.out.println("Test con");
    }

    static{
        System.out.println("Test sts");
    }
    public static void main(String[] args){
        new Test();
    }
}
