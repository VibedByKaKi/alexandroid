package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CameraCaptureSessionStateCallbacks {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ComboSessionStateCallback extends CameraCaptureSession.StateCallback {
        private final List<CameraCaptureSession.StateCallback> mCallbacks = new ArrayList();

        public ComboSessionStateCallback(@NonNull List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof NoOpSessionStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                ApiCompat.Api26Impl.onCaptureQueueEmpty(it2.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 23)
        public void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                ApiCompat.Api23Impl.onSurfacePrepared(it2.next(), cameraCaptureSession, surface);
            }
        }
    }

    private CameraCaptureSessionStateCallbacks() {
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createComboCallback(@NonNull List<CameraCaptureSession.StateCallback> list) {
        return list.isEmpty() ? createNoOpCallback() : list.size() == 1 ? list.get(0) : new ComboSessionStateCallback(list);
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createNoOpCallback() {
        return new NoOpSessionStateCallback();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoOpSessionStateCallback extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        }
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createComboCallback(@NonNull CameraCaptureSession.StateCallback... stateCallbackArr) {
        return createComboCallback((List<CameraCaptureSession.StateCallback>) Arrays.asList(stateCallbackArr));
    }
}
