package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.identity.auth.device.api.MAPActorManager;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "", "TurnStarted", "InputClosing", "Result", UploadWorker.FAILED_PREFIX, "Unknown", "Companion", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$InputClosing;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Result;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$TurnStarted;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Unknown;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ClassifyIntentEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Companion;", "", "<init>", "()V", "parse", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "text", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClassifyIntentMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifyIntentMessages.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            r7 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.stringOrEmpty(r0, "type");
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent parse(@org.jetbrains.annotations.NotNull java.lang.String r7) throws org.json.JSONException {
            /*
                r6 = this;
                r7.getClass()
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>(r7)
                java.lang.String r7 = "type"
                java.lang.String r0 = r6.getString(r7)
                if (r0 == 0) goto Lb3
                int r1 = r0.hashCode()
                java.lang.String r2 = "reason"
                switch(r1) {
                    case -368517330: goto La0;
                    case -147272450: goto L94;
                    case 1129776160: goto L7a;
                    case 1477326848: goto L1c;
                    default: goto L1a;
                }
            L1a:
                goto Lb3
            L1c:
                java.lang.String r1 = "classifyIntent.turn.result"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L26
                goto Lb3
            L26:
                java.lang.String r0 = "disposition"
                org.json.JSONObject r0 = r6.optJSONObject(r0)
                r1 = 0
                if (r0 == 0) goto L42
                java.lang.String r3 = "intent"
                org.json.JSONObject r3 = r0.optJSONObject(r3)
                if (r3 == 0) goto L42
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentIntentPayload$Companion r4 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentIntentPayload.INSTANCE
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentIntentPayload r3 = r4.from(r3)
                com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.ExtractedIntent r3 = r3.asExtractedIntent()
                goto L43
            L42:
                r3 = r1
            L43:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult$Companion r4 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult.INSTANCE
                if (r0 == 0) goto L4d
                java.lang.String r7 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$stringOrEmpty(r0, r7)
                if (r7 != 0) goto L4f
            L4d:
                java.lang.String r7 = ""
            L4f:
                java.lang.String r5 = "transcript"
                java.lang.String r5 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$stringOrNull(r6, r5)
                if (r0 == 0) goto L5c
                java.lang.String r1 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$stringOrNull(r0, r2)
            L5c:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult r7 = r4.from(r7, r3, r5, r1)
                boolean r0 = r7 instanceof com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult.Unknown
                if (r0 == 0) goto L74
                java.lang.String r6 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.describeResultShape(r6)
                java.lang.Object[] r6 = new java.lang.Object[]{r6}
                java.lang.String r0 = "ClassifyIntentMessages"
                java.lang.String r1 = "turn.result unrecognized — raw shape: %s"
                com.amazon.alexa.accessory.notificationpublisher.utils.Log.w(r0, r1, r6)
            L74:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Result r6 = new com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Result
                r6.<init>(r7)
                return r6
            L7a:
                java.lang.String r7 = "classifyIntent.turn.failed"
                boolean r7 = r0.equals(r7)
                if (r7 != 0) goto L83
                goto Lb3
            L83:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Failed r7 = new com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Failed
                java.lang.String r0 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$stringOrNull(r6, r2)
                java.lang.String r1 = "retryable"
                java.lang.Boolean r6 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$booleanOrNull(r6, r1)
                r7.<init>(r0, r6)
                return r7
            L94:
                java.lang.String r6 = "classifyIntent.turn.started"
                boolean r6 = r0.equals(r6)
                if (r6 != 0) goto L9d
                goto Lb3
            L9d:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$TurnStarted r6 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent.TurnStarted.INSTANCE
                return r6
            La0:
                java.lang.String r7 = "classifyIntent.turn.inputClosing"
                boolean r7 = r0.equals(r7)
                if (r7 != 0) goto La9
                goto Lb3
            La9:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$InputClosing r7 = new com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$InputClosing
                java.lang.String r6 = com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentMessagesKt.access$stringOrNull(r6, r2)
                r7.<init>(r6)
                return r7
            Lb3:
                com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Unknown r6 = new com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent$Unknown
                r0.getClass()
                r6.<init>(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent.Companion.parse(java.lang.String):com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "reason", "", MAPActorManager.KEY_RETRYABLE, "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getReason", "()Ljava/lang/String;", "getRetryable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Failed;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements ClassifyIntentEvent {

        @Nullable
        private final String reason;

        @Nullable
        private final Boolean retryable;

        public Failed(@Nullable String str, @Nullable Boolean bool) {
            this.reason = str;
            this.retryable = bool;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.reason;
            }
            if ((i & 2) != 0) {
                bool = failed.retryable;
            }
            return failed.copy(str, bool);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getRetryable() {
            return this.retryable;
        }

        @NotNull
        public final Failed copy(@Nullable String reason, @Nullable Boolean retryable) {
            return new Failed(reason, retryable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.reason, failed.reason) && Intrinsics.areEqual(this.retryable, failed.retryable);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final Boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            String str = this.reason;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.retryable;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failed(reason=" + this.reason + ", retryable=" + this.retryable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$InputClosing;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InputClosing implements ClassifyIntentEvent {

        @Nullable
        private final String reason;

        public InputClosing(@Nullable String str) {
            this.reason = str;
        }

        public static /* synthetic */ InputClosing copy$default(InputClosing inputClosing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inputClosing.reason;
            }
            return inputClosing.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final InputClosing copy(@Nullable String reason) {
            return new InputClosing(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputClosing) && Intrinsics.areEqual(this.reason, ((InputClosing) other).reason);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("InputClosing(reason=", this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Result;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "result", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;)V", "getResult", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements ClassifyIntentEvent {

        @NotNull
        private final ClassifyIntentResult result;

        public Result(@NotNull ClassifyIntentResult classifyIntentResult) {
            classifyIntentResult.getClass();
            this.result = classifyIntentResult;
        }

        public static /* synthetic */ Result copy$default(Result result, ClassifyIntentResult classifyIntentResult, int i, Object obj) {
            if ((i & 1) != 0) {
                classifyIntentResult = result.result;
            }
            return result.copy(classifyIntentResult);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClassifyIntentResult getResult() {
            return this.result;
        }

        @NotNull
        public final Result copy(@NotNull ClassifyIntentResult result) {
            result.getClass();
            return new Result(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.result, ((Result) other).result);
        }

        @NotNull
        public final ClassifyIntentResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "Result(result=" + this.result + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$TurnStarted;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TurnStarted implements ClassifyIntentEvent {

        @NotNull
        public static final TurnStarted INSTANCE = new TurnStarted();

        private TurnStarted() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TurnStarted);
        }

        public int hashCode() {
            return -58120984;
        }

        @NotNull
        public String toString() {
            return "TurnStarted";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent$Unknown;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentEvent;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown implements ClassifyIntentEvent {

        @NotNull
        private final String type;

        public Unknown(@NotNull String str) {
            str.getClass();
            this.type = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Unknown copy(@NotNull String type) {
            type.getClass();
            return new Unknown(type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.type, ((Unknown) other).type);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unknown(type=", this.type, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @JvmStatic
    @NotNull
    static ClassifyIntentEvent parse(@NotNull String str) throws JSONException {
        return INSTANCE.parse(str);
    }
}
