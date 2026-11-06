package com.amazon.identity.auth.device;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class a {
    public static Bundle a(Bundle bundle, int i, String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("error_code_key", i);
        bundle2.putString("error_message_key", str);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }
}
