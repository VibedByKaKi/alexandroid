package com.mapbox.maps.coroutine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class MapboxMapExtKt$mapLoadedEvents$1$cancelable$2 extends AdaptedFunctionReference implements Function0<Unit> {
    public MapboxMapExtKt$mapLoadedEvents$1$cancelable$2(Object obj) {
        super(0, obj, SendChannel.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SendChannel.DefaultImpls.close$default((SendChannel) this.receiver, null, 1, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
