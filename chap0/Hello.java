// public class の後のオブジェクト名は必ず、
// ファイル名と一緒(1文字目大文字)にする

// コンパイル -------------------------------------------------
// 統合ターミナルcmd [javac ファイル名.java -encodong uttf-8]
// インタプリタ（コンパイルしたものを表示） ----------------------
// [java ファイル名]


public class Hello {
    // ここから main メソッド
    public static void main(String[] args) {
        System.out.println("すがわら");
        System.out.println("31歳です");
        System.out.println("お酒が好きです");
        System.out.println("31 + 31の計算をします");
        System.out.println(31 + 31);
        System.out.println(35 - 10);
        System.out.println(-5 * 2);
        System.out.println(6 * 6 * 3.14);
        System.out.println("こたえは" + 64);
        int x;
        x = 6;
        System.out.println(x);
        System.out.println(x * x * 3.14);
    }
}