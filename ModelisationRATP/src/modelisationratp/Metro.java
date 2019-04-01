/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelisationratp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Açkgoz
 */
public class Metro{
    
    private int minute;
    private int heure;
    private int second;

    public Metro(int minute,int heure,int s){
        
        minute = this.minute;
        heure = this.heure;
        second = this.second;
        
    }
    public void se_dire(){
        for(this.second = 0;this.second>-1;this.second++){
            
                                    if(this.second==60)
                                    {
                                        this.second=0;
                                        this.minute+=1;
                                        if(this.minute==60){
                                            this.minute=0;
                                            this.heure+=1;
                                                if(this.heure==24){
                                                    this.heure=0;
                                                }
                                              
                                        }
                                    }
                        
        System.out.println("Temps Actuel = "+heure+":"+minute+":"+second);
        
        
        
        }                                
                                
    }
    }
    
    