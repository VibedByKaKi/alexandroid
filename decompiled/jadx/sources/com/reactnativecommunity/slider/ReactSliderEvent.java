package com.reactnativecommunity.slider;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReactSliderEvent extends Event<ReactSliderEvent> {
    public static final String EVENT_NAME = "topChange";
    private final boolean mFromUser;
    private final double mValue;

    public ReactSliderEvent(int i, double d, boolean z) {
        super(i);
        this.mValue = d;
        this.mFromUser = z;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", getValue());
        createMap.putBoolean("fromUser", isFromUser());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    /* renamed from: getEventData */
    public WritableMap getData() {
        return serializeEventData();
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventName */
    public String getName() {
        return "topChange";
    }

    public double getValue() {
        return this.mValue;
    }

    public boolean isFromUser() {
        return this.mFromUser;
    }
}
