package com.amazon.alexa.accessory.frames.media.autoimport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportTriggerPolicy;", "", "<init>", "()V", "isEnabled", "", "trigger", "Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportTrigger;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportTriggerPolicy {

    @NotNull
    public static final AutoImportTriggerPolicy INSTANCE = new AutoImportTriggerPolicy();

    private AutoImportTriggerPolicy() {
    }

    public final boolean isEnabled(@NotNull AutoImportTrigger trigger) {
        trigger.getClass();
        return trigger.getEnabled();
    }
}
