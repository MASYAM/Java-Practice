package core_practice;

public class Doctor {
       
	   private String ID;
	   private String name;
	   private String cellno;
	   private static String hospital;
	   
	   public Doctor(String ID,String name,String cellno)
	   {
		     this.ID = ID;
		     this.name = name;
		     this.cellno = cellno;
	   }
	   
	   public static void setHospital(String hospitalName)
	   {
		   hospital = hospitalName;
	   }
	   
	   public static String getHospital()
	   {
		    return hospital;
	   }
	   
	   public void display()
	   {
		    System.out.println("ID: "+ID+"\n"+"Name: "+name+"\n"+"cell no: "+cellno+"\n"+"Hospital :"+hospital);		    
	   }
	   
	   
	   public static void main(String args[])
	   {
		      Doctor obj1 = new Doctor("D001","Dr Subarna","01711007007");
		      obj1.setHospital("Druto Aroggo");
		      obj1.display();
		      
	   }
}
