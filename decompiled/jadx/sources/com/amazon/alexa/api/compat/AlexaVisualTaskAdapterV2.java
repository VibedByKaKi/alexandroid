package com.amazon.alexa.api.compat;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.api.AlexaVisualTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVisualTaskAdapterV2;", "Lcom/amazon/alexa/api/AlexaVisualTask;", "modelTask", "Lcom/amazon/alexa/api/compat/model/AlexaVisualTask;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaVisualTask;)V", "getTaskComponentName", "", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaVisualTaskAdapterV2 implements AlexaVisualTask {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlexaVisualTask modelTask;

    public AlexaVisualTaskAdapterV2(@NotNull com.amazon.alexa.api.compat.model.AlexaVisualTask alexaVisualTask) {
        alexaVisualTask.getClass();
        this.modelTask = alexaVisualTask;
    }

    @Override // com.amazon.alexa.api.AlexaVisualTask
    @NotNull
    public String getTaskComponentName() {
        return this.modelTask.getTaskComponentName();
    }

    @Override // com.amazon.alexa.api.AlexaVisualTask
    public void onStop() {
        this.modelTask.onStop();
    }
}
