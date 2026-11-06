package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.util.Log;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.RawStringPayload;
import com.amazon.alexa.mobile.assistant.capabilities.videoexperience.VideoExperienceHelper;
import com.amazon.alexa.utils.device.FireTabletUtils;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ApplicationStateReporterProvider extends BaseComponentStateProvider {
    private static final String APPLICATION_TYPE = "android";
    private static final String APPLICATION_VERSION = "2.0";
    private static final String CATEGORY_OTHER = "OTHER";
    private static final String KEY_CATEGORIES = "categories";
    private static final String KEY_FOREGROUND_APPLICATION = "foregroundApplication";
    private static final String KEY_ID = "id";
    private static final String KEY_IS_VISIBLE = "isVisible";
    private static final String KEY_METADATA = "metadata";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VERSION = "version";
    private static final String TAG = "ApplicationStateReporterProvider";
    private final Context context;
    private static final Namespace NAMESPACE = AvsApiConstants.Alexa.ApplicationStateReporter.NAMESPACE;
    private static final Name NAME = AvsApiConstants.Alexa.ApplicationStateReporter.ComponentStates.ForegroundApplication.NAME;
    private static final List<String> VIDEO_APP_PACKAGES = Arrays.asList("com.netflix.mediaclient", VideoExperienceHelper.PRIME_VIDEO_PACKAGE_NAME);

    @Inject
    public ApplicationStateReporterProvider(Context context) {
        super(NAMESPACE, NAME);
        this.context = context;
    }

    private String buildForegroundApplicationPayload(String str) {
        try {
            return new JSONObject().put(KEY_FOREGROUND_APPLICATION, new JSONObject().put("id", str).put("version", "2.0").put("type", APPLICATION_TYPE).put("metadata", new JSONObject().put(KEY_CATEGORIES, new JSONArray().put("OTHER")).put(KEY_IS_VISIBLE, true))).toString();
        } catch (JSONException e) {
            Log.w(TAG, "getState: failed to build payload", e);
            return null;
        }
    }

    private String getActiveVideoApp() {
        try {
            MediaSessionManager mediaSessionManager = (MediaSessionManager) this.context.getSystemService("media_session");
            if (mediaSessionManager == null) {
                Log.w(TAG, "MediaSessionManager unavailable");
                return null;
            }
            String str = null;
            for (MediaController mediaController : mediaSessionManager.getActiveSessions(null)) {
                String packageName = mediaController.getPackageName();
                if (VIDEO_APP_PACKAGES.contains(packageName)) {
                    PlaybackState playbackState = mediaController.getPlaybackState();
                    if (playbackState == null) {
                        Log.i(TAG, "getActiveVideoApp: skipping pkg=" + packageName + " — no PlaybackState available");
                    } else {
                        int state = playbackState.getState();
                        if (isActivelyPlaying(state)) {
                            return packageName;
                        }
                        if (str == null && isHalted(state)) {
                            str = packageName;
                        }
                    }
                }
            }
            return str;
        } catch (SecurityException e) {
            Log.w(TAG, "getActiveSessions: notification listener not enabled", e);
            return null;
        } catch (RuntimeException e2) {
            Log.w(TAG, "getPlayingVideoApp failed", e2);
            return null;
        }
    }

    private static boolean isActivelyPlaying(int i) {
        return i == 3 || i == 6;
    }

    private static boolean isHalted(int i) {
        return i == 2 || i == 1;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        if (!FireTabletUtils.isKHTablet()) {
            return null;
        }
        String activeVideoApp = getActiveVideoApp();
        if (activeVideoApp == null) {
            Log.i(TAG, "getState: no supported video app actively playing");
            return null;
        }
        String buildForegroundApplicationPayload = buildForegroundApplicationPayload(activeVideoApp);
        if (buildForegroundApplicationPayload == null) {
            return null;
        }
        Log.i(TAG, "getState: reporting foreground app=".concat(activeVideoApp));
        return ComponentState.create(getComponentStateHeader(), RawStringPayload.create(buildForegroundApplicationPayload));
    }
}
