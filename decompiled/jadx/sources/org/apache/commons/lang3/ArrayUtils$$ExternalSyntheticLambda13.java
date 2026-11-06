package org.apache.commons.lang3;

import com.amazon.coral.metrics.Metrics;
import com.amazon.coral.util.http.uri.UriSpecificityShadowMatcherMap;
import com.amazon.coral.util.http.uri.ValuedMatch;
import java.util.StringJoiner;
import java.util.function.Supplier;
import org.apache.commons.lang3.stream.LangCollectors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ArrayUtils$$ExternalSyntheticLambda13 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ArrayUtils$$ExternalSyntheticLambda13(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object[] lambda$addAll$0;
        ValuedMatch lambda$match$0;
        StringJoiner lambda$joining$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$addAll$0 = ArrayUtils.lambda$addAll$0((Class) this.f$0, (Object[]) this.f$1, (Object[]) this.f$2);
                return lambda$addAll$0;
            case 1:
                lambda$match$0 = ((UriSpecificityShadowMatcherMap) this.f$0).lambda$match$0((CharSequence) this.f$1, (Metrics) this.f$2);
                return lambda$match$0;
            default:
                lambda$joining$0 = LangCollectors.lambda$joining$0((CharSequence) this.f$0, (CharSequence) this.f$1, (CharSequence) this.f$2);
                return lambda$joining$0;
        }
    }
}
