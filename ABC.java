import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ABC {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int[] numbers = new int[3];
		//add input to array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		Arrays.sort(numbers);
		String[] input = in.nextLine().split("");
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {
			case "A":
				output.append(numbers[0] + " ");
				break;
			case "B":
				output.append(numbers[1] + " ");
				break;
			case "C":
				output.append(numbers[2] + " ");
				break;
			}
		}
		System.out.println(output);
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
