import java.util.*;
public class ExSample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("何人>>");
		int persons=sc.nextInt();
		int[] scores=new int[persons];
		for(int i=0;i<scores.length;i++){
			scores[i]=rand.nextInt(101);
		}
		System.out.println(Arrays.toString(scores));
	}
}
