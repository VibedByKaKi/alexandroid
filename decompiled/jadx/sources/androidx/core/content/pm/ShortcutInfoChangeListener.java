package androidx.core.content.pm;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes13.dex */
public abstract class ShortcutInfoChangeListener {
    @AnyThread
    public void onAllShortcutsRemoved() {
    }

    @AnyThread
    public void onShortcutAdded(List<ShortcutInfoCompat> list) {
    }

    @AnyThread
    public void onShortcutRemoved(List<String> list) {
    }

    @AnyThread
    public void onShortcutUpdated(List<ShortcutInfoCompat> list) {
    }

    @AnyThread
    public void onShortcutUsageReported(List<String> list) {
    }
}
