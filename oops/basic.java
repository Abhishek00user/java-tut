package oops;

class Calculator {
    int d; // instance variable or property of the class
    public int add(int a, int b) {   // no need to use public here as it is by default public in the same package
        return a + b;               // a and b are local vars
    }
}

class Computer
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}
class car {
    String color;  //vars or properties of the class car
    int speed;
     
    void drive(){ // methods or behavior of the class car
        System.out.println("Driving at " + speed);
    }
}
public class basic {
    public static void main(String[] args) {

        car c1 = new car();
        c1.color = "Blue";
        c1.speed = 45;
        c1.drive();

        Computer obj=new Computer();
		obj.playMusic();
		String src = obj.getMeAPen(10);
		System.out.println(src);
    }
}
