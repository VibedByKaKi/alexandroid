package com.amazon.alexa.app.notification.messaging.receivers;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.app.notification.util.Log;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.EventBusException;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import dagger.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class EventBusMessagingReceiver implements MessagingReceiver {
    public static final String EVENT_DEEPLINK_VIEW = "notification::DeepLinkView";
    public static final String EVENT_NOTIFICATION_RECEIVED = "notification::NotificationReceived";
    public static final String NOTIFICATION_EVENT_TYPE_KEY = "key";
    private static final String TAG = Log.tag(EventBusMessagingReceiver.class);
    private final Lazy<EventBus> eventBus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotificationEvent {
        public static final String ORIGINAL_URI = "original_uri";
        public static final String URI_FRAGMENT = "uri_fragment";
        public static final String URI_KEY = "uri_key";
        public static final String URI_PATH = "uri_path";
        public static final String URI_QUERY = "uri_query";
        private String fragment;
        private String path;
        private String query;
        private String url;
        private String urlKey;

        public NotificationEvent(@NonNull String str, @NonNull String str2, String str3, String str4, String str5) {
            this.urlKey = str;
            this.url = str2;
            this.fragment = str3;
            this.query = str4;
            this.path = str5;
        }

        public String getFragment() {
            return this.fragment;
        }

        public String getPath() {
            return this.path;
        }

        public String getQuery() {
            return this.query;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlKey() {
            return this.urlKey;
        }

        public JSONObject toJson() throws JSONException {
            if (this.urlKey == null || this.url == null) {
                return null;
            }
            JSONObject put = new JSONObject().put(URI_KEY, this.urlKey).put("original_uri", this.url);
            String str = this.fragment;
            if (str != null) {
                put.put(URI_FRAGMENT, str);
            }
            String str2 = this.query;
            if (str2 != null) {
                put.put(URI_QUERY, str2);
            }
            String str3 = this.path;
            if (str3 != null) {
                put.put(URI_PATH, str3);
            }
            return put;
        }
    }

    public EventBusMessagingReceiver(Lazy<EventBus> lazy) {
        this.eventBus = lazy;
    }

    private JSONObject buildJsonObject(String str, @NonNull JSONArray jSONArray, @NonNull String str2) {
        if (str == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    jSONObject.put(str2, new NotificationEvent(str2, str, parse.getFragment(), parse.getQuery(), parse.getPath()).toJson());
                    jSONArray.put(jSONObject);
                }
            } catch (JSONException unused) {
                Log.d(TAG, "JSONException in buildJsonObject");
            } catch (Exception unused2) {
                Log.d(TAG, "Exception in buildJsonObject");
            }
        }
        Log.d(TAG, "returning jsonObject: " + jSONObject);
        return jSONObject;
    }

    private void sendMessageToEventBus(@NonNull String str, @NonNull String str2) {
        try {
            this.eventBus.get().lambda$getPublisher$0(new Message.Builder().setDate(System.currentTimeMillis()).setEventType(str2).setSource(Message.Source.Local).setPayload(str).build());
        } catch (EventBusException unused) {
            Log.d(TAG, "Exception in sendMessageToEventBus");
        }
    }

    private void sendToEventBus(Bundle bundle) {
        Log.d(TAG, "sendToEventBus");
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            buildJsonObject(bundle.getString(str), jSONArray, str);
        }
        String string = bundle.getString("key");
        buildJsonObject(bundle.getString(PayloadUtils.PayloadKeys.WEB_URL), jSONArray, PayloadUtils.PayloadKeys.WEB_URL);
        if (string == null) {
            string = EVENT_NOTIFICATION_RECEIVED;
        }
        sendMessageToEventBus(jSONArray.toString(), string);
    }

    @Override // com.amazon.alexa.protocols.messaging.MessagingReceiver
    public void onReceive(@NonNull com.amazon.alexa.protocols.messaging.Message message) {
        Bundle bundle = message.get();
        Log.d(TAG, "Received message: " + bundle);
        sendToEventBus(bundle);
    }

    public void publishDeepLinkClick(@NonNull Uri uri) {
        JSONArray jSONArray = new JSONArray();
        buildJsonObject(uri.toString(), jSONArray, PayloadUtils.PayloadKeys.WEB_URL);
        sendMessageToEventBus(jSONArray.toString(), EVENT_DEEPLINK_VIEW);
    }
}
