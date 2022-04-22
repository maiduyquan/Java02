import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages=new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List:" + programmingLanguages);

        programmingLanguages.remove(5);
        System.out.println("after remove(5):" + programmingLanguages);

        boolean isRemove= programmingLanguages.remove("Kotlin");
        System.out.println("after remove(\"kotlin\"):"+ programmingLanguages ) ;

        List<String> scriptingLanguage = new ArrayList<>();
        scriptingLanguage.add("Python");
        scriptingLanguage.add("Ruby");
        scriptingLanguage.add("Perl");

        programmingLanguages.removeAll(scriptingLanguage);
        System.out.println("after removeAll(scriptingLanguage):" + programmingLanguages);


        programmingLanguages.removeIf(n->(n.charAt(0)=='T'));

        System.out.println("after reomving all elements that start with \"C\":" +programmingLanguages);

        programmingLanguages.clear();
        System.out.println("after clear():" +programmingLanguages);


    }
}
