package com.amazon.alexa.accessory;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Accessory implements Parcelable {
    public static final Parcelable.Creator<Accessory> CREATOR = new Parcelable.Creator<Accessory>() { // from class: com.amazon.alexa.accessory.Accessory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Accessory createFromParcel(Parcel parcel) {
            return new Accessory(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Accessory[] newArray(int i) {
            return new Accessory[i];
        }
    };
    public static final int ERROR_ALREADY_STARTED = 1;
    public static final int ERROR_INTERNAL = 3;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_UNSUPPORTED = 2;
    private final String address;
    private final String name;
    private final AccessoryTransport.Type transport;

    public Accessory(Parcel parcel) {
        this.address = parcel.readString();
        this.transport = AccessoryTransport.Type.values()[parcel.readInt()];
        this.name = parcel.readString();
    }

    public static String getErrorString(int i) {
        if (i == 0) {
            return "ERROR_UNKNOWN";
        }
        if (i == 1) {
            return "ERROR_ALREADY_STARTED";
        }
        if (i == 2) {
            return "ERROR_UNSUPPORTED";
        }
        if (i == 3) {
            return "ERROR_INTERNAL";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown error code "));
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Accessory.class == obj.getClass()) {
            Accessory accessory = (Accessory) obj;
            if (this.transport == accessory.transport && this.address.equals(accessory.address)) {
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public AccessoryTransport.Type getTransport() {
        return this.transport;
    }

    public boolean hasName() {
        return this.name != null;
    }

    public int hashCode() {
        return this.address.hashCode() + (this.transport.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Accessory{transport=");
        sb.append(this.transport);
        sb.append(", address='");
        sb.append(this.address);
        sb.append("', name='");
        return a$$ExternalSyntheticOutline0.m(sb, this.name, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.address);
        parcel.writeInt(this.transport.ordinal());
        parcel.writeString(this.name);
    }

    public Accessory(String str, AccessoryTransport.Type type) {
        this(str, type, null);
    }

    public Accessory(String str, AccessoryTransport.Type type, String str2) {
        Preconditions.notNull(type, "transport");
        Preconditions.notNull(str, "address");
        this.transport = type;
        this.address = str;
        this.name = str2;
    }
}
