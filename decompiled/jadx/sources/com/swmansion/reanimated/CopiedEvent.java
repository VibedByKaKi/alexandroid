package com.swmansion.reanimated;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CopiedEvent {
    private String eventName;
    private WritableMap payload;
    private int targetTag;

    public CopiedEvent(Event event) {
        event.dispatch(new RCTEventEmitter() { // from class: com.swmansion.reanimated.CopiedEvent.1
            @Override // com.facebook.react.uimanager.events.RCTEventEmitter
            public void receiveEvent(int i, String str, @Nullable WritableMap writableMap) {
                CopiedEvent.this.targetTag = i;
                CopiedEvent.this.eventName = str;
                CopiedEvent.this.payload = writableMap.copy();
            }

            @Override // com.facebook.react.uimanager.events.RCTEventEmitter
            public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
            }
        });
    }

    public String getEventName() {
        return this.eventName;
    }

    public WritableMap getPayload() {
        return this.payload;
    }

    public int getTargetTag() {
        return this.targetTag;
    }
}
