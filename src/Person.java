public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hi, " + name);
    }



    public static void main(String[] args) {
        Person chris = new Person("Chris");

        System.out.println(chris.getName());
        chris.sayHello();
        // .setName("chris") then print name again




    }
}
