package com.amazon.comms.calling.infrastructure.audio;

import com.amazon.comms.calling.domain.model.AudioRoutes;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.util.Observable;
import java.util.Observer;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;", "Ljava/util/Observable;", "<init>", "()V", "currentAudioRoutes", "Lcom/amazon/comms/calling/domain/model/AudioRoutes;", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "addObserver", "", "o", "Ljava/util/Observer;", "onAudioRouteChanged", "audioRoutes", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AudioRouteChangeObservable extends Observable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(AudioRouteChangeObservable.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @Nullable
    private AudioRoutes currentAudioRoutes;

    @Inject
    public AudioRouteChangeObservable() {
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // java.util.Observable
    public void addObserver(@Nullable Observer o) {
        super.addObserver(o);
        getLOG().i("[AudioRoute]: addObserver");
        if (this.currentAudioRoutes != null) {
            getLOG().i("[AudioRoute]: addObserver notifyObservers");
            setChanged();
            notifyObservers(this.currentAudioRoutes);
        }
    }

    public final void onAudioRouteChanged(@NotNull AudioRoutes audioRoutes) {
        audioRoutes.getClass();
        getLOG().i("[AudioRoute]: onAudioRouteChanged");
        this.currentAudioRoutes = audioRoutes;
        setChanged();
        notifyObservers(audioRoutes);
    }
}
