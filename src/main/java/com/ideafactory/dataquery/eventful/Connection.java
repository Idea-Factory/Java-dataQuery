/**
 * A class provides a bunch of methods to query eventful database
 *
 * @author Mond Wan
 */

package com.ideafactory.dataquery.eventful;

import java.util.HashMap;
import java.util.Map;

import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.io.InputStream;

import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONObject;

public class Connection {
  // Hard coding a list of supported methods
  protected static final String[] methods = {
    "performers/search",
    "performers/events/list"
  };

  // Request JSON respond
  protected static final String baseURL = "http://api.eventful.com/json/";

  /**
   * Helper function for creating URL for asking eventful database
   *
   * @param method String
   * @param params HashMap<String, String>
   * @return String
   * @throws IllegalArgumentException
   *   - if invalid method is given
   *   - if UTF-8 is not a supported encoding on URLEncoder
   */
  public String prepareURL(String method, HashMap<String, String> params)
    throws IllegalArgumentException {

    String ret = Connection.baseURL + method + "?";
    boolean first = true;
    boolean illegalMethod = true;

    // Validate given method is a supported method
    for (String s: Connection.methods) {
      if (s.equals(method)) {
        illegalMethod = false;
        break;
      }
    }
    if (illegalMethod) {
      throw new IllegalArgumentException(
        String.format("Invalid method |%s|", method)
      );
    }

    for (Map.Entry<String, String>entry : params.entrySet()) {
      try {
        // Skip null
        if ((entry.getValue() == null) || (entry.getKey() == null)) {
          continue;
        }
        if (entry.getValue().length() == 0) {
          continue;
        }

        if (first) {
          first = false;
        } else {
          ret += "&";
        }

        ret += String.format(
          "%s=%s",
          URLEncoder.encode(entry.getKey(), "UTF-8"),
          URLEncoder.encode(entry.getValue(), "UTF-8")
        );
      } catch(UnsupportedEncodingException e) {
        throw new IllegalArgumentException(e);
      }
    }

    return ret;
  }

  /**
   * Query the eventful database
   *
   * @param location String
   * @return JSONObject
   */
  public JSONObject query(String location) {

    return null;
  }
}
