package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "uptime", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "motionEvent", "Landroid/view/MotionEvent;", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "getUptime", "()J", "getPointers", "()Ljava/util/List;", "getMotionEvent", "()Landroid/view/MotionEvent;", "setMotionEvent", "(Landroid/view/MotionEvent;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PointerInputEvent {
    public static final int $stable = 8;

    @Nullable
    private MotionEvent motionEvent;

    @NotNull
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public PointerInputEvent(long j, @NotNull List<PointerInputEventData> list, @Nullable MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    @Nullable
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @NotNull
    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public final void setMotionEvent(@Nullable MotionEvent motionEvent) {
        this.motionEvent = motionEvent;
    }
}
