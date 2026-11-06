package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListV2LoggingLevelsResult implements Serializable {
    private List<LogTargetConfiguration> logTargetConfigurations;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListV2LoggingLevelsResult)) {
            return false;
        }
        ListV2LoggingLevelsResult listV2LoggingLevelsResult = (ListV2LoggingLevelsResult) obj;
        if ((listV2LoggingLevelsResult.getLogTargetConfigurations() == null) ^ (getLogTargetConfigurations() == null)) {
            return false;
        }
        if (listV2LoggingLevelsResult.getLogTargetConfigurations() != null && !listV2LoggingLevelsResult.getLogTargetConfigurations().equals(getLogTargetConfigurations())) {
            return false;
        }
        if ((listV2LoggingLevelsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listV2LoggingLevelsResult.getNextToken() == null || listV2LoggingLevelsResult.getNextToken().equals(getNextToken());
    }

    public List<LogTargetConfiguration> getLogTargetConfigurations() {
        return this.logTargetConfigurations;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getLogTargetConfigurations() == null ? 0 : getLogTargetConfigurations().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setLogTargetConfigurations(Collection<LogTargetConfiguration> collection) {
        if (collection == null) {
            this.logTargetConfigurations = null;
        } else {
            this.logTargetConfigurations = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogTargetConfigurations() != null) {
            sb.append("logTargetConfigurations: " + getLogTargetConfigurations() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListV2LoggingLevelsResult withLogTargetConfigurations(LogTargetConfiguration... logTargetConfigurationArr) {
        if (getLogTargetConfigurations() == null) {
            this.logTargetConfigurations = new ArrayList(logTargetConfigurationArr.length);
        }
        for (LogTargetConfiguration logTargetConfiguration : logTargetConfigurationArr) {
            this.logTargetConfigurations.add(logTargetConfiguration);
        }
        return this;
    }

    public ListV2LoggingLevelsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListV2LoggingLevelsResult withLogTargetConfigurations(Collection<LogTargetConfiguration> collection) {
        setLogTargetConfigurations(collection);
        return this;
    }
}
