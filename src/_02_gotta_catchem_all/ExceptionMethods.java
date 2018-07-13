package _02_gotta_catchem_all;

public class ExceptionMethods extends Exception{
	public double divide(int x, int y) throws Exception {
		if(y==0) {
			throw new Exception();
		}
		int a = x/y;
		return a;
	}	
	public String reverseString(String s) throws Exception{
		String x="";
		if(s.length()==0) {
			throw new Exception();
		}
		for (int i = 0; i <s.length(); i++) {
			x+=s.substring(s.length()-i-1, s.length()-i);
		}
		return x;
	}
}
