package fr.erdfdistribution.model;

public class Fournisseur {
	
	private String id;
	
	/**
	 * obligatoire
	 */
	private String code;
	
	/**
	 * pas obligatoire, égal au code si vide
	 */
	private String nom;
	
	/**
	 * obligatoire si filiale du groupe EDF
	 */
	private String codeSLPartenaire;
	
	/**
	 * obligatoire
	 */
	private String codePGI;
	
	/**
	 * 9 chiffres, obligatoire
	 */
	private String numeroTVA;
	
	/**
	 * obligatoire
	 */
	private String pays;
	
	private String regimeTVAAcheteur;
	
	private String regimeTVAVendeur;
	
	/**
	 * Fournisseur AP, Distributeur, Transporteur, Autres contreparties
	 */
	private String role;
	
	/**
	 * si role = fournisseur ap, obligatoire, sinon n'existe pas
	 */
	private String codeEIC;
	
	/**
	 * si role = fournisseur ap, obligatoire, sinon n'existe pas
	 */
	private String codeNEBAcheteur;
	
	/**
	 * si role = fournisseur ap, sinon n'existe pas
	 */
	private String codeNEBVendeur;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeSLPartenaire() {
		return codeSLPartenaire;
	}

	public void setCodeSLPartenaire(String codeSLPartenaire) {
		this.codeSLPartenaire = codeSLPartenaire;
	}

	public String getCodePGI() {
		return codePGI;
	}

	public void setCodePGI(String codePGI) {
		this.codePGI = codePGI;
	}

	public String getNumeroTVA() {
		return numeroTVA;
	}

	public void setNumeroTVA(String numeroTVA) {
		this.numeroTVA = numeroTVA;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getRegimeTVAAcheteur() {
		return regimeTVAAcheteur;
	}

	public void setRegimeTVAAcheteur(String regimeTVAAcheteur) {
		this.regimeTVAAcheteur = regimeTVAAcheteur;
	}

	public String getRegimeTVAVendeur() {
		return regimeTVAVendeur;
	}

	public void setRegimeTVAVendeur(String regimeTVAVendeur) {
		this.regimeTVAVendeur = regimeTVAVendeur;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCodeEIC() {
		return codeEIC;
	}

	public void setCodeEIC(String codeEIC) {
		this.codeEIC = codeEIC;
	}

	public String getCodeNEBAcheteur() {
		return codeNEBAcheteur;
	}

	public void setCodeNEBAcheteur(String codeNEBAcheteur) {
		this.codeNEBAcheteur = codeNEBAcheteur;
	}

	public String getCodeNEBVendeur() {
		return codeNEBVendeur;
	}

	public void setCodeNEBVendeur(String codeNEBVendeur) {
		this.codeNEBVendeur = codeNEBVendeur;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
