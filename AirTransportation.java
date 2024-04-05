
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
    
    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
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
