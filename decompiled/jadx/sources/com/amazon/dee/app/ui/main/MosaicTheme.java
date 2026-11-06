package com.amazon.dee.app.ui.main;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.ui.util.UiUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MosaicTheme implements AlexaTheme {
    protected Context context;
    private final boolean isJasperTheme;
    private int[][] tabStates;

    public MosaicTheme(Context context) {
        this.context = context;
        int theme = getTheme();
        context.setTheme(theme);
        this.isJasperTheme = theme == R.style.Theme_Mosaic_Jasper;
    }

    private int getTheme() {
        return R.style.Theme_Mosaic_Jasper;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getBackgroundColor() {
        return ThemeUtil.getColorFromAttribute(this.context, R.attr.mosaicBackground);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getContrastColor() {
        return ThemeUtil.getColorFromAttribute(this.context, R.attr.mosaicNeutral10);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getNavigationBarBackgroundColor() {
        return getBackgroundColor();
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getNotificationIconColor() {
        return ThemeUtil.getColorFromAttribute(this.context, R.attr.mosaicStatus20);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getSystemUiVisibility() {
        return (this.isJasperTheme && UiUtils.isLightMode(this.context)) ? 8208 : 0;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public ColorStateList getTabIconColor() {
        if (this.tabStates == null) {
            this.tabStates = new int[][]{new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_selected}, new int[]{-16842913}};
        }
        return new ColorStateList(this.tabStates, new int[]{ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_icon_unselected), ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_icon_selected), ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_icon_unselected)});
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getTabSelectionBarColor() {
        return ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_indicator_selected);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public ColorStateList getTabTextColor() {
        if (this.tabStates == null) {
            this.tabStates = new int[][]{new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_selected}, new int[]{-16842913}};
        }
        return new ColorStateList(this.tabStates, new int[]{ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_text_unselected), ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_text_selected), ContextCompat.getColor(this.context, R.color.mosaic_bottom_bar_text_unselected)});
    }
}
