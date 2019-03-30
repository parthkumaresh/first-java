package disneyworld;

public class StaticVM {
    static int a = 100;
    static int b = 500;
    static int c;
    static String str ="Minal";

    void add(){
    StaticVM.c=StaticVM.a+StaticVM.b;
        System.out.println(StaticVM.c);

    }


    public static void main (String [] agrs){
        System.out.println(a);
        System.out.println (b);
        System.out.println(str);
        StaticVM svm = new StaticVM ();
        svm.add();
    }
}
