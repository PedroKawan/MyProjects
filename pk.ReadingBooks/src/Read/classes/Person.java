
package Read.classes;

public class Person {
    
    private String name;
    private int age;
    private char gender;
    
    public Person(String _name, int _age, char _gender){
        this.setName(_name);
        this.setAge(_age);
        this.setGender(_gender);
    }
    
    protected void setName(String n){
        this.name = n;
    }
    protected String getName(){
        return this.name;
    }
    
    protected void setAge (int a){
        this.age = a;
    }
    protected int getAge(){
        return age;
    }
    
    protected void setGender(char g){
        this.gender = g;
    }
    protected char getGender(){
        return gender;
    }
   
}
