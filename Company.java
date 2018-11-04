class Company{
	public static void main(String[] args){
	Employee e1 = new Employee(1121,"Asmit Lade",new String[]{"Research and development","Quality Assurance"},55000);
	e1.display();
	Laptop laptop = new Laptop();
	laptop.setBrand("HP 15-AY009TX");
	laptop.setProcessor("Intel Core i5-6200U");
	laptop.setOs("Windows 10 Pro");
	laptop.setHd("1TB 5400rpm Serial ATA");
	laptop.setRam("8GB DDR4");
	e1.setLaptop(laptop);
	e1.display();
	//Changing Laptop Configuration.
	//1. retriving Laptop object from e1
	Laptop oldLaptopObj =e1.getLaptop();
	//2.Changing brand and os 
	oldLaptopObj.setBrand("Lenovo Ideapad 300");
	oldLaptopObj.setOs("Mac OS X 10.5.6");
	System.out.println("=======Display Modified Configuration=====");
	e1.display();
	}
}
