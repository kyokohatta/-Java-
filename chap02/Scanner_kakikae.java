// P93 教科書の書き換え


// Scanner というクラスを読み込む (これやらないと動かない !!!!!)
import java.util.Scanner;

public class Scanner_kakikae {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください。");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("あなたの年齢を入力してください。");
        int age = scan.nextInt();

        System.out.println("ようこそ" + age + "歳の" + name + "さん");
    }
}

