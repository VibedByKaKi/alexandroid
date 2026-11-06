package com.amazon.alexa.api.compat.migration.sdk;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FeatureFlagPrecondition;", "Lcom/amazon/alexa/api/compat/migration/sdk/SdkPrecondition;", "featureServiceProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "namespace", "", "flagName", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Z)V", "featureName", "getFeatureName", "()Ljava/lang/String;", "evaluate", "Lcom/amazon/alexa/api/compat/migration/sdk/PreconditionResult;", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FeatureFlagPrecondition implements SdkPrecondition {

    @NotNull
    public static final String CONTROL = "C";

    @NotNull
    public static final String CONTROL_LEGACY = "Control";

    @NotNull
    private static final String TAG = "FeatureFlagPrecondition";

    @NotNull
    private final String featureName;

    @NotNull
    private final Function0<FeatureServiceV2> featureServiceProvider;

    @NotNull
    private final String flagName;

    @NotNull
    private final String namespace;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureFlagPrecondition(@NotNull Function0<? extends FeatureServiceV2> function0, @NotNull String str, @NotNull String str2) {
        function0.getClass();
        str.getClass();
        str2.getClass();
        this.featureServiceProvider = function0;
        this.namespace = str;
        this.flagName = str2;
        this.featureName = a$$ExternalSyntheticOutline0.m$1(str, ":", str2);
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    @NotNull
    public PreconditionResult evaluate() {
        try {
            FeatureServiceV2 invoke = this.featureServiceProvider.invoke();
            if (invoke == null) {
                return PreconditionResult.UNKNOWN;
            }
            String treatmentAndRecordTrigger = invoke.getTreatmentAndRecordTrigger(this.namespace, this.flagName, "C");
            return treatmentAndRecordTrigger == null ? PreconditionResult.UNKNOWN : (Intrinsics.areEqual(treatmentAndRecordTrigger, "C") || Intrinsics.areEqual(treatmentAndRecordTrigger, "Control")) ? PreconditionResult.UNSATISFIED : PreconditionResult.SATISFIED;
        } catch (Exception e) {
            ErrorUtils$$ExternalSyntheticOutline0.m("Failed to evaluate ", getFeatureName(), TAG, e);
            return PreconditionResult.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    @NotNull
    public String getFeatureName() {
        return this.featureName;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "defaultValue is no longer used; evaluate() returns UNKNOWN when the service is unavailable.")
    public FeatureFlagPrecondition(@NotNull Function0<? extends FeatureServiceV2> function0, @NotNull String str, @NotNull String str2, boolean z) {
        this(function0, str, str2);
        function0.getClass();
        str.getClass();
        str2.getClass();
    }
}
