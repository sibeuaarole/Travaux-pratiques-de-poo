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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instanciation de la classe personnel
        
        Personnel p=new Personnel();
        
        
      p.ajouteremploye (new commerciaux_vendeurs("feubou","lolita","16b028fs","27sept2016",27,200000)); 
      
       p.ajouteremploye (new Commerciaux_representants("davila","manuella","15b028fs","22sept2015",29,150000));
       
       p.ajouteremploye (new Employe_technicien_production("mairi","brice","17c038fs","14mai2017",22,65));
       
       p.ajouteremploye (new Employe_manutentionnaire("totoum","elvira","14c038fs","18avril2014",32,620));
        
        p.ajouteremploye (new Production_produits_dangereux("sonkou","felix","12d323fs","18jan2012",28,20));
       
        p.ajouteremploye (new Manutention_produits_dangereux("ebene","pauclair","17d323fs","01fev2017",25,650));
        
        // methode qui affiche le salaire
        
        p.affichersalaire();
       
        System.out.println("le salaire moyen est " + p.salairemoyen()+ " francs cfa");
        
    }
    
}
