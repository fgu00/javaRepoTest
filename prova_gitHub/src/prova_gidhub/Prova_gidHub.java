/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_gidhub;

/**
 *
 * @author russo.salvatore
 */
public class Prova_gidHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a = 0;
        bello bello=new bello();
       while(true){
           System.out.println("ehi ciao "+bello.bello+"!"+a);
           a=(char) (a+1);
       }
    }
    
}
