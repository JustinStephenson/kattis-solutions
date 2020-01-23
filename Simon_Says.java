import java.util.Scanner;

public class Simon_Says {

	public static void main(String[] args)throws Exception{
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
           int n=sc.nextInt();sc.nextLine();
           for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(s.length()>11&& s.substring(0,11).equals("simon says ")){
                s=s.substring(11);
            }else{s="";}
            System.out.println(s);
           }
        }
    }
}