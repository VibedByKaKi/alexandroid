package com.amazon.apl.android.audio;

import android.os.Handler;
import android.os.Looper;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.media.MediaTrack;
import com.amazon.apl.android.media.TextTrack;
import com.amazon.apl.android.providers.ITtsPlayerProvider;
import com.amazon.apl.enums.AudioPlayerEventType;
import com.amazon.apl.enums.SpeechMarkType;
import com.amazon.apl.enums.TrackState;
import com.amazon.common.BoundObject;
import com.amazon.common.NativeBinding$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioPlayer extends BoundObject implements ITtsPlayer.IStateChangeListener, ITtsPlayer.ISpeechMarksListener {
    private static final long UPDATE_TIME_INTERVAL_MS = 100;
    private int mCurrentOffset;
    private long mStartTime;
    private final ITtsPlayerProvider mTtsPlayerProvider;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final AtomicBoolean mIsReleased = new AtomicBoolean();
    private TrackState mLastPublishedTrackState = TrackState.kTrackNotReady;
    private boolean mTimeUpdatesStarted = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.audio.AudioPlayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$IStateChangeListener$AudioPlayerState;

        static {
            int[] iArr = new int[ITtsPlayer.ISpeechMarksListener.MarkType.values().length];
            $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType = iArr;
            try {
                iArr[ITtsPlayer.ISpeechMarksListener.MarkType.WORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType[ITtsPlayer.ISpeechMarksListener.MarkType.SENTENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType[ITtsPlayer.ISpeechMarksListener.MarkType.VISEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType[ITtsPlayer.ISpeechMarksListener.MarkType.SSML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ITtsPlayer.IStateChangeListener.AudioPlayerState.values().length];
            $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$IStateChangeListener$AudioPlayerState = iArr2;
            try {
                iArr2[ITtsPlayer.IStateChangeListener.AudioPlayerState.STATE_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$IStateChangeListener$AudioPlayerState[ITtsPlayer.IStateChangeListener.AudioPlayerState.STATE_ENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$IStateChangeListener$AudioPlayerState[ITtsPlayer.IStateChangeListener.AudioPlayerState.STATE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioPlayerEvent {
        private final AudioPlayerEventType mAudioPlayerEventType;
        private final boolean mIsEnded;
        private final int mOffset;
        private final TrackState mTrackState;
        private final int mDuration = 1;
        private final boolean mIsPaused = false;

        public AudioPlayerEvent(AudioPlayerEventType audioPlayerEventType, TrackState trackState, int i) {
            this.mAudioPlayerEventType = audioPlayerEventType;
            this.mTrackState = trackState;
            this.mOffset = i;
            this.mIsEnded = audioPlayerEventType == AudioPlayerEventType.kAudioPlayerEventEnd;
        }
    }

    public AudioPlayer(long j, ITtsPlayerProvider iTtsPlayerProvider) {
        this.mTtsPlayerProvider = iTtsPlayerProvider;
        bind(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSpeechMark$0(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        nSpeechMark(getNativeHandle(), viewhostMarkToAPLSM(speechMark).getIndex(), speechMark.start, speechMark.end, speechMark.time, speechMark.value);
    }

    private static native void nSpeechMark(long j, int i, int i2, int i3, long j2, String str);

    private static native void nStateChange(long j, int i, int i2, int i3, boolean z, boolean z2, int i4);

    private void pause() {
        this.mTtsPlayerProvider.getPlayer().stop();
    }

    private void play() {
        ITtsPlayer player = this.mTtsPlayerProvider.getPlayer();
        player.setWordMarkListener(this);
        player.play();
    }

    private void release() {
        this.mIsReleased.set(true);
        this.mMainHandler.removeCallbacksAndMessages(null);
        ITtsPlayer player = this.mTtsPlayerProvider.getPlayer();
        player.stop();
        player.setStateChangeListener(null);
        player.setWordMarkListener(null);
    }

    private void setTrack(MediaTrack mediaTrack) {
        String url = mediaTrack.getUrl();
        TextTrack[] textTracks = mediaTrack.getTextTracks();
        if (textTracks == null || textTracks.length != 1) {
            this.mTtsPlayerProvider.prepare(url);
        } else {
            this.mTtsPlayerProvider.prepare(url, textTracks[0]);
        }
        this.mTtsPlayerProvider.getPlayer().setStateChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startTimeUpdates() {
        if (!this.mIsReleased.get()) {
            TrackState trackState = this.mLastPublishedTrackState;
            TrackState trackState2 = TrackState.kTrackReady;
            if (trackState == trackState2) {
                int currentTimeMillis = (int) (System.currentTimeMillis() - this.mStartTime);
                this.mCurrentOffset = currentTimeMillis;
                lambda$onStateChange$1(new AudioPlayerEvent(AudioPlayerEventType.kAudioPlayerEventTimeUpdate, trackState2, currentTimeMillis));
                this.mMainHandler.postDelayed(new NativeBinding$$ExternalSyntheticLambda0(this, 10), 100L);
            }
        }
    }

    private SpeechMarkType viewhostMarkToAPLSM(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        SpeechMarkType speechMarkType = SpeechMarkType.kSpeechMarkUnknown;
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$ISpeechMarksListener$MarkType[speechMark.markType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? speechMarkType : SpeechMarkType.kSpeechMarkSSML : SpeechMarkType.kSpeechMarkViseme : SpeechMarkType.kSpeechMarkSentence : SpeechMarkType.kSpeechMarkWord;
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer.ISpeechMarksListener
    public void onSpeechMark(ITtsPlayer.ISpeechMarksListener.SpeechMark speechMark) {
        if (this.mIsReleased.get()) {
            return;
        }
        this.mMainHandler.post(new RootContext$$ExternalSyntheticLambda2(this, speechMark, 3));
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer.IStateChangeListener
    public synchronized void onStateChange(ITtsPlayer.IStateChangeListener.AudioPlayerState audioPlayerState) {
        AudioPlayerEvent audioPlayerEvent;
        try {
            if (this.mIsReleased.get()) {
                return;
            }
            int i = AnonymousClass1.$SwitchMap$com$amazon$apl$android$dependencies$ITtsPlayer$IStateChangeListener$AudioPlayerState[audioPlayerState.ordinal()];
            if (i == 1) {
                audioPlayerEvent = new AudioPlayerEvent(AudioPlayerEventType.kAudioPlayerEventPlay, TrackState.kTrackReady, this.mCurrentOffset);
                this.mStartTime = System.currentTimeMillis();
            } else if (i == 2) {
                audioPlayerEvent = new AudioPlayerEvent(AudioPlayerEventType.kAudioPlayerEventEnd, TrackState.kTrackNotReady, this.mCurrentOffset);
            } else if (i != 3) {
                audioPlayerEvent = new AudioPlayerEvent(AudioPlayerEventType.kAudioPlayerEventTimeUpdate, TrackState.kTrackNotReady, this.mCurrentOffset);
            } else {
                audioPlayerEvent = new AudioPlayerEvent(AudioPlayerEventType.kAudioPlayerEventFail, TrackState.kTrackFailed, this.mCurrentOffset);
                this.mStartTime = 0L;
            }
            this.mMainHandler.post(new RootContext$$ExternalSyntheticLambda2(this, audioPlayerEvent, 2));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: publishTrackState, reason: merged with bridge method [inline-methods] */
    public synchronized void lambda$onStateChange$1(AudioPlayerEvent audioPlayerEvent) {
        if (this.mIsReleased.get()) {
            return;
        }
        TrackState trackState = this.mLastPublishedTrackState;
        this.mLastPublishedTrackState = audioPlayerEvent.mTrackState;
        nStateChange(getNativeHandle(), audioPlayerEvent.mAudioPlayerEventType.getIndex(), audioPlayerEvent.mOffset, 1, false, audioPlayerEvent.mIsEnded, audioPlayerEvent.mTrackState.getIndex());
        if (trackState == TrackState.kTrackNotReady && this.mLastPublishedTrackState == TrackState.kTrackReady) {
            startTimeUpdates();
        }
    }
}
