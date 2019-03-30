import minalHomework.StringPractice;

public class InstanceVM {
    void add(){
        c=a+b;
        System.out.println(c);
    }
    int a = 10;
    String str = "Minal";
    int b = 5;
    int c;
    public static void main ( StringPractice[] args) {
        InstanceVM ivm = new InstanceVM();
        System.out.println(ivm.a);
        System.out.println(ivm.str);
        ivm.add();
        System.out.println(ivm.c);

    }


}
