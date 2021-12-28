
public class UsaConto {

	public static void main(String[] args) {
		ContoCorrente conto1 = new ContoCorrente(100);
		ContoCorrente conto2 = new ContoCorrente(200);
		ContoCorrente conto3 = new ContoCorrente(1000);
		
		System.out.println("Saldo conto numero "+conto1.ottieniNumeroConto()+" euro "+conto1.ottieniSaldo());
		System.out.println("Saldo conto numero "+conto2.ottieniNumeroConto()+" euro "+conto2.ottieniSaldo());
		System.out.println("Saldo conto numero "+conto3.ottieniNumeroConto()+" euro "+conto3.ottieniSaldo());
		
		System.out.println("Prelevo dal conto numero "+conto1.ottieniNumeroConto()+" 50 €");
		conto1.preleva(50);
		
		System.out.println("Prelevo dal conto numeri "+conto2.ottieniNumeroConto()+" 100 €");
		conto2.preleva(100);
		
		System.out.println("Saldo conto numero "+conto1.ottieniNumeroConto()+" euro "+conto1.ottieniSaldo());
		System.out.println("Saldo conto numero "+conto2.ottieniNumeroConto() +"euro "+conto2.ottieniSaldo());
		
		System.out.println("Prelevo dal conto numero "+conto1.ottieniNumeroConto()+" 100 €");
		conto1.preleva(100);
		
		System.out.println("Ciao");
		System.out.println("Ciao");
		

	}

}
