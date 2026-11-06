package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.amazon.alexa.routing.data.RouteName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J\u001a\u0010%\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J\u001a\u0010&\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010'\u001a\u0004\u0018\u00010(J\u0006\u0010)\u001a\u00020\u0004J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020-H\u0000¢\u0006\u0002\b.J(\u0010/\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020-2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0016¨\u00061"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "onActionModeDestroy", "Lkotlin/Function0;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnPasteRequested", "setOnPasteRequested", "getOnCutRequested", "setOnCutRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getOnAutofillRequested", "setOnAutofillRequested", "onCreateActionMode", "", "mode", "Landroid/view/ActionMode;", RouteName.MENU, "Landroid/view/Menu;", "onPrepareActionMode", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onDestroyActionMode", "updateMenuItems", "updateMenuItems$ui_release", "addMenuItem", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui_release", "addOrRemoveMenuItem", "callback", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes13.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;

    @Nullable
    private final Function0<Unit> onActionModeDestroy;

    @Nullable
    private Function0<Unit> onAutofillRequested;

    @Nullable
    private Function0<Unit> onCopyRequested;

    @Nullable
    private Function0<Unit> onCutRequested;

    @Nullable
    private Function0<Unit> onPasteRequested;

    @Nullable
    private Function0<Unit> onSelectAllRequested;

    @NotNull
    private Rect rect;

    public /* synthetic */ TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? Rect.INSTANCE.getZero() : rect, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05, (i & 64) != 0 ? null : function06);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption item, Function0<Unit> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            addMenuItem$ui_release(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void addMenuItem$ui_release(@NotNull Menu menu, @NotNull MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @Nullable
    public final Function0<Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @Nullable
    public final Function0<Unit> getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        item.getClass();
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0<Unit> function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0<Unit> function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            Function0<Unit> function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            Function0<Unit> function05 = this.onAutofillRequested;
            if (function05 != null) {
                function05.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (menu == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (mode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        Function0<Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean onPrepareActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(@Nullable Function0<Unit> function0) {
        this.onAutofillRequested = function0;
    }

    public final void setOnCopyRequested(@Nullable Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(@Nullable Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(@Nullable Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(@Nullable Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(@NotNull Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@NotNull Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(@Nullable Function0<Unit> function0, @NotNull Rect rect, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Function0<Unit> function05, @Nullable Function0<Unit> function06) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
        this.onAutofillRequested = function06;
    }

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
