import java.util.ArrayList;

public class ArrayScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstArray();
		SecondArray();
	}

	public static void FirstArray() {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("1");
		lst.add("2");
	
		for(String print : lst) {
			System.out.println(print);
		}
	}
	
	public static void SecondArray() {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("A");
		lst.add("B");
	
		for(String print : lst) {
			System.out.println();
			System.out.println(print);
		}
	}
	
}
