package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetCardinalityRequest extends AmazonWebServiceRequest implements Serializable {
    private String aggregationField;
    private String indexName;
    private String queryString;
    private String queryVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCardinalityRequest)) {
            return false;
        }
        GetCardinalityRequest getCardinalityRequest = (GetCardinalityRequest) obj;
        if ((getCardinalityRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (getCardinalityRequest.getIndexName() != null && !getCardinalityRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((getCardinalityRequest.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        if (getCardinalityRequest.getQueryString() != null && !getCardinalityRequest.getQueryString().equals(getQueryString())) {
            return false;
        }
        if ((getCardinalityRequest.getAggregationField() == null) ^ (getAggregationField() == null)) {
            return false;
        }
        if (getCardinalityRequest.getAggregationField() != null && !getCardinalityRequest.getAggregationField().equals(getAggregationField())) {
            return false;
        }
        if ((getCardinalityRequest.getQueryVersion() == null) ^ (getQueryVersion() == null)) {
            return false;
        }
        return getCardinalityRequest.getQueryVersion() == null || getCardinalityRequest.getQueryVersion().equals(getQueryVersion());
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

    public GetCardinalityRequest withAggregationField(String str) {
        this.aggregationField = str;
        return this;
    }

    public GetCardinalityRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public GetCardinalityRequest withQueryString(String str) {
        this.queryString = str;
        return this;
    }

    public GetCardinalityRequest withQueryVersion(String str) {
        this.queryVersion = str;
        return this;
    }
}
