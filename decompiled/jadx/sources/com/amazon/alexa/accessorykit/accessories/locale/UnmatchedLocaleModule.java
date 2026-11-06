package com.amazon.alexa.accessorykit.accessories.locale;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessory.Accessories;
import com.amazon.alexa.accessory.avsclient.locale.UnmatchedLocaleNotifier;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UnmatchedLocaleModule {
    private final Context context;

    public UnmatchedLocaleModule(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
    }

    @SuppressLint({"CheckResult"})
    public void markLocaleAsNotified(String str, String str2) {
        Preconditions.notEmpty(str, "identifier");
        Preconditions.notEmpty(str2, "locale");
        this.context.sendBroadcast(new Intent().setAction(UnmatchedLocaleNotifier.INTENT_ACTION).putExtra("address", str).putExtra("locale", str2).setPackage("com.amazon.dee.app").setFlags(268435456), Accessories.INTEGRATION_BROADCAST_PERMISSION);
    }
}
