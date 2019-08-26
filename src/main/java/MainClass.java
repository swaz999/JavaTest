public class MainClass {
    public static void main(String[] args) {
        int a=4;
        int b = 6;
        System.out.println("Result:"+(a+b));
        System.out.println("Hello world from Java-Maven IntelliJ project");
        System.out.println("Learn java in 2 months");

        Car c = new Car();
        c.make="Toyota";
        c.model="Camry";
        c.honk();

        Car d = new Car();
        d.setMake("Honda");
        d.setModel("Accord");
        d.honk();


    }

}
