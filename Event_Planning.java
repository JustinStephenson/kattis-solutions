import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Event_Planning {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int numberOfParticipants = in.nextInt();
		int budget = in.nextInt();
		int numberOfHotels = in.nextInt();
		int numberOfWeeks = in.nextInt();
		int maxCost = budget;
		for (int i = 0; i < numberOfHotels; i++) {
			int price = in.nextInt();
			for (int j = 0; j < numberOfWeeks; j++) {
				int weekNum = in.nextInt();
				int cost = 0;
				if (numberOfParticipants < weekNum) {
					cost = price * numberOfParticipants;
				}
				else {
				 cost = price * weekNum;
				}
				if (weekNum >= numberOfParticipants) {
					if (cost < maxCost) {
						maxCost = cost;
					}
				}
			}
		}
		if (maxCost < budget) {
			System.out.println(maxCost);
		}
		else {
			System.out.println("stay home");
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
