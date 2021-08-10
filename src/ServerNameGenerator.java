import java.util.Random;

public class ServerNameGenerator {

 public static  String[] nouns = {"mammoth", "maniacal", "many", "marked", "massive", "married", "marvelous", "material", "materialistic", "mature"};

 public static  String[] adjectives = {"burn", "burst", "bus", "bush", "business", "butane", "butcher", "butter", "button", "buzzard"};

    public static void main(String[] args) {
        System.out.println("Server name: ");
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
    }

    public static String  getRandom(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }
}