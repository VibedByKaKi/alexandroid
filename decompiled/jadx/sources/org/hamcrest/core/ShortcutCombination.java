package org.hamcrest.core;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class ShortcutCombination<T> extends BaseMatcher<T> {
    private final Iterable<Matcher<? super T>> matchers;

    public ShortcutCombination(Iterable<Matcher<? super T>> iterable) {
        this.matchers = iterable;
    }

    @Override // org.hamcrest.SelfDescribing
    public abstract void describeTo(Description description);

    public void describeTo(Description description, String str) {
        description.appendList(MarkdownConstants.LEFT_PARENTHESIS, a$$ExternalSyntheticOutline0.m(" ", str, " "), MarkdownConstants.RIGHT_PARENTHESIS, this.matchers);
    }

    @Override // org.hamcrest.Matcher
    public abstract boolean matches(Object obj);

    public boolean matches(Object obj, boolean z) {
        Iterator<Matcher<? super T>> it2 = this.matchers.iterator();
        while (it2.hasNext()) {
            if (it2.next().matches(obj) == z) {
                return z;
            }
        }
        return !z;
    }
}
