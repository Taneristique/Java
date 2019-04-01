/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelisationratp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Açkgoz
 */
public class Tram {
    private String lignes;
    private String direction;
    private double horaires;
    List<String[]> list =  new ArrayList<String[]>();
    List<String[]> list2 =  new ArrayList<String[]>();

   
    
    void iteneraires_ligne1(){
        String[] arr1 ={"Chateau de Vincennes"};
        String[] arr2 ={"Bérault"};
        String[] arr3 ={"Saint-Mandé"};
        String[] arr4 ={"Porte de Vincennes"};
        String[] arr5 = {"Nation"};
        String[] arr6 ={"Reuilly-Diderot"};
        String[] arr7 ={"Bastille"};
        String[] arr8 ={"Saint-Paul"};
        String[] arr9 ={"Hôtel de Ville"};
        String[] arr10={"Châtelet"};
        String[] arr11={"Louvre-Rivoli"};
        String[] arr12={"Palais Royal-Musée du Louvre"};
        String[] arr13={"Tuileries"};
        String[] arr14={"Concorde"};
        String[] arr15={"Champs-Elysée-Clamenceau"};
        String[] arr16={"Franklin de Roosevelt"};
        String[] arr17={"George V"};
        String[] arr18={"Charles de Gaule-Etoile"};
        String[] arr19={"Argentine"};
        String[] arr20={"Porte Maillot"};
        String[] arr21={"Les Sablons"};
        String[] arr22={"Pont de Neuilly"};
        String[] arr23={"Esplanade de la Défense"};
        list2.add(arr1);
        list2.add(arr2);
        list2.add(arr3);
        list2.add(arr4);
        list2.add(arr5);
        list2.add(arr6);
        list2.add(arr7);
        list2.add(arr8);
        list2.add(arr9);
        list2.add(arr10);
        list2.add(arr11);
        list2.add(arr12);
        list2.add(arr13);
        list2.add(arr14);
        list2.add(arr15);
        list2.add(arr16);
        list2.add(arr17);
        list2.add(arr18);
        list2.add(arr19);
        list2.add(arr20);
        list2.add(arr21);
        list2.add(arr22);
        list2.add(arr23);
}
    
    
    
    
    
    void iteneraires_ligne4(){
        String[] arr1={"Marie de Montrouge"};
        String[] arr2={"Porte d'Orléans"};
        String[] arr3={"Alésia"};
        String[] arr4={"Mouton-Duvernet"};
        String[] arr5= {"Denfert-Rocheau"};
        String[] arr6={"Raspail"};
        String[] arr7={"Vavin"};
        String[] arr8={"Montparnasse-Bienvenue"};
        String[] arr9={"Saint-Placide"};
        String[] arr10={"Saint-Sulpice"};
        String[] arr11={"Saint-Germain-des-Prés"};
        String[] arr12={"Odéon"};
        String[] arr13={"Saint-Michel"};
        String[] arr14={"Cité"};
        String[] arr15={"Châtelet"};
        String[] arr16={"Les Halles"};
        String[] arr17={"Etiénne Marcel"};
        String[] arr18={"Réaumur-Sébastopol"};
        String[] arr19={"Strasbourg-Saint-Denis"};
        String[] arr20={"Gare de l'Est"};
        String[] arr21={"Gare du Nord"};
        String[] arr22={"Barbès-Rochechouart"};
        String[] arr23={"Château Rouge"};
        String[] arr24={"Marcadet-Poissonniers"};
        String[] arr25={"Porte de Clignancourt"};
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        list.add(arr6);
        list.add(arr7);
        list.add(arr8);
        list.add(arr9);
        list.add(arr10);
        list.add(arr11);
        list.add(arr12);
        list.add(arr13);
        list.add(arr14);
        list.add(arr15);
        list.add(arr16);
        list.add(arr17);
        list.add(arr18);
        list.add(arr19);
        list.add(arr20);
        list.add(arr21);
        list.add(arr22);
        list.add(arr23);
        list.add(arr24);
        list.add(arr25);
    }
     
    public Tram(String lignes,String direction,double horaires){
        this.lignes = lignes;
        this.direction = direction;
        this.horaires = horaires;
        if(this.lignes=="ligne 4"){
            if(this.direction=="Mairie de Montrouge" || this.direction=="Porte de Clignancourt"){
        imprimer();
        iteneraires_ligne4();
        for(String[] strArr : list){
            System.out.println(Arrays.toString(strArr));
        }
        }
                 else{
                System.out.println("Les informations sont erronée!");
                }
        }
        
        else if(this.lignes=="ligne 1"){
            if(this.direction=="Château de Vincennes" || this.direction=="La Défense"){
        imprimer();
        iteneraires_ligne1();
        for(String[] strArr : list2){
            System.out.println(Arrays.toString(strArr));
        }
        }
                 else{
                System.out.println("Les informations sont erronée!");
                }
        }
        


        
    }
    
   
    
    public void imprimer(){
        System.out.println(this.lignes);
        System.out.println(this.direction);
        System.out.println(this.horaires);
        System.out.println("Les Arrêts");
        
        
    }
    
}
