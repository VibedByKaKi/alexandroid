package androidx.paging.internal;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadStates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"appendMediatorStatesIfNotNull", "", "mediatorStates", "Landroidx/paging/LoadStates;", "log", "Lkotlin/Function0;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes14.dex */
public final class LogUtilKt {
    @NotNull
    public static final String appendMediatorStatesIfNotNull(@Nullable LoadStates loadStates, @NotNull Function0<String> function0) {
        String trimMargin$default;
        function0.getClass();
        String invoke = function0.invoke();
        if (loadStates != null) {
            invoke = invoke + "|   mediatorLoadStates: " + loadStates + '\n';
        }
        trimMargin$default = StringsKt__IndentKt.trimMargin$default(invoke + "|)", null, 1, null);
        return trimMargin$default;
    }
}
