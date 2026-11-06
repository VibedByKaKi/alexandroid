package com.dee.app.cachemanager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CacheException extends RuntimeException {
    public CacheException(Throwable th) {
        initCause(th);
    }

    public CacheException() {
    }

    public CacheException(String str) {
        super(str);
    }

    public CacheException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
