import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weather;
        System.out.print("How many degrees is it today? : ");
        weather = scanner.nextInt();
        if(weather < 5){
            System.out.println("You can go skiing.");
        }else if(weather <= 25){
             if(weather < 10){
                 System.out.println("You can go cinema");
             }else if(weather > 15){
                 System.out.println("You can go picnic");
             }else{
                 System.out.println("You can go cinema or picnic");
             }
        }
            else{
            System.out.println("You can go swimming");
        }
    }
}
