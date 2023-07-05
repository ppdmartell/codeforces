import java.io.Console;

public class Team {
	public static void main(String[] args) {
		Console cs = System.console();
		int count = Integer.valueOf(cs.readLine());
		int amount = 0;
		while(count > 0) {
			if(cs.readLine().replace(" ","").matches(".*1.*1.*")) amount++;
			count--;
		}
		System.out.println(amount);
	}
}
