package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaFragmentsChunkMetadata implements Parcelable {
    public static final Parcelable.Creator<AlexaFragmentsChunkMetadata> CREATOR = new Parcelable.Creator<AlexaFragmentsChunkMetadata>() { // from class: com.amazon.alexa.api.AlexaFragmentsChunkMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsChunkMetadata createFromParcel(Parcel parcel) {
            return new AlexaFragmentsChunkMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsChunkMetadata[] newArray(int i) {
            return new AlexaFragmentsChunkMetadata[i];
        }
    };
    private final int currentChunkIndex;
    private final String requestId;
    private final int totalChunks;

    private AlexaFragmentsChunkMetadata(Builder builder) {
        this.currentChunkIndex = builder.currentChunkIndex;
        this.totalChunks = builder.totalChunks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCurrentChunkIndex() {
        return this.currentChunkIndex;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getTotalChunks() {
        return this.totalChunks;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentChunkIndex);
        parcel.writeInt(this.totalChunks);
        parcel.writeString(this.requestId);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private int currentChunkIndex;
        private String requestId;
        private int totalChunks;

        public AlexaFragmentsChunkMetadata build() {
            return new AlexaFragmentsChunkMetadata(this);
        }

        public Builder setCurrentChunkIndex(int i) {
            this.currentChunkIndex = i;
            return this;
        }

        public Builder setRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder setTotalChunks(int i) {
            this.totalChunks = i;
            return this;
        }

        private Builder() {
        }
    }

    public AlexaFragmentsChunkMetadata(Parcel parcel) {
        this.currentChunkIndex = parcel.readInt();
        this.totalChunks = parcel.readInt();
        this.requestId = parcel.readString();
    }
}
