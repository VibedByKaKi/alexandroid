package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UpdateWakeWordsEvent extends UpdateWakeWordsEvent {
    private final List<String> wakeWords;

    public AutoValue_UpdateWakeWordsEvent(List<String> list) {
        if (list != null) {
            this.wakeWords = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null wakeWords");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateWakeWordsEvent) {
            return this.wakeWords.equals(((UpdateWakeWordsEvent) obj).getWakeWords());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.UpdateWakeWordsEvent
    public List<String> getWakeWords() {
        return this.wakeWords;
    }

    public int hashCode() {
        return this.wakeWords.hashCode() ^ 1000003;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.wakeWords, new StringBuilder("UpdateWakeWordsEvent{wakeWords="));
    }
}
