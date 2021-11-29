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
	public Facture(int montant,Client client) {
		this.client=client;
		montantFacture=montant;
		dateFacture = LocalDate.now();
		reglementFacture=false;
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
	 */
	
	public Facture copie()
	{
		Facture copieFacture = new Facture(this.getMontant(), this.getClient(),this.estReglee());
		return copieFacture;
	}
}