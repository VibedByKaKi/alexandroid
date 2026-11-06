package androidx.core.content;

import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.impl.QuirkSettings;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class IntentSanitizer$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ IntentSanitizer$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1((String) obj);
                break;
            case 1:
                DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 2:
                androidx.camera.core.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 3:
                androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 4:
                androidx.camera.video.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 5:
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0((String) obj);
                break;
        }
    }
}
