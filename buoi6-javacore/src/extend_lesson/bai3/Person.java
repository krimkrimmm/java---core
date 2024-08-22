
package extend_lesson.bai3;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.age = age;
        this.name=name;
    }
    public Person(){

    }
    //id
    public int getId(){
        return id;
    }
    public void setId(int Id){
        this.id=id;
    }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
