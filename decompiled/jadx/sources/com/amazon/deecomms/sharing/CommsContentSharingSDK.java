package com.amazon.deecomms.sharing;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.deecomms.sharing.templates.SharedMessageTemplate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface CommsContentSharingSDK {
    Intent handleAndroidShareIntent(Intent intent);

    boolean onReceiveSharingParseEvent(Message message, EventBus eventBus);

    boolean onSendSharingParseEvent(Message message, EventBus eventBus);

    @Nullable
    SharedMessageTemplate parseTemplateFromMessage(String str);
}
