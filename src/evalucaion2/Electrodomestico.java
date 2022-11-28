
package evalucaion2;

//A=100000  B= 80000
public class Electrodomestico {
    protected int precioBase = 1000000;
    protected String consumoEnergetico;
    protected int precioFinal;
    public Electrodomestico(){
        
    }

    public Electrodomestico(String consumoEnergetico, int consumoBase) {
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = consumoBase;
    }
 //Getters
    public int precioBase() {
        return precioBase;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    //SEtters

    public void setprecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    //metodo
    public int precioFinal(){
        
        if (consumoEnergetico.equals("A")){
            precioFinal = precioBase + 100000;
        }
        else{
            precioFinal = precioBase + 80000;
        }
        
        return precioFinal;
    }

    @Override
    public String toString() {
        return "precioBase= " + precioBase + "\nconsumoEnergetico= " + consumoEnergetico +
                "\nprecioFinal= " + precioFinal;
    }
    
}
