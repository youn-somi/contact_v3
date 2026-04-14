package vo;

public class contact {
    private String name;
    private int age;
    private String phone;
    private  Long id;


    //생성자
    public contact(String name, int age, String phone, Long id) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.id = id;



    }
    //getter
    public  Long getId() {
        return  this. id;

    }
    public  String getName () {
      return this . getName()  ;
    }
    public  int age () {
        return  this.age;

    }
    public String getPhone () {
        return this.phone;
    }
    // setter
    public void  setName (String name) {
        this.name =name;

    }
    public void  setAge(int age) {

    }
    public void setPhone(String phone) {

    }

    @Override
    public  String toString () {
        return  " [ " + id  + "]"+ name + "/"+ age + "/" + phone;


    }
}
