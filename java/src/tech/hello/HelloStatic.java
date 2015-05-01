package tech.hello;
/**
 * tech#705
 * To use the normal method in main class, which is not static in nature
 * @author Kansakar
 *
 */
public class HelloStatic {
	public static void main(String[] args){
		String msg = sayHello();
		System.out.println(msg);
		
		//Call the method which is not static in nature in main method which is static in nature.
		String msgAgian= new HelloStatic().sayHelloAgain();
		System.out.println(msgAgian);
		
	}
	
	public static String sayHello(){
		return "Hello I'm in static nature";
	}
	
	public String sayHelloAgain(){
		return "Hello I'm not in static nature";
	}
}
