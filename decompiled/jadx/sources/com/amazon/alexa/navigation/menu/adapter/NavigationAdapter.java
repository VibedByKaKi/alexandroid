package com.amazon.alexa.navigation.menu.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.navigation.Navigation$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.navigation.menu.R;
import com.amazon.alexa.navigation.menu.constants.TestId;
import com.amazon.alexa.navigation.menu.model.MenuItem;
import com.amazon.alexa.navigation.menu.util.UiUtils;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class NavigationAdapter extends RecyclerView.Adapter<NavigationViewHolder> {
    private static final String TAG = "NavigationAdapter";
    List<MenuItem> menuItems;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NavigationViewHolder extends RecyclerView.ViewHolder {
        private static final String TAG = "NavigationViewHolder";
        Context context;
        View divider;
        View holderView;
        LinearLayout itemHolder;
        ImageView itemIcon;
        TextView itemName;

        public NavigationViewHolder(Context context, View view) {
            super(view);
            this.context = context;
            ThemeUtil.setTheme(context);
            this.itemName = (TextView) view.findViewById(R.id.item_text);
            setItemNameFont(Font.APP_TEXT_REGULAR);
            this.itemIcon = (ImageView) view.findViewById(R.id.item_icon);
            this.itemHolder = (LinearLayout) view.findViewById(R.id.recycler_view_resources);
            this.divider = view.findViewById(R.id.menu_item_divider);
            this.holderView = view;
        }

        private ColorStateList getRippleColor(int i) {
            return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
        }

        public void setBackgroundColor(int i) {
            Drawable background = this.itemHolder.getBackground();
            if (background instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                gradientDrawable.mutate();
                gradientDrawable.setColor(i);
            } else if (background instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) background;
                colorDrawable.mutate();
                colorDrawable.setColor(i);
            }
        }

        public void setDividerColor(int i) {
            View view = this.divider;
            if (view == null) {
                return;
            }
            view.setBackgroundColor(ThemeUtil.getColorFromAttribute(this.context, i));
        }

        public void setDividerVisibility(int i) {
            View view = this.divider;
            if (view == null) {
                return;
            }
            view.setVisibility(i);
        }

        public void setHolderViewMarginsWithDp(int i, int i2, int i3, int i4) {
            setViewsMarginsWithDp(this.holderView, i, i2, i3, i4, -1, -2);
        }

        public void setItemIconColor(int i) {
            this.itemIcon.setColorFilter(ThemeUtil.getColorFromAttribute(this.context, i));
        }

        public void setItemNameColor(int i) {
            this.itemName.setTextColor(ThemeUtil.getColorFromAttribute(this.context, i));
        }

        public void setItemNameFont(Font font) {
            this.itemName.setTypeface(FontResolver.getFont(this.context, font));
        }

        public void setItemNameMarginsWithDp(int i, int i2, int i3, int i4) {
            setViewsMarginsWithDp(this.itemName, i, i2, i3, i4, -2, -2);
        }

        public void setRippleColor(int i) {
            this.itemHolder.setBackground(new RippleDrawable(getRippleColor(ThemeUtil.getColorFromAttribute(this.context, i)), new ColorDrawable(0), new ColorDrawable(-1)));
        }

        public void setViewsMarginsWithDp(View view, int i, int i2, int i3, int i4, int i5, int i6) {
            int transformDpiToPx = UiUtils.transformDpiToPx(this.context, i);
            int transformDpiToPx2 = UiUtils.transformDpiToPx(this.context, i3);
            int transformDpiToPx3 = UiUtils.transformDpiToPx(this.context, i2);
            int transformDpiToPx4 = UiUtils.transformDpiToPx(this.context, i4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i6);
            layoutParams.setMargins(transformDpiToPx, transformDpiToPx3, transformDpiToPx2, transformDpiToPx4);
            layoutParams.setMarginStart(transformDpiToPx);
            layoutParams.setMarginEnd(transformDpiToPx2);
            view.setLayoutParams(layoutParams);
        }
    }

    public NavigationAdapter(List<MenuItem> list) {
        this.menuItems = list;
    }

    private void setItemColor(NavigationViewHolder navigationViewHolder) {
        setDividerColor(navigationViewHolder);
        setRippleColor(navigationViewHolder);
        setItemNameColor(navigationViewHolder);
        setItemIconColor(navigationViewHolder);
    }

    public void bindItem(MenuItem menuItem, NavigationViewHolder navigationViewHolder) {
        TestId testId = menuItem.getTestId();
        navigationViewHolder.itemHolder.setId(testId.itemTestId);
        navigationViewHolder.itemName.setText(menuItem.getNameId());
        navigationViewHolder.itemName.setId(testId.textTestId);
        navigationViewHolder.itemIcon.setImageResource(menuItem.getIconId());
        navigationViewHolder.itemIcon.setId(testId.iconTestId);
        setItemIconColor(navigationViewHolder);
        if (menuItem.getIconColor() != 0) {
            navigationViewHolder.itemIcon.getDrawable().mutate().setColorFilter(navigationViewHolder.itemIcon.getResources().getColor(menuItem.getIconColor()), PorterDuff.Mode.MULTIPLY);
            navigationViewHolder.itemIcon.setTag(Integer.valueOf(menuItem.getIconColor()));
        }
        navigationViewHolder.setDividerVisibility(menuItem.isLineUnderneath() ? 0 : 8);
        navigationViewHolder.itemHolder.setOnClickListener(new Navigation$$ExternalSyntheticLambda0(menuItem, 14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.menuItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @LayoutRes
    public int getItemViewType(int i) {
        return this.menuItems.get(i).getMenuItemLayout();
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull NavigationViewHolder navigationViewHolder, int i) {
        bindItem(this.menuItems.get(i), navigationViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public NavigationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, @LayoutRes int i) {
        NavigationViewHolder navigationViewHolder = new NavigationViewHolder(viewGroup.getContext(), LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        setItemColor(navigationViewHolder);
        return navigationViewHolder;
    }

    public void setDividerColor(NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setDividerColor(com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral30);
    }

    public void setItemIconColor(NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setItemIconColor(com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral10);
    }

    public void setItemNameColor(NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setItemNameColor(com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral10);
    }

    public void setRippleColor(NavigationViewHolder navigationViewHolder) {
        navigationViewHolder.setRippleColor(com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral60);
    }
}
