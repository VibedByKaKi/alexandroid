package com.mapbox.maps;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.common.Cancelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0016\b\u0002\u0010\u0004\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mapbox/bindgen/Expected;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 176)
/* loaded from: classes8.dex */
public final class UtilsKt$suspendMapboxCancellableCoroutine$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Cancelable $cancelable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$suspendMapboxCancellableCoroutine$2$1(Cancelable cancelable) {
        super(1);
        this.$cancelable = cancelable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.$cancelable.cancel();
    }
}
