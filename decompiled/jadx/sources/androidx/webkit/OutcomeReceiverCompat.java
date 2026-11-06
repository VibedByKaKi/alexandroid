package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.Profile;
import java.lang.Throwable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Profile.ExperimentalUrlPrefetch
/* loaded from: classes14.dex */
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    void onResult(T t);

    default void onError(@NonNull E e) {
    }
}
