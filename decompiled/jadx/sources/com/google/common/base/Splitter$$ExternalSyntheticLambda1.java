package com.google.common.base;

import com.google.common.base.Splitter;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Splitter$$ExternalSyntheticLambda1 implements Splitter.Strategy {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Splitter$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Splitter.Strategy
    public final Iterator iterator(Splitter splitter, CharSequence charSequence) {
        Iterator lambda$on$1;
        Iterator lambda$on$0;
        Iterator lambda$onPatternInternal$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$on$1 = Splitter.lambda$on$1((String) obj, splitter, charSequence);
                return lambda$on$1;
            case 1:
                lambda$on$0 = Splitter.lambda$on$0((CharMatcher) obj, splitter, charSequence);
                return lambda$on$0;
            default:
                lambda$onPatternInternal$0 = Splitter.lambda$onPatternInternal$0((CommonPattern) obj, splitter, charSequence);
                return lambda$onPatternInternal$0;
        }
    }
}
