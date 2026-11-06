package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalIndirectTouchTypeApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"nativeEvent", "Landroid/view/MotionEvent;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "getNativeEvent$annotations", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)V", "getNativeEvent", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)Landroid/view/MotionEvent;", "IndirectTouchEvent", "motionEvent", "convertActionToIndirectTouchEventType", "Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "actionMasked", "", "(I)I", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidIndirectTouchEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidIndirectTouchEvent.android.kt\nandroidx/compose/ui/input/indirect/AndroidIndirectTouchEvent_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,58:1\n30#2:59\n53#3,3:60\n*S KotlinDebug\n*F\n+ 1 AndroidIndirectTouchEvent.android.kt\nandroidx/compose/ui/input/indirect/AndroidIndirectTouchEvent_androidKt\n*L\n43#1:59\n43#1:60,3\n*E\n"})
/* loaded from: classes13.dex */
public final class AndroidIndirectTouchEvent_androidKt {
    @ExperimentalIndirectTouchTypeApi
    @NotNull
    public static final IndirectTouchEvent IndirectTouchEvent(@NotNull MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return new AndroidIndirectTouchEvent(Offset.m4392constructorimpl((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32)), motionEvent.getEventTime(), convertActionToIndirectTouchEventType(motionEvent.getActionMasked()), motionEvent, null);
    }

    public static final int convertActionToIndirectTouchEventType(int i) {
        return i != 0 ? i != 1 ? i != 2 ? IndirectTouchEventType.INSTANCE.m5484getUnknownLxEHWp8() : IndirectTouchEventType.INSTANCE.m5481getMoveLxEHWp8() : IndirectTouchEventType.INSTANCE.m5483getReleaseLxEHWp8() : IndirectTouchEventType.INSTANCE.m5482getPressLxEHWp8();
    }

    @NotNull
    public static final MotionEvent getNativeEvent(@NotNull IndirectTouchEvent indirectTouchEvent) {
        indirectTouchEvent.getClass();
        return ((AndroidIndirectTouchEvent) indirectTouchEvent).getNativeEvent();
    }

    @ExperimentalIndirectTouchTypeApi
    public static /* synthetic */ void getNativeEvent$annotations(IndirectTouchEvent indirectTouchEvent) {
    }
}
