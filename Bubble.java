class Bubble{
 	public static void main(String args[]) {
 	int A[]={64,34,25,12,22,11,90};
 	bubble(A);
 	System.out.println("After sorting: ");
 	for(int i=0;i<A.length;i++)
 	   System.out.println(A[i]+" ");
 	}
 	public static void bubble(int[] A)  {
        int n=A.length;
 	for(int i=1;i<n;i++)
 		for(int j=0;j<n-1;j++)
 			if (A[j]>A[j+1]) {
 				int temp=A[j];
 				A[j]=A[j+1];
 				A[j+1]=temp;
 				}
 	}
}
