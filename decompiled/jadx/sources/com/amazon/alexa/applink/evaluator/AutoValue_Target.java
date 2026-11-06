package com.amazon.alexa.applink.evaluator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_Target extends Target {
    private final String catalogId;
    private final String identifier;
    private final boolean isMandatoryToLaunchTarget;
    private final TargetIdentifierType targetIdentifierType;

    public AutoValue_Target(@Nullable String str, String str2, TargetIdentifierType targetIdentifierType, boolean z) {
        this.catalogId = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null identifier");
            throw null;
        }
        this.identifier = str2;
        if (targetIdentifierType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null targetIdentifierType");
            throw null;
        }
        this.targetIdentifierType = targetIdentifierType;
        this.isMandatoryToLaunchTarget = z;
    }

    @Override // com.amazon.alexa.applink.evaluator.Target
    @Nullable
    public String catalogId() {
        return this.catalogId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Target) {
            Target target = (Target) obj;
            String str = this.catalogId;
            if (str != null ? str.equals(target.catalogId()) : target.catalogId() == null) {
                if (this.identifier.equals(target.identifier()) && this.targetIdentifierType.equals(target.targetIdentifierType()) && this.isMandatoryToLaunchTarget == target.isMandatoryToLaunchTarget()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.catalogId;
        return (this.isMandatoryToLaunchTarget ? 1231 : 1237) ^ (((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003) ^ this.targetIdentifierType.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.applink.evaluator.Target
    @NonNull
    public String identifier() {
        return this.identifier;
    }

    @Override // com.amazon.alexa.applink.evaluator.Target
    public boolean isMandatoryToLaunchTarget() {
        return this.isMandatoryToLaunchTarget;
    }

    @Override // com.amazon.alexa.applink.evaluator.Target
    @NonNull
    public TargetIdentifierType targetIdentifierType() {
        return this.targetIdentifierType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target{catalogId=");
        sb.append(this.catalogId);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", targetIdentifierType=");
        sb.append(this.targetIdentifierType);
        sb.append(", isMandatoryToLaunchTarget=");
        return a$$ExternalSyntheticOutline0.m(sb, this.isMandatoryToLaunchTarget, StringSubstitutor.DEFAULT_VAR_END);
    }
}
