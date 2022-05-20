// フォルダ内全てのコンパイルの仕方「javac *.java」
// public static void .. new せずに動かせるメソッドを作るとき
// public void .. new しないと使えないメソッドを作るとき
// main というクラスが、たくさんあるクラスの中で一番最初に動く。

public class Main {
    public static void main(String[] args) {
        // Person型(classで作ったオリジナルの型)
        // person .. new Person()したメソッドの名前
        // new Person() .. コンストラクタ(インスタンスを作るメソッド) 
        Person person = new Person();
        person.look();
    }
}