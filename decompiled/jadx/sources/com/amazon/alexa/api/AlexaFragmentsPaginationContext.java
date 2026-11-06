package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaFragmentsPaginationContext implements Parcelable {
    public static final Parcelable.Creator<AlexaFragmentsPaginationContext> CREATOR = new Parcelable.Creator<AlexaFragmentsPaginationContext>() { // from class: com.amazon.alexa.api.AlexaFragmentsPaginationContext.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsPaginationContext createFromParcel(Parcel parcel) {
            return new AlexaFragmentsPaginationContext(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaFragmentsPaginationContext[] newArray(int i) {
            return new AlexaFragmentsPaginationContext[i];
        }
    };

    @Nullable
    private final String after;

    @Nullable
    private final String before;

    @NonNull
    private final RetrievalMode retrievalMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String after;
        private String before;
        private RetrievalMode retrievalMode;

        private Builder() {
            this.retrievalMode = RetrievalMode.ANCHORED;
        }

        public AlexaFragmentsPaginationContext build() {
            return new AlexaFragmentsPaginationContext(this);
        }

        public Builder setAfter(String str) {
            this.after = str;
            return this;
        }

        public Builder setAlexaFragmentsPaginationContext(AlexaFragmentsPaginationContext alexaFragmentsPaginationContext) {
            this.before = alexaFragmentsPaginationContext.before;
            this.after = alexaFragmentsPaginationContext.after;
            this.retrievalMode = alexaFragmentsPaginationContext.retrievalMode != null ? alexaFragmentsPaginationContext.retrievalMode : RetrievalMode.ANCHORED;
            return this;
        }

        public Builder setBefore(String str) {
            this.before = str;
            return this;
        }

        public Builder setRetrievalMode(@NonNull RetrievalMode retrievalMode) {
            this.retrievalMode = retrievalMode;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RetrievalMode {
        ANCHORED,
        SURROUNDING
    }

    public AlexaFragmentsPaginationContext(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), RetrievalMode.values()[parcel.readInt()]);
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

    @NonNull
    public RetrievalMode getRetrievalMode() {
        return this.retrievalMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.before);
        parcel.writeString(this.after);
        RetrievalMode retrievalMode = this.retrievalMode;
        if (retrievalMode != null) {
            parcel.writeInt(retrievalMode.ordinal());
        } else {
            parcel.writeInt(RetrievalMode.ANCHORED.ordinal());
        }
    }

    private AlexaFragmentsPaginationContext(@Nullable String str, @Nullable String str2, @NonNull RetrievalMode retrievalMode) {
        this.before = str;
        this.after = str2;
        this.retrievalMode = retrievalMode == null ? RetrievalMode.ANCHORED : retrievalMode;
    }

    public AlexaFragmentsPaginationContext(Builder builder) {
        this(builder.before, builder.after, builder.retrievalMode);
    }
}
