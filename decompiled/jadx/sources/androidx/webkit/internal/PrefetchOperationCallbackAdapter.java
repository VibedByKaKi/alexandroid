package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class PrefetchOperationCallbackAdapter {
    public static InvocationHandler buildInvocationHandler(final OutcomeReceiverCompat<Void, PrefetchException> outcomeReceiverCompat) {
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new PrefetchOperationCallbackBoundaryInterface() { // from class: androidx.webkit.internal.PrefetchOperationCallbackAdapter.1
            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onFailure(int i, String str, int i2) {
                OutcomeReceiverCompat outcomeReceiverCompat2 = OutcomeReceiverCompat.this;
                if (i == 1) {
                    outcomeReceiverCompat2.onError(new PrefetchNetworkException(str, i2));
                } else {
                    outcomeReceiverCompat2.onError(new PrefetchException(str));
                }
            }

            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onSuccess() {
                OutcomeReceiverCompat.this.onResult(null);
            }
        });
    }
}
