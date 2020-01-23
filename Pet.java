import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pet {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int maxTotal = 0;
		int winnerIndex = 0;
		for (int i = 0; i < 5; i++) {
			int total = 0;
			for (int j = 0; j < 4; j++) {
				total += in.nextInt();
			}
			if (maxTotal < total) {
				maxTotal = total;
				winnerIndex = i + 1;
			}
		}
		System.out.println(winnerIndex + " " + maxTotal);
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
