package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StringContains extends SubstringMatcher {
    public StringContains(String str) {
        super(str);
    }

    @Factory
    public static Matcher<String> containsString(String str) {
        return new StringContains(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public boolean evalSubstringOf(String str) {
        return str.indexOf(this.substring) >= 0;
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public String relationship() {
        return "containing";
    }
}
