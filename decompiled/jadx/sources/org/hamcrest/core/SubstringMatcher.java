package org.hamcrest.core;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class SubstringMatcher extends TypeSafeMatcher<String> {
    protected final String substring;

    public SubstringMatcher(String str) {
        this.substring = str;
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(String str, Description description) {
        description.appendText("was \"").appendText(str).appendText(DeviceConfigConstants.DOUBLE_QUOTE);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("a string ").appendText(relationship()).appendText(" ").appendValue(this.substring);
    }

    public abstract boolean evalSubstringOf(String str);

    public abstract String relationship();

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(String str) {
        return evalSubstringOf(str);
    }
}
