
public abstract class GameCalculator {
	public abstract void hesapla(); // B�t�n durumlar birbirinden farkl�ysa abstract 
									//kullanmak en mant�kl�s�, abstract s�n�flar newlenemez g�zel bir y�ntem de�il

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
