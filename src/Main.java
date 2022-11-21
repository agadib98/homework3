import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("please enter a character");
            char c= s.next().charAt(0);
            char c2 = Character.toLowerCase(c);

            if(c2=='z'||c2=='b'){
                System.out.println("Critical error");
                break;

            }
            if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'){
                System.out.println("it's a vowel");
            }


        }

    }
}