
public abstract class GameCalculator {
	public abstract void hesapla(); // Bütün durumlar birbirinden farklýysa abstract 
									//kullanmak en mantýklýsý, abstract sýnýflar newlenemez güzel bir yöntem deðil

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
