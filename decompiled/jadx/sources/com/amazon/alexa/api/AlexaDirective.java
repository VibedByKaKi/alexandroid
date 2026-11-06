package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaDirective implements Parcelable {
    public static final Parcelable.Creator<AlexaDirective> CREATOR = new Parcelable.Creator<AlexaDirective>() { // from class: com.amazon.alexa.api.AlexaDirective.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaDirective createFromParcel(Parcel parcel) {
            return new AlexaDirective(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaDirective[] newArray(int i) {
            return new AlexaDirective[i];
        }
    };
    private final AlexaHeader alexaHeader;
    private final AlexaPayload alexaPayload;

    public AlexaDirective(Parcel parcel) {
        this.alexaHeader = (AlexaHeader) parcel.readParcelable(AlexaHeader.class.getClassLoader());
        this.alexaPayload = (AlexaPayload) parcel.readParcelable(AlexaPayload.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    public AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }

    public String getName() {
        return this.alexaHeader.getName();
    }

    public String getNamespace() {
        return this.alexaHeader.getNamespace();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.alexaHeader, i);
        parcel.writeParcelable(this.alexaPayload, i);
    }

    public AlexaDirective(AlexaHeader alexaHeader, AlexaPayload alexaPayload) {
        this.alexaHeader = alexaHeader;
        this.alexaPayload = alexaPayload;
    }
}
