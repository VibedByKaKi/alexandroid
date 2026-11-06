package com.amazon.alexa.navigation.menu.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.mosaic.themes.R;
import com.amazon.alexa.navigation.menu.adapter.NavigationAdapter;
import com.amazon.alexa.navigation.menu.model.MenuItem;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SmartHomeGridNavigationAdapter extends NavigationAdapter {
    private static final String TAG = "SmartHomeGridNavigationAdapter";

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
                navigationViewHolder.setBackgroundColor(ContextCompat.getColor(navigationViewHolder.context, R.color.mosaic_tile_menu_background_pressed));
                return false;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            NavigationAdapter.NavigationViewHolder navigationViewHolder2 = this.holder;
            navigationViewHolder2.setBackgroundColor(ContextCompat.getColor(navigationViewHolder2.context, R.color.mosaic_tile_menu_background_default));
            return false;
        }
    }

    public SmartHomeGridNavigationAdapter(List<MenuItem> list) {
        super(list);
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    @SuppressLint({"ClickableViewAccessibility"})
    public void bindItem(MenuItem menuItem, NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        super.bindItem(menuItem, navigationViewHolder);
        navigationViewHolder.setBackgroundColor(ContextCompat.getColor(navigationViewHolder.context, R.color.mosaic_tile_menu_background_default));
        navigationViewHolder.itemHolder.setOnTouchListener(new TouchToChangeBackgroundColorListener(navigationViewHolder));
        if (menuItem.isPromoted) {
            LinearLayout linearLayout = (LinearLayout) navigationViewHolder.holderView.findViewById(com.amazon.alexa.navigation.menu.R.id.item_text_container);
            LayoutInflater.from(linearLayout.getContext()).inflate(com.amazon.alexa.navigation.menu.R.layout.navigaiton_menu_promotion_tag, linearLayout);
        }
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    public void setItemIconColor(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setItemIconColor(R.attr.mosaicIcon100);
    }

    @Override // com.amazon.alexa.navigation.menu.adapter.NavigationAdapter
    public void setRippleColor(NavigationAdapter.NavigationViewHolder navigationViewHolder) {
    }
}
