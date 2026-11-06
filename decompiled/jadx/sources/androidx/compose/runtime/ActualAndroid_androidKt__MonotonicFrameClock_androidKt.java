package androidx.compose.runtime;

import android.os.Looper;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"!\u0010\u0002\u001a\u00020\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"DisallowDefaultMonotonicFrameClock", "", "DefaultMonotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "DefaultMonotonicFrameClock$delegate", "Lkotlin/Lazy;", SmartFragmentContent.RUNTIME}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/ActualAndroid_androidKt")
/* loaded from: classes13.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {

    @NotNull
    private static final Lazy DefaultMonotonicFrameClock$delegate = LazyKt.lazy(new ComputedProvidableCompositionLocal$$ExternalSyntheticLambda0(1));
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final MonotonicFrameClock DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
    }

    @NotNull
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @Deprecated(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}
