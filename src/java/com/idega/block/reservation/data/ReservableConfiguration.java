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

import java.sql.Date;
import java.sql.Time;


public interface ReservableConfiguration {

	public Time getReservableFrom();
	public Time getReservableTo();
	
	public Date getValidFrom();
	public Date getValidTo();
	
	public int getInterval();
	public int getNumberOfReservationsForTimeslot();
	
}