package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionObserver;", "", "onBeginComposition", "", "composition", "Landroidx/compose/runtime/tooling/ObservableComposition;", "onScopeEnter", PermissionsResponse.SCOPE_KEY, "Landroidx/compose/runtime/RecomposeScope;", "onReadInScope", "value", "onScopeExit", "onEndComposition", "onScopeInvalidated", "onScopeDisposed", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CompositionObserver {
    void onBeginComposition(@NotNull ObservableComposition composition);

    void onEndComposition(@NotNull ObservableComposition composition);

    void onReadInScope(@NotNull RecomposeScope scope, @NotNull Object value);

    void onScopeDisposed(@NotNull RecomposeScope scope);

    void onScopeEnter(@NotNull RecomposeScope scope);

    void onScopeExit(@NotNull RecomposeScope scope);

    void onScopeInvalidated(@NotNull RecomposeScope scope, @Nullable Object value);
}
