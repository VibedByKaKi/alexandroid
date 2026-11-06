package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StringStartsWith extends SubstringMatcher {
    public StringStartsWith(String str) {
        super(str);
    }

    @Factory
    public static Matcher<String> startsWith(String str) {
        return new StringStartsWith(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public boolean evalSubstringOf(String str) {
        return str.startsWith(this.substring);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public String relationship() {
        return "starting with";
    }
}
