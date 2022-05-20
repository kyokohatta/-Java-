public class Chap02 {
    public static void main(String[] args) {

        // １）文字列を数値に変換する「Integer.parseInt(文字列);
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println("あなたは来年" + (n + 1) + "歳になります。");


        // ２）2つの値を比較して大きい方の数値を代入する「Math.max()」
        int a = 5;
        int b = 3;
        int m = Math.max(a, b);
        System.out.println("aとbで大きいのは" + m);


        // ３）乱数　　「new.java.util.Random().nextInt(乱数の上限)」
        int r = new java.util.Random().nextInt(90); // 0～89 のランダム数
        System.out.println("あなたはたぶん、" + r + "歳ですね？");


        // ４）キーボードから入力を受ける命令
        System.out.println("あなたの名前を入力してください。");
        // キーボードから1行の文字列の入力を受け取る(enterキーを押すまで入力できる)
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("あなたの年齢を入力してください。");
        // キーボードから１つの整数の入力を受け取る（数字のみ。文字は無理。）
        int age2 = new java.util.Scanner(System.in).nextInt();

        System.out.println("ようこそ" + age2 + "歳の" + name + "さん");
    }
}