package com.mapbox.maps;

import com.mapbox.maps.IndoorState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¨\u0006\f"}, d2 = {"indoorState", "Lcom/mapbox/maps/IndoorState;", "floors", "", "Lcom/mapbox/maps/IndoorFloor;", "selectedFloorId", "", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/maps/IndoorState$Builder;", "", "Lkotlin/ExtensionFunctionType;", "sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IndoorStateKt {
    @com.mapbox.annotation.MapboxExperimental
    public static final /* synthetic */ IndoorState indoorState(List list, String str, Function1 function1) {
        list.getClass();
        str.getClass();
        function1.getClass();
        IndoorState.Builder builder = new IndoorState.Builder(list, str);
        function1.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ IndoorState indoorState$default(List list, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1<IndoorState.Builder, Unit>() { // from class: com.mapbox.maps.IndoorStateKt$indoorState$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IndoorState.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IndoorState.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return indoorState(list, str, function1);
    }
}
