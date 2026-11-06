package com.amazon.alexa.presence.bleconn.identity.model;

import com.amazon.alexa.presence.bleconn.helpers.LoggingHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class Key {
    private String key;
    private Integer typeId;
    private ValidTimePeriod validTimePeriod;

    public Key(String str, ValidTimePeriod validTimePeriod) {
        this.key = str;
        this.validTimePeriod = validTimePeriod;
    }

    public String getKey() {
        return this.key;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public ValidTimePeriod getValidTimePeriod() {
        return this.validTimePeriod;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setTypeId(Integer num) {
        this.typeId = num;
    }

    public void setValidTimePeriod(ValidTimePeriod validTimePeriod) {
        this.validTimePeriod = validTimePeriod;
    }

    public String toString() {
        return LoggingHelper.dump(this);
    }

    public Key() {
    }
}
