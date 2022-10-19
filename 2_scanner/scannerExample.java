import java.util.Scanner;

public class scannerExample{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);   // 標準入力から値を取得する Scanner クラスのインスタンスを作成

    System.out.println("How old are you.");
    int age = scanner.nextInt();    // キーボードからの入力待ち。

    System.out.println("I'm " + age + " years old.");
    scanner.close();
  }
}