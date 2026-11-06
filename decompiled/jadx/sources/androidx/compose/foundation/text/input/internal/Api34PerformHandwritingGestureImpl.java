package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(34)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34PerformHandwritingGestureImpl;", "", "()V", "performHandwritingGesture", "", OperationalEventType.SESSION, "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "executor", "Ljava/util/concurrent/Executor;", "intConsumer", "Ljava/util/function/IntConsumer;", "previewHandwritingGesture", "", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api34PerformHandwritingGestureImpl {

    @NotNull
    public static final Api34PerformHandwritingGestureImpl INSTANCE = new Api34PerformHandwritingGestureImpl();

    private Api34PerformHandwritingGestureImpl() {
    }

    @DoNotInline
    public final void performHandwritingGesture(@NotNull TextInputSession session, @NotNull HandwritingGesture gesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        int performHandwritingGesture = session.performHandwritingGesture(gesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0(intConsumer, performHandwritingGesture, 0));
        } else {
            intConsumer.accept(performHandwritingGesture);
        }
    }

    @DoNotInline
    public final boolean previewHandwritingGesture(@NotNull TextInputSession session, @NotNull PreviewableHandwritingGesture gesture, @Nullable CancellationSignal cancellationSignal) {
        return session.previewHandwritingGesture(gesture, cancellationSignal);
    }
}
