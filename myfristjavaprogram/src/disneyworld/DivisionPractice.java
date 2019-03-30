package disneyworld;

public class DivisionPractice {
    static int a = 20;
    static int b = 5;
    static byte c = 100;
    short d = 2;
    public static void main (String []args){
        DivisionPractice div = new DivisionPractice();
        System.out.println(a/b);
        System.out.println(c/b);
        System.out.println(c/a);
        System.out.println(a/div.d);
        System.out.println(c/div.a);
    }
}
