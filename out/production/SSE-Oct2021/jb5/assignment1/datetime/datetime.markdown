###Date-Time API
**1)** I would use the ```LocalDateTime``` class to store my birthday in years, months, days, seconds, and nanoseconds.

**2)** Given a random date (using the ```LocalDate``` class), I would use the ```TemporalAdjuster``` interface to get the date of the previous Thursday.
```
LocalDate date = LocalDate.now();
LocalDate thursday = date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
```

**3)** ```ZoneId``` takes the time of year and region into account when evaluating the offset from the GMT/UTC timezone while ```ZoneOffset``` does not.

**4)** To convert an ```Instant``` to a ```ZoneDateTime```, you would use the ```.atZone()``` method of ```Instant```, supplying a ```ZoneId``` along with it.
```
ZoneDateTime now = Instant.now().atZone(ZoneId.systemDefault());
```

To convert a ```ZoneDateTime``` to an ```Instant```, you would use the ```.toInstant()``` method of ```ZonedDateTime```.
```
Instant now = ZonedDateTime.now().toInstant();
```