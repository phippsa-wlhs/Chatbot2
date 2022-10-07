import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");//Name of user
        String userName = input.nextLine();
        Bot2 main = new Bot2(userName); 
        main.greeting();
        
        System.out.println("What is your favorite animal?");//User favorite animal
        String userAnimal = input.nextLine();
        System.out.println();
        main.favoriteAnimal(userAnimal);
        
        System.out.println("Where do you live?");//Where user lives
        String userlocation = input.nextLine();
        main.home(userlocation);
        
        System.out.println("What is your favorite number?");//User favorite num
        int favoriteNum = input.nextInt(); 
        main.favoriteNumber(favoriteNum);
        main.goodbye();
        
    }
}