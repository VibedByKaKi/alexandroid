package com.amazon.apl.android.providers;

import android.content.Context;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.amazon.apl.android.IDocumentLifecycleListener;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class AbstractMediaPlayerProvider<T extends View> implements IMediaPlayer.IMediaListener, IDocumentLifecycleListener {

    @NonNull
    private final Set<IMediaPlayer> mPlayers = new HashSet();

    @NonNull
    private final Set<IMediaPlayer> mPlayingSet = new HashSet();

    @NonNull
    private final Collection<IMediaPlayer> mPausedSet = new LinkedList();

    @NonNull
    private final Collection<IMediaPlayer> mPlayingWhenBackgroundSet = new LinkedList();

    public abstract IMediaPlayer createPlayer(Context context, T t);

    public abstract T createView(Context context);

    public IMediaPlayer getNewPlayer(Context context, T t) {
        IMediaPlayer createPlayer = createPlayer(context, t);
        this.mPlayers.add(createPlayer);
        createPlayer.addMediaStateListener(this);
        return createPlayer;
    }

    public boolean hasPlayingMediaPlayer() {
        return !this.mPlayingSet.isEmpty();
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        releasePlayers();
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentPaused() {
        for (IMediaPlayer iMediaPlayer : new LinkedList(this.mPlayingSet)) {
            this.mPlayingWhenBackgroundSet.add(iMediaPlayer);
            iMediaPlayer.pause();
        }
        Iterator<IMediaPlayer> it2 = this.mPlayers.iterator();
        while (it2.hasNext()) {
            it2.next().releaseAudioFocus();
        }
        this.mPlayingSet.clear();
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentResumed() {
        Iterator it2 = new LinkedList(this.mPlayingWhenBackgroundSet).iterator();
        while (it2.hasNext()) {
            ((IMediaPlayer) it2.next()).play();
        }
        this.mPlayingWhenBackgroundSet.clear();
    }

    @CallSuper
    public void releasePlayers() {
        for (IMediaPlayer iMediaPlayer : new LinkedList(this.mPlayers)) {
            if (iMediaPlayer.getCurrentMediaState() != IMediaPlayer.IMediaListener.MediaState.RELEASED) {
                iMediaPlayer.release();
            }
        }
        this.mPlayers.clear();
        this.mPlayingSet.clear();
        this.mPausedSet.clear();
        this.mPlayingWhenBackgroundSet.clear();
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer.IMediaListener
    public void updateMediaState(@NonNull IMediaPlayer iMediaPlayer) {
        IMediaPlayer.IMediaListener.MediaState currentMediaState = iMediaPlayer.getCurrentMediaState();
        if (currentMediaState == IMediaPlayer.IMediaListener.MediaState.RELEASED) {
            this.mPlayers.remove(iMediaPlayer);
        }
        if (currentMediaState == IMediaPlayer.IMediaListener.MediaState.PAUSED) {
            this.mPausedSet.add(iMediaPlayer);
        }
        boolean isPlaying = iMediaPlayer.isPlaying();
        Set<IMediaPlayer> set = this.mPlayingSet;
        if (isPlaying) {
            set.add(iMediaPlayer);
        } else {
            set.remove(iMediaPlayer);
        }
    }
}
