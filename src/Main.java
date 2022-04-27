public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Bob Hob", 60000, 1999, "123-65-4789");
        Employee e2 = new Employee("Bob Hob", 70000, 2002, "123-45-6789");
        Employee e3 = new Employee("Bob Hob", 60000, 1995, "123-45-6789");

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();


        System.out.println(p1);
        System.out.println(p1.toString());
        p2.setName("Harry Potter");
        System.out.println(p2);
        System.out.println(p2.toString());
        p3.setName("Harry Potter");
        System.out.println(p3);
        System.out.println(p3.toString());

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));








    }
}