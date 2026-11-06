package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.Promise;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import com.amazon.identity.mobi.whatsappautoread.data.WhatsAppAutoreadConsumer;
import com.amazon.identity.mobi.whatsappautoread.data.WhatsAppAutoreadSupportInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class or implements WhatsAppAutoreadConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f865a;

    public or(Promise promise) {
        this.f865a = promise;
    }

    public final void consume(Object obj) {
        WhatsAppAutoreadSupportInfo whatsAppAutoreadSupportInfo = (WhatsAppAutoreadSupportInfo) obj;
        whatsAppAutoreadSupportInfo.isWhatsAppSupported();
        whatsAppAutoreadSupportInfo.getAppHash();
        this.f865a.setResult(JSONUtils.serializeObjectToJson(new mr()));
    }
}
