package androidx.core.internal.view;

import android.view.Menu;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes13.dex */
public interface SupportMenu extends Menu {
    public static final int CATEGORY_MASK = -65536;
    public static final int CATEGORY_SHIFT = 16;
    public static final int FLAG_KEEP_OPEN_ON_SUBMENU_OPENED = 4;
    public static final int SUPPORTED_MODIFIERS_MASK = 69647;
    public static final int USER_MASK = 65535;
    public static final int USER_SHIFT = 0;

    @Override // android.view.Menu
    void setGroupDividerEnabled(boolean z);
}
