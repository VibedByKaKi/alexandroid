package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import com.amazon.alexa.ra.core.data.model.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0016JP\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "actionMode", "Landroid/view/ActionMode;", "textActionModeCallback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "value", "Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "showMenu", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", Constants.HINT_TEXT_OPERATION_HIDE, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;

    @Nullable
    private ActionMode actionMode;

    @NotNull
    private final View view;

    @NotNull
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidTextToolbar.this.actionMode = null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }, null, null, null, null, null, null, 126, null);

    @NotNull
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@NotNull View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested, @Nullable Function0<Unit> onAutofillRequested) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(onCopyRequested);
        this.textActionModeCallback.setOnCutRequested(onCutRequested);
        this.textActionModeCallback.setOnPasteRequested(onPasteRequested);
        this.textActionModeCallback.setOnSelectAllRequested(onSelectAllRequested);
        this.textActionModeCallback.setOnAutofillRequested(onAutofillRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested) {
        showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, null);
    }
}
