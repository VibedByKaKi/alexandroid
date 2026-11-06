package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.view.WindowManager;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
interface CameraSession {
    public static final String ERROR_SET_ATTRIBUTES_FAILED = "setAttributes failed";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpened(CameraSession cameraSession, CameraInformation cameraInformation);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    static VideoFrame.TextureBuffer createTextureBufferWithFollowMeEnabled(TextureBufferImpl textureBufferImpl, boolean z, int i, RectF rectF, CameraEnumerationAndroid.CaptureFormat captureFormat) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        Matrix matrix2 = new Matrix();
        matrix2.postScale((rectF.right - rectF.left) / captureFormat.width, (rectF.bottom - rectF.top) / captureFormat.height);
        matrix2.postTranslate(rectF.left / captureFormat.width, rectF.top / captureFormat.height);
        matrix.postConcat(matrix2);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    static int getDeviceOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    void getCameraMetadata(CameraMetadataObserver cameraMetadataObserver, Handler handler);

    void setAttributes(CameraAttributes cameraAttributes);

    void setVideoEffectStatusListener(String str, VideoEffectStatusListener videoEffectStatusListener);

    void stop();
}
