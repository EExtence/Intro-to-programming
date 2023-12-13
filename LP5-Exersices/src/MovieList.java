import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieList {

        // CREATE A public static LinkedList<Movie> OBJECT NAMED MovieList. NOTE:
        // THIS LINKEDLIST USES THE TYPE <Movie> AS ITS NODE TYPE. ALSO NOTE THAT
        // THE Movie CLASS USED AS THE NODE TYPE IS AN INTERNAL CLASS CREATED
        // IN THIS PROGRAM
        public static LinkedList<Movie> MovieList = new LinkedList<>();


        public static void main(String[] args) {
                // INSTANTIATE THE MovieList LINKEDLIST USING THE new LinkedList<Movie>() CALL
                new LinkedList<Movie>();
                // Initialize the Linkedlist
                MovieList = initializeList();

                Scanner scan = new Scanner(System.in);
                String userSelectedOption;
                boolean quitFlag = false;

                while (quitFlag == false) {
                        // Show the user the list
                        System.out.println("******** TOP 10 WORLDWIDE GROSSING MOVIES ********");
                        displayMovieList();

                        // Prompt the user for options to change, insert, or quit
                        System.out.println("If you would like to Update a movie in the list, enter (U)");
                        System.out.println("If you would like to Insert a movie into the list, enter (I)");
                        System.out.println("If you would like to Quit a movie in the list, enter (Q)");
                        userSelectedOption = scan.nextLine();

                        // Determine what to do with the user's input
                        switch (userSelectedOption.toUpperCase()) {
                                // Insert or Update was selected
                                case "U":
                                case "I":
                                        Movie movie = new Movie();
                                        do {
                                                System.out.println(
                                                                "Please enter the Rank position of the movie you would like to insert or change");
                                                movie.Rank = scan.nextInt();
                                        } while (movie.Rank > 10 || movie.Rank < 1);

                                        System.out.println("Please enter the movie Title");
                                        movie.Title = scan.next();

                                        System.out.println("Please enter the movie Peak position");
                                        movie.Peak = scan.nextInt();

                                        do {
                                                System.out.println("Please enter the Worldwide Gross of the movie");
                                                movie.Gross = scan.nextDouble();
                                        } while (testGross(movie));

                                        do {
                                                System.out.println("Please enter the Year of Release of the movie");
                                                movie.Year = scan.nextInt();
                                        } while (movie.Year < 1900);

                                        if (userSelectedOption.equalsIgnoreCase("U"))
                                                updateMovie(movie);
                                        else if (userSelectedOption.equalsIgnoreCase("I"))
                                                insertMovie(movie);
                                        break;
                                // Quit was selected
                                case "Q":
                                        quitFlag = true;
                                        break;
                                // A valid option was not selected
                                default:
                                        quitFlag = false;
                                        System.out.println(
                                                        "The option you have entered is not vaild, please try again.");
                        }
                }
                scan.close();
        }

        // ################################################################
        // INTERNAL MOIVE CLASS, USED TO CREATE NODES IN THE LINKED LIST
        // ################################################################
        public static class Movie {
                public String Title;
                public int Rank;
                public int Peak;
                public double Gross;
                public int Year;

                // ***********************************
                // DEFAULT CONSTRUCTOR
                // ***********************************
                public Movie() {
                        // this is the default constructor
                }

                // ***********************************
                // OVERRIDEN CONSTRUCTOR
                // ***********************************
                public Movie(String title, int rank, int peak, double gross, int year) {
                        this.Title = title;
                        this.Rank = rank;
                        this.Peak = peak;
                        this.Gross = gross;
                        this.Year = year;
                }
        }

        // ################################################################
        // INSERT A MOVIE INTO THE LIST, MOVING ALL MOVIES BELOW IT DOWN
        // ONE RANK. THIS METHOD WILL AUTOMATICALLY ADJUST THE RANK VALUE
        // OF ALL OF THE MOVIES BELOW THE INSERTED MOVIE
        // ################################################################
        private static void insertMovie(Movie movie) {
                // ADD A MOVIE TO THE MovieList LINKEDLIST, USING THE CALL TO
                // MovieList.add(int position, Movie movie), WHERE position IS
                // EQUAL TO THE movie.Rank, AND movie IS EQUAL TO THE movie
                // VARIABLE THAT IS PASSED TO THIS METHOD
                MovieList.add(movie.Rank, movie);

                // Adjusts the Rank of all the Movies below the inserted movie
                for (int i = movie.Rank; i < 10; i++)
                        MovieList.get(i).Rank += 1;

                // REMOVE THE LAST MOVIE IN THE LINKEDLIST USING THE MovieList
                // removeLast() METHOD
                MovieList.removeLast();

        }

        // ################################################################
        // UPDATE A MOVIE IN THE LIST
        // ################################################################
        private static void updateMovie(Movie movie) {
                // 1) CREATE A _Movie OBJECT
                Movie _Movie = new Movie();
                // 2) ASIGN _Moive THE VALUE OF MovieList.get(movie.Rank - 1)
                _Movie = MovieList.get(movie.Rank - 1);
                // 3) ASIGN THE _Movie OBJECT MEMEBER THE VALUES OF THE movie
                // OBJECT THAT HAS BEEN PASSED TO THIS METHO
                // EXAMPLE: _Movie.Title = movie.Title;
                _Movie.Title = movie.Title;
                _Movie.Rank = movie.Rank;
                _Movie.Peak = movie.Peak;
                _Movie.Gross = movie.Gross;
                _Movie.Year = movie.Year;
                
        }

        // ################################################################
        // TESTS TO SEE IF THE GROSS VAULE ENTERED BY THE USER IS VALID
        // COMPARED TO THE GROSS VALUE OF THE NEXT AND OR PREVIOUS MOVIE(S)
        // ################################################################
        private static boolean testGross(Movie movie) {
                double nextHighestGross;
                double nextLowestGross;
                Movie tempMovie;

                // if the new movie is not first or last in the list
                if (movie.Rank > 1 && movie.Rank < 10) {
                        tempMovie = MovieList.get(movie.Rank - 1);
                        nextHighestGross = tempMovie.Gross;
                        tempMovie = MovieList.get(movie.Rank + 1);
                        nextLowestGross = tempMovie.Gross;
                        if (movie.Gross <= nextHighestGross && movie.Gross >= nextLowestGross)
                                return false;
                        else {
                                System.out.println("The Gross value of the movie must be between: ");
                                System.out.println(formatCurrency(nextHighestGross) + " and "
                                                + formatCurrency(nextLowestGross));
                                return true;
                        }
                }
                // if the new movie is first in the list
                else if (movie.Rank == 1) {
                        tempMovie = MovieList.get(movie.Rank + 1);
                        nextLowestGross = tempMovie.Gross;
                        if (movie.Gross >= nextLowestGross)
                                return false;
                        else {
                                System.out.println("The Gross value of the movie must be atleast: ");
                                System.out.println(formatCurrency(nextLowestGross));
                                return true;
                        }
                }
                // if the new movie is last in the list
                else if (movie.Rank == 10) {
                        tempMovie = MovieList.get(movie.Rank - 1);
                        nextHighestGross = tempMovie.Gross;
                        if (movie.Gross <= nextHighestGross)
                                return false;
                        else {
                                System.out.println("The Gross value of the movie must be below: ");
                                System.out.println(formatCurrency(nextHighestGross));
                                return true;
                        }
                }
                // if the new movie is not in the list
                else {
                        System.out.println("Can not find a valid gross amount, please start the program again.");
                        return false;
                }

        }

        // ################################################################
        // DISPLAY A MOVIE OBJECT'S ATTRIBUTES TO THE CONSOLE
        // ################################################################
        private static void displayMovieList() {
                for (Movie movie : MovieList) {
                        System.out.print("Rank: " + addPadding(movie.Rank) + "  ");
                        System.out.print("Peak: " + addPadding(movie.Peak) + "  ");
                        System.out.print("Title: " + addPadding(movie.Title) + "  ");
                        System.out.print("Gross: " + formatCurrency(movie.Gross) + "  ");
                        System.out.print("Year: " + addPadding(movie.Year));
                        System.out.println();
                }
        }

        // ################################################################
        // CREATE THE INITAL LIST OF MOVIES
        // ################################################################
        private static LinkedList<Movie> initializeList() {
                LinkedList<Movie> _MovieList = new LinkedList<Movie>();
                _MovieList.add(new Movie("Avatar", 1, 1, 2787965087.00f, 2009));
                _MovieList.add(new Movie("Titanic", 2, 1, 2187463944.00f, 1997));
                _MovieList.add(new Movie("Star Wars: The Force Awakens", 3, 3, 2068223624.00, 2015));
                _MovieList.add(new Movie("Avengers: Infinity War", 4, 4, 2045634849.00, 2018));
                _MovieList.add(new Movie("Jurassic World", 5, 3, 1671713208.00, 2015));
                _MovieList.add(new Movie("The Avengers", 6, 3, 1518812988.00, 2012));
                _MovieList.add(new Movie("Furious 7", 7, 4, 1516045911.00, 2015));
                _MovieList.add(new Movie("Avengers: Age of Ultron", 8, 5, 1405403694.00, 2015));
                _MovieList.add(new Movie("Black Panther", 9, 9, 1346813040.00, 2018));

                // ADD THE FOLLOWING MOVE TO THE LIST:
                // TITLE = "Harry Potter and the Deathly Hallows - Part 2"
                // RANK = 10
                // PEAK = 3
                // GROSS = 1341511219.00
                // YEAR = 2011
                _MovieList.add(new Movie("Harry Potter and the Deathly Hallows - Part 2", 10, 3, 1341511219.00, 2011));

                return _MovieList;
        }

        // ################################################################
        // FORMAT METHODS FOR OUTPUT DISPLAYED TO USER
        // ################################################################
        // ***********************************
        // ADD SPACE PADDING TO STRINGS
        // ***********************************
        private static String addPadding(String text) {
                return String.format("%-50s", text);
        }

        // ***********************************
        // ADD SPACE PADDING TO INTEGERS
        // ***********************************
        private static String addPadding(int number) {
                return String.format("%-5d", number);
        }

        // ***********************************
        // FORMAT DOUBLES TO CURRENCY
        // ***********************************
        private static String formatCurrency(double number) {
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                return formatter.format(number);

        }

}
