/*Given a sorted array A of size N. The function remove_duplicate takes two arguments . 
The first argument is the sorted array A[ ] and the second argument is 'N' the size of the array
and returns the size of the new converted array A[ ] with no duplicate element.*/

class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[], int N)
	{
		// Your code here
		int len=a.length;
		int temp[] =new int[len];
		int j=0;
		for(int i=0;i<len-1;i++)
		{
		    if (a[i]!=a[i+1])
		        temp[j++]=a[i];
		}
		temp[j++]=a[len-1];
		 for (int i=0; i<j; i++) 
            a[i] = temp[i]; 
       
        return j; 
    }
}

