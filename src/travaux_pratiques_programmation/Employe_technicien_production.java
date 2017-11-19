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
public class Employe_technicien_production extends Employe {
    
    // attribut de cette classe
    
    protected int nbreunitesproduitesmensuellement;
    
    // constructeur
    
public Employe_technicien_production(String nom,String prenom,String matricule,String datecommencement,int age,int nbreunitesproduitesmensuellement){
    
    
    
    super(nom,prenom,matricule,datecommencement,age);
    
    this.nbreunitesproduitesmensuellement=nbreunitesproduitesmensuellement;
}

//Accesseurs et Modificateurs
	

public double getNbreunitesproduitesmensuellement() {
		return nbreunitesproduitesmensuellement;
}


public void setNbreunitesproduitesmensuellement(int nbreunitesproduitesmensuellement) {
		this.nbreunitesproduitesmensuellement = nbreunitesproduitesmensuellement;
                
}
	
	//Methode pour le calcul du salaire
	
    @Override
    public double calculersalaire() {
		return 110000+ (nbreunitesproduitesmensuellement *  5);
}

    

    
}   


