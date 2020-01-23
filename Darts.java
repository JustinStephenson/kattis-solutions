import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Darts {
	
	public static void main(String args[]) {
		FastReader in = new FastReader();
		//Create dart board
		Circle[] dartBoard = new Circle[10];
		for (int i = 0; i < dartBoard.length; i++) {
			dartBoard[i] = new Circle(new Point(0, 0), (i + 1) * 20); 
		}
		//do the rest
		int numberOfTests = in.nextInt();
		for (int i = 0; i < numberOfTests; i++) {
			int numberOfdarts = in.nextInt();
			int totalPoints = 0;
			for (int j = 0; j < numberOfdarts; j++) {
				int x = in.nextInt();
				int y = in.nextInt();
				Point throwPoint = new Point(x, y);
				int index = 0;
				while (index < dartBoard.length && !dartBoard[index].hit(throwPoint)) {
					index++;
				}
				if (index < dartBoard.length) {
					totalPoints += (11 - (index + 1));
				}
			}
			System.out.println(totalPoints);
		}
	}
	
	private static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public double DistanceTo(Point point) {
			int dx = Math.abs(x - point.x);
			int dy = Math.abs(y - point.y);
			return Math.sqrt(dx * dx + dy * dy);
		}
	}
	
	private static class Circle {
		Point centre;
		int radius;
		public Circle(Point centre, int radius) {
			this.centre = centre;
			this.radius = radius;
		}
		
		public boolean hit(Point point) {
			return (centre.DistanceTo(point) <= radius);
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
