import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Unlock_Pattern {
	
	public static void main(String args[]) {
		FastReader in = new FastReader();
		Cell[] cells = new Cell[9];
		double totalDist = 0;
		
		int fill = 0;
		//create and fill Cell objects.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cells[fill++] = new Cell(i, j, in.nextInt());
			}
		}
		Arrays.sort(cells);
		for (int i = 0; i < cells.length - 1; i++) {
			totalDist += findDistance(cells[i], cells[i+1]);
		}
		System.out.println(totalDist);
	}
	
	public static double findDistance(Cell a, Cell b) {
		double dx = Math.abs(a.x - b.x);
		double dy = Math.abs(a.y - b.y);
		return Math.sqrt((dx * dx) + (dy * dy));
	}

	private static class Cell implements Comparable<Cell>{
		int x;
		int y;
		int pos;
		
		public Cell(int x, int y, int pos) {
			this.x = x;
			this.y = y;
			this.pos = pos;
		}

		@Override
		public int compareTo(Cell cell) {
			if (pos > cell.pos)
				return 1;
			if (pos < cell.pos)
				return -1;
			return 0;
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
