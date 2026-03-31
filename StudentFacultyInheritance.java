import java.util.*;

public class StudentFacultyInheritance{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	Student[] s = new Student[2];
    	Faculty[] f = new Faculty[2];
    	for(int i = 0;i<2;i++) {
    	    String firstName = sc.nextLine();
    	    String lastName = sc.nextLine();
    	    int age = sc.nextInt();
    	    sc.nextLine();
    	    char gender = sc.nextLine().charAt(0);
    	    
    		String rollNo = sc.nextLine();
    		String course = sc.nextLine();
    		int semester = sc.nextInt();
    		sc.nextLine();
    		double GPA = sc.nextDouble();
    		sc.nextLine();
    
    		s[i] = new Student(firstName, lastName, age, gender,rollNo, course, semester, GPA);
    	}

	for(int i = 0;i<2;i++){
	    String firstName = sc.nextLine();
	    String lastName = sc.nextLine();
	    int age = sc.nextInt();
	    sc.nextLine();
	    char gender = sc.nextLine().charAt(0);
	    String employeeId = sc.nextLine();
	    String department = sc.nextLine();
	    String designation = sc.nextLine();
	    double salary = sc.nextDouble();
	    sc.nextLine();
	    f[i] = new Faculty(firstName, lastName, age, gender,employeeId, department, designation, salary);
	}
    
    Student ans1 = findHighestGPAStudent(s);
    Faculty ans2 = findHighestPaidFaculty(f); 
    
    if(ans1!=null) {
        System.out.println(ans1.getRollNo());
        System.out.println(ans1.getCourse());
        System.out.println(ans1.getGPA());
    } else {
        System.out.println("Sorry - No student is available!");
    }
    
    if(ans2!=null) {
        System.out.println(ans2.getEmployeeId());
        System.out.println(ans2.getDepartment());
        System.out.println(ans2.getSalary());
    } else {
        System.out.println("sorry - No Faculty is available");
    }
}
public static Student findHighestGPAStudent(Student[] student) {
	Student stu = null;
double maxi = Double.MIN_VALUE;
	for(Student s:student) {
		if(s.getGPA() > maxi) {
			maxi = s.getGPA();
			stu = s;
		}
	}
return stu;
}

public static Faculty findHighestPaidFaculty(Faculty[] faculty){
	double maxi = Double.MIN_VALUE;
	Faculty fac = null;
	for(Faculty f: faculty) {
		if(f.getSalary()>maxi) {
		maxi = f.getSalary();
		fac = f;
		}
	}
	return fac;
}

}

class Person {
private String firstName;
private String lastName;
private int age;
private char gender;

Person(String firstName, String lastName, int age, char gender){
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.gender = gender;
}

public String getFirstName(){
return firstName;
}
public String getLastName(){
return lastName;
}
public int getAge(){
return age;
}
public char getGender(){
return gender;
}
}


class Student extends Person {
private String rollNo;
private String course;
private int semester;
private double GPA;

Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
    super(firstName, lastName, age, gender);
this.rollNo = rollNo;
this.course = course;
this.semester = semester;
this.GPA = GPA;
}

public String getRollNo(){
return rollNo;
}
public String getCourse(){
return course;
}
public int getSemester(){
return semester;
}
public double getGPA(){
return GPA;
}
}


class Faculty extends Person {
private String employeeId;
private String department;
private String designation;
private double salary;

Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
    super(firstName, lastName, age, gender);
this.employeeId = employeeId;
this.department = department;
this.designation =  designation;
this.salary = salary;
}

public String getEmployeeId() {
    return employeeId;
}
public String getDepartment() {
    return department;
}
public String getDesignation() {
    return designation;
}
public double getSalary() {
    return salary;
}
}


