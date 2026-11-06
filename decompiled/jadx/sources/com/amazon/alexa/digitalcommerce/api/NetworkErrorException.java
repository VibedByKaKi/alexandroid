package com.amazon.alexa.digitalcommerce.api;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/NetworkErrorException;", "Lcom/amazon/alexa/digitalcommerce/api/ADCMSException;", HttpClientUtils.ElementsRequestKey.OPERATION_NAME, "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NetworkErrorException extends ADCMSException {
    public NetworkErrorException(@NotNull String str, @Nullable Throwable th) {
        super(str, ChatData$$ExternalSyntheticOutline0.m(str, "Network error in ", str), th);
    }
}
