package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import com.amazon.alexa.ra.core.data.model.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jj\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\b\u0010\f\u001a\u00020\u0003H&R\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", "showMenu", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", Constants.HINT_TEXT_OPERATION_HIDE, "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TextToolbar {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        if ((i & 16) != 0) {
            function04 = null;
        }
        if ((i & 32) != 0) {
            function05 = null;
        }
        textToolbar.showMenu(rect, function0, function02, function03, function04, function05);
    }

    @NotNull
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested);

    default void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested, @Nullable Function0<Unit> onAutofillRequested) {
        showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(@NotNull TextToolbar textToolbar, @NotNull Rect rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Function0<Unit> function05) {
            TextToolbar.super.showMenu(rect, function0, function02, function03, function04, function05);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        if ((i & 16) != 0) {
            function04 = null;
        }
        textToolbar.showMenu(rect, function0, function02, function03, function04);
    }
}
