package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "onAllConnectionsClosed", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/jvm/functions/Function0;)V", JoinPoint.SYNCHRONIZATION_LOCK, "connections", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", MetricsConstants.Firmware.CAUSE_DISPOSED, "", VoiceChatContract.COLUMN_IS_ACTIVE, "()Z", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "dispose", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,183:1\n1107#2:184\n1085#2,2:185\n32#3:187\n32#3:189\n1#4:188\n424#5,8:190\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n122#1:184\n122#1:185,2\n136#1:187\n175#1:189\n178#1:190,8\n*E\n"})
/* loaded from: classes13.dex */
final class InputMethodSession {
    private boolean disposed;

    @NotNull
    private final Function0<Unit> onAllConnectionsClosed;

    @NotNull
    private final PlatformTextInputMethodRequest request;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest, @NotNull Function0<Unit> function0) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = function0;
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(outAttrs), new Function1<NullableInputConnectionWrapper, Unit>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    MutableVector mutableVector;
                    MutableVector mutableVector2;
                    Function0 function0;
                    MutableVector mutableVector3;
                    nullableInputConnectionWrapper.disposeDelegate();
                    mutableVector = InputMethodSession.this.connections;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            break;
                        } else if (Intrinsics.areEqual((WeakReference) objArr[i], nullableInputConnectionWrapper)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        mutableVector3 = InputMethodSession.this.connections;
                        mutableVector3.removeAt(i);
                    }
                    mutableVector2 = InputMethodSession.this.connections;
                    if (mutableVector2.getSize() == 0) {
                        function0 = InputMethodSession.this.onAllConnectionsClosed;
                        function0.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    invoke2(nullableInputConnectionWrapper);
                    return Unit.INSTANCE;
                }
            });
            this.connections.add(new WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                MutableVector<WeakReference<NullableInputConnectionWrapper>> mutableVector = this.connections;
                WeakReference<NullableInputConnectionWrapper>[] weakReferenceArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                }
                this.connections.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
