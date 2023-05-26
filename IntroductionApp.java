import java.util.*;
public class IntroductionApp{
	public static void main(String[] args){
		String name="YUQUI";
		int seed=calcSeed(name);
		System.out.println(seed);
		int[] maxArr={100,100,50,50,50};
		int[] status=makeStatus(seed,maxArr);
		System.out.println(Arrays.toString(status));
		int[] h={10,10,10,10,10};
		raceBonus(status,h);
		System.out.println(Arrays.toString(status));
		double[] s={1.6,1,1.4,1.0,1.0};
		classBonus(status,s);
		System.out.println(Arrays.toString(status));
		int total=sumStatus(status);
		System.out.println("合計は:"+total);
		String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
		showStatus(status,params);


	}




	//名前をもとにシード値を作成するメソッド
	static int calcSeed(String name){
		//seed(種)
		int seed=0;
		//名前の文字数分回るループ
		for(int i=0;i<name.length();i++){
			//一文字ずつ取り出しながらseedに加算
			seed+=name.charAt(i);
		}
		return seed;
	}

	//シード値をもとに指定範囲の配列を作成するメソッド
	static int[] makeStatus(int seed,int[] maxArr){
		int[] vals=new int[maxArr.length];
		Random rand=new Random(seed);
		for(int i=0;i<vals.length;i++){
			vals[i]=rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}

	//種別ボーナスを加算するメソッド
	static void raceBonus(int[] status,int[] bonus){
		for(int i=0;i<status.length;i++){
			status[i]+=bonus[i];
		}
	}

	//職業によってパラメーターを乗算
			//doubleの乗算なので、intのキャスト(int)が必要
	static void classBonus(int[] status,double[] ratio){
		for(int i=0;i<status.length;i++){
			status[i]=(int)(status[i]*ratio[i]);	
		}
	}

	//パラメーターの合計を返却するメソッド
	static int sumStatus(int[] status){
		int sum=0;
		for(int n:status){
			sum+=n;
		}
		return sum;
	}

	//配列をつなぎ合わせて表示するメソッド
	static void showStatus(int[] status,String[] params){
		String str="";
		for(int i=0;i<status.length;i++){
			str +=params[i]+":"+status[i]+" ";
		}
		System.out.println("["+str+"]");
	}


	//能力値を降順に並び変えるメソッド


}
