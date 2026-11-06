package com.amazon.minerva.client.thirdparty.metric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DataPoint {
    private final String mName;
    private final ValueType mType;
    private final String mValue;

    public DataPoint(String str, ValueType valueType, String str2) {
        this.mName = str;
        this.mType = valueType;
        this.mValue = str2;
    }

    public String getName() {
        return this.mName;
    }

    public ValueType getType() {
        return this.mType;
    }

    public String getValue() {
        return this.mValue;
    }
}
