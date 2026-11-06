package com.mapbox.maps.renderer;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/renderer/OnMaximumFpsChangedListener;", "", "onMaximumFpsChanged", "", "maximumFps", "", "(Ljava/lang/Integer;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes9.dex */
public interface OnMaximumFpsChangedListener {
    @MainThread
    void onMaximumFpsChanged(@Nullable Integer maximumFps);
}
