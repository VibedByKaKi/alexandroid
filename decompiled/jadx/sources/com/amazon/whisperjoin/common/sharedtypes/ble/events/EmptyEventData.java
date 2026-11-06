package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EmptyEventData implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<EmptyEventData> CREATOR = new Parcelable.ClassLoaderCreator<EmptyEventData>() { // from class: com.amazon.whisperjoin.common.sharedtypes.ble.events.EmptyEventData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public EmptyEventData createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new EmptyEventData();
        }

        @Override // android.os.Parcelable.Creator
        public EmptyEventData[] newArray(int i) {
            return new EmptyEventData[i];
        }

        @Override // android.os.Parcelable.Creator
        public EmptyEventData createFromParcel(Parcel parcel) {
            return new EmptyEventData();
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
