package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupEventsResponse implements CloudDriveRequest {
    private List<GroupEventResponse> events;
    private String nextToken;
    private String previousToken;

    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupEventsResponse;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest != null) {
            return cloudDriveRequest.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupEventsResponse)) {
            return false;
        }
        ListGroupEventsResponse listGroupEventsResponse = (ListGroupEventsResponse) obj;
        if (!listGroupEventsResponse.canEqual(this)) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listGroupEventsResponse.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        String previousToken = getPreviousToken();
        String previousToken2 = listGroupEventsResponse.getPreviousToken();
        if (previousToken != null ? !previousToken.equals(previousToken2) : previousToken2 != null) {
            return false;
        }
        List<GroupEventResponse> events = getEvents();
        List<GroupEventResponse> events2 = listGroupEventsResponse.getEvents();
        return events != null ? events.equals(events2) : events2 == null;
    }

    public List<GroupEventResponse> getEvents() {
        return this.events;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getPreviousToken() {
        return this.previousToken;
    }

    public int hashCode() {
        String nextToken = getNextToken();
        int hashCode = nextToken == null ? 43 : nextToken.hashCode();
        String previousToken = getPreviousToken();
        int i = (hashCode + 59) * 59;
        int hashCode2 = previousToken == null ? 43 : previousToken.hashCode();
        List<GroupEventResponse> events = getEvents();
        return ((i + hashCode2) * 59) + (events != null ? events.hashCode() : 43);
    }

    public void setEvents(List<GroupEventResponse> list) {
        this.events = list;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setPreviousToken(String str) {
        this.previousToken = str;
    }

    public String toString() {
        return "ListGroupEventsResponse(nextToken=" + getNextToken() + ", previousToken=" + getPreviousToken() + ", events=" + getEvents() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
