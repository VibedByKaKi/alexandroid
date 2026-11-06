package org.apache.commons.io.serialization;

import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class RegexpClassNameMatcher implements ClassNameMatcher {
    private final Pattern pattern;

    public RegexpClassNameMatcher(Pattern pattern) {
        if (pattern != null) {
            this.pattern = pattern;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Null pattern");
            throw null;
        }
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }

    public RegexpClassNameMatcher(String str) {
        this(Pattern.compile(str));
    }
}
