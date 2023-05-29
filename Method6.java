import java.util.*;
public class Method6{
	public static void main(String[] args){
		int ret=method(3);
		System.out.println(ret);
		ret=method(-5);
		System.out.println(ret);

		int max=method1(9,3,2);
		System.out.println(max);
		System.out.println(method1(2,5,3));

		System.out.println(method2(3.2,4.2,5.7));

		System.out.println(method3("Hello","World"));

		System.out.println(method4(10));
		if(method4(10)){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}

		//戻り値がない(void)ので、代入は不可
		int[] arr={2,2,2};
		method5(arr);
		System.out.println(Arrays.toString(arr));

		int[] arr2={10,20,30};
		int[] reArr=method6(arr2);
		System.out.println(Arrays.toString(reArr));

	}

	//ここからメソッド
	static int method(int n){
		return -n;
	}

	static int method1(int a,int b,int c){
		int max=Math.max(a,(Math.max(b,c)));
		/*int max=a;
		 * if(b>max){
		 * max=b;
		 * }
		 * if(c>max){
		 * max=c;
		 * }
		 */
		return max;
	}

	static double method2(double n1,double n2,double n3){
		return (n1+n2+n3)/3;
	}

	static String method3(String str1,String str2){
		return str1+str2;
	}

	static boolean method4(int n){	
		boolean bool=true;
		if(n%2==0){
			bool=true;
		}else{
			bool=false;
		}
		return bool;
		/*if(n%2==0){
		 * return true;
		 * }else{
		 * return false;
		 * }
		 return n%2==0?true:false;
		 戻り値は条件式
		 return n%2==0;
		 */
	}

	//戻り値なし
	static void method5(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]*=2;
		}
	}

	static int[] method6(int[] arr){
		int[] reArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			reArr[i]=arr[i]*2;
		}
		return reArr;
	}



}
