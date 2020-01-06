public class Person {
    //    public String name;
//    public int age;
//    public  int age = 18;
//    public  String name ="张三";
//    public void show(){
//        System.out.println("我叫"+name + ",今年" +age + "岁");
//    private  String name;
//    private  int age;
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public  void show(){
//        System.out.println("name:"+name + "age:" +age);
//    }
//    public  String name ="张三";
//    public  int age =18;
    class person {
        private String name;
        private int age;
        private String sex;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("name:" + name + " " + "age:" + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name =" + name + '\'' + ",age=" + age + '}';
    }
}
//public  Person(){
//    this.name ="caocao";
//    this.age =10;
//    this.sex="男";
//}
//public  Person(String name,int age,String sex){
//    this.name = name;
//    this.age =age;
//    this.sex =  sex;
//}
//public  void show(){
//    System.out.println("name:"+name+"age:"+age+"sex:"+sex);
//}

//class Test {
//    public  static void main(String[] args){
//        Person person = new Person();
//        person.show();
//        Person person = new Person();
//        person.setName("caocao");
//        String name = person.getName();
//        System.out.println(name);
//        System.out.println(person.name);
//        System.out.println(person.age);
//           person.show();
//        Person person =  new Person();
//        System.out.println("我叫"+person.name + ",今年" + person.age + "岁");

//    }
//}
