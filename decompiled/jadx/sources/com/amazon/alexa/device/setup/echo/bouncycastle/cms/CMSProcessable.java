package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream) throws IOException, CMSException;
}
