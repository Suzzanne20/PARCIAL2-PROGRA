/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial.pkg2.suzzanne;
import java.util.Scanner;

/**
 *
 * @author susan
 */
public class ParcialDosSuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int lad1, lad2, alh, base; 
        double rad;
 
        GeometricBasic geo=new GeometricBasic();
        Area ar=new Area();   
        Scanner num=new Scanner(System.in);
        Scanner nun=new Scanner(System.in);
        Scanner nuo=new Scanner(System.in);
        System.out.println("----MENU PRINCIPAL---");
        System.out.println("Ingrese el # de opcion de la operacion que desea realizar\n1: Calculos Geometricos Basicos\n2: Otros Calculos Geometricos");
        int opc=num.nextInt();
        switch(opc){
        case 1:
        System.out.println("----MENU Geometria Basica---");

        System.out.println("Ingrese el # del Figura Geometrica:\n1: Triangulo\n2: Cuadrado\n3: Circulo\n4: Rectangulo");
        int opc2=nun.nextInt();
            switch(opc2){
                case 1:
                System.out.println("----CALCULOS DE UN TRIANGULO----");
                geo.ret();
                base = nuo.nextInt(); 
                geo.ret1(); 
                lad1 = nuo.nextInt();
                geo.ret2();
                lad2 = nuo.nextInt();
                geo.ret3(); 
                alh = nuo.nextInt(); 
                geo.ret4(); 
                rad = nuo.nextInt(); 
                int resulta=geo.areaTria(base, alh);
                int resultp=geo.periTria(lad1, lad2, base);
                int resultv=geo.volTria(alh, (int) rad);
                System.out.println("\nEl area es: " + resulta +"mts cuadrados"+ "\nEl perimetro es:" + resultp + "\nEl volumen es:" + resultv +"cubicos");

                break;
                case 2:
                System.out.println("----CALCULO DE UN CUADRADO----");
                geo.ret1(); 
                lad1 = nuo.nextInt();
                resulta=geo.areaCua(lad1);
                resultp=geo.periCua(lad1);
                resultv=geo.volCua(lad1);
                System.out.println("\nEl area es: " + resulta +"mts cuadrados"+ "\nEl perimetro es:" + resultp + "\nEl volumen es:" + resultv +"cubicos");

                break;
                case 3:
                System.out.println("----CALCULO DE CIRCULO----");
                geo.ret4(); 
                rad = nuo.nextInt();
                double resultad=geo.areaCirc(rad);
                double resultpd=geo.perCirc(rad);
                double resultvd=geo.volCirc(rad);
                System.out.println("\nEl area es: " + resultad +"mts cuadrados"+ "\nEl perimetro es:" + resultpd + "\nEl volumen es:" + resultvd +"cubicos" );
                ar.setLados(0);
                System.out.println("\nEl Circulo tiene "+ar.getLados()+"lados");
                break;
                case 4:
                System.out.println("----CALCULO DE RECTANGULO----");
                geo.ret();
                base = nuo.nextInt(); 
                geo.ret1(); 
                lad1 = nuo.nextInt();
                geo.ret3(); 
                alh = nuo.nextInt(); 
                resulta=geo.areaRect(base, alh);
                resultp=geo.perRect(base, alh);
                resultv=geo.volRect(base, lad1, alh);
                System.out.println("\nEl area es: " + resulta +"mts cuadrados"+ "\nEl perimetro es:" + resultp + "\nEl volumen es:" + resultv +"cubicos" );


                break;
                default:
                System.out.println("Opcion invalida");
                break;
            }
        break;


        case 2:
        System.out.println("----Menu Otra Geometria---");

        System.out.println("Ingrese el # de funcion que desea aplicar:\n1: Trapecio\n2: Figuras geometricas");
        int opc3=nun.nextInt();
            switch(opc3){
                case 1:
                System.out.println("----CALCULO DE TRAPECIO----");
                System.out.println("\"Ingresa la Base Menor de la figura: \""); 
                alh = nuo.nextInt(); 
                geo.ret();
                base = nuo.nextInt(); 
                geo.ret1(); 
                lad1 = nuo.nextInt();
                geo.ret2(); 
                lad2 = nuo.nextInt();

                int resulta=ar.areaTrap(base, lad2, alh);
                int resultp=ar.periTrap(lad1, base, lad2, alh);

                System.out.println("\nEl area es: " + resulta +"mts cuadrados"+ "\nEl perimetro es:" + resultp );
                ar.setLados(4);
                System.out.println("El trapecio tiene " + ar.getLados()+" lados");


                break;


                case 2:
                System.out.println("----FIGURAS GEOMETRICAS----");
                System.out.println("Selecciones una opcion:\n3\n4");
                lad1 = nuo.nextInt();
                System.out.println("La figura es ");

                break;
                default:
                System.out.println("Opcion invalida");
                break;

            }

        break;

        default:
        System.out.println("Opcion invalida");
        break;


    }

    }
    
        //.

    
    
}
