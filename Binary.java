class Binary {
	public static void main(String args[]) {
	 int A[]={3,13,23,31,45,67,80};
	 int key=67;
	 System.out.print(key+"is found at index: "+ Binary(A,key));
	}
	public static int Binary(int A[],int key) {
		int low=0,high=A.length,mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(A[mid]==key)
				return mid;
			if(key>A[mid])
				low=mid+1;
			else
				high=mid-1;
	 	}
	 	return -1;
	 }
}
