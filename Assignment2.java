package assignments;

public class Assignment2 {
	
	
	public static void main (String args[])
	{
		
//------------------------------------------------------Question1-----------------------------------------------------------------
System.out.println("------------------Question1------------------");

		int [] array = {1,2,4,5,2,7};
		int counter = array.length;
		for (int i = 0; i < array.length; i++) 
		{
			
					for (int j = i+1; j < array.length; j++) 
					{
						
						if(array[i]==array[j])
						{
							--counter;
							System.out.println(array[i]+" Is duplicated number");	
						}
					}
		}
		if(counter==array.length)
		{
					System.out.println("No duplicates number found "+ counter);
		}
		

		
		System.out.println("");	
		System.out.println("");
	
//------------------------------------------------------Question2-----------------------------------------------------------------
		
		
		System.out.println("------------------Question2------------------");	
		
		int [] array1 = {50,1,2,4,5,2,7};
		System.out.println("Before the Quick sort:");
		printArray(array1);
		System.out.println("");

		boolean sorted = false;
		int temp;
		while (!sorted) {
		    sorted = true;
		    for (int i = 0; i < array1.length - 1; i++) {
		        if (array1[i] > array1[i+1]) {
		            temp = array1[i];
		            array1[i] = array1[i+1];
		            array1[i+1] = temp;
		            sorted = false;
		        }
		    }
		}
		System.out.println("After the Quick sort:");
		printArray(array1);
		
		
		
		System.out.println("");	
		System.out.println("");

		System.out.println("");

		//------------------------------------------------------Question3-----------------------------------------------------------------
				
				
		System.out.println("------------------Question3------------------");	

		int [] array2 = {50,121,22,412,511,22,7};
		System.out.println("Before the Buble sort:");
		printArray(array2);
		System.out.println("");
		int len = array2.length;
		for (int i=0;i<len-1;++i){

			for(int j=0;j<len-i-1; ++j){

				if(array2[j+1]<array2[j]){

					int swap = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = swap;

				}
			}
		}
		System.out.println("After the Bubble sort :");
		printArray(array2);
		
		System.out.println("");			
		System.out.println("");	
		System.out.println("");

		//------------------------------------------------------Question4-----------------------------------------------------------------
				
		System.out.println("------------------Question4------------------");
		
		 
		int array4[] = { 1022,505,343,12, 11, 13, 5, 6, 7 };
		 
		System.out.println("Before the Merge sort:");
        printArray(array4);
        
        System.out.println("");
 
        Assignment2.sort(array4, 0, array4.length - 1);
 
		System.out.println("Before the Merge sort:");
		printArray(array4);

		
		

		
		
		
		
		
		
		
		

		System.out.println("");	
		System.out.println("");
		System.out.println("");

		//------------------------------------------------------Question5-----------------------------------------------------------------
				
				
		System.out.println("------------------Question5------------------");	

		int [] array5 = {50,121,22,412,511,22,7};
		System.out.println("Before the Selection sort:");
		printArray(array5);



		for (int i = 0; i < array5.length - 1; i++)  
		{  
				    int index = i;  
				    for (int j = i + 1; j < array5.length; j++){  
				        if (array5[j] < array5[index]){  
				            index = j;//searching for lowest index  
				        }  
				    }  
				    int smallerNumber = array5[index];   
				    array5[index] = array5[i];  
				    array5[i] = smallerNumber;  
		}
		System.out.println("");
		System.out.println("After the Selection sort:");
		printArray(array5);



		
		
		System.out.println("");	
		System.out.println("");
		System.out.println("");

		//------------------------------------------------------Question6-----------------------------------------------------------------
				
				
		System.out.println("------------------Question6------------------");		
		
		int array_6a[] = { 11, 1, 13, 21, 3, 7 };
		int array_6b[] = { 11, 3, 7, 1 };

		int m = array_6a.length;
		int n = array_6b.length;

		if (isSubset(array_6a, array_6b, m, n))
			System.out.print("array_6b[] is "
							+ "subset of array_6a[] ");
		else
			System.out.print("array_6b[] is "
							+ "not a subset of array_6a[]");
		
		
		
	}

	
	
	public static void printArray(int array[])
	{
		System.out.print("{");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.print("}");
	}
	
	//implementation of the merge method 
	public static void merge(int array4[], int leftSide, int middle, int rightSide)
    {
        int n1 = middle - leftSide + 1;
        int n2 = rightSide - middle;
 
        int temp_l[] = new int[n1];
        int temp_R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            temp_l[i] = array4[leftSide + i];
        for (int j = 0; j < n2; ++j)
            temp_R[j] = array4[middle + 1 + j];
 
 
        int index_i = 0, index_j = 0;
 
        int k = leftSide;
        while (index_i < n1 && index_j < n2) {
            if (temp_l[index_i] <= temp_R[index_j]) {
                array4[k] = temp_l[index_i];
                index_i++;
            }
            else {
                array4[k] = temp_R[index_j];
                index_j++;
            }
            k++;
        }
 
        while (index_i < n1) {
            array4[k] = temp_l[index_i];
            index_i++;
            k++;
        }
 
        while (index_j < n2) {
            array4[k] = temp_R[index_j];
            index_j++;
            k++;
        }
    }
	
		//implementation of the sort method 
	public static void sort(int array5[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
 
            sort(array5, l, m);
            sort(array5, m + 1, r);
 
            merge(array5, l, m, r);
        }
    }
	
	
	//implementation of subset method
	static boolean isSubset(int array6[], int arr2[], int m,
			int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == array6[j])
					break;

			if (j == m)
				return false;
		}


		return true;
	}

	

}













