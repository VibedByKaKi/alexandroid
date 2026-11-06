package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputSubmitEditingEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "text", "", "<init>", "(IILjava/lang/String;)V", "(ILjava/lang/String;)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "canCoalesce", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactTextInputSubmitEditingEvent extends Event<ReactTextInputSubmitEditingEvent> {

    @NotNull
    private static final String EVENT_NAME = "topSubmitEditing";

    @NotNull
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextInputSubmitEditingEvent(int i, int i2, @NotNull String str) {
        super(i, i2);
        str.getClass();
        this.text = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventData */
    public WritableMap getData() {
        WritableMap createMap = Arguments.createMap();
        createMap.getClass();
        createMap.putInt("target", getViewTag());
        createMap.putString("text", this.text);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use the constructor with surfaceId instead", replaceWith = @ReplaceWith(expression = "ReactTextInputSubmitEditingEvent(surfaceId, viewId, text)", imports = {}))
    public ReactTextInputSubmitEditingEvent(int i, @NotNull String str) {
        this(-1, i, str);
        str.getClass();
    }
}
