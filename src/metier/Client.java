package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	private String nomClient;
	private Facture uneFacture;
	private List<Facture> factures=new ArrayList<>();
	private static List<Client> clients = new ArrayList<>();
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		nomClient = nom;
		clients.add(this.Client);
		
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
		return myFacture;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		List<Facture> lesFactures = new ArrayList<Facture>();
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
		return myFacture;
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
		List<Client> lesClients = new ArrayList<>();
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
