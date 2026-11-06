package com.amazon.rtcsc.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.amazon.rtcsc.utils.RtcscLogger;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscServiceInfo {
    private static final String DEFAULT_SERVICE_PACKAGE_NAME = "com.amazon.rtcsessioncontroller";
    public static final String PERMISSION = "com.amazon.rtcsc.permission.RTCSC";
    private static final String RTCSC_SERVICE_BIND_INTENT_ACTION = "com.amazon.rtcsessioncontroller.ACTION_BIND_TO_RTCSC_SERVICE";
    private static final String SERVICE_CLASS_NAME = "com.amazon.rtcsc.service.RtcscService";
    private static RtcscLogger mLog = RtcscLogger.getLogger(RtcscClientHandler.class);

    public static Intent createRtcscServiceBindIntent(Context context) {
        return isRtcscServiceWithBindIntentPresent(context) ? new Intent(RTCSC_SERVICE_BIND_INTENT_ACTION) : new Intent().setClassName(DEFAULT_SERVICE_PACKAGE_NAME, SERVICE_CLASS_NAME);
    }

    private static boolean isRtcscServiceWithBindIntentPresent(Context context) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(RTCSC_SERVICE_BIND_INTENT_ACTION), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            return true;
        }
        mLog.w("No Service found that declares RtcscService bind action.");
        return false;
    }
}
