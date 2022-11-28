
package evalucaion2;


public class Evalucaion2 {

 
    public static void main(String[] args) {
        Electrodomestico elect = new Electrodomestico();
        Televisor tv = new Televisor();
        
        elect.setprecioBase(1100000);
        elect.setConsumoEnergetico("A");
        elect.precioFinal();
        System.out.println(elect.toString());
        
        System.out.println("");
        
        tv.setprecioBase(1100000);
        tv.setConsumoEnergetico("A");
        tv.setResolucion("FullHD");
        tv.precioFinal();
        System.out.println(tv.toString());
        
        System.out.println("");
        
        tv.setprecioBase(1100000);
        tv.setConsumoEnergetico("A");
        tv.setResolucion("FullHD");
        tv.precioFinal();
        System.out.println(tv.toString());
        
        System.out.println("");
        
        tv.setprecioBase(1200000);
        tv.setConsumoEnergetico("A");
        tv.setResolucion("FullHD");
        tv.precioFinal();
        System.out.println(tv.toString());
        
        System.out.println("");
        
        elect.setConsumoEnergetico("B");
        elect.precioFinal();
        System.out.println(elect.toString());
    }
    
}
