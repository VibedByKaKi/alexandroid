package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallback;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "onShowTranslation", "", "view", "Landroid/view/View;", "onHideTranslation", "onClearTranslation", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    @NotNull
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(@NotNull View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager().onClearTranslation$ui_release();
        return true;
    }

    public boolean onHideTranslation(@NotNull View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager().onHideTranslation$ui_release();
        return true;
    }

    public boolean onShowTranslation(@NotNull View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager().onShowTranslation$ui_release();
        return true;
    }
}
