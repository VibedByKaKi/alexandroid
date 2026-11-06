package com.amazon.dee.app.databinding;

import android.net.Uri;
import android.text.TextUtils;
import androidx.databinding.BindingConversion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class Converters {
    private Converters() {
    }

    @BindingConversion
    public static Uri convertStringToUri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }
}
