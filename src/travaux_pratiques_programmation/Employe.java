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
public abstract class Employe {
    
    // creation des attributs de cette classe 
    
    private String nom;
    private String prenom;
    private String matricule;
    private String datecommencement;
    private int age;
     
     
     // constructeur muni à cette classe
     
public Employe(String nom,String prenom,String matricule,String datecommencement,int age){
         this.nom=nom;
         this.prenom=prenom;
         this.matricule=matricule;
         this.datecommencement=datecommencement;
         this.age=age;
}   

    //accesseus et modifieurs

public void setNom(String nom) {
		this.nom = nom;
}

public String getPrenom() {
		return prenom;
}

public void setPrenom(String prenom) {
		this.prenom = prenom;
}

public String getMatricule() {
		return matricule;
}

public void setMatricule(String matricule) {
		this.matricule = matricule;
}
public String getDatecommencement() {
		return datecommencement;
}

public void setDatecommencement(String datecommencement) {
		this.datecommencement = datecommencement;
}

	
public int getAge() {
		return age;
}

	public void setAge(int age) {
		this.age = age;
}
	
	
     // creation d'une methode pour une concatenation des nom et prenom      
        
public String  getNom(){
    return("l'employe:"+nom+" "+prenom);
}

    //creation d'une methode abstraite pour le calcul du salaire

public abstract double calculersalaire();
}       
         
         
         
         




         
         
         
         
         
         
     


    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    
    

