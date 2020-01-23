import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Card_Trick {

	public static void main(String args[]) {
		FastReader in = new FastReader();
		int testCases = in.nextInt();
		Deck myDeck = new Deck();
		for (int i = 0; i < testCases; i++) {
			int numberOfCards = in.nextInt();
			for (int j = numberOfCards; j > 0; j--) {
				myDeck.add(j);
				myDeck.shuffle(j);
			}
			myDeck.print();
			myDeck.clear();
		}
	}
	
	private static class Deck {
		LinkedList<Integer> deck;
		Deck() {
			deck = new LinkedList<Integer>();
		}
		public void add(int num) {
			deck.addFirst(num);
		}
		public void shuffle(int amount) {
			for (int i = 0; i < amount; i++) {
				int temp = deck.removeLast();
				deck.addFirst(temp);
			}
		}
		public void clear() {
			deck.clear();
		}
		public void print() {
			StringBuilder result = new StringBuilder();
			for (Integer i : deck) {
				result.append(i + " ");
			}
			result.replace(result.length() - 1, result.length(), "");
			System.out.println(result);
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
