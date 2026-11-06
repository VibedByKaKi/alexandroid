package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SearchIndexRequest extends AmazonWebServiceRequest implements Serializable {
    private String indexName;
    private Integer maxResults;
    private String nextToken;
    private String queryString;
    private String queryVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchIndexRequest)) {
            return false;
        }
        SearchIndexRequest searchIndexRequest = (SearchIndexRequest) obj;
        if ((searchIndexRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (searchIndexRequest.getIndexName() != null && !searchIndexRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((searchIndexRequest.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        if (searchIndexRequest.getQueryString() != null && !searchIndexRequest.getQueryString().equals(getQueryString())) {
            return false;
        }
        if ((searchIndexRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (searchIndexRequest.getNextToken() != null && !searchIndexRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((searchIndexRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (searchIndexRequest.getMaxResults() != null && !searchIndexRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((searchIndexRequest.getQueryVersion() == null) ^ (getQueryVersion() == null)) {
            return false;
        }
        return searchIndexRequest.getQueryVersion() == null || searchIndexRequest.getQueryVersion().equals(getQueryVersion());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getQueryVersion() {
        return this.queryVersion;
    }

    public int hashCode() {
        return (((((((((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getQueryString() == null ? 0 : getQueryString().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getQueryVersion() != null ? getQueryVersion().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public void setQueryVersion(String str) {
        this.queryVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIndexName() != null) {
            sb.append("indexName: " + getIndexName() + ",");
        }
        if (getQueryString() != null) {
            sb.append("queryString: " + getQueryString() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getQueryVersion() != null) {
            sb.append("queryVersion: " + getQueryVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SearchIndexRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public SearchIndexRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public SearchIndexRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public SearchIndexRequest withQueryString(String str) {
        this.queryString = str;
        return this;
    }

    public SearchIndexRequest withQueryVersion(String str) {
        this.queryVersion = str;
        return this;
    }
}
