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
public class Personnel {
    
    //attributs de la classe 
    
    private final Employe[]collectionemploye;
    private int totalemployes;
    private final static int nbremaximaldemployes=800;
    
    
public Personnel(){
    
    collectionemploye=new Employe[nbremaximaldemployes];
    totalemployes=0;
    
    
}    
public void ajouteremploye(Employe x){
    ++totalemployes;
    if(totalemployes<=nbremaximaldemployes){
        collectionemploye[totalemployes-1]=x;
    }
    else{
        System.out.println("pas plus de "+nbremaximaldemployes+" employe");
    }
} 

public double salairemoyen(){
    
    double somme=0.0;
    for(int i=0;i<totalemployes;i++){
        
        somme+=collectionemploye[i].calculersalaire();
    }
    
    return somme/totalemployes;
}

public void affichersalaire(){
    for(int i=0;i<totalemployes;i++){
        
        System.out.println(collectionemploye[i].getNom()+" gagne "+collectionemploye[i].calculersalaire()+" FCFA");
    }
}
}
