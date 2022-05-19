package ClasesePracticas;

import java.util.Scanner;



/**
 * Ejercicio418
 */
public class Ejercicio418 {

    static Scanner leert=new Scanner(System.in);

    public static void impuestoveiculos418() {
        //Declarar variables 
        String claveV, hayMas="S";
        int cantVC1=0, cantVC2=0, cantVC3=0;
        double precioVC1=0, precioVC2=0, precioVC3=0, impVC1=0, impVC2=0, impVC3=0,totalImpV=0;

        while (hayMas.equals("S")){
            System.out.println("Ingrese la clave del veiculo (VC1,VC2,VC3:");
            claveV=leert.next().toUpperCase();
            if (claveV.equals("VC1")){
                System.out.println("Ingrese cantidad de veiculos con clave "+claveV+":");
                cantVC1=cantVC1+leert.nextInt();
                if (precioVC1==0){
                System.out.println("Ingrese el precio del veiculo con clave "+claveV+":");
                precioVC1=leert.nextDouble();
                }
                impVC1=precioVC1*0.10;
        }else if (claveV.equals("VC2")) {
            System.out.println("Ingrese cantidad de veiculos con clave "+claveV+":");
            cantVC2=cantVC2+leert.nextInt();
            if (cantVC2==0){
            System.out.println("Ingrese el precio del veiculo con clave "+claveV+":");
            precioVC2=leert.nextDouble();
            }
            impVC2=precioVC2*0.07;
        }else if (claveV.equals("VC3")){
            System.out.println("Ingrese cantidad de veiculos con clave "+claveV+":");
            cantVC3=cantVC3+leert.nextInt();
            if (cantVC3==0){
            System.out.println("Ingrese el precio del veiculo con clave "+claveV+":");
            precioVC3=leert.nextDouble();
            }
            impVC3=precioVC1*0.05;
        }else{ System.out.println("La clave de veiculo es incorrecto");}
        System.out.println("Hay mas veiculos?: S=SI, N=NO");
        hayMas=String.valueOf(leert.next().toUpperCase().charAt(0));
    }
    System.out.println("Impuesto de veiculo VC1 es:"+impVC1);
    System.out.println("Impuesto de veiculo VC2 es:"+impVC2);
    System.out.println("Impuesto de veiculo VC3 es:"+impVC3);

    System.out.println("Impuesto total de veiculo VC1 es:"+(impVC1*cantVC1));
    System.out.println("Impuesto total de veiculo VC2 es:"+(impVC2*cantVC2));
    System.out.println("Impuesto total de veiculo VC3 es:"+(impVC3*cantVC3));

    totalImpV=(impVC1*impVC1)+(impVC2*impVC2)+(impVC3*impVC3);
    System.out.println("total impuesto a pagar de "+(cantVC1+cantVC2+cantVC3)+" es:"+totalImpV);
}

    public static void main(String[] args) {
        impuestoveiculos418();
        
    }
}