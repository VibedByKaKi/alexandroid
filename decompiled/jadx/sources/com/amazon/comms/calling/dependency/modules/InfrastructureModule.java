package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import android.media.AudioManager;
import com.amazon.alexa.accessoryclient.client.accessories.Accessories;
import com.amazon.comms.calling.infrastructure.AccessoriesProvider;
import com.amazon.comms.calling.infrastructure.AccessoriesProviderImpl;
import com.amazon.comms.calling.infrastructure.IncomingCallSipObserver;
import com.amazon.comms.calling.infrastructure.IncomingCallSipObserverImpl;
import com.amazon.comms.calling.infrastructure.MissedCallNotification;
import com.amazon.comms.calling.infrastructure.MissedCallNotificationImp;
import com.amazon.comms.calling.infrastructure.OngoingCallNotification;
import com.amazon.comms.calling.infrastructure.OngoingCallNotificationImpl;
import com.amazon.comms.calling.infrastructure.ProximitySensorProvider;
import com.amazon.comms.calling.infrastructure.ProximitySensorProviderImpl;
import com.amazon.comms.calling.infrastructure.StringHelper;
import com.amazon.comms.calling.infrastructure.StringHelperImpl;
import com.amazon.comms.calling.infrastructure.VibrationProvider;
import com.amazon.comms.calling.infrastructure.VibrationProviderImpl;
import com.amazon.comms.calling.infrastructure.audio.AudioFocusListener;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007¨\u0006("}, d2 = {"Lcom/amazon/comms/calling/dependency/modules/InfrastructureModule;", "", "<init>", "()V", "providesStringHelper", "Lcom/amazon/comms/calling/infrastructure/StringHelper;", "stringHelperImpl", "Lcom/amazon/comms/calling/infrastructure/StringHelperImpl;", "providesOngoingCallNotification", "Lcom/amazon/comms/calling/infrastructure/OngoingCallNotification;", "ongoingCallNotificationImpl", "Lcom/amazon/comms/calling/infrastructure/OngoingCallNotificationImpl;", "providesIncomingCallSipObserver", "Lcom/amazon/comms/calling/infrastructure/IncomingCallSipObserver;", "incomingCallSipObserverImpl", "Lcom/amazon/comms/calling/infrastructure/IncomingCallSipObserverImpl;", "providesMissedCallNotification", "Lcom/amazon/comms/calling/infrastructure/MissedCallNotification;", "missedCallNotificationImpl", "Lcom/amazon/comms/calling/infrastructure/MissedCallNotificationImp;", "providesProximitySensorProvider", "Lcom/amazon/comms/calling/infrastructure/ProximitySensorProvider;", "proximitySensorProviderImpl", "Lcom/amazon/comms/calling/infrastructure/ProximitySensorProviderImpl;", "providesAccessories", "Lcom/amazon/alexa/accessoryclient/client/accessories/Accessories;", "context", "Landroid/content/Context;", "providesAccessoriesProvider", "Lcom/amazon/comms/calling/infrastructure/AccessoriesProvider;", "accessoriesProviderImpl", "Lcom/amazon/comms/calling/infrastructure/AccessoriesProviderImpl;", "providesVibrationProvider", "Lcom/amazon/comms/calling/infrastructure/VibrationProvider;", "vibrationProviderImpl", "Lcom/amazon/comms/calling/infrastructure/VibrationProviderImpl;", "providesAudioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Lcom/amazon/comms/calling/infrastructure/audio/AudioFocusListener;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class InfrastructureModule {
    @Provides
    @NotNull
    public final Accessories providesAccessories(@NotNull Context context) {
        context.getClass();
        return Accessories.Shared.INSTANCE.get(context);
    }

    @Provides
    @Singleton
    @NotNull
    public final AccessoriesProvider providesAccessoriesProvider(@NotNull AccessoriesProviderImpl accessoriesProviderImpl) {
        accessoriesProviderImpl.getClass();
        return accessoriesProviderImpl;
    }

    @Provides
    @NotNull
    public final AudioManager.OnAudioFocusChangeListener providesAudioFocusListener(@NotNull AudioFocusListener audioFocusListener) {
        audioFocusListener.getClass();
        return audioFocusListener;
    }

    @Provides
    @NotNull
    public final IncomingCallSipObserver providesIncomingCallSipObserver(@NotNull IncomingCallSipObserverImpl incomingCallSipObserverImpl) {
        incomingCallSipObserverImpl.getClass();
        return incomingCallSipObserverImpl;
    }

    @Provides
    @NotNull
    public final MissedCallNotification providesMissedCallNotification(@NotNull MissedCallNotificationImp missedCallNotificationImpl) {
        missedCallNotificationImpl.getClass();
        return missedCallNotificationImpl;
    }

    @Provides
    @NotNull
    public final OngoingCallNotification providesOngoingCallNotification(@NotNull OngoingCallNotificationImpl ongoingCallNotificationImpl) {
        ongoingCallNotificationImpl.getClass();
        return ongoingCallNotificationImpl;
    }

    @Provides
    @NotNull
    public final ProximitySensorProvider providesProximitySensorProvider(@NotNull ProximitySensorProviderImpl proximitySensorProviderImpl) {
        proximitySensorProviderImpl.getClass();
        return proximitySensorProviderImpl;
    }

    @Provides
    @NotNull
    public final StringHelper providesStringHelper(@NotNull StringHelperImpl stringHelperImpl) {
        stringHelperImpl.getClass();
        return stringHelperImpl;
    }

    @Provides
    @NotNull
    public final VibrationProvider providesVibrationProvider(@NotNull VibrationProviderImpl vibrationProviderImpl) {
        vibrationProviderImpl.getClass();
        return vibrationProviderImpl;
    }
}
