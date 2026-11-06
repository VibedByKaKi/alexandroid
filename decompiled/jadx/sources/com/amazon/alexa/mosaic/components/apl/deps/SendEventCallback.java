package com.amazon.alexa.mosaic.components.apl.deps;

import android.util.Log;
import com.amazon.alexa.mosaic.components.apl.interfaces.IAplEventListener;
import com.amazon.alexa.mosaic.components.apl.models.AplEvent;
import com.amazon.apl.android.dependencies.ISendEventCallbackV2;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SendEventCallback implements ISendEventCallbackV2 {
    private static final long SEND_EVENT_DEDUPE_TIME = 100;
    private static final String TAG = "SendEventCallback";
    private int lastDedupeKey;
    private long lastSendTime;
    private final String mPresentationToken;
    private final String mPresentationUri;
    private final IAplEventListener mSendEventCallback;

    public SendEventCallback(String str, String str2, IAplEventListener iAplEventListener) {
        this.mPresentationUri = str;
        this.mPresentationToken = str2;
        this.mSendEventCallback = iAplEventListener;
    }

    @Override // com.amazon.apl.android.dependencies.ISendEventCallbackV2
    public void onSendEvent(Object[] objArr, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        try {
            int hashCode = new JSONArray(objArr).toString().hashCode();
            long currentTimeMillis = System.currentTimeMillis();
            if (hashCode == this.lastDedupeKey && currentTimeMillis - this.lastSendTime < 100) {
                Log.w(TAG, "onSendEvent: dedupeKey is the same as lastDedupeKey");
                return;
            }
            this.lastDedupeKey = hashCode;
            this.lastSendTime = currentTimeMillis;
            this.mSendEventCallback.sendEvent(new AplEvent(this.mPresentationUri, this.mPresentationToken, objArr, map, map2, map3));
        } catch (Exception e) {
            Log.e(TAG, "onSendEvent: error", e);
        }
    }
}
