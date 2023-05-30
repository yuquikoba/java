import java.util.*;
public class Meirei{
	public static void main(String[] args){
		//引数を出力して改行
		System.out.println("hello");
		//引数を出力(改行なし)
		System.out.print("hello");
		//書式付き出力(%nで改行)
		System.out.printf("%s(%d)こんにちは%n","山田",23);
		//1未満の乱数を生成
		double rnd =Math.random();
		//0~9の値をランダムに生成
		int rndNum =new Random().nextInt(10);
		//aとbを比較して大きい方の値を返す
		int max = Math.max(a,b);
		//aとbを比較して小さい方の値を返す
		int min = Math.min(a,b);
		//キーボードからの入力を１行まるっと受け取る
		String line=new Scanner(System.in).nextLine();
		//キーボードからの入力から一つの単語を受け取る
		String word=new Scanner(System.in).next();
		//キーボードから入力されたdoubleの数字を受け取る
		double weight = new Scanner(System.in).nextDouble();
		//キーボードから入力された数字をintに変換
		int num = new Scanner(System.in).nextInt();
		//strの文字列をdoubleに変換
		double num = Double.parseDouble();
		//strの文字列をintに変換
		int n = Integer.parseInt("10");
		//配列の内容を表示
		int[] arr={3,5,7};
		System.out.println(Arrays.toString.(arr));
		//配列の昇順ソート
		Arrays.sort(arr);
		//最後の一文字を削除するイディオム
		String str6=msg.substring(0,msg.length()-1);
		System.out.println(str6);//Java Lesson
		//部分文字列の作成													 
		//文字列.substring(以上,未満)
		String s="Java".substring(0,2);//Ja
		//書式を使って文字列を作成する
		String fmt=String.format("%d:%s:%.if",10,"Hello",20.235);
	}
}





















