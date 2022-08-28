package ejerciciodescuentos;

import java.util.Scanner;

public class EjercicioDescuentos {

    public static void main(String[] args) {
        
        //DESCUENTOS:
        Scanner sc = new Scanner(System.in);
        String nombre;
        float valor_compra;
        float precio_final = 0;
        float descuento = 0;

        System.out.println("Ingrese el nombre del cliente");
        nombre = sc.nextLine();
        System.out.println("Ingrese el valor de la compra");
        valor_compra = sc.nextFloat();
        System.out.println("Ingrese el porcentaje de descuento a realizar");
        descuento = sc.nextFloat();

        precio_final = valor_compra*(1-(descuento/100));
        System.out.println("Cliente: "+nombre+"\n"+
                "Monto: "+valor_compra+"usd"+"\n"+
                "Total a pagar: "+precio_final+"usd");
    }
    
}
