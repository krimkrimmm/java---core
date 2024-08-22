public class People{
    private String name;
    private Boolean gender;

    public People(String name){
        this.name = name;
    }

    public People(String name,Boolean gender) { this.name = name;
       this.gender = gender;
   }
   // ham khởi tạo k có tham số
    public People() {
   }
   @Override

public String toString(){
    return "People"+
           "name=:"+name+"gender:"+gender;
}
}

