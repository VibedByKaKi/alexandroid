package com.amazon.dee.app.services.metrics.kinesis.session;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/session/AppSessionStoreException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppSessionStoreException extends RuntimeException {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSessionStoreException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
        str.getClass();
        th.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSessionStoreException(@NotNull Throwable th) {
        super(th);
        th.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSessionStoreException(@NotNull String str) {
        super(str);
        str.getClass();
    }
}
