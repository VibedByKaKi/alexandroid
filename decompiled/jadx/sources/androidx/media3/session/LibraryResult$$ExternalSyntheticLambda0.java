package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.MediaItem;
import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LibraryResult$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LibraryResult$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((MediaItem) obj).toBundle();
            case 1:
                return ((CommandButton) obj).toBundle();
            case 2:
                return MediaItem.fromBundle((Bundle) obj);
            default:
                return ((MediaItem) obj).toBundleIncludeLocalConfiguration();
        }
    }
}
