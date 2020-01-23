import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Eight_Queens {
	
	public static void main(String args[]) {
		FastReader in = new FastReader();
		int[] queenPos = new int[8];
		int queenCount = 0;
		boolean[] vaild = {true, true, true};
		ArrayList<String> allInputStrings = new ArrayList<String>();
		for (int i = 0; i < 8; i++) {
			String inputString = in.nextLine();
			String[] arrayString = inputString.split("");
			for (int j = 0; j < arrayString.length; j++) {
				allInputStrings.add(arrayString[j]);
			}
		}
		
		//fill array with input.
		for (int i = 0; i < 64; i++) {
			if (allInputStrings.get(i).equals("*")) {
				queenPos[queenCount] = i;
				queenCount++;
			}
		}
		
		int hori = 0;
		//see if queens hit each other
		for (int i = 0; i < 8; i++) {
			//horizontal
			if (queenPos[i] < hori || queenPos[i] > (hori + 7)) {
				vaild[0] = false;
			}
			hori += 8;
			//vertical
			int pos = queenPos[i];
			for (int j = i + 1; j < 8; j++) {
				pos += 8;
				if (pos == queenPos[j]) {
					vaild[1] = false;
				}
			}
			//diagonal
			int rightDia = queenPos[i];
			int leftDia = queenPos[i];
			boolean rightOn = true;
			boolean leftOn = true;
			int[] leftEdge = {0, 8, 16, 24, 32, 40, 48, 56};
			int[] rightEdge = {7, 15, 23, 31, 39, 47, 55, 63};
			if (rightDia == rightEdge[i]) {
				rightOn = false;
			}
			if (leftDia == leftEdge[i]) {
				leftOn = false;
			}
			for (int j = i + 1; j < 8; j++) {
				rightDia += 9;
				leftDia += 7;
				if (rightDia == queenPos[j] && rightOn) {
					vaild[2] = false;
				}
				if (rightDia == rightEdge[j]) {
					rightOn = false;
				}
				if (leftDia == queenPos[j] && leftOn) {
					vaild[2] = false;
				}
				if (leftDia == leftEdge[j]) {
					leftOn = false;
				}
			}
		}
		
		//check the booleans
		boolean output = true;
		for (int i = 0; i < vaild.length; i++) {
			if (!vaild[i]) {
				output = false;
				//System.out.println(i);
			}
		}
		
		//output result
		if (output) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
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
