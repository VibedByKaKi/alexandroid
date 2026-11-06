package com.amazon.alexa.digitalcommerce.api;

import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/BadStatusCodeException;", "Lcom/amazon/alexa/digitalcommerce/api/ADCMSException;", HttpClientUtils.ElementsRequestKey.OPERATION_NAME, "", "statusCode", "", "<init>", "(Ljava/lang/String;I)V", "getStatusCode", "()I", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BadStatusCodeException extends ADCMSException {
    private final int statusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadStatusCodeException(@NotNull String str, int i) {
        super(str, "Bad status code " + i + " for " + str, null, 4, null);
        str.getClass();
        this.statusCode = i;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
