package com.amazon.photos.discovery.dedupe;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/photos/discovery/dedupe/RetryDedupeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryDedupeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryDedupeException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
        str.getClass();
        th.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryDedupeException(@NotNull String str) {
        super(str);
        str.getClass();
    }

    public RetryDedupeException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryDedupeException(@NotNull Throwable th) {
        super(th);
        th.getClass();
    }
}
