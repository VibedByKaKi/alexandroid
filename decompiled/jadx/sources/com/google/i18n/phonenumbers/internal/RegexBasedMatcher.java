package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.RegexCache;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RegexBasedMatcher implements MatcherApi {
    private final RegexCache regexCache = new RegexCache(100);

    private RegexBasedMatcher() {
    }

    public static MatcherApi create() {
        return new RegexBasedMatcher();
    }

    @Override // com.google.i18n.phonenumbers.internal.MatcherApi
    public boolean matchesNationalNumber(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z) {
        Matcher matcher = this.regexCache.getPatternForRegex(phoneNumberDesc.getNationalNumberPattern()).matcher(str);
        if (matcher.matches()) {
            return true;
        }
        return z && matcher.lookingAt();
    }
}
