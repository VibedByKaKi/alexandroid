package com.mapbox.maps.extension.style.terrain.generated;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bH\u0007¨\u0006\t"}, d2 = {"terrain", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "sourceId", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/terrain/generated/TerrainDslReceiver;", "", "Lkotlin/ExtensionFunctionType;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class TerrainKt {
    @JvmOverloads
    @NotNull
    public static final Terrain terrain(@NotNull String str, @Nullable Function1<? super TerrainDslReceiver, Unit> function1) {
        str.getClass();
        if (function1 == null) {
            return new Terrain(str);
        }
        Terrain terrain = new Terrain(str);
        function1.invoke(terrain);
        return terrain;
    }

    public static /* synthetic */ Terrain terrain$default(String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return terrain(str, function1);
    }

    @JvmOverloads
    @NotNull
    public static final Terrain terrain(@NotNull String str) {
        str.getClass();
        return terrain$default(str, null, 2, null);
    }
}
