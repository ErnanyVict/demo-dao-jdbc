package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date birhtdate;
	private Double Salary;
	
	private Department departament;
	
	public Seller() {}

	public Seller(Integer id, String name, String email, Date birhtdate, Double salary, Department departament) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birhtdate = birhtdate;
		Salary = salary;
		this.departament = departament;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirhtdate() {
		return birhtdate;
	}

	public void setBirhtdate(Date birhtdate) {
		this.birhtdate = birhtdate;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birhtdate=" + birhtdate + ", Salary="
				+ Salary + ", departament=" + departament + "]";
	}

}
