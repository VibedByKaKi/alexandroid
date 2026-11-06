package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class NavigationBarMenuBuilder {
    private final MenuBuilder menuBuilder;
    private int contentItemCount = 0;
    private int visibleContentItemCount = 0;
    private int visibleMainItemCount = 0;
    private final List<MenuItem> items = new ArrayList();

    public NavigationBarMenuBuilder(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
        refreshItems();
    }

    public int getContentItemCount() {
        return this.contentItemCount;
    }

    @NonNull
    public MenuItem getItemAt(int i) {
        return this.items.get(i);
    }

    public int getVisibleContentItemCount() {
        return this.visibleContentItemCount;
    }

    public int getVisibleMainContentItemCount() {
        return this.visibleMainItemCount;
    }

    public boolean performItemAction(@NonNull MenuItem menuItem, @NonNull MenuPresenter menuPresenter, int i) {
        return this.menuBuilder.performItemAction(menuItem, menuPresenter, i);
    }

    public void refreshItems() {
        this.items.clear();
        this.contentItemCount = 0;
        this.visibleContentItemCount = 0;
        this.visibleMainItemCount = 0;
        for (int i = 0; i < this.menuBuilder.size(); i++) {
            MenuItem item = this.menuBuilder.getItem(i);
            boolean hasSubMenu = item.hasSubMenu();
            List<MenuItem> list = this.items;
            if (hasSubMenu) {
                if (!list.isEmpty() && !(ErrorUtils$$ExternalSyntheticOutline0.m(this.items, 1) instanceof DividerMenuItem) && item.isVisible()) {
                    this.items.add(new DividerMenuItem());
                }
                this.items.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.items.add(item2);
                    this.contentItemCount++;
                    if (item2.isVisible()) {
                        this.visibleContentItemCount++;
                    }
                }
                this.items.add(new DividerMenuItem());
            } else {
                list.add(item);
                this.contentItemCount++;
                if (item.isVisible()) {
                    this.visibleContentItemCount++;
                    this.visibleMainItemCount++;
                }
            }
        }
        if (this.items.isEmpty() || !(ErrorUtils$$ExternalSyntheticOutline0.m(this.items, 1) instanceof DividerMenuItem)) {
            return;
        }
        List<MenuItem> list2 = this.items;
        list2.remove(list2.size() - 1);
    }

    public int size() {
        return this.items.size();
    }
}
