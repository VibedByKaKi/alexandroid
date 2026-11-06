package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "URLParseFailure", "ModelDownloadError", "NoAccessToken", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$ModelDownloadError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$NoAccessToken;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$URLParseFailure;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DAVSModelSourceError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$ModelDownloadError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModelDownloadError extends DAVSModelSourceError {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModelDownloadError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$NoAccessToken;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAccessToken extends DAVSModelSourceError {

        @NotNull
        public static final NoAccessToken INSTANCE = new NoAccessToken();

        private NoAccessToken() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError$URLParseFailure;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/DAVSModelSourceError;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class URLParseFailure extends DAVSModelSourceError {

        @NotNull
        public static final URLParseFailure INSTANCE = new URLParseFailure();

        private URLParseFailure() {
            super(null);
        }
    }

    public /* synthetic */ DAVSModelSourceError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DAVSModelSourceError() {
    }
}
