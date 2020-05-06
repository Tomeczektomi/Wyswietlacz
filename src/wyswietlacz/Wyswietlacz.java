package wyswietlacz;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Dimension;
import java.awt.Graphics;

public class Wyswietlacz extends java.awt.Panel {
   
    Color on = blue;
    Color off = white;
    Color kolorOn;
    Color kolorTla;
    public Color colA = off;
    public Color colB = off;
    public Color colC = off;
    public Color colD = off;
    public Color colE = off;
    public Color colF = off;
    public Color colG = off;
    boolean dot = true;
    double liczbaWyswietlana;
    int szer = 21;
    int wys = 34;
    char[] znaki;   
    int kropka = -1;
    public int liczbaWyswietlaczy = 2;
    int rozm = 1;    
    private Wyglad wyglad;
   
    
    public Wyglad getWyglad() {
       return wyglad;
    }
     
     public void setWyglad(Wyglad wyglad){
       Wyglad oldWyglad = this.wyglad;
       this.wyglad = wyglad;
       firePropertyChange("Wyglad", oldWyglad, wyglad);
     }   

     public Wyswietlacz()
   {    
    setSize(szer*rozm*liczbaWyswietlaczy, wys*rozm);   
    setLiczbaWyswietlana(8);
    setKolorTla(new Color(240,240,240));      
    setWyglad(Wyglad.STANDARDOWY);  
    
   }
       
      public synchronized void paint(Graphics a) {
          
          int h = getHeight();
          int w = getWidth();
         
          if((w>szer)&&(dot==false)){        
              rozm = ((w / szer)/(liczbaWyswietlaczy-1));         
          }
          if((w>szer)&&(dot==true)){        
              rozm = (w / szer)/liczbaWyswietlaczy;          
          }
          if(h < wys*rozm){
             rozm = (h/wys);
          }
          int rs = 0;
          if(dot == true){
            rs = w - szer*rozm*liczbaWyswietlaczy;
          }
          if(dot == false){
            rs = w - szer*rozm*(liczbaWyswietlaczy-1);
          }
         
          a.setColor(kolorTla);
          a.fillRect(0,0,w,h);
          int npoints = 6;
           
         for (int i = 0; i < liczbaWyswietlaczy; i++){ //rysowanie okreslonej liczby wyswietlaczy

           kolory(znaki,i,liczbaWyswietlana);
           int wyp = 0;
           int wkl = 0;
           if(wyglad == wyglad.WYPUKLY){
               wyp = 2;
               wkl = 0;
           }
           if(wyglad == wyglad.WKLESLY){
               wyp = 0;
               wkl = 2;
           }
           if(wyglad == wyglad.STANDARDOWY){
               wyp = 0;
               wkl = 0;
           }
            
         
            
           int ax [] = {((3+wyp)*rozm+(szer*rozm*i)+rs),((5+wyp)*rozm+(szer*rozm*i)+rs),((14-wyp)*rozm+(szer*rozm*i)+rs),((16-wyp)*rozm+(szer*rozm*i)+rs),((14-wyp)*rozm+(szer*rozm*i)+rs),((5+wyp)*rozm+(szer*rozm*i)+rs)};
           int ay [] = {2*rozm,0,0,2*rozm,4*rozm,4*rozm};
           a.setColor(colA);
           a.fillPolygon(ax,ay,npoints);
           
           int bx [] = {((17-wyp)*rozm+szer*rozm*i)+rs, ((19-wyp)*rozm+szer*rozm*i)+rs, ((19-wkl)*rozm+szer*rozm*i)+rs, ((17-wkl)*rozm+szer*rozm*i)+rs, ((15-wkl)*rozm+szer*rozm*i)+rs, ((15-wyp)*rozm+szer*rozm*i)+rs};
           int by [] = {3*rozm, 5*rozm, 14*rozm, 16*rozm, 14*rozm, 5*rozm};
           a.setColor(colB);
           a.fillPolygon(bx,by,npoints);

           int cx [] = {((17-wkl)*rozm+szer*rozm*i)+rs, ((19-wkl)*rozm+szer*rozm*i)+rs, ((19-wyp)*rozm+szer*rozm*i)+rs, ((17-wyp)*rozm+szer*rozm*i)+rs, ((15-wyp)*rozm+szer*rozm*i)+rs, ((15-wkl)*rozm+szer*rozm*i)+rs};
           int cy [] = {18*rozm, 20*rozm, 29*rozm, 31*rozm, 29*rozm, 20*rozm};
           a.setColor(colC);
           a.fillPolygon(cx,cy,npoints);
                     
           int dx [] = {((3+wyp)*rozm+szer*rozm*i)+rs,((5+wyp)*rozm+szer*rozm*i)+rs,((14-wyp)*rozm+szer*rozm*i)+rs,((16-wyp)*rozm+szer*rozm*i)+rs,((14-wyp)*rozm+szer*rozm*i)+rs,((5+wyp)*rozm+szer*rozm*i)+rs};
           int dy [] = {32*rozm,30*rozm,30*rozm,32*rozm,34*rozm,34*rozm};
           a.setColor(colD);
           a.fillPolygon(dx,dy,npoints);
           
           int ex [] = {((2+wkl)*rozm+szer*rozm*i)+rs, ((4+wkl)*rozm+szer*rozm*i)+rs, ((4+wyp)*rozm+szer*rozm*i)+rs, ((2+wyp)*rozm+szer*rozm*i)+rs, ((0+wyp)*rozm+szer*rozm*i)+rs, ((0+wkl)*rozm+szer*rozm*i)+rs};
           int ey [] = {18*rozm, 20*rozm, 29*rozm, 31*rozm, 29*rozm, 20*rozm};
           a.setColor(colE);
           a.fillPolygon(ex,ey,npoints);
       
           int fx [] = {((2+wyp)*rozm+szer*rozm*i)+rs, ((4+wyp)*rozm+szer*rozm*i)+rs, ((4+wkl)*rozm+szer*rozm*i)+rs, ((2+wkl)*rozm+szer*rozm*i)+rs, ((0+wkl)*rozm+szer*rozm*i)+rs, ((0+wyp)*rozm+szer*rozm*i)+rs};
           int fy [] = {3*rozm, 5*rozm, 14*rozm, 16*rozm, 14*rozm, 5*rozm};
           a.setColor(colF);
           a.fillPolygon(fx,fy,npoints);
                    
           int gx [] = {((3+wkl)*rozm+szer*rozm*i)+rs, ((5+wkl)*rozm+szer*rozm*i)+rs, ((14-wkl)*rozm+szer*rozm*i)+rs, ((16-wkl)*rozm+szer*rozm*i)+rs, ((14-wkl)*rozm+szer*rozm*i)+rs, ((5+wkl)*rozm+szer*rozm*i)+rs};
           int gy [] = {17*rozm, 15*rozm, 15*rozm, 17*rozm, 19*rozm, 19*rozm};
           a.setColor(colG);
           a.fillPolygon(gx,gy,npoints);
         
           if ((kropka == i)&&(dot==false)){
            break;              
           }
           
           if ((kropka == i)&&(dot==true)){
               a.setColor(on);           
           }
           else
           {
              a.setColor(off);           
           }
                      
           int kropkax [] = {(18*rozm+szer*rozm*i)+rs, (21*rozm+szer*rozm*i)+rs, (21*rozm+szer*rozm*i)+rs, (18*rozm+szer*rozm*i)+rs};
           int kropkay [] = {31*rozm, 31*rozm, 34*rozm, 34*rozm};
           a.fillPolygon(kropkax,kropkay,4);                  
           }                        
     }
        
    public boolean getDot() {
         return dot;
    }
      
    public void setDot(boolean d){
       boolean oldDot = dot;
       dot = d;
       firePropertyChange("Kropka on/off", oldDot, d);
       if(dot == true){            
           setPreferredSize(new Dimension(szer*rozm*(liczbaWyswietlaczy),wys*rozm));
         }
         if(dot == false){            
          setPreferredSize(new Dimension(szer*rozm*(kropka+1),wys*rozm));         
         }     
    } 
    
    public Color getOn() {
         return on;
    }
      
    public void setOn(Color c){
       Color oldOn = on;
       on = c;
       firePropertyChange("kolorOn", oldOn, c);      
    } 
    
    public Color getKolorTla() {
         return kolorTla;
    }
      
    public void setKolorTla(Color c){
       Color oldBgColor = kolorTla;
       kolorTla = c;
       firePropertyChange("kolor_Tla", oldBgColor, c);     
   } 
    
    public Color getOff() {
         return off;
    }
      
    public void setOff(Color c){
       Color oldOff = off;
       off = c;
       firePropertyChange("kolorOff", oldOff, c);        
   } 
      
    public double getLiczbaWyswietlana() {
       return liczbaWyswietlana;
    }
     
    public void setLiczbaWyswietlana(double l){
       double oldDouble = liczbaWyswietlana;
       liczbaWyswietlana = l;
       firePropertyChange("Liczba wyswietlana", oldDouble, l);
       String bufor = String.valueOf(l);
       liczbaWyswietlaczy = (bufor.length()-1);
       znaki = przechwycZnaki(liczbaWyswietlana);
               
         if(dot == true){
             liczbaWyswietlaczy = (bufor.length()-1);      
         }
         if(dot == false){
             liczbaWyswietlaczy = kropka +2;
         }                  
         repaint();
      } 
       
    public char[] przechwycZnaki(double l){
        
        String bufor = String.valueOf(l);
        char[] c = new char [bufor.length()];
        
        for (int k=0; k<bufor.length(); k++){
            c[k] = bufor.charAt(k);
        }
        for (int k=0; k<bufor.length(); k++){
           if(bufor.charAt(k) == '.'){
               kropka = k-1;
           } 
        }
        if((bufor.charAt(kropka+2) == '0')&&(kropka+3>bufor.length()-1)){
           setDot(false);
         }
         else{
           setDot(true);
         }              
       return c;
    }
    
    
                       
      public void kolory(char[] c, int i, double l){
          
          String bufor = String.valueOf(l);
          char znak = 'n';
          
          if(i<liczbaWyswietlaczy-bufor.length()+1){
              System.out.println("null");
              znak = 'n';
            colA = off;;
            colB = off;
            colC = off;
            colD = off;;
            colE = off;;
            colF = off;;
            colG = off;;
          }         
          if(i>=liczbaWyswietlaczy-bufor.length()+1){                        
             if(c[i-liczbaWyswietlaczy+bufor.length()-1] == '.'){                 
                  kropka = i-1;
                  System.out.println( c[i-liczbaWyswietlaczy+bufor.length()]);
                  znak = c[i-liczbaWyswietlaczy+bufor.length()];
             }
             else
             {                
                 if((i>kropka+1)&&(i<=liczbaWyswietlaczy))
                 {
                 System.out.println( c[i-liczbaWyswietlaczy+bufor.length()-1]);
                 znak = c[i-liczbaWyswietlaczy+bufor.length()];
                 }             
             else
             {
                 System.out.println( c[i-liczbaWyswietlaczy+bufor.length()-1]);
                 znak = c[i-liczbaWyswietlaczy+bufor.length()-1];    
             }
          }                   
          if (znak == '0'){           
            colA = on;
            colB = on;
            colC = on;
            colD = on;
            colE = on;
            colF = on;
            colG = off;           
        }
         if (znak == '1'){            
            colA = off;
            colB = on;
            colC = on;
            colD = off;
            colE = off;
            colF = off;
            colG = off;           
        }        
          if (znak == '2'){           
            colA = on;
            colB = on;
            colC = off;
            colD = on;
            colE = on;
            colF = off;
            colG = on;           
        }         
          if (znak == '3'){            
            colA = on;
            colB = on;
            colC = on;
            colD = on;
            colE = off;
            colF = off;
            colG = on;           
        }         
          if (znak == '4'){           
            colA = off;
            colB = on;
            colC = on;
            colD = off;
            colE = off;
            colF = on;
            colG = on;           
        }          
          if (znak == '5'){            
            colA = on;
            colB = off;
            colC = on;
            colD = on;
            colE = off;
            colF = on;
            colG = on;           
        }         
          if (znak == '6'){           
            colA = on;
            colB = off;
            colC = on;
            colD = on;
            colE = on;
            colF = on;
            colG = on;            
        }          
          if (znak == '7'){           
            colA = on;
            colB = on;
            colC = on;
            colD = off;
            colE = off;
            colF = off;
            colG = off;           
        }         
          if (znak == '8'){         
            colA = on;
            colB = on;
            colC = on;
            colD = on;
            colE = on;
            colF = on;
            colG = on;           
        }
           if (znak == '9'){            
            colA = on;
            colB = on;
            colC = on;
            colD = on;
            colE = off;
            colF = on;
            colG = on;           
        }
           if (znak == '-'){         
            colA = off;
            colB = off;
            colC = off;
            colD = off;
            colE = off;
            colF = off;
            colG = on;            
        }         
           if (znak == 'E'){
            colA = on;
            colB = off;
            colC = off;
            colD = on;
            colE = on;
            colF = on;
            colG = on;
        }         
    }   
 }         
}
