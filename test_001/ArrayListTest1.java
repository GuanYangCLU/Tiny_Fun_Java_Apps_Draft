package test1;
import java.util.ArrayList;

public class ArrayListTest1 {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jim0");
		display(names);
		names.add("JY1");
		display(names);
		names.add("xiaoji2");
		display(names);
		names.add(1,"goutou3");
		display(names);
		names.remove(2);
		display(names);
		names.set(0,"yls");
		display(names);
	}
	public static void display(ArrayList<String> names){
		System.out.println("\nSize: "+names.size());
		for (int x=0;x<names.size();++x){
			System.out.println("position "+x+"name: "+names.get(x));
		}
	}
}
