package core_practice;

import java.util.*;

public class sort_algorithm {
	
	
	public void sort_list()
	{
		System.out.println("1.Binary Search\n2.Bubble sort\n3.Insertion sort\n4.Selection sort\n5.Merge sort\n6.Quick sort\n7.Exit");
		
	}
	
	public void binarySearch()
	{
		  int i,first,middle,last,search,n;
		  boolean f = false;
		  int array[] = new int[100];
		  
		  System.out.println("Enter number of integers");
		  
		  Scanner get = new Scanner(System.in);
		  
		  n = get.nextInt();
		  
		  System.out.println("Enter "+ n +" integers");
		  
		  for(i = 0;i<n;i++)
		  {
			  array[i] = get.nextInt();
		  }
		  
		  System.out.println("Enter search number");
		  search = get.nextInt();
	
		  
		  first = 0;
		  last = n-1;
		  middle = last/2;
		  
		  
		  while(first<=last)
		  {
			     if(array[middle] < search)
			     {
			    	 first = middle+1;
			    	 
			     }else if(array[middle] == search)
			     {
			    	 System.out.println(search+" Found");
			    	 f= true;			    	 
			    	 break;
			     }else{
			    	 last = middle-1;
			     }
			     
			     middle = (first+last)/2;
			     
		  }
		  
		  if(f == false)
		  {
			  System.out.println("Not found");
		  }
		  
		
	}
	
	
	public void bubbleSort()
	{
		  int i,j,temp,n;
		  
		  int array[] = new int[100];
		  
		  System.out.println("Enter number of integers");
		  
		  Scanner input = new Scanner(System.in);
		  
		  n = input.nextInt();
		  
		  System.out.println("Enter "+ n +" integers");
		  
		  for(i = 0;i<n;i++)
		  {
			  array[i] = input.nextInt();
		  }
		  
		  
		  for(i=0;i<n;i++)
		  {
			      for(j=0;j<n-i-1;j++)
			      {
			    	    if(array[j] > array[j+1])
			    	    {
			    	    	 temp = array[j];
			    	    	 array[j] = array[j+1];
			    	    	 array[j+1] = temp;
			    	    }
			      }
			  
		  }
		  
		  System.out.println("Ascending sort");
		  for(i=0;i<n;i++)
		  {
			  System.out.println(array[i]);
		  }
		
	}
	
	
	public void insertionSort()
	{
		  int i,value,n,p;
		  
		  int array[] = new int[100];
		  
		  System.out.println("Enter number of integers");
		  
		  Scanner input = new Scanner(System.in);
		  
		  n = input.nextInt();
		  
		  System.out.println("Enter "+ n +" integers");
		  
		  for(i = 0;i<n;i++)
		  {
			  array[i] = input.nextInt();
		  }
		  
		  
		  for(i=1;i<n;i++)
		  {
			   value = array[i];
			   p = i;
			   while(p>0 && value < array[p-1])
			   {
				   array[p] = array[p-1];
				   p--;
			   }
			   array[p] = value;
			  
		  }
		  
		  System.out.println("Ascending sort");
		  for(i=0;i<n;i++)
		  {
			  System.out.println(array[i]);
		  }
		
	}
	
	
	public void selectionSort()
	{
		int i,j,imin,n,temp;
		  
		  int array[] = new int[100];
		  
		  System.out.println("Enter number of integers");
		  
		  Scanner input = new Scanner(System.in);
		  
		  n = input.nextInt();
		  
		  System.out.println("Enter "+ n +" integers");
		  
		  for(i = 0;i<n;i++)
		  {
			  array[i] = input.nextInt();
		  }
		  
		  for(i=0;i<=n-2;i++)
		  {
			     imin = i;
			     for(j=i+1;j<=n-1;j++)
			     {
			    	  if(array[j] < array[imin])
			    	  {
			    		   imin = j;		    		  
			    	  }
			    	 
			     }
			     
			     temp = array[i];
			     array[i] = array[imin];
			     array[imin] = temp;
			  
		  }
		  
		  
		  System.out.println("Ascending sort");
		  for(i=0;i<n;i++)
		  {
			  System.out.println(array[i]);
		  }
		  
	}
	
	
	public void mergeSort(int arr[], int p, int r)
	{
		int q;
	    if (p<r){

	        q = (p+r)/2;
	        mergeSort(arr,p,q);
	        mergeSort(arr, q+1, r);
	        merge(arr,p,q,r);
	    }		
	}
	
	public void merge(int arr[], int p, int q, int r){

        int n = q-p+1;
        int m = r-q;

        int L[] = new int[n+1];
        int R[] = new int[m+1];
        int i,j,k;

        for(i=0; i< n; i++){
            L[i] = arr[p+i];

        }
        for(j=0; j< m; j++){
            R[j] = arr[q+j+1];

        }

        L[n] = Integer.MAX_VALUE;
        R[m] = Integer.MAX_VALUE;

        i = 0;
        j = 0;
        for(k = p; k<= r; k++){

                if( L[i]<=R[j]){
                    arr[k] = L[i];
                    i = i+1;
                    }
                else{
                    arr[k] = R[j];
                    j = j+1;

                }

        }
}
	
	
	
	
	public void qSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = Partition(a, p,r);
            qSort(a, p, q-1);
            qSort(a, q+1, r);
        }
     }

    public int Partition(int[] a, int p, int r)
     {
         int x = a[r];

         int i = p-1;
         int temp=0;

         for(int j=p; j<=r-1; j++)
         {
             if(a[j]<=x)
             {
                 i++;
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }

         temp = a[i+1];
         a[i+1] = a[r];
         a[r] = temp;
         return (i+1);
     }


	
	public static void main(String args[])
	{
		  Scanner input = new Scanner(System.in);
		  sort_algorithm obj1 = new sort_algorithm();
		  
		  obj1.sort_list();
		  int choice;
		  
		  do{
			 System.out.println("Give a choice");
		     choice = input.nextInt();
		     
		     if(choice == 1)
		     {
		    	  obj1.binarySearch();
		     }else if(choice == 2)
		     {
		    	  obj1.bubbleSort();
		     }else if(choice == 3)
		     {
		    	  obj1.insertionSort();
		     }else if(choice == 4)
		     {
		    	  obj1.selectionSort();
		     }else if(choice == 5)
		     {
		    	 int testArray[] = {1,3,5,3,1,7,8,9};
		    	 obj1.mergeSort(testArray,0,testArray.length-1);
		    	 System.out.println(Arrays.toString(testArray));
		     }else if(choice == 6)
		     {
		    	 int Array[] = {1,3,11,66,70,100,1,8,9};
		    	 obj1.qSort(Array,0,Array.length-1);
		    	 System.out.println(Arrays.toString(Array));
		     }
		  
		  }while(choice != 7);
		  
			  
		  
	}

}
