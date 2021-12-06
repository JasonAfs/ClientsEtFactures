package metier;

import java.time.LocalDate;


public class Facture 
{
	
	private int montantFacture;
	private LocalDate dateFacture;
	private Boolean reglementFacture;
	private Client client;
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Facture (int montant,Client client,boolean reglementFacture) {
		this.client=client;
		montantFacture=montant;
		dateFacture = LocalDate.now();
		this.reglementFacture=reglementFacture;
	}
<<<<<<< HEAD
	public Facture(int montant,Client client) throws Exception {
		this(montant,client,false);
=======
	public Facture(int montant,Client client) {
		this.client=client;
		montantFacture=montant;
		dateFacture = LocalDate.now();
		reglementFacture=false;
>>>>>>> parent of 2300902 (Update Facture.java)
	}
	
	public Client getClient()
	{
		return client ;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montantFacture;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return reglementFacture;
		
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return dateFacture;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		getClient().agetFactures().remove(this);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 * @throws Exception
	 */
	
	public Facture copie()
	{
		//Facture copieFacture = getClient().createFacture(this.getMontant(),this.estReglee());

		return null;
	}
}