package com.amazon.dee.app.ui.main;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IntentFactory {
    private Context context;

    public IntentFactory(Context context) {
        this.context = context;
    }

    public Intent createIntent(Class<?> cls) {
        return new Intent(this.context, cls);
    }
}
