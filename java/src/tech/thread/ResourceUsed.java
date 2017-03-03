package tech.thread;

public class ResourceUsed {
	
	public static void main(String[] args) {
		Resource rs = new Resource();
		String str = rs.getTokenByUser();
		System.out.println(str);
	}
}
