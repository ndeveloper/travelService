package com.ndeveloper.travel.auto;

import java.util.Date;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

/**
 * Session Bean implementation class CarService
 */
@Stateless
@WebService
public class CarService implements CarServiceLocal {
    
    Logger logger = Logger.getLogger(CarService.class);

    /**
     * Default constructor. 
     */
    public CarService() {
	// TODO Auto-generated constructor stub
    }

    public boolean makeCarReservation(String name, Date from, Date to) {
	logger.info("reservacion de auto para " + name + " - " + from + " - " + to);
	return true;
    }

}