package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface Consumer<T> {
    public static final int DO_NOT_CACHE_ENCODED = 2;
    public static final int IS_LAST = 1;
    public static final int IS_PARTIAL_RESULT = 8;
    public static final int IS_PLACEHOLDER = 4;
    public static final int IS_RESIZING_DONE = 16;
    public static final int NO_FLAGS = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    void onCancellation();

    void onFailure(Throwable th);

    void onNewResult(@Nullable T t, int i);

    void onProgressUpdate(float f);
}
