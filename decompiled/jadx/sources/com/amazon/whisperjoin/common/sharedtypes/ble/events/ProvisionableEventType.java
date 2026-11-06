package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionableEventType implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ProvisionableEventType> CREATOR = new Parcelable.ClassLoaderCreator<ProvisionableEventType>() { // from class: com.amazon.whisperjoin.common.sharedtypes.ble.events.ProvisionableEventType.1
        @Override // android.os.Parcelable.Creator
        public ProvisionableEventType createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ProvisionableEventType(parcel, ProvisionableEventType.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ProvisionableEventType[] newArray(int i) {
            if (i >= 0) {
                return new ProvisionableEventType[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ProvisionableEventType createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ProvisionableEventType(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String EVENT_KEY_KEY = "ek";
    private static final String EVENT_UUID_KEY = "eu";
    private static final String TAG = "ProvisionableEventType";
    private final int mEventType;
    private final UUID mEventUuid;

    private ProvisionableEventType(Parcel parcel, ClassLoader classLoader) {
        this.mEventUuid = UUID.fromString(parcel.readString());
        this.mEventType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public UUID getEventUuid() {
        return this.mEventUuid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionableEventType [uuid=");
        sb.append(this.mEventUuid);
        sb.append(", type=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mEventType, MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        } else {
            parcel.writeString(this.mEventUuid.toString());
            parcel.writeInt(this.mEventType);
        }
    }

    public ProvisionableEventType(UUID uuid, int i) {
        if (uuid != null) {
            this.mEventUuid = uuid;
            this.mEventType = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            throw null;
        }
    }
}
