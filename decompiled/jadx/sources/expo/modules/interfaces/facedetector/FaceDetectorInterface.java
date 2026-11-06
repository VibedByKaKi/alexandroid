package expo.modules.interfaces.facedetector;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface FaceDetectorInterface {
    void detectFaces(Uri uri, FacesDetectionCompleted facesDetectionCompleted, FaceDetectionError faceDetectionError) throws IOException;

    void detectFaces(byte[] bArr, int i, int i2, int i3, boolean z, double d, double d2, FacesDetectionCompleted facesDetectionCompleted, FaceDetectionError faceDetectionError, FaceDetectionSkipped faceDetectionSkipped);

    void release();

    void setSettings(Map<String, Object> map);
}
