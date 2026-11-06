package com.mapbox.maps.extension.style.layers.generated;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"skyLayer", "Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "layerId", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/layers/generated/SkyLayerDsl;", "", "Lkotlin/ExtensionFunctionType;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class SkyLayerKt {
    @NotNull
    public static final SkyLayer skyLayer(@NotNull String str, @NotNull Function1<? super SkyLayerDsl, Unit> function1) {
        str.getClass();
        function1.getClass();
        SkyLayer skyLayer = new SkyLayer(str);
        function1.invoke(skyLayer);
        return skyLayer;
    }
}
