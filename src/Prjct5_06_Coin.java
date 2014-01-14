
public class Prjct5_06_Coin implements Prjct5_06_Lockable{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	private boolean isLocked = false;
	private int key;
	
	public Prjct5_06_Coin() {
		setLock(0263);
	}
	
	public void flip() {
		if(!isLocked) {
			face = (int) (Math.random() *2);
		}
	}
	
	public boolean isHeads() {
		if(!isLocked) {
			return (face == HEADS);
		}
		return false;
	}
	
	public String toString() {
		String faceName;
		if (face == HEADS) {
			faceName = "Heads";
		}else {
			faceName = "Tails";
		}
		return faceName;
	}

	
	public boolean Locked() {
		return isLocked;
	}

	
	public void setLock(int key) {
		this.key = key;
	}

	
	public void lock(int key) {
		if(key == this.key) {
			isLocked = true;
		}
	}

	
	public void unlock(int key) {
		if(key == this.key) {
			isLocked = false;
		}
	}
}
