package com.amazon.alexa.device.setup.echo.bouncycastle.operator.jcajce;

import com.amazon.alexa.device.setup.echo.bouncycastle.operator.GenericKey;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class OperatorUtils {
    public static Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        Single$$ExternalSyntheticBUOutline0.m$3("unknown generic key type");
        return null;
    }
}
