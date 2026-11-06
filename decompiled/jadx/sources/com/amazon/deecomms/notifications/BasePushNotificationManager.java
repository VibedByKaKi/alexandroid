package com.amazon.deecomms.notifications;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.util.JacksonJSONConverter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class BasePushNotificationManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, BasePushNotificationManager.class);
    protected final JacksonJSONConverter jsonConverter = new JacksonJSONConverter();

    public Bundle jsonStringToBundle(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        } catch (JSONException unused) {
            LOG.e("Encountered an issue parsing the push notification JSON");
            return null;
        }
    }
}
