package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.Promise;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import com.amazon.identity.mobi.whatsappautoread.data.WhatsAppAutoreadConsumer;
import com.amazon.identity.mobi.whatsappautoread.data.WhatsAppAutoreadErrorResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class sr implements WhatsAppAutoreadConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f949a;

    public sr(Promise promise) {
        this.f949a = promise;
    }

    public final void consume(Object obj) {
        WhatsAppAutoreadErrorResult whatsAppAutoreadErrorResult = (WhatsAppAutoreadErrorResult) obj;
        whatsAppAutoreadErrorResult.getErrorKey();
        whatsAppAutoreadErrorResult.getErrorMessage();
        this.f949a.setResult(JSONUtils.serializeObjectToJson(new vr()));
    }
}
