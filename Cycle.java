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

class Bicycle {
	char size;
	String tape_color;
	Spares spares;
	
	public Bicycle(char size, String tape_color) {
		this.size = size;
		this.tape_color = tape_color;
		this.spares = new Spares();
	}

	static class Spares {
		String chain = "10-speed";
		double tire_size = 23;
		String tape_color = this.tape_color;
	}
}


public class Cycle {
	public static void main(String[]  args){
		Bicycle bike =  new Bicycle('M', "red");
		System.out.println(bike.size);
		System.out.println(bike.spares.chain);
	}
		
}