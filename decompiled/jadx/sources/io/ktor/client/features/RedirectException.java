package io.ktor.client.features;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import io.ktor.client.request.HttpRequest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.ERROR, message = "Not thrown anymore. Use SendCountExceedException", replaceWith = @ReplaceWith(expression = "SendCountExceedException", imports = {"io.ktor.client.features.SendCountExceedException"}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/features/RedirectException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", MissingTokenPull.TRIGGER_REQUEST, "Lio/ktor/client/request/HttpRequest;", "cause", "", "(Lio/ktor/client/request/HttpRequest;Ljava/lang/String;)V", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class RedirectException extends IllegalStateException {

    @NotNull
    private final HttpRequest request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectException(@NotNull HttpRequest httpRequest, @NotNull String str) {
        super(str);
        httpRequest.getClass();
        str.getClass();
        this.request = httpRequest;
    }

    @NotNull
    public final HttpRequest getRequest() {
        return this.request;
    }
}
