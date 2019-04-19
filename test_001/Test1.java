package test1;

public class Test1 {
    public static void main(String[] args) {
              Dog A1 = new Dog("haha");
              Cat B1 = new Cat("hehe");
              A1.show();
              B1.show();
    }
}



class Animal {
	public String name;  
    
    public Animal(String name){  
        this.name = name;  
    }  
      
    public void show(){  
        System.out.println(name+" is happy ");  
    }
}
    

class Dog extends Animal{
	public Dog(String name){  
        super(name);  
    }  
}

class Cat extends Animal{
	public Cat(String name){  
        super(name);  
    }  
}