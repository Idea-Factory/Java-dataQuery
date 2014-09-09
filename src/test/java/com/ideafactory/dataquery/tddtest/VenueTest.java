/**
 * An unit test for Class::Venue
 *
 * @author Tony Ngan
 */

package com.ideafactory.dataquery.tddtest;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import com.ideafactory.dataquery.Venue;

/**
 * Test for {@link Venue}
 */
public class VenueTest {
  @Test
    public void getInstance() {
      HashMap<String, String> hint = new HashMap<String, String>();

      /**
      * protected String id;
      * protected String name;
      * protected String cityName;
      * protected String address;
      * protected double longitude; //Use for support map finder later
      * protected double latitude;
      */

      // Empty hint
      Venue v = new Venue(hint);
      org.junit.Assert.assertNull(v.getName());

      hint.put("id", "V0-001-000102741-0");
      hint.put("name", "Humphrey's Concerts By the Bay");
      hint.put("longitude", "-117.222");
      hint.put("latitude", "32.7173");
      hint.put("cityName", "San Diego");
      hint.put("address", "2241 Shelter Island Drive");

      // Real test
      v = new Venue(hint);
      org.junit.Assert.assertEquals("V0-001-000102741-0", v.getId());
      org.junit.Assert.assertEquals("Humphrey's Concerts By the Bay", v.getName());
      org.junit.Assert.assertEquals("San Diego", v.getCityName());
      org.junit.Assert.assertEquals("2241 Shelter Island Drive", v.getAddress());
    }
}
