import java.util.*;
public class IntroductionApp{
	public static void main(String[] args){
		String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
		String[] races={"人間","ハイエルフ","トロル","ノーム"};
		String[] classes={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceMatrix={
			{10,10,10,10,10},
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] classMatrix={
			{1.6,1,1.4,1,1},
			{1.1,1,1.2,1.3,1.3},
			{1.3,1.5,1.1,1,1},
			{1,1.9,1,1,1.1},
		};

		Scanner sc=new Scanner(System.in);
		System.out.print("名前を入力してください>>");
		String name=sc.nextLine();
		int seed=calcSeed(name);
		int[] maxArr={100,100,50,50,50};
		int[] status=makeStatus(seed,maxArr);
		System.out.println("初期ステータスが決定しました");
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
