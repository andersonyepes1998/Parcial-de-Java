package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        System.out.println("--- 1. Hamburguesa = 10.000 ---");
        System.out.println("--- 2. Perros = 8.000 ---");
        System.out.println("--- 3. Salchipapas = 6.000 --- ");
        System.out.println("--- 1. Chorizos = 7.000 --- ");

        int numpeople=0, plato, suma=0, propi;
        double result, discount, total=0, pagar;

        System.out.println("Digitalice el que comida desea teniendo en cuenta el menu: ");
        plato = inputData.nextInt();

        System.out.println("Desea incluir la propina: 1 = si  2 = no: ");
        propi = inputData.nextInt();

        while (suma <= numpeople){
            if (plato==1){
                System.out.println("DIGITALICE EL NUMERO DE PERSONAS");
                numpeople = inputData.nextInt();
                total = numpeople * 10000;
                if (total==20000){
                    discount = total * 0.10;
                    total = total - discount;
                    pagar = total;
                    System.out.println("Se le realizo un descuento por la compra superior a $20.000 pesos.");
                }else if (propi == 1){
                    pagar = total * 0.10;
                    pagar = pagar + total;
                    System.out.println("El valor con la propina es de "+pagar);
                }else{
                    total = numpeople * 10000;
                    System.out.println("el total es de: "+total);
                }
            }
            if (plato==2){
                System.out.println("DIGITALICE EL NUMERO DE PERSONAS");
                numpeople = inputData.nextInt();
                total = numpeople * 8000;
                if (total==20000){
                    discount = total * 0.10;
                    total = total - discount;
                    pagar = total;
                    System.out.println("Se le realizo un descuento por la compra superior a $20.000 pesos.");
                }else if (propi == 1){
                    pagar = total * 0.10;
                    pagar = pagar + total;
                    System.out.println("El valor con la propina es de "+pagar);
                }else{
                    total = numpeople * 8000;
                    System.out.println("el total es de: "+total);
                }
            }
            if (plato==3){
                System.out.println("DIGITALICE EL NUMERO DE PERSONAS");
                numpeople = inputData.nextInt();
                total = numpeople * 6000;
                if (total==20000){
                    discount = total * 0.10;
                    total = total - discount;
                    pagar = total;
                    System.out.println("Se le realizo un descuento por la compra superior a $20.000 pesos.");
                }else if (propi == 1){
                    pagar = total * 0.10;
                    pagar = pagar + total;
                    System.out.println("El valor con la propina es de "+pagar);
                }else{
                    total = numpeople * 6000;
                    System.out.println("el total es de: "+total);
                }
            }
            if (plato==4){
                System.out.println("DIGITALICE EL NUMERO DE PERSONAS");
                numpeople = inputData.nextInt();
                total = numpeople * 7000;
                if (total==20000){
                    discount = total * 0.10;
                    total = total - discount;
                    pagar = total;
                    System.out.println("Se le realizo un descuento por la compra superior a $20.000 pesos.");
                }else if (propi == 1){
                    pagar = total * 0.10;
                    pagar = pagar + total;
                    System.out.println("El valor con la propina es de "+pagar);
                }else{
                    total = numpeople * 7000;
                    System.out.println("el total es de: "+total);
                }
            }
            suma ++;
        }
        discount = total * 0.05;
        pagar = total - discount;
        System.out.println("El total  es de: "+pagar);
    }
}
