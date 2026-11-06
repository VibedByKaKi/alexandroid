package com.amazon.dee.app.ui.main;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import com.amazon.dee.app.core.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NoUserTheme implements AlexaTheme {
    private Context context;

    public NoUserTheme(Context context) {
        this.context = context;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getBackgroundColor() {
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getContrastColor() {
        return this.context.getResources().getColor(R.color.white);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getNavigationBarBackgroundColor() {
        return getBackgroundColor();
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getNotificationIconColor() {
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getSystemUiVisibility() {
        return 0;
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public ColorStateList getTabIconColor() {
        return AppCompatResources.getColorStateList(this.context, android.R.color.black);
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public int getTabSelectionBarColor() {
        return getContrastColor();
    }

    @Override // com.amazon.dee.app.ui.main.AlexaTheme
    public ColorStateList getTabTextColor() {
        return AppCompatResources.getColorStateList(this.context, android.R.color.black);
    }
}
