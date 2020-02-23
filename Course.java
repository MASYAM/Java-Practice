package core_practice;


public class  Course{
	private String courseName;
	private String students[];
	private int numberOfStudents=0;
	
	Course(String courseName)
	{		
		this.courseName = courseName;
	}
	
	
	public String getCourseName()
	{
		return courseName;
	}
	
	
	public void addStudent(String student)
	{
		if(numberOfStudents == 0)
		{ 
		  numberOfStudents++;
		}
		else{			
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}
	
	public void dropStudent(String student)
	{
		for(int i=0 ;i< numberOfStudents;i++)
		{
			if(students[i] == student)
			{
				students[i] = null;
			}
		}
	}
	
	public String[] getStudents()
	{		
		return students;
	}
	
	
	public int numberOfStudents()
	{
		return numberOfStudents;
	}
	
	
	public static void main(String args[])
	{
	
		  Course c = new Course("Math");
		  c.addStudent("ali");
		  c.addStudent("kali");
		   
		  System.out.println("Course Name: "+c.getCourseName()+"\n"+"Students: "+c.getStudents());
	}
	
}