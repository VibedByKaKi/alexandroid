package com.reactnativecommunity.picker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PickerItemSelectEvent extends Event<PickerItemSelectEvent> {
    public static final String EVENT_NAME = "topSelect";
    private final int mPosition;

    public PickerItemSelectEvent(int i, int i2) {
        super(i);
        this.mPosition = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.mPosition);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }
}
