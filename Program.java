

public class Program {
	public static void main(String[] args) {
		//Code to test your stapler.  Do not edit.
		Stapler redStapler = new Stapler(), blueStapler = new Stapler(),
				whiteStapler = new Stapler();System.out.println(redStapler.getStaples() == 0 ? ":) New stapler is empty." : ":( New stapler should be empty.");
				System.out.println(redStapler.staple() == false ? ":) Empty stapler can't staple." : ":( Empty stapler shouldn't staple.");  redStapler.open(); 
				redStapler.loadStaples(1);  System.out.println(redStapler.staple() == false ? ":) Open stapler can't staple." : ":( Open stapler shouldn't staple."); 
				redStapler.close();  redStapler.open();  redStapler.loadStaples(-50);	redStapler.close(); 
				System.out.println(redStapler.getStaples() == 1 ? ":) loadStaples() ignores negative staples." : ":( loadStaples() should ignore negative staples."); 
				blueStapler.open();  blueStapler.loadStaples(525);  blueStapler.close();  whiteStapler.open();  whiteStapler.loadStaples(251);  whiteStapler.loadStaples(251); 
				whiteStapler.close();  System.out.println(blueStapler.getStaples() == 500 
						&& whiteStapler.getStaples() == 500 ? ":) Stapler honors 500 staple capacity." : ":( Stapler may hold no more than 500 staples"); 
				while(blueStapler.staple());  blueStapler.open();  blueStapler.loadStaples(1);  blueStapler.close(); boolean then, now;
				then = blueStapler.staple(); now = blueStapler.staple(); System.out.println(then == true && now == false && 
						blueStapler.getStaples() == 0 ? ":) Staplers with staples return true.  Empty ones return false." : ":( Staplers with staples return true. "
								+ " Empty ones return false.");		
		System.out.println("Thanks for using the Stapler tester :)");
	}
}

class Stapler{
	//Data
	int staples;
	boolean isOpen;
	
	//Methods (Behaviors)
	public Stapler(){
		staples = 0;
		isOpen = false;
	}
	
	public void loadStaples(int s){
		//Update staples variable to be s more, but no more than 500 total.
		if (s > 0) {
			staples = staples + s;
			if (staples > 500) {
				if (staples > 500) {
					staples = 500;	
				}
			}
		}
		//If s is not positive, ignore the value
		
		
	}
	
	public boolean staple(){
		//1.  If the stapler is closed and not out of staples, staple!
		//2.  Reduce the number of staples by 1 & return true.
		
		if ( isOpen == false && staples > 0 ) {
			while (staples > 0) {
				staples = staples - 1;
			}
			return true;
		}
			
		
		
		
		//If there was a problem stapling (not closed, out of staples) return false;
			 
		return false;
			 
	}
	
	public void open(){
		//Open the stapler
		isOpen = true;
	}
	
	public void close(){
		//Close the stapler;
		isOpen = false;
	}
	
	public int getStaples(){
		return staples;
	}
	
	public boolean isClosed(){
		return !isOpen;
	}
}
