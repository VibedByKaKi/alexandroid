package com.amazon.alexa.accessory.notificationpublisher.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.artifactmanager.VipFilterArtifactManager;
import com.amazon.alexa.accessory.notificationpublisher.audio.AudioFilePlayerTask;
import com.amazon.alexa.accessory.notificationpublisher.renderer.RenderManager;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.google.common.base.Strings;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AudioFilePlayer {
    private static final String TAG = "AudioFilePlayer";
    private static AudioFilePlayer audioFilePlayerInstance;
    private static Map<String, AudioPlaybackCompleteListener> audioPlaybackCompleteListeners = new ConcurrentHashMap();
    private AudioPlayerActionCompleteListener audioPlayerActionCompleteListener;
    private Map<String, Future<?>> audioRequestMap;
    private ExecutorService executorService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.notificationpublisher.audio.AudioFilePlayer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$audio$AudioFilePlayer$AudioPlayStatus;

        static {
            int[] iArr = new int[AudioPlayStatus.values().length];
            $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$audio$AudioFilePlayer$AudioPlayStatus = iArr;
            try {
                iArr[AudioPlayStatus.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$audio$AudioFilePlayer$AudioPlayStatus[AudioPlayStatus.Interrupted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$notificationpublisher$audio$AudioFilePlayer$AudioPlayStatus[AudioPlayStatus.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioPlayStatus {
        Completed,
        Interrupted,
        Error
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AudioPlaybackCompleteListener {
        void onAudioPlaybackCompleted(String str);

        void onAudioPlaybackError(String str);

        void onAudioPlaybackInterrupted(String str);
    }

    private AudioFilePlayer() {
    }

    public static synchronized AudioFilePlayer getInstance() {
        AudioFilePlayer audioFilePlayer;
        synchronized (AudioFilePlayer.class) {
            try {
                String str = TAG;
                Log.d(str, "getInstance called");
                if (audioFilePlayerInstance == null) {
                    Log.d(str, "getInstance - Creating new instance");
                    AudioFilePlayer audioFilePlayer2 = new AudioFilePlayer();
                    audioFilePlayerInstance = audioFilePlayer2;
                    audioFilePlayer2.audioRequestMap = new ConcurrentHashMap();
                    audioFilePlayerInstance.executorService = Executors.newCachedThreadPool();
                    audioFilePlayerInstance.audioPlayerActionCompleteListener = new AudioPlayerActionCompleteListener() { // from class: com.amazon.alexa.accessory.notificationpublisher.audio.AudioFilePlayer.1
                        @Override // com.amazon.alexa.accessory.notificationpublisher.audio.AudioPlayerActionCompleteListener
                        public void audioPlayerComplete(AudioPlayStatus audioPlayStatus, String str2) {
                            Log.d(AudioFilePlayer.TAG, "audioPlayerComplete - Completed request ID " + str2 + " with status " + audioPlayStatus);
                            AudioFilePlayer.audioFilePlayerInstance.audioRequestMap.remove(str2);
                            if (AudioFilePlayer.audioPlaybackCompleteListeners.containsKey(str2)) {
                                Log.d(AudioFilePlayer.TAG, "Listener attached for requestId: " + str2 + " status: " + audioPlayStatus);
                                AudioPlaybackCompleteListener audioPlaybackCompleteListener = (AudioPlaybackCompleteListener) AudioFilePlayer.audioPlaybackCompleteListeners.get(str2);
                                int i = AnonymousClass2.$SwitchMap$com$amazon$alexa$accessory$notificationpublisher$audio$AudioFilePlayer$AudioPlayStatus[audioPlayStatus.ordinal()];
                                if (i == 1) {
                                    audioPlaybackCompleteListener.onAudioPlaybackCompleted(str2);
                                } else if (i == 2) {
                                    audioPlaybackCompleteListener.onAudioPlaybackInterrupted(str2);
                                } else if (i != 3) {
                                    Log.w(AudioFilePlayer.TAG, "Invalid audio play status " + audioPlayStatus);
                                } else {
                                    audioPlaybackCompleteListener.onAudioPlaybackError(str2);
                                }
                                AudioFilePlayer.audioPlaybackCompleteListeners.remove(str2);
                            }
                        }
                    };
                }
                audioFilePlayer = audioFilePlayerInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return audioFilePlayer;
    }

    public static synchronized void releaseInstance() {
        synchronized (AudioFilePlayer.class) {
            Log.d(TAG, "releaseInstance called");
            AudioFilePlayer audioFilePlayer = audioFilePlayerInstance;
            if (audioFilePlayer != null) {
                audioFilePlayer.stopAllAudio();
                audioFilePlayerInstance.audioRequestMap.clear();
                audioFilePlayerInstance.audioRequestMap = null;
                audioPlaybackCompleteListeners.clear();
                AudioFilePlayer audioFilePlayer2 = audioFilePlayerInstance;
                audioFilePlayer2.audioPlayerActionCompleteListener = null;
                audioFilePlayer2.executorService.shutdown();
                audioFilePlayerInstance = null;
            }
        }
    }

    @VisibleForTesting
    public Map<String, AudioPlaybackCompleteListener> getAudioPlaybackCompleteListeners() {
        return audioPlaybackCompleteListeners;
    }

    @VisibleForTesting
    public AudioPlayerActionCompleteListener getAudioPlayerActionCompleteListener() {
        return this.audioPlayerActionCompleteListener;
    }

    @VisibleForTesting
    public Map<String, Future<?>> getAudioRequestMap() {
        return this.audioRequestMap;
    }

    public String getRandomRequestId() {
        return UUID.randomUUID().toString();
    }

    public boolean playAudioAsset(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable AudioPlaybackCompleteListener audioPlaybackCompleteListener) {
        if (Strings.isNullOrEmpty(str)) {
            Log.e(TAG, "playAudioAsset - Asset path and name is empty or null. Cannot play audio asset");
            return false;
        }
        Log.d(TAG, "playAudioAsset " + str);
        if (!str.startsWith("/assets/")) {
            str = "/assets//".concat(str);
        }
        return playAudioFile(context, VipFilterArtifactManager.getInstance(context).getDownloadedFilePath(str), str2, audioPlaybackCompleteListener);
    }

    public boolean playAudioFile(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable AudioPlaybackCompleteListener audioPlaybackCompleteListener) {
        String str3 = TAG;
        Log.d(str3, "playAudioFile - fullyQualifiedFilePath: %s", str);
        if (context == null) {
            Log.e(str3, "playAudioFile - Context is null. Cannot play audio file");
            return false;
        }
        if (Strings.isNullOrEmpty(str)) {
            Log.e(str3, "playAudioFile - file path is empty or null. Cannot play audio file");
            return false;
        }
        if (!str.startsWith("/assets/") && !new File(str).exists()) {
            Log.e(str3, "playAudioFile - Audio file does not exist. Cannot play the file.");
            return false;
        }
        if (Strings.isNullOrEmpty(str2)) {
            Log.d(str3, "playAudioFile - Request ID is null or empty. Create a random request ID");
            str2 = getRandomRequestId();
        }
        if (!this.audioRequestMap.isEmpty() && (Objects.equals(str2, RenderManager.REPLY_PROMPT_FOR_RECORDING_UUID) || Objects.equals(str2, RenderManager.REPLY_CANCELED_INSTRUCTION_UUID))) {
            Log.d(str3, "playAudioFile - Found pending reply audio request(s). Clearing all pending audio tasks.");
            stopAllAudio();
        }
        if (audioPlaybackCompleteListener != null) {
            try {
                audioPlaybackCompleteListeners.put(str2, audioPlaybackCompleteListener);
            } catch (Exception e) {
                Log.e(TAG, "playAudioFile - Exception when playing audio file.", e);
                return false;
            }
        }
        this.audioRequestMap.put(str2, this.executorService.submit(new AudioFilePlayerTask.Builder().context(context).audioFilePath(str).requestId(str2).audioPlayerActionCompleteListener(this.audioPlayerActionCompleteListener).build()));
        return true;
    }

    public void removeAudioPlaybackCompleteListener(@NonNull String str) {
        if (audioPlaybackCompleteListeners.containsKey(str)) {
            audioPlaybackCompleteListeners.remove(str);
        }
    }

    @VisibleForTesting
    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void stopAllAudio() {
        Log.d(TAG, "stopAllAudio");
        Iterator<Future<?>> it2 = this.audioRequestMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().cancel(true);
        }
    }

    public void stopAudioPlayback(@NonNull String str) {
        String str2 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("stopAudioPlayback - requestId: ", str, " audioRequestMap: ");
        m2m.append(this.audioRequestMap.keySet());
        Log.d(str2, m2m.toString());
        if (Strings.isNullOrEmpty(str) || !this.audioRequestMap.containsKey(str)) {
            return;
        }
        Log.d(str2, "stopAudioPlayback - requestId: " + str + " cancelled: " + this.audioRequestMap.get(str).cancel(true));
    }

    public boolean playAudioAsset(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        return playAudioAsset(context, str, str2, null);
    }
}
