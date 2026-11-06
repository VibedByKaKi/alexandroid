package io.ktor.client.utils;

import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.io.ByteReadChannel;
import kotlinx.coroutines.io.ByteWriteChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"wrapHeaders", "Lio/ktor/http/content/OutgoingContent;", "block", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "ktor-client-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ContentKt {
    @NotNull
    public static final OutgoingContent wrapHeaders(@NotNull final OutgoingContent outgoingContent, @NotNull final Function1<? super Headers, ? extends Headers> function1) {
        outgoingContent.getClass();
        function1.getClass();
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            return new OutgoingContent.NoContent(function1) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$1
                final /* synthetic */ Function1 $block;

                @NotNull
                private final Headers headers;

                {
                    this.$block = function1;
                    this.headers = (Headers) function1.invoke(OutgoingContent.this.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public Long getContentLength() {
                    return OutgoingContent.this.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public ContentType getContentType() {
                    return OutgoingContent.this.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @NotNull
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public HttpStatusCode getStatus() {
                    return OutgoingContent.this.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            return new OutgoingContent.ReadChannelContent(function1) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$2
                final /* synthetic */ Function1 $block;

                @NotNull
                private final Headers headers;

                {
                    this.$block = function1;
                    this.headers = (Headers) function1.invoke(OutgoingContent.this.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public Long getContentLength() {
                    return OutgoingContent.this.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public ContentType getContentType() {
                    return OutgoingContent.this.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @NotNull
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public HttpStatusCode getStatus() {
                    return OutgoingContent.this.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                @NotNull
                public ByteReadChannel readFrom(@NotNull LongRange range) {
                    range.getClass();
                    return ((OutgoingContent.ReadChannelContent) OutgoingContent.this).readFrom(range);
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                @NotNull
                public ByteReadChannel readFrom() {
                    return ((OutgoingContent.ReadChannelContent) OutgoingContent.this).readFrom();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return new OutgoingContent.WriteChannelContent(function1) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$3
                final /* synthetic */ Function1 $block;

                @NotNull
                private final Headers headers;

                {
                    this.$block = function1;
                    this.headers = (Headers) function1.invoke(OutgoingContent.this.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public Long getContentLength() {
                    return OutgoingContent.this.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public ContentType getContentType() {
                    return OutgoingContent.this.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @NotNull
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public HttpStatusCode getStatus() {
                    return OutgoingContent.this.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
                @Nullable
                public Object writeTo(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super Unit> continuation) {
                    return ((OutgoingContent.WriteChannelContent) OutgoingContent.this).writeTo(byteWriteChannel, continuation);
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            return new OutgoingContent.ByteArrayContent(function1) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$4
                final /* synthetic */ Function1 $block;

                @NotNull
                private final Headers headers;

                {
                    this.$block = function1;
                    this.headers = (Headers) function1.invoke(OutgoingContent.this.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                @NotNull
                public byte[] bytes() {
                    return ((OutgoingContent.ByteArrayContent) OutgoingContent.this).bytes();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public Long getContentLength() {
                    return OutgoingContent.this.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public ContentType getContentType() {
                    return OutgoingContent.this.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @NotNull
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public HttpStatusCode getStatus() {
                    return OutgoingContent.this.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            return new OutgoingContent.ProtocolUpgrade(function1) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$5
                final /* synthetic */ Function1 $block;

                @NotNull
                private final Headers headers;

                {
                    this.$block = function1;
                    this.headers = (Headers) function1.invoke(OutgoingContent.this.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public Long getContentLength() {
                    return OutgoingContent.this.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @Nullable
                public ContentType getContentType() {
                    return OutgoingContent.this.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                @NotNull
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ProtocolUpgrade
                @Nullable
                public Object upgrade(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteWriteChannel byteWriteChannel, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2, @NotNull Continuation<? super Job> continuation) {
                    return ((OutgoingContent.ProtocolUpgrade) OutgoingContent.this).upgrade(byteReadChannel, byteWriteChannel, coroutineContext, coroutineContext2, continuation);
                }
            };
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
