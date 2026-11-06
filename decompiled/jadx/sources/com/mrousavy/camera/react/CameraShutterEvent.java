package com.mrousavy.camera.react;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/react/CameraShutterEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "data", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "getEventName", "", "getEventData", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraShutterEvent extends Event<CameraShutterEvent> {

    @NotNull
    public static final String EVENT_NAME = "topCameraShutter";

    @NotNull
    private final WritableMap data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraShutterEvent(int i, int i2, @NotNull WritableMap writableMap) {
        super(i, i2);
        writableMap.getClass();
        this.data = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventData, reason: from getter */
    public WritableMap getData() {
        return this.data;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }
}
