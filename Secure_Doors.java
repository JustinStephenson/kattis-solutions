import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Secure_Doors {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		HashMap<String, Boolean> tracker = new HashMap<String, Boolean>();
		int inputTotal = in.nextInt();
		while (inputTotal-- > 0) {
			String entryOrExit = in.next();
			String name = in.next();
			if (!tracker.containsKey(name)) {
				tracker.put(name, false);
			}
			if (entryOrExit.equals("entry")) {
				if (!tracker.get(name)) {
					tracker.put(name, true);
					System.out.println(name + " entered");
				}
				else {
					System.out.println(name + " entered (ANOMALY)");
				}
			}
			else {
				if (tracker.get(name)) {
					tracker.put(name, false);
					System.out.println(name + " exited");
				}
				else {
					System.out.println(name + " exited (ANOMALY)");
				}
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
