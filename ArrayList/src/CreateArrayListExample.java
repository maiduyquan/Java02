import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals= new ArrayList<>();

        animals.add("lion");
        animals.add("Tiger");
        animals.add("cat");
        animals.add("dog");

        System.out.println(animals);

        animals.add(3,"Elephant");

        System.out.println(animals);
    }
}
