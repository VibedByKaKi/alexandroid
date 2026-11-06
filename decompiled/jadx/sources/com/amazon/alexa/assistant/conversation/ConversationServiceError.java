package com.amazon.alexa.assistant.conversation;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "BadRequest", "Unauthorized", "Forbidden", "ConversationNotFound", "TooManyRequests", "InternalServiceError", "UrlError", "Unknown", "Companion", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$BadRequest;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$ConversationNotFound;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Forbidden;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$InternalServiceError;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$TooManyRequests;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Unauthorized;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Unknown;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$UrlError;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ConversationServiceError extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$BadRequest;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BadRequest extends ConversationServiceError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadRequest(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ BadRequest copy$default(BadRequest badRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = badRequest.message;
            }
            return badRequest.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final BadRequest copy(@NotNull String message) {
            message.getClass();
            return new BadRequest(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BadRequest) && Intrinsics.areEqual(this.message, ((BadRequest) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("BadRequest(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$ConversationNotFound;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationNotFound extends ConversationServiceError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationNotFound(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ ConversationNotFound copy$default(ConversationNotFound conversationNotFound, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationNotFound.message;
            }
            return conversationNotFound.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ConversationNotFound copy(@NotNull String message) {
            message.getClass();
            return new ConversationNotFound(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationNotFound) && Intrinsics.areEqual(this.message, ((ConversationNotFound) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ConversationNotFound(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Forbidden;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Forbidden extends ConversationServiceError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Forbidden(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ Forbidden copy$default(Forbidden forbidden, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = forbidden.message;
            }
            return forbidden.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Forbidden copy(@NotNull String message) {
            message.getClass();
            return new Forbidden(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Forbidden) && Intrinsics.areEqual(this.message, ((Forbidden) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Forbidden(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$InternalServiceError;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "retryAfter", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRetryAfter", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternalServiceError extends ConversationServiceError {

        @NotNull
        private final String message;

        @Nullable
        private final String retryAfter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalServiceError(@NotNull String str, @Nullable String str2) {
            super(null);
            str.getClass();
            this.message = str;
            this.retryAfter = str2;
        }

        public static /* synthetic */ InternalServiceError copy$default(InternalServiceError internalServiceError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalServiceError.message;
            }
            if ((i & 2) != 0) {
                str2 = internalServiceError.retryAfter;
            }
            return internalServiceError.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getRetryAfter() {
            return this.retryAfter;
        }

        @NotNull
        public final InternalServiceError copy(@NotNull String message, @Nullable String retryAfter) {
            message.getClass();
            return new InternalServiceError(message, retryAfter);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalServiceError)) {
                return false;
            }
            InternalServiceError internalServiceError = (InternalServiceError) other;
            return Intrinsics.areEqual(this.message, internalServiceError.message) && Intrinsics.areEqual(this.retryAfter, internalServiceError.retryAfter);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getRetryAfter() {
            return this.retryAfter;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.retryAfter;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("InternalServiceError(message=", this.message, ", retryAfter=", this.retryAfter, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$TooManyRequests;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "retryAfter", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRetryAfter", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TooManyRequests extends ConversationServiceError {

        @NotNull
        private final String message;

        @Nullable
        private final String retryAfter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooManyRequests(@NotNull String str, @Nullable String str2) {
            super(null);
            str.getClass();
            this.message = str;
            this.retryAfter = str2;
        }

        public static /* synthetic */ TooManyRequests copy$default(TooManyRequests tooManyRequests, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tooManyRequests.message;
            }
            if ((i & 2) != 0) {
                str2 = tooManyRequests.retryAfter;
            }
            return tooManyRequests.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getRetryAfter() {
            return this.retryAfter;
        }

        @NotNull
        public final TooManyRequests copy(@NotNull String message, @Nullable String retryAfter) {
            message.getClass();
            return new TooManyRequests(message, retryAfter);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooManyRequests)) {
                return false;
            }
            TooManyRequests tooManyRequests = (TooManyRequests) other;
            return Intrinsics.areEqual(this.message, tooManyRequests.message) && Intrinsics.areEqual(this.retryAfter, tooManyRequests.retryAfter);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getRetryAfter() {
            return this.retryAfter;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.retryAfter;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("TooManyRequests(message=", this.message, ", retryAfter=", this.retryAfter, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Unauthorized;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends ConversationServiceError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unauthorized(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ Unauthorized copy$default(Unauthorized unauthorized, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unauthorized.message;
            }
            return unauthorized.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Unauthorized copy(@NotNull String message) {
            message.getClass();
            return new Unauthorized(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unauthorized) && Intrinsics.areEqual(this.message, ((Unauthorized) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unauthorized(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Unknown;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown extends ConversationServiceError {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull String str, @Nullable Throwable th) {
            super(null);
            str.getClass();
            this.message = str;
            this.cause = th;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            if ((i & 2) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(str, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final Unknown copy(@NotNull String message, @Nullable Throwable cause) {
            message.getClass();
            return new Unknown(message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return Intrinsics.areEqual(this.message, unknown.message) && Intrinsics.areEqual(this.cause, unknown.cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Unknown(message=" + this.message + ", cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ ConversationServiceError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$Companion;", "", "<init>", "()V", "fromHttpError", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "code", "", "message", "", "retryAfter", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConversationServiceError fromHttpError$default(Companion companion, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            return companion.fromHttpError(i, str, str2);
        }

        @NotNull
        public final ConversationServiceError fromHttpError(int code, @Nullable String message, @Nullable String retryAfter) {
            if (message == null) {
                message = a$$ExternalSyntheticOutline0.m(code, "HTTP ", " error");
            }
            return code == 400 ? new BadRequest(message) : code == 401 ? new Unauthorized(message) : code == 403 ? new Forbidden(message) : code == 404 ? new ConversationNotFound(message) : code == 429 ? new TooManyRequests(message, retryAfter) : (500 > code || code >= 600) ? new Unknown(message, null) : new InternalServiceError(message, retryAfter);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationServiceError$UrlError;", "Lcom/amazon/alexa/assistant/conversation/ConversationServiceError;", "cause", "Ljava/io/IOException;", "<init>", "(Ljava/io/IOException;)V", "getCause", "()Ljava/io/IOException;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UrlError extends ConversationServiceError {

        @NotNull
        private final IOException cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlError(@NotNull IOException iOException) {
            super(null);
            iOException.getClass();
            this.cause = iOException;
        }

        public static /* synthetic */ UrlError copy$default(UrlError urlError, IOException iOException, int i, Object obj) {
            if ((i & 1) != 0) {
                iOException = urlError.cause;
            }
            return urlError.copy(iOException);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IOException getCause() {
            return this.cause;
        }

        @NotNull
        public final UrlError copy(@NotNull IOException cause) {
            cause.getClass();
            return new UrlError(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UrlError) && Intrinsics.areEqual(this.cause, ((UrlError) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            String message = getCause().getMessage();
            return message == null ? "Network error" : message;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "UrlError(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @Override // java.lang.Throwable
        @NotNull
        public IOException getCause() {
            return this.cause;
        }
    }

    private ConversationServiceError() {
    }
}
