package test01;

public class Condition {
	
   public static void main(String[] agrs) {
	   boolean higher;
	   
	   int num1 = 200;
	   int num2 = 200;
	   higher = num1 >= num2;
	   System.out.println(higher);
	   higher = num1 <= num2;
	   System.out.println(higher);
	   
	  int hour = 3;
	  if(hour<3) {
		  System.out.println("3시 전이면 아직 아침이지~");
	  }else {
		  String str = "하하하하~ 나 이제 태어났어~~";
		  System.out.println("3시네, 밥묵자~");
	  }
   }
}
