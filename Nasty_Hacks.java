import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nasty_Hacks {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int numberOfCases = in.nextInt();
		while (numberOfCases-- != 0) {
			int noAdvertise = in.nextInt();
			int yesAdvertise = in.nextInt();
			int costToAdvertise = in.nextInt();
			if (noAdvertise > (yesAdvertise - costToAdvertise)) {
				System.out.println("do not advertise");
			}
			else if (noAdvertise < (yesAdvertise - costToAdvertise)) {
				System.out.println("advertise");
			}
			else {
				System.out.println("does not matter");
			}
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
