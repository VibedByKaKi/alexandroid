package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VIEW_MODEL_SCOPE_KEY", "", "createViewModelScope", "Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "asCloseable", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseableCoroutineScopeKt {

    @NotNull
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final CloseableCoroutineScope asCloseable(@NotNull CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        return new CloseableCoroutineScope(coroutineScope);
    }

    @NotNull
    public static final CloseableCoroutineScope createViewModelScope() {
        CoroutineContext coroutineContext;
        try {
            coroutineContext = Dispatchers.getMain().getImmediate();
        } catch (IllegalStateException unused) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }
}
