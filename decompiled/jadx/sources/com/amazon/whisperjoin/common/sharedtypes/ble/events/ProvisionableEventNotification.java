package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionableEventNotification implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ProvisionableEventNotification> CREATOR = new Parcelable.ClassLoaderCreator<ProvisionableEventNotification>() { // from class: com.amazon.whisperjoin.common.sharedtypes.ble.events.ProvisionableEventNotification.1
        @Override // android.os.Parcelable.Creator
        public ProvisionableEventNotification createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ProvisionableEventNotification(parcel, ProvisionableEventNotification.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ProvisionableEventNotification[] newArray(int i) {
            if (i >= 0) {
                return new ProvisionableEventNotification[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ProvisionableEventNotification createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ProvisionableEventNotification(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String TAG = "ProvisionableEventNotification";
    private final int mEventKey;
    private final int mEventType;

    private ProvisionableEventNotification(Parcel parcel, ClassLoader classLoader) {
        this.mEventKey = parcel.readInt();
        this.mEventType = parcel.readInt();
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
            ProvisionableEventNotification provisionableEventNotification = (ProvisionableEventNotification) obj;
            if (this.mEventKey == provisionableEventNotification.mEventKey && this.mEventType == provisionableEventNotification.mEventType) {
                return true;
            }
        }
        return false;
    }

    public int getEventKey() {
        return this.mEventKey;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public int hashCode() {
        return (this.mEventKey * 31) + this.mEventType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisioningEventNotification [key=");
        sb.append(this.mEventKey);
        sb.append(", type=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mEventType, MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        } else {
            parcel.writeInt(this.mEventKey);
            parcel.writeInt(this.mEventType);
        }
    }

    public ProvisionableEventNotification(int i, int i2) {
        this.mEventKey = i;
        this.mEventType = i2;
    }
}
