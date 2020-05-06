/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyswietlacz;

/**
 *
 * @author TomaszFigurski
 */
public class WyswietlaczBeanInfo extends java.beans.SimpleBeanInfo {
     public java.awt.Image getIcon(int iconKind) {
        return loadImage("/wyswietlacz/7segment2.png");
    }
     
     
}
