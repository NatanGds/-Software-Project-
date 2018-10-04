package ListDup;

import javax.swing.JOptionPane;

class Testa_Lista
{
	public static void main (String args[])
	{
		ListaLigada realLista = new ListaLigada();
		int i;
		int num;
		for (i = 1; i<=5; i++)
		{
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um nr ")	);
			realLista.InserirFinal(new Nodo(num));
		}
		realLista.MostrarLista();
		System.exit(0);
	}
}