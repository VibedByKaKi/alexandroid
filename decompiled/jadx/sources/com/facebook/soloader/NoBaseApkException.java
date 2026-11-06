package com.facebook.soloader;

import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes7.dex */
public class NoBaseApkException extends RuntimeException {
    public NoBaseApkException(Throwable th) {
        super(th);
    }

    public NoBaseApkException(String str, Throwable th) {
        super(str, th);
    }
}
