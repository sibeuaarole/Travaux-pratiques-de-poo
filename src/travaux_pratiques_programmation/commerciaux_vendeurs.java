/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travaux_pratiques_programmation;


public class commerciaux_vendeurs extends Service_commercial{
    
            //Constructeur de cette classe
    
public commerciaux_vendeurs (String nom, String prenom, String matricule, String datecommencement,int age, double chiffredaffairemensuel) {
		super(nom, prenom, matricule, datecommencement,age, chiffredaffairemensuel);
		
}
	
	
@Override
public double calculersalaire() {
    
		
                return 110000 + (getChiffredaffairemensuel() * 0.2) + 100;
}
	
	
	
	

}

  	


