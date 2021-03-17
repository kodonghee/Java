# SalaryTest

> 여러 개의 class와 변수 만들기

* 각 직급 (Employee, Manager, Engineer, Secretary)에 해당하는 class를 만든다.
* class SalaryTest에서 각 클래스 변수에 해당하는 값을 설정해주고 totalSalary를 계산한다.

```java
package day5;

class Employee{
	int id;
	String name;
	int baseSalary;
	int generalFee;
	int totalSalary;
	
	
	public Employee(int id, String name, int baseSalary, int generalFee) {
		super();
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.generalFee = generalFee;
	}

	public void calcTotalSalary() {
		totalSalary = baseSalary + generalFee;
	}
}
class Manager extends Employee{
	int manFee;
	
	public Manager(int id, String name, int baseSalary, int generalFee, int manFee) {
		super(id, name, baseSalary, generalFee);
		this.manFee = manFee;
	}

	public void calcTotalSalary() {
//		totalSalary = baseSalary + generalFee + manFee;
		super.calcTotalSalary(); //totalSalary = baseSalary + generalFee
		totalSalary = totalSalary + manFee;
	}
	
}
class Engineer extends Employee{
	int certiFee;
	int techFee;
	Engineer(int id, String name, int baseSalary, int generalFee,
			int certiFee, int techFee){
		super(id, name, baseSalary, generalFee);
		this.certiFee = certiFee;
		this.techFee = techFee;
	}
	public void calcTotalSalary() {
		totalSalary = baseSalary + generalFee + certiFee + techFee;
	}
}
class Secretary extends Employee{
	int secFee;
	public Secretary(int id, String name, int baseSalary, int generalFee
			, int secFee) {
		super(id, name, baseSalary, generalFee);
		this.secFee = secFee;
		
	}
}
class SalaryTest{
	public static void main(String args[]){

	Employee e [] = new Employee[4];
	// 1.상속 2.생성자(타입 순서 갯수....)
	e[0] = new Employee
	(1000,"이사원",10000,5000);
	e[1] = new Manager
	(2000,"김간부",20000,10000,10000);
	e[2] = new Engineer
	(3000,"박기술",15000,7500,5000,5000);
	e[3] = new Secretary
	(4000,"최비서",15000,7000,10000);
	
	System.out.println("사번 : 이름 : 본봉 : 총급여");
	for(int i = 0; i < e.length; i++) {
		e[i].calcTotalSalary();
		System.out.println
		(e[i].id + ":" + e[i].name + ":"
				+ e[i].baseSalary + ":" + e[i].totalSalary);
		if(e[i] instanceof Engineer) {//i=2 - true
				Engineer en = (Engineer)e[i];
				System.out.println(en.certiFee + ":" + en.techFee);
		}
		
	}
	}
}
```

