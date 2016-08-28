package com.ansa;

import com.ansa.model.Activity;
import com.ansa.model.CalendarEntry;
import com.ansa.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class CalendarRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<CalendarEntry> getEntries(Location location, Date start, Date end){

        return null;
    }

    public List<CalendarEntry> getEntry(Activity activity, Date start, Date end){
        return null;
    }
}
