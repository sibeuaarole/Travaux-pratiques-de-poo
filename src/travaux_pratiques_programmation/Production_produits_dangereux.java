/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travaux_pratiques_programmation;

/**
 *
 * @author FABIO
 */
public class Production_produits_dangereux extends Employe_technicien_production implements Gestion_produits_dangereux {
    
    //constructeur
    

public Production_produits_dangereux (String nom, String prenom, String matricule, String datecommencement,int age,int nbresunitesproduitesmensuellement){
			 
		super(nom, prenom, matricule, datecommencement,age,nbresunitesproduitesmensuellement);
}
	

public double calculerSalaire() {
            
	
	return 110000 + (getNbreunitesproduitesmensuellement() *  5) + prime_de_risque_mensuel;
        
}

}
