package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapContext extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FreeResourceSeverity {
        MODERATE(0),
        CRITICAL(1);

        public final int value;

        FreeResourceSeverity(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ResourceType {
        MEMORY(0);

        public final int value;

        ResourceType(int i) {
            this.value = i;
        }
    }

    public MapContext(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapContext.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapContext.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void freeResource(@NonNull ResourceType resourceType, @NonNull FreeResourceSeverity freeResourceSeverity);
}
