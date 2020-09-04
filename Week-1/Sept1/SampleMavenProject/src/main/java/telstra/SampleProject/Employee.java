package telstra.SampleProject;

public class Employee {
	private String Id;
	private String Name;
	
	public Employee(String id, String name) {
		super();
		Id = id;
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
