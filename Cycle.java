package learnJava;

import java.lang.Math;

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
		return this.diameter() * (float)Math.PI;
	}
}

class Gear {
	int chainring;
	int cog;
	float rim;
	float tire;

	public Gear(int chainring, int cog, float rim, float tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public float ratio() {
		return chainring/(float)cog;
	}

	public float gear_inches() {
		return this.ratio() * new Wheel(rim,tire).diameter();
	}
}


public class Cycle {
	public static void main(String[]  args){
		Wheel wheel = new Wheel(26, 1.5F);
		System.out.println(wheel.circumference());

		Gear g = new Gear(52, 11, 26, 1.5F);
		System.out.println(g.gear_inches());
	}
}