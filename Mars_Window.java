import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mars_Window {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		//1 - 12 months, starts on April which is 4
		int marsMonth = 4;
		int marsYear = 2018;
		int yearOfInterest = in.nextInt();
		while (marsYear < yearOfInterest) {
			//26 modular 12 = 2
			marsMonth += 2;
			if (marsMonth > 12) {
				marsMonth = 2;
			}
			if (marsMonth == 2) {
				marsYear += 3;
			}
			else {
				marsYear += 2;
			}
		}
		if (marsYear == yearOfInterest) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try{ 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try{ 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        }
    } 
}
