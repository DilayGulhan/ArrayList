package ArrayList;

public class ArraylistTest {
	public static void main(String[] args) {
	
		IArrayList<Integer> listw = new ArrayList<Integer>();
		System.out.println(listw.isEmpty());
		listw.add(5);
		
		listw.add(8);
		listw.add(12);
		listw.add(2,2 );
		
//		listw.remove(0);
		System.out.println(listw);
		System.out.println(listw.getLength());
		
		System.out.println(listw.isEmpty());
		System.out.println(listw.contains(3));
		
		
		
}

}
