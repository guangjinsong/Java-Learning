package class07_objectoriented;

/**
 * @author: SGJ
 * @date: 2023/11/22
 * @description:
 */
@SuppressWarnings("all")
public class Student {
    private String name;
    private int age;
    // 无参构造
    public Student() {
// this("",18);//调用本类有参构造器
    }
    // 有参构造
    public Student(String name) {
        this();//调用本类无参构造器
        this.name = name;
    }
    // 有参构造
    public Student(String name,int age){
        this(name);//调用本类中有一个 String 参数的构造器
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getInfo(){
        return "姓名：" + name +"，年龄：" + age;
    }
}
