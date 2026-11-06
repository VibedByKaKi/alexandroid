package com.amazon.alexa.biloba.view.dashboard;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class IngressButtonViewItemModel {
    private final String alertText;
    private final LiveData<Boolean> alertVisible;
    private final Drawable icon;
    private final String title;

    public IngressButtonViewItemModel(@NonNull Drawable drawable, @NonNull String str, @Nullable String str2, LiveData<Boolean> liveData) {
        this.icon = drawable;
        this.title = str;
        this.alertText = str2;
        this.alertVisible = liveData;
    }

    public String getAlertText() {
        return this.alertText;
    }

    public LiveData<Boolean> getAlertVisible() {
        return this.alertVisible;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public String getTitle() {
        return this.title;
    }
}
