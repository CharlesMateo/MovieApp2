public class Main {
    public static void main(String[] args) {

        System.out.println("Hello user... ");

        String moviename = "There Will Be Blood";
        int releaseyear = 2007;
        String moviegenre = "Western/Thriller";
        double IMDB = 8.2/10;
        boolean ispartofseries = false;
        char directorintial = 'A';

        System.out.println("My favorite movie is: " + moviename);
        System.out.println("Year Released " + releaseyear);
        System.out.println("Genre: " + moviegenre);
        System.out.println("IMDB Rating: " + IMDB);
        System.out.println("Part of a series: " + ispartofseries);
        System.out.println("Director's Last Name Initial: " + directorintial);

        String[] movieGenres = {"Action", "Comedy", "Thriller"};
        System.out.println("First Movie Genre " + movieGenres[0]);
        System.out.println("First Movie Genre " + movieGenres[2]);
        System.out.println("First Movie Genre " + movieGenres[1]);


    }
}