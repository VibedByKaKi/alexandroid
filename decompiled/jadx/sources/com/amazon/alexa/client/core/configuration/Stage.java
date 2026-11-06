package com.amazon.alexa.client.core.configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum Stage {
    ALPHA("alpha"),
    BETA("beta"),
    GAMMA("gamma"),
    PRE_RELEASE("pre-release"),
    PRE_PROD("pre-prod"),
    DOMAIN_TESTING("domain-testing"),
    PROD("prod");

    private final String stage;

    Stage(String str) {
        this.stage = str;
    }

    public static Stage from(String str) {
        for (Stage stage : values()) {
            if (stage.toString().equals(str)) {
                return stage;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stage;
    }
}
