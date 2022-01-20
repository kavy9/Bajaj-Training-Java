package javatest;

class Person{
	private String name ;
	private int  age ;
	private int salary ;
	private String address;
	public Person(String name,int age,int salary,String address){
		this.name =name ;
		this.age = age;
		this.salary=salary;
		this.address=address;
	}
	@Override
	public String toString(){
		return this.name+" "+this.age+" "+this.salary+" "+this.address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void getName() {
		System.out.println(this.name);
	}
	public void getAge() {
		System.out.println(this.age);
	}
	public void getSalary() {
		System.out.println(this.salary);
	}
	public void getAddress() {
		System.out.println(this.address);
	}

}
class Employee extends Person {
	private String company;
	public Employee(String name,int age,int salary,String address,String company){
		super(name,age,salary,address);
		this.company = company ;
	}
	public void setSalary(String company) {
		this.company=company;
	}
	public void getComapny() {
		System.out.println(this.company);
	}	
	@Override
	public String toString() {
		return super.toString()+ this.company;
	}
}
enum Processor{
	i7,i5,i3,rizen3,rizen5,rizen7
}
class Laptop{
	private String name;
	private String company;
	private Processor processor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public Laptop(String name, String company, Processor processor) {
		super();
		this.name = name;
		this.company = company;
		this.processor = processor;
	}
	public Laptop() {
		
	}

}
class Pen{
	private String company;
	private String name;
	private String color;
	public Pen(String company, String name, String color) {
		this.company = company;
		this.name = name;
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	

}

public class FewClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Sheldon",28,10000,"NY");
		person.getName();
		person.getAge();
		person.getAddress();
		person.getSalary();
		System.out.println(person.toString());
		System.out.println();
		Laptop laptop = new Laptop();
		laptop.setName("mz-11");
		laptop.setCompany("hp");
		laptop.setProcessor(Processor.rizen3);
		System.out.println(laptop.getName());	
		System.out.println(laptop.getCompany());	
		System.out.println(laptop.getProcessor());	
		System.out.println(Processor.i5.getClass());	
	}

}
