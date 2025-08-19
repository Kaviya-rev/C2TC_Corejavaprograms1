package bufferreader_example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		URL resource=FileReader.class.getResource("C70-Batch3");
		if(resource==null) {
			System.out.println("File not found");
			return;
		}
		File file=new File(resource.getFile());
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line;
		
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
	}
}