package com.amazon.alexa.voice.ra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface BmclPreference {
    @Deprecated
    void clearBmclEntitlementStatus();

    void clearEntitledBenefit();

    void clearPremiumBenefitLabels();

    void clearVisualExperienceEntitled();

    @Deprecated
    boolean getBmclEntitlementStatus();

    @Nullable
    String getEntitledBenefit();

    @NonNull
    List<String> getPremiumBenefitLabels();

    boolean isVisualExperienceEntitled();

    @Deprecated
    void setBmclEntitlementStatus(boolean z);

    void setEntitledBenefit(@NonNull String str);

    void setPremiumBenefitLabels(@NonNull List<String> list);

    void setVisualExperienceEntitled(boolean z);
}
