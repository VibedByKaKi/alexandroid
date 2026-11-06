package com.amazon.alexa.client.alexaservice.features.launcher;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Reasons;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_TargetState extends TargetState {
    private final List<Reasons> decisionReasons;
    private final boolean isFallbackSelected;
    private final Intent launchIntent;

    public AutoValue_TargetState(@Nullable Intent intent, boolean z, List<Reasons> list) {
        this.launchIntent = intent;
        this.isFallbackSelected = z;
        if (list != null) {
            this.decisionReasons = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null decisionReasons");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.TargetState
    public List<Reasons> decisionReasons() {
        return this.decisionReasons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TargetState) {
            TargetState targetState = (TargetState) obj;
            Intent intent = this.launchIntent;
            if (intent != null ? intent.equals(targetState.launchIntent()) : targetState.launchIntent() == null) {
                if (this.isFallbackSelected == targetState.isFallbackSelected() && this.decisionReasons.equals(targetState.decisionReasons())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Intent intent = this.launchIntent;
        return this.decisionReasons.hashCode() ^ (((((intent == null ? 0 : intent.hashCode()) ^ 1000003) * 1000003) ^ (this.isFallbackSelected ? 1231 : 1237)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.TargetState
    public boolean isFallbackSelected() {
        return this.isFallbackSelected;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.TargetState
    @Nullable
    public Intent launchIntent() {
        return this.launchIntent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TargetState{launchIntent=");
        sb.append(this.launchIntent);
        sb.append(", isFallbackSelected=");
        sb.append(this.isFallbackSelected);
        sb.append(", decisionReasons=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.decisionReasons, sb);
    }
}
