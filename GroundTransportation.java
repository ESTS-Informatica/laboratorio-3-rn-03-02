
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{   
    private String licensePlate;
    public static final double fees = 3;
    
    public GroundTransportation(String licensePlate){
        this.licensePlate = licensePlate;
        setFees(fees);
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f€\n", "Matrícula", this.licensePlate));
        
        return sb.toString();
    }
    
    //--------------------------------
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        if(licensePlate != null){
            this.licensePlate = licensePlate;
        } else {
            this.licensePlate = "";
        }
    }
}
