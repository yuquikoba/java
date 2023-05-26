public class Ex5_2{
	public static void main(String[] args){
		String title="title";
		String address="yuqui@aa";
		String text="本文";
		email(title,address,text);
	}
	public static void email(String title,String address,String text){
		System.out.printf("%sに、以下のメールを送信しました%n",address);
		System.out.printf("件名:%s%n",title);
		System.out.printf("本文:%s%n",text);
	}
}
