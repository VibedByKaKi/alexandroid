package com.amazon.alexa.device.api;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0015\b\u0016\u0012\n\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/device/api/DeviceInformationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "(Ljava/lang/Exception;)V", "AlexaMobileAndroidDeviceApi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeviceInformationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInformationException(@NotNull String str) {
        super(str);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInformationException(@NotNull Exception exc) {
        super(exc);
        exc.getClass();
    }
}
