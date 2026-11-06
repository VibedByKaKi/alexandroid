package expo.modules.kotlin.activityresult;

import androidx.annotation.MainThread;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0006\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "", "registerForActivityResult", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "I", "O", "Ljava/io/Serializable;", "contract", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "fallbackCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AppContextActivityResultCaller {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object registerForActivityResult$default(AppContextActivityResultCaller appContextActivityResultCaller, AppContextActivityResultContract appContextActivityResultContract, AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: registerForActivityResult");
                return null;
            }
            if ((i & 2) != 0) {
                appContextActivityResultFallbackCallback = new CodecsKt$$ExternalSyntheticBUOutline0(29);
            }
            return appContextActivityResultCaller.registerForActivityResult(appContextActivityResultContract, appContextActivityResultFallbackCallback, continuation);
        }
    }

    @MainThread
    @Nullable
    <I extends Serializable, O> Object registerForActivityResult(@NotNull AppContextActivityResultContract<I, O> appContextActivityResultContract, @NotNull AppContextActivityResultFallbackCallback<I, O> appContextActivityResultFallbackCallback, @NotNull Continuation<? super AppContextActivityResultLauncher<I, O>> continuation);
}
