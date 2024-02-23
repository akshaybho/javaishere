package constructor;

public class Problem_1 {
	
	int a, b;
	
	public Problem_1(int x, int y) {
		a = x;
		b = y;
	}
	public Problem_1() {
		this(10,10);
	}
    public int getX() {
    	return a;
    }
    public int getY() {
    	return b;
    }
    public static void main(String[] args) {
		Problem_1 p = new Problem_1();
		System.out.println(p.getX());
	}
}
