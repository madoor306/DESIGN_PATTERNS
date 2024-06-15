// Thread Synchronized Java implementation of
// singleton design pattern
class SingletonDesignPattern {
	
	public static void main(String[] args) {
		Singleton instance =  Singleton.getInstance();
	}
}


class Singleton {

	// static member to hold the instance
	// Using volatile indicates that the variable value can be modified by multiple threads
	// Changes made by one thread are visible immediatly to other threads
	private static volatile Singleton instance;

	// private constructor to avoid external instantition
	private Singleton() {
		System.out.println("Singleton Instance Created!!!");
	}

	// global access to get singleton instance
	public static Singleton getInstance() {

		// Double checked locking mechanism
		if(instance == null) {

			// To make thread safe
			synchronized(Singleton.class) {

				// Check again as multiple threads can reach this point
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}
}