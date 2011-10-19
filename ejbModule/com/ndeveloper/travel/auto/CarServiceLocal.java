package com.ndeveloper.travel.auto;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface CarServiceLocal {
    
    boolean makeCarReservation(String name, Date from, Date to);

}
