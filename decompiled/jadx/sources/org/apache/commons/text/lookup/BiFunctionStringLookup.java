package org.apache.commons.text.lookup;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class BiFunctionStringLookup<P, R> implements BiStringLookup<P> {
    private final BiFunction<String, P, R> biFunction;

    private BiFunctionStringLookup(BiFunction<String, P, R> biFunction) {
        this.biFunction = biFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$on$0(Map map, String str, Object obj) {
        return map.get(str);
    }

    public static <U, T> BiFunctionStringLookup<U, T> on(final Map<String, T> map) {
        return on(new BiFunction() { // from class: org.apache.commons.text.lookup.BiFunctionStringLookup$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$on$0;
                lambda$on$0 = BiFunctionStringLookup.lambda$on$0(map, (String) obj, obj2);
                return lambda$on$0;
            }
        });
    }

    @Override // org.apache.commons.text.lookup.BiStringLookup
    public String lookup(String str, P p) {
        BiFunction<String, P, R> biFunction = this.biFunction;
        if (biFunction == null) {
            return null;
        }
        try {
            return Objects.toString(biFunction.apply(str, p), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public String toString() {
        return super.toString() + " [function=" + this.biFunction + MarkdownConstants.RIGHT_BRACKET;
    }

    public static <U, T> BiFunctionStringLookup<U, T> on(BiFunction<String, U, T> biFunction) {
        return new BiFunctionStringLookup<>(biFunction);
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        return lookup(str, null);
    }
}
