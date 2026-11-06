package com.amazon.clouddrive.cdasdk.util;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SystemUtil {
    public static final int STANDARD_BASE_64_FLAGS = 3;

    long currentTimeMillis();

    long elapsedRealtime();

    @NonNull
    String getBase64(@NonNull String str, int i);

    void interrupt();

    int randomNextInt(int i);

    @NonNull
    String replaceUriPath(@NonNull String str, @NonNull String str2);

    void sleep(long j) throws InterruptedException;
}
