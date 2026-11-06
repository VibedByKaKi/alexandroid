package com.amazon.alexa.accessory.frames.translation.audio;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.benefits.helpers.NetworkHelper$$ExternalSyntheticLambda0;
import com.amazon.dee.app.ui.video.VideoActivity$$ExternalSyntheticLambda0;
import com.amazon.dee.app.util.DeviceCapabilityUtil$$ExternalSyntheticLambda0;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda0;
import com.amazon.deecomms.media.audio.AudioPlayer$$ExternalSyntheticLambda1;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0003QRSB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J\u0018\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J\u000e\u00104\u001a\u00020\r2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020\u001fJ\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020&H\u0002J\u0006\u0010:\u001a\u00020\u001fJ\u0006\u0010;\u001a\u00020\u001fJ\u000e\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\rJ\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u0007H\u0002J\b\u0010B\u001a\u00020\u001fH\u0002J\b\u0010C\u001a\u00020\u001fH\u0002J\u0010\u0010D\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u0007H\u0002J\b\u0010E\u001a\u00020\u001fH\u0002J\b\u0010F\u001a\u00020\u001fH\u0002J\u0012\u0010G\u001a\u00020\r2\b\b\u0002\u00100\u001a\u000201H\u0002J\b\u0010H\u001a\u00020\u001fH\u0002J\b\u0010I\u001a\u00020\u001fH\u0002J(\u0010J\u001a\u0002062\u0006\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002J\b\u0010P\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u00188@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001f\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006T"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "audioTrack", "Landroid/media/AudioTrack;", "audioManager", "Landroid/media/AudioManager;", "forcedSpeaker", "", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "mainHandler", "Landroid/os/Handler;", "pendingStart", "Ljava/lang/Runnable;", "communicationDeviceListener", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "isDucked", "currentVolume", "", "getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release$annotations", "()V", "getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release", "()F", "onPlaybackCompleted", "Lkotlin/Function0;", "", "getOnPlaybackCompleted", "()Lkotlin/jvm/functions/Function0;", "setOnPlaybackCompleted", "(Lkotlin/jvm/functions/Function0;)V", "onPlaybackError", "Lkotlin/Function1;", "Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer$PlaybackErrorType;", "getOnPlaybackError", "()Lkotlin/jvm/functions/Function1;", "setOnPlaybackError", "(Lkotlin/jvm/functions/Function1;)V", "focusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "playFromAssets", "assetFileName", "", "route", "Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer$OutputRoute;", "playFromFile", "filePath", "playFromBytes", "audioData", "", "stop", "interruptPlayback", "errorType", "pause", "resume", "setDucked", "ducked", "isPlaying", "()Z", "stopIfPlaying", "player", "releasePlayer", "releaseAudioTrack", "startWhenSpeakerRouted", "cancelPendingStart", "forceSpeakerOutput", "requestAudioFocus", "abandonAudioFocus", "resetSpeakerState", "wrapWithWavHeader", "pcmData", "sampleRate", "", "bitsPerSample", "channels", "cleanupOrphanedTempFiles", "Companion", "OutputRoute", "PlaybackErrorType", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranslationAudioPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslationAudioPlayer.kt\ncom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,657:1\n1#2:658\n295#3,2:659\n13805#4,2:661\n*S KotlinDebug\n*F\n+ 1 TranslationAudioPlayer.kt\ncom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer\n*L\n539#1:659,2\n648#1:661,2\n*E\n"})
/* loaded from: classes15.dex */
public final class TranslationAudioPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float DUCKED_VOLUME = 0.5f;
    public static final float NORMAL_VOLUME = 1.0f;
    private static final int PCM_BITS_PER_SAMPLE = 16;
    private static final int PCM_CHANNELS = 1;
    private static final int PCM_SAMPLE_RATE = 24000;
    public static final long SPEAKER_ROUTE_TIMEOUT_MS = 500;

    @NotNull
    private static final String TAG = "TranslationAudioPlayer";

    @Nullable
    private AudioFocusRequest audioFocusRequest;

    @Nullable
    private AudioManager audioManager;

    @Nullable
    private AudioTrack audioTrack;

    @Nullable
    private AudioManager$OnCommunicationDeviceChangedListener communicationDeviceListener;

    @NotNull
    private final Context context;

    @NotNull
    private final AudioManager.OnAudioFocusChangeListener focusChangeListener;
    private boolean forcedSpeaker;
    private volatile boolean isDucked;

    @NotNull
    private final Handler mainHandler;

    @Nullable
    private MediaPlayer mediaPlayer;

    @Nullable
    private Function0<Unit> onPlaybackCompleted;

    @Nullable
    private Function1<? super PlaybackErrorType, Unit> onPlaybackError;

    @Nullable
    private Runnable pendingStart;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer$OutputRoute;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE_SPEAKER", "BLUETOOTH_A2DP", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputRoute {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OutputRoute[] $VALUES;
        public static final OutputRoute PHONE_SPEAKER = new OutputRoute("PHONE_SPEAKER", 0);
        public static final OutputRoute BLUETOOTH_A2DP = new OutputRoute("BLUETOOTH_A2DP", 1);

        private static final /* synthetic */ OutputRoute[] $values() {
            return new OutputRoute[]{PHONE_SPEAKER, BLUETOOTH_A2DP};
        }

        static {
            OutputRoute[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private OutputRoute(String str, int i) {
        }

        @NotNull
        public static EnumEntries<OutputRoute> getEntries() {
            return $ENTRIES;
        }

        public static OutputRoute valueOf(String str) {
            return (OutputRoute) Enum.valueOf(OutputRoute.class, str);
        }

        public static OutputRoute[] values() {
            return (OutputRoute[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer$PlaybackErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC", "DECODE", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PlaybackErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PlaybackErrorType[] $VALUES;
        public static final PlaybackErrorType GENERIC = new PlaybackErrorType("GENERIC", 0);
        public static final PlaybackErrorType DECODE = new PlaybackErrorType("DECODE", 1);

        private static final /* synthetic */ PlaybackErrorType[] $values() {
            return new PlaybackErrorType[]{GENERIC, DECODE};
        }

        static {
            PlaybackErrorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private PlaybackErrorType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<PlaybackErrorType> getEntries() {
            return $ENTRIES;
        }

        public static PlaybackErrorType valueOf(String str) {
            return (PlaybackErrorType) Enum.valueOf(PlaybackErrorType.class, str);
        }

        public static PlaybackErrorType[] values() {
            return (PlaybackErrorType[]) $VALUES.clone();
        }
    }

    public TranslationAudioPlayer(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.mainHandler = new Handler(Looper.getMainLooper());
        cleanupOrphanedTempFiles();
        this.focusChangeListener = new AudioPlayer$$ExternalSyntheticLambda1(this, 3);
    }

    private final void abandonAudioFocus() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null && (audioManager = this.audioManager) != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.audioFocusRequest = null;
    }

    private final void cancelPendingStart() {
        AudioManager$OnCommunicationDeviceChangedListener audioManager$OnCommunicationDeviceChangedListener;
        AudioManager audioManager;
        Runnable runnable = this.pendingStart;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.pendingStart = null;
        if (Build.VERSION.SDK_INT >= 31 && (audioManager$OnCommunicationDeviceChangedListener = this.communicationDeviceListener) != null && (audioManager = this.audioManager) != null) {
            audioManager.removeOnCommunicationDeviceChangedListener(audioManager$OnCommunicationDeviceChangedListener);
        }
        this.communicationDeviceListener = null;
    }

    private final void cleanupOrphanedTempFiles() {
        try {
            File[] listFiles = this.context.getCacheDir().listFiles(new DeviceCapabilityUtil$$ExternalSyntheticLambda0(1));
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                    Log.d(TAG, "Cleaned up orphaned temp file: " + file.getName());
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "Failed to cleanup orphaned temp files: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleanupOrphanedTempFiles$lambda$20(File file) {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean endsWith$default;
        boolean endsWith$default2;
        String name = file.getName();
        name.getClass();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "bystander_audio_", false, 2, null);
        if (startsWith$default) {
            String name2 = file.getName();
            name2.getClass();
            endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(name2, ".pcm", false, 2, null);
            if (endsWith$default2) {
                return true;
            }
        }
        String name3 = file.getName();
        name3.getClass();
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name3, "translation_wav_", false, 2, null);
        if (!startsWith$default2) {
            return false;
        }
        String name4 = file.getName();
        name4.getClass();
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(name4, ".wav", false, 2, null);
        return endsWith$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusChangeListener$lambda$0(TranslationAudioPlayer translationAudioPlayer, int i) {
        Log.d(TAG, "Audio focus changed: " + i);
        if (i == -2) {
            translationAudioPlayer.pause();
        } else if (i == -1) {
            translationAudioPlayer.interruptPlayback(PlaybackErrorType.GENERIC);
        } else {
            if (i != 1) {
                return;
            }
            translationAudioPlayer.resume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void forceSpeakerOutput() {
        AudioManager audioManager;
        List<AudioDeviceInfo> availableCommunicationDevices;
        int i = Build.VERSION.SDK_INT;
        AudioManager audioManager2 = this.audioManager;
        if (i < 31) {
            if (audioManager2 != null) {
                audioManager2.setMode(3);
            }
            AudioManager audioManager3 = this.audioManager;
            if (audioManager3 != null) {
                audioManager3.setSpeakerphoneOn(true);
                return;
            }
            return;
        }
        AudioDeviceInfo audioDeviceInfo = null;
        if (audioManager2 != null && (availableCommunicationDevices = audioManager2.getAvailableCommunicationDevices()) != null) {
            Iterator<T> it2 = availableCommunicationDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((AudioDeviceInfo) next).getType() == 2) {
                    audioDeviceInfo = next;
                    break;
                }
            }
            audioDeviceInfo = audioDeviceInfo;
        }
        if (audioDeviceInfo == null || (audioManager = this.audioManager) == null) {
            return;
        }
        audioManager.setCommunicationDevice(audioDeviceInfo);
    }

    private final void interruptPlayback(PlaybackErrorType errorType) {
        stop();
        Function1<? super PlaybackErrorType, Unit> function1 = this.onPlaybackError;
        if (function1 != null) {
            function1.invoke(errorType);
        }
        Function0<Unit> function0 = this.onPlaybackCompleted;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ boolean playFromAssets$default(TranslationAudioPlayer translationAudioPlayer, String str, OutputRoute outputRoute, int i, Object obj) {
        if ((i & 2) != 0) {
            outputRoute = OutputRoute.PHONE_SPEAKER;
        }
        return translationAudioPlayer.playFromAssets(str, outputRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFromAssets$lambda$2(TranslationAudioPlayer translationAudioPlayer, MediaPlayer mediaPlayer) {
        Log.i(TAG, "Playback completed");
        translationAudioPlayer.releasePlayer();
        Function0<Unit> function0 = translationAudioPlayer.onPlaybackCompleted;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playFromAssets$lambda$3(TranslationAudioPlayer translationAudioPlayer, MediaPlayer mediaPlayer, int i, int i2) {
        Log.e(TAG, "MediaPlayer error: what=%d, extra=%d", Integer.valueOf(i), Integer.valueOf(i2));
        translationAudioPlayer.releasePlayer();
        Function1<? super PlaybackErrorType, Unit> function1 = translationAudioPlayer.onPlaybackError;
        if (function1 != null) {
            function1.invoke(PlaybackErrorType.DECODE);
        }
        Function0<Unit> function0 = translationAudioPlayer.onPlaybackCompleted;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public static /* synthetic */ boolean playFromFile$default(TranslationAudioPlayer translationAudioPlayer, String str, OutputRoute outputRoute, int i, Object obj) {
        if ((i & 2) != 0) {
            outputRoute = OutputRoute.PHONE_SPEAKER;
        }
        return translationAudioPlayer.playFromFile(str, outputRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFromFile$lambda$4(TranslationAudioPlayer translationAudioPlayer, File file, MediaPlayer mediaPlayer) {
        Log.i(TAG, "Playback completed (file)");
        translationAudioPlayer.releasePlayer();
        file.delete();
        Function0<Unit> function0 = translationAudioPlayer.onPlaybackCompleted;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playFromFile$lambda$5(TranslationAudioPlayer translationAudioPlayer, File file, MediaPlayer mediaPlayer, int i, int i2) {
        Log.e(TAG, "MediaPlayer error (file): what=%d, extra=%d", Integer.valueOf(i), Integer.valueOf(i2));
        translationAudioPlayer.releasePlayer();
        file.delete();
        Function1<? super PlaybackErrorType, Unit> function1 = translationAudioPlayer.onPlaybackError;
        if (function1 != null) {
            function1.invoke(PlaybackErrorType.DECODE);
        }
        Function0<Unit> function0 = translationAudioPlayer.onPlaybackCompleted;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void releaseAudioTrack() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return;
        }
        this.audioTrack = null;
        try {
            audioTrack.stop();
        } catch (IllegalStateException e) {
            Log.w(TAG, "AudioTrack in invalid state during stop: %s", e.getMessage());
        }
        audioTrack.release();
        abandonAudioFocus();
    }

    private final void releasePlayer() {
        cancelPendingStart();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            stopIfPlaying(mediaPlayer);
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
        abandonAudioFocus();
        resetSpeakerState();
    }

    private final boolean requestAudioFocus(OutputRoute route) {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return false;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(route == OutputRoute.PHONE_SPEAKER ? 2 : 1).setContentType(1).build()).setOnAudioFocusChangeListener(this.focusChangeListener).build();
        this.audioFocusRequest = build;
        return audioManager.requestAudioFocus(build) == 1;
    }

    public static /* synthetic */ boolean requestAudioFocus$default(TranslationAudioPlayer translationAudioPlayer, OutputRoute outputRoute, int i, Object obj) {
        if ((i & 1) != 0) {
            outputRoute = OutputRoute.PHONE_SPEAKER;
        }
        return translationAudioPlayer.requestAudioFocus(outputRoute);
    }

    private final void resetSpeakerState() {
        if (this.forcedSpeaker) {
            int i = Build.VERSION.SDK_INT;
            AudioManager audioManager = this.audioManager;
            if (i < 31) {
                if (audioManager != null) {
                    audioManager.setSpeakerphoneOn(false);
                }
                AudioManager audioManager2 = this.audioManager;
                if (audioManager2 != null) {
                    audioManager2.setMode(0);
                }
            } else if (audioManager != null) {
                audioManager.clearCommunicationDevice();
            }
            this.forcedSpeaker = false;
        }
        this.audioManager = null;
    }

    private final void startWhenSpeakerRouted(MediaPlayer player) {
        AudioDeviceInfo communicationDevice;
        AudioManager audioManager = this.audioManager;
        if (!this.forcedSpeaker || Build.VERSION.SDK_INT < 31 || audioManager == null || ((communicationDevice = audioManager.getCommunicationDevice()) != null && communicationDevice.getType() == 2)) {
            player.start();
            return;
        }
        Log.i(TAG, "Waiting for speaker communication route before starting playback");
        NetworkHelper$$ExternalSyntheticLambda0 networkHelper$$ExternalSyntheticLambda0 = new NetworkHelper$$ExternalSyntheticLambda0(this, player, 6);
        TranslationAudioPlayer$$ExternalSyntheticLambda5 translationAudioPlayer$$ExternalSyntheticLambda5 = new TranslationAudioPlayer$$ExternalSyntheticLambda5(networkHelper$$ExternalSyntheticLambda0, 0);
        this.pendingStart = networkHelper$$ExternalSyntheticLambda0;
        this.communicationDeviceListener = translationAudioPlayer$$ExternalSyntheticLambda5;
        audioManager.addOnCommunicationDeviceChangedListener(new PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2(this, 2), translationAudioPlayer$$ExternalSyntheticLambda5);
        this.mainHandler.postDelayed(networkHelper$$ExternalSyntheticLambda0, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWhenSpeakerRouted$lambda$11(TranslationAudioPlayer translationAudioPlayer, MediaPlayer mediaPlayer) {
        translationAudioPlayer.cancelPendingStart();
        if (translationAudioPlayer.mediaPlayer != mediaPlayer) {
            return;
        }
        try {
            mediaPlayer.start();
        } catch (IllegalStateException e) {
            Log.w(TAG, "Cannot start — player in invalid state: %s", e.getMessage());
            translationAudioPlayer.releasePlayer();
            Function1<? super PlaybackErrorType, Unit> function1 = translationAudioPlayer.onPlaybackError;
            if (function1 != null) {
                function1.invoke(PlaybackErrorType.GENERIC);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWhenSpeakerRouted$lambda$12(Runnable runnable, AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null || audioDeviceInfo.getType() != 2) {
            return;
        }
        Log.i(TAG, "Speaker communication route active");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWhenSpeakerRouted$lambda$13(TranslationAudioPlayer translationAudioPlayer, Runnable runnable) {
        translationAudioPlayer.mainHandler.post(runnable);
    }

    private final void stopIfPlaying(MediaPlayer player) {
        try {
            if (player.isPlaying()) {
                player.stop();
            }
        } catch (IllegalStateException e) {
            Log.w(TAG, "MediaPlayer in error state during stop: %s", e.getMessage());
        }
    }

    private final byte[] wrapWithWavHeader(byte[] pcmData, int sampleRate, int bitsPerSample, int channels) {
        int length = pcmData.length;
        ByteBuffer order = ByteBuffer.allocate(44).order(ByteOrder.LITTLE_ENDIAN);
        Charset charset = Charsets.US_ASCII;
        byte[] bytes = "RIFF".getBytes(charset);
        bytes.getClass();
        order.put(bytes);
        order.putInt(length + 36);
        byte[] bytes2 = "WAVE".getBytes(charset);
        bytes2.getClass();
        order.put(bytes2);
        byte[] bytes3 = "fmt ".getBytes(charset);
        bytes3.getClass();
        order.put(bytes3);
        order.putInt(16);
        order.putShort((short) 1);
        order.putShort((short) channels);
        order.putInt(sampleRate);
        order.putInt(((sampleRate * channels) * bitsPerSample) / 8);
        order.putShort((short) ((channels * bitsPerSample) / 8));
        order.putShort((short) bitsPerSample);
        byte[] bytes4 = "data".getBytes(charset);
        bytes4.getClass();
        order.put(bytes4);
        order.putInt(length);
        byte[] array = order.array();
        array.getClass();
        return ArraysKt.plus(array, pcmData);
    }

    public final float getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release() {
        return this.isDucked ? 0.5f : 1.0f;
    }

    @Nullable
    public final Function0<Unit> getOnPlaybackCompleted() {
        return this.onPlaybackCompleted;
    }

    @Nullable
    public final Function1<PlaybackErrorType, Unit> getOnPlaybackError() {
        return this.onPlaybackError;
    }

    public final boolean isPlaying() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null) {
                    if (audioTrack.getPlayState() == 3) {
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalStateException e) {
            Log.w(TAG, "isPlaying check failed — player in invalid state: %s", e.getMessage());
            return false;
        }
    }

    public final void pause() {
        cancelPendingStart();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    Log.i(TAG, "Playback paused");
                }
            } catch (IllegalStateException e) {
                Log.w(TAG, "Cannot pause — player in invalid state: %s", e.getMessage());
                releasePlayer();
            }
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.pause();
        Log.i(TAG, "AudioTrack paused");
    }

    public final boolean playFromAssets(@NotNull String assetFileName, @NotNull OutputRoute route) {
        assetFileName.getClass();
        route.getClass();
        Log.i(TAG, "Playing from assets: %s, route=%s", assetFileName, route);
        stop();
        try {
            Object systemService = this.context.getSystemService("audio");
            this.audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (requestAudioFocus(route)) {
                OutputRoute outputRoute = OutputRoute.PHONE_SPEAKER;
                int i = 1;
                if (route == outputRoute) {
                    forceSpeakerOutput();
                    this.forcedSpeaker = true;
                } else {
                    this.forcedSpeaker = false;
                }
                MediaPlayer mediaPlayer = new MediaPlayer();
                int i2 = route == outputRoute ? 2 : 1;
                try {
                    AssetFileDescriptor openFd = this.context.getAssets().openFd(assetFileName);
                    try {
                        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(i2).setContentType(1).build());
                        mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(openFd, null);
                        mediaPlayer.setOnCompletionListener(new VideoActivity$$ExternalSyntheticLambda0(this, i));
                        mediaPlayer.setOnErrorListener(new AudioPlayer$$ExternalSyntheticLambda0(this, i));
                        mediaPlayer.prepare();
                        mediaPlayer.setVolume(getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release(), getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release());
                        this.mediaPlayer = mediaPlayer;
                        startWhenSpeakerRouted(mediaPlayer);
                        return true;
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Failed to play asset: %s", e.getMessage());
                    mediaPlayer.release();
                    abandonAudioFocus();
                    resetSpeakerState();
                    Function1<? super PlaybackErrorType, Unit> function1 = this.onPlaybackError;
                    if (function1 != null) {
                        function1.invoke(PlaybackErrorType.DECODE);
                    }
                }
            } else {
                Log.w(TAG, "Audio focus request denied");
                Function1<? super PlaybackErrorType, Unit> function12 = this.onPlaybackError;
                if (function12 != null) {
                    function12.invoke(PlaybackErrorType.GENERIC);
                    return false;
                }
            }
        } catch (Exception e2) {
            Log.e(TAG, "Failed to initialize audio: %s", e2.getMessage());
            abandonAudioFocus();
            resetSpeakerState();
            Function1<? super PlaybackErrorType, Unit> function13 = this.onPlaybackError;
            if (function13 != null) {
                function13.invoke(PlaybackErrorType.GENERIC);
            }
        }
        return false;
    }

    public final boolean playFromBytes(@NotNull byte[] audioData) {
        audioData.getClass();
        Log.i(TAG, "Playing from bytes: %d bytes, route=BLUETOOTH_A2DP", Integer.valueOf(audioData.length));
        stop();
        try {
            Object systemService = this.context.getSystemService("audio");
            this.audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            this.forcedSpeaker = false;
            if (!requestAudioFocus(OutputRoute.BLUETOOTH_A2DP)) {
                Log.w(TAG, "Audio focus denied for bystander playback — discarding audio");
                Function1<? super PlaybackErrorType, Unit> function1 = this.onPlaybackError;
                if (function1 != null) {
                    function1.invoke(PlaybackErrorType.GENERIC);
                }
                return false;
            }
            AudioTrack build = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(PCM_SAMPLE_RATE).setEncoding(2).setChannelMask(4).build()).setBufferSizeInBytes(audioData.length).setTransferMode(0).build();
            build.getClass();
            int write = build.write(audioData, 0, audioData.length);
            if (write == audioData.length) {
                build.setNotificationMarkerPosition(audioData.length / 2);
                build.setPlaybackPositionUpdateListener(new AudioTrack.OnPlaybackPositionUpdateListener() { // from class: com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer$playFromBytes$1
                    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
                    public void onMarkerReached(AudioTrack t) {
                        Log.i("TranslationAudioPlayer", "Bystander playback completed");
                        TranslationAudioPlayer.this.releaseAudioTrack();
                        Function0<Unit> onPlaybackCompleted = TranslationAudioPlayer.this.getOnPlaybackCompleted();
                        if (onPlaybackCompleted != null) {
                            onPlaybackCompleted.invoke();
                        }
                    }

                    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
                    public void onPeriodicNotification(AudioTrack t) {
                    }
                });
                build.setVolume(getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release());
                build.play();
                this.audioTrack = build;
                return true;
            }
            Log.e(TAG, "AudioTrack write incomplete: wrote %d of %d bytes", Integer.valueOf(write), Integer.valueOf(audioData.length));
            build.release();
            abandonAudioFocus();
            Function1<? super PlaybackErrorType, Unit> function12 = this.onPlaybackError;
            if (function12 != null) {
                function12.invoke(PlaybackErrorType.GENERIC);
            }
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Failed to play bystander audio: %s", e.getMessage());
            abandonAudioFocus();
            Function1<? super PlaybackErrorType, Unit> function13 = this.onPlaybackError;
            if (function13 != null) {
                function13.invoke(PlaybackErrorType.GENERIC);
            }
            return false;
        }
    }

    public final boolean playFromFile(@NotNull String filePath, @NotNull OutputRoute route) {
        filePath.getClass();
        route.getClass();
        Log.i(TAG, "Playing from file: %s, route=%s", filePath, route);
        stop();
        try {
            Object systemService = this.context.getSystemService("audio");
            this.audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (requestAudioFocus(route)) {
                OutputRoute outputRoute = OutputRoute.PHONE_SPEAKER;
                if (route == outputRoute) {
                    forceSpeakerOutput();
                    this.forcedSpeaker = true;
                } else {
                    this.forcedSpeaker = false;
                }
                File file = new File(filePath);
                if (file.exists()) {
                    byte[] wrapWithWavHeader = wrapWithWavHeader(FilesKt.readBytes(file), PCM_SAMPLE_RATE, 16, 1);
                    final File createTempFile = File.createTempFile("translation_wav_", ".wav", this.context.getCacheDir());
                    createTempFile.getClass();
                    FilesKt.writeBytes(createTempFile, wrapWithWavHeader);
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    try {
                        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(route == outputRoute ? 2 : 1).setContentType(1).build());
                        mediaPlayer.setDataSource(createTempFile.getAbsolutePath());
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer$$ExternalSyntheticLambda7
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                TranslationAudioPlayer.playFromFile$lambda$4(TranslationAudioPlayer.this, createTempFile, mediaPlayer2);
                            }
                        });
                        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer$$ExternalSyntheticLambda8
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                                boolean playFromFile$lambda$5;
                                playFromFile$lambda$5 = TranslationAudioPlayer.playFromFile$lambda$5(TranslationAudioPlayer.this, createTempFile, mediaPlayer2, i, i2);
                                return playFromFile$lambda$5;
                            }
                        });
                        mediaPlayer.prepare();
                        mediaPlayer.setVolume(getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release(), getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release());
                        this.mediaPlayer = mediaPlayer;
                        startWhenSpeakerRouted(mediaPlayer);
                        return true;
                    } catch (Exception e) {
                        Log.e(TAG, "Failed to play file: %s", e.getMessage());
                        mediaPlayer.release();
                        createTempFile.delete();
                        abandonAudioFocus();
                        resetSpeakerState();
                        Function1<? super PlaybackErrorType, Unit> function1 = this.onPlaybackError;
                        if (function1 != null) {
                            function1.invoke(PlaybackErrorType.DECODE);
                        }
                    }
                } else {
                    Log.e(TAG, "Audio file not found: %s", filePath);
                    abandonAudioFocus();
                    resetSpeakerState();
                    Function1<? super PlaybackErrorType, Unit> function12 = this.onPlaybackError;
                    if (function12 != null) {
                        function12.invoke(PlaybackErrorType.GENERIC);
                        return false;
                    }
                }
            } else {
                Log.w(TAG, "Audio focus request denied");
                Function1<? super PlaybackErrorType, Unit> function13 = this.onPlaybackError;
                if (function13 != null) {
                    function13.invoke(PlaybackErrorType.GENERIC);
                    return false;
                }
            }
        } catch (Exception e2) {
            Log.e(TAG, "Failed to initialize audio for file: %s", e2.getMessage());
            abandonAudioFocus();
            resetSpeakerState();
            Function1<? super PlaybackErrorType, Unit> function14 = this.onPlaybackError;
            if (function14 != null) {
                function14.invoke(PlaybackErrorType.GENERIC);
            }
        }
        return false;
    }

    public final void resume() {
        cancelPendingStart();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    Log.i(TAG, "Playback resumed");
                }
            } catch (IllegalStateException e) {
                Log.w(TAG, "Cannot resume — player in invalid state: %s", e.getMessage());
                releasePlayer();
            }
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || audioTrack.getPlayState() != 2) {
            return;
        }
        audioTrack.play();
        Log.i(TAG, "AudioTrack resumed");
    }

    public final synchronized void setDucked(boolean ducked) {
        if (this.isDucked == ducked) {
            return;
        }
        this.isDucked = ducked;
        float currentVolume$AlexaAccessoryEchoFramesAndroid_release = getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release();
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(currentVolume$AlexaAccessoryEchoFramesAndroid_release, currentVolume$AlexaAccessoryEchoFramesAndroid_release);
            }
        } catch (IllegalStateException e) {
            Log.w(TAG, "Cannot set MediaPlayer volume — player in invalid state: %s", e.getMessage());
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.setVolume(currentVolume$AlexaAccessoryEchoFramesAndroid_release);
        }
        Log.i(TAG, "Playback %s (volume=%.1f)", ducked ? "ducked" : "unducked", Float.valueOf(currentVolume$AlexaAccessoryEchoFramesAndroid_release));
    }

    public final void setOnPlaybackCompleted(@Nullable Function0<Unit> function0) {
        this.onPlaybackCompleted = function0;
    }

    public final void setOnPlaybackError(@Nullable Function1<? super PlaybackErrorType, Unit> function1) {
        this.onPlaybackError = function1;
    }

    public final void stop() {
        releasePlayer();
        releaseAudioTrack();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/audio/TranslationAudioPlayer$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "PCM_SAMPLE_RATE", "", "PCM_BITS_PER_SAMPLE", "PCM_CHANNELS", "SPEAKER_ROUTE_TIMEOUT_MS", "", "getSPEAKER_ROUTE_TIMEOUT_MS$AlexaAccessoryEchoFramesAndroid_release$annotations", "DUCKED_VOLUME", "", "getDUCKED_VOLUME$AlexaAccessoryEchoFramesAndroid_release$annotations", "NORMAL_VOLUME", "getNORMAL_VOLUME$AlexaAccessoryEchoFramesAndroid_release$annotations", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDUCKED_VOLUME$AlexaAccessoryEchoFramesAndroid_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getNORMAL_VOLUME$AlexaAccessoryEchoFramesAndroid_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSPEAKER_ROUTE_TIMEOUT_MS$AlexaAccessoryEchoFramesAndroid_release$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCurrentVolume$AlexaAccessoryEchoFramesAndroid_release$annotations() {
    }
}
