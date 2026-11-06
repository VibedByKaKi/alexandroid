package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.NativeBase;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ApplicationUtils extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ApplicationInformation {

        @NonNull
        public String applicationVersion;

        public ApplicationInformation(@NonNull String str) {
            this.applicationVersion = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ApplicationInformation) {
                return Objects.equals(this.applicationVersion, ((ApplicationInformation) obj).applicationVersion);
            }
            return false;
        }

        public int hashCode() {
            String str = this.applicationVersion;
            return JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0);
        }
    }

    public ApplicationUtils(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.ApplicationUtils.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                ApplicationUtils.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native ApplicationInformation getApplicationInformation();

    public static native void setApplicationInformation(@NonNull ApplicationInformation applicationInformation);
}
