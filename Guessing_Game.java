import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Guessing_Game {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int guess = 1;
		while (guess != 0) {
			guess = in.nextInt();
			if (guess == 0) {
				break;
			}
			String response = in.nextLine();
			int minNum = 0;
			int maxNum = 11;
			boolean honest = true;
			while (!response.equals("right on")) {
				if (response.equals("too high")) {
					if (guess < maxNum) {
						maxNum = guess;
					}
				}
				else if (response.equals("too low")){
					if (guess > minNum) {
						minNum = guess;
					}
				}
				guess = in.nextInt();
				response = in.nextLine();
			}
			if (guess <= minNum || guess >= maxNum || !honest) {
				System.out.println("Stan is dishonest");
			}
			else {
				System.out.println("Stan may be honest");
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
