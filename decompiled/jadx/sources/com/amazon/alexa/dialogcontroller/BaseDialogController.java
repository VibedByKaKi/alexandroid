package com.amazon.alexa.dialogcontroller;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaAudioProviderConnection;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaConnectingFailedReason;
import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.AlexaProfile;
import com.amazon.alexa.api.AlexaWakeWord;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.audiocapturer.AudioCapturer;
import com.amazon.alexa.audiocapturer.AudioCapturerProvider;
import com.amazon.alexa.audiocapturer.RecordingRunnable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BaseDialogController implements DialogController {
    protected static final String TAG = "BaseDialogController";
    private AudioCapturer audioCapturer;
    private final AudioCapturerProvider audioCapturerProvider;
    private final ExecutorService callbacksExecutor;
    private final AtomicReference<StartDialogData> startDialogData = new AtomicReference<>();
    private final AtomicReference<Dialog> currentDialog = new AtomicReference<>();
    private final Set<DialogLifecycleCallbacks> lifecycleCallbacks = new CopyOnWriteArraySet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class AlexaConnectionListener implements AlexaAudioProviderConnection.ConnectionListener {
        public AlexaConnectionListener() {
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnected() {
            synchronized (BaseDialogController.this) {
                BaseDialogController.this.onConnected();
            }
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
            synchronized (BaseDialogController.this) {
                BaseDialogController.this.onConnectingFailed(alexaConnectingFailedReason, str);
            }
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onDisconnected() {
            synchronized (BaseDialogController.this) {
                BaseDialogController.this.onDisconnected();
            }
        }
    }

    public BaseDialogController(AudioCapturerProvider audioCapturerProvider, ExecutorService executorService) {
        this.audioCapturerProvider = audioCapturerProvider;
        this.callbacksExecutor = executorService;
    }

    private boolean isCurrentDialog(Dialog dialog) {
        return isInDialog() && getCurrentDialog().equals(dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
        Log.w(TAG, "onConnectingFailed. Reason: " + alexaConnectingFailedReason + " Message: " + str);
        this.startDialogData.set(null);
    }

    private void resetState() {
        Log.i(TAG, "reset state");
        stopRecording(getCurrentDialog());
        this.currentDialog.set(null);
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized void addLifecycleCallbacks(DialogLifecycleCallbacks dialogLifecycleCallbacks) {
        this.lifecycleCallbacks.add(dialogLifecycleCallbacks);
    }

    public abstract void connect();

    public abstract void continueDialog(Dialog dialog, AlexaAudioMetadata alexaAudioMetadata, AlexaAudioSink alexaAudioSink);

    @VisibleForTesting
    public AudioCapturer createAudioCapturer() {
        return this.audioCapturerProvider.getAudioCapturer();
    }

    @VisibleForTesting
    public AlexaAudioSink createAudioSink() throws IOException {
        return new AlexaAudioSink();
    }

    @VisibleForTesting
    public Dialog createNewDialog() {
        Dialog dialog = new Dialog(this);
        this.currentDialog.set(dialog);
        Log.i(TAG, "Created new dialog: " + dialog);
        return dialog;
    }

    public abstract void disconnect();

    public abstract void doRelease();

    @VisibleForTesting
    public synchronized boolean doStartDialog(StartDialogData startDialogData) {
        Log.i(TAG, "doStartDialog");
        startDialog(createNewDialog(), startDialogData);
        return true;
    }

    @VisibleForTesting
    public Dialog getCurrentDialog() {
        return this.currentDialog.get();
    }

    public abstract boolean isConnected();

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized boolean isInDialog() {
        return getCurrentDialog() != null;
    }

    public synchronized boolean isInTurn() {
        boolean z;
        if (isInDialog()) {
            z = getCurrentDialog().isInTurn();
        }
        return z;
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized boolean isInterruptable() {
        return !isInTurn();
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized boolean isMultiturn() {
        boolean z;
        if (isInDialog()) {
            z = getCurrentDialog().isMultiturn();
        }
        return z;
    }

    @VisibleForTesting
    public void onConnected() {
        Log.i(TAG, "onConnected");
        StartDialogData andSet = this.startDialogData.getAndSet(null);
        if (andSet != null) {
            doStartDialog(andSet);
        }
    }

    public synchronized void onDialogFinished(Dialog dialog) {
        if (isCurrentDialog(dialog)) {
            Log.i(TAG, "onDialogFinished");
            resetState();
            this.callbacksExecutor.execute(new Runnable() { // from class: com.amazon.alexa.dialogcontroller.BaseDialogController.5
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = BaseDialogController.this.lifecycleCallbacks.iterator();
                    while (it2.hasNext()) {
                        ((DialogLifecycleCallbacks) it2.next()).onDialogFinished();
                    }
                }
            });
        } else {
            Log.w(TAG, "got onDialogTurnStarted for the wrong dialog " + dialog + " ignoring");
        }
    }

    public synchronized void onDialogStarted(Dialog dialog) {
        if (isCurrentDialog(dialog)) {
            Log.i(TAG, "onDialogStarted");
            this.callbacksExecutor.execute(new Runnable() { // from class: com.amazon.alexa.dialogcontroller.BaseDialogController.4
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = BaseDialogController.this.lifecycleCallbacks.iterator();
                    while (it2.hasNext()) {
                        ((DialogLifecycleCallbacks) it2.next()).onDialogStarted();
                    }
                }
            });
            return;
        }
        Log.w(TAG, "got onDialogStarted for the wrong dialog " + dialog + " ignoring");
    }

    public synchronized void onDialogTurnFinished(Dialog dialog) {
        if (isCurrentDialog(dialog)) {
            Log.i(TAG, "onDialogTurnFinished");
            this.callbacksExecutor.execute(new Runnable() { // from class: com.amazon.alexa.dialogcontroller.BaseDialogController.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = BaseDialogController.this.lifecycleCallbacks.iterator();
                    while (it2.hasNext()) {
                        ((DialogLifecycleCallbacks) it2.next()).onDialogTurnFinished();
                    }
                }
            });
            return;
        }
        Log.w(TAG, "got onDialogTurnFinished for the wrong dialog " + dialog + " ignoring");
    }

    public synchronized void onDialogTurnStarted(Dialog dialog) {
        if (isCurrentDialog(dialog)) {
            Log.i(TAG, "onDialogTurnStarted");
            this.callbacksExecutor.execute(new Runnable() { // from class: com.amazon.alexa.dialogcontroller.BaseDialogController.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = BaseDialogController.this.lifecycleCallbacks.iterator();
                    while (it2.hasNext()) {
                        ((DialogLifecycleCallbacks) it2.next()).onDialogTurnStarted();
                    }
                }
            });
            return;
        }
        Log.w(TAG, "got onDialogTurnStarted for the wrong dialog " + dialog + " ignoring");
    }

    @VisibleForTesting
    public void onDisconnected() {
        Log.i(TAG, "onDisconnected");
        this.startDialogData.set(null);
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public final synchronized void release() {
        resetState();
        doRelease();
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized void removeLifecycleCallbacks(DialogLifecycleCallbacks dialogLifecycleCallbacks) {
        this.lifecycleCallbacks.remove(dialogLifecycleCallbacks);
    }

    public abstract void startDialog(Dialog dialog, StartDialogData startDialogData);

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized boolean startDialog(AlexaDialogExtras alexaDialogExtras, @Nullable AlexaAudioSink alexaAudioSink, @Nullable AlexaWakeWord alexaWakeWord) {
        try {
            String str = TAG;
            Log.i(str, "startDialog");
            if (isInDialog()) {
                stopDialogTurn(getCurrentDialog());
            }
            StartDialogData startDialogData = new StartDialogData(alexaDialogExtras, alexaAudioSink, new AlexaAudioMetadata(AlexaProfile.NEAR_FIELD, alexaWakeWord, RecordingRunnable.USER_SPEECH_AUDIO_FORMAT));
            if (isConnected()) {
                return doStartDialog(startDialogData);
            }
            Log.i(str, MissingTokenPull.TRIGGER_CONNECT);
            this.startDialogData.set(startDialogData);
            connect();
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startRecordingNextDialogTurn(Dialog dialog) {
        String str = TAG;
        Log.i(str, "startRecordingNextDialogTurn");
        if (!isCurrentDialog(dialog)) {
            Log.w(str, "got startRecordingNextDialogTurn for the wrong dialog " + dialog + " ignoring");
            return;
        }
        try {
            stopRecording(getCurrentDialog());
            this.audioCapturer = createAudioCapturer();
            AlexaAudioSink createAudioSink = createAudioSink();
            if (this.audioCapturer.startCapturing(createAudioSink)) {
                continueDialog(getCurrentDialog(), new AlexaAudioMetadata(AlexaProfile.NEAR_FIELD, RecordingRunnable.USER_SPEECH_AUDIO_FORMAT), createAudioSink);
            } else {
                Log.w(str, "Failed to start recording audio");
                createAudioSink.abandon();
            }
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage(), th);
        }
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized void stopCurrentDialogTurn() {
        Log.i(TAG, "stopCurrentDialogTurn");
        stopRecording(getCurrentDialog());
        if (isInTurn()) {
            stopDialogTurn(getCurrentDialog());
        }
    }

    public abstract void stopDialogTurn(Dialog dialog);

    public synchronized void stopRecording(Dialog dialog) {
        if (!isCurrentDialog(dialog)) {
            Log.w(TAG, "got stop recording for the wrong dialog " + dialog + " ignoring");
            return;
        }
        Log.i(TAG, "stopRecording");
        AudioCapturer audioCapturer = this.audioCapturer;
        if (audioCapturer != null) {
            audioCapturer.stopCapturing();
            this.audioCapturer = null;
        }
        this.callbacksExecutor.execute(new Runnable() { // from class: com.amazon.alexa.dialogcontroller.BaseDialogController.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = BaseDialogController.this.lifecycleCallbacks.iterator();
                while (it2.hasNext()) {
                    ((DialogLifecycleCallbacks) it2.next()).onStopRecording();
                }
            }
        });
    }

    @Override // com.amazon.alexa.dialogcontroller.DialogController
    public synchronized boolean startDialog(AlexaDialogExtras alexaDialogExtras) {
        Log.i(TAG, "startDialog via " + alexaDialogExtras.getInvocationType());
        stopRecording(getCurrentDialog());
        return startDialog(alexaDialogExtras, null, null);
    }
}
