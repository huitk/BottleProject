import java.util.Scanner;
	public class Bottle {	
		
		private int cookies;
		private final int min = 0;
		private final int max = 50;
		
		public void read() {
			Scanner keyboard = new Scanner(System.in);
			this.cookies = Integer.parseInt(keyboard.nextLine());
			if(this.cookies < min) {
				System.out.println("Bottle cannot be negative");
				System.exit(0);
			}
			if(this.cookies > max) {
				System.out.println("Bottle canot exceed maximum");
				System.exit(0);
			}
		}
		
		public void set(int bottleCookies) {
			this.cookies = bottleCookies;
			
		}
		
		public int getCookies() {
			return this.cookies;
		}	
		
		public Bottle add(Bottle b) {
			Bottle bSum = new Bottle();
			bSum.cookies = this.cookies + b.cookies;
			if(bSum.cookies > max) {
				System.out.println("Bottle cannot exceed maximum value");
				System.exit(0);
			}
			return bSum;
		
	
		}
		
		public Bottle add(int x) {
			Bottle bSum = new Bottle();
			bSum.cookies = this.cookies + x;
			if(bSum.cookies > max) {
				System.out.println("Bottle cannot exceed maximum value");
				System.exit(0);
			}
			if(bSum.cookies < min) {
				System.out.println("Bottle cannot be negative");
				System.exit(0);
			}
				
		return bSum;
		}
		
		public Bottle subtract(Bottle b) {
			Bottle bDiff = new Bottle();
			bDiff.cookies = this.cookies - b.cookies;
			if(bDiff.cookies < min) {
				System.out.println("Bottle cannot be less than 0");
				System.exit(0);
			}
			return bDiff;
		}
		
		public Bottle divide(int numBottle) {
			Bottle bDivide = new Bottle();
			bDivide.cookies = this.cookies / numBottle;
			if(bDivide.cookies < min) {
				System.out.println("Bottle cannot be negative");
				System.exit(0);
			}
			
			return bDivide;
		}
			
		public Bottle divide(Bottle b) {
			Bottle bDivide = new Bottle();
			bDivide.cookies = this.cookies / b.cookies;
			
			return bDivide;
		}
		
		public Boolean equals(Bottle b) {
			Boolean isEqual;
			if(this.cookies == b.cookies) {
				isEqual = true;
			}
			else {
				isEqual = false;
			}
		return isEqual;
					
				
		}
		
		public Bottle multiply(Bottle b) {
			Bottle bMul = new Bottle();
			bMul.cookies = this.cookies * b.cookies;
			if(bMul.cookies > max) {
				System.out.println("Bottle cannot exceed maximum value");
				System.exit(0);
			}
		return bMul;	
		}
		
		
			
	
		


	}

		

	
		
		
		
		