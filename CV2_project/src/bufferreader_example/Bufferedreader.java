package bufferreader_example;
import java.io.*;
public class Bufferedreader {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name:");
		String name=br.readLine();
		System.out.println("Enter a age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter the salary:");
		double salary=Double.parseDouble(br.readLine());
		
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
	}

}
