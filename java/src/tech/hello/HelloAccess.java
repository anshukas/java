package tech.hello;

/**
 * Try to access the instance variable.
 * @author Kansakar
 *
 */

class Access {
	int x=7;
	
	//private setter & getter for y;
	// NOT Access by other class while creating of object of this class it's not visible.
	private int y =8;
	@SuppressWarnings("unused")
	private int getY(){
		return y;
	}
	@SuppressWarnings("unused")
	private void setY(int y){
		this.y=y;
	}
	
	// public z with setter & getter;
	public int z =9;
	public int getZ(){
		return z;
	}
	public void setZ(int z){
		this.z = z;
	}
	
}


public class HelloAccess {
	public static void main(String[] args){
		// Access the x 
		Access obj = new Access();
		System.out.println("x is access from other class: "+ obj.x);
		
		/**
		 * Try to access the private instance variable.
		 * Not Possible -  we can access the private variable using obj reference of the class
		 *  uncomment this below line you see eclipse hint - "change the visibility or 
		 *  make the setter & getter method"  
		 */
		//System.out.println("y is private instance variable: "+ obj.y);
		
		/**
		 * Trying to access the y via private setter & getter.
		 * NOT Possible - the method is not visible here.
		 */
		//System.out.println("y: "+ obj.get);
		
		/**
		 * Trying to access other class instance variable with public setter & getter
		 */
		System.out.println("Z: "+ obj.getZ());
	}
}


