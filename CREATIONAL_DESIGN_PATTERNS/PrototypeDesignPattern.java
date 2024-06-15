// Prototype Design Pattern Sample

class PrototypeDesignPattern {
	
	public static void main(String[] args) {
		ExpensivePrototype exp = new ExpensivePrototype();

		ExpensivePrototype newExp = exp.clone();
		newExp.someFunction();
	}
}

// The main idea is that cloning is faster than new object initialisation
class ExpensivePrototype implements Cloneable{

	// Expensive Initialisation
	ExpensivePrototype() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread InterruptedException " + e);
		}
	}

	void someFunction() {
		System.out.println(" Some Action");
	}

	@Override
	public ExpensivePrototype clone() {
		try {
			return (ExpensivePrototype) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException " + e);
		}
		return null;
	}
}