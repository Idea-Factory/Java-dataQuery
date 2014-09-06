/**
 * A concrete implementation for Class::DataQuery
 *
 * @author Mond Wan
 */

package com.ideafactory.dataquery.eventful;

import java.util.List;

import com.ideafactory.dataquery.DataQuery;
import com.ideafactory.dataquery.Event;
import com.ideafactory.dataquery.Performer;

public class EventfulDataQuery extends DataQuery {
  @Override
    public List<Event> searchEventByPerformer(Performer p) {
      return null;
    }

  @Override
    public List<Performer> searchPerformerByName(String n) {
      return null;
    }
}
