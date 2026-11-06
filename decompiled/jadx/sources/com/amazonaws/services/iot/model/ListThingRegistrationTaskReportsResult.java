package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingRegistrationTaskReportsResult implements Serializable {
    private String nextToken;
    private String reportType;
    private List<String> resourceLinks;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingRegistrationTaskReportsResult)) {
            return false;
        }
        ListThingRegistrationTaskReportsResult listThingRegistrationTaskReportsResult = (ListThingRegistrationTaskReportsResult) obj;
        if ((listThingRegistrationTaskReportsResult.getResourceLinks() == null) ^ (getResourceLinks() == null)) {
            return false;
        }
        if (listThingRegistrationTaskReportsResult.getResourceLinks() != null && !listThingRegistrationTaskReportsResult.getResourceLinks().equals(getResourceLinks())) {
            return false;
        }
        if ((listThingRegistrationTaskReportsResult.getReportType() == null) ^ (getReportType() == null)) {
            return false;
        }
        if (listThingRegistrationTaskReportsResult.getReportType() != null && !listThingRegistrationTaskReportsResult.getReportType().equals(getReportType())) {
            return false;
        }
        if ((listThingRegistrationTaskReportsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listThingRegistrationTaskReportsResult.getNextToken() == null || listThingRegistrationTaskReportsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getReportType() {
        return this.reportType;
    }

    public List<String> getResourceLinks() {
        return this.resourceLinks;
    }

    public int hashCode() {
        return (((((getResourceLinks() == null ? 0 : getResourceLinks().hashCode()) + 31) * 31) + (getReportType() == null ? 0 : getReportType().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType.toString();
    }

    public void setResourceLinks(Collection<String> collection) {
        if (collection == null) {
            this.resourceLinks = null;
        } else {
            this.resourceLinks = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceLinks() != null) {
            sb.append("resourceLinks: " + getResourceLinks() + ",");
        }
        if (getReportType() != null) {
            sb.append("reportType: " + getReportType() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingRegistrationTaskReportsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingRegistrationTaskReportsResult withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    public ListThingRegistrationTaskReportsResult withResourceLinks(String... strArr) {
        if (getResourceLinks() == null) {
            this.resourceLinks = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.resourceLinks.add(str);
        }
        return this;
    }

    public void setReportType(String str) {
        this.reportType = str;
    }

    public ListThingRegistrationTaskReportsResult withReportType(String str) {
        this.reportType = str;
        return this;
    }

    public ListThingRegistrationTaskReportsResult withResourceLinks(Collection<String> collection) {
        setResourceLinks(collection);
        return this;
    }
}
