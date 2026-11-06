package com.amazon.comms.calling.infrastructure.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.accessoryclient.common.util.MetricsConstants;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.dependency.DaggerWrapper;
import com.amazon.comms.calling.domain.model.AudioRoutes;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.deecomms.calling.api.enums.CallState;
import defpackage.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u000201B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020)H\u0002J\u0006\u0010/\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010+\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper;", "", "context", "Landroid/content/Context;", "audioManagementOrchestrator", "Lcom/amazon/comms/calling/infrastructure/audio/AudioManagementOrchestrator;", "audioRouteChangeObservable", "Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "<init>", "(Landroid/content/Context;Lcom/amazon/comms/calling/infrastructure/audio/AudioManagementOrchestrator;Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;Lcom/amazon/comms/calling/domain/repo/CallStateRepository;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothHeadset", "Landroid/bluetooth/BluetoothHeadset;", "bluetoothReceiverConnection", "Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper$BluetoothReceiverConnection;", "speakerStateReceiver", "Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper$SpeakerStateReceiver;", "started", "", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "getUtils", "()Lcom/amazon/comms/calling/data/util/Utils;", "setUtils", "(Lcom/amazon/comms/calling/data/util/Utils;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "start", "", "requestBluetoothHeadSetProxy", "isBluetoothAvailable", "()Z", "useBluetoothHeadset", "stopUsingBluetoothHeadset", "stop", "BluetoothReceiverConnection", "SpeakerStateReceiver", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class BluetoothHeadsetHelper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(BluetoothHeadsetHelper.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final AudioManagementOrchestrator audioManagementOrchestrator;

    @Inject
    public AudioManager audioManager;

    @NotNull
    private final AudioRouteChangeObservable audioRouteChangeObservable;

    @Nullable
    private final BluetoothAdapter bluetoothAdapter;

    @Nullable
    private BluetoothHeadset bluetoothHeadset;
    private BluetoothReceiverConnection bluetoothReceiverConnection;

    @NotNull
    private CallStateRepository callStateRepository;

    @NotNull
    private final Context context;
    private SpeakerStateReceiver speakerStateReceiver;
    private boolean started;

    @Inject
    public Utils utils;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper$BluetoothReceiverConnection;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @VisibleForTesting(otherwise = 2)
    public final class BluetoothReceiverConnection extends BroadcastReceiver {
        public BluetoothReceiverConnection() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
            if (Intrinsics.areEqual("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", intent.getAction())) {
                boolean isBluetoothAvailable = BluetoothHeadsetHelper.this.isBluetoothAvailable();
                BluetoothHeadsetHelper bluetoothHeadsetHelper = BluetoothHeadsetHelper.this;
                if (!isBluetoothAvailable) {
                    if (bluetoothHeadsetHelper.getAudioManager().isBluetoothScoOn()) {
                        BluetoothHeadsetHelper.this.stopUsingBluetoothHeadset();
                    }
                } else {
                    if (bluetoothHeadsetHelper.getAudioManager().isBluetoothScoOn()) {
                        return;
                    }
                    if (BluetoothHeadsetHelper.this.getUtils().isMarshMallowAndAbove() || BluetoothHeadsetHelper.this.callStateRepository.getCallState() != CallState.ACTIVE) {
                        BluetoothHeadsetHelper.this.useBluetoothHeadset();
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0085\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper$SpeakerStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/amazon/comms/calling/infrastructure/audio/BluetoothHeadsetHelper;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @VisibleForTesting(otherwise = 2)
    public final class SpeakerStateReceiver extends BroadcastReceiver {
        public SpeakerStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
            if (Intrinsics.areEqual("android.intent.action.HEADSET_PLUG", intent.getAction())) {
                boolean isSpeakerphoneOn = BluetoothHeadsetHelper.this.getAudioManager().isSpeakerphoneOn();
                BluetoothHeadsetHelper bluetoothHeadsetHelper = BluetoothHeadsetHelper.this;
                if (isSpeakerphoneOn) {
                    if (bluetoothHeadsetHelper.getAudioManager().isBluetoothScoOn()) {
                        BluetoothHeadsetHelper.this.stopUsingBluetoothHeadset();
                    }
                } else if (bluetoothHeadsetHelper.isBluetoothAvailable()) {
                    BluetoothHeadsetHelper.this.useBluetoothHeadset();
                }
            }
        }
    }

    @Inject
    public BluetoothHeadsetHelper(@NotNull Context context, @NotNull AudioManagementOrchestrator audioManagementOrchestrator, @NotNull AudioRouteChangeObservable audioRouteChangeObservable, @NotNull CallStateRepository callStateRepository) {
        context.getClass();
        audioManagementOrchestrator.getClass();
        audioRouteChangeObservable.getClass();
        callStateRepository.getClass();
        this.context = context;
        this.audioManagementOrchestrator = audioManagementOrchestrator;
        this.audioRouteChangeObservable = audioRouteChangeObservable;
        this.callStateRepository = callStateRepository;
        this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        this.LOG = new CallingLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBluetoothAvailable() {
        List<BluetoothDevice> connectedDevices;
        if (!getUtils().isFireOS5()) {
            BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
            if ((bluetoothHeadset == null || (connectedDevices = bluetoothHeadset.getConnectedDevices()) == null) ? false : !connectedDevices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void requestBluetoothHeadSetProxy() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.getProfileProxy(this.context, new BluetoothProfile.ServiceListener() { // from class: com.amazon.comms.calling.infrastructure.audio.BluetoothHeadsetHelper$requestBluetoothHeadSetProxy$1
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int profile, BluetoothProfile proxy) {
                    CommsLogger log;
                    proxy.getClass();
                    log = BluetoothHeadsetHelper.this.getLOG();
                    log.i("onServiceConnected");
                    if (profile == 1) {
                        BluetoothHeadsetHelper.this.bluetoothHeadset = (BluetoothHeadset) proxy;
                        if (BluetoothHeadsetHelper.this.isBluetoothAvailable()) {
                            BluetoothHeadsetHelper.this.useBluetoothHeadset();
                        }
                    }
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int profile) {
                    CommsLogger log;
                    log = BluetoothHeadsetHelper.this.getLOG();
                    log.i(MetricsConstants.CLIENT_CONNECTION_ON_SERVICE_DISCONNECTED);
                    if (profile == 1) {
                        BluetoothHeadsetHelper.this.bluetoothHeadset = null;
                    }
                }
            }, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopUsingBluetoothHeadset() {
        getLOG().i("Stop using bluetooth headset");
        getAudioManager().stopBluetoothSco();
        getAudioManager().setBluetoothScoOn(false);
        this.audioRouteChangeObservable.onAudioRouteChanged(AudioRoutes.EARPIECE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useBluetoothHeadset() {
        getLOG().i("Using bluetooth headset via Legacy flow");
        getAudioManager().setMode(0);
        getLOG().i("Audio mode is set to normal");
        getAudioManager().startBluetoothSco();
        getAudioManager().setBluetoothScoOn(true);
        getAudioManager().setSpeakerphoneOn(false);
        CredentialConfig$$ExternalSyntheticOutline0.m("Tried to turn speakerphone false; speakerphone was set to ", getAudioManager().isSpeakerphoneOn(), getLOG());
        this.audioManagementOrchestrator.setupAudio();
        this.audioRouteChangeObservable.onAudioRouteChanged(AudioRoutes.BLUETOOTH);
    }

    @NotNull
    public final AudioManager getAudioManager() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            return audioManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioManager");
        return null;
    }

    @NotNull
    public final Utils getUtils() {
        Utils utils = this.utils;
        if (utils != null) {
            return utils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("utils");
        return null;
    }

    public final void setAudioManager(@NotNull AudioManager audioManager) {
        audioManager.getClass();
        this.audioManager = audioManager;
    }

    public final void setUtils(@NotNull Utils utils) {
        utils.getClass();
        this.utils = utils;
    }

    public final synchronized void start() {
        try {
            DaggerWrapper.INSTANCE.getComponent().inject(this);
            if (this.started || this.bluetoothAdapter == null) {
                return;
            }
            requestBluetoothHeadSetProxy();
            BluetoothReceiverConnection bluetoothReceiverConnection = new BluetoothReceiverConnection();
            this.bluetoothReceiverConnection = bluetoothReceiverConnection;
            int i = Build.VERSION.SDK_INT;
            Context context = this.context;
            if (i >= 34) {
                context.registerReceiver(bluetoothReceiverConnection, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"), 2);
            } else {
                context.registerReceiver(bluetoothReceiverConnection, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            }
            this.speakerStateReceiver = new SpeakerStateReceiver();
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.context);
            SpeakerStateReceiver speakerStateReceiver = this.speakerStateReceiver;
            if (speakerStateReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("speakerStateReceiver");
                speakerStateReceiver = null;
            }
            localBroadcastManager.registerReceiver(speakerStateReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.started = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void stop() {
        try {
            if (this.started) {
                try {
                    Context context = this.context;
                    BluetoothReceiverConnection bluetoothReceiverConnection = this.bluetoothReceiverConnection;
                    if (bluetoothReceiverConnection == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bluetoothReceiverConnection");
                        bluetoothReceiverConnection = null;
                    }
                    context.unregisterReceiver(bluetoothReceiverConnection);
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.context);
                    SpeakerStateReceiver speakerStateReceiver = this.speakerStateReceiver;
                    if (speakerStateReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("speakerStateReceiver");
                        speakerStateReceiver = null;
                    }
                    localBroadcastManager.unregisterReceiver(speakerStateReceiver);
                } catch (IllegalArgumentException unused) {
                    getLOG().e("Already unregistered");
                }
                if (getAudioManager().isBluetoothScoOn()) {
                    getAudioManager().setBluetoothScoOn(false);
                    getAudioManager().stopBluetoothSco();
                }
                BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
                if (bluetoothHeadset != null) {
                    BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
                    if (bluetoothAdapter != null) {
                        bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
                    }
                    this.bluetoothHeadset = null;
                }
                this.started = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
