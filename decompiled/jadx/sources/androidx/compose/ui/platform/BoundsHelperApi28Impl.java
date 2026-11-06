package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(28)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi28Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "<init>", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BoundsHelperApi28Impl implements BoundsHelper {

    @NotNull
    public static final BoundsHelperApi28Impl INSTANCE = new BoundsHelperApi28Impl();

    private BoundsHelperApi28Impl() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        r8 = androidx.compose.ui.platform.AndroidWindowInfo_androidKt.getCutoutForDisplay(r0);
     */
    @Override // androidx.compose.ui.platform.BoundsHelper
    @android.annotation.SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Rect currentWindowBounds(@org.jetbrains.annotations.NotNull android.app.Activity r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.BoundsHelperApi28Impl.currentWindowBounds(android.app.Activity):android.graphics.Rect");
    }
}
