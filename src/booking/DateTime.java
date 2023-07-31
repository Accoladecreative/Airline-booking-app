/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "DateTime{" + "date=" + date + ", time=" + time + '}';
    }
    
    
    
}
