
package evalucaion2;


public class Televisor extends Electrodomestico{
    private String resolucion= "Normal";
    
    public Televisor(){
        
    }

    public Televisor(String consumoEnergetico, int precioBase, String resolucion) {
        super(consumoEnergetico, precioBase);
        this.resolucion=resolucion;
    }
    //sett y gett

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public int precioFinal(){
        if (consumoEnergetico.equals("A")){
            precioFinal = precioBase + 100000;
        }
        else{
            precioFinal = precioBase + 80000;
        }
        
        if(resolucion.equals("FullHD")){
            precioFinal +=50000;
        }
        
        return precioFinal;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\nresolucion=" + resolucion;
    }
    
    
    
    
}
