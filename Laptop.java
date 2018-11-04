class Laptop{
	String brand;
	String processor;
	String os;
	String hd;
	String ram;
	Laptop(){
		this.brand = brand;
		this.processor  = processor;
		this.os = os;
		this.hd = hd;
		this.ram = ram;
	}
	void setBrand(String brand){
		this.brand = brand;
	}
	String getBrand(){
		return this.brand;
	}
	void setProcessor(String processor){
		this.processor = processor;
	}
	String getProcessor(){
		return this.processor;
	}
	void setOs(String os){
		this.os = os;
	}
	String getOs(){
		return this.os;
	}
	void setHd(String hd){
		this.hd = hd;
	}
	String getHd(){
		return this.hd;
	}
	void setRam(String ram){
		this.ram = ram;
	}
	String getRam(){
		return this.ram;
	}
	void display(){
		System.out.println("Brand :"+this.brand);
		System.out.println("Processor :"+this.processor);
		System.out.println("Operating System :"+this.os);
		System.out.println("Hard Disk :"+this.hd);
		System.out.println("RAM :"+this.ram);
	}
}
