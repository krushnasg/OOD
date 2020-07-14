package learnJava;

class Wheel {
	double rim;
	double tire;
	Gear gear;

	public Wheel(double rim, double tire, int chainring, int cog){
		this.rim = rim;
		this.tire = tire;
		this.gear = new Gear(chainring, cog);
	}

	public double diameter(){
		return rim + (tire*2);
	}

	public double gear_inches(){
		return gear.gear_inches(this.diameter());
	}

	public double circumference(){
		return this.diameter() * Math.PI;
	}
}

class Gear {
	int chainring;
	int cog;

	public Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	public double ratio() {
		return chainring/(double)cog;
	}

	public double gear_inches(double diameter) {
		return this.ratio() * diameter;
	}
}


public class Cycle {
	public static void main(String[]  args){
		Wheel wheel = new Wheel(26, 1.5F, 52, 11);
		System.out.println(wheel.gear_inches());

	// 	Gear g = new Gear(52, 11, wheel);
	// 	System.out.println(g.gear_inches());
	}
		
}