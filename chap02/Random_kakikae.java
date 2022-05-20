// P92 教科書の書き換え


// Random というクラスを読み込む (これやらないと動かない !!!!!)
import java.util.Random;

public class Random_kakikae {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rd = rnd.nextInt(90);
        System.out.println("あなたはたぶん、" + rd + "歳ですね？");
    }
}