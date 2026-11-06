package androidx.compose.ui.platform;

import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ClipMetadata;", "", "clipDescription", "Landroid/content/ClipDescription;", "<init>", "(Landroid/content/ClipDescription;)V", "getClipDescription", "()Landroid/content/ClipDescription;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClipMetadata {
    public static final int $stable = 8;

    @NotNull
    private final ClipDescription clipDescription;

    public ClipMetadata(@NotNull ClipDescription clipDescription) {
        this.clipDescription = clipDescription;
    }

    @NotNull
    public final ClipDescription getClipDescription() {
        return this.clipDescription;
    }
}
