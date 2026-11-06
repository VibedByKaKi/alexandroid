package com.amazon.coral.google.common.io;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class Closeables {

    @VisibleForTesting
    static final Logger logger = Logger.getLogger(Closeables.class.getName());

    private Closeables() {
    }

    public static void close(@CheckForNull Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (!z) {
                throw e;
            }
            logger.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void closeQuietly(@CheckForNull InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
        }
    }

    public static void closeQuietly(@CheckForNull Reader reader) {
        try {
            close(reader, true);
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
        }
    }
}
