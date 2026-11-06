package com.mapbox.common.module.provider;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.annotation.module.MapboxModuleType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "type", "Lcom/mapbox/annotation/module/MapboxModuleType;", "(Lcom/mapbox/annotation/module/MapboxModuleType;)V", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MapboxInvalidModuleException extends RuntimeException {

    @NotNull
    private final MapboxModuleType type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MapboxInvalidModuleException(@org.jetbrains.annotations.NotNull com.mapbox.annotation.module.MapboxModuleType r4) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n    "
            r0.<init>(r1)
            java.lang.String r1 = r4.name()
            r0.append(r1)
            java.lang.String r1 = " has been excluded from build but a correct alternative was not provided.\n    Make sure that:\n    - Your custom module implements "
            r0.append(r1)
            java.lang.String r1 = r4.getInterfacePackage()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r4.getInterfaceClassName()
            r0.append(r1)
            java.lang.String r1 = ".\n    - Your custom module class is annotated with @MapboxModule(MapboxModuleType."
            r0.append(r1)
            java.lang.String r1 = r4.name()
            r0.append(r1)
            java.lang.String r1 = ").\n    - You've provided a `ModuleProvider` instance to "
            r0.append(r1)
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r1 = r4.getSimplifiedName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "Mapbox_%sModuleConfiguration"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            java.lang.String r1 = "#set"
            r0.append(r1)
            java.lang.String r1 = "moduleProvider"
            java.lang.String r1 = kotlin.text.StringsKt.capitalize(r1)
            r0.append(r1)
            java.lang.String r1 = " before initializing the library,\n      unless `enableConfiguration` flag is set to false and your implementation has a public, non-arg constructor or is a Kotlin object.\n  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = kotlin.text.StringsKt.trimIndent(r0)
            r3.<init>(r0)
            r3.type = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.module.provider.MapboxInvalidModuleException.<init>(com.mapbox.annotation.module.MapboxModuleType):void");
    }

    /* renamed from: component1, reason: from getter */
    private final MapboxModuleType getType() {
        return this.type;
    }

    public static /* synthetic */ MapboxInvalidModuleException copy$default(MapboxInvalidModuleException mapboxInvalidModuleException, MapboxModuleType mapboxModuleType, int i, Object obj) {
        if ((i & 1) != 0) {
            mapboxModuleType = mapboxInvalidModuleException.type;
        }
        return mapboxInvalidModuleException.copy(mapboxModuleType);
    }

    @NotNull
    public final MapboxInvalidModuleException copy(@NotNull MapboxModuleType type) {
        type.getClass();
        return new MapboxInvalidModuleException(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapboxInvalidModuleException) && this.type == ((MapboxInvalidModuleException) other).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "MapboxInvalidModuleException(type=" + this.type + ')';
    }
}
