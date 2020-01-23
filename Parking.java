import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Parking {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int numberOfTests = in.nextInt();
		while (numberOfTests-- > 0) {
			int[] stores = new int[in.nextInt()];
			for (int i = 0; i < stores.length; i++) {
				stores[i] += in.nextInt(); 
			}
			Arrays.sort(stores);
			int totalDist = 0;
			for (int i = 0; i < stores.length - 1; i++) {
				totalDist += Math.abs(stores[i] - stores[i+1]);
			}
			totalDist += Math.abs(stores[0] - stores[stores.length - 1]);
			System.out.println(totalDist);
		}
	}
	
	static class FastReader { 
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
