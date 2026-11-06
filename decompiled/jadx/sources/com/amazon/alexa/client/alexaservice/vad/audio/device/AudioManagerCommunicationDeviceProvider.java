package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer$$ExternalSyntheticLambda5;
import com.amazon.alexa.client.alexaservice.vad.audio.device.BluetoothDeviceClassifier;
import com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
/* loaded from: classes17.dex */
public class AudioManagerCommunicationDeviceProvider implements CommunicationDeviceProvider {
    private static final long SCO_CONNECTION_TIMEOUT_SECONDS = 5;
    private static final String TAG = "AudioMgrCommDevProvider";
    private final AudioManager audioManager;

    @Nullable
    private final BluetoothAdapter bluetoothAdapter;

    @Nullable
    private AudioDeviceInfo capturedDevice;
    private final Context context;

    @Nullable
    private AudioManager$OnCommunicationDeviceChangedListener platformListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.vad.audio.device.AudioManagerCommunicationDeviceProvider$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$vad$audio$device$BluetoothDeviceClassifier$BtDeviceClassification;

        static {
            int[] iArr = new int[BluetoothDeviceClassifier.BtDeviceClassification.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$vad$audio$device$BluetoothDeviceClassifier$BtDeviceClassification = iArr;
            try {
                iArr[BluetoothDeviceClassifier.BtDeviceClassification.HEADSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$vad$audio$device$BluetoothDeviceClassifier$BtDeviceClassification[BluetoothDeviceClassifier.BtDeviceClassification.SPEAKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$vad$audio$device$BluetoothDeviceClassifier$BtDeviceClassification[BluetoothDeviceClassifier.BtDeviceClassification.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AudioManagerCommunicationDeviceProvider(@NonNull AudioManager audioManager, @Nullable BluetoothAdapter bluetoothAdapter, @NonNull Context context) {
        this.audioManager = audioManager;
        this.bluetoothAdapter = bluetoothAdapter;
        this.context = context;
    }

    @NonNull
    private CommunicationDeviceProvider.DeviceType mapDeviceType(@NonNull AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return CommunicationDeviceProvider.DeviceType.BUILTIN_SPEAKER;
        }
        if (type != 3 && type != 4) {
            if (type == 7) {
                int i = AnonymousClass2.$SwitchMap$com$amazon$alexa$client$alexaservice$vad$audio$device$BluetoothDeviceClassifier$BtDeviceClassification[BluetoothDeviceClassifier.classifyBtDevice(audioDeviceInfo, this.bluetoothAdapter).ordinal()];
                return i != 1 ? i != 2 ? CommunicationDeviceProvider.DeviceType.NONE : CommunicationDeviceProvider.DeviceType.BT_SCO_SPEAKER : CommunicationDeviceProvider.DeviceType.BT_SCO_HEADSET;
            }
            if (type != 11 && type != 22) {
                return CommunicationDeviceProvider.DeviceType.NONE;
            }
        }
        return CommunicationDeviceProvider.DeviceType.WIRED_HEADSET;
    }

    private boolean waitForScoConnection() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.amazon.alexa.client.alexaservice.vad.audio.device.AudioManagerCommunicationDeviceProvider.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra == 1) {
                    atomicBoolean.set(true);
                    countDownLatch.countDown();
                } else if (intExtra == -1) {
                    countDownLatch.countDown();
                }
            }
        };
        try {
            try {
                this.context.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
                if (this.audioManager.isBluetoothScoOn()) {
                    this.context.unregisterReceiver(broadcastReceiver);
                    return true;
                }
                long nanoTime = System.nanoTime();
                boolean await = countDownLatch.await(5L, TimeUnit.SECONDS);
                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                if (!atomicBoolean.get()) {
                    if (await) {
                        Log.e(TAG, "SCO connection reported ERROR after " + nanoTime2 + "ms");
                    } else {
                        Log.e(TAG, "SCO connection timed out after 5s (waited " + nanoTime2 + "ms)");
                    }
                }
                boolean z = atomicBoolean.get();
                this.context.unregisterReceiver(broadcastReceiver);
                return z;
            } catch (InterruptedException e) {
                Log.w(TAG, "Interrupted while waiting for SCO connection", e);
                Thread.currentThread().interrupt();
                this.context.unregisterReceiver(broadcastReceiver);
                return false;
            }
        } catch (Throwable th) {
            this.context.unregisterReceiver(broadcastReceiver);
            throw th;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public void captureState() {
        this.capturedDevice = this.audioManager.getCommunicationDevice();
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public void clearDevice() {
        this.audioManager.clearCommunicationDevice();
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    @NonNull
    public List<CommunicationDeviceProvider.DeviceType> getAvailableDevices() {
        List<AudioDeviceInfo> availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        ArrayList arrayList = new ArrayList();
        Iterator<AudioDeviceInfo> it2 = availableCommunicationDevices.iterator();
        while (it2.hasNext()) {
            CommunicationDeviceProvider.DeviceType mapDeviceType = mapDeviceType(it2.next());
            if (mapDeviceType != CommunicationDeviceProvider.DeviceType.NONE && !arrayList.contains(mapDeviceType)) {
                arrayList.add(mapDeviceType);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    @NonNull
    public CommunicationDeviceProvider.DeviceType getCurrentDevice() {
        AudioDeviceInfo communicationDevice = this.audioManager.getCommunicationDevice();
        return communicationDevice == null ? CommunicationDeviceProvider.DeviceType.NONE : mapDeviceType(communicationDevice);
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public void registerDeviceChangeListener(@NonNull CommunicationDeviceProvider.DeviceChangeListener deviceChangeListener, @NonNull Handler handler) {
        Objects.requireNonNull(handler);
        ConcurrencyHelpers$$ExternalSyntheticLambda0 concurrencyHelpers$$ExternalSyntheticLambda0 = new ConcurrencyHelpers$$ExternalSyntheticLambda0(handler);
        TranslationAudioPlayer$$ExternalSyntheticLambda5 translationAudioPlayer$$ExternalSyntheticLambda5 = new TranslationAudioPlayer$$ExternalSyntheticLambda5(deviceChangeListener, 2);
        this.platformListener = translationAudioPlayer$$ExternalSyntheticLambda5;
        this.audioManager.addOnCommunicationDeviceChangedListener(concurrencyHelpers$$ExternalSyntheticLambda0, translationAudioPlayer$$ExternalSyntheticLambda5);
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public void restoreDevice() {
        AudioDeviceInfo audioDeviceInfo = this.capturedDevice;
        AudioManager audioManager = this.audioManager;
        if (audioDeviceInfo != null) {
            audioManager.setCommunicationDevice(audioDeviceInfo);
        } else {
            audioManager.clearCommunicationDevice();
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public boolean selectDevice(@NonNull CommunicationDeviceProvider.DeviceType deviceType) {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getAvailableCommunicationDevices()) {
            if (mapDeviceType(audioDeviceInfo) == deviceType) {
                if (!this.audioManager.setCommunicationDevice(audioDeviceInfo)) {
                    return false;
                }
                if (deviceType == CommunicationDeviceProvider.DeviceType.BT_SCO_HEADSET) {
                    return waitForScoConnection();
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.device.CommunicationDeviceProvider
    public void unregisterDeviceChangeListener() {
        AudioManager$OnCommunicationDeviceChangedListener audioManager$OnCommunicationDeviceChangedListener = this.platformListener;
        if (audioManager$OnCommunicationDeviceChangedListener != null) {
            this.audioManager.removeOnCommunicationDeviceChangedListener(audioManager$OnCommunicationDeviceChangedListener);
            this.platformListener = null;
        }
    }
}
