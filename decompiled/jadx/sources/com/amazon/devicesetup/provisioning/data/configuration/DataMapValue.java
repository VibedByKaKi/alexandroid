package com.amazon.devicesetup.provisioning.data.configuration;

import com.google.common.base.Objects;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DataMapValue {
    private Boolean booleanValue;
    private byte[] bytesValue;
    private Integer integerValue;
    private String stringValue;

    public DataMapValue(byte[] bArr) {
        if (bArr != null) {
            this.bytesValue = (byte[]) bArr.clone();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bytesValue can not be null");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DataMapValue dataMapValue = (DataMapValue) obj;
            if (Arrays.equals(this.bytesValue, dataMapValue.bytesValue) && Objects.equal(this.stringValue, dataMapValue.stringValue) && Objects.equal(this.integerValue, dataMapValue.integerValue) && Objects.equal(this.booleanValue, dataMapValue.booleanValue)) {
                return true;
            }
        }
        return false;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public byte[] getBytesValue() {
        byte[] bArr = this.bytesValue;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int hashCode() {
        return Objects.hashCode(this.bytesValue, this.stringValue, this.integerValue, this.booleanValue);
    }

    public DataMapValue(String str) {
        if (str != null) {
            this.stringValue = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("stringValue can not be null");
            throw null;
        }
    }

    public DataMapValue(Integer num) {
        if (num != null) {
            this.integerValue = num;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("integerValue can not be null");
            throw null;
        }
    }

    public DataMapValue(Boolean bool) {
        if (bool != null) {
            this.booleanValue = bool;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("booleanValue can not be null");
            throw null;
        }
    }
}
