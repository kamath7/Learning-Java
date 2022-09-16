import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> someNumbers = Arrays.asList(
                "N40","N36",
                "B12","B8",
                "G53","G54","G55","G50","g59",
                "I26", "I17","I20",
                "O89"
        );

        someNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")){
                System.out.println(number);
            }
        });
    }
}