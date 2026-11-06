package io.branch.referral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum AdType {
    BANNER("BANNER"),
    INTERSTITIAL("INTERSTITIAL"),
    REWARDED_VIDEO("REWARDED_VIDEO"),
    NATIVE("NATIVE");

    private final String name;

    AdType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
