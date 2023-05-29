import java.util.*;
public class Tarea01{
	public static void main(String[] args){
		int[] arr={2,3,3,4};
		int[] reArr=evenArr(arr);
		System.out.println(Arrays.toString(reArr));
	}
	static int[] evenArr(int[] arr){
		int count=0;
		int idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		int[] reArr=new int[count];
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				reArr[idx]=arr[i];
				idx++;
			}
		}
		return reArr;
	}
}
