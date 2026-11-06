package com.amazon.deecomms.common.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class WebIntentUtils {
    private static final String PARAM_POPUP = "pop-up";
    private static final String PARAM_POPUP_VALUE = "1";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, WebIntentUtils.class);
    private static final Set<Uri> POPUP_LINKS = Collections.unmodifiableSet(new HashSet(Arrays.asList(Uri.parse("https://www.amazon.com/gp/help/customer/display.html"))));

    private WebIntentUtils() {
    }

    public static boolean containsPopUpUri(@NonNull Intent intent) {
        return isWebIntent(intent) && isPopupUri(intent.getData());
    }

    public static Intent ensurePopupIfApplicable(@NonNull Intent intent) {
        if (containsPopUpUri(intent)) {
            intent.setData(ensurePopupParam(intent.getData()));
            return intent;
        }
        if (isWebIntent(intent)) {
            CommsLogger commsLogger = LOG;
            commsLogger.v("Uri doesn't need to add pop-up param: " + commsLogger.sensitive(intent.getData().toString()));
        }
        return intent;
    }

    public static Uri ensurePopupParam(@NonNull Uri uri) {
        if (TextUtils.equals("1", uri.getQueryParameter(PARAM_POPUP))) {
            CommsLogger commsLogger = LOG;
            commsLogger.d("Uri already has popup param: " + commsLogger.sensitive(uri.toString()));
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals(PARAM_POPUP)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        Uri build = clearQuery.appendQueryParameter(PARAM_POPUP, "1").build();
        CommsLogger commsLogger2 = LOG;
        commsLogger2.d("Added popup param to Uri: " + commsLogger2.sensitive(build.toString()));
        return build;
    }

    public static boolean isPopupUri(@NonNull Uri uri) {
        return POPUP_LINKS.contains(uri.buildUpon().clearQuery().build());
    }

    public static boolean isWebIntent(@NonNull Intent intent) {
        return TextUtils.equals(intent.getAction(), "android.intent.action.VIEW") && intent.getData() != null;
    }
}
