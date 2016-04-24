class Sample{
	public static void main (String []args){
		int [] i1 = new int[10];
		for(int i = 1; i<=9; i++ ){
			for(int j = 1; j<=9; j++ ){
				i1[j] = i*j;
				System.out.println(i1[j]);
			}
			
		}
	}
}