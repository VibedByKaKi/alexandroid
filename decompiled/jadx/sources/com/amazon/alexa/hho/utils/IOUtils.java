package com.amazon.alexa.hho.utils;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("HHO", "Unable to close", e);
            }
        }
    }
}
