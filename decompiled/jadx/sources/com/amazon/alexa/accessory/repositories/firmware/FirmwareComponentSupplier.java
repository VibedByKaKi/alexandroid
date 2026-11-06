package com.amazon.alexa.accessory.repositories.firmware;

import com.amazon.alexa.accessory.io.Source;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FirmwareComponentSupplier {
    String getName();

    String getSignature() throws IOException;

    String getSignature(int i, int i2) throws IOException;

    int getSize() throws IOException;

    int getVersion();

    Source open() throws IOException;

    Source open(int i, int i2) throws IOException;
}
