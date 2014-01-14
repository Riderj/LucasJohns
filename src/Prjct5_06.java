
public class Prjct5_06 {
	
	public static void main(String[] args) {
		Prjct5_06_Coin coin = new Prjct5_06_Coin();
		coin.lock(0263);

		if(!coin.Locked()) {
			coin.flip();
			System.out.println(coin);
		}else {
			System.out.println("All the methods in the "+coin.getClass().getName()+" class are locked.");
		}
		
		coin.unlock(0263);
		
		if(!coin.Locked()) {
			coin.flip();
			System.out.println("You have fliped a coin, and it landed on "+coin);
		}else {
			System.out.println("All the methods in the "+coin.getClass().getName()+" class are locked.");
		}
	}
}
