package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SearchedLogStream implements Serializable {
    private String logStreamName;
    private Boolean searchedCompletely;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchedLogStream)) {
            return false;
        }
        SearchedLogStream searchedLogStream = (SearchedLogStream) obj;
        if ((searchedLogStream.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        if (searchedLogStream.getLogStreamName() != null && !searchedLogStream.getLogStreamName().equals(getLogStreamName())) {
            return false;
        }
        if ((searchedLogStream.getSearchedCompletely() == null) ^ (getSearchedCompletely() == null)) {
            return false;
        }
        return searchedLogStream.getSearchedCompletely() == null || searchedLogStream.getSearchedCompletely().equals(getSearchedCompletely());
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public Boolean getSearchedCompletely() {
        return this.searchedCompletely;
    }

    public int hashCode() {
        return (((getLogStreamName() == null ? 0 : getLogStreamName().hashCode()) + 31) * 31) + (getSearchedCompletely() != null ? getSearchedCompletely().hashCode() : 0);
    }

    public Boolean isSearchedCompletely() {
        return this.searchedCompletely;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public void setSearchedCompletely(Boolean bool) {
        this.searchedCompletely = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName() + ",");
        }
        if (getSearchedCompletely() != null) {
            sb.append("searchedCompletely: " + getSearchedCompletely());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SearchedLogStream withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public SearchedLogStream withSearchedCompletely(Boolean bool) {
        this.searchedCompletely = bool;
        return this;
    }
}
