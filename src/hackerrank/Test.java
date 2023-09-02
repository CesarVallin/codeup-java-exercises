package hackerrank;

public class Test {

    public static void main(String[] args) {
        String dateTest = DateAndTime.findDay(8, 14, 2017);
        System.out.println(dateTest);

        /**
         * Here is my test on another Class.
         *
         * From St:
         * You don't need to instantiate DateAndTime to access the findDay() method because you declared the findDay() method as static.
         *
         * From Bl:
         * thats correct. because findDay() is static, it is not unique to an instance of DateAndTime. That means you can call it from anywhere using DateAndTime.findDay().
         **/
    }
}
