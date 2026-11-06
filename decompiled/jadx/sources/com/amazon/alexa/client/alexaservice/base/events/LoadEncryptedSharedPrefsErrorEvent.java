package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class LoadEncryptedSharedPrefsErrorEvent extends Event.NotGated {
    public static LoadEncryptedSharedPrefsErrorEvent create(String str, boolean z, String str2, boolean z2, String str3) {
        return new AutoValue_LoadEncryptedSharedPrefsErrorEvent(str, z, str2, z2, str3);
    }

    public abstract boolean getEncrypted();

    public abstract String getMessage();

    public abstract String getPackageName();

    public abstract String getPreferenceName();

    public abstract boolean getSuccess();
}
