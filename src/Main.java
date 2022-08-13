import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.print("Type your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello, " + name);

        Empleado jose = new Empleado("jose", "ossorio", 0, 0, new Fecha(5,4,2022), new Fecha(2,8,2002));

        String dateDay;

        dateDay = jose.getFechaNacimiento();
        System.out.println(dateDay);
    }


}
//   If it's done this way, the while loop will execute once even if the condition is not true. The condition will be checked after the first loop
//        do{
        //System.out.print("Type your name");
        //name = scanner.nextLine();
        //} while (name.isBlank())
        //System.out.println("Hello, " + name);