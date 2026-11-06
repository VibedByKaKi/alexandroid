package com.amazon.alexa.ra.features.featurecheck;

import com.amazon.alexa.feature.consumer.api.Treatment;
import com.amazon.alexa.ra.core.features.featurecheck.TreatmentVariant;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVariant", "Lcom/amazon/alexa/ra/core/features/featurecheck/TreatmentVariant;", "Lcom/amazon/alexa/feature/consumer/api/Treatment;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FeatureFlagKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Treatment.values().length];
            try {
                iArr[Treatment.C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Treatment.T1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Treatment.T2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Treatment.T3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Treatment.T4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Treatment.T5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Treatment.T6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Treatment.T7.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Treatment.T8.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Treatment.T9.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TreatmentVariant toVariant(@NotNull Treatment treatment) {
        treatment.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[treatment.ordinal()]) {
            case 1:
                return TreatmentVariant.C;
            case 2:
                return TreatmentVariant.T1;
            case 3:
                return TreatmentVariant.T2;
            case 4:
                return TreatmentVariant.T3;
            case 5:
                return TreatmentVariant.T4;
            case 6:
                return TreatmentVariant.T5;
            case 7:
                return TreatmentVariant.T6;
            case 8:
                return TreatmentVariant.T7;
            case 9:
                return TreatmentVariant.T8;
            case 10:
                return TreatmentVariant.T9;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
