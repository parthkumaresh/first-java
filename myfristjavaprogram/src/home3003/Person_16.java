package home3003;

public class Person_16{

    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Person_16 person = new Person_16();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private int getAge(){
        return age;
    }
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }
    private String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if (firstName.isEmpty()){
            return getLastName();
        }else if (lastName.isEmpty()){
            return getFirstName();
        }else {
            return firstName+ " " +lastName;
        }
    }
    private void setLastName(String lastName){
        this.lastName = lastName;
    }
    private void setAge(int age){
        if (age > 100 || age < 0){
            this.age =0;
        }else {
            this.age = age;
        }
    }
    private boolean isTeen(){
        return getAge() > 12 && getAge() < 20;
    }
}