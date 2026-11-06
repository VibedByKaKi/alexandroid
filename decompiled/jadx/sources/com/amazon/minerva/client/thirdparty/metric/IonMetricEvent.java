package com.amazon.minerva.client.thirdparty.metric;

import com.amazon.ion.IonString;
import com.amazon.ion.IonStruct;
import com.amazon.ion.IonSymbol;
import com.amazon.ion.IonTimestamp;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IonMetricEvent {
    private IonTimestamp mClientTimestamp;
    private IonStruct mKeyValuePairs;
    private IonString mMetricEventId;
    private IonSymbol mMetricGroupId;
    private IonSymbol mMetricSchemaId;
    private String mRegion;
    private long mSizeInByte;

    public IonMetricEvent(IonSymbol ionSymbol, IonSymbol ionSymbol2, IonTimestamp ionTimestamp, IonString ionString, IonStruct ionStruct) {
        this.mMetricGroupId = ionSymbol;
        this.mMetricSchemaId = ionSymbol2;
        this.mClientTimestamp = ionTimestamp;
        this.mMetricEventId = ionString;
        this.mKeyValuePairs = ionStruct;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IonMetricEvent ionMetricEvent = (IonMetricEvent) obj;
            if (Objects.equals(this.mMetricGroupId, ionMetricEvent.mMetricGroupId) && Objects.equals(this.mMetricSchemaId, ionMetricEvent.mMetricSchemaId) && Objects.equals(this.mClientTimestamp, ionMetricEvent.mClientTimestamp) && Objects.equals(this.mMetricEventId, ionMetricEvent.mMetricEventId) && Objects.equals(this.mKeyValuePairs, ionMetricEvent.mKeyValuePairs)) {
                return true;
            }
        }
        return false;
    }

    public IonTimestamp getClientTimestamp() {
        return this.mClientTimestamp;
    }

    public IonStruct getKeyValuePairs() {
        return this.mKeyValuePairs;
    }

    public IonString getMetricEventId() {
        return this.mMetricEventId;
    }

    public IonSymbol getMetricGroupId() {
        return this.mMetricGroupId;
    }

    public IonSymbol getMetricSchemaId() {
        return this.mMetricSchemaId;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public long getSizeInByte() {
        return this.mSizeInByte;
    }

    public void setRegion(String str) {
        this.mRegion = str;
    }

    public void setSizeInByte(long j) {
        this.mSizeInByte = j;
    }
}
