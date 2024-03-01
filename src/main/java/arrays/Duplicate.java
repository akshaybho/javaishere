package arrays;

public class Duplicate {
	public void dupli() {
		 int [] a = {50, 50, 100, 100, 99, 99, 9, 9, 100, 100};
    	 
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] && i!=j) {
				System.out.println("duplicates="+a[j]);
			}
		}
	}

}
	public static void main(String[] args) {
		Duplicate b = new Duplicate();
		b.dupli();
	}
}