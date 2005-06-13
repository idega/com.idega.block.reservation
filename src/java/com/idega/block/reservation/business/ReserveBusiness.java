/*
 * $Id$
 * Created on Jun 12, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.reservation.business;

import java.sql.Timestamp;
import javax.ejb.CreateException;
import javax.ejb.RemoveException;
import com.idega.block.reservation.data.Reservable;
import com.idega.block.reservation.data.Reservation;
import com.idega.user.data.User;


public interface ReserveBusiness {

  /**
   * Creates a reservation to the Reservable object for the given User with the from/to Timestamps provided.
   * 
   * @return The newly created Reservable.
   */
	public Reservation reserve(Reservable reservable, User user, Timestamp from, Timestamp to) throws CreateException;
	
  /**
   * Cancels the reservation.
   * 
   * @return Returns true if cancellation succeded.
   */
	public boolean cancelReservation(Reservation reservation) throws RemoveException;
}