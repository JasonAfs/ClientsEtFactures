package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	private String nomClient;
	private Facture uneFacture;
	private ArrayList<Facture> factures=new ArrayList<>();
	private static ArrayList<Client> clients = new ArrayList<>();
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		nomClient = nom;
		
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return nomClient;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		nomClient=nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	
	public Facture createFacture(int montant,boolean reglementFacture)
	{
		Facture myFacture  = new Facture(montant,this,reglementFacture);
		factures.add(myFacture);
		clients.add(this);
		return myFacture;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		ArrayList<Facture> lesFactures = new ArrayList<Facture>();
		for(int i =0;i<factures.size();i++)
		{
			lesFactures.add(factures.get(i));
		}
		return lesFactures;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		return 0;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture myFacture  = new Facture(montant,this,false);
		factures.add(myFacture);
		clients.add(this);
		return createFacture(montant, false);
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		return null;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		ArrayList<Client> lesClients = new ArrayList<>();
		for(int i =0;i<clients.size();i++)
		{
			lesClients.add(clients.get(i));
		}
		return lesClients;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
	}
}
