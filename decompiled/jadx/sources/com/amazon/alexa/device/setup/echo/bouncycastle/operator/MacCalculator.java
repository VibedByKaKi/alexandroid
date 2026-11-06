package com.amazon.alexa.device.setup.echo.bouncycastle.operator;

import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.x509.AlgorithmIdentifier;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MacCalculator {
    AlgorithmIdentifier getAlgorithmIdentifier();

    GenericKey getKey();

    byte[] getMac();

    OutputStream getOutputStream();
}
