package com.amazon.alexa.digitalcommerce.api;

import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/ADCMSException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", HttpClientUtils.ElementsRequestKey.OPERATION_NAME, "", "message", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getOperationName", "()Ljava/lang/String;", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class ADCMSException extends Exception {

    @NotNull
    private final String operationName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ADCMSException(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        super(str2, th);
        str.getClass();
        str2.getClass();
        this.operationName = str;
    }

    @NotNull
    public final String getOperationName() {
        return this.operationName;
    }

    public /* synthetic */ ADCMSException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }
}
