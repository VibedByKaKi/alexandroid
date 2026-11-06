package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.base.Function;
import java.time.Duration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ServiceManager$$ExternalSyntheticLambda0 implements Function {
    @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        return Duration.ofMillis(((Long) obj).longValue());
    }
}
