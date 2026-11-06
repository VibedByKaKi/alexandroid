package com.amazon.alexa.accessory.frames.media.autoimport.models;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\t\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "", "<init>", "()V", VoiceChatContract.COLUMN_IS_ACTIVE, "", "isBusy", "hasTimedOut", "timeoutMs", "", "getElapsedTime", "Idle", "Preparing", "InProgress", "Completed", UploadWorker.FAILED_PREFIX, "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Completed;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Failed;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Idle;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$InProgress;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Preparing;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ImportState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Completed;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "<init>", "()V", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Completed extends ImportState {

        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Failed;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "<init>", "()V", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failed extends ImportState {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Idle;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "<init>", "()V", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle extends ImportState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$InProgress;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "startedAt", "", "<init>", "(J)V", "getStartedAt", "()J", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InProgress extends ImportState {
        private final long startedAt;

        public InProgress(long j) {
            super(null);
            this.startedAt = j;
        }

        public static /* synthetic */ InProgress copy$default(InProgress inProgress, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = inProgress.startedAt;
            }
            return inProgress.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        @NotNull
        public final InProgress copy(long startedAt) {
            return new InProgress(startedAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InProgress) && this.startedAt == ((InProgress) other).startedAt;
        }

        public final long getStartedAt() {
            return this.startedAt;
        }

        public int hashCode() {
            return Long.hashCode(this.startedAt);
        }

        @NotNull
        public String toString() {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m("InProgress(startedAt=", this.startedAt, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState$Preparing;", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "<init>", "()V", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preparing extends ImportState {

        @NotNull
        public static final Preparing INSTANCE = new Preparing();

        private Preparing() {
            super(null);
        }
    }

    public /* synthetic */ ImportState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final long getElapsedTime() {
        if (this instanceof InProgress) {
            return System.currentTimeMillis() - ((InProgress) this).getStartedAt();
        }
        return 0L;
    }

    public final boolean hasTimedOut(long timeoutMs) {
        return (this instanceof InProgress) && System.currentTimeMillis() - ((InProgress) this).getStartedAt() > timeoutMs;
    }

    public final boolean isActive() {
        return this instanceof InProgress;
    }

    public final boolean isBusy() {
        return (this instanceof Preparing) || (this instanceof InProgress);
    }

    private ImportState() {
    }
}
