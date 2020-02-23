package core_practice;

import java.util.*;

class Floyd_Warshall
{
  int[][] graph ; 
  int[][] distance ; 
  int[][] sequence;

  static final int INF = 99 ; 
	
  public Floyd_Warshall(int[][] graph)
  {
	  
    this.graph = graph; 
    
    distance = new int[graph.length+1][graph.length+1] ; 
    sequence = new int[graph.length+1][graph.length+1] ;
    
    for(int i = 1 ; i <= graph.length ; i++)
    {
        for(int j = 1 ; j <= graph.length ; j++)
        {
        	distance[i][j] = graph[i-1][j-1]  ; 
	        
	        if(distance[i][j] == 0 && i != j)	
	        {  distance[i][j] = INF ;  }
	        
	         if(i == j)
	         {
	        	sequence[i][j] = 0; 
	         }else{
	            sequence[i][j] = j; 
	         }
        }
    }
  }
	
  public void shortest_dist()
  {
    int n = graph.length ; 
    int temp;
    
    for(int k = 1 ; k <= n ; k++)
    {
        for(int i = 1 ; i <= n ; i++)
        {
	      for(int j = 1 ; j <= n ; j++)
	      {
	    	  temp = distance[i][j];
	    	  
	          if(distance[i][k] != INF && distance[k][j] != INF && (distance[i][k]+distance[k][j] < distance[i][j]))
	          {   distance[i][j] = distance[i][k] + distance[k][j] ;  }
	          
	          if(temp != distance[i][j] )
	          {
	        	   sequence[i][j] = k;
	          }
	      }
        }
        
    }
  }
	
  public void display()
  {
	System.out.println("\nDISTANCE TABLE:") ;  
	  
    for(int i = 1 ; i <= graph.length ; i++)
    {
      for(int j = 1 ; j <= graph.length ; j++)
	    System.out.print(distance[i][j] + "\t     " ) ; 
      System.out.println() ; 
    }

    System.out.println("\nSEQUENCE TABLE:") ;
    
    for(int i = 1 ; i <= graph.length ; i++)
    {
      for(int j = 1 ; j <= graph.length ; j++)
	    System.out.print(sequence[i][j] + "\t     " ) ; 
        System.out.println() ; 
    }
    
    
    int source,destination;
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nEnter your source:");
    
    source = input.nextInt();
    
    System.out.println("Enter your destination:");
    
    destination = input.nextInt();
    
    System.out.println("\n******Your best way to destination******");
    
    if(source == destination)
    {
    	System.out.println("\nYou're already in your destination");
    	
    }else if(distance[source][destination] == INF)
    {
    	System.out.println("\nSorry, No way found");
    }
    else{
	    System.out.println("Cost: "+ distance[source][destination]);
	    	
	    System.out.print("The shortest path: "+source);
	    print_path(source, destination);
    }
  }
  
  
 
  
  public void print_path(int source,int destination)
  {
	    
        if(sequence[source][destination] == destination)
	    {  
	    	System.out.print(" -> "+destination);
	    	return;
	    }
		else{
			
			print_path(source,sequence[source][destination]);
						
			print_path(sequence[source][destination],destination);
		}


  }
  
 

			


  public static void main(String[] args)
  {
    int[][] graph = {{0, 3, 8, 0, -4}, {0, 0, 0, 1, 7},{0, 4, 0, 0, 0},{2, 0, -5, 0, 0}, {0, 0, 0, 6, 0}} ; 
   
    Floyd_Warshall obj1 = new Floyd_Warshall(graph) ;  
   
    obj1.shortest_dist() ; 
    
    obj1.display()  ; 
 
  }
}
