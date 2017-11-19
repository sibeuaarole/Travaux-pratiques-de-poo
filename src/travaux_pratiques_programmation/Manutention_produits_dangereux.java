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
public class Manutention_produits_dangereux extends Employe_manutentionnaire implements Gestion_produits_dangereux {
   //constructeur

public Manutention_produits_dangereux(String nom, String prenom, String matricule, String datecommencement,int age,int nbresdheuresdetravailmensuel) {
    
		super(nom, prenom, matricule, datecommencement,age,nbresdheuresdetravailmensuel);
}

	
@Override
public double calculersalaire() {
		
	
	return 110000 + (getNbresdheuresdetravailmensuel() * 65) + prime_de_risque_mensuel;
		
}		

        
}
 

