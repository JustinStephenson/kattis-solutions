import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Candle_Box {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int ageGap = in.nextInt() - 1;
		int candlesInR = in.nextInt();
		int totalCandles = candlesInR + in.nextInt();
		int ageR = 4;
		int ageT = 3;
		int totalCandlesThrown = 0;
		int totalTheoritcalCandlesR = 0;
		while (totalCandlesThrown != totalCandles) {
			totalTheoritcalCandlesR += ageR;
			if (ageGap != 0) {
				totalCandlesThrown += ageR++;
				ageGap--;
			}
			else {
				totalCandlesThrown += ageR++;
				totalCandlesThrown += ageT++;
			}
		}
		System.out.println(candlesInR - totalTheoritcalCandlesR);
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
