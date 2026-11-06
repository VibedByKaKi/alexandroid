package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.accessory.notificationpublisher.notificationlistener.NotificationListenerConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "", "result", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationResult;", "getResult", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationResult;", "logLabel", "", "getLogLabel", "()Ljava/lang/String;", "Resolved", "Dismissed", "Interrupted", UploadWorker.FAILED_PREFIX, "DismissReason", "InterruptReason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Dismissed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Interrupted;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Resolved;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationEnd {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getLogLabel(@NotNull ConversationEnd conversationEnd) {
            if (Intrinsics.areEqual(conversationEnd, Resolved.INSTANCE)) {
                return "resolved";
            }
            if (conversationEnd instanceof Dismissed) {
                return a$$ExternalSyntheticOutline0.m("dismissed(", ((Dismissed) conversationEnd).getReason().getLabel(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (conversationEnd instanceof Interrupted) {
                return a$$ExternalSyntheticOutline0.m("interrupted(", ((Interrupted) conversationEnd).getReason().getLabel(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (conversationEnd instanceof Failed) {
                return a$$ExternalSyntheticOutline0.m("failed(", ((Failed) conversationEnd).getError().getLabel(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @NotNull
        public static ConversationResult getResult(@NotNull ConversationEnd conversationEnd) {
            if (Intrinsics.areEqual(conversationEnd, Resolved.INSTANCE) || (conversationEnd instanceof Dismissed)) {
                return ConversationResult.COMPLETED;
            }
            if ((conversationEnd instanceof Interrupted) || (conversationEnd instanceof Failed)) {
                return ConversationResult.FAILED;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$DismissReason;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "NO_SPEECH", "USER_CANCELLED", NotificationListenerConstants.NOTIFICATION_REMOVED, "SMS_PERMISSION_DENIED", "SMS_ACCESS_OFF_BEFORE_DRAFT", "SMS_ACCESS_OFF_AT_SEND", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DismissReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissReason[] $VALUES;

        @NotNull
        private final String label;
        public static final DismissReason NO_SPEECH = new DismissReason("NO_SPEECH", 0, "noSpeech");
        public static final DismissReason USER_CANCELLED = new DismissReason("USER_CANCELLED", 1, "userCancelled");
        public static final DismissReason NOTIFICATION_REMOVED = new DismissReason(NotificationListenerConstants.NOTIFICATION_REMOVED, 2, "notificationRemoved");
        public static final DismissReason SMS_PERMISSION_DENIED = new DismissReason("SMS_PERMISSION_DENIED", 3, "smsPermissionDenied");
        public static final DismissReason SMS_ACCESS_OFF_BEFORE_DRAFT = new DismissReason("SMS_ACCESS_OFF_BEFORE_DRAFT", 4, "smsAccessOffBeforeDraft");
        public static final DismissReason SMS_ACCESS_OFF_AT_SEND = new DismissReason("SMS_ACCESS_OFF_AT_SEND", 5, "smsAccessOffAtSend");

        private static final /* synthetic */ DismissReason[] $values() {
            return new DismissReason[]{NO_SPEECH, USER_CANCELLED, NOTIFICATION_REMOVED, SMS_PERMISSION_DENIED, SMS_ACCESS_OFF_BEFORE_DRAFT, SMS_ACCESS_OFF_AT_SEND};
        }

        static {
            DismissReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private DismissReason(String str, int i, String str2) {
            this.label = str2;
        }

        @NotNull
        public static EnumEntries<DismissReason> getEntries() {
            return $ENTRIES;
        }

        public static DismissReason valueOf(String str) {
            return (DismissReason) Enum.valueOf(DismissReason.class, str);
        }

        public static DismissReason[] values() {
            return (DismissReason[]) $VALUES.clone();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Dismissed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$DismissReason;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$DismissReason;)V", "getReason", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$DismissReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dismissed implements ConversationEnd {

        @NotNull
        private final DismissReason reason;

        public Dismissed(@NotNull DismissReason dismissReason) {
            dismissReason.getClass();
            this.reason = dismissReason;
        }

        public static /* synthetic */ Dismissed copy$default(Dismissed dismissed, DismissReason dismissReason, int i, Object obj) {
            if ((i & 1) != 0) {
                dismissReason = dismissed.reason;
            }
            return dismissed.copy(dismissReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DismissReason getReason() {
            return this.reason;
        }

        @NotNull
        public final Dismissed copy(@NotNull DismissReason reason) {
            reason.getClass();
            return new Dismissed(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dismissed) && this.reason == ((Dismissed) other).reason;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @NotNull
        public final DismissReason getReason() {
            return this.reason;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public ConversationResult getResult() {
            return DefaultImpls.getResult(this);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Dismissed(reason=" + this.reason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "error", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationError;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationError;)V", "getError", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements ConversationEnd {

        @NotNull
        private final ConversationError error;

        public Failed(@NotNull ConversationError conversationError) {
            conversationError.getClass();
            this.error = conversationError;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, ConversationError conversationError, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationError = failed.error;
            }
            return failed.copy(conversationError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ConversationError getError() {
            return this.error;
        }

        @NotNull
        public final Failed copy(@NotNull ConversationError error) {
            error.getClass();
            return new Failed(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
        }

        @NotNull
        public final ConversationError getError() {
            return this.error;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public ConversationResult getResult() {
            return DefaultImpls.getResult(this);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$InterruptReason;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "MIC_HELD_BY_OTHER_FEATURE", "MIC_TAKEN_BY_OTHER_FEATURE", "NOTIFICATION_ENGINE_EXIT", "SHUT_DOWN", "PROCESS_KILLED", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InterruptReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InterruptReason[] $VALUES;

        @NotNull
        private final String label;
        public static final InterruptReason MIC_HELD_BY_OTHER_FEATURE = new InterruptReason("MIC_HELD_BY_OTHER_FEATURE", 0, "micHeldByOtherFeature");
        public static final InterruptReason MIC_TAKEN_BY_OTHER_FEATURE = new InterruptReason("MIC_TAKEN_BY_OTHER_FEATURE", 1, "micTakenByOtherFeature");
        public static final InterruptReason NOTIFICATION_ENGINE_EXIT = new InterruptReason("NOTIFICATION_ENGINE_EXIT", 2, "notificationEngineExit");
        public static final InterruptReason SHUT_DOWN = new InterruptReason("SHUT_DOWN", 3, "shutDown");
        public static final InterruptReason PROCESS_KILLED = new InterruptReason("PROCESS_KILLED", 4, "processKilled");

        private static final /* synthetic */ InterruptReason[] $values() {
            return new InterruptReason[]{MIC_HELD_BY_OTHER_FEATURE, MIC_TAKEN_BY_OTHER_FEATURE, NOTIFICATION_ENGINE_EXIT, SHUT_DOWN, PROCESS_KILLED};
        }

        static {
            InterruptReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private InterruptReason(String str, int i, String str2) {
            this.label = str2;
        }

        @NotNull
        public static EnumEntries<InterruptReason> getEntries() {
            return $ENTRIES;
        }

        public static InterruptReason valueOf(String str) {
            return (InterruptReason) Enum.valueOf(InterruptReason.class, str);
        }

        public static InterruptReason[] values() {
            return (InterruptReason[]) $VALUES.clone();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Interrupted;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$InterruptReason;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$InterruptReason;)V", "getReason", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$InterruptReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Interrupted implements ConversationEnd {

        @NotNull
        private final InterruptReason reason;

        public Interrupted(@NotNull InterruptReason interruptReason) {
            interruptReason.getClass();
            this.reason = interruptReason;
        }

        public static /* synthetic */ Interrupted copy$default(Interrupted interrupted, InterruptReason interruptReason, int i, Object obj) {
            if ((i & 1) != 0) {
                interruptReason = interrupted.reason;
            }
            return interrupted.copy(interruptReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InterruptReason getReason() {
            return this.reason;
        }

        @NotNull
        public final Interrupted copy(@NotNull InterruptReason reason) {
            reason.getClass();
            return new Interrupted(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Interrupted) && this.reason == ((Interrupted) other).reason;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @NotNull
        public final InterruptReason getReason() {
            return this.reason;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public ConversationResult getResult() {
            return DefaultImpls.getResult(this);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Interrupted(reason=" + this.reason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd$Resolved;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEnd;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resolved implements ConversationEnd {

        @NotNull
        public static final Resolved INSTANCE = new Resolved();

        private Resolved() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Resolved);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationEnd
        @NotNull
        public ConversationResult getResult() {
            return DefaultImpls.getResult(this);
        }

        public int hashCode() {
            return 1933865477;
        }

        @NotNull
        public String toString() {
            return "Resolved";
        }
    }

    @NotNull
    String getLogLabel();

    @NotNull
    ConversationResult getResult();
}
