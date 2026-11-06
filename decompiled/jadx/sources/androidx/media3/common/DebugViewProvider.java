package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new Fragment$$ExternalSyntheticBUOutline0(13);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
