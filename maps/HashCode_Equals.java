package maps;

public class HashCode_Equals {

	public static void main(String[] args) {

		
		Pen pen1 = new Pen("blue",10);
		Pen pen2 = new Pen("blue",10);
//		
//		System.out.println(pen1 == pen2);
		System.out.println(pen1.equals(pen2));
		System.out.println(pen1 == pen2);
		
		
			
		
	}
	
	
}

	class Pen{
		
		int price;
		String colour;
		
		public Pen(String colour, int price) {
			
			this.colour = colour;
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((colour == null) ? 0 : colour.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pen other = (Pen) obj;
			if (colour == null) {
				if (other.colour != null)
					return false;
			} else if (!colour.equals(other.colour))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
		
//		@Override		
//		public boolean equals(Object o) {
//			Pen pen = (Pen)o;
//			if(this.colour.equals(pen.colour) && this.price == pen.price) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		
//		@Override
//		public int hashCode() {
//			return price + colour.hashCode();
//		}
		
		
	}

