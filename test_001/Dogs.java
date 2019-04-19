package test1;

public class Dogs extends Animals{
	public static void main(String[] args){
		System.out.println(species + "," + age);
	}
}

class Animals {
	static String species = "mammal";
	static int age = 1;
}