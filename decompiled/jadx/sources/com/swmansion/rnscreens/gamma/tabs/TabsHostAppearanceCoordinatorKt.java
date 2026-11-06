package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"getOrCreateMenuItem", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "index", "", "tabScreen", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;", "react-native-screens_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TabsHostAppearanceCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuItem getOrCreateMenuItem(Menu menu, int i, TabScreen tabScreen) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            return findItem;
        }
        MenuItem add = menu.add(0, i, 0, tabScreen.getTabTitle());
        add.getClass();
        return add;
    }
}
