package Animal;
public class Puppy {
	private  String name;
	public String getName() {
		return name;
	}
	public Puppy(String n) {
		this.name = n;
	}

public static void main(String[] args){
	Puppy puppy0 = new Puppy("Julbas");
	System.out.println(puppy0.getName());
	}
}