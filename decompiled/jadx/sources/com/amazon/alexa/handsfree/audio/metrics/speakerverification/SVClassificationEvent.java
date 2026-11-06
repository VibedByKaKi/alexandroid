package com.amazon.alexa.handsfree.audio.metrics.speakerverification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.audio.metrics.wakeword.WakeWordMobilyticsMetadata;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.interprocess.InterProcessMetric;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SVClassificationEvent extends InterProcessMetric {
    public static final Parcelable.Creator<SVClassificationEvent> CREATOR = new Parcelable.Creator<SVClassificationEvent>() { // from class: com.amazon.alexa.handsfree.audio.metrics.speakerverification.SVClassificationEvent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SVClassificationEvent createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            int readInt = parcel.readInt();
            if (readString == null) {
                Log.e(SVClassificationEvent.TAG, "Reading from parcel eventType is null.");
            }
            return new SVClassificationEvent(Objects.toString(readString, ""), new WakeWordMobilyticsMetadata(readString2, readInt), new SpeakerVerificationMobilyticsMetadata(readString3, readFloat, readFloat2, readFloat3));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SVClassificationEvent[] newArray(int i) {
            return new SVClassificationEvent[i];
        }
    };
    private static final String TAG = "SVClassificationEvent";
    private final String mEventType;
    private final SpeakerVerificationMobilyticsMetadata mSpeakerVerificationMetadata;
    private final WakeWordMobilyticsMetadata mWakeWordMetadata;

    public SVClassificationEvent(@NonNull String str, @NonNull WakeWordMobilyticsMetadata wakeWordMobilyticsMetadata, @NonNull SpeakerVerificationMobilyticsMetadata speakerVerificationMobilyticsMetadata) {
        this.mEventType = str;
        this.mWakeWordMetadata = wakeWordMobilyticsMetadata;
        this.mSpeakerVerificationMetadata = speakerVerificationMobilyticsMetadata;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.interprocess.InterProcessMetric
    @Nullable
    public MetricsBuilder populateMetricsBuilder(@NonNull MetricsBuilder metricsBuilder) {
        return metricsBuilder.withSVClassificationMetric(this.mEventType, this.mWakeWordMetadata.getWWModelID(), this.mSpeakerVerificationMetadata.getSVModelID(), this.mSpeakerVerificationMetadata.getSVRawScore(), this.mSpeakerVerificationMetadata.getSVThresholdLowerBound(), this.mSpeakerVerificationMetadata.getSVThresholdUpperBound(), this.mWakeWordMetadata.getWakeWordConfidence());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mEventType);
        parcel.writeString(this.mWakeWordMetadata.getWWModelID());
        parcel.writeString(this.mSpeakerVerificationMetadata.getSVModelID());
        parcel.writeFloat(this.mSpeakerVerificationMetadata.getSVRawScoreFloat());
        parcel.writeFloat(this.mSpeakerVerificationMetadata.getSVThresholdLowerBoundFloat());
        parcel.writeFloat(this.mSpeakerVerificationMetadata.getSVThresholdUpperBoundFloat());
        parcel.writeInt(this.mWakeWordMetadata.getWakeWordConfidenceInt());
    }
}
