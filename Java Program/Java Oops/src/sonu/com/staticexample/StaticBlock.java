package sonu.com.staticexample;

public class StaticBlock {

    static int a = 4;
    static  int b;

    static {
        System.out.println("I am in statics block");
        b = a*5;
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);


        StaticBlock.b +=3;
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

    }
}
