package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.sdk.core.Anchor2D;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TriangleMeshBuilder extends MeshBuilder {
    public TriangleMeshBuilder(long j, Object obj) {
        super(j, obj);
    }

    @NonNull
    public native MeshBuilder withTextureCoordinates(@NonNull Anchor2D anchor2D, @NonNull Anchor2D anchor2D2, @NonNull Anchor2D anchor2D3);
}
