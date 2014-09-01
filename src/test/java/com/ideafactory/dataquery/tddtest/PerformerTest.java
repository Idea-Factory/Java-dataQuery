/**
 * An unit test for Class::Performer
 *
 * @author Mond Wan
 */

package com.ideafactory.dataquery.test;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import com.ideafactory.dataquery.Performer;

/**
 * Test for {@link Performer}
 */
public class PerformerTest {
  @Test
    public void getInstance() {
      HashMap<String, String> hint = new HashMap<String, String>();

      // Empty hint
      Performer p = new Performer(hint);
      org.junit.Assert.assertNull(p.getEngName());

      hint.put("engName", "Jay Chou");
      hint.put("nationality", "Taiwan");
      hint.put("id", "abc123");

      // Real test
      p = new Performer(hint);
    }
}
