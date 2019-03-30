package minalHomework;

public class StringPractice {
    public static void main (String[] args){
     java.lang.String str = "MinalPatel";
     java.lang.String abc = "  Parth";
     System.out.println("lengh of the string:  "+str.length());
     System.out.println(str.charAt(1));
     System.out.println(str.concat(abc));
     System.out.println(str.contains("M"));
     System.out.println(str.startsWith("Min"));
     System.out.println(str.endsWith("patel"));
     System.out.println(str.equals(abc));
     System.out.println(str.indexOf("a"));
     System.out.println(str.isEmpty());
     System.out.println(str.replace('M','K'));
     System.out.println(str.substring (5));
     System.out.println(str.toCharArray());
     System.out.println(str.toLowerCase());
     System.out.println(str.toUpperCase());
     System.out.println(str.trim());

    }
}
