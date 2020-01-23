import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Hangman {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		String[] word = in.nextLine().split("");
		HashSet<String> wordSet = new HashSet<String>();
		String[] alphabet = in.nextLine().split("");
		//add words to word set
		for (int i = 0; i < word.length; i++) {
			wordSet.add(word[i]);
		}
		int count = 0;
		//check if guessed letters are in the word
		for (int i = 0; i < alphabet.length && count < 10; i++) {
			if (wordSet.isEmpty()) {
				break;
			}
			if (wordSet.contains(alphabet[i])) {
				wordSet.remove(alphabet[i]);
			}
			else {
				count++;
			}
		}
		//check count and output
		if (count >= 10) {
			System.out.println("LOSE");
		}
		else {
			System.out.println("WIN");
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
