package test1;

public class StringBuilderTest1 {
	public static void main(String[] args){
		StringBuilder s = new StringBuilder("Hello there"); //多分配16单元？
		System.out.println("cap: " + s.capacity());
		System.out.println("len: " + s.length());
		System.out.println("str: " + s);
		s.setLength(10);
		System.out.println("cap: " + s.capacity());
		System.out.println("len: " + s.length());
		System.out.println("str: " + s);
		s.append("我是小尾巴");
		System.out.println("str: " + s);
		s.insert(3, "猴子");
		System.out.println("str: " + s);
		s.setCharAt(7,'$'); 
		System.out.println("str: " + s);
		System.out.println("pos9: " + s.charAt(8));
		
		//test strings concatenation
		String a1 = "12345", a2 = "ssdlh";
		String a3 = a1+2;
		System.out.println("\nstr: " + (a1+a3)+a2);
		System.out.println("vl: " + Integer.valueOf(a1)/5);
		System.out.println("vl: " + Integer.parseInt(a1)/5);
		//System.out.println("vl: " + Integer.intValue(a1)/5);
		
		
		//test toString replace
		int smstr = 9110110;
		String sms = Integer.toString(smstr);
		sms = sms+25;
		System.out.println("sm str: " + sms);
		sms.replace('1','K');
		System.out.println("sm str: " + sms);      //注意区别
		System.out.println("sm str: " + sms.replace('1','K'));
		
		//test start end
		if (a2.startsWith("sss")){
			System.out.println("stwt: " + "S");
		}
		else if (a2.endsWith("lh")){
			System.out.println("edwt: " + "H");
		}
		else{
			System.out.println("err: " + "!");
		}
		
		//test compareTo
		String a4 = "123a", a5 = "123:";           //按ASCII顺序从第一个char比起，直到比出胜负，没有则算空？（最小）
		if (a4.compareTo(a5)>0){               //a4 > a5b
			System.out.println("winner: " + a4);
		}
		else{
			System.out.println("winner: " + a5);
		}
		
		double aqa = 3.91;
		System.out.println((int)aqa);
	}
}
