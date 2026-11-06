package com.amazon.alexa.aamb.transport;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface Transport extends Closeable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Connection implements Closeable {
        public InputStream inputStream;
        public OutputStream outputStream;
    }

    Connection connect(Context context) throws IOException;

    String getAddress();

    String getName();

    TransportStatistics getTransportStatistics();

    int getTransportType();
}
