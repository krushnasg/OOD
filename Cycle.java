package learnJava;


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
		return this.ratio() * (rim + (tire * 2));
	}
}


public class Cycle {
	public static void main(String[]  args){
		Gear g = new Gear(52, 11, 24, 1.25F);
		System.out.println(g.gear_inches());
	}
}