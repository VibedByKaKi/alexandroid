package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.lang.reflect.Constructor;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ServiceManager$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ServiceManager$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Comparable lambda$static$0;
        Comparable lambda$static$1;
        List lambda$static$2;
        FluentFuture access$000;
        switch (this.$r8$classId) {
            case 0:
                return Duration.ofMillis(((Long) obj).longValue());
            case 1:
                lambda$static$0 = FuturesGetChecked.lambda$static$0((List) obj);
                return lambda$static$0;
            case 2:
                lambda$static$1 = FuturesGetChecked.lambda$static$1((List) obj);
                return lambda$static$1;
            case 3:
                lambda$static$2 = FuturesGetChecked.lambda$static$2((Constructor) obj);
                return lambda$static$2;
            case 4:
                access$000 = ClosingFuture.access$000((ClosingFuture) obj);
                return access$000;
            default:
                return (Comparable) ((Map.Entry) obj).getValue();
        }
    }
}
