
public class ContoCorrente {

	private double saldo;
	private int numeroConto;
	private static int ultimoNumeroConto=1000;
		
	public ContoCorrente(double saldo) {
		this.saldo=saldo;	    			
		numeroConto=ultimoNumeroConto;
		ultimoNumeroConto++;
		
	}
	
	public void versa(double somma) {
		saldo+=somma;
		System.out.println("Sono stati versati "+ somma+" euro");
	}
	
	public boolean preleva(double somma) {
		if(saldo<somma) {
			System.out.println("Prelievo fallito");
			System.out.println("importo maggiore della disponibilità");
			return false;
		}else {
			saldo-=somma;{
			System.out.println("Sono stati prelevati "+somma+" euro");
			return false;
			}
		}
	}	
		public double ottieniSaldo() {
			return saldo;
		}

		public int ottieniNumeroConto() {
			return numeroConto;
		}
		
}
