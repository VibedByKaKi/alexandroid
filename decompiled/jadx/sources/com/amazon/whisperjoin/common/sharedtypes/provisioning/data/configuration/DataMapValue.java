package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DataMapValue implements Parcelable {
    public static final Parcelable.Creator<DataMapValue> CREATOR = new Parcelable.Creator<DataMapValue>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration.DataMapValue.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataMapValue createFromParcel(Parcel parcel) {
            if (parcel == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new DataMapValue(bArr);
            }
            if (readInt == 1) {
                return new DataMapValue(parcel.readString());
            }
            if (readInt == 2) {
                return new DataMapValue(Integer.valueOf(parcel.readInt()));
            }
            if (readInt == 3) {
                return new DataMapValue(Boolean.valueOf(parcel.readInt() == 1));
            }
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(readInt, "Unrecognized Type Value: "));
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataMapValue[] newArray(int i) {
            if (i >= 0) {
                return new DataMapValue[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }
    };
    private static final int TYPE_BOOLEAN = 3;
    private static final int TYPE_BYTES = 0;
    private static final int TYPE_INTEGER = 2;
    private static final int TYPE_STRING = 1;
    private Boolean mBooleanValue;
    private byte[] mBytesValue;
    private Integer mIntegerValue;
    private String mStringValue;

    public DataMapValue(byte[] bArr) {
        if (bArr != null) {
            this.mBytesValue = (byte[]) bArr.clone();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bytesValue can not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DataMapValue dataMapValue = (DataMapValue) obj;
            if (Arrays.equals(this.mBytesValue, dataMapValue.mBytesValue) && Objects.equal(this.mStringValue, dataMapValue.mStringValue) && Objects.equal(this.mIntegerValue, dataMapValue.mIntegerValue) && Objects.equal(this.mBooleanValue, dataMapValue.mBooleanValue)) {
                return true;
            }
        }
        return false;
    }

    public Boolean getBooleanValue() {
        return this.mBooleanValue;
    }

    public byte[] getBytesValue() {
        byte[] bArr = this.mBytesValue;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Integer getIntegerValue() {
        return this.mIntegerValue;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public int hashCode() {
        return Objects.hashCode(this.mBytesValue, this.mStringValue, this.mIntegerValue, this.mBooleanValue);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        if (this.mBytesValue != null) {
            parcel.writeInt(0);
            parcel.writeInt(this.mBytesValue.length);
            parcel.writeByteArray(this.mBytesValue);
        } else if (this.mStringValue != null) {
            parcel.writeInt(1);
            parcel.writeString(this.mStringValue);
        } else if (this.mIntegerValue != null) {
            parcel.writeInt(2);
            parcel.writeInt(this.mIntegerValue.intValue());
        } else if (this.mBooleanValue != null) {
            parcel.writeInt(3);
            parcel.writeInt(this.mBooleanValue.booleanValue() ? 1 : 0);
        }
    }

    public DataMapValue(String str) {
        if (str != null) {
            this.mStringValue = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("stringValue can not be null");
            throw null;
        }
    }

    public DataMapValue(Integer num) {
        if (num != null) {
            this.mIntegerValue = num;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("integerValue can not be null");
            throw null;
        }
    }

    public DataMapValue(Boolean bool) {
        if (bool != null) {
            this.mBooleanValue = bool;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("booleanValue can not be null");
            throw null;
        }
    }
}
