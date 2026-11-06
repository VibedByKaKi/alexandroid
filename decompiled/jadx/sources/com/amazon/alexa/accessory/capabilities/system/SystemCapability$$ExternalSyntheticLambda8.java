package com.amazon.alexa.accessory.capabilities.system;

import com.amazon.alexa.accessory.capabilities.system.SystemCapability;
import com.amazon.alexa.accessory.davs.DavsI18nConfig;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SystemCapability$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Producer.Result f$0;

    public /* synthetic */ SystemCapability$$ExternalSyntheticLambda8(int i, Producer.Result result) {
        this.$r8$classId = i;
        this.f$0 = result;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Producer.Result result = this.f$0;
        switch (i) {
            case 0:
                SystemCapability.lambda$requestAndProvideI18nConfig$4(result, (DavsI18nConfig) obj);
                break;
            case 1:
                SystemCapability.SystemActionHandler.lambda$handleDavsWakewordsTransfer$3(result, (Common.ErrorCode) obj);
                break;
            case 2:
                SystemCapability.SystemActionHandler.lambda$handleDavsWakewordsTransfer$4(result, (Throwable) obj);
                break;
            case 3:
                SystemCapability.SystemActionHandler.lambda$handleDavsLocaleTransfer$0(result, (Common.ErrorCode) obj);
                break;
            case 4:
                SystemCapability.SystemActionHandler.lambda$handleDavsLocaleTransfer$1(result, (Throwable) obj);
                break;
            default:
                SystemCapability.lambda$requestAndProvideI18nConfig$5(result, (Throwable) obj);
                break;
        }
    }
}
