package abstract_factory;

public class Demo {
	public static void main(String[] args) {
		FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
		Table victorianTable = victorianFurnitureFactory.createTable();
		Chair victorianChair = victorianFurnitureFactory.createChair();

		FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
		Table modernTable = modernFurnitureFactory.createTable();
		Chair modernChair = modernFurnitureFactory.createChair();
	}
}
