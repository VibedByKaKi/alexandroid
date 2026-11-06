package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaItemFragmentsMetadata implements Parcelable {
    public static final Parcelable.Creator<AlexaItemFragmentsMetadata> CREATOR = new Parcelable.Creator<AlexaItemFragmentsMetadata>() { // from class: com.amazon.alexa.api.AlexaItemFragmentsMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaItemFragmentsMetadata createFromParcel(Parcel parcel) {
            return new AlexaItemFragmentsMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaItemFragmentsMetadata[] newArray(int i) {
            return new AlexaItemFragmentsMetadata[i];
        }
    };
    private static final int MAX_RESULTS_UNSET = 0;

    @Nullable
    private final String after;

    @Nullable
    private final String before;
    private final String itemId;
    private final int maxResults;

    @Nullable
    private final String personId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String after;
        private String before;
        private String itemId;
        private int maxResults;
        private String personId;

        private Builder() {
            this.maxResults = 0;
        }

        public AlexaItemFragmentsMetadata build() {
            return new AlexaItemFragmentsMetadata(this);
        }

        public Builder setAfter(String str) {
            this.after = str;
            return this;
        }

        public Builder setBefore(String str) {
            this.before = str;
            return this;
        }

        public Builder setItemId(String str) {
            this.itemId = str;
            return this;
        }

        public Builder setMaxResults(int i) {
            this.maxResults = i;
            return this;
        }

        public Builder setPersonId(String str) {
            this.personId = str;
            return this;
        }
    }

    public AlexaItemFragmentsMetadata(Builder builder) {
        this(builder.itemId, builder.personId, builder.before, builder.after, builder.maxResults);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getAfter() {
        return this.after;
    }

    @Nullable
    public String getBefore() {
        return this.before;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getMaxResults() {
        return this.maxResults;
    }

    @Nullable
    public String getPersonId() {
        return this.personId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.personId);
        parcel.writeString(this.before);
        parcel.writeString(this.after);
        parcel.writeInt(this.maxResults);
    }

    private AlexaItemFragmentsMetadata(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i) {
        this.itemId = str;
        this.personId = str2;
        this.before = str3;
        this.after = str4;
        this.maxResults = i;
    }

    public AlexaItemFragmentsMetadata(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
    }
}
