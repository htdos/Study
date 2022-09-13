package again1;
import java.io.*;

public class Bj15552 {

	public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner와 유사
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //System.out.println();과 유사
		 int n = Integer.parseInt(br.readLine());
		 
		 for(int i=0; i<n; i++) {
			 String s = br.readLine();
			 int a = Integer.parseInt(s.split(" ")[0]);
			 int b = Integer.parseInt(s.split(" ")[1]);
			 bw.write(a+b+"\n");
		 }
		 bw.flush();
	}

}
