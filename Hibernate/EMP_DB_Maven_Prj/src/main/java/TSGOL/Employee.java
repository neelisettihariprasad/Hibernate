package TSGOL;
import javax.persistence.*; 

@Entity  //java annotation
@Table(name = "EMPLOYEE")
public class Employee {
	
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "salary")
	private float salary;
	public int getId() {
		return id;
	}
	public void setId( int id ) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName( String first_name ) {
		this.firstName = first_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String last_name ) {
		this.lastName = last_name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int id, String firstname, String lastname, float salary) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}