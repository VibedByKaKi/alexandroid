package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Deprecated(message = "Use FocusProperties instead")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR$\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR$\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR$\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "(Landroidx/compose/ui/focus/FocusProperties;)V", "()V", "next", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FocusOrder {
    public static final int $stable = 8;

    @NotNull
    private final FocusProperties focusProperties;

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }

    @NotNull
    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    @NotNull
    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    @NotNull
    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    @NotNull
    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    @NotNull
    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    @NotNull
    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    @NotNull
    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    @NotNull
    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setDown(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setDown(focusRequester);
    }

    public final void setEnd(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setEnd(focusRequester);
    }

    public final void setLeft(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setLeft(focusRequester);
    }

    public final void setNext(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setNext(focusRequester);
    }

    public final void setPrevious(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setPrevious(focusRequester);
    }

    public final void setRight(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setRight(focusRequester);
    }

    public final void setStart(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setStart(focusRequester);
    }

    public final void setUp(@NotNull FocusRequester focusRequester) {
        this.focusProperties.setUp(focusRequester);
    }

    public FocusOrder(@NotNull FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }
}
