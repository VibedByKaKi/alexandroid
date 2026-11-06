package com.dee.app.contacts.common.utils;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.contacts.interfaces.models.data.enums.PermissionAuthStatus;
import com.dee.app.contacts.interfaces.models.data.enums.PermissionRequestInfo;
import com.dee.app.contacts.interfaces.models.data.enums.RequestPermissionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PermissionsUtils {
    private final ActivityLifecycleUtil mActivityLifecycleUtil;
    private Context mContext;
    private static SparseArray<Listener> requestListeners = new SparseArray<>();
    private static final ContactsLogger LOG = ContactsLogger.getLogger(Constants.LOG_TAG, PermissionsUtils.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void complete(boolean z, RequestPermissionResult requestPermissionResult);
    }

    @Inject
    public PermissionsUtils(ActivityLifecycleUtil activityLifecycleUtil, Context context) {
        this.mActivityLifecycleUtil = activityLifecycleUtil;
        this.mContext = context;
    }

    private boolean permissionShouldBeRequested(@NonNull Activity activity, String str) {
        return ContextCompat.checkSelfPermission(activity, str) != 0;
    }

    private void processRequest(@NonNull Activity activity, @NonNull PermissionRequestInfo permissionRequestInfo) {
        List<String> asList = Arrays.asList(permissionRequestInfo.permissions);
        ArrayList arrayList = new ArrayList();
        for (String str : asList) {
            if (permissionShouldBeRequested(activity, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), permissionRequestInfo.requestCode);
            return;
        }
        Listener listener = requestListeners.get(permissionRequestInfo.requestCode);
        if (listener != null) {
            listener.complete(true, RequestPermissionResult.GRANTED_PERMISSION);
        }
    }

    public PermissionAuthStatus getPermissionAuthStatus(@Nullable PermissionRequestInfo permissionRequestInfo) {
        boolean z = false;
        for (String str : permissionRequestInfo.permissions) {
            if (ContextCompat.checkSelfPermission(this.mContext, str) != 0) {
                z = true;
            }
        }
        return z ? PermissionAuthStatus.DENIED : PermissionAuthStatus.GRANTED;
    }

    public void requestPermission(Listener listener, PermissionRequestInfo permissionRequestInfo) {
        try {
            if (permissionRequestInfo == null || listener == null) {
                LOG.e("RequestInfo or listener cannot be empty while requesting permission");
                return;
            }
            Activity currentActivity = this.mActivityLifecycleUtil.getCurrentActivity();
            if (currentActivity == null) {
                LOG.e("Error while fetching the contacts permission. Current Activity is null.");
                listener.complete(false, RequestPermissionResult.APP_ACTIVITY_EMPTY);
            } else if (permissionRequestInfo.feature != null && !currentActivity.getPackageManager().hasSystemFeature(permissionRequestInfo.feature)) {
                listener.complete(false, RequestPermissionResult.NO_PERMISSION);
            } else {
                requestListeners.put(permissionRequestInfo.requestCode, listener);
                processRequest(currentActivity, permissionRequestInfo);
            }
        } catch (Exception e) {
            LOG.e("Error while requesting permission for %s}", permissionRequestInfo.name, e);
            listener.complete(false, RequestPermissionResult.UNKNOWN_EXCEPTION);
        }
    }
}
