package com.mapbox.common.module.okhttp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OkHttpClientDetail$Companion$connectivityMonitor$2$monitor$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public static final OkHttpClientDetail$Companion$connectivityMonitor$2$monitor$1 INSTANCE = new OkHttpClientDetail$Companion$connectivityMonitor$2$monitor$1();

    public OkHttpClientDetail$Companion$connectivityMonitor$2$monitor$1() {
        super(0, LazyClient.class, "evictIdleConnections", "evictIdleConnections()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LazyClient.evictIdleConnections();
    }
}
