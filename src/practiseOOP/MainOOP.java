package practiseOOP;

public class MainOOP {
    public static void main(String[] args) {
        Human h1 = new Employee(3, "ayxan", "055", 500);
        Human h2 = new Employee(5, "ferid", "033", 700);
        Human h3 = null;
        Human h4 = null;

        System.out.println(h1);
        System.out.println(h2);

        if (h1.equals(h2)){
            System.out.println("same workers!");
        }
        else System.out.println("not same workers!");

    }
}
