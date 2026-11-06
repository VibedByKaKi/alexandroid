package com.amazon.alexa.voice.routing;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.voice.tta.TypeToAlexaFeatureEnabler;
import com.amazon.alexa.voice.utils.RouteHelper;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class RouteToTypeAction {

    @VisibleForTesting
    static final String ACTION_SHOW_TYPE_UI = "amazon.intent.action.SHOW_ALEXA_TYPE_UI";

    @VisibleForTesting
    static final String EXTRA_HINT = "hint";

    @VisibleForTesting
    static final String EXTRA_REFERRER = "referer";

    @VisibleForTesting
    static final String EXTRA_START_TIMESTAMP = "startTimestamp";
    private static final String TAG = "RouteToTypeAction";
    private final TypeToAlexaFeatureEnabler ttaFeatureEnabler;

    public RouteToTypeAction(TypeToAlexaFeatureEnabler typeToAlexaFeatureEnabler) {
        this.ttaFeatureEnabler = typeToAlexaFeatureEnabler;
    }

    private long getStartTimestamp(@NonNull Map<String, String> map) {
        String str = map.get("startTimestamp");
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.e(TAG, "getStartTimestamp: Invalid startTimestamp ".concat(str), e);
            }
        }
        return this.getSystemCurrentTimeMillis();
    }

    private boolean launchTypeExperience(Activity activity, String str, String str2, long j) {
        Intent intent = new Intent();
        intent.setPackage(activity.getPackageName());
        intent.setAction(ACTION_SHOW_TYPE_UI);
        intent.addFlags(65536);
        intent.putExtra("referer", str);
        intent.putExtra("hint", str2);
        intent.putExtra("startTimestamp", j);
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "Unable to show UI. Could not find Type UI Activity", e);
            return false;
        }
    }

    @VisibleForTesting
    public long getSystemCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public boolean startTypeExperience(@NonNull Activity activity, @NonNull RouteContext routeContext) {
        if (!this.ttaFeatureEnabler.isTypeToAlexaEnabled()) {
            return false;
        }
        Map<String, String> parseQueryParameters = RouteHelper.parseQueryParameters(routeContext.getString("rawQueryString", ""));
        return launchTypeExperience(activity, RouteHelper.getReferer(parseQueryParameters), parseQueryParameters.get("hint"), getStartTimestamp(parseQueryParameters));
    }
}
