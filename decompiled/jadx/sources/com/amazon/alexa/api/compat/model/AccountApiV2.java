package com.amazon.alexa.api.compat.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J&\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AccountApiV2;", "", "registerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaUserProfileListener;", "deregisterListener", "setUserProfile", "currentProfile", "Lcom/amazon/alexa/api/compat/model/AlexaUserProfile;", "logout", "setRegion", "region", "Lcom/amazon/alexa/api/compat/model/Region;", "updateBMCLEntitlementStatus", "isBMCLEntitled", "", "entitledBenefit", "", "premiumBenefitLabels", "", "sendSynchronizeStateEventWithGeolocation", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AccountApiV2 {
    void deregisterListener(@NotNull AlexaUserProfileListener listener);

    void logout();

    void registerListener(@NotNull AlexaUserProfileListener listener);

    void sendSynchronizeStateEventWithGeolocation();

    void setRegion(@NotNull Region region);

    void setUserProfile(@NotNull AlexaUserProfile currentProfile);

    void updateBMCLEntitlementStatus(boolean isBMCLEntitled, @NotNull String entitledBenefit);

    default void updateBMCLEntitlementStatus(boolean isBMCLEntitled, @NotNull String entitledBenefit, @NotNull List<String> premiumBenefitLabels) {
        entitledBenefit.getClass();
        premiumBenefitLabels.getClass();
        updateBMCLEntitlementStatus(isBMCLEntitled, entitledBenefit);
    }
}
