package com.amazon.alexa.auth.map;

import android.content.Context;
import com.amazon.alexa.auth.AccountManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AccountManagerFactory {
    public static AccountManager create(Context context) {
        return new MAPAccountManager(context);
    }
}
