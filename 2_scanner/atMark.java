import java.util.Scanner;

public class atMark{

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial number of @'s");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        // for(int i = num; i > 0; i--){
        //     String at = "@";
        //     System.out.println(at.repeat(i));
        // }
        for(int j = num; j > 0; j--){
            for(int i = 0; i < num; i++){
                System.out.print('@');
            }
            System.out.println();
            num--;
        }
        scanner.close();
    }
}

