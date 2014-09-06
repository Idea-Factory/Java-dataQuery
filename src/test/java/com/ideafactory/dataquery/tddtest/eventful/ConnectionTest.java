/**
 * Unit test for class::Connection
 *
 * @author Mond Wan
 */

package com.ideafactory.dataquery.tddtest.eventful;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.json.JSONObject;

import java.util.HashMap;

import com.ideafactory.dataquery.eventful.Connection;

public class ConnectionTest {
  @Test
    public void constructPerformerSearchURL() {
      Connection c = new Connection();

      // Construct a HashMap
      HashMap<String, String> params = this.createDefaultHashMap();
      params.put("keywords", "jay chou");

      String url = c.prepareURL("performers/search", params);
      org.junit.Assert.assertEquals(
        "http://api.eventful.com/json/performers/search?" +
          "app_key=CfdZBmff5hcGvCxH&keywords=jay+chou",
        url
      );
    }

  @Test(expected=IllegalArgumentException.class)
    public void passIllegalArgumentMethodToPrepareURL() {
      Connection c = new Connection();

      // Construct a HashMap
      HashMap<String, String> params = this.createDefaultHashMap();
      params.put("keywords", "jay chou");

      c.prepareURL("oops", params);
    }

  @Test
    public void queryPerformer() {
      Connection c = new Connection();

      // Construct a HashMap
      HashMap<String, String> params = this.createDefaultHashMap();
      params.put("keywords", "jay chou");

      String url = c.prepareURL("performers/search", params);

      JSONObject obj = c.query(url);

      org.junit.Assert.assertNotNull(obj);
    }

  /**
   * Helper function for constructing a default HashMap for testing
   *
   * @return HashMap<String, String>
   */
  protected HashMap<String, String> createDefaultHashMap() {
    HashMap<String, String> ret = new HashMap<String, String>();

    ret.put("app_key", "CfdZBmff5hcGvCxH");

    return ret;
  }
}
