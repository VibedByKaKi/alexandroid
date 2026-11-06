package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "EngineSetupFailed", "AudioSessionFailed", "WakeWordNotSupported", "NoWakeWordsEnabled", "AudioProcessingError", "ConfigurationError", "ModelLoadFailed", "EngineTeardownFailed", "RecognizerTimeout", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$AudioProcessingError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$AudioSessionFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$ConfigurationError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$EngineSetupFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$EngineTeardownFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$ModelLoadFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$NoWakeWordsEnabled;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$RecognizerTimeout;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$WakeWordNotSupported;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WakeWordRecognizerError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$AudioProcessingError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AudioProcessingError extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioProcessingError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ AudioProcessingError copy$default(AudioProcessingError audioProcessingError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = audioProcessingError.cause;
            }
            return audioProcessingError.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final AudioProcessingError copy(@NotNull Throwable cause) {
            cause.getClass();
            return new AudioProcessingError(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioProcessingError) && Intrinsics.areEqual(this.cause, ((AudioProcessingError) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Audio processing error: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "AudioProcessingError(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$AudioSessionFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AudioSessionFailed extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioSessionFailed(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ AudioSessionFailed copy$default(AudioSessionFailed audioSessionFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = audioSessionFailed.cause;
            }
            return audioSessionFailed.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final AudioSessionFailed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new AudioSessionFailed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioSessionFailed) && Intrinsics.areEqual(this.cause, ((AudioSessionFailed) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Audio session failed: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "AudioSessionFailed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$ConfigurationError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfigurationError extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigurationError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ ConfigurationError copy$default(ConfigurationError configurationError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = configurationError.cause;
            }
            return configurationError.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ConfigurationError copy(@NotNull Throwable cause) {
            cause.getClass();
            return new ConfigurationError(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigurationError) && Intrinsics.areEqual(this.cause, ((ConfigurationError) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Configuration error: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "ConfigurationError(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$EngineSetupFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EngineSetupFailed extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EngineSetupFailed(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ EngineSetupFailed copy$default(EngineSetupFailed engineSetupFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = engineSetupFailed.cause;
            }
            return engineSetupFailed.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final EngineSetupFailed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new EngineSetupFailed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EngineSetupFailed) && Intrinsics.areEqual(this.cause, ((EngineSetupFailed) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Wake word engine setup failed: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "EngineSetupFailed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$EngineTeardownFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EngineTeardownFailed extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EngineTeardownFailed(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ EngineTeardownFailed copy$default(EngineTeardownFailed engineTeardownFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = engineTeardownFailed.cause;
            }
            return engineTeardownFailed.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final EngineTeardownFailed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new EngineTeardownFailed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EngineTeardownFailed) && Intrinsics.areEqual(this.cause, ((EngineTeardownFailed) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Wake word engine teardown failed: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "EngineTeardownFailed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$ModelLoadFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ModelLoadFailed extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModelLoadFailed(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ ModelLoadFailed copy$default(ModelLoadFailed modelLoadFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = modelLoadFailed.cause;
            }
            return modelLoadFailed.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ModelLoadFailed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new ModelLoadFailed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ModelLoadFailed) && Intrinsics.areEqual(this.cause, ((ModelLoadFailed) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Wake word model load failed: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "ModelLoadFailed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$NoWakeWordsEnabled;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoWakeWordsEnabled extends WakeWordRecognizerError {

        @NotNull
        public static final NoWakeWordsEnabled INSTANCE = new NoWakeWordsEnabled();

        private NoWakeWordsEnabled() {
            super(null);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return "No wake words are enabled";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$RecognizerTimeout;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecognizerTimeout extends WakeWordRecognizerError {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecognizerTimeout(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public static /* synthetic */ RecognizerTimeout copy$default(RecognizerTimeout recognizerTimeout, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = recognizerTimeout.cause;
            }
            return recognizerTimeout.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final RecognizerTimeout copy(@NotNull Throwable cause) {
            cause.getClass();
            return new RecognizerTimeout(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecognizerTimeout) && Intrinsics.areEqual(this.cause, ((RecognizerTimeout) other).cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return a$$ExternalSyntheticOutline0.m("Wake word recognizer timeout: ", getCause().getMessage());
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "RecognizerTimeout(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError$WakeWordNotSupported;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WakeWordNotSupported extends WakeWordRecognizerError {

        @NotNull
        public static final WakeWordNotSupported INSTANCE = new WakeWordNotSupported();

        private WakeWordNotSupported() {
            super(null);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return "Wake word is not supported";
        }
    }

    public /* synthetic */ WakeWordRecognizerError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WakeWordRecognizerError() {
    }
}
