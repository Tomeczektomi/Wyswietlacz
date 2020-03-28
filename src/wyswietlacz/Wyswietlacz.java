/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyswietlacz;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Tomcio
 */
public class Wyswietlacz extends javax.swing.JComponent {
    
    Color on = blue;
    Color off = gray;
    public Color colA = off;
    public Color colB = off;
    public Color colC = off;
    public Color colD = off;
    public Color colE = off;
    public Color colF = off;
    public Color colG = off;
    int pozycja = 0;
    float liczbaWyswietlana;
    int width = 21;
    int height = 34;
    int i = 0;
    int kropka = 0;
    public int liczbaWyswietlaczy;
    int size = 3;
    
    private RozmiarWyswietlacza rozmiar;
    
    
     public RozmiarWyswietlacza getRozmiar() {
       return rozmiar;
   }
     
     public void setRozmiar(RozmiarWyswietlacza rozmiar){
       RozmiarWyswietlacza oldRozmiar = this.rozmiar;
       this.rozmiar = rozmiar;
       firePropertyChange("rozmiar", oldRozmiar, rozmiar);
       
       
     if(rozmiar == RozmiarWyswietlacza.SIZE34){
         size = 1;
     }
     if(rozmiar == RozmiarWyswietlacza.SIZE68){
         size = 2;
     }
     if(rozmiar == RozmiarWyswietlacza.SIZE102){
         size = 3;
     }
     if(rozmiar == RozmiarWyswietlacza.SIZE136){
         size = 4;
     }
      if(rozmiar == RozmiarWyswietlacza.SIZE170){
         size = 5;
     }
       if(rozmiar == RozmiarWyswietlacza.SIZE204){
         size = 6;
     }
      
     setPreferredSize(new Dimension(width*size*liczbaWyswietlaczy, height*size));
       
   }
    
    
    
    
     public Wyswietlacz()
   {
     
       
     
    setPreferredSize(new Dimension(width*size, height*size));
    liczbaWyswietlaczy = 1;
      
      
      
      
   }
     
     
     
     
     
     
     
     
     
      public synchronized void paint(Graphics a) {
         
           int npoints = 6;
           
           
           
           
           

         for (i = 0; i < liczbaWyswietlaczy; i++){ //rysowanie okreslonej liczby wyswietlaczy
           

           int ax [] = {3*size+(width*size*i),5*size+(width*size*i),14*size+(width*size*i),16*size+(width*size*i),14*size+(width*size*i),5*size+(width*size*i)};
           int ay [] = {2*size,0,0,2*size,4*size,4*size};
           a.setColor(colA);
           a.fillPolygon(ax,ay,npoints);
           
           
          
           int bx [] = {17*size+width*size*i, 19*size+width*size*i, 19*size+width*size*i, 17*size+width*size*i, 15*size+width*size*i, 15*size+width*size*i};
           int by [] = {3*size, 5*size, 14*size, 16*size, 14*size, 5*size};
           a.setColor(colB);
           a.fillPolygon(bx,by,npoints);
           
           
           int cx [] = {17*size+width*size*i, 19*size+width*size*i, 19*size+width*size*i, 17*size+width*size*i, 15*size+width*size*i, 15*size+width*size*i};
           int cy [] = {18*size, 20*size, 29*size, 31*size, 29*size, 20*size};
           a.setColor(colC);
           a.fillPolygon(cx,cy,npoints);
           
           
           int dx [] = {3*size+width*size*i,5*size+width*size*i,14*size+width*size*i,16*size+width*size*i,14*size+width*size*i,5*size+width*size*i};
           int dy [] = {32*size,30*size,30*size,32*size,34*size,34*size};
           a.setColor(colD);
           a.fillPolygon(dx,dy,npoints);
           
           int ex [] = {2*size+width*size*i, 4*size+width*size*i, 4*size+width*size*i, 2*size+width*size*i, width*size*i, width*size*i};
           int ey [] = {18*size, 20*size, 29*size, 31*size, 29*size, 20*size};
           a.setColor(colE);
           a.fillPolygon(ex,ey,npoints);
       
           int fx [] = {2*size+width*size*i, 4*size+width*size*i, 4*size+width*size*i, 2*size+width*size*i, width*size*i, width*size*i};
           int fy [] = {3*size, 5*size, 14*size, 16*size, 14*size, 5*size};
           a.setColor(colF);
           a.fillPolygon(fx,fy,npoints);
           
           
           int gx [] = {3*size+width*size*i, 5*size+width*size*i, 14*size+width*size*i, 16*size+width*size*i, 14*size+width*size*i, 5*size+width*size*i};
           int gy [] = {17*size, 15*size, 15*size, 17*size, 19*size, 19*size};
           a.setColor(colG);
           a.fillPolygon(gx,gy,npoints);
           
           
           
           
           
           
           
           
           if (kropka == i+1){
               a.setColor(on);
           }
           else
           {
                a.setColor(off);
           }
           
           
           int kropkax [] = {18*size+width*size*i, 21*size+width*size*i, 21*size+width*size*i, 18*size+width*size*i};
           int kropkay [] = {31*size, 31*size, 34*size, 34*size};
           
           a.fillPolygon(kropkax,kropkay,4);
    
           }
         
           i = 0;
      
       
       
       

       
        
   }
    
      
    public int getLiczbaWyswietlaczy() {
       return liczbaWyswietlaczy;
    }
     
    public void setLiczbaWyswietlaczy(int l){
       int oldInt = liczbaWyswietlaczy;
       liczbaWyswietlaczy = l;
       firePropertyChange("Liczba wyswietlaczy", oldInt, l);
       setPreferredSize(new Dimension(width*size*liczbaWyswietlaczy, height*size));
      } 
      
    public int getKropka() {
         return kropka;
    }
      
    public void setKropka(int k){
       int oldKropka = kropka;
       kropka = k;
       firePropertyChange("MiejsceKropki", oldKropka, k);
       if ((kropka > liczbaWyswietlaczy)&&(kropka < 0)){
       kropka = 0;
       }
   } 
    
    public float getLiczbaWyswietlana() {
       return liczbaWyswietlana;
    }
     
    public void setLiczbaWyswietlana(float l){
       float oldInt = liczbaWyswietlana;
       liczbaWyswietlana = l;
       firePropertyChange("Liczba wyswietlana", oldInt, l);
       
      } 
    
    
    
   
}
