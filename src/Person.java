public class Person {

    // ---------------------------------------------------------------------------------------------------------
    // Instance property...
    private String name;
    // ---------------------------------------------------------------------------------------------------------
    // Constructors...
    public Person(String name){
        this.name = name;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters and Setters...
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Instance methods...
    public void sayHello(){
        System.out.println("Hello from " + this.name);
    }
    // ---------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Person personA = new Person("Cesar");
        System.out.println(personA.getName());
        personA.sayHello();
        personA.setName("Bob");
        System.out.println(personA.getName());
        personA.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        // names are equal, not objects





    }


}
