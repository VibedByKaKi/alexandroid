package io.ktor.util.cio;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/cio/ChannelIOException;", "Ljava/io/IOException;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public class ChannelIOException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIOException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
        str.getClass();
        th.getClass();
    }
}
