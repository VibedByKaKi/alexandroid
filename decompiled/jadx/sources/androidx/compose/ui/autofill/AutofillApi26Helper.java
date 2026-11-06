package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.routing.api.RouteParameter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b)\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0007J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007J@\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0007J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0007J#\u0010%\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0'H\u0007¢\u0006\u0002\u0010(J \u0010)\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\bH\u0007J\u0018\u0010,\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\bH\u0007J\u0018\u0010.\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010/\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001cH\u0007J\u0018\u00101\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001cH\u0007J\u0018\u00103\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00104\u001a\u00020\bH\u0007J\u0018\u00105\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000fH\u0007J\u0018\u00107\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u001cH\u0007J\u0018\u00109\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u001cH\u0007J\u0018\u0010;\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u001cH\u0007J\u0018\u0010=\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u001cH\u0007J\u0018\u0010?\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u001cH\u0007J\u0018\u0010A\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\bH\u0007J\u0018\u0010B\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u001cH\u0007J\u0018\u0010D\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u001cH\u0007J\u0018\u0010F\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u001cH\u0007J\u0018\u0010H\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020$H\u0007J\u0018\u0010J\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\bH\u0007J\u0010\u0010L\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010M\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010N\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010O\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000fH\u0007¨\u0006P"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "<init>", "()V", "newChild", "Landroid/view/ViewStructure;", "structure", "index", "", "addChildCount", "num", "setId", "", "id", "packageName", "", "typeName", "entryName", "setDimens", "left", "top", "scrollX", "scrollY", "width", "height", "getAutofillId", "Landroid/view/autofill/AutofillId;", "isDate", "", "value", "Landroid/view/autofill/AutofillValue;", "isList", "isText", "isToggle", "setContentDescription", "contentDescription", "", "setAutofillHints", "hints", "", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "setAutofillId", RouteParameter.PARENT, "virtualId", "setAutofillType", "type", "setAutofillValue", "setCheckable", "checkable", "setChecked", "checked", "setChildCount", "numChildren", "setClassName", "classname", "setClickable", "clickable", "setDataIsSensitive", "isSensitive", "setEnabled", "enabled", "setFocusable", "focusable", "setFocused", "focused", "setInputType", "setLongClickable", "longClickable", "setOpaque", "isOpaque", "setSelected", "isSelected", "setText", "text", "setVisibility", "visibility", "textValue", "booleanValue", "listValue", "getAutofillTextValue", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;

    @NotNull
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @RequiresApi(26)
    public final int addChildCount(@NotNull ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    @RequiresApi(26)
    public final boolean booleanValue(@NotNull AutofillValue value) {
        return value.getToggleValue();
    }

    @RequiresApi(26)
    @Nullable
    public final AutofillId getAutofillId(@NotNull ViewStructure structure) {
        return structure.getAutofillId();
    }

    @RequiresApi(26)
    @NotNull
    public final AutofillValue getAutofillTextValue(@NotNull String value) {
        return AutofillValue.forText(value);
    }

    @RequiresApi(26)
    public final boolean isDate(@NotNull AutofillValue value) {
        return value.isDate();
    }

    @RequiresApi(26)
    public final boolean isList(@NotNull AutofillValue value) {
        return value.isList();
    }

    @RequiresApi(26)
    public final boolean isText(@NotNull AutofillValue value) {
        return value.isText();
    }

    @RequiresApi(26)
    public final boolean isToggle(@NotNull AutofillValue value) {
        return value.isToggle();
    }

    @RequiresApi(26)
    public final int listValue(@NotNull AutofillValue value) {
        return value.getListValue();
    }

    @RequiresApi(26)
    @NotNull
    public final ViewStructure newChild(@NotNull ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    @RequiresApi(26)
    public final void setAutofillHints(@NotNull ViewStructure structure, @NotNull String[] hints) {
        structure.setAutofillHints(hints);
    }

    @RequiresApi(26)
    public final void setAutofillId(@NotNull ViewStructure structure, @NotNull AutofillId parent, int virtualId) {
        structure.setAutofillId(parent, virtualId);
    }

    @RequiresApi(26)
    public final void setAutofillType(@NotNull ViewStructure structure, int type) {
        structure.setAutofillType(type);
    }

    @RequiresApi(26)
    public final void setAutofillValue(@NotNull ViewStructure structure, @NotNull AutofillValue value) {
        structure.setAutofillValue(value);
    }

    @RequiresApi(26)
    public final void setCheckable(@NotNull ViewStructure structure, boolean checkable) {
        structure.setCheckable(checkable);
    }

    @RequiresApi(26)
    public final void setChecked(@NotNull ViewStructure structure, boolean checked) {
        structure.setChecked(checked);
    }

    @RequiresApi(26)
    public final void setChildCount(@NotNull ViewStructure structure, int numChildren) {
        structure.setChildCount(numChildren);
    }

    @RequiresApi(26)
    public final void setClassName(@NotNull ViewStructure structure, @NotNull String classname) {
        structure.setClassName(classname);
    }

    @RequiresApi(26)
    public final void setClickable(@NotNull ViewStructure structure, boolean clickable) {
        structure.setClickable(clickable);
    }

    @RequiresApi(26)
    public final void setContentDescription(@NotNull ViewStructure structure, @NotNull CharSequence contentDescription) {
        structure.setContentDescription(contentDescription);
    }

    @RequiresApi(26)
    public final void setDataIsSensitive(@NotNull ViewStructure structure, boolean isSensitive) {
        structure.setDataIsSensitive(isSensitive);
    }

    @RequiresApi(26)
    public final void setDimens(@NotNull ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    @RequiresApi(26)
    public final void setEnabled(@NotNull ViewStructure structure, boolean enabled) {
        structure.setEnabled(enabled);
    }

    @RequiresApi(26)
    public final void setFocusable(@NotNull ViewStructure structure, boolean focusable) {
        structure.setFocusable(focusable);
    }

    @RequiresApi(26)
    public final void setFocused(@NotNull ViewStructure structure, boolean focused) {
        structure.setFocused(focused);
    }

    @RequiresApi(26)
    public final void setId(@NotNull ViewStructure structure, int id, @Nullable String packageName, @Nullable String typeName, @Nullable String entryName) {
        structure.setId(id, packageName, typeName, entryName);
    }

    @RequiresApi(26)
    public final void setInputType(@NotNull ViewStructure structure, int type) {
        structure.setInputType(type);
    }

    @RequiresApi(26)
    public final void setLongClickable(@NotNull ViewStructure structure, boolean longClickable) {
        structure.setLongClickable(longClickable);
    }

    @RequiresApi(26)
    public final void setOpaque(@NotNull ViewStructure structure, boolean isOpaque) {
        structure.setOpaque(isOpaque);
    }

    @RequiresApi(26)
    public final void setSelected(@NotNull ViewStructure structure, boolean isSelected) {
        structure.setSelected(isSelected);
    }

    @RequiresApi(26)
    public final void setText(@NotNull ViewStructure structure, @NotNull CharSequence text) {
        structure.setText(text);
    }

    @RequiresApi(26)
    public final void setVisibility(@NotNull ViewStructure structure, int visibility) {
        structure.setVisibility(visibility);
    }

    @RequiresApi(26)
    @NotNull
    public final CharSequence textValue(@NotNull AutofillValue value) {
        return value.getTextValue();
    }
}
