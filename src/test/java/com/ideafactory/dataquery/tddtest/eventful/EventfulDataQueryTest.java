/**
 * An unittest for Class::EventfulDataQuery
 *
 * @author Mond Wan
 */

package com.ideafactory.dataquery.tddtest.eventful;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.json.JSONObject;

import java.util.List;

import com.ideafactory.dataquery.Performer;
import com.ideafactory.dataquery.eventful.EventfulDataQuery;

public class EventfulDataQueryTest {
  protected EventfulDataQuery cursor = new EventfulDataQuery();
  @Test
    public void searchPerformerByNameSmokeTest() {
      List<Performer> l = this.cursor.searchPerformerByName("Jay Chou");
      org.junit.Assert.assertNotNull(l);
      org.junit.Assert.assertEquals(1, l.size());
      Performer p = l.get(0);
      org.junit.Assert.assertEquals("P0-001-000045643-9", p.getId());
      org.junit.Assert.assertEquals("Jay Chou", p.getEngName());
    }
}
