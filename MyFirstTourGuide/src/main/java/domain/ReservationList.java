package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReservationList {
	
	private int id;
	
	private List<Reservation> confirmedReservations;
	
	private ReservationList(){
		confirmedReservations = new LinkedList<>();
	}
	
	private static class Singleton{
		private static final ReservationList reservationList = new ReservationList(); 
	}
	
	public static ReservationList getInstance(){
		return Singleton.reservationList;
	}
	
	public boolean saveConfirmedReservation(Tour tour, Tourist tourist, Guide guide){
		Reservation reservation =  checkReservationExist(tour);
		if(reservation != null){
			return reservation.addTourList(tourist);
		}else{
			reservation = new Reservation(tour, tourist, guide);
			return true;
		}
		
	}
	
	private Reservation checkReservationExist(Tour tour){
		Iterator<Reservation> reservationIter = confirmedReservations.iterator();
		while(reservationIter.hasNext()){
			Reservation reservation = reservationIter.next();
			if(reservation.getTour() == tour){
				return reservation;
			}
		}
		return null;
	}
	
}
