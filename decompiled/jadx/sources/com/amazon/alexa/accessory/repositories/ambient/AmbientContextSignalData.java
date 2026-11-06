package com.amazon.alexa.accessory.repositories.ambient;

import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AmbientContextSignalData {
    private final int confidenceScore;
    private final AmbientContextCategory signalType;
    private final String timestamp;
    private final int uncertaintyInMillis;
    private final int value;

    public AmbientContextSignalData(String str, AmbientContextCategory ambientContextCategory, int i, int i2, byte[] bArr) {
        Preconditions.notNull(str, "timestamp");
        Preconditions.notNull(ambientContextCategory, "signalType");
        Preconditions.notNull(bArr, "value");
        Preconditions.precondition(bArr.length == 4, "value must be 4 bytes");
        this.timestamp = str;
        this.signalType = ambientContextCategory;
        this.confidenceScore = i;
        this.uncertaintyInMillis = i2;
        this.value = ByteBuffer.wrap(bArr).getInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AmbientContextSignalData ambientContextSignalData = (AmbientContextSignalData) obj;
            if (this.confidenceScore == ambientContextSignalData.confidenceScore && this.uncertaintyInMillis == ambientContextSignalData.uncertaintyInMillis && this.value == ambientContextSignalData.value && Objects.equals(this.timestamp, ambientContextSignalData.timestamp) && this.signalType == ambientContextSignalData.signalType) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public AcousticEventType getAcousticEventType() {
        return AcousticEventType.fromValue(this.value);
    }

    @Nullable
    public ActivityState getActivityState() {
        return ActivityState.fromValue(this.value);
    }

    public int getConfidenceScore() {
        return this.confidenceScore;
    }

    public AmbientContextCategory getSignalType() {
        return this.signalType;
    }

    @Nullable
    public SpeakingState getSpeakingState() {
        return SpeakingState.fromValue(this.value);
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public int getUncertaintyInMillis() {
        return this.uncertaintyInMillis;
    }

    public int hashCode() {
        return Objects.hash(this.timestamp, this.signalType, Integer.valueOf(this.confidenceScore), Integer.valueOf(this.uncertaintyInMillis), Integer.valueOf(this.value));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AmbientContextSignalData{timestamp='");
        sb.append(this.timestamp);
        sb.append(", signalType=");
        sb.append(this.signalType);
        sb.append(", confidenceScore=");
        sb.append(this.confidenceScore);
        sb.append(", uncertaintyInMillis=");
        sb.append(this.uncertaintyInMillis);
        sb.append(", value=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.value, AbstractJsonLexerKt.END_OBJ);
    }
}
