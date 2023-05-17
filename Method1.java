import java.util.*;
public class Method1{
	public static void main(String[] args){
		//input メソッドの飛び出し
		//()実行演算子
		input();
		//aggreate メソッドの飛び出し
		aggregate();
		//output メソッドの飛び出し
		output();
	}
	//input メソッドの作成
	public static void input(){
		System.out.println("入力業務です");
	}
	//aggregate メソッドの作成
	public static void aggregate(){
		System.out.println("集計業務です");
	}
	//output メソッドの作成
	public static void output(){
		System.out.println("出力業務です");
	}
	
}
