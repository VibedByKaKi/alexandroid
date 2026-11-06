package com.amazon.leaderselection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
enum PreferredOpinion {
    PREFERRED,
    NOT_PREFERRED,
    UNKNOWN;

    public static PreferredOpinion create(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }
}
