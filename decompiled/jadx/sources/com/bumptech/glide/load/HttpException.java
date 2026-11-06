package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(String str, int i, @Nullable Throwable th) {
        super(TableInfo$$ExternalSyntheticOutline0.m(i, str, ", status code: "), th);
        this.statusCode = i;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(int i) {
        this("Http request failed", i);
    }
}
