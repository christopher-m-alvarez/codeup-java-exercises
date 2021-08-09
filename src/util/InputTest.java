package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(2,5));
        System.out.println(input.getInt());



    }
}
