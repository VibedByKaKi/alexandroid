package com.amazon.alexa.voice.ui.onedesign.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AndroidResources implements Resources {
    private final android.content.res.Resources resources;
    private final Resources.Theme theme;

    public AndroidResources(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        this.resources = context.createConfigurationContext(configuration).getResources();
        this.theme = context.getTheme();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public int getColor(int i) {
        return this.resources.getColor(i);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public Drawable getDrawable(int i) {
        return this.resources.getDrawable(i);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public String getString(int i) {
        return this.resources.getString(i);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public String[] getStringArray(int i) {
        return this.resources.getStringArray(i);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public CharSequence getText(int i) {
        return this.resources.getText(i);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.util.Resources
    public String getString(int i, Object... objArr) {
        return this.resources.getString(i, objArr);
    }

    @VisibleForTesting
    public AndroidResources(android.content.res.Resources resources, Resources.Theme theme) {
        this.resources = resources;
        this.theme = theme;
    }
}
