package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaAplCommand implements Parcelable {
    public static final Parcelable.Creator<AlexaAplCommand> CREATOR = new Parcelable.Creator<AlexaAplCommand>() { // from class: com.amazon.alexa.api.AlexaAplCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaAplCommand createFromParcel(Parcel parcel) {
            return new AlexaAplCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaAplCommand[] newArray(int i) {
            return new AlexaAplCommand[i];
        }
    };
    private final boolean isSpeechSuppressed;
    private final String name;
    private final String payload;
    private final String presentationUri;
    private final String requestId;

    public AlexaAplCommand(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getPayload() {
        return this.payload;
    }

    @Nullable
    public String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public String getRequestId() {
        return this.requestId;
    }

    public boolean isSpeechSuppressed() {
        return this.isSpeechSuppressed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.payload);
        parcel.writeString(this.requestId);
        parcel.writeInt(this.isSpeechSuppressed ? 1 : 0);
        parcel.writeString(this.presentationUri);
    }

    public AlexaAplCommand(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        this.name = str;
        this.payload = str2;
        this.requestId = str3;
        this.isSpeechSuppressed = z;
        this.presentationUri = str4;
    }

    public AlexaAplCommand(String str, String str2, @Nullable String str3, boolean z) {
        this(str, str2, str3, z, null);
    }
}
