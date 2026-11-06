package com.amazon.deecomms.messaging.model.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ClientMessageIdentifier implements Parcelable {
    public static final Parcelable.Creator<ClientMessageIdentifier> CREATOR = new Parcelable.Creator<ClientMessageIdentifier>() { // from class: com.amazon.deecomms.messaging.model.client.ClientMessageIdentifier.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ClientMessageIdentifier createFromParcel(Parcel parcel) {
            return new ClientMessageIdentifier(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ClientMessageIdentifier[] newArray(int i) {
            return new ClientMessageIdentifier[i];
        }
    };

    @JsonIgnore
    private long mClientID;

    @JsonIgnore
    private String mMediaID;
    private long mMessageID;

    public ClientMessageIdentifier(Parcel parcel) {
        this.mMediaID = parcel.readString();
        this.mClientID = parcel.readLong();
        this.mMessageID = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientMessageIdentifier clientMessageIdentifier = (ClientMessageIdentifier) obj;
        if (this.mClientID == clientMessageIdentifier.mClientID && this.mMessageID == clientMessageIdentifier.mMessageID) {
            return Objects.equal(this.mMediaID, clientMessageIdentifier.mMediaID);
        }
        return false;
    }

    public long getClientID() {
        return this.mClientID;
    }

    public String getMediaID() {
        return this.mMediaID;
    }

    public long getMessageID() {
        return this.mMessageID;
    }

    public int hashCode() {
        return Objects.hashCode(this.mMediaID, Long.valueOf(this.mClientID), Long.valueOf(this.mMessageID));
    }

    public void setClientID(long j) {
        this.mClientID = j;
    }

    public void setMediaID(String str) {
        this.mMediaID = str;
    }

    public void setMessageID(long j) {
        this.mMessageID = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientMessageIdentifier { mediaId : '");
        sb.append(this.mMediaID);
        sb.append("', clientId: ");
        sb.append(this.mClientID);
        sb.append(", messageId: ");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.mMessageID, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMediaID);
        parcel.writeLong(this.mClientID);
        parcel.writeLong(this.mMessageID);
    }

    public ClientMessageIdentifier(String str, long j, long j2) {
        this.mMediaID = str;
        this.mClientID = j;
        this.mMessageID = j2;
    }
}
