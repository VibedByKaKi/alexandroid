package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // com.amazon.coral.google.common.base.CommonPattern
    public int flags() {
        return this.pattern.flags();
    }

    @Override // com.amazon.coral.google.common.base.CommonPattern
    public CommonMatcher matcher(CharSequence charSequence) {
        return new JdkMatcher(this.pattern.matcher(charSequence));
    }

    @Override // com.amazon.coral.google.common.base.CommonPattern
    public String pattern() {
        return this.pattern.pattern();
    }

    @Override // com.amazon.coral.google.common.base.CommonPattern
    public String toString() {
        return this.pattern.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JdkMatcher extends CommonMatcher {
        final Matcher matcher;

        public JdkMatcher(Matcher matcher) {
            this.matcher = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public int end() {
            return this.matcher.end();
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public boolean find() {
            return this.matcher.find();
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public boolean matches() {
            return this.matcher.matches();
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public String replaceAll(String str) {
            return this.matcher.replaceAll(str);
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public int start() {
            return this.matcher.start();
        }

        @Override // com.amazon.coral.google.common.base.CommonMatcher
        public boolean find(int i) {
            return this.matcher.find(i);
        }
    }
}
