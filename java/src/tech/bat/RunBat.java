package tech.bat;

import java.io.File;
import java.io.IOException;

public class RunBat {
	public static void main(String[] args) throws IOException{
		
		String path = "D:\\dev\\";
		String name = "Anshu";
		try {
			Process p1 =  Runtime.getRuntime().exec("cmd /c start demo.bat", null, new File(path));
			Thread.sleep(60000);
			Process p2 = Runtime.getRuntime().exec("cmd.exe /c start ");
			//Thread.sleep(60000);
			//Process p3 = Runtime.getRuntime().exec("cmd.exe /c start ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
