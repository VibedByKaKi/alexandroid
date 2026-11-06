package com.amazon.alexa.assistant.session.audio.model;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "", "<init>", "()V", "Initialized", "Foregrounded", "Backgrounded", "Stopped", UploadWorker.FAILED_PREFIX, "Interrupted", "Resuming", "StoppedReason", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Backgrounded;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Failed;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Foregrounded;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Initialized;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Interrupted;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Resuming;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Stopped;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AudioTaskState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Backgrounded;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Backgrounded extends AudioTaskState {

        @NotNull
        public static final Backgrounded INSTANCE = new Backgrounded();

        private Backgrounded() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Backgrounded);
        }

        public int hashCode() {
            return -1938258024;
        }

        @NotNull
        public String toString() {
            return "Backgrounded";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Failed;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends AudioTaskState {

        @NotNull
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull Exception exc) {
            super(null);
            exc.getClass();
            this.exception = exc;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = failed.exception;
            }
            return failed.copy(exc);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final Failed copy(@NotNull Exception exception) {
            exception.getClass();
            return new Failed(exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.exception, ((Failed) other).exception);
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Foregrounded;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Foregrounded extends AudioTaskState {

        @NotNull
        public static final Foregrounded INSTANCE = new Foregrounded();

        private Foregrounded() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Foregrounded);
        }

        public int hashCode() {
            return -1502352787;
        }

        @NotNull
        public String toString() {
            return "Foregrounded";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Initialized;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Initialized extends AudioTaskState {

        @NotNull
        public static final Initialized INSTANCE = new Initialized();

        private Initialized() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Initialized);
        }

        public int hashCode() {
            return -895805399;
        }

        @NotNull
        public String toString() {
            return "Initialized";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Interrupted;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Interrupted extends AudioTaskState {

        @NotNull
        public static final Interrupted INSTANCE = new Interrupted();

        private Interrupted() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Interrupted);
        }

        public int hashCode() {
            return 217489303;
        }

        @NotNull
        public String toString() {
            return "Interrupted";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Resuming;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resuming extends AudioTaskState {

        @NotNull
        public static final Resuming INSTANCE = new Resuming();

        private Resuming() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Resuming);
        }

        public int hashCode() {
            return 1525392501;
        }

        @NotNull
        public String toString() {
            return "Resuming";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$Stopped;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "reason", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "<init>", "(Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;)V", "getReason", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends AudioTaskState {

        @NotNull
        private final StoppedReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stopped(@NotNull StoppedReason stoppedReason) {
            super(null);
            stoppedReason.getClass();
            this.reason = stoppedReason;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, StoppedReason stoppedReason, int i, Object obj) {
            if ((i & 1) != 0) {
                stoppedReason = stopped.reason;
            }
            return stopped.copy(stoppedReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final StoppedReason getReason() {
            return this.reason;
        }

        @NotNull
        public final Stopped copy(@NotNull StoppedReason reason) {
            reason.getClass();
            return new Stopped(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stopped) && this.reason == ((Stopped) other).reason;
        }

        @NotNull
        public final StoppedReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Stopped(reason=" + this.reason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING_NEW_TASK", "RELEASED", "INTERRUPTED", "FAILURE", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoppedReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StoppedReason[] $VALUES;
        public static final StoppedReason INCOMING_NEW_TASK = new StoppedReason("INCOMING_NEW_TASK", 0);
        public static final StoppedReason RELEASED = new StoppedReason("RELEASED", 1);
        public static final StoppedReason INTERRUPTED = new StoppedReason("INTERRUPTED", 2);
        public static final StoppedReason FAILURE = new StoppedReason("FAILURE", 3);

        private static final /* synthetic */ StoppedReason[] $values() {
            return new StoppedReason[]{INCOMING_NEW_TASK, RELEASED, INTERRUPTED, FAILURE};
        }

        static {
            StoppedReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StoppedReason(String str, int i) {
        }

        @NotNull
        public static EnumEntries<StoppedReason> getEntries() {
            return $ENTRIES;
        }

        public static StoppedReason valueOf(String str) {
            return (StoppedReason) Enum.valueOf(StoppedReason.class, str);
        }

        public static StoppedReason[] values() {
            return (StoppedReason[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AudioTaskState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AudioTaskState() {
    }
}
