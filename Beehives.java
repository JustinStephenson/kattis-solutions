import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beehives {
	
	public static void main(String args[]) {
		FastReader in = new FastReader();
		double distanceToFight = in.nextDouble();
		int numberOfHives = in.nextInt();
		while (distanceToFight != 0.0d && numberOfHives != 0) {
			int sour = 0;
			int sweet = 0;
			Pos[] hivePos = new Pos[numberOfHives];
			//fill array
			for (int i = 0; i < numberOfHives; i++) {
				double x = in.nextDouble();
				double y = in.nextDouble();
				hivePos[i] = new Pos(x, y); 
			}
			//go through array and check positions
			for (int i = 0; i < numberOfHives; i++) {
				boolean toClose = false;
				for (int j = 0; j < numberOfHives; j++) {
					if (i == j) {
						continue;
					}
					if (hivePos[i].DistTo(hivePos[j]) <= distanceToFight) {
						toClose = true;
					}
				}
				if (toClose) {
					sour++;
				}
				else {
					sweet++;
				}
			}
			System.out.println(sour + " sour, " + sweet + " sweet");
			//redo input vars
			distanceToFight = in.nextDouble();
			numberOfHives = in.nextInt();
		}
	}
	
	public static class Pos{
		double x = 0;
		double y = 0;
		public Pos(double x, double y){
			this.x = x;
			this.y = y;
		}
		
		public double DistTo(Pos pos) {
			double dx = Math.abs(x - pos.x);
			double dy = Math.abs(y - pos.y);
			return Math.sqrt((dx * dx) + (dy * dy));
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
