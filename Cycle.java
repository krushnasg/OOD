package learnJava;

class Wheel {
	float rim;
	float tire;

	public Wheel(float rim, float tire){
		this.rim = rim;
		this.tire = tire;
	}

	public float diameter(){
		return rim + (tire*2);
	}

	public float circumference(){
		return this.diameter() * Math::PI;
	}
}

class Gear {
	int chainring;
	int cog;
	Wheel wheel;

	public Gear(int chainring, int cog, Wheel wheel){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel =  wheel;
	}

	public float ratio() {
		return chainring/(float)cog;
	}

	public float gear_inches() {
		return this.ratio() * wheel.diameter();
	}
}


public class Cycle {
	public static void main(String[]  args){
		Wheel wheel = new Wheel(26, 1.5F);
		System.out.println(wheel.circumference());

		Gear g = new Gear(52, 11, wheel);
		System.out.println(g.gear_inches());
	}
}