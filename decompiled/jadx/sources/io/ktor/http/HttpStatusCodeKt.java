package io.ktor.http;

import io.ktor.http.HttpStatusCode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0001\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"ExceptionFailed", "Lio/ktor/http/HttpStatusCode;", "Lio/ktor/http/HttpStatusCode$Companion;", "ExceptionFailed$annotations", "(Lio/ktor/http/HttpStatusCode$Companion;)V", "getExceptionFailed", "(Lio/ktor/http/HttpStatusCode$Companion;)Lio/ktor/http/HttpStatusCode;", "allStatusCodes", "", "isSuccess", "", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpStatusCodeKt {
    @NotNull
    public static final List<HttpStatusCode> allStatusCodes() {
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        return CollectionsKt.listOf((Object[]) new HttpStatusCode[]{companion.getContinue(), companion.getSwitchingProtocols(), companion.getProcessing(), companion.getOK(), companion.getCreated(), companion.getAccepted(), companion.getNonAuthoritativeInformation(), companion.getNoContent(), companion.getResetContent(), companion.getPartialContent(), companion.getMultiStatus(), companion.getMultipleChoices(), companion.getMovedPermanently(), companion.getFound(), companion.getSeeOther(), companion.getNotModified(), companion.getUseProxy(), companion.getSwitchProxy(), companion.getTemporaryRedirect(), companion.getPermanentRedirect(), companion.getBadRequest(), companion.getUnauthorized(), companion.getPaymentRequired(), companion.getForbidden(), companion.getNotFound(), companion.getMethodNotAllowed(), companion.getNotAcceptable(), companion.getProxyAuthenticationRequired(), companion.getRequestTimeout(), companion.getConflict(), companion.getGone(), companion.getLengthRequired(), companion.getPreconditionFailed(), companion.getPayloadTooLarge(), companion.getRequestURITooLong(), companion.getUnsupportedMediaType(), companion.getRequestedRangeNotSatisfiable(), companion.getExpectationFailed(), companion.getUnprocessableEntity(), companion.getLocked(), companion.getFailedDependency(), companion.getUpgradeRequired(), companion.getTooManyRequests(), companion.getRequestHeaderFieldTooLarge(), companion.getInternalServerError(), companion.getNotImplemented(), companion.getBadGateway(), companion.getServiceUnavailable(), companion.getGatewayTimeout(), companion.getVersionNotSupported(), companion.getVariantAlsoNegotiates(), companion.getInsufficientStorage()});
    }

    @NotNull
    public static final HttpStatusCode getExceptionFailed(@NotNull HttpStatusCode.Companion companion) {
        companion.getClass();
        return companion.getExpectationFailed();
    }

    public static final boolean isSuccess(@NotNull HttpStatusCode httpStatusCode) {
        httpStatusCode.getClass();
        int value = httpStatusCode.getValue();
        return 200 <= value && 300 > value;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ExpectationFailed instead", replaceWith = @ReplaceWith(expression = "ExpectationFailed", imports = {"io.ktor.http.HttpStatusCode.Companion.ExpectationFailed"}))
    public static /* synthetic */ void ExceptionFailed$annotations(HttpStatusCode.Companion companion) {
    }
}
