
public class ProductValidator {

	static {
		System.out.println("Static yap?c? blok ?al??t?.");
	}

	public ProductValidator() {
		System.out.println("Yap?c? blok new lenmeden ?al??maz.");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void another() {

	}

//	public static class Baska {
//		public static void sil() {
//			
//		}
//	}
}
