package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TestMetricFilterRequest extends AmazonWebServiceRequest implements Serializable {
    private String filterPattern;
    private List<String> logEventMessages;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TestMetricFilterRequest)) {
            return false;
        }
        TestMetricFilterRequest testMetricFilterRequest = (TestMetricFilterRequest) obj;
        if ((testMetricFilterRequest.getFilterPattern() == null) ^ (getFilterPattern() == null)) {
            return false;
        }
        if (testMetricFilterRequest.getFilterPattern() != null && !testMetricFilterRequest.getFilterPattern().equals(getFilterPattern())) {
            return false;
        }
        if ((testMetricFilterRequest.getLogEventMessages() == null) ^ (getLogEventMessages() == null)) {
            return false;
        }
        return testMetricFilterRequest.getLogEventMessages() == null || testMetricFilterRequest.getLogEventMessages().equals(getLogEventMessages());
    }

    public String getFilterPattern() {
        return this.filterPattern;
    }

    public List<String> getLogEventMessages() {
        return this.logEventMessages;
    }

    public int hashCode() {
        return (((getFilterPattern() == null ? 0 : getFilterPattern().hashCode()) + 31) * 31) + (getLogEventMessages() != null ? getLogEventMessages().hashCode() : 0);
    }

    public void setFilterPattern(String str) {
        this.filterPattern = str;
    }

    public void setLogEventMessages(Collection<String> collection) {
        if (collection == null) {
            this.logEventMessages = null;
        } else {
            this.logEventMessages = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFilterPattern() != null) {
            sb.append("filterPattern: " + getFilterPattern() + ",");
        }
        if (getLogEventMessages() != null) {
            sb.append("logEventMessages: " + getLogEventMessages());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TestMetricFilterRequest withFilterPattern(String str) {
        this.filterPattern = str;
        return this;
    }

    public TestMetricFilterRequest withLogEventMessages(String... strArr) {
        if (getLogEventMessages() == null) {
            this.logEventMessages = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.logEventMessages.add(str);
        }
        return this;
    }

    public TestMetricFilterRequest withLogEventMessages(Collection<String> collection) {
        setLogEventMessages(collection);
        return this;
    }
}
