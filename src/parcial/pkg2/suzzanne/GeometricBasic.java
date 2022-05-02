/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg2.suzzanne;

import java.lang;


/**
 *
 * @author susan
 */
public class GeometricBasic {
    public int area;
    public int per;
    public int volu;
    String figura;
    int lados;

    public GeometricBasic() {

    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public void setVolu(int volu) {
        this.volu = volu;
    }


    public int areaTria(int base, int alh) {
        area = (base * alh)/2;
        return area;
    }

    public int periTria(int lad1, int lad2, int base) {
         per = (base * lad1 * lad2);
        return per;
    }

    public int volTria(int alh, int rad) {

         volu = (int) (Math.PI*(Math.sqrt(rad) * alh));
         volu=volu/3;
        return volu;
    }

/////

    public int areaCua(int lad1) {
        area = lad1 * lad1;
        return area;
    }

    public int periCua(int lad1) {
         per = (4 * lad1);
        return per;
    }

    public int volCua(int lad1) {
         volu = (lad1*lad1*lad1);
        return volu;
    }
///
    public double areaCirc(double rad) {
        area = (int) (Math.PI*((rad)*(rad)));
        return area;
    }

    public double perCirc(double rad) {
        per = (int) ((Math.PI*rad)*2);
        return per;
    }
    public double volCirc(double rad) {
        volu = (int) ((Math.PI*(rad*rad*rad)*4)/3);
        return volu;
    }


///
    
    public int areaRect(int base, int alh) {
        area = base * alh;
        return area;
    }
    public int perRect(int base, int alh) {
        per = (2*(base + alh));
        return per;
    }
    public int volRect(int base,int lad1, int alh) {
        volu = base * alh * lad1;
        return volu;
    }
    



    //METODO VOID
    public void ret(){
      System.out.print("Ingresa la Base de la figura: "); 
    }
    public void ret1(){
      System.out.print("Ingresa el Lado A de la figura: "); 
    }
    public void ret2(){
      System.out.print("Ingresa el Lado B la figura: "); 
    }
    public void ret3(){
      System.out.print("Ingresa la Altura de la figura: "); 
    }
    public void ret4(){
      System.out.print("Ingresa el Radio de la figura: "); 
    }
    ///




}
