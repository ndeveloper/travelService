package com.ndeveloper.travel.hotel;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface HotelServiceLocal {
    
    public boolean makeRservation(Integer roomNumber, Date from, Date to, String name);

}
