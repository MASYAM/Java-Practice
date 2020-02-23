	package core_practice;
	
	
	interface Drive{
		
		 public void startEngine();
		 public void stopEngine();
	}



    class Vehicle{
    	 	
    	protected String model;
    	
    	public Vehicle(String model)
    	{
    		
    		this.model = model;
    	}
    	
    	
    	public void display()
    	{
    		
    	}
    	
    }


	public class volvo extends Vehicle implements Drive {
		
		private double price;
		
	    
		public volvo(double price,String model)
    	{
			super(model);
    		this.price = price;
    		
    	}
		
		public void startEngine()
		{
			
		}
		
		public void stopEngine()
		{
			
		}
		
		
		
		public static void main(String args[])
		{
			volvo obj1 = new volvo(100,"HS100");			
		}
		
	
	}
