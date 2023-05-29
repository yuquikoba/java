import java.util.*;
public class EvenArr{
	public static void main(String[] args){
		//配列を作る必要がある
		//要素数が必要
		int[] arr={2,3,3,4};
		int[] reArr=evenArr(arr);
		System.out.println(Arrays.toString(reArr));
	}
	static int[] evenArr(int[] arr){
		//元の配列の偶数を数える
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		int[] reArr=new int[count];
		int idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
			reArr[idx]=arr[i];
			idx++;
			}
		}
		return reArr;
	}
}
