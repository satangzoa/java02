
public class ReferenceVariableEx1 {
	public static void main(String[] args) {
		String name1;//4바이트 크기 //name1 은 위치값
		name1 = new String("좋은 아침입니다.");
		String name2 = new String("좋은 아침입니다.");
		System.out.println(name1 == name2);
		
		String name3 = name2;
		System.out.println(name3);
		
	}
}
