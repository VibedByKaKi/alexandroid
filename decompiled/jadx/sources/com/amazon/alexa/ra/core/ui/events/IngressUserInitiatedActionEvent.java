package com.amazon.alexa.ra.core.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.AttachmentRemovalTrigger;
import com.amazon.alexa.ra.core.data.model.UploadCancellationSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "", "<init>", "()V", "OnUserInput", "OnInputCleared", "OnUserRequest", "OnFileUploadCancelled", "OnAttachmentRemovalBeforeSending", "OnMediaFileAttached", "OnVoiceRequestCanceled", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public class IngressUserInitiatedActionEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnAttachmentRemovalBeforeSending;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "attachmentRemovalTrigger", "Lcom/amazon/alexa/ra/core/data/model/AttachmentRemovalTrigger;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/AttachmentRemovalTrigger;)V", "getAttachmentRemovalTrigger", "()Lcom/amazon/alexa/ra/core/data/model/AttachmentRemovalTrigger;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAttachmentRemovalBeforeSending extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final AttachmentRemovalTrigger attachmentRemovalTrigger;

        public OnAttachmentRemovalBeforeSending(@NotNull AttachmentRemovalTrigger attachmentRemovalTrigger) {
            attachmentRemovalTrigger.getClass();
            this.attachmentRemovalTrigger = attachmentRemovalTrigger;
        }

        @NotNull
        public final AttachmentRemovalTrigger getAttachmentRemovalTrigger() {
            return this.attachmentRemovalTrigger;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnFileUploadCancelled;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "uploadCancellationSource", "Lcom/amazon/alexa/ra/core/data/model/UploadCancellationSource;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/UploadCancellationSource;)V", "getUploadCancellationSource", "()Lcom/amazon/alexa/ra/core/data/model/UploadCancellationSource;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFileUploadCancelled extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final UploadCancellationSource uploadCancellationSource;

        public OnFileUploadCancelled(@NotNull UploadCancellationSource uploadCancellationSource) {
            uploadCancellationSource.getClass();
            this.uploadCancellationSource = uploadCancellationSource;
        }

        @NotNull
        public final UploadCancellationSource getUploadCancellationSource() {
            return this.uploadCancellationSource;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnInputCleared;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnInputCleared extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnInputCleared INSTANCE = new OnInputCleared();

        private OnInputCleared() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnMediaFileAttached;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMediaFileAttached extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public OnMediaFileAttached(long j) {
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnUserInput;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUserInput extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnUserInput INSTANCE = new OnUserInput();

        private OnUserInput() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnUserRequest;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUserRequest extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnUserRequest INSTANCE = new OnUserRequest();

        private OnUserRequest() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent$OnVoiceRequestCanceled;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnVoiceRequestCanceled extends IngressUserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnVoiceRequestCanceled INSTANCE = new OnVoiceRequestCanceled();

        private OnVoiceRequestCanceled() {
        }
    }
}
