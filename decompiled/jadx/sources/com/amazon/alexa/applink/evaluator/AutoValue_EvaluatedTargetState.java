package com.amazon.alexa.applink.evaluator;

import android.content.Intent;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_EvaluatedTargetState extends EvaluatedTargetState {
    private final boolean canLaunch;
    private final InstallStatus installStatus;
    private final boolean isLaunchedInTarget;
    private final Intent launchIntent;
    private final Target target;

    public AutoValue_EvaluatedTargetState(Target target, @Nullable Intent intent, InstallStatus installStatus, boolean z, boolean z2) {
        if (target == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null target");
            throw null;
        }
        this.target = target;
        this.launchIntent = intent;
        if (installStatus == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null installStatus");
            throw null;
        }
        this.installStatus = installStatus;
        this.isLaunchedInTarget = z;
        this.canLaunch = z2;
    }

    @Override // com.amazon.alexa.applink.evaluator.EvaluatedTargetState
    public boolean canLaunch() {
        return this.canLaunch;
    }

    public boolean equals(Object obj) {
        Intent intent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EvaluatedTargetState) {
            EvaluatedTargetState evaluatedTargetState = (EvaluatedTargetState) obj;
            if (this.target.equals(evaluatedTargetState.target()) && ((intent = this.launchIntent) != null ? intent.equals(evaluatedTargetState.launchIntent()) : evaluatedTargetState.launchIntent() == null) && this.installStatus.equals(evaluatedTargetState.installStatus()) && this.isLaunchedInTarget == evaluatedTargetState.isLaunchedInTarget() && this.canLaunch == evaluatedTargetState.canLaunch()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.target.hashCode() ^ 1000003) * 1000003;
        Intent intent = this.launchIntent;
        return ((((((hashCode ^ (intent == null ? 0 : intent.hashCode())) * 1000003) ^ this.installStatus.hashCode()) * 1000003) ^ (this.isLaunchedInTarget ? 1231 : 1237)) * 1000003) ^ (this.canLaunch ? 1231 : 1237);
    }

    @Override // com.amazon.alexa.applink.evaluator.EvaluatedTargetState
    public InstallStatus installStatus() {
        return this.installStatus;
    }

    @Override // com.amazon.alexa.applink.evaluator.EvaluatedTargetState
    public boolean isLaunchedInTarget() {
        return this.isLaunchedInTarget;
    }

    @Override // com.amazon.alexa.applink.evaluator.EvaluatedTargetState
    @Nullable
    public Intent launchIntent() {
        return this.launchIntent;
    }

    @Override // com.amazon.alexa.applink.evaluator.EvaluatedTargetState
    public Target target() {
        return this.target;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EvaluatedTargetState{target=");
        sb.append(this.target);
        sb.append(", launchIntent=");
        sb.append(this.launchIntent);
        sb.append(", installStatus=");
        sb.append(this.installStatus);
        sb.append(", isLaunchedInTarget=");
        sb.append(this.isLaunchedInTarget);
        sb.append(", canLaunch=");
        return a$$ExternalSyntheticOutline0.m(sb, this.canLaunch, StringSubstitutor.DEFAULT_VAR_END);
    }
}
