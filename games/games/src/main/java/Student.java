import java.time.*;
import java.util.Objects;

public class Student {

	Object obj;
	private String name;
	private int id;
	private int marks;
	private LocalDate doj;
	private String gender;
	

	
	
	public Student() {
		super();
	}
	public Student(String name, int id, int marks, LocalDate doj, String gender) {
		super();
		
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.doj = doj;
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", doj=" + doj + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(doj, gender, id, marks, name, obj);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(doj, other.doj) && Objects.equals(gender, other.gender) && id == other.id
				&& marks == other.marks && Objects.equals(name, other.name) && Objects.equals(this.obj, other.obj);
	}
	
	
}
	/*
	 * @Override public int hashCode() { return Objects.hash(doj, id, marks, name);
	 * }
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Student other = (Student) obj; return Objects.equals(doj, other.doj)
	 * && id == other.id && marks == other.marks && Objects.equals(name,
	 * other.name); }
	 */
	

