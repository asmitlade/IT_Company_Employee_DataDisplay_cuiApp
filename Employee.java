class Employee{
	int eno;
	String ename;
	String[] dept;
	double sal;
	Laptop laptop;
	Employee(int eno, String ename, String[] dept, double sal){
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	void setEno(int eno){
		this.eno = eno;
	}
	int getEno(){
		return this.eno;
	}
	void setEname(String ename){
		this.ename = ename;
	}
	String getEname(){
		return this.ename;
	}
	void setDept(String[] dept){
		this.dept = dept;
	}
	String[] getDept(){
		return this.dept;
	}
	void setSal(double sal){
		this.sal = sal;
	}
	double getSal(){
		return this.sal;
	}
	void setLaptop(Laptop laptop){
		this.laptop = laptop;
	}
	Laptop getLaptop(){
		return this.laptop;
	}
	void display(){
		System.out.println("Employee Details :");
		System.out.println("Employee No. :"+this.eno);
		System.out.println("Employee Name :"+this.ename);
		System.out.println("Employee Department :"+java.util.Arrays.toString(this.dept));
		System.out.println("Employee Salary :"+this.sal);
		System.out.println("Laptop Configuration :");
		if(laptop == null){
			System.out.println("Laptop not provided yet...");
		}
		else{
			this.laptop.display();
		}
		System.out.println("=================================");
	}
}
