public class Code5_7{
	public static int add(int x,int y){
		int ans=x+y;
		return ans;
	}
	public static void main(String[] args){
		int ans=add(100,10);
		System.out.println("100+10="+ans);
		if(ans==110){
			return;
		}
		//return;は、メソッドを抜けるとき。以降の記述は実行されない

		System.out.println(add(add(10,20),add(30,40)));//100

	}
}

