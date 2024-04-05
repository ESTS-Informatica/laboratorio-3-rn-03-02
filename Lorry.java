
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{   
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f€\n", "Numero de pallets", this.numberOfPallets));
        sb.append(String.format("%15s: %4.2f€\n", "Trailers", this.trailers));
        
        return sb.toString();
    }
    
    //Setters e Getters
    public void setNumberOfPallets(){
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers(){
        this.trailers = trailers;
    }
    
    public void setLicensePlate(String licensePlate){
        super.setLicensePlate(licensePlate);
    }
    
    public int getnumberOfPallets(){
        return this.numberOfPallets;
    }
    
    public int getTrailers(){
        return this.trailers;
    }
    
    public String getLicensePlate(){
        return super.getLicensePlate();
    }
}
