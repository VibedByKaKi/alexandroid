package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface lp {
    void a();

    void a(MAPError.CommonError commonError, String str, int i, String str2);

    void a(MAPError.TokenError tokenError, Bundle bundle);
}
