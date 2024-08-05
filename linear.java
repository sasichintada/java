class linear{
	public static void main(String args[]){
		int A[]={10,4,68,23,96,45,2,78,46,43,89,34};
		int key=43;
		System.out.println(key+"is found at index: "+linear(A,key));
 	}
	static int linear(int[] A,int key) {
		for(int i=0;i<A.length;i++)
			if(A[i] == key)
			  return i+1;
	        return -1;
	}
}
	
