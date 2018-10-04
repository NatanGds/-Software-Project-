package ListDup;

import javax.swing.*;
class Nodo
{
	int elemento;
	Nodo prox;
	Nodo (int elem){
		elemento = elem;
		prox = null;
	}
 }
class ListaLigada
{
	Nodo primeiro, ultimo;
	ListaLigada ()
	{
		primeiro = null;
		ultimo = null;
	}
	public boolean ListaVazia()
	{
		if (primeiro == null && ultimo == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void InserirInicio(Nodo novoNo)
	{
		if (ListaVazia())
		{
			ultimo = novoNo;
		}
		else
		{
			novoNo.prox = primeiro;
		}
		primeiro = novoNo;
	}
	public void InserirFinal(Nodo novoNo)
	{
		if (ListaVazia())
		{
			primeiro = novoNo;
		}
		else
		{
			ultimo.prox = novoNo;
		}
		ultimo = novoNo;
	}
	public int ContarNos()
	{
		int tamanho = 0;
		Nodo NoTemp = primeiro;
		while (NoTemp !=null)
		{
			tamanho = tamanho+1;
			NoTemp = NoTemp.prox;
		}
		return tamanho;
	}
	public void InserirMeio(Nodo NovoNo, int posicao)
	{
		Nodo NoTemp = primeiro;
		int NroNos, posAux = 1;
		NroNos = ContarNos();
		if(posicao <= 1)
		{
			InserirInicio(NovoNo);
		}
		else
		{
			if (posicao > NroNos)
			{
				InserirFinal(NovoNo);
			}
			else
			{
				while (posAux < (posicao -1))
				{
					NoTemp = NoTemp.prox;
					posAux = posAux + 1;
				}
				NovoNo.prox = NoTemp.prox;
				NoTemp.prox = NovoNo;
			}
		}
	}
	public void Remover(int elemento)
	{
		Nodo NoTemp = primeiro;
		Nodo NoAnt = null;
		if (primeiro.elemento == elemento)
		{
			primeiro = primeiro.prox;
		}
		else
		{
			while (NoTemp !=null && NoTemp.elemento != elemento)
			{
				NoAnt = NoTemp;
				NoTemp = NoTemp.prox;
			}
			if(NoTemp != null)
			{
				NoAnt.prox = NoTemp.prox;
			}
			if(NoTemp == ultimo)
			{
				ultimo = NoAnt;
			}
		}
	}
	public void ElementoInicio()
	{
		if(!ListaVazia())
		{
			System.out.println("O primeiro elemento  "+primeiro.elemento);
		}
		else
		{
			System.out.println("Lista ligada vazia");
		}
	}
	public void ElementoFinal()
	{
		if(!ListaVazia())
		{
			System.out.println("O ltimo elemento  "+ultimo.elemento);
		}
		else
		{
			System.out.println("Lista ligada vazia");
		}
	}
	public Nodo BuscarNo (int elemento)
	{
		int i = 1;
		Nodo NoTemp = primeiro;
		while (NoTemp !=null)
		{
			if(NoTemp.elemento == elemento)
			{
				System.out.println("No "+ NoTemp.elemento + " posicao " +i);
				return NoTemp;
			}
			i = i +1;
			NoTemp = NoTemp.prox;
		}
		return null;
	}
	public void MostrarLista()
	{
		int i = 1;
		Nodo NoTemp = primeiro;
		while (NoTemp !=null)
		{
			System.out.println("Elemento " + NoTemp.elemento + " posicao " +i );
			NoTemp = NoTemp.prox;
			i = i +1;
		}
	}
}