package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetStatisticsRequest extends AmazonWebServiceRequest implements Serializable {
    private String aggregationField;
    private String indexName;
    private String queryString;
    private String queryVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetStatisticsRequest)) {
            return false;
        }
        GetStatisticsRequest getStatisticsRequest = (GetStatisticsRequest) obj;
        if ((getStatisticsRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (getStatisticsRequest.getIndexName() != null && !getStatisticsRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((getStatisticsRequest.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        if (getStatisticsRequest.getQueryString() != null && !getStatisticsRequest.getQueryString().equals(getQueryString())) {
            return false;
        }
        if ((getStatisticsRequest.getAggregationField() == null) ^ (getAggregationField() == null)) {
            return false;
        }
        if (getStatisticsRequest.getAggregationField() != null && !getStatisticsRequest.getAggregationField().equals(getAggregationField())) {
            return false;
        }
        if ((getStatisticsRequest.getQueryVersion() == null) ^ (getQueryVersion() == null)) {
            return false;
        }
        return getStatisticsRequest.getQueryVersion() == null || getStatisticsRequest.getQueryVersion().equals(getQueryVersion());
    }

    public String getAggregationField() {
        return this.aggregationField;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getQueryVersion() {
        return this.queryVersion;
    }

    public int hashCode() {
        return (((((((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getQueryString() == null ? 0 : getQueryString().hashCode())) * 31) + (getAggregationField() == null ? 0 : getAggregationField().hashCode())) * 31) + (getQueryVersion() != null ? getQueryVersion().hashCode() : 0);
    }

    public void setAggregationField(String str) {
        this.aggregationField = str;
    }

    public void setIndexName(String str) {
        this.indexName = str;
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
        if (getAggregationField() != null) {
            sb.append("aggregationField: " + getAggregationField() + ",");
        }
        if (getQueryVersion() != null) {
            sb.append("queryVersion: " + getQueryVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetStatisticsRequest withAggregationField(String str) {
        this.aggregationField = str;
        return this;
    }

    public GetStatisticsRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public GetStatisticsRequest withQueryString(String str) {
        this.queryString = str;
        return this;
    }

    public GetStatisticsRequest withQueryVersion(String str) {
        this.queryVersion = str;
        return this;
    }
}
