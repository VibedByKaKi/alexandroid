package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB!\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextChangedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "text", "", "eventCount", "<init>", "(IILjava/lang/String;I)V", "(ILjava/lang/String;I)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactTextChangedEvent extends Event<ReactTextChangedEvent> {

    @NotNull
    public static final String EVENT_NAME = "topChange";
    private final int eventCount;

    @NotNull
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextChangedEvent(int i, int i2, @NotNull String str, int i3) {
        super(i, i2);
        str.getClass();
        this.text = str;
        this.eventCount = i3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventData */
    public WritableMap getData() {
        WritableMap createMap = Arguments.createMap();
        createMap.getClass();
        createMap.putString("text", this.text);
        createMap.putInt("eventCount", this.eventCount);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventName */
    public String getName() {
        return "topChange";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use the constructor with surfaceId instead", replaceWith = @ReplaceWith(expression = "ReactTextChangedEvent(surfaceId, viewId, text, eventCount)", imports = {}))
    public ReactTextChangedEvent(int i, @NotNull String str, int i2) {
        this(-1, i, str, i2);
        str.getClass();
    }
}
