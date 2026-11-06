package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.Point3D;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class MeshBuilder extends NativeBase {
    public MeshBuilder() {
        this(make(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make();

    @Nullable
    public native Mesh build();

    @NonNull
    public native QuadMeshBuilder quad(@NonNull Point3D point3D, @NonNull Point3D point3D2, @NonNull Point3D point3D3, @NonNull Point3D point3D4);

    @NonNull
    public native TriangleMeshBuilder triangle(@NonNull Point3D point3D, @NonNull Point3D point3D2, @NonNull Point3D point3D3);

    public MeshBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MeshBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MeshBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
