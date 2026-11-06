package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FilterLogEventsResult implements Serializable {
    private List<FilteredLogEvent> events;
    private String nextToken;
    private List<SearchedLogStream> searchedLogStreams;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FilterLogEventsResult)) {
            return false;
        }
        FilterLogEventsResult filterLogEventsResult = (FilterLogEventsResult) obj;
        if ((filterLogEventsResult.getEvents() == null) ^ (getEvents() == null)) {
            return false;
        }
        if (filterLogEventsResult.getEvents() != null && !filterLogEventsResult.getEvents().equals(getEvents())) {
            return false;
        }
        if ((filterLogEventsResult.getSearchedLogStreams() == null) ^ (getSearchedLogStreams() == null)) {
            return false;
        }
        if (filterLogEventsResult.getSearchedLogStreams() != null && !filterLogEventsResult.getSearchedLogStreams().equals(getSearchedLogStreams())) {
            return false;
        }
        if ((filterLogEventsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return filterLogEventsResult.getNextToken() == null || filterLogEventsResult.getNextToken().equals(getNextToken());
    }

    public List<FilteredLogEvent> getEvents() {
        return this.events;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<SearchedLogStream> getSearchedLogStreams() {
        return this.searchedLogStreams;
    }

    public int hashCode() {
        return (((((getEvents() == null ? 0 : getEvents().hashCode()) + 31) * 31) + (getSearchedLogStreams() == null ? 0 : getSearchedLogStreams().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setEvents(Collection<FilteredLogEvent> collection) {
        if (collection == null) {
            this.events = null;
        } else {
            this.events = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSearchedLogStreams(Collection<SearchedLogStream> collection) {
        if (collection == null) {
            this.searchedLogStreams = null;
        } else {
            this.searchedLogStreams = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEvents() != null) {
            sb.append("events: " + getEvents() + ",");
        }
        if (getSearchedLogStreams() != null) {
            sb.append("searchedLogStreams: " + getSearchedLogStreams() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public FilterLogEventsResult withEvents(FilteredLogEvent... filteredLogEventArr) {
        if (getEvents() == null) {
            this.events = new ArrayList(filteredLogEventArr.length);
        }
        for (FilteredLogEvent filteredLogEvent : filteredLogEventArr) {
            this.events.add(filteredLogEvent);
        }
        return this;
    }

    public FilterLogEventsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public FilterLogEventsResult withSearchedLogStreams(SearchedLogStream... searchedLogStreamArr) {
        if (getSearchedLogStreams() == null) {
            this.searchedLogStreams = new ArrayList(searchedLogStreamArr.length);
        }
        for (SearchedLogStream searchedLogStream : searchedLogStreamArr) {
            this.searchedLogStreams.add(searchedLogStream);
        }
        return this;
    }

    public FilterLogEventsResult withEvents(Collection<FilteredLogEvent> collection) {
        setEvents(collection);
        return this;
    }

    public FilterLogEventsResult withSearchedLogStreams(Collection<SearchedLogStream> collection) {
        setSearchedLogStreams(collection);
        return this;
    }
}
