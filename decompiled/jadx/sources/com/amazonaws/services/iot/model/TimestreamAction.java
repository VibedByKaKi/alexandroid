package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TimestreamAction implements Serializable {
    private String databaseName;
    private List<TimestreamDimension> dimensions;
    private String roleArn;
    private String tableName;
    private TimestreamTimestamp timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TimestreamAction)) {
            return false;
        }
        TimestreamAction timestreamAction = (TimestreamAction) obj;
        if ((timestreamAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (timestreamAction.getRoleArn() != null && !timestreamAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((timestreamAction.getDatabaseName() == null) ^ (getDatabaseName() == null)) {
            return false;
        }
        if (timestreamAction.getDatabaseName() != null && !timestreamAction.getDatabaseName().equals(getDatabaseName())) {
            return false;
        }
        if ((timestreamAction.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (timestreamAction.getTableName() != null && !timestreamAction.getTableName().equals(getTableName())) {
            return false;
        }
        if ((timestreamAction.getDimensions() == null) ^ (getDimensions() == null)) {
            return false;
        }
        if (timestreamAction.getDimensions() != null && !timestreamAction.getDimensions().equals(getDimensions())) {
            return false;
        }
        if ((timestreamAction.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        return timestreamAction.getTimestamp() == null || timestreamAction.getTimestamp().equals(getTimestamp());
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public List<TimestreamDimension> getDimensions() {
        return this.dimensions;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTableName() {
        return this.tableName;
    }

    public TimestreamTimestamp getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getDatabaseName() == null ? 0 : getDatabaseName().hashCode())) * 31) + (getTableName() == null ? 0 : getTableName().hashCode())) * 31) + (getDimensions() == null ? 0 : getDimensions().hashCode())) * 31) + (getTimestamp() != null ? getTimestamp().hashCode() : 0);
    }

    public void setDatabaseName(String str) {
        this.databaseName = str;
    }

    public void setDimensions(Collection<TimestreamDimension> collection) {
        if (collection == null) {
            this.dimensions = null;
        } else {
            this.dimensions = new ArrayList(collection);
        }
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTimestamp(TimestreamTimestamp timestreamTimestamp) {
        this.timestamp = timestreamTimestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getDatabaseName() != null) {
            sb.append("databaseName: " + getDatabaseName() + ",");
        }
        if (getTableName() != null) {
            sb.append("tableName: " + getTableName() + ",");
        }
        if (getDimensions() != null) {
            sb.append("dimensions: " + getDimensions() + ",");
        }
        if (getTimestamp() != null) {
            sb.append("timestamp: " + getTimestamp());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TimestreamAction withDatabaseName(String str) {
        this.databaseName = str;
        return this;
    }

    public TimestreamAction withDimensions(TimestreamDimension... timestreamDimensionArr) {
        if (getDimensions() == null) {
            this.dimensions = new ArrayList(timestreamDimensionArr.length);
        }
        for (TimestreamDimension timestreamDimension : timestreamDimensionArr) {
            this.dimensions.add(timestreamDimension);
        }
        return this;
    }

    public TimestreamAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public TimestreamAction withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public TimestreamAction withTimestamp(TimestreamTimestamp timestreamTimestamp) {
        this.timestamp = timestreamTimestamp;
        return this;
    }

    public TimestreamAction withDimensions(Collection<TimestreamDimension> collection) {
        setDimensions(collection);
        return this;
    }
}
