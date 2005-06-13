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


/**
 * An interface object that allow reservations.
 * 
 * Last modified: $Date$ by $Author$
 * 
 * @author <a href="mailto:laddi@idega.com">laddi</a>
 * @version $Revision$
 */
public interface Reservable {
	
  /**
   * Gets the ReservableConfiguration for the Reservable object
   * 
   * @return The default configuration
   */
	public ReservableConfiguration getConfig();

  /**
   * Gets the ReservableConfiguration for the Reservable object
   * 
   * @return The configuration that is valid within the given date
   */
	public ReservableConfiguration getConfig(Date date);
	
  /**
   * Gets the name of the Reservable object
   * 
   * @return String
   */
  public String getName();

  /**
   * Gets the description of the Reservable object
   * 
   * @return String
   */
  public String getDescription();
}