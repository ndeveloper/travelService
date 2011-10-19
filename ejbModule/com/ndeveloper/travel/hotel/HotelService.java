package com.ndeveloper.travel.hotel;

import java.util.Date;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

/**
 * Session Bean implementation class HotelService
 */
@Stateless
@WebService
public class HotelService implements HotelServiceLocal {
    
    Logger logger = Logger.getLogger(HotelService.class);
    
    /**
     * Default constructor. 
     */
    public HotelService() {
        // TODO Auto-generated constructor stub
    }


    public boolean makeRservation(Integer roomNumber, Date from, Date to, String name) {
	logger.info("reservacion para " + name + " - " + roomNumber + " - " + from + " - " + to);
	return true;
    }

}
