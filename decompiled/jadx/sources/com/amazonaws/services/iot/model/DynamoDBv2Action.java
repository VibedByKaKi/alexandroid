package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DynamoDBv2Action implements Serializable {
    private PutItemInput putItem;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DynamoDBv2Action)) {
            return false;
        }
        DynamoDBv2Action dynamoDBv2Action = (DynamoDBv2Action) obj;
        if ((dynamoDBv2Action.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (dynamoDBv2Action.getRoleArn() != null && !dynamoDBv2Action.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((dynamoDBv2Action.getPutItem() == null) ^ (getPutItem() == null)) {
            return false;
        }
        return dynamoDBv2Action.getPutItem() == null || dynamoDBv2Action.getPutItem().equals(getPutItem());
    }

    public PutItemInput getPutItem() {
        return this.putItem;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getPutItem() != null ? getPutItem().hashCode() : 0);
    }

    public void setPutItem(PutItemInput putItemInput) {
        this.putItem = putItemInput;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getPutItem() != null) {
            sb.append("putItem: " + getPutItem());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DynamoDBv2Action withPutItem(PutItemInput putItemInput) {
        this.putItem = putItemInput;
        return this;
    }

    public DynamoDBv2Action withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
