package io.ktor.client.call;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.mobilytics.event.LogLevel;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.response.HttpResponse;
import io.ktor.client.response.HttpResponseConfig;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0016J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@@X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016@@X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lkotlinx/io/core/Closeable;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "getClient", "()Lio/ktor/client/HttpClient;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "received", "Lkotlinx/atomicfu/AtomicBoolean;", "<set-?>", "Lio/ktor/client/request/HttpRequest;", MissingTokenPull.TRIGGER_REQUEST, "getRequest", "()Lio/ktor/client/request/HttpRequest;", "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "Lio/ktor/client/response/HttpResponse;", "response", "getResponse", "()Lio/ktor/client/response/HttpResponse;", "setResponse$ktor_client_core", "(Lio/ktor/client/response/HttpResponse;)V", "responseConfig", "Lio/ktor/client/response/HttpResponseConfig;", "getResponseConfig", "()Lio/ktor/client/response/HttpResponseConfig;", "close", "", "receive", "", LogLevel.INFO, "Lio/ktor/client/call/TypeInfo;", "(Lio/ktor/client/call/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpClientCall implements CoroutineScope, Closeable {
    private static final AtomicIntegerFieldUpdater received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");

    @NotNull
    private final HttpClient client;
    private volatile int received;

    @NotNull
    public HttpRequest request;

    @NotNull
    public HttpResponse response;

    @NotNull
    private final HttpResponseConfig responseConfig;

    public HttpClientCall(@NotNull HttpClient httpClient) {
        httpClient.getClass();
        this.client = httpClient;
        this.received = 0;
        this.responseConfig = httpClient.getEngineConfig().getResponse();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HttpResponse httpResponse = this.response;
        if (httpResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        httpResponse.close();
    }

    @NotNull
    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        HttpResponse httpResponse = this.response;
        if (httpResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        return httpResponse.getCoroutineContext();
    }

    @NotNull
    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MissingTokenPull.TRIGGER_REQUEST);
        }
        return httpRequest;
    }

    @NotNull
    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("response");
        }
        return httpResponse;
    }

    @NotNull
    public final HttpResponseConfig getResponseConfig() {
        return this.responseConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[Catch: all -> 0x003e, BadResponseStatusException -> 0x00c2, TryCatch #2 {BadResponseStatusException -> 0x00c2, all -> 0x003e, blocks: (B:11:0x0034, B:14:0x008e, B:18:0x009f, B:19:0x00b0, B:20:0x0039, B:21:0x003d, B:41:0x0079), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receive(@org.jetbrains.annotations.NotNull io.ktor.client.call.TypeInfo r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.call.HttpClientCall$receive$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.call.HttpClientCall$receive$1 r0 = (io.ktor.client.call.HttpClientCall$receive$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.HttpClientCall$receive$1 r0 = new io.ktor.client.call.HttpClientCall$receive$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            java.lang.String r4 = "response"
            if (r2 == 0) goto L47
            if (r2 != r3) goto L40
            java.lang.Object r5 = r0.L$2
            io.ktor.client.response.HttpResponseContainer r5 = (io.ktor.client.response.HttpResponseContainer) r5
            java.lang.Object r5 = r0.L$1
            r6 = r5
            io.ktor.client.call.TypeInfo r6 = (io.ktor.client.call.TypeInfo) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.client.call.HttpClientCall r5 = (io.ktor.client.call.HttpClientCall) r5
            boolean r0 = r7 instanceof kotlin.Result.Failure     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            if (r0 != 0) goto L39
            goto L8e
        L39:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            java.lang.Throwable r7 = r7.exception     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            throw r7     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
        L3e:
            r7 = move-exception
            goto Lb1
        L40:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L47:
            boolean r2 = r7 instanceof kotlin.Result.Failure
            if (r2 != 0) goto Lca
            kotlin.reflect.KClass r7 = r6.getType()
            io.ktor.client.response.HttpResponse r2 = r5.response
            if (r2 != 0) goto L56
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L56:
            boolean r7 = r7.isInstance(r2)
            if (r7 == 0) goto L64
            io.ktor.client.response.HttpResponse r5 = r5.response
            if (r5 != 0) goto L63
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L63:
            return r5
        L64:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = io.ktor.client.call.HttpClientCall.received$FU
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto Lc4
            io.ktor.client.response.HttpResponseContainer r7 = new io.ktor.client.response.HttpResponseContainer
            io.ktor.client.response.HttpResponse r2 = r5.response
            if (r2 != 0) goto L76
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L76:
            r7.<init>(r6, r2)
            io.ktor.client.HttpClient r2 = r5.client     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            io.ktor.client.response.HttpResponsePipeline r2 = r2.getResponsePipeline()     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            r0.label = r3     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            java.lang.Object r7 = r2.execute(r5, r7, r0)     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            if (r7 != r1) goto L8e
            return r1
        L8e:
            io.ktor.client.response.HttpResponseContainer r7 = (io.ktor.client.response.HttpResponseContainer) r7     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            java.lang.Object r7 = r7.getResponse()     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            kotlin.reflect.KClass r0 = r6.getType()     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            boolean r0 = r0.isInstance(r7)     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            if (r0 == 0) goto L9f
            return r7
        L9f:
            io.ktor.client.call.NoTransformationFoundException r0 = new io.ktor.client.call.NoTransformationFoundException     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            kotlin.reflect.KClass r7 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r7)     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            kotlin.reflect.KClass r1 = r6.getType()     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
            throw r0     // Catch: java.lang.Throwable -> L3e io.ktor.client.features.BadResponseStatusException -> Lc2
        Lb1:
            io.ktor.client.call.ReceivePipelineException r0 = new io.ktor.client.call.ReceivePipelineException
            io.ktor.client.response.HttpResponse r5 = r5.response
            if (r5 != 0) goto Lba
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        Lba:
            io.ktor.client.call.HttpClientCall r5 = r5.getCall()
            r0.<init>(r5, r6, r7)
            throw r0
        Lc2:
            r5 = move-exception
            throw r5
        Lc4:
            io.ktor.client.call.DoubleReceiveException r6 = new io.ktor.client.call.DoubleReceiveException
            r6.<init>(r5)
            throw r6
        Lca:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r5 = r7.exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.receive(io.ktor.client.call.TypeInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setRequest$ktor_client_core(@NotNull HttpRequest httpRequest) {
        httpRequest.getClass();
        this.request = httpRequest;
    }

    public final void setResponse$ktor_client_core(@NotNull HttpResponse httpResponse) {
        httpResponse.getClass();
        this.response = httpResponse;
    }
}
