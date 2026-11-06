package org.apache.commons.text.similarity;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class Counter {
    private Counter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$of$0(CharSequence charSequence, Integer num) {
        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$of$1(Map map, CharSequence charSequence) {
        map.compute(charSequence, new Counter$$ExternalSyntheticLambda0());
    }

    public static Map<CharSequence, Integer> of(CharSequence[] charSequenceArr) {
        HashMap hashMap = new HashMap();
        Stream.of((Object[]) charSequenceArr).forEach(new Counter$$ExternalSyntheticLambda1(hashMap, 0));
        return hashMap;
    }
}
