public class Client {
    public static  void main(String args[]) throws ClassNotFoundException {
        //获取类对象的三种方法
        Class class1 = Class.forName("Person");
        System.out.println(class1);
        Class class2 = Person.class;
        System.out.println(class2);
        Person p = new Person();
        Class class3 = p.getClass();
        System.out.println(class3);
        //同一个字节码文件.class在内存中只加载一次，
        System.out.println(class1==class2);
    }
}
