package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import android.net.Uri;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import java.util.Locale;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class WazeMapsDeeplinkHelper {
    private static final String TAG = "WazeMapsDeeplinkHelper";

    @Inject
    public WazeMapsDeeplinkHelper() {
    }

    public Uri getCancelNavigationUri() {
        return new Uri.Builder().scheme("https").authority(DeeplinkConstants.WazeUniversalDeeplink.Uri.AUTHORITY).path(DeeplinkConstants.WazeUniversalDeeplink.Uri.PATH).appendQueryParameter("a", DeeplinkConstants.WazeUniversalDeeplink.Uri.ACTION_STOP_NAVIGATE_VALUE).build();
    }

    public Uri getStartNavigationUri(double d, double d2) {
        return new Uri.Builder().scheme("https").authority(DeeplinkConstants.WazeUniversalDeeplink.Uri.AUTHORITY).path(DeeplinkConstants.WazeUniversalDeeplink.Uri.PATH).appendQueryParameter(DeeplinkConstants.WazeUniversalDeeplink.Uri.COORDINATES_QUERY_PARAM_KEY, String.format(Locale.US, "%f,%f", Double.valueOf(d), Double.valueOf(d2))).appendQueryParameter("navigate", "yes").build();
    }
}
