import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name){
        this.name = name;
        this.inService = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        for(Transport transport : this){
            sb.append(transport.toString());
        }
        
        return sb.toString();
    }
    
    //Setters e Getters
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Transport> getInService(){
        return inService;
    }
}
