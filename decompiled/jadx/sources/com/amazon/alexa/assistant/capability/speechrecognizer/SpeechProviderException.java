package com.amazon.alexa.assistant.capability.speechrecognizer;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\t\n\u000b\f\r\u000eB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "InitializationFailed", "StartRecordingFailed", "PermissionDenied", "StartCaptureRejectedOnAppState", "InvalidBufferSize", "InternalError", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InitializationFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InternalError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InvalidBufferSize;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$PermissionDenied;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$StartCaptureRejectedOnAppState;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$StartRecordingFailed;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SpeechProviderException extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InvalidBufferSize;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "message", "", "<init>", "(Ljava/lang/String;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidBufferSize extends SpeechProviderException {
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidBufferSize(@NotNull String str) {
            super(ChatData$$ExternalSyntheticOutline0.m(str, "Invalid buffer size: ", str), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$StartCaptureRejectedOnAppState;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "appState", "", "<init>", "(Ljava/lang/String;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartCaptureRejectedOnAppState extends SpeechProviderException {
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureRejectedOnAppState(@NotNull String str) {
            super(ChatData$$ExternalSyntheticOutline0.m(str, "Cannot start capture when app state is: ", str), null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ SpeechProviderException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$PermissionDenied;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "message", "", "<init>", "(Ljava/lang/String;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PermissionDenied extends SpeechProviderException {
        public /* synthetic */ PermissionDenied(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Microphone permission not granted" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PermissionDenied() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PermissionDenied(@NotNull String str) {
            super(str, null, 2, 0 == true ? 1 : 0);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InitializationFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitializationFailed extends SpeechProviderException {
        public InitializationFailed(@NotNull String str, @Nullable Throwable th) {
            super(ChatData$$ExternalSyntheticOutline0.m(str, "Initialization failed: ", str), th, null);
        }

        public /* synthetic */ InitializationFailed(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$InternalError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalError extends SpeechProviderException {
        public InternalError(@NotNull String str, @Nullable Throwable th) {
            super(ChatData$$ExternalSyntheticOutline0.m(str, "Internal error: ", str), th, null);
        }

        public /* synthetic */ InternalError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException$StartRecordingFailed;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/SpeechProviderException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartRecordingFailed extends SpeechProviderException {
        public StartRecordingFailed(@NotNull String str, @Nullable Throwable th) {
            super(ChatData$$ExternalSyntheticOutline0.m(str, "Failed to start recording: ", str), th, null);
        }

        public /* synthetic */ StartRecordingFailed(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    public /* synthetic */ SpeechProviderException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private SpeechProviderException(String str, Throwable th) {
        super(str, th);
    }
}
