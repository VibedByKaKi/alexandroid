package com.amazon.comms.util;

import android.content.Context;
import android.view.WindowManager;
import com.amazon.comms.log.CommsLogger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceProperties {
    private static final CommsLogger sLog = CommsLogger.getLogger(DeviceProperties.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ScreenOrientation {
        LANDSCAPE("landscape"),
        PORTRAIT("portrait");

        private final String orientation;

        ScreenOrientation(String str) {
            this.orientation = str;
        }

        public static ScreenOrientation getDefault() {
            return PORTRAIT;
        }

        public String getOrientationString() {
            return this.orientation;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r0 = ((java.lang.Integer) r4.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCameraOrientation(android.content.Context r7) {
        /*
            java.lang.String r0 = "camera"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.hardware.camera2.CameraManager r7 = (android.hardware.camera2.CameraManager) r7
            r0 = 0
            java.lang.String[] r1 = r7.getCameraIdList()     // Catch: android.hardware.camera2.CameraAccessException -> L36
            int r2 = r1.length     // Catch: android.hardware.camera2.CameraAccessException -> L36
            r3 = r0
        Lf:
            if (r3 >= r2) goto L4e
            r4 = r1[r3]     // Catch: android.hardware.camera2.CameraAccessException -> L36
            android.hardware.camera2.CameraCharacteristics r4 = r7.getCameraCharacteristics(r4)     // Catch: android.hardware.camera2.CameraAccessException -> L36
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: android.hardware.camera2.CameraAccessException -> L36
            java.lang.Object r5 = r4.get(r5)     // Catch: android.hardware.camera2.CameraAccessException -> L36
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: android.hardware.camera2.CameraAccessException -> L36
            int r5 = r5.intValue()     // Catch: android.hardware.camera2.CameraAccessException -> L36
            r6 = 1
            if (r5 != r6) goto L29
            int r3 = r3 + 1
            goto Lf
        L29:
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch: android.hardware.camera2.CameraAccessException -> L36
            java.lang.Object r7 = r4.get(r7)     // Catch: android.hardware.camera2.CameraAccessException -> L36
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: android.hardware.camera2.CameraAccessException -> L36
            int r0 = r7.intValue()     // Catch: android.hardware.camera2.CameraAccessException -> L36
            goto L4e
        L36:
            r7 = move-exception
            com.amazon.comms.log.CommsLogger r1 = com.amazon.comms.util.DeviceProperties.sLog
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getCameraOrientation() failed with exception: "
            r2.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.e(r7)
        L4e:
            com.amazon.comms.log.CommsLogger r7 = com.amazon.comms.util.DeviceProperties.sLog
            java.lang.String r1 = "getCameraOrientation(): "
            com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0.m(r1, r0, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.util.DeviceProperties.getCameraOrientation(android.content.Context):int");
    }

    public static int getDeviceRotation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
        CredentialConfig$$ExternalSyntheticOutline0.m("getDeviceRotation(): ", i, sLog);
        return i;
    }

    public static int getScreenRotation(Context context) {
        int cameraOrientation = (getCameraOrientation(context) + getDeviceRotation(context)) % 360;
        CredentialConfig$$ExternalSyntheticOutline0.m("Get screen rotation status: ", cameraOrientation, sLog);
        return cameraOrientation;
    }
}
