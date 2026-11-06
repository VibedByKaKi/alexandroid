package com.amazon.coral.util.http.uri;

import com.amazon.coral.google.common.base.Supplier;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UriTreeMatcherMap$ParsedUri$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UriTreeMatcherMap$ParsedUri$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.coral.google.common.base.Supplier, java.util.function.Supplier
    public final Object get() {
        Map mapOfLists;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                mapOfLists = QueryStringParser.toMapOfLists((CharSequence) obj);
                return mapOfLists;
            default:
                return (Map) ((java.util.function.Supplier) obj).get();
        }
    }
}
