import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    } // isEmpty()

    public void addLanguage(String language) {
        languages.add(language);
    } // addLanguage()

    public void removeLanguage(String language) {
        languages.remove(language);
    } // removeLanguage()

    public String firstLanguage() {
        return languages.get(0);
    } // firstLanguage()

    public int count() {
        return languages.size();
    } // count()

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    } // containsLanguage()

    public boolean isExciting() {
        return (languages.contains("Java")) || (languages.contains("Kotlin"));
    } // isExciting()
    
} // class LanguageList
