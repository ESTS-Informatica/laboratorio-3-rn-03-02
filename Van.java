
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{   
    private int packages;
    
    public Van(int packages, String licensePlate){
        super(licensePlate);
        this.packages = packages;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f€\n", "Packages", this.packages));
        
        return sb.toString();
    }
    
    //Setters e Getters
    public void setPackages(){
        this.packages = packages;
    }
    
    public void setLicensePlate(String licensePlate){
        super.setLicensePlate(licensePlate);
    }
    
    public int getPackages(){
        return this.packages;
    }
    
    public String getLicensePlate(){
        return super.getLicensePlate();
    }
}
