package com.amazon.alexa.assistant.transport.multipart;

import com.amazon.alexa.assistant.toolkit.attachment.DirectiveAttachment;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.fileupload.FileUploadBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent;", "", "Received", UploadWorker.FAILED_PREFIX, "FirstChunkDeadline", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$Failed;", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$FirstChunkDeadline;", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$Received;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
interface ChunkEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$Failed;", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements ChunkEvent {

        @NotNull
        private final Throwable cause;

        public Failed(@NotNull Throwable th) {
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.cause;
            }
            return failed.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final Failed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new Failed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.cause, ((Failed) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$FirstChunkDeadline;", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FirstChunkDeadline implements ChunkEvent {

        @NotNull
        public static final FirstChunkDeadline INSTANCE = new FirstChunkDeadline();

        private FirstChunkDeadline() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FirstChunkDeadline);
        }

        public int hashCode() {
            return 889883351;
        }

        @NotNull
        public String toString() {
            return "FirstChunkDeadline";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent$Received;", "Lcom/amazon/alexa/assistant/transport/multipart/ChunkEvent;", FileUploadBase.ATTACHMENT, "Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;)V", "getAttachment", "()Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Received implements ChunkEvent {

        @NotNull
        private final DirectiveAttachment attachment;

        public Received(@NotNull DirectiveAttachment directiveAttachment) {
            directiveAttachment.getClass();
            this.attachment = directiveAttachment;
        }

        public static /* synthetic */ Received copy$default(Received received, DirectiveAttachment directiveAttachment, int i, Object obj) {
            if ((i & 1) != 0) {
                directiveAttachment = received.attachment;
            }
            return received.copy(directiveAttachment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DirectiveAttachment getAttachment() {
            return this.attachment;
        }

        @NotNull
        public final Received copy(@NotNull DirectiveAttachment attachment) {
            attachment.getClass();
            return new Received(attachment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Received) && Intrinsics.areEqual(this.attachment, ((Received) other).attachment);
        }

        @NotNull
        public final DirectiveAttachment getAttachment() {
            return this.attachment;
        }

        public int hashCode() {
            return this.attachment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Received(attachment=" + this.attachment + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }
}
