/**
 * A data object for storing information about a Venue
 * 
 * @author Tony Ngan
 */

package com.ideafactory.dataquery;

import java.util.HashMap;

public class Venue {

  protected String id;
  protected String name;
  protected String cityName;
  protected String address;
  protected double longitude; //Use for support map finder later
  protected double latitude;

  // Not sure the datatype for this attribute yet
  //protected image picture;

  /**
   * Construtor
   *
   * @param HashMap <String, String>
   * @return Class::Venue
   */
  public Venue(HashMap<String, String> hint)
      throws IllegalArgumentException {
    this.id = hint.get("id");
    this.name = hint.get("name");
    this.longitude = hint.get("longitude");
    this.latitude = hint.get("latitude");
    this.cityName = hint.get("cityName");
    this.address = hint.get("address");
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Point2d getCoordinate() {
    return new Point2d(this.longitude,this.latitude); //Double.parseDouble
  }

  public String getCityName() {
    return this.cityName;
  }

  public String getAddress() {
    return this.address;
  }


}
