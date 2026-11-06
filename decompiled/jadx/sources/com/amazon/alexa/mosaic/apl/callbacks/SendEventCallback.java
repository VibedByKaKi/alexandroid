package com.amazon.alexa.mosaic.apl.callbacks;

import android.util.Log;
import com.amazon.alexa.mosaic.apl.dependencies.WeakEventHandler;
import com.amazon.alexa.mosaic.apl.events.UserEvent;
import com.amazon.apl.android.dependencies.ISendEventCallbackV2;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SendEventCallback implements ISendEventCallbackV2 {
    private static final long SEND_EVENT_DEDUPE_TIME = 100;
    private static final String TAG = "SendEventCallback";
    private int lastDedupeKey;
    private long lastSendTime;
    private final WeakEventHandler mEventHandler;

    public SendEventCallback(WeakEventHandler weakEventHandler) {
        this.mEventHandler = weakEventHandler;
    }

    @Override // com.amazon.apl.android.dependencies.ISendEventCallbackV2
    public void onSendEvent(Object[] objArr, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        int hashCode = Arrays.hashCode(objArr);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode == this.lastDedupeKey && currentTimeMillis - this.lastSendTime < 100) {
            Log.w(TAG, "onSendEvent: dedupeKey is the same as lastDedupeKey");
            return;
        }
        this.lastDedupeKey = hashCode;
        this.lastSendTime = currentTimeMillis;
        this.mEventHandler.handle(UserEvent.builder().arguments(Arrays.asList(objArr)).components(map).flags(map3).sources(map2).build());
    }
}
