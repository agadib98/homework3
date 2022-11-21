import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter two integers");
int sum=0;
        int a= s.nextInt();
        int b = s.nextInt();
        if(a<b){
            for(int i=a;i<=b;i++){

                if(i%2==1){
                    System.out.println(" "+i);
                }
            }


        }
        if(b<a){
            for(int i=b;i<=a;i++){

                if(i%2==1){
                    System.out.println(" "+i);
                }
            }


        }
    }
}
