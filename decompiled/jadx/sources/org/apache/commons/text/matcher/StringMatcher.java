package org.apache.commons.text.matcher;

import org.apache.commons.lang3.CharSequenceUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface StringMatcher {
    default StringMatcher andThen(StringMatcher stringMatcher) {
        return StringMatcherFactory.INSTANCE.andMatcher(this, stringMatcher);
    }

    default int isMatch(CharSequence charSequence, int i) {
        return isMatch(charSequence, i, 0, charSequence.length());
    }

    int isMatch(char[] cArr, int i, int i2, int i3);

    default int size() {
        return 0;
    }

    default int isMatch(char[] cArr, int i) {
        return isMatch(cArr, i, 0, cArr.length);
    }

    default int isMatch(CharSequence charSequence, int i, int i2, int i3) {
        return isMatch(CharSequenceUtils.toCharArray(charSequence), i, i3, i3);
    }
}
