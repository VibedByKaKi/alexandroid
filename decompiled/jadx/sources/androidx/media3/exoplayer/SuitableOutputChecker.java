package androidx.media3.exoplayer;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(35)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes14.dex */
public interface SuitableOutputChecker {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onSelectedOutputSuitabilityChanged(boolean z);
    }

    void disable();

    void enable(Callback callback);

    boolean isSelectedOutputSuitableForPlayback();
}
