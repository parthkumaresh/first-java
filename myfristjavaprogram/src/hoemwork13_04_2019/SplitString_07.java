package hoemwork13_04_2019;

public class SplitString_07 {
    public static void main(String[] args) {
        String str = " Life is Full of Surprise, Live it ";
        String split[] = str.split(" ", 0);
        for(String s:split)
            System.out.println(s);
    }
}
