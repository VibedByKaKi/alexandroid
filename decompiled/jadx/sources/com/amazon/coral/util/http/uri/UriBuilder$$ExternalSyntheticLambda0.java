package com.amazon.coral.util.http.uri;

import com.amazon.coral.util.http.uri.QueryPattern;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UriBuilder$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UriBuilder$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        List lambda$addQueryMapValue$0;
        Set lambda$onParameter$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$addQueryMapValue$0 = UriBuilder.lambda$addQueryMapValue$0((String) obj);
                return lambda$addQueryMapValue$0;
            case 1:
                return ((QueryPattern.QueryParamValue) obj).toString();
            default:
                lambda$onParameter$0 = QueryPattern.AnonymousClass1.lambda$onParameter$0((String) obj);
                return lambda$onParameter$0;
        }
    }
}
