package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class LivePreview implements Parcelable {
    public static final Parcelable.Creator<LivePreview> CREATOR = new Parcelable.Creator<LivePreview>() { // from class: com.amazon.alexa.api.LivePreview.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LivePreview createFromParcel(Parcel parcel) {
            return new LivePreview(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LivePreview[] newArray(int i) {
            return new LivePreview[i];
        }
    };

    @NonNull
    private final String id;

    @NonNull
    private final java.util.Locale locale;

    @NonNull
    private final TranscriptSequence sequence;

    @NonNull
    private final String transcript;

    @Nullable
    private final TranscriptDirection transcriptDirection;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String id;
        private java.util.Locale locale;
        private TranscriptSequence sequence;
        private String transcript;
        private TranscriptDirection transcriptDirection;

        private Builder() {
            this.transcriptDirection = TranscriptDirection.LEFT_TO_RIGHT;
        }

        public LivePreview build() {
            return new LivePreview(this);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder locale(String str) {
            this.locale = java.util.Locale.forLanguageTag(str);
            return this;
        }

        public Builder sequence(TranscriptSequence transcriptSequence) {
            this.sequence = transcriptSequence;
            return this;
        }

        public Builder transcript(String str) {
            this.transcript = str;
            return this;
        }

        public Builder transcriptDirection(@Nullable TranscriptDirection transcriptDirection) {
            this.transcriptDirection = transcriptDirection;
            return this;
        }
    }

    public LivePreview(Parcel parcel) {
        this.transcript = parcel.readString();
        this.locale = java.util.Locale.forLanguageTag(parcel.readString());
        this.sequence = TranscriptSequence.valueOf(parcel.readString());
        this.transcriptDirection = TranscriptDirection.valueOf(parcel.readString());
        this.id = parcel.readString();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.id;
    }

    public java.util.Locale getLocale() {
        return this.locale;
    }

    public TranscriptSequence getSequence() {
        return this.sequence;
    }

    public String getTranscript() {
        return this.transcript;
    }

    public TranscriptDirection getTranscriptDirection() {
        return this.transcriptDirection;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveTranscript{sequence=");
        sb.append(this.sequence);
        sb.append(", transcriptDirection=");
        sb.append(this.transcriptDirection);
        sb.append(", text='");
        sb.append(this.transcript);
        sb.append("', locale=");
        sb.append(this.locale);
        sb.append(", id=");
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_OBJ, this.id, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.transcript);
        parcel.writeString(this.locale.toLanguageTag());
        parcel.writeString(this.sequence.name());
        parcel.writeString(this.transcriptDirection.name());
        parcel.writeString(this.id);
    }

    public LivePreview(TranscriptSequence transcriptSequence, TranscriptDirection transcriptDirection, String str, java.util.Locale locale, String str2) {
        this.sequence = transcriptSequence;
        this.transcriptDirection = transcriptDirection;
        this.transcript = str;
        this.locale = locale;
        this.id = str2;
    }

    private LivePreview(Builder builder) {
        this.transcript = builder.transcript;
        this.locale = builder.locale;
        this.transcriptDirection = builder.transcriptDirection;
        this.sequence = builder.sequence;
        this.id = builder.id;
    }
}
