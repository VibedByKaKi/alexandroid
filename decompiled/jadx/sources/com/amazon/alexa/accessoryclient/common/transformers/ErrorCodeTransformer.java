package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.protocol.Common;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/ErrorCodeTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/protocol/Common$ErrorCode;", "()V", "ERROR_CODE_NUMBER_KEY", "", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "errorCode", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ErrorCodeTransformer implements BundleTransformer<Common.ErrorCode> {

    @NotNull
    private static final String ERROR_CODE_NUMBER_KEY = "errorCodeNumber";

    @NotNull
    public static final ErrorCodeTransformer INSTANCE = new ErrorCodeTransformer();

    private ErrorCodeTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Common.ErrorCode fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        Common.ErrorCode forNumber = Common.ErrorCode.forNumber(bundle.getInt(ERROR_CODE_NUMBER_KEY));
        forNumber.getClass();
        return forNumber;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull Common.ErrorCode errorCode) {
        errorCode.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt(ERROR_CODE_NUMBER_KEY, errorCode.getNumber());
        return bundle;
    }
}
