package com.amazon.alexa.hho.imagepicker;

import android.app.ProgressDialog;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class LoadingProgressDialog extends ProgressDialog {
    public LoadingProgressDialog(Context context) {
        super(context);
        setIndeterminate(true);
        setCancelable(false);
    }
}
