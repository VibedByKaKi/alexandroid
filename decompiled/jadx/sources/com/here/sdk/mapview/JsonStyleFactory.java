package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class JsonStyleFactory extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        MALFORMED_JSON_CONTENT(1),
        INVALID_JSON_STYLE_SYNTAX(2);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationErrorDetails {

        @NonNull
        public InstantiationErrorCode errorCode;

        @Nullable
        public String errorDescription;

        public InstantiationErrorDetails(@NonNull InstantiationErrorCode instantiationErrorCode, @Nullable String str) {
            this.errorCode = instantiationErrorCode;
            this.errorDescription = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorDetails error;

        public InstantiationException(InstantiationErrorDetails instantiationErrorDetails) {
            super(instantiationErrorDetails.toString());
            this.error = instantiationErrorDetails;
        }
    }

    public JsonStyleFactory(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.JsonStyleFactory.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                JsonStyleFactory.disposeNativeHandle(j2);
            }
        });
    }

    @NonNull
    public static native Style createFromString(@NonNull String str) throws InstantiationException;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);
}
