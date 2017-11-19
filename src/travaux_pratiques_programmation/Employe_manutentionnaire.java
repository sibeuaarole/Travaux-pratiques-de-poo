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
public class Employe_manutentionnaire extends Employe {
    
    protected int nbresdheuresdetravailmensuel;
    
    // creation d'un constructeur
    
public Employe_manutentionnaire  (String nom, String prenom,  String matricule, String datecommencement,int age, int nbresdheuresdetravailmensuel) {
		super(nom, prenom, matricule, datecommencement,age);
                
		this. nbresdheuresdetravailmensuel = nbresdheuresdetravailmensuel;
		
	}
	
	//Accesseurs et Modificateurs

public double getNbresdheuresdetravailmensuel() {
    
		return nbresdheuresdetravailmensuel;
}

public void setNbresdheuresdetravailmensuel(int nbresdheuresdetravailmensuel) {
		this.nbresdheuresdetravailmensuel = nbresdheuresdetravailmensuel;
}
	
	
    @Override
    public double calculersalaire(){
    
    return(nbresdheuresdetravailmensuel*65)+110000;
}


}
