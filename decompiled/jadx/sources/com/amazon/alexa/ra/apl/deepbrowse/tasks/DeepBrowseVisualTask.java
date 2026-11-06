package com.amazon.alexa.ra.apl.deepbrowse.tasks;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.api.compat.model.AlexaVisualTask;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/tasks/DeepBrowseVisualTask;", "Lcom/amazon/alexa/api/compat/model/AlexaVisualTask;", "<init>", "()V", "getTaskComponentName", "", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "", "Companion", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DeepBrowseVisualTask implements AlexaVisualTask {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DeepBrowseVisualTask INSTANCE = new DeepBrowseVisualTask();

    @NotNull
    private static final String NAMESPACE = "Alexa.Presentation.APL";

    @Override // com.amazon.alexa.api.compat.model.AlexaVisualTask
    @NotNull
    public String getTaskComponentName() {
        return "Alexa.Presentation.APL";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/tasks/DeepBrowseVisualTask$Companion;", "", "<init>", "()V", "NAMESPACE", "", "INSTANCE", "Lcom/amazon/alexa/ra/apl/deepbrowse/tasks/DeepBrowseVisualTask;", "getINSTANCE", "()Lcom/amazon/alexa/ra/apl/deepbrowse/tasks/DeepBrowseVisualTask;", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeepBrowseVisualTask getINSTANCE() {
            return DeepBrowseVisualTask.INSTANCE;
        }

        private Companion() {
        }
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaVisualTask
    public void onStop() {
    }
}
