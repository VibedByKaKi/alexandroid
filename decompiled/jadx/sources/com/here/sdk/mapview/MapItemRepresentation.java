package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class MapItemRepresentation extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Impl extends NativeBase {
        public Impl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapItemRepresentation.Impl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    Impl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);
    }

    public MapItemRepresentation(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapItemRepresentation.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapItemRepresentation.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native Impl getImpl();
}
