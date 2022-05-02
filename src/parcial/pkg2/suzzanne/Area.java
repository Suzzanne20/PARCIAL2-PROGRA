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
public class Area extends GeometricBasic{
private int geoAlt ;

 public int areaTrap(int base, int lad2, int alh) {
        area = (((base+lad2) * alh)/2);
        return area;
    }

    public int periTrap(int lad1, int base, int lad2, int alh) {
         per = (base*alh*lad1*lad2);
        return per;
    }
//

/*public void figuR (){
if (geoAlt==3){
System.out.println("Es un triangulo");
}else if (geoAlt==4){
System.out.println("Es un cuadrado");
}else{
System.out.println("Es una Figura?");
}*/


    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    public int getGeoAlt()  {
        return geoAlt;
    }

}
