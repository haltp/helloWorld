package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "30";// "Hong Kildong";
		name = "이나경";
		System.out.println("My name is " + name);
		int age = 27;
		System.out.println("내 나이는 " + age);
		double height = 170.8;
		System.out.println(name+ " 키는 " + height +" 입니다.");
		
		String name1 = "송다희";
		int age1 = 23;
		double height1 = 171.3;
		System.out.println(name1+ "의 키는 " + height1 +" 이고" + " 나이는 " + age1 + "입니다.");
		System.out.println("두 사람 나이의 합은 " +  (age + age1) + "입니다.");
		
	}	
}
