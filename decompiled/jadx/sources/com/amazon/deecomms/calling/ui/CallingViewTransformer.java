package com.amazon.deecomms.calling.ui;

import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallingViewTransformer {
    private boolean mIsInDriveMode;

    public CallingViewTransformer(boolean z) {
        this.mIsInDriveMode = z;
    }

    public void adjustVisibility(@NonNull TextView textView) {
        if (textView != null) {
            textView.setVisibility(this.mIsInDriveMode ? 0 : 8);
        }
    }

    public void setEnabled(TextView textView, boolean z, @ColorInt int i) {
        if (this.mIsInDriveMode) {
            textView.setEnabled(z);
            textView.setTextColor(i);
        }
    }
}
