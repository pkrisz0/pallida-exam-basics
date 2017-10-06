import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FavouriteAnimals {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("```java FavouriteAnimals [animal] [animal]```");
        } else if (args.length > 0) {
            add(args);
        }
    }

    public static void add(String[] input){
        Path favAnims = Paths.get("C:/greenfox/pallida-exam-basics/favouriteanimals/favourites.txt");
        List<String> animals = null;

        try {
            animals = Files.readAllLines(favAnims);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < input.length; i++) {
            if (!animals.contains(input)){
                animals.add(input[i]);
            }
        }

        try {
            Files.write(favAnims, animals, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }
}

// The program's aim is to collect your favourite animals and store them in a text file.
// There is a given text file called '''favourites.txt''', it will contain the animals
// If ran from the command line without arguments
// It should print out the usage:
// ```java FavouriteAnimals [animal] [animal]```
// You can add as many command line arguments as many favourite you have.
// One animal should be stored only at once
// Each animal should be written in separate lines
// The program should only save animals, no need to print them

