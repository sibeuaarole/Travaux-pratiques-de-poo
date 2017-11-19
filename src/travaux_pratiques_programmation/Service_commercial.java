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
public abstract class Service_commercial extends Employe {
    
   
	//Attribut de cette classe
    
	protected double chiffredaffairemensuel;

	
	//Constructeur de cette classe
        
public Service_commercial (String nom, String prenom, String matricule, String datecommencement,int age, double chiffredaffairemensuel) {
		super(nom, prenom, matricule, datecommencement,age);
		this.chiffredaffairemensuel = chiffredaffairemensuel;
}
	
	//Accesseurs et Modificateurs
        
public double getChiffredaffairemensuel() {
		return chiffredaffairemensuel;
}


public void setChiffredaffairemensuel(double chiffredaffairemensuel) {
		this.chiffredaffairemensuel = chiffredaffairemensuel;
}

	

        
        

    


	
}	