package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaFragmentsMetadata implements Parcelable {
    public static final Parcelable.Creator<AlexaFragmentsMetadata> CREATOR = new Parcelable.Creator<AlexaFragmentsMetadata>() { // from class: com.amazon.alexa.api.AlexaFragmentsMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsMetadata createFromParcel(Parcel parcel) {
            return new AlexaFragmentsMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsMetadata[] newArray(int i) {
            return new AlexaFragmentsMetadata[i];
        }
    };

    @Nullable
    private final String conversationId;
    private final boolean enableSync;

    @Nullable
    private final String itemId;

    @Nullable
    private final String lastSignificantTurnFragmentUri;

    @Nullable
    private final String lastSignificantTurnTimestamp;

    @Nullable
    private final AlexaFragmentsPaginationContext paginationContext;

    @Nullable
    private final String personId;

    @Nullable
    private final String token;

    @Nullable
    private final String topicId;

    public AlexaFragmentsMetadata(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1, (AlexaFragmentsPaginationContext) parcel.readParcelable(AlexaFragmentsPaginationContext.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean enableSync() {
        return this.enableSync;
    }

    @Nullable
    public String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public String getItemId() {
        return this.itemId;
    }

    @Nullable
    public String getLastSignificantTurnFragmentUri() {
        return this.lastSignificantTurnFragmentUri;
    }

    @Nullable
    public String getLastSignificantTurnTimestamp() {
        return this.lastSignificantTurnTimestamp;
    }

    @Nullable
    public AlexaFragmentsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    public String getPersonId() {
        return this.personId;
    }

    @Nullable
    public String getToken() {
        return this.token;
    }

    @Nullable
    public String getTopicId() {
        return this.topicId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.personId);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.token);
        parcel.writeInt(this.enableSync ? 1 : 0);
        parcel.writeParcelable(this.paginationContext, i);
        parcel.writeString(this.lastSignificantTurnFragmentUri);
        parcel.writeString(this.lastSignificantTurnTimestamp);
        parcel.writeString(this.itemId);
        parcel.writeString(this.topicId);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String conversationId;
        private boolean enableSync;
        private String itemId;
        private String lastSignificantTurnFragmentUri;
        private String lastSignificantTurnTimestamp;
        private AlexaFragmentsPaginationContext paginationContext;
        private String personId;
        private String token;
        private String topicId;

        public AlexaFragmentsMetadata build() {
            return new AlexaFragmentsMetadata(this);
        }

        public Builder setAlexaFragmentsMetadata(AlexaFragmentsMetadata alexaFragmentsMetadata) {
            this.personId = alexaFragmentsMetadata.personId;
            this.conversationId = alexaFragmentsMetadata.conversationId;
            this.token = alexaFragmentsMetadata.token;
            this.enableSync = alexaFragmentsMetadata.enableSync;
            this.paginationContext = alexaFragmentsMetadata.paginationContext;
            this.lastSignificantTurnFragmentUri = alexaFragmentsMetadata.lastSignificantTurnFragmentUri;
            this.lastSignificantTurnTimestamp = alexaFragmentsMetadata.lastSignificantTurnTimestamp;
            this.itemId = alexaFragmentsMetadata.itemId;
            this.topicId = alexaFragmentsMetadata.topicId;
            return this;
        }

        public Builder setConversationId(String str) {
            this.conversationId = str;
            return this;
        }

        public Builder setItemId(String str) {
            this.itemId = str;
            return this;
        }

        public Builder setLastSignificantTurnFragmentUri(String str) {
            this.lastSignificantTurnFragmentUri = str;
            return this;
        }

        public Builder setLastSignificantTurnTimestamp(String str) {
            this.lastSignificantTurnTimestamp = str;
            return this;
        }

        public Builder setPaginationContext(AlexaFragmentsPaginationContext alexaFragmentsPaginationContext) {
            this.paginationContext = alexaFragmentsPaginationContext;
            return this;
        }

        public Builder setPersonId(String str) {
            this.personId = str;
            return this;
        }

        public Builder setSyncEnabled(boolean z) {
            this.enableSync = z;
            return this;
        }

        public Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public Builder setTopicId(String str) {
            this.topicId = str;
            return this;
        }

        private Builder() {
        }
    }

    public AlexaFragmentsMetadata(Builder builder) {
        this(builder.personId, builder.conversationId, builder.token, builder.enableSync, builder.paginationContext, builder.lastSignificantTurnFragmentUri, builder.lastSignificantTurnTimestamp, builder.itemId, builder.topicId);
    }

    private AlexaFragmentsMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable AlexaFragmentsPaginationContext alexaFragmentsPaginationContext, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.personId = str;
        this.conversationId = str2;
        this.token = str3;
        this.enableSync = z;
        this.paginationContext = alexaFragmentsPaginationContext;
        this.lastSignificantTurnFragmentUri = str4;
        this.lastSignificantTurnTimestamp = str5;
        this.itemId = str6;
        this.topicId = str7;
    }

    @Deprecated
    public AlexaFragmentsMetadata(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, false, null, null, null, null, null);
    }
}
