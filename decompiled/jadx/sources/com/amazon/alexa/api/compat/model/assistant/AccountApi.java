package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class AccountApi {
    public abstract void logout();

    public abstract void sendSynchronizeStateEvent();

    public abstract void setRegion(String str);

    @Deprecated
    public abstract void setUserProfile(String str, String str2);

    public abstract void setUserProfileV2(String str, String str2, boolean z);

    public abstract void updateBMCLEntitlementStatus(boolean z, String str);
}
