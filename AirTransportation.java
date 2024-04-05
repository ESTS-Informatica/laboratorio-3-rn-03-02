
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{   
    public String name;
    public int numberOfContainers;
    public static final double fees = 4;
    
    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(fees);
    }
    
    public double getPriceWithFees(){
        return super.getPriceWithFees();
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Aereo";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f€\n", "Nome", this.name));
        sb.append(String.format("%15s: %4.2f€\n", "Numero de Contentores", this.numberOfContainers));
        
        return sb.toString();
    }
    
    //-------------------------------------
    public String getName(){
        return name;
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setName(String name){
        if(name != null){
            this.name = name;
        } else {
            this.name = "";
        }
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers != 0){
            this.numberOfContainers = numberOfContainers;
        } else {
            this.numberOfContainers = 0;
        }
    }
}
