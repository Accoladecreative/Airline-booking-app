/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
//public class Booking  {
//    private String number;
//    private String customer;
//    
//    
//    
//}
public abstract class Booking {
    
    private String number;
    private String customer;
    
    public Booking (String number, String customer){
        this.number = number;
        this.customer = customer;
    }
    public abstract double price();
        
    @Override
    public String toString(){
        String nn = "number: "+ number;
        String cu = "customer: "+ customer;
        String result = nn + cu;
        return result;
    }
    
}
//acg-rhcr-jxo
