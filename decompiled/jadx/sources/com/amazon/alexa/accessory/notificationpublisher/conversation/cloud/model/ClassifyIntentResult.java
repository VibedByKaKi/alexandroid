package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model;

import com.amazon.alexa.accessory.frames.media.MediaService;
import com.amazon.alexa.accessory.notificationpublisher.conversation.DiagnosticText;
import com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.ExtractedIntent;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000e2\u00020\u0001:\u0006\t\n\u000b\f\r\u000eR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "", "isTerminal", "", "()Z", "diagnosticSummary", "", "getDiagnosticSummary", "()Ljava/lang/String;", "Actionable", "Confirmed", "Declined", "Unclear", "Unknown", "Companion", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Actionable;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Confirmed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Declined;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Unclear;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Unknown;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ClassifyIntentResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Actionable;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "intent", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", LivePreviewBundleKeys.TRANSCRIPT, "", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;Ljava/lang/String;)V", "getIntent", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "getTranscript", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Actionable implements ClassifyIntentResult {

        @NotNull
        private final ExtractedIntent intent;

        @NotNull
        private final String transcript;

        public Actionable(@NotNull ExtractedIntent extractedIntent, @NotNull String str) {
            extractedIntent.getClass();
            str.getClass();
            this.intent = extractedIntent;
            this.transcript = str;
        }

        public static /* synthetic */ Actionable copy$default(Actionable actionable, ExtractedIntent extractedIntent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                extractedIntent = actionable.intent;
            }
            if ((i & 2) != 0) {
                str = actionable.transcript;
            }
            return actionable.copy(extractedIntent, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ExtractedIntent getIntent() {
            return this.intent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTranscript() {
            return this.transcript;
        }

        @NotNull
        public final Actionable copy(@NotNull ExtractedIntent intent, @NotNull String transcript) {
            intent.getClass();
            transcript.getClass();
            return new Actionable(intent, transcript);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actionable)) {
                return false;
            }
            Actionable actionable = (Actionable) other;
            return Intrinsics.areEqual(this.intent, actionable.intent) && Intrinsics.areEqual(this.transcript, actionable.transcript);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        @NotNull
        public String getDiagnosticSummary() {
            return DefaultImpls.getDiagnosticSummary(this);
        }

        @NotNull
        public final ExtractedIntent getIntent() {
            return this.intent;
        }

        @NotNull
        public final String getTranscript() {
            return this.transcript;
        }

        public int hashCode() {
            return this.transcript.hashCode() + (this.intent.hashCode() * 31);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        public boolean isTerminal() {
            return DefaultImpls.isTerminal(this);
        }

        @NotNull
        public String toString() {
            return "Actionable(intent=" + this.intent + ", transcript=" + this.transcript + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Companion;", "", "<init>", "()V", Companion.ACTIONABLE, "", "CONFIRMED", Companion.DECLINED, Companion.UNCLEAR, "safeCode", "raw", "from", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "disposition", "intent", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", LivePreviewBundleKeys.TRANSCRIPT, "reason", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String ACTIONABLE = "ACTIONABLE";

        @NotNull
        private static final String CONFIRMED = "CONFIRMED";

        @NotNull
        private static final String DECLINED = "DECLINED";

        @NotNull
        private static final String UNCLEAR = "UNCLEAR";

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @JvmStatic
        @NotNull
        public final ClassifyIntentResult from(@NotNull String disposition, @Nullable ExtractedIntent intent, @Nullable String transcript, @Nullable String reason) {
            disposition.getClass();
            if (transcript == null) {
                transcript = "";
            }
            switch (disposition.hashCode()) {
                case -1957628784:
                    if (disposition.equals(ACTIONABLE)) {
                        return intent == null ? new Unknown("ACTIONABLE_WITHOUT_INTENT") : new Actionable(intent, transcript);
                    }
                    break;
                case 425683764:
                    if (disposition.equals(UNCLEAR)) {
                        return new Unclear(transcript, reason);
                    }
                    break;
                case 1350822958:
                    if (disposition.equals(DECLINED)) {
                        return new Declined(transcript);
                    }
                    break;
                case 1982485311:
                    if (disposition.equals("CONFIRMED")) {
                        return new Confirmed(transcript);
                    }
                    break;
            }
            return new Unknown(disposition);
        }

        @NotNull
        public final String safeCode(@Nullable String raw) {
            return DiagnosticText.INSTANCE.safeCode(raw);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Confirmed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", LivePreviewBundleKeys.TRANSCRIPT, "", "<init>", "(Ljava/lang/String;)V", "getTranscript", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Confirmed implements ClassifyIntentResult {

        @NotNull
        private final String transcript;

        public Confirmed(@NotNull String str) {
            str.getClass();
            this.transcript = str;
        }

        public static /* synthetic */ Confirmed copy$default(Confirmed confirmed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmed.transcript;
            }
            return confirmed.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTranscript() {
            return this.transcript;
        }

        @NotNull
        public final Confirmed copy(@NotNull String transcript) {
            transcript.getClass();
            return new Confirmed(transcript);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Confirmed) && Intrinsics.areEqual(this.transcript, ((Confirmed) other).transcript);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        @NotNull
        public String getDiagnosticSummary() {
            return DefaultImpls.getDiagnosticSummary(this);
        }

        @NotNull
        public final String getTranscript() {
            return this.transcript;
        }

        public int hashCode() {
            return this.transcript.hashCode();
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        public boolean isTerminal() {
            return DefaultImpls.isTerminal(this);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Confirmed(transcript=", this.transcript, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Declined;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", LivePreviewBundleKeys.TRANSCRIPT, "", "<init>", "(Ljava/lang/String;)V", "getTranscript", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Declined implements ClassifyIntentResult {

        @NotNull
        private final String transcript;

        public Declined(@NotNull String str) {
            str.getClass();
            this.transcript = str;
        }

        public static /* synthetic */ Declined copy$default(Declined declined, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = declined.transcript;
            }
            return declined.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTranscript() {
            return this.transcript;
        }

        @NotNull
        public final Declined copy(@NotNull String transcript) {
            transcript.getClass();
            return new Declined(transcript);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Declined) && Intrinsics.areEqual(this.transcript, ((Declined) other).transcript);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        @NotNull
        public String getDiagnosticSummary() {
            return DefaultImpls.getDiagnosticSummary(this);
        }

        @NotNull
        public final String getTranscript() {
            return this.transcript;
        }

        public int hashCode() {
            return this.transcript.hashCode();
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        public boolean isTerminal() {
            return DefaultImpls.isTerminal(this);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Declined(transcript=", this.transcript, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getDiagnosticSummary(@NotNull ClassifyIntentResult classifyIntentResult) {
            if (classifyIntentResult instanceof Actionable) {
                return "ACTIONABLE";
            }
            if (classifyIntentResult instanceof Confirmed) {
                return MediaService.DEVICE_RECEIPT_CONFIRMED;
            }
            if (classifyIntentResult instanceof Declined) {
                return "DECLINED";
            }
            if (classifyIntentResult instanceof Unclear) {
                return a$$ExternalSyntheticOutline0.m("UNCLEAR(reason=", ClassifyIntentResult.INSTANCE.safeCode(((Unclear) classifyIntentResult).getReason()), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (classifyIntentResult instanceof Unknown) {
                return a$$ExternalSyntheticOutline0.m("unknown(", ClassifyIntentResult.INSTANCE.safeCode(((Unknown) classifyIntentResult).getDisposition()), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        public static boolean isTerminal(@NotNull ClassifyIntentResult classifyIntentResult) {
            if (classifyIntentResult instanceof Unknown) {
                return true;
            }
            if ((classifyIntentResult instanceof Actionable) || (classifyIntentResult instanceof Confirmed) || (classifyIntentResult instanceof Declined) || (classifyIntentResult instanceof Unclear)) {
                return false;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Unclear;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", LivePreviewBundleKeys.TRANSCRIPT, "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTranscript", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unclear implements ClassifyIntentResult {

        @Nullable
        private final String reason;

        @NotNull
        private final String transcript;

        public Unclear(@NotNull String str, @Nullable String str2) {
            str.getClass();
            this.transcript = str;
            this.reason = str2;
        }

        public static /* synthetic */ Unclear copy$default(Unclear unclear, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unclear.transcript;
            }
            if ((i & 2) != 0) {
                str2 = unclear.reason;
            }
            return unclear.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTranscript() {
            return this.transcript;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final Unclear copy(@NotNull String transcript, @Nullable String reason) {
            transcript.getClass();
            return new Unclear(transcript, reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unclear)) {
                return false;
            }
            Unclear unclear = (Unclear) other;
            return Intrinsics.areEqual(this.transcript, unclear.transcript) && Intrinsics.areEqual(this.reason, unclear.reason);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        @NotNull
        public String getDiagnosticSummary() {
            return DefaultImpls.getDiagnosticSummary(this);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final String getTranscript() {
            return this.transcript;
        }

        public int hashCode() {
            int hashCode = this.transcript.hashCode() * 31;
            String str = this.reason;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        public boolean isTerminal() {
            return DefaultImpls.isTerminal(this);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unclear(transcript=", this.transcript, ", reason=", this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult$Unknown;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "disposition", "", "<init>", "(Ljava/lang/String;)V", "getDisposition", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown implements ClassifyIntentResult {

        @NotNull
        private final String disposition;

        public Unknown(@NotNull String str) {
            str.getClass();
            this.disposition = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.disposition;
            }
            return unknown.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDisposition() {
            return this.disposition;
        }

        @NotNull
        public final Unknown copy(@NotNull String disposition) {
            disposition.getClass();
            return new Unknown(disposition);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.disposition, ((Unknown) other).disposition);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        @NotNull
        public String getDiagnosticSummary() {
            return DefaultImpls.getDiagnosticSummary(this);
        }

        @NotNull
        public final String getDisposition() {
            return this.disposition;
        }

        public int hashCode() {
            return this.disposition.hashCode();
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult
        public boolean isTerminal() {
            return DefaultImpls.isTerminal(this);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unknown(disposition=", this.disposition, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @JvmStatic
    @NotNull
    static ClassifyIntentResult from(@NotNull String str, @Nullable ExtractedIntent extractedIntent, @Nullable String str2, @Nullable String str3) {
        return INSTANCE.from(str, extractedIntent, str2, str3);
    }

    @NotNull
    String getDiagnosticSummary();

    boolean isTerminal();
}
