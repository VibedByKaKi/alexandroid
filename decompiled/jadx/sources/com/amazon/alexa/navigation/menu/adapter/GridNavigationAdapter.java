package com.amazon.alexa.navigation.menu.adapter;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.mosaic.themes.R;
import com.amazon.alexa.navigation.menu.adapter.NavigationAdapter;
import com.amazon.alexa.navigation.menu.model.MenuItem;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GridNavigationAdapter extends NavigationAdapter {
    static final int ADD_DEVICE_TEXT_HORIZONTAL_MARGIN_DP = 12;
    static final int ADD_DEVICE_TEXT_VERTICAL_MARGIN_DP = 10;
    static final int FULL_OPACITY = 255;
    static final int HALF_OPACITY = 128;
    static final int NO_COLOR = 0;
    private static final String TAG = "GridNavigationAdapter";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TouchToChangeBackgroundColorListener implements View.OnTouchListener {
        NavigationAdapter.NavigationViewHolder holder;

        public TouchToChangeBackgroundColorListener(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
            this.holder = navigationViewHolder;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                NavigationAdapter.NavigationViewHolder navigationViewHolder = this.holder;
                navigationViewHolder.setBackgroundColor(ThemeUtil.getColorFromAttribute(navigationViewHolder.context, R.attr.mosaicNeutral50));
            } else if (action == 1 || action == 3) {
                NavigationAdapter.NavigationViewHolder navigationViewHolder2 = this.holder;
                navigationViewHolder2.setBackgroundColor(ThemeUtil.getColorFromAttribute(navigationViewHolder2.context, 0));
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TouchToChangeBackgroundOpacityListener implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Drawable background = view.getBackground();
            int action = motionEvent.getAction();
            if (action == 0) {
                background.setAlpha(128);
                return false;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            background.setAlpha(255);
            return false;
        }
    }

    public GridNavigationAdapter(List<MenuItem> list, boolean z) {
        super(list);
    }

    private void addDividerLineOnSettingForTablet(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        LinearLayout linearLayout = (LinearLayout) navigationViewHolder.holderView.findViewById(com.amazon.alexa.navigation.menu.R.id.recycler_view_item);
        View inflate = LayoutInflater.from(navigationViewHolder.context).inflate(com.amazon.alexa.navigation.menu.R.layout.navigation_menu_divider_line, (ViewGroup) linearLayout, false);
        navigationViewHolder.divider = inflate;
        inflate.setVisibility(0);
        setDividerColor(navigationViewHolder);
        linearLayout.addView(inflate, 0);
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    @SuppressLint({"ClickableViewAccessibility"})
    public void bindItem(MenuItem menuItem, NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        super.bindItem(menuItem, navigationViewHolder);
        int menuItemLayout = menuItem.getMenuItemLayout();
        if (menuItemLayout == com.amazon.alexa.navigation.menu.R.layout.navigation_menu_tile_item) {
            navigationViewHolder.itemHolder.setOnTouchListener(new TouchToChangeBackgroundOpacityListener());
        } else if (menuItemLayout == com.amazon.alexa.navigation.menu.R.layout.navigation_menu_list_item || menuItemLayout == com.amazon.alexa.navigation.menu.R.layout.navigation_menu_expandable_item_v2) {
            navigationViewHolder.itemHolder.setOnTouchListener(new TouchToChangeBackgroundColorListener(navigationViewHolder));
        }
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    public void setDividerColor(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setDividerColor(R.attr.mosaicNeutral50);
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    public void setItemIconColor(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setItemIconColor(R.attr.mosaicIcon100);
    }

    public GridNavigationAdapter(List<MenuItem> list) {
        super(list);
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    public void setRippleColor(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
    }
}
