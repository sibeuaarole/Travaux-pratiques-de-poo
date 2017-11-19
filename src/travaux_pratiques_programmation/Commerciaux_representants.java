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
public class Commerciaux_representants extends Service_commercial {
    
    //creation d'un constructeur pour cette classe

public Commerciaux_representants(String nom,String prenom,String matricule,String datecommencement,int age,double chiffredaffairemensuel){
    
    super(nom,prenom,matricule,datecommencement,age,chiffredaffairemensuel);
     
    }

    // creation d'une methode permettant de calculer le salaire

@Override
public double calculersalaire(){
    
    return 0.2*(getChiffredaffairemensuel())+200+110000;
}

}
