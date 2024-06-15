// Furniture shop simulator. Your code consists of classes that represent:
// A family of related products, say: Chair + Sofa + Table.
// Several variants of this family. For example, products Chair + Sofa + Table are available 
// in these variants: Modern, Retro, Classic.
public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
		AbstractFunitureFactory furnitureFactory = new ModernFurnitureFactory();

		// Modern Chair
		Chair chair = furnitureFactory.makeChair();
		chair.prepareChair();

		furnitureFactory = new ClassicFurnitureFactory();

		// Classic Sofa
		Sofa sofa = furnitureFactory.makeSofa();
		sofa.prepareSofa();

	}
	
}


// Factory of Factories
interface AbstractFunitureFactory {

	Chair makeChair();
	Sofa makeSofa();
	Table makeTable();
}

// Individual Factory
class ModernFurnitureFactory implements AbstractFunitureFactory {

	public Chair makeChair() {
		Chair chair = new ModernChair();
		return chair;
	}

	public Sofa makeSofa() {
		Sofa sofa = new ModernSofa();
		return sofa;
	}

	public Table makeTable() {
		Table table = new ModernTable();
		return table;
	}

}

class ClassicFurnitureFactory implements AbstractFunitureFactory {

	public Chair makeChair() {
		Chair chair = new ClassicChair();
		return chair;
	}

	public Sofa makeSofa() {
		Sofa sofa = new ClassicSofa();
		return sofa;
	}

	public Table makeTable() {
		Table table = new ClassicTable();
		return table;
	}
	
}

class RetroFurnitureFactory implements AbstractFunitureFactory {

	public Chair makeChair() {
		Chair chair = new RetroChair();
		return chair;
	}

	public Sofa makeSofa() {
		Sofa sofa = new RetroSofa();
		return sofa;
	}

	public Table makeTable() {
		Table table = new RetroTable();
		return table;
	}
	
}

interface Chair {

	void prepareChair();
}

interface Sofa {

	void prepareSofa();
}

interface Table {

	void prepareTable();
}

class ModernChair implements Chair {

	public void prepareChair() {
		System.out.println(" I am a ModernChair");
	}
}

class RetroChair implements Chair {

	public void prepareChair() {
		System.out.println(" I am a RetroChair");
	}
}

class ClassicChair implements Chair {

	public void prepareChair() {
		System.out.println(" I am a ClassicChair");
	}
}

class ModernSofa implements Sofa {

	public void prepareSofa() {
		System.out.println(" I am a ModernSofa");
	}
}

class RetroSofa implements Sofa {

	public void prepareSofa() {
		System.out.println(" I am a RetroSofa");
	}
}

class ClassicSofa implements Sofa {

	public void prepareSofa() {
		System.out.println(" I am a ClassicSofa");
	}
}

class ModernTable implements Table {

	public void prepareTable() {
		System.out.println(" I am a ModernTable");
	}
}

class RetroTable implements Table {

	public void prepareTable() {
		System.out.println(" I am a RetroTable");
	}
}

class ClassicTable implements Table {

	public void prepareTable() {
		System.out.println(" I am a ClassicTable");
	}
}

