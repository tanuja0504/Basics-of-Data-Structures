package basicDataStructure;

class Employee{
	int id;
	String name;
	public Employee() {
		this.id = 0;
		this.name = "NOT_AVAILABLE";
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class sampleArray {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int array1[] = new int[5];
		int array2[];
		
		Employee[] obj = new Employee[5];
		obj[0] = new Employee();
		obj[1] = new Employee(1,"Tanuja");
		obj[2] = new Employee(2,"Tanu");
		obj[3] = new Employee(3,"Tan");

		System.out.println(obj[0].toString());
	}

}
