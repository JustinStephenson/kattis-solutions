import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Incognito {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			int numberOfGear = in.nextInt();
			HashMap<String, Integer> gear = new HashMap<String, Integer>();
			for (int j = 0; j < numberOfGear; j++) {
				in.next();
				String item = in.next();
				if (gear.containsKey(item)) {
					int temp = gear.get(item);
					gear.put(item, ++temp);
				}
				else {
					gear.put(item, 1);
				}
			}
			int result = 1;
			for (Integer j : gear.values()) {
				result = (result * (j + 1));
			}
			System.out.println(result - 1);
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
