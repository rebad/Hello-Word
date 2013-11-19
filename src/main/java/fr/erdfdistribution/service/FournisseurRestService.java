package fr.erdfdistribution.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import fr.erdfdistribution.model.Fournisseur;

@Path("/fournisseur")
public class FournisseurRestService {
	
	private static Logger logger = Logger.getLogger(FournisseurRestService.class);
	private static Map<String, Fournisseur> data = new HashMap<String, Fournisseur>() {
		{
			Fournisseur f = new Fournisseur();
			f.setCode("a1a1a1a1");
			f.setNom("EDF Energies Nouvelles");
			f.setCodeSLPartenaire("partenaire EDF");
			f.setCodePGI("PGI789416364");
			f.setNumeroTVA("FR5678149");
			f.setPays("France");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC46584015");
			f.setCodeNEBAcheteur("NEBAch5488428");
			f.setId("0");
			put("0", f);
			
			f = new Fournisseur();
			f.setCode("b2b2b2b2");
			f.setNom("GDF-Suez");
			f.setCodePGI("PGI9847351267");
			f.setNumeroTVA("FR2278999");
			f.setPays("France");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC165416015");
			f.setCodeNEBAcheteur("NEBAch181968");
			f.setId("1");
			put("1", f);
			
			f = new Fournisseur();
			f.setCode("c3c3c3c3");
			f.setNom("EON");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("DE3378199");
			f.setPays("Allemagne");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC6874116015");
			f.setCodeNEBAcheteur("NEBAch8744968");
			f.setId("2");
			put("2", f);
			
			f = new Fournisseur();
			f.setCode("d4d4d4d4");
			f.setNom("Iberdrola");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("ES8878129");
			f.setPays("Espagne");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC6846116015");
			f.setCodeNEBAcheteur("NEBAch8782668");
			f.setId("3");
			put("3", f);
			
			f = new Fournisseur();
			f.setCode("c5c5c5c5");
			f.setNom("Electrabel");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("BE5573128");
			f.setPays("Belgique");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC684ezdf54");
			f.setCodeNEBAcheteur("NEBAch465464z");
			f.setId("4");
			put("4", f);
			
			f = new Fournisseur();
			f.setCode("d6d6d6");
			f.setNom("Enel");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("IT6623127");
			f.setPays("Italie");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC684gvergdf54");
			f.setCodeNEBAcheteur("NEBAchtgh764z");
			f.setId("5");
			put("5", f);
			
			f = new Fournisseur();
			f.setCode("e7e7e7");
			f.setNom("Eni");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("IT4512127");
			f.setPays("Italie");
			f.setRole("Fournisseur AP");
			f.setCodeEIC("EIC684gvergfvds4");
			f.setCodeNEBAcheteur("NEBAchtgvre64z");
			f.setId("6");
			put("6", f);
			
			f = new Fournisseur();
			f.setCode("f8f8f8");
			f.setNom("Alterna");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("FR4512521");
			f.setPays("France");
			f.setRole("Distributeur");
			f.setId("7");
			put("7", f);
			
			f = new Fournisseur();
			f.setCode("g9g9g9");
			f.setNom("Sigexy");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("FR2222881");
			f.setPays("France");
			f.setRole("Distributeur");
			f.setId("8");
			put("8", f);
			
			f = new Fournisseur();
			f.setCode("g9g9g9");
			f.setNom("GEG");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("FR1213288");
			f.setPays("France");
			f.setRole("Distributeur");
			f.setId("9");
			put("9", f);
			
			f = new Fournisseur();
			f.setCode("g9g9g9");
			f.setNom("RTE");
			f.setCodeSLPartenaire("partenaire EDF");
			f.setCodePGI("PGI9847efze351267");
			f.setNumeroTVA("FR1213288");
			f.setPays("France");
			f.setRole("Transporteur");
			f.setId("10");
			put("10", f);

		}
	};
	private static int idSequence = 11;
	
	//lister fournisseurs
	@GET
	@Path("/")
	@Produces("application/json")
	public List<Fournisseur> listFournisseur() {
		logger.debug("listFournisseur");
		List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>(data.values());
		return fournisseurs;
		//return Response.status(200).entity(data.toString()).build();
	}

	//récupérer fournisseur by id
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Fournisseur getFournisseur(@PathParam("id") String id) {
		logger.debug("getFournisseur");
		Fournisseur result = null;
		if (id != null && id.length() > 0) {
			result = data.get(id);
		}
		return result;
 
	}
	
	//créer fournisseur
	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	public Fournisseur createFournisseur(Fournisseur fournisseur) {
		logger.debug("createFournisseur");
		int id = idSequence++;
		String result = String.valueOf(id);
		fournisseur.setId(result);
		data.put(result, fournisseur);
		return fournisseur;
 
	}
	
	//supprimer fournisseur
	@DELETE
	@Path("/{id}")
	public Response deleteFournisseur(@PathParam("id") String id) {
		logger.debug("deleteFournisseur");
		data.remove(id);
		return Response.status(200).build();
	}
	
	//mettre à jour fournisseur
	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Fournisseur updateFournisseur(@PathParam("id") String id, Fournisseur fournisseur) {
		logger.debug("updateFournisseur");
		data.put(id, fournisseur);
		return fournisseur;
 
	}
}
