package nega;
import javax.swing.JOptionPane;
public class CincoN�meros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro n�mero: "));
		Double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo n�mero: "));
		Double C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro n�mero: "));
		Double D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quarto n�mero: "));
		Double E = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quinto n�mero: "));
		
		
		
		if (A>B && A>C && A>D && A>E && B<A && B<C && B<D && B<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+A+ " O menor valor � "+B);
		}
		
		if (A>B && A>C && A>D && A>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+A+ " O menor valor � "+C);
		}
		
		if (A>B && A>C && A>D && A>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+A+ " O menor valor � "+D);
		}
		
		if (A>B && A>C && A>D && A>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+A+ " O menor valor � "+E);
		}
		
		
		
		//S� A PARTE DA VARIAVEL A//
		
		
		
		if (B>A && B>C && B>D && B>E && A<C && A<B && A<D && A<E) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+B+ " O menor valor � "+ A);
			
		}
		
		if (B>A && B>C && B>D && B>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+B+ " O menor valor � "+C);
		}
		
		if (B>A && B>C && B>D && B>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+B+ " O menor valor � "+D);
		}
		
		if (B>A && B>C && B>D && B>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+B+ " O menor valor � "+E);
		}
		
		//S� A PARTE DA VARI�VEL B
		
		
		
		
		
		
		if (C>B && C>A && C>D && C>E && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+C+ " O menor valor � "+A);
		}
		if (C>B && C>A && C>D && C>E && B<A && B<C && B<D && B<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+C+ " O menor valor � "+B);
		}
		
		if (C>B && C>A && C>D && C>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+C+ " O menor valor � "+D);
		}
		
		if (C>B && C>A && C>D && C>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+C+ " O menor valor � "+E);
		}
		
		
		//S� VARI�VEL C
		
		
		
		
		
		
		
		if (D>B && D>C && D>A && D>E && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+D+ " O menor valor � "+A);
		}
		
		if (D>B && D>C && D>A && D>E && B<A && B<C && B<D && B<E) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+D+ " O menor valor � "+B);
		}
		
		if (D>B && D>C && D>A && D>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+D+ " O menor valor � "+C);
		}
		
		if (D>B && D>C && D>A && D>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+D+ " O menor valor � "+E);
		}
		
		
		
		//S� VARI�VEL D
		
		
		
		if (E>B && E>C && E>D && E>A && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor � "+E+ " O menor valor � "+ A);
			
		}
			
		if (E>B && E>C && E>D && E>A && B<A && B<C && B<D && B<E) {
				JOptionPane.showMessageDialog(null, "O maior valor � "+E+ " O menor valor � "+ B);
				
			}
			
			
		if (E>B && E>C && E>D && E>A && C<A && C<B && C<D && C<E ) {
				JOptionPane.showMessageDialog(null, "O maior valor � "+E+ " O menor valor � "+C);
			}
			
			
		if (E>B && E>C && E>D && E>A && D<A && D<C && D<B && D<E ) {
				JOptionPane.showMessageDialog(null, "O maior valor � "+E+ " O menor valor � "+D);
			}
		}
		
		
		//S� VARI�VEL E

		}

