package test1;
class Vehicle {

    public void move(){

     System.out.println("Vehicles can move!!");

              }

    

public void repair(){           
	System.out.println("Vc!!");
}

}
 class MotorBike extends Vehicle {

    public void repair(){           
    	System.out.println("mt!!");
              }

    }
public class Test4 {
	

         public static void main(String[] args){

         Vehicle vh = new MotorBike();

         //MotorBike vh = new MotorBike();

         vh.move();   

         vh.repair();

         }
    
}
