package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isEnter", "isEnter-ZmokQxo", "isPress", "isPress-ZmokQxo", "isComposeRootInScrollableContainer", "Landroidx/compose/ui/node/DelegatableNode;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m465isClickZmokQxo(@NotNull KeyEvent keyEvent) {
        return KeyEventType.m5791equalsimpl0(KeyEvent_androidKt.m5799getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m5796getKeyUpCS__XNY()) && m466isEnterZmokQxo(keyEvent);
    }

    public static final boolean isComposeRootInScrollableContainer(@NotNull DelegatableNode delegatableNode) {
        return isInScrollableViewGroup(DelegatableNode_androidKt.requireView(delegatableNode));
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m466isEnterZmokQxo(KeyEvent keyEvent) {
        int m5805getNativeKeyCodeYVgTNJs = Key_androidKt.m5805getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5798getKeyZmokQxo(keyEvent));
        return m5805getNativeKeyCodeYVgTNJs == 23 || m5805getNativeKeyCodeYVgTNJs == 66 || m5805getNativeKeyCodeYVgTNJs == 160;
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m467isPressZmokQxo(@NotNull KeyEvent keyEvent) {
        return KeyEventType.m5791equalsimpl0(KeyEvent_androidKt.m5799getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m5795getKeyDownCS__XNY()) && m466isEnterZmokQxo(keyEvent);
    }
}
