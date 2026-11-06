package com.amazon.alexa.identity.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class Utils {
    private static final String FULLY_REGISTERED = "FULLY_REGISTERED";
    private static final String TAG = "Utils";
    private static final String V2_LOG_PREFIX = "IdentityV2 : ";

    private Utils() {
    }

    public static boolean hasProfileAcceptedTerms(UserIdentity userIdentity) {
        UserProfile userProfile;
        if (userIdentity == null || (userProfile = userIdentity.getUserProfile()) == null) {
            return false;
        }
        String alexaTCAcceptanceStatus = userProfile.getAlexaTCAcceptanceStatus();
        if (alexaTCAcceptanceStatus == null) {
            return true;
        }
        return FULLY_REGISTERED.equals(alexaTCAcceptanceStatus);
    }
}
