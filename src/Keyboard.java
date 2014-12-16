import java.io.*;

public class Keyboard {

	static BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
	public static int readInt(){
		try{
			return(Integer.valueOf(inputStream.readLine().trim()).intValue());
		}catch	(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	public static String readString(){
		try{
			return(inputStream.readLine());
		}catch (IOException e){return "0";}
	}
}
