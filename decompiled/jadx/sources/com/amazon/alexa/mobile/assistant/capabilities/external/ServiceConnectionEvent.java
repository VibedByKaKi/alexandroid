package com.amazon.alexa.mobile.assistant.capabilities.external;

import android.content.ComponentName;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent;", "", "<init>", "()V", "componentName", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", "timeTakenMs", "", "getTimeTakenMs", "()J", "serviceSimpleName", "", "getServiceSimpleName", "()Ljava/lang/String;", "Succeeded", UploadWorker.FAILED_PREFIX, "Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent$Failed;", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent$Succeeded;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class ServiceConnectionEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent$Failed;", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent;", "componentName", "Landroid/content/ComponentName;", "timeTakenMs", "", "<init>", "(Landroid/content/ComponentName;J)V", "getComponentName", "()Landroid/content/ComponentName;", "getTimeTakenMs", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends ServiceConnectionEvent {

        @NotNull
        private final ComponentName componentName;
        private final long timeTakenMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull ComponentName componentName, long j) {
            super(null);
            componentName.getClass();
            this.componentName = componentName;
            this.timeTakenMs = j;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, ComponentName componentName, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                componentName = failed.componentName;
            }
            if ((i & 2) != 0) {
                j = failed.timeTakenMs;
            }
            return failed.copy(componentName, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ComponentName getComponentName() {
            return this.componentName;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeTakenMs() {
            return this.timeTakenMs;
        }

        @NotNull
        public final Failed copy(@NotNull ComponentName componentName, long timeTakenMs) {
            componentName.getClass();
            return new Failed(componentName, timeTakenMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.componentName, failed.componentName) && this.timeTakenMs == failed.timeTakenMs;
        }

        @Override // com.amazon.alexa.mobile.assistant.capabilities.external.ServiceConnectionEvent
        @NotNull
        public ComponentName getComponentName() {
            return this.componentName;
        }

        @Override // com.amazon.alexa.mobile.assistant.capabilities.external.ServiceConnectionEvent
        public long getTimeTakenMs() {
            return this.timeTakenMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timeTakenMs) + (this.componentName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Failed(componentName=" + this.componentName + ", timeTakenMs=" + this.timeTakenMs + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent$Succeeded;", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/ServiceConnectionEvent;", "componentName", "Landroid/content/ComponentName;", "timeTakenMs", "", "<init>", "(Landroid/content/ComponentName;J)V", "getComponentName", "()Landroid/content/ComponentName;", "getTimeTakenMs", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Succeeded extends ServiceConnectionEvent {

        @NotNull
        private final ComponentName componentName;
        private final long timeTakenMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(@NotNull ComponentName componentName, long j) {
            super(null);
            componentName.getClass();
            this.componentName = componentName;
            this.timeTakenMs = j;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, ComponentName componentName, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                componentName = succeeded.componentName;
            }
            if ((i & 2) != 0) {
                j = succeeded.timeTakenMs;
            }
            return succeeded.copy(componentName, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ComponentName getComponentName() {
            return this.componentName;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeTakenMs() {
            return this.timeTakenMs;
        }

        @NotNull
        public final Succeeded copy(@NotNull ComponentName componentName, long timeTakenMs) {
            componentName.getClass();
            return new Succeeded(componentName, timeTakenMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return Intrinsics.areEqual(this.componentName, succeeded.componentName) && this.timeTakenMs == succeeded.timeTakenMs;
        }

        @Override // com.amazon.alexa.mobile.assistant.capabilities.external.ServiceConnectionEvent
        @NotNull
        public ComponentName getComponentName() {
            return this.componentName;
        }

        @Override // com.amazon.alexa.mobile.assistant.capabilities.external.ServiceConnectionEvent
        public long getTimeTakenMs() {
            return this.timeTakenMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timeTakenMs) + (this.componentName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Succeeded(componentName=" + this.componentName + ", timeTakenMs=" + this.timeTakenMs + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ ServiceConnectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract ComponentName getComponentName();

    @NotNull
    public final String getServiceSimpleName() {
        String substringAfterLast$default;
        String className = getComponentName().getClassName();
        className.getClass();
        substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(className, ".", (String) null, 2, (Object) null);
        return substringAfterLast$default;
    }

    public abstract long getTimeTakenMs();

    private ServiceConnectionEvent() {
    }
}
