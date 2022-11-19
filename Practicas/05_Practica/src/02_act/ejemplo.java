class ejemplo {
	public static void main(String[] args) {
		int[] a = {1,2,2,4,5,6,7,8,9};
		System.out.print("duplicates: ");
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i]==a[j])) {
					System.out.print(a[i]+",");
				}
			}
		}
	}
}
