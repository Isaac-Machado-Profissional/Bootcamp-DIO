import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> fruits = null; //List.of("Banana", "Maça", "Uva", "Pera"); //Posso escolher o que quero ver
        // fruits.isEmpty(); // Assim, tomarei NullPointer
        System.out.println(isEmpty(fruits));
    }
}