package com.amazon.alexa.accessory.speechapi.voicesdk.ambient_sound;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.speechapi.AmbientSoundDispatcher;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/ambient_sound/VoxAmbientSoundDispatcherInstance;", "", "<init>", "()V", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher;", Constants.LOG_TAG, "", MetricsConstants.Method.CACHE_GET, "bind", "", "dispatcher", "hasInstance", "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVoxAmbientSoundDispatcherInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoxAmbientSoundDispatcherInstance.kt\ncom/amazon/alexa/accessory/speechapi/voicesdk/ambient_sound/VoxAmbientSoundDispatcherInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* loaded from: classes16.dex */
public final class VoxAmbientSoundDispatcherInstance {

    @NotNull
    public static final VoxAmbientSoundDispatcherInstance INSTANCE = new VoxAmbientSoundDispatcherInstance();

    @NotNull
    private static final String TAG = "VoxAmbientSoundDispatcherInstance:";

    @Nullable
    private static AmbientSoundDispatcher instance;

    private VoxAmbientSoundDispatcherInstance() {
    }

    public final void bind(@NotNull AmbientSoundDispatcher dispatcher) {
        dispatcher.getClass();
        Logger.d("VoxAmbientSoundDispatcherInstance: bind");
        Preconditions.mainThread();
        Preconditions.notNull(dispatcher, "dispatcher");
        if (instance == null) {
            instance = dispatcher;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Instance is already bound!");
        }
    }

    @NotNull
    public final AmbientSoundDispatcher get() {
        Logger.d("VoxAmbientSoundDispatcherInstance: get");
        Preconditions.mainThread();
        AmbientSoundDispatcher ambientSoundDispatcher = instance;
        if (ambientSoundDispatcher != null) {
            ambientSoundDispatcher.getClass();
            return ambientSoundDispatcher;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Ambient sound dispatcher instance is unavailable!");
        return null;
    }

    public final boolean hasInstance() {
        Logger.d("VoxAmbientSoundDispatcherInstance: hasInstance");
        Preconditions.mainThread();
        return instance != null;
    }
}
