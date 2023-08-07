package movies;

import util.Input;
import movies.MoviesArray.*;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");


            int userInput = input.getInt("Enter your choice: ");
            System.out.println(userInput);

            Movie[] allMovies = MoviesArray.findAll();

            if (userInput == 0) {
                System.out.println("Goodbye...");
                break;
            }
            if (userInput == 1) {
                for (int i = 0; i < allMovies.length; i++) {
                    System.out.println(allMovies[i].getName());
                }
            }
            if (userInput == 2) {
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory() == "animated") {
                        System.out.println(allMovies[i].getName());
                    }
                }
            }
            if (userInput == 3) {
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory() == "drama") {
                        System.out.println(allMovies[i].getName());
                    }
                }
            }
            if (userInput == 4) {
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory() == "horror") {
                        System.out.println(allMovies[i].getName());
                    }
                }
            }
            if (userInput == 5) {
                for (int i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory() == "scifi") {
                        System.out.println(allMovies[i].getName());
                    }
                }
            }
        } while(true);




    }
}
