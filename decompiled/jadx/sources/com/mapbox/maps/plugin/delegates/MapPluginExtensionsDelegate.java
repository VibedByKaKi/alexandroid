package com.mapbox.maps.plugin.delegates;

import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0019\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\u0006H&J%\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0019\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\u0006H&¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapPluginExtensionsDelegate;", "", "cameraAnimationsPlugin", "function", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lkotlin/ExtensionFunctionType;", "gesturesPlugin", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface MapPluginExtensionsDelegate {
    @Nullable
    Object cameraAnimationsPlugin(@NotNull Function1<? super CameraAnimationsPlugin, ? extends Object> function);

    @Nullable
    Object gesturesPlugin(@NotNull Function1<? super GesturesPlugin, ? extends Object> function);
}
