import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Popular_Vote {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int numberOfCases = in.nextInt();
		while (numberOfCases-- > 0) {
			int numberOfCandidates = in.nextInt();
			int totalVotes = 0;
			int highestNum = 0;
			int candidate = 0;
			boolean winner = false;
			StringBuilder st = new StringBuilder();
			for (int i = 0; i < numberOfCandidates; i++) {
				int num = in.nextInt();
				totalVotes += num;
				if (highestNum < num) {
					highestNum = num;
					candidate = i;
					winner = true;
				}
				else if (highestNum == num) {
					winner = false;
				}
			}
			if (winner) {
				if (highestNum > totalVotes / 2) {
					st.append("majority");
				}
				else {
					st.append("minority");
				}
				st.append(" winner " + (candidate + 1));
			}
			else {
				st.append("no winner");
			}
			System.out.println(st);
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
