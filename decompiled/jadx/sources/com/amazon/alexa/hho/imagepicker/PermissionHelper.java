package com.amazon.alexa.hho.imagepicker;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class PermissionHelper {
    public static final int REQUEST_CAMERA_PERMISSION = 1001;
    private static Map<Integer, PermissionListener> sListeners = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PermissionListener {
        void complete(boolean z);

        void complete(boolean z, String str);
    }

    private PermissionHelper() {
    }

    public static void checkCameraPermission(Activity activity, PermissionListener permissionListener) {
        if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            permissionListener.complete(true);
        } else {
            sListeners.put(1001, permissionListener);
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.CAMERA"}, 1001);
        }
    }

    public static boolean isPermissionRequest(int i) {
        return i == 1001;
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionListener remove = sListeners.remove(Integer.valueOf(i));
        if (remove == null || i != 1001) {
            return;
        }
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (iArr.length == 0) {
            remove.complete(false, "Permission request was cancelled");
        } else {
            remove.complete(z, z ? null : "Camera permission denied");
        }
    }
}
