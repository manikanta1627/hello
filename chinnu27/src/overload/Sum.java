package overload;

public class Sum {
	public int sum(int x, int y) {
		return (x+y);
	}
	public int sum(int x,int y,int z) {
		return (x+y+z);
	}
	public double sum(double x,double y) {
		return (x+y);
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		s.sum(10, 20);
		s.sum(20, 30, 40);
		s.sum(20.5, 30.6);

	}

}
