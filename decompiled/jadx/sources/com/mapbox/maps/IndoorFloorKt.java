package com.mapbox.maps;

import com.mapbox.maps.IndoorFloor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007¨\u0006\n"}, d2 = {"indoorFloor", "Lcom/mapbox/maps/IndoorFloor;", "id", "", "name", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/maps/IndoorFloor$Builder;", "", "Lkotlin/ExtensionFunctionType;", "sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IndoorFloorKt {
    @com.mapbox.annotation.MapboxExperimental
    public static final /* synthetic */ IndoorFloor indoorFloor(String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        IndoorFloor.Builder builder = new IndoorFloor.Builder(str, str2);
        function1.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ IndoorFloor indoorFloor$default(String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1<IndoorFloor.Builder, Unit>() { // from class: com.mapbox.maps.IndoorFloorKt$indoorFloor$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IndoorFloor.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IndoorFloor.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return indoorFloor(str, str2, function1);
    }
}
