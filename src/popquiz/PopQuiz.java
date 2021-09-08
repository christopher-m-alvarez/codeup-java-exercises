package popquiz;

public class PopQuiz {
    public static double multiply(int num, int numTwo){
        return num * numTwo;
    }

    public static double multiply(double num, double numTwo){
        return num * numTwo;
    }

    public static void main(String[] args) {
        Mallard tom = new Mallard("tom",3);
        tom.quack();

        tom.getMallordDetails();
//        System.out.println(multiply(2.0,4.0));
//        System.out.println(multiply(2,3));
    }
}
