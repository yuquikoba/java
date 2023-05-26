public class Ex5_4{
	public static void main(String[] args){
		double bottom=10.0;
		double height=5.0;
		double triangleArea=calcTriangleArea(bottom.height);
		System.out.printf("三角形の底辺の長さが%.1fcm,高さが%.1fcmの場合,面積は%.1fcm2%n",bottom,height,triangleArea);
		double radius=5.0;
		double circleArea=calcCircleArea(radius);
		System.out.printf(
	}
	public static double calcTriangleArea(double bottom,double height){
		return bottom*height/2;
	}
	public static double calcCircleArea(double radius){
		return radius

	}
}
