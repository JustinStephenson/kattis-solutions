import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hitting_the_Targets {
	
	public static void main(String args[]) {
		FastReader in = new FastReader();
		int numberOfTargets = in.nextInt();
		Shape[] shapes = new Shape[numberOfTargets];
		for (int i = 0; i < numberOfTargets; i++) {
			String nextShape = in.next();
			if (nextShape.equals("rectangle")) {
				Point bottomLeft = new Point(in.nextInt(), in.nextInt());
				Point topRight = new Point(in.nextInt(), in.nextInt());
				shapes[i] = new Rectangle(bottomLeft, topRight);
			}
			else {
				Point centre = new Point(in.nextInt(), in.nextInt());
				shapes[i] = new Circle(centre, in.nextInt());
			}
		}
		int numberOfShots = in.nextInt();
		for (int i = 0; i < numberOfShots; i++) {
			Point shot = new Point(in.nextInt(), in.nextInt());
			int totalHits = 0;
			for (int j = 0; j < shapes.length; j++) {
				if (shapes[j].IsInside(shot)) {
					totalHits++;
				}
			}
			System.out.println(totalHits);
		}
	}
	
	private interface Shape {
		boolean IsInside(Point point);
	}
	
	private static class Point {
		private int x;
		private int y;
		
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
	
	private static class Rectangle implements Shape{
		private Point bottomLeft;
		private Point topRight;
		
		public Rectangle(Point bottomLeft, Point topRight) {
			this.bottomLeft = new Point(bottomLeft.x, bottomLeft.y);
			this.topRight = new Point(topRight.x, topRight.y);
		}
		
		public boolean IsInside(Point point) {
			return (point.x >= bottomLeft.x && point.x <= topRight.x && point.y >= bottomLeft.y && point.y <= topRight.y);
		}
	}
	
	private static class Circle implements Shape{
		private Point centre;
		private int radius;
		
		public Circle (Point centre, int r) {
			this.centre = new Point(centre.x, centre.y);
			radius = r;
		}
		
		public boolean IsInside(Point point) {
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
