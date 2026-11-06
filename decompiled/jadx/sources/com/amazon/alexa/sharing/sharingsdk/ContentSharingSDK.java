package com.amazon.alexa.sharing.sharingsdk;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.sharing.sharingsdk.templates.SharedMessageTemplate;
import com.amazon.commscore.api.commsbridge.ResponseResolver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ContentSharingSDK {
    Intent handleAndroidShareIntent(@NonNull Intent intent);

    void onReceiveSharingParseEvent(String str, ResponseResolver responseResolver);

    void onSendSharingParseEvent(String str, ResponseResolver responseResolver);

    @Nullable
    SharedMessageTemplate parseTemplateFromMessage(String str);
}
