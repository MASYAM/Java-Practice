

package core_practice;

import java.util.*;

public class Graph {
	
	private Queue<Integer> q;
	 
 
    public void bfs(int adjacency_matrix[][], int source)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        boolean[] visited = new boolean[number_of_nodes + 1];
        int i;
 
        q = new LinkedList<Integer>();

        for (i = 0; i < visited.length; i++)
           visited[i] = false; 

        q.add(source);           

        
        while( ! q.isEmpty() )
        {
	           int nextNode;                // Next node to visit
	
	           nextNode = q.remove();
	
	           if ( ! visited[nextNode] )
	           {
	              visited[nextNode] = true;    // Mark node as visited
	              System.out.println("nextNode = " + nextNode );
	
	              for ( i = 0; i < number_of_nodes; i++ )
	              {
	                 if ( adjacency_matrix[nextNode][i] > 0 && ! visited[i] )
	                    q.add(i);
	              }
	           }
        }
    }
    
    
    
 
    public static void main(String args[])
    {
        int number_no_nodes, source,a,b,edges;
        Scanner scanner = null;
 
        try
        {
            System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_no_nodes = scanner.nextInt();
 
            int adjacency_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];
                     
            
            for (int i = 0; i < number_no_nodes; i++)
            {
                for (int j = 0; j < number_no_nodes; j++)
                {
                    adjacency_matrix[i][j] = 0;
                }
            }
            
            System.out.println("Enter the number of Edges");
            edges = scanner.nextInt();
            
            System.out.println("Enter the adjacency matrix");
            
            for(int i=1;i<=edges;i++)
            {
            	  System.out.println("Enter a");
            	  
            	  a = scanner.nextInt();
            	  
            	  System.out.println("Enter b");
            	  
            	  b = scanner.nextInt();
            	  
            	  adjacency_matrix[a][b] = 1;
            	  adjacency_matrix[b][a] = 1;
            }
            
            for (int i = 0; i < number_no_nodes; i++)
            {
                for (int j = 0; j < number_no_nodes; j++)
                {
                    System.out.print(adjacency_matrix[i][j] + " ");
                }
                System.out.println();
            }
 
            System.out.println("Enter the source for the graph");
            source = scanner.nextInt();
 
            System.out.println("The BFS traversal of the graph is ");
            Graph bfs = new Graph();
            bfs.bfs(adjacency_matrix, source);
 
        } catch (InputMismatchException inputMismatch)
        {
            System.out.println("Wrong Input Format");
        }
        scanner.close();
    }
}