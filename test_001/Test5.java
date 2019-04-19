package test1;

public class Test5 {
	 /*public static void main(String[] args){
		 	int i = 0;
	        int[] x = {1, 2, 3, 4, 5};
	        int[] y = x; //int[] y = new int [5]; 
	        //System.arraycopy(x, 0, y, 0, 5);
	        for (i=0;i<y.length;i++){
	        	System.out.print(y[i]);
	        }
	 }
	 */
	public static void main(String[] args){
	 	//int i = 0;
        int[] x = {1, 2, 3, 4, 5};
        int[] y = new int [5]; 
        //Assign each value and print
        copyArray(x,y);
        printArray(y);
	}
	public static void copyArray(int [] a,int [] b){
        for (int i=0;i<a.length;i++){
        	b[i] = a[i]+1;        	//test add 1
        }
	}
	public static void printArray(int[] a){
        for (int i=0;i<a.length;i++){
        	System.out.print(a[i]);
        }	
	}
}



