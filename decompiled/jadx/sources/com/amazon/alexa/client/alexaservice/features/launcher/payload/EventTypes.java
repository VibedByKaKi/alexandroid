package com.amazon.alexa.client.alexaservice.features.launcher.payload;

import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum EventTypes {
    LAUNCH_TARGET_ATTEMPTED("LaunchTargetAttempted"),
    LAUNCH_TARGET_FAILED("LaunchTargetFailed"),
    DISAMBIGUATE_AND_LAUNCH_TARGET_ATTEMPTED("DisambiguateAndLaunchTargetAttempted"),
    DISAMBIGUATE_AND_LAUNCH_TARGET_FAILED("DisambiguateAndLaunchTargetFailed");

    private final String suffix;

    EventTypes(String str) {
        this.suffix = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return a$$ExternalSyntheticOutline0.m$1(AvsApiConstants.Alexa.Launcher.NAMESPACE.getValue(), ".", this.suffix);
    }
}
