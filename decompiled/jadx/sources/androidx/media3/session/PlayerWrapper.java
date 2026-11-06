package androidx.media3.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.ForwardingPlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.VolumeProviderCompat;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class PlayerWrapper extends ForwardingPlayer {
    private Player.Commands availablePlayerCommands;
    private SessionCommands availableSessionCommands;
    private ImmutableList<CommandButton> customLayout;

    @Nullable
    private LegacyError legacyError;
    private Bundle legacyExtras;
    private ImmutableList<CommandButton> mediaButtonPreferences;
    private final boolean playIfSuppressed;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: androidx.media3.session.PlayerWrapper$1, reason: invalid class name */
    public class AnonymousClass1 extends VolumeProviderCompat {
        final /* synthetic */ Handler val$handler;
        final /* synthetic */ int val$legacyVolumeFlag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, int i3, String str, Handler handler, int i4) {
            super(i, i2, i3, str);
            this.val$handler = handler;
            this.val$legacyVolumeFlag = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdjustVolume$1(int i, int i2) {
            if (PlayerWrapper.this.isCommandAvailable(26) || PlayerWrapper.this.isCommandAvailable(34)) {
                if (i == -100) {
                    boolean isCommandAvailable = PlayerWrapper.this.isCommandAvailable(34);
                    PlayerWrapper playerWrapper = PlayerWrapper.this;
                    if (isCommandAvailable) {
                        playerWrapper.setDeviceMuted(true, i2);
                        return;
                    } else {
                        playerWrapper.setDeviceMuted(true);
                        return;
                    }
                }
                if (i == -1) {
                    boolean isCommandAvailable2 = PlayerWrapper.this.isCommandAvailable(34);
                    PlayerWrapper playerWrapper2 = PlayerWrapper.this;
                    if (isCommandAvailable2) {
                        playerWrapper2.decreaseDeviceVolume(i2);
                        return;
                    } else {
                        playerWrapper2.decreaseDeviceVolume();
                        return;
                    }
                }
                if (i == 1) {
                    boolean isCommandAvailable3 = PlayerWrapper.this.isCommandAvailable(34);
                    PlayerWrapper playerWrapper3 = PlayerWrapper.this;
                    if (isCommandAvailable3) {
                        playerWrapper3.increaseDeviceVolume(i2);
                        return;
                    } else {
                        playerWrapper3.increaseDeviceVolume();
                        return;
                    }
                }
                if (i == 100) {
                    boolean isCommandAvailable4 = PlayerWrapper.this.isCommandAvailable(34);
                    PlayerWrapper playerWrapper4 = PlayerWrapper.this;
                    if (isCommandAvailable4) {
                        playerWrapper4.setDeviceMuted(false, i2);
                        return;
                    } else {
                        playerWrapper4.setDeviceMuted(false);
                        return;
                    }
                }
                if (i != 101) {
                    TableInfo$$ExternalSyntheticOutline0.m8109m(i, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                    return;
                }
                boolean isCommandAvailable5 = PlayerWrapper.this.isCommandAvailable(34);
                PlayerWrapper playerWrapper5 = PlayerWrapper.this;
                if (isCommandAvailable5) {
                    playerWrapper5.setDeviceMuted(!playerWrapper5.isDeviceMutedWithCommandCheck(), i2);
                } else {
                    playerWrapper5.setDeviceMuted(!playerWrapper5.isDeviceMutedWithCommandCheck());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSetVolumeTo$0(int i, int i2) {
            if (PlayerWrapper.this.isCommandAvailable(25) || PlayerWrapper.this.isCommandAvailable(33)) {
                boolean isCommandAvailable = PlayerWrapper.this.isCommandAvailable(33);
                PlayerWrapper playerWrapper = PlayerWrapper.this;
                if (isCommandAvailable) {
                    playerWrapper.setDeviceVolume(i, i2);
                } else {
                    playerWrapper.setDeviceVolume(i);
                }
            }
        }

        @Override // androidx.media3.session.legacy.VolumeProviderCompat
        public void onAdjustVolume(int i) {
            Util.postOrRun(this.val$handler, new PlayerWrapper$1$$ExternalSyntheticLambda0(this, i, this.val$legacyVolumeFlag, 1));
        }

        @Override // androidx.media3.session.legacy.VolumeProviderCompat
        public void onSetVolumeTo(int i) {
            Util.postOrRun(this.val$handler, new PlayerWrapper$1$$ExternalSyntheticLambda0(this, i, this.val$legacyVolumeFlag, 0));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CurrentMediaItemOnlyTimeline extends Timeline {
        private static final Object UID = new Object();
        private final long durationUs;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        private final MediaItem mediaItem;

        public CurrentMediaItemOnlyTimeline(PlayerWrapper playerWrapper) {
            this.mediaItem = playerWrapper.getCurrentMediaItem();
            this.isSeekable = playerWrapper.isCurrentMediaItemSeekable();
            this.isDynamic = playerWrapper.isCurrentMediaItemDynamic();
            this.liveConfiguration = playerWrapper.isCurrentMediaItemLive() ? MediaItem.LiveConfiguration.UNSET : null;
            this.durationUs = Util.msToUs(playerWrapper.getContentDuration());
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            return UID.equals(obj) ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            Object obj = UID;
            period.set(obj, obj, 0, this.durationUs, 0L);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            return UID;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            window.set(UID, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, this.liveConfiguration, 0L, this.durationUs, 0, 0, 0L);
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public PlayerWrapper(Player player, boolean z, ImmutableList<CommandButton> immutableList, ImmutableList<CommandButton> immutableList2, SessionCommands sessionCommands, Player.Commands commands, Bundle bundle) {
        super(player);
        this.playIfSuppressed = z;
        this.customLayout = immutableList;
        this.mediaButtonPreferences = immutableList2;
        this.availableSessionCommands = sessionCommands;
        this.availablePlayerCommands = commands;
        this.legacyExtras = bundle;
    }

    private static long convertCommandToPlaybackStateActions(int i) {
        if (i == 1) {
            return 518L;
        }
        if (i == 2) {
            return 16384L;
        }
        if (i == 3) {
            return 1L;
        }
        if (i == 31) {
            return 240640L;
        }
        switch (i) {
            case 5:
                return 256L;
            case 6:
            case 7:
                return 16L;
            case 8:
            case 9:
                return 32L;
            case 10:
                return 4096L;
            case 11:
                return 8L;
            case 12:
                return 64L;
            case 13:
                return 4194304L;
            case 14:
                return 2621440L;
            case 15:
                return 262144L;
            default:
                return 0L;
        }
    }

    private void verifyApplicationThread() {
        Assertions.checkState(Looper.myLooper() == getApplicationLooper());
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addListener(Player.Listener listener) {
        verifyApplicationThread();
        super.addListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(list);
    }

    public void clearLegacyErrorStatus() {
        this.legacyError = null;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearMediaItems() {
        verifyApplicationThread();
        super.clearMediaItems();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        super.clearVideoSurface();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        verifyApplicationThread();
        super.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThread();
        super.clearVideoTextureView(textureView);
    }

    public PlaybackStateCompat createPlaybackStateCompat() {
        LegacyError legacyError = this.legacyError;
        if (legacyError != null && legacyError.isFatal) {
            Bundle bundle = new Bundle(legacyError.extras);
            bundle.putAll(this.legacyExtras);
            return new PlaybackStateCompat.Builder().setState(7, -1L, 0.0f, SystemClock.elapsedRealtime()).setActions(0L).setBufferedPosition(0L).setExtras(bundle).setErrorMessage(legacyError.code, (CharSequence) Assertions.checkNotNull(legacyError.message)).setExtras(legacyError.extras).build();
        }
        PlaybackException playerError = getPlayerError();
        int convertToPlaybackStateCompatState = LegacyConversions.convertToPlaybackStateCompatState(this, this.playIfSuppressed);
        Player.Commands intersect = MediaUtils.intersect(this.availablePlayerCommands, getAvailableCommands());
        long j = 128;
        for (int i = 0; i < intersect.size(); i++) {
            j |= convertCommandToPlaybackStateActions(intersect.get(i));
        }
        long convertToQueueItemId = isCommandAvailable(17) ? LegacyConversions.convertToQueueItemId(getCurrentMediaItemIndex()) : -1L;
        float f = getPlaybackParameters().speed;
        float f2 = isPlaying() ? f : 0.0f;
        Bundle bundle2 = legacyError != null ? new Bundle(legacyError.extras) : new Bundle();
        bundle2.putAll(this.legacyExtras);
        bundle2.putFloat(MediaConstants.EXTRAS_KEY_PLAYBACK_SPEED_COMPAT, f);
        MediaItem currentMediaItemWithCommandCheck = getCurrentMediaItemWithCommandCheck();
        if (currentMediaItemWithCommandCheck != null && !"".equals(currentMediaItemWithCommandCheck.mediaId)) {
            bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", currentMediaItemWithCommandCheck.mediaId);
        }
        boolean isCommandAvailable = isCommandAvailable(16);
        PlaybackStateCompat.Builder extras = new PlaybackStateCompat.Builder().setState(convertToPlaybackStateCompatState, isCommandAvailable ? getCurrentPosition() : -1L, f2, SystemClock.elapsedRealtime()).setActions(j).setActiveQueueItemId(convertToQueueItemId).setBufferedPosition(isCommandAvailable ? getBufferedPosition() : 0L).setExtras(bundle2);
        ImmutableList<CommandButton> immutableList = this.mediaButtonPreferences.isEmpty() ? this.customLayout : this.mediaButtonPreferences;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            CommandButton commandButton = immutableList.get(i2);
            SessionCommand sessionCommand = commandButton.sessionCommand;
            if (sessionCommand != null && commandButton.isEnabled && sessionCommand.commandCode == 0 && CommandButton.isButtonCommandAvailable(commandButton, this.availableSessionCommands, this.availablePlayerCommands)) {
                Bundle bundle3 = sessionCommand.customExtras;
                if (commandButton.icon != 0) {
                    bundle3 = new Bundle(sessionCommand.customExtras);
                    bundle3.putInt(MediaConstants.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT, commandButton.icon);
                }
                extras.addCustomAction(new PlaybackStateCompat.CustomAction.Builder(sessionCommand.customAction, commandButton.displayName, commandButton.iconResId).setExtras(bundle3).build());
            }
        }
        if (playerError != null) {
            extras.setErrorMessage(LegacyConversions.convertToLegacyErrorCode(playerError), playerError.getMessage());
        } else if (legacyError != null) {
            extras.setErrorMessage(legacyError.code, legacyError.message);
        }
        return extras.build();
    }

    public PlayerInfo createPlayerInfoForBundling() {
        return new PlayerInfo(getPlayerError(), 0, createSessionPositionInfoForBundling(), createPositionInfoForBundling(), createPositionInfoForBundling(), 0, getPlaybackParameters(), getRepeatMode(), getShuffleModeEnabled(), getVideoSize(), getCurrentTimelineWithCommandCheck(), 0, getPlaylistMetadataWithCommandCheck(), getVolumeWithCommandCheck(), getAudioAttributesWithCommandCheck(), getCurrentCuesWithCommandCheck(), getDeviceInfo(), getDeviceVolumeWithCommandCheck(), isDeviceMutedWithCommandCheck(), getPlayWhenReady(), 1, getPlaybackSuppressionReason(), getPlaybackState(), isPlaying(), isLoading(), getMediaMetadataWithCommandCheck(), getSeekBackIncrement(), getSeekForwardIncrement(), getMaxSeekToPreviousPosition(), getCurrentTracksWithCommandCheck(), getTrackSelectionParameters());
    }

    public Player.PositionInfo createPositionInfoForBundling() {
        boolean isCommandAvailable = isCommandAvailable(16);
        boolean isCommandAvailable2 = isCommandAvailable(17);
        return new Player.PositionInfo(null, isCommandAvailable2 ? getCurrentMediaItemIndex() : 0, isCommandAvailable ? getCurrentMediaItem() : null, null, isCommandAvailable2 ? getCurrentPeriodIndex() : 0, isCommandAvailable ? getCurrentPosition() : 0L, isCommandAvailable ? getContentPosition() : 0L, isCommandAvailable ? getCurrentAdGroupIndex() : -1, isCommandAvailable ? getCurrentAdIndexInAdGroup() : -1);
    }

    public SessionPositionInfo createSessionPositionInfoForBundling() {
        boolean isCommandAvailable = isCommandAvailable(16);
        return new SessionPositionInfo(createPositionInfoForBundling(), isCommandAvailable && isPlayingAd(), SystemClock.elapsedRealtime(), isCommandAvailable ? getDuration() : -9223372036854775807L, isCommandAvailable ? getBufferedPosition() : 0L, isCommandAvailable ? getBufferedPercentage() : 0, isCommandAvailable ? getTotalBufferedDuration() : 0L, isCommandAvailable ? getCurrentLiveOffset() : -9223372036854775807L, isCommandAvailable ? getContentDuration() : -9223372036854775807L, isCommandAvailable ? getContentBufferedPosition() : 0L);
    }

    @Nullable
    public VolumeProviderCompat createVolumeProviderCompat() {
        if (getDeviceInfo().playbackType == 0) {
            return null;
        }
        Player.Commands availableCommands = getAvailableCommands();
        int i = availableCommands.containsAny(26, 34) ? availableCommands.containsAny(25, 33) ? 2 : 1 : 0;
        Handler handler = new Handler(getApplicationLooper());
        int deviceVolumeWithCommandCheck = getDeviceVolumeWithCommandCheck();
        DeviceInfo deviceInfo = getDeviceInfo();
        return new AnonymousClass1(i, deviceInfo.maxVolume, deviceVolumeWithCommandCheck, deviceInfo.routingControllerId, handler, 1);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        super.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return super.getAudioAttributes();
    }

    public AudioAttributes getAudioAttributesWithCommandCheck() {
        return isCommandAvailable(21) ? getAudioAttributes() : AudioAttributes.DEFAULT;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return super.getAvailableCommands();
    }

    public Player.Commands getAvailablePlayerCommands() {
        return this.availablePlayerCommands;
    }

    public SessionCommands getAvailableSessionCommands() {
        return this.availableSessionCommands;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getBufferedPercentage() {
        verifyApplicationThread();
        return super.getBufferedPercentage();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        return super.getBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        return super.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentDuration() {
        verifyApplicationThread();
        return super.getContentDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return super.getContentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        return super.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public CueGroup getCurrentCues() {
        verifyApplicationThread();
        return super.getCurrentCues();
    }

    public CueGroup getCurrentCuesWithCommandCheck() {
        return isCommandAvailable(28) ? getCurrentCues() : CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        verifyApplicationThread();
        return super.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Nullable
    public Object getCurrentManifest() {
        verifyApplicationThread();
        return super.getCurrentManifest();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Nullable
    public MediaItem getCurrentMediaItem() {
        verifyApplicationThread();
        return super.getCurrentMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        return super.getCurrentMediaItemIndex();
    }

    @Nullable
    public MediaItem getCurrentMediaItemWithCommandCheck() {
        if (isCommandAvailable(16)) {
            return getCurrentMediaItem();
        }
        return null;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        return super.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return super.getCurrentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return super.getCurrentTimeline();
    }

    public Timeline getCurrentTimelineWithCommandCheck() {
        return isCommandAvailable(17) ? getCurrentTimeline() : isCommandAvailable(16) ? new CurrentMediaItemOnlyTimeline(this) : Timeline.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public Tracks getCurrentTracks() {
        verifyApplicationThread();
        return super.getCurrentTracks();
    }

    public Tracks getCurrentTracksWithCommandCheck() {
        return isCommandAvailable(30) ? getCurrentTracks() : Tracks.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public int getCurrentWindowIndex() {
        verifyApplicationThread();
        return super.getCurrentWindowIndex();
    }

    public ImmutableList<CommandButton> getCustomLayout() {
        return this.customLayout;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return super.getDeviceInfo();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        return super.getDeviceVolume();
    }

    public int getDeviceVolumeWithCommandCheck() {
        if (isCommandAvailable(23)) {
            return getDeviceVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        return super.getDuration();
    }

    public long getDurationWithCommandCheck() {
        if (isCommandAvailable(16)) {
            return getDuration();
        }
        return -9223372036854775807L;
    }

    @Nullable
    public LegacyError getLegacyError() {
        return this.legacyError;
    }

    public Bundle getLegacyExtras() {
        return this.legacyExtras;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return super.getMaxSeekToPreviousPosition();
    }

    public ImmutableList<CommandButton> getMediaButtonPreferences() {
        return this.mediaButtonPreferences;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public MediaItem getMediaItemAt(int i) {
        verifyApplicationThread();
        return super.getMediaItemAt(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getMediaItemCount() {
        verifyApplicationThread();
        return super.getMediaItemCount();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return super.getMediaMetadata();
    }

    public MediaMetadata getMediaMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getMediaMetadata() : MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        verifyApplicationThread();
        return super.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public int getNextWindowIndex() {
        verifyApplicationThread();
        return super.getNextWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return super.getPlayWhenReady();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return super.getPlaybackParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return super.getPlaybackState();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return super.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Nullable
    public PlaybackException getPlayerError() {
        verifyApplicationThread();
        return super.getPlayerError();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return super.getPlaylistMetadata();
    }

    public MediaMetadata getPlaylistMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getPlaylistMetadata() : MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        return super.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public int getPreviousWindowIndex() {
        verifyApplicationThread();
        return super.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return super.getRepeatMode();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return super.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return super.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return super.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public Size getSurfaceSize() {
        verifyApplicationThread();
        return super.getSurfaceSize();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return super.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return super.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public VideoSize getVideoSize() {
        verifyApplicationThread();
        return super.getVideoSize();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return super.getVolume();
    }

    public float getVolumeWithCommandCheck() {
        if (isCommandAvailable(22)) {
            return getVolume();
        }
        return 0.0f;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public boolean hasNext() {
        verifyApplicationThread();
        return super.hasNext();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        verifyApplicationThread();
        return super.hasNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public boolean hasNextWindow() {
        verifyApplicationThread();
        return super.hasNextWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return super.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        super.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCommandAvailable(int i) {
        verifyApplicationThread();
        return super.isCommandAvailable(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        return super.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        return super.isCurrentMediaItemLive();
    }

    public boolean isCurrentMediaItemLiveWithCommandCheck() {
        return isCommandAvailable(16) && isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        return super.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return super.isDeviceMuted();
    }

    public boolean isDeviceMutedWithCommandCheck() {
        return isCommandAvailable(23) && isDeviceMuted();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return super.isLoading();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlaying() {
        verifyApplicationThread();
        return super.isPlaying();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return super.isPlayingAd();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItem(int i, int i2) {
        verifyApplicationThread();
        super.moveMediaItem(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        super.moveMediaItems(i, i2, i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void next() {
        verifyApplicationThread();
        super.next();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void pause() {
        verifyApplicationThread();
        super.pause();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void play() {
        verifyApplicationThread();
        super.play();
    }

    public void playIfCommandAvailable() {
        if (isCommandAvailable(1)) {
            play();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        super.prepare();
    }

    public void prepareIfCommandAvailable() {
        if (isCommandAvailable(2)) {
            prepare();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void release() {
        verifyApplicationThread();
        super.release();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        super.removeListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItem(int i) {
        verifyApplicationThread();
        super.removeMediaItem(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        super.removeMediaItems(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItem(int i, MediaItem mediaItem) {
        verifyApplicationThread();
        super.replaceMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, List<MediaItem> list) {
        verifyApplicationThread();
        super.replaceMediaItems(i, i2, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekBack() {
        verifyApplicationThread();
        super.seekBack();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekForward() {
        verifyApplicationThread();
        super.seekForward();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(long j) {
        verifyApplicationThread();
        super.seekTo(j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition(int i) {
        verifyApplicationThread();
        super.seekToDefaultPosition(i);
    }

    public void seekToDefaultPositionIfCommandAvailable() {
        if (isCommandAvailable(4)) {
            seekToDefaultPosition();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNext() {
        verifyApplicationThread();
        super.seekToNext();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNextMediaItem() {
        verifyApplicationThread();
        super.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void seekToNextWindow() {
        verifyApplicationThread();
        super.seekToNextWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPrevious() {
        verifyApplicationThread();
        super.seekToPrevious();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        verifyApplicationThread();
        super.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void seekToPreviousWindow() {
        verifyApplicationThread();
        super.seekToPreviousWindow();
    }

    public void setAvailableCommands(SessionCommands sessionCommands, Player.Commands commands) {
        this.availableSessionCommands = sessionCommands;
        this.availablePlayerCommands = commands;
    }

    public void setCustomLayout(ImmutableList<CommandButton> immutableList) {
        this.customLayout = immutableList;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        super.setDeviceMuted(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        super.setDeviceVolume(i);
    }

    public void setLegacyError(boolean z, int i, String str, Bundle bundle) {
        this.legacyError = new LegacyError(z, i, str, bundle, null);
    }

    public void setLegacyExtras(Bundle bundle) {
        Assertions.checkArgument(!bundle.containsKey(MediaConstants.EXTRAS_KEY_PLAYBACK_SPEED_COMPAT));
        Assertions.checkArgument(!bundle.containsKey("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"));
        this.legacyExtras = bundle;
    }

    public void setMediaButtonPreferences(ImmutableList<CommandButton> immutableList) {
        this.mediaButtonPreferences = immutableList;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        super.setMediaItems(list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        super.setPlayWhenReady(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        super.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackSpeed(float f) {
        verifyApplicationThread();
        super.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        super.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setRepeatMode(int i) {
        verifyApplicationThread();
        super.setRepeatMode(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        verifyApplicationThread();
        super.setShuffleModeEnabled(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        super.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        verifyApplicationThread();
        super.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        verifyApplicationThread();
        super.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThread();
        super.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVolume(float f) {
        verifyApplicationThread();
        super.setVolume(f);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        super.stop();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(int i, MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(int i, List<MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(i, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        verifyApplicationThread();
        super.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        super.decreaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        super.increaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(int i, long j) {
        verifyApplicationThread();
        super.seekTo(i, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition() {
        verifyApplicationThread();
        super.seekToDefaultPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        super.setDeviceMuted(z, i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        super.setDeviceVolume(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, long j) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThread();
        super.setMediaItems(list, z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, boolean z) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThread();
        super.setMediaItems(list, i, j);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LegacyError {
        public final int code;
        public final Bundle extras;
        public final boolean isFatal;

        @Nullable
        public final String message;

        private LegacyError(boolean z, int i, @Nullable String str, @Nullable Bundle bundle) {
            this.isFatal = z;
            this.code = i;
            this.message = str;
            this.extras = bundle == null ? Bundle.EMPTY : bundle;
        }

        public /* synthetic */ LegacyError(boolean z, int i, String str, Bundle bundle, AnonymousClass1 anonymousClass1) {
            this(z, i, str, bundle);
        }
    }
}
