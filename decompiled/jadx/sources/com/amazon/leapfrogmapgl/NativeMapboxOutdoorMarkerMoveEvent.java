package com.amazon.leapfrogmapgl;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMapboxOutdoorMarkerMoveEvent;", "Lcom/amazon/leapfrogmapgl/NativeMapboxViewEvent;", "surfaceId", "", "viewId", "markerId", "", "latitude", "", "longitude", "<init>", "(IILjava/lang/String;DD)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeMapboxOutdoorMarkerMoveEvent extends NativeMapboxViewEvent<NativeMapboxOutdoorMarkerMoveEvent> {

    @NotNull
    public static final String EVENT_NAME = "topOutdoorMarkerMove";
    private final double latitude;
    private final double longitude;

    @NotNull
    private final String markerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMapboxOutdoorMarkerMoveEvent(int i, int i2, @NotNull String str, double d, double d2) {
        super(i, i2);
        str.getClass();
        this.markerId = str;
        this.latitude = d;
        this.longitude = d2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventData */
    public WritableMap getData() {
        WritableMap createMap = Arguments.createMap();
        createMap.getClass();
        createMap.putString("markerId", this.markerId);
        createMap.putDouble("latitude", this.latitude);
        createMap.putDouble("longitude", this.longitude);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }
}
