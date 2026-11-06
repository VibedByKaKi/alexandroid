package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.io.Sink;
import com.amazon.alexa.accessory.io.Source;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryTransport extends Closeable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        AccessoryTransport createTransport(Accessory accessory, AccessorySessionOptions accessorySessionOptions);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        GATT,
        RFCOMM
    }

    Accessory getAccessory();

    Sink sink() throws IOException;

    Source source() throws IOException;
}
