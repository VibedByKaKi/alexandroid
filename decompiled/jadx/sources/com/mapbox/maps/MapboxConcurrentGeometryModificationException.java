package com.mapbox.maps;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/MapboxConcurrentGeometryModificationException;", "Ljava/util/ConcurrentModificationException;", "Lkotlin/ConcurrentModificationException;", "exceptionText", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxConcurrentGeometryModificationException extends ConcurrentModificationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConcurrentGeometryModificationException(@NotNull String str, @NotNull String str2) {
        super(str);
        str.getClass();
        str2.getClass();
    }
}
