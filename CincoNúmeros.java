package nega;
import javax.swing.JOptionPane;
public class CincoNúmeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
		Double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
		Double C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro número: "));
		Double D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quarto número: "));
		Double E = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quinto número: "));
		
		
		
		if (A>B && A>C && A>D && A>E && B<A && B<C && B<D && B<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+A+ " O menor valor é "+B);
		}
		
		if (A>B && A>C && A>D && A>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+A+ " O menor valor é "+C);
		}
		
		if (A>B && A>C && A>D && A>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+A+ " O menor valor é "+D);
		}
		
		if (A>B && A>C && A>D && A>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+A+ " O menor valor é "+E);
		}
		
		
		
		//SÓ A PARTE DA VARIAVEL A//
		
		
		
		if (B>A && B>C && B>D && B>E && A<C && A<B && A<D && A<E) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+B+ " O menor valor é "+ A);
			
		}
		
		if (B>A && B>C && B>D && B>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+B+ " O menor valor é "+C);
		}
		
		if (B>A && B>C && B>D && B>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+B+ " O menor valor é "+D);
		}
		
		if (B>A && B>C && B>D && B>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+B+ " O menor valor é "+E);
		}
		
		//SÓ A PARTE DA VARIÁVEL B
		
		
		
		
		
		
		if (C>B && C>A && C>D && C>E && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+C+ " O menor valor é "+A);
		}
		if (C>B && C>A && C>D && C>E && B<A && B<C && B<D && B<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+C+ " O menor valor é "+B);
		}
		
		if (C>B && C>A && C>D && C>E && D<A && D<C && D<B && D<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+C+ " O menor valor é "+D);
		}
		
		if (C>B && C>A && C>D && C>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+C+ " O menor valor é "+E);
		}
		
		
		//SÓ VARIÁVEL C
		
		
		
		
		
		
		
		if (D>B && D>C && D>A && D>E && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+D+ " O menor valor é "+A);
		}
		
		if (D>B && D>C && D>A && D>E && B<A && B<C && B<D && B<E) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+D+ " O menor valor é "+B);
		}
		
		if (D>B && D>C && D>A && D>E && C<A && C<B && C<D && C<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+D+ " O menor valor é "+C);
		}
		
		if (D>B && D>C && D>A && D>E && E<A && E<C && E<D && E<B ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+D+ " O menor valor é "+E);
		}
		
		
		
		//SÓ VARIÁVEL D
		
		
		
		if (E>B && E>C && E>D && E>A && A<C && A<B && A<D && A<E ) {
			JOptionPane.showMessageDialog(null, "O maior valor é "+E+ " O menor valor é "+ A);
			
		}
			
		if (E>B && E>C && E>D && E>A && B<A && B<C && B<D && B<E) {
				JOptionPane.showMessageDialog(null, "O maior valor é "+E+ " O menor valor é "+ B);
				
			}
			
			
		if (E>B && E>C && E>D && E>A && C<A && C<B && C<D && C<E ) {
				JOptionPane.showMessageDialog(null, "O maior valor é "+E+ " O menor valor é "+C);
			}
			
			
		if (E>B && E>C && E>D && E>A && D<A && D<C && D<B && D<E ) {
				JOptionPane.showMessageDialog(null, "O maior valor é "+E+ " O menor valor é "+D);
			}
		}
		
		
		//SÓ VARIÁVEL E

		}

