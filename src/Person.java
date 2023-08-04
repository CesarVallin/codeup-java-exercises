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
        Person person1 = new Person("Cesar");
        System.out.println(person1.getName());
        person1.sayHello();
        person1.setName("Bob");
        System.out.println(person1.getName());
        person1.sayHello();



    }


}
