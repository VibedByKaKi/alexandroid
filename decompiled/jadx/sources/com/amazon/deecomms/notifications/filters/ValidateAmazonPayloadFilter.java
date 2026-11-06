package com.amazon.deecomms.notifications.filters;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.deecomms.common.processor.Task;
import com.amazon.deecomms.notifications.PushProcessStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ValidateAmazonPayloadFilter implements Task<PushProcessStatus, Bundle> {
    @Override // com.amazon.deecomms.common.processor.Task
    public PushProcessStatus execute(Bundle bundle) {
        return TextUtils.isEmpty(bundle.getString("amznMessage")) ? PushProcessStatus.MISSING_AMAZON_PAYLOAD : PushProcessStatus.CONTINUE;
    }
}
