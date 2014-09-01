# About

A document about the design rationale

# Code style

Please refer to the [google][1]

# Goal

* Fetching ```data``` from ```somewhere```

Below is the clarification of ```data``` and ```somewhere```

## Clarification of data

* Performer

Our library must be able to fetch information about a particular performer.
For example, name of the performer, id of the performer on a particular query
system, picture etc.

* Event

Our library must be able to fetch information about events from a pariticular
performer. Information like name of the event, date of the event etc must be
provided.

* Venue

Information about the event location. Our library must be able to query events
take place here.

## Clarification of somewhere

* Eventful

Currently, the only one source of our project

[1]: http://google-styleguide.googlecode.com/svn/trunk/javaguide.html
