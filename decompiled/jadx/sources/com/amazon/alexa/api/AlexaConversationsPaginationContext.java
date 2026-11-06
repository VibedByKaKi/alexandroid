package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaConversationsPaginationContext implements Parcelable {
    public static final Parcelable.Creator<AlexaConversationsPaginationContext> CREATOR = new Parcelable.Creator<AlexaConversationsPaginationContext>() { // from class: com.amazon.alexa.api.AlexaConversationsPaginationContext.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaConversationsPaginationContext createFromParcel(Parcel parcel) {
            return new AlexaConversationsPaginationContext(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaConversationsPaginationContext[] newArray(int i) {
            return new AlexaConversationsPaginationContext[i];
        }
    };

    @Nullable
    private final String nextToken;

    @Nullable
    private final String previousToken;

    public AlexaConversationsPaginationContext(Builder builder) {
        this(builder.previousToken, builder.nextToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getNextToken() {
        return this.nextToken;
    }

    @Nullable
    public String getPreviousToken() {
        return this.previousToken;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.previousToken);
        parcel.writeString(this.nextToken);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String nextToken;
        private String previousToken;

        public AlexaConversationsPaginationContext build() {
            return new AlexaConversationsPaginationContext(this);
        }

        public Builder setNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder setPaginationContext(AlexaConversationsPaginationContext alexaConversationsPaginationContext) {
            this.previousToken = alexaConversationsPaginationContext.previousToken;
            this.nextToken = alexaConversationsPaginationContext.nextToken;
            return this;
        }

        public Builder setPreviousToken(String str) {
            this.previousToken = str;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaConversationsPaginationContext(@Nullable String str, @Nullable String str2) {
        this.previousToken = str;
        this.nextToken = str2;
    }

    public AlexaConversationsPaginationContext(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }
}
