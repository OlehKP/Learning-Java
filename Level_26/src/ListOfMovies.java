import java.util.ArrayList;
import java.util.List;

public class ListOfMovies {
    static void main() {
        List<String> films = new ArrayList<>();
        films.add("Титанік");
        films.add("Матриця");
        films.add("Інтерстеллар");
        films.add("Матриця");
        films.add("fight club");
        System.out.println(films.get(4));
        int filmIndex = films.indexOf("Матриця");
        System.out.println(filmIndex);

        boolean filmIsHere = films.contains("Аватар");
        System.out.println(filmIsHere);

        films.clear();
        System.out.println(films);

    }
}
