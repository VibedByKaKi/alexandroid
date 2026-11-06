package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CustomCommandResponse implements Parcelable {
    public static final Parcelable.Creator<CustomCommandResponse> CREATOR = new Parcelable.Creator<CustomCommandResponse>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.CustomCommandResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomCommandResponse createFromParcel(Parcel parcel) {
            return new CustomCommandResponse(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomCommandResponse[] newArray(int i) {
            return new CustomCommandResponse[i];
        }
    };
    private final String commandUuid;
    private final byte[] payload;

    public CustomCommandResponse(String str, byte[] bArr) {
        this.commandUuid = str;
        this.payload = bArr == null ? null : (byte[]) bArr.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCommandUuid() {
        return this.commandUuid;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.commandUuid);
        parcel.writeByteArray(this.payload);
    }

    public /* synthetic */ CustomCommandResponse(Parcel parcel, int i) {
        this(parcel);
    }

    private CustomCommandResponse(Parcel parcel) {
        this.commandUuid = parcel.readString();
        this.payload = parcel.createByteArray();
    }
}
