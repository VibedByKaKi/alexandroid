package com.amazon.alexa.accessory.frames.media.transform;

import android.graphics.Bitmap;
import android.media.FaceDetector;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LceFaceDetector {
    private static final int MAX_FACES = 10;
    private static final String TAG = "LceFaceDetector";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FaceBox {
        public final float height;
        public final float left;
        public final float top;
        public final float width;

        public FaceBox(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.width = f3;
            this.height = f4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_PARENTHESIS);
            sb.append((int) this.left);
            sb.append(",");
            sb.append((int) this.top);
            sb.append(",");
            sb.append((int) this.width);
            sb.append(",");
            return a$$ExternalSyntheticOutline0.m(sb, (int) this.height, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private LceFaceDetector() {
    }

    @NonNull
    public static List<FaceBox> eligibleFaceBoxes(@NonNull Bitmap bitmap, float f) {
        try {
            FaceDetector.Face[] detectFaces = SmartCropProcessor.detectFaces(bitmap, 10);
            if (detectFaces == null) {
                Log.w(TAG, "Face detection failed (no detector result); treating image as no-face");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_FACE_DETECTION_FAILED);
                return new ArrayList();
            }
            if (detectFaces.length == 0) {
                Log.i(TAG, "No faces detected; faceDetected=false");
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(detectFaces.length);
            for (FaceDetector.Face face : detectFaces) {
                if (face != null) {
                    arrayList.add(SmartCropProcessor.computeBoundingBox(face));
                }
            }
            List<FaceBoundingBox> filterByThreshold = SmartCropProcessor.filterByThreshold(arrayList, f);
            StringBuilder sb = new StringBuilder();
            sb.append("faces=");
            sb.append(detectFaces.length);
            sb.append(" eligible=");
            sb.append(filterByThreshold.size());
            sb.append(" (areaRatioThreshold=");
            sb.append(f);
            sb.append(") faceDetected=");
            sb.append(!filterByThreshold.isEmpty());
            Log.i(TAG, sb.toString());
            ArrayList arrayList2 = new ArrayList(filterByThreshold.size());
            for (FaceBoundingBox faceBoundingBox : filterByThreshold) {
                arrayList2.add(new FaceBox(faceBoundingBox.left, faceBoundingBox.top, faceBoundingBox.width, faceBoundingBox.height));
            }
            return arrayList2;
        } catch (Throwable th) {
            Log.w(TAG, "Face detection failed; treating image as no-face", th);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_FACE_DETECTION_FAILED);
            return new ArrayList();
        }
    }

    public static boolean hasEligibleFace(@NonNull Bitmap bitmap, float f) {
        return !eligibleFaceBoxes(bitmap, f).isEmpty();
    }
}
