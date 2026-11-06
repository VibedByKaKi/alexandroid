package com.amazon.apl.android.dependencies.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IOpenUrlCallback;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OpenUrlCallback implements IOpenUrlCallback {
    private static final String TAG = "OpenUrlCallback";

    @NonNull
    private final WeakReference<Context> mContext;

    public OpenUrlCallback(@NonNull Context context) {
        this.mContext = new WeakReference<>(context);
    }

    @Override // com.amazon.apl.android.dependencies.IOpenUrlCallback
    public void onOpenUrl(@NonNull String str, @NonNull IOpenUrlCallback.IOpenUrlCallbackResult iOpenUrlCallbackResult) {
        boolean z;
        if (str.indexOf("https://") == 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            if (this.mContext.get() != null) {
                this.mContext.get().startActivity(intent);
                z = true;
                iOpenUrlCallbackResult.onResult(z);
            }
        }
        z = false;
        iOpenUrlCallbackResult.onResult(z);
    }
}
