package com.amazon.alexa.accessory.internal.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PrefixSanitizer implements StringSanitizer {
    private final String prefix;

    public PrefixSanitizer(String str) {
        this.prefix = str;
    }

    @Override // com.amazon.alexa.accessory.internal.util.StringSanitizer
    public String sanitize(String str) {
        return StringUtils.removePrefix(str, this.prefix);
    }
}
