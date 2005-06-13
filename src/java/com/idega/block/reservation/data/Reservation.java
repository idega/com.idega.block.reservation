/*
 * $Id$
 * Created on Jun 12, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.reservation.data;

import java.sql.Timestamp;
import com.idega.data.IDOPrimaryKey;
import com.idega.user.data.User;


/**
 * An interface for reservations to Reservable objects.
 * 
 * Last modified: $Date$ by $Author$
 * 
 * @author <a href="mailto:laddi@idega.com">laddi</a>
 * @version $Revision$
 */
public interface Reservation {

  /**
   * Get the unique primary key for this reservation.
   * 
   * @return A unique key represented by a IDOPrimaryKey.
   */
  public IDOPrimaryKey getReservePK();
  
  /**
   * Get the User that did the reservation.
   * 
   * @return	User
   */
  public User getReservedBy();
  
  /**
   * Get the from Timestamp for the reservation.
   * 
   * @return Timestamp
   */
  public Timestamp getReservedFrom();
  
  /**
   * Get the to Timestamp for this reservation.
   * 
   * @return Timestamp
   */
  public Timestamp getReservedTo();
  
  /**
   * Get the from Timestamp for when this reservation was made.
   * 
   * @return Timestamp
   */
  public Timestamp getReservationCreated();
  
  /**
   * Get the Reservable that this reservation is for.
   * 
   * @return Reservable
   */
  public Reservable getReservable();
}