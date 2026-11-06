package com.amazon.alexa.redesign.utils;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u000f\u001a\u00020\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/utils/WeblabTreatmentWithTTL;", "", "featureNamespace", "", "featureName", "fallbackTreatment", "ttlMs", "", com.amazon.dee.app.services.featureservice.Constants.KEY_FEATURE_SERVICE, "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/amazon/alexa/featureservice/api/FeatureServiceV2;)V", "lastAccessMs", "Ljava/lang/Long;", "lastTreatment", "getTreatment", "isExpired", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class WeblabTreatmentWithTTL {
    public static final int $stable = 8;

    @NotNull
    private final String fallbackTreatment;

    @NotNull
    private final String featureName;

    @NotNull
    private final String featureNamespace;

    @NotNull
    private final FeatureServiceV2 featureService;

    @Nullable
    private Long lastAccessMs;

    @Nullable
    private String lastTreatment;
    private final long ttlMs;

    public WeblabTreatmentWithTTL(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull FeatureServiceV2 featureServiceV2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        featureServiceV2.getClass();
        this.featureNamespace = str;
        this.featureName = str2;
        this.fallbackTreatment = str3;
        this.ttlMs = j;
        this.featureService = featureServiceV2;
    }

    private final boolean isExpired() {
        if (this.lastTreatment == null || this.lastAccessMs == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.lastAccessMs;
        return currentTimeMillis - (l != null ? l.longValue() : 0L) > this.ttlMs;
    }

    @NotNull
    public final String getTreatment() {
        if (isExpired()) {
            Log.i("WeblabTreatmentWithTTL", "Cache expired, fetching new treatment");
            this.lastAccessMs = Long.valueOf(System.currentTimeMillis());
            String treatmentAndRecordTrigger = this.featureService.getTreatmentAndRecordTrigger(this.featureNamespace, this.featureName, this.fallbackTreatment);
            this.lastTreatment = treatmentAndRecordTrigger;
            a$$ExternalSyntheticOutline0.m3m("New treatment: ", treatmentAndRecordTrigger, "WeblabTreatmentWithTTL");
        }
        String str = this.lastTreatment;
        return str == null ? this.fallbackTreatment : str;
    }
}
