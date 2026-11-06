package com.amazon.alexa.handsfree.ui.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertDialogBuilderFactory {
    private final Context mContext;
    private final int mTheme;

    public AlertDialogBuilderFactory(@NonNull Context context, @StyleRes int i) {
        this.mContext = context;
        this.mTheme = i;
    }

    public AlertDialog.Builder create() {
        return new AlertDialog.Builder(this.mContext, this.mTheme);
    }
}
