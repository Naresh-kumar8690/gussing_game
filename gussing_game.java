import java.util.Random;
import java.util.Scanner;
class game{
    int computer;
    public game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out .println("Guessthe number from 1to 100");
    }
    public int computerNo(){
        return computer;
    }
}
public class gussing_game {
    static int takeuserInput(){
        int user;
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }
    static void isCorrectNumber(int i,int j){
        if(i==j){
            System.out.println("Correct No.Guess");
        }
        else if(i>j){
            System.out.println("your number is Big than computer No.");
        }
        else{
            System.out.println("your No. is Small than computer No.");
        }
    }
    public static void main(String arg[]){
        int user =0, computer =0, itteraction=0;
        game g= new game();
        do{
            user = takeuserInput();
            computer =g.computerNo();
            isCorrectNumber(user,computer);
            itteraction++;
        }while(user!=computer);
        System.out.println("you GUESS NO IN"+ itteraction+"itteraction");
    }
}

        
