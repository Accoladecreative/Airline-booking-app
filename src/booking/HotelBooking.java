/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class HotelBooking extends Booking{
    private String hotel;
    private Date checkIn;
    private int duration;
    private double costPerDay;

    public HotelBooking(String number, String customer,
            String hotel, Date checkIn, int duration, double costPerDay)
    {
        super(number, customer);
        this.hotel = hotel;       
        this.checkIn = checkIn;
        this.duration = duration;
        this.costPerDay = costPerDay;
        
        

    }
    
    
    @Override
    public double price() {
        double totalPrice = duration * costPerDay;
        
        //discount
        if(duration > 5 ){
          double discount =  .1 * totalPrice;
          return totalPrice - discount;
        }else{
            return totalPrice;
        }
        
      }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HotelBooking{");
        sb.append("hotel=").append(hotel);
        sb.append(", checkIn=").append(checkIn);
        sb.append(", duration=").append(duration);
        sb.append(", costPerDay=").append(costPerDay);
        sb.append('}');
        return sb.toString();
    }
 
    
    
    public static void main(String[] args) {
        
    }
 
}
