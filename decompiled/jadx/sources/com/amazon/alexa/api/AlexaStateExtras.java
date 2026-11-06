package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaStateExtras implements Parcelable {
    public static final Parcelable.Creator<AlexaStateExtras> CREATOR = new Parcelable.Creator<AlexaStateExtras>() { // from class: com.amazon.alexa.api.AlexaStateExtras.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaStateExtras createFromParcel(Parcel parcel) {
            return new AlexaStateExtras(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaStateExtras[] newArray(int i) {
            return new AlexaStateExtras[i];
        }
    };

    @Nullable
    private String wakeword;

    public AlexaStateExtras(Parcel parcel) {
        this.wakeword = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getWakeword() {
        return this.wakeword;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.wakeword);
    }

    public AlexaStateExtras(String str) {
        this.wakeword = str;
    }
}
