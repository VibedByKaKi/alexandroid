package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeScheduledAuditResult implements Serializable {
    private String dayOfMonth;
    private String dayOfWeek;
    private String frequency;
    private String scheduledAuditArn;
    private String scheduledAuditName;
    private List<String> targetCheckNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeScheduledAuditResult)) {
            return false;
        }
        DescribeScheduledAuditResult describeScheduledAuditResult = (DescribeScheduledAuditResult) obj;
        if ((describeScheduledAuditResult.getFrequency() == null) ^ (getFrequency() == null)) {
            return false;
        }
        if (describeScheduledAuditResult.getFrequency() != null && !describeScheduledAuditResult.getFrequency().equals(getFrequency())) {
            return false;
        }
        if ((describeScheduledAuditResult.getDayOfMonth() == null) ^ (getDayOfMonth() == null)) {
            return false;
        }
        if (describeScheduledAuditResult.getDayOfMonth() != null && !describeScheduledAuditResult.getDayOfMonth().equals(getDayOfMonth())) {
            return false;
        }
        if ((describeScheduledAuditResult.getDayOfWeek() == null) ^ (getDayOfWeek() == null)) {
            return false;
        }
        if (describeScheduledAuditResult.getDayOfWeek() != null && !describeScheduledAuditResult.getDayOfWeek().equals(getDayOfWeek())) {
            return false;
        }
        if ((describeScheduledAuditResult.getTargetCheckNames() == null) ^ (getTargetCheckNames() == null)) {
            return false;
        }
        if (describeScheduledAuditResult.getTargetCheckNames() != null && !describeScheduledAuditResult.getTargetCheckNames().equals(getTargetCheckNames())) {
            return false;
        }
        if ((describeScheduledAuditResult.getScheduledAuditName() == null) ^ (getScheduledAuditName() == null)) {
            return false;
        }
        if (describeScheduledAuditResult.getScheduledAuditName() != null && !describeScheduledAuditResult.getScheduledAuditName().equals(getScheduledAuditName())) {
            return false;
        }
        if ((describeScheduledAuditResult.getScheduledAuditArn() == null) ^ (getScheduledAuditArn() == null)) {
            return false;
        }
        return describeScheduledAuditResult.getScheduledAuditArn() == null || describeScheduledAuditResult.getScheduledAuditArn().equals(getScheduledAuditArn());
    }

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public String getScheduledAuditArn() {
        return this.scheduledAuditArn;
    }

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    public List<String> getTargetCheckNames() {
        return this.targetCheckNames;
    }

    public int hashCode() {
        return (((((((((((getFrequency() == null ? 0 : getFrequency().hashCode()) + 31) * 31) + (getDayOfMonth() == null ? 0 : getDayOfMonth().hashCode())) * 31) + (getDayOfWeek() == null ? 0 : getDayOfWeek().hashCode())) * 31) + (getTargetCheckNames() == null ? 0 : getTargetCheckNames().hashCode())) * 31) + (getScheduledAuditName() == null ? 0 : getScheduledAuditName().hashCode())) * 31) + (getScheduledAuditArn() != null ? getScheduledAuditArn().hashCode() : 0);
    }

    public void setDayOfMonth(String str) {
        this.dayOfMonth = str;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
    }

    public void setFrequency(AuditFrequency auditFrequency) {
        this.frequency = auditFrequency.toString();
    }

    public void setScheduledAuditArn(String str) {
        this.scheduledAuditArn = str;
    }

    public void setScheduledAuditName(String str) {
        this.scheduledAuditName = str;
    }

    public void setTargetCheckNames(Collection<String> collection) {
        if (collection == null) {
            this.targetCheckNames = null;
        } else {
            this.targetCheckNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFrequency() != null) {
            sb.append("frequency: " + getFrequency() + ",");
        }
        if (getDayOfMonth() != null) {
            sb.append("dayOfMonth: " + getDayOfMonth() + ",");
        }
        if (getDayOfWeek() != null) {
            sb.append("dayOfWeek: " + getDayOfWeek() + ",");
        }
        if (getTargetCheckNames() != null) {
            sb.append("targetCheckNames: " + getTargetCheckNames() + ",");
        }
        if (getScheduledAuditName() != null) {
            sb.append("scheduledAuditName: " + getScheduledAuditName() + ",");
        }
        if (getScheduledAuditArn() != null) {
            sb.append("scheduledAuditArn: " + getScheduledAuditArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeScheduledAuditResult withDayOfMonth(String str) {
        this.dayOfMonth = str;
        return this;
    }

    public DescribeScheduledAuditResult withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    public DescribeScheduledAuditResult withFrequency(AuditFrequency auditFrequency) {
        this.frequency = auditFrequency.toString();
        return this;
    }

    public DescribeScheduledAuditResult withScheduledAuditArn(String str) {
        this.scheduledAuditArn = str;
        return this;
    }

    public DescribeScheduledAuditResult withScheduledAuditName(String str) {
        this.scheduledAuditName = str;
        return this;
    }

    public DescribeScheduledAuditResult withTargetCheckNames(String... strArr) {
        if (getTargetCheckNames() == null) {
            this.targetCheckNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.targetCheckNames.add(str);
        }
        return this;
    }

    public void setDayOfWeek(String str) {
        this.dayOfWeek = str;
    }

    public void setFrequency(String str) {
        this.frequency = str;
    }

    public DescribeScheduledAuditResult withDayOfWeek(String str) {
        this.dayOfWeek = str;
        return this;
    }

    public DescribeScheduledAuditResult withFrequency(String str) {
        this.frequency = str;
        return this;
    }

    public DescribeScheduledAuditResult withTargetCheckNames(Collection<String> collection) {
        setTargetCheckNames(collection);
        return this;
    }
}
