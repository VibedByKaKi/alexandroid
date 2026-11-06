package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlayQueue {
    private static final String TAG = "PlayQueue";
    private final PlayItemDestroyCallback callback;
    private final Queue<PlayItem> playQueue = new LinkedList();
    private final List<PlayItem> preparedPlayItems = new LinkedList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PlayItemDestroyCallback {
        void onDestroy(PlayItem playItem);
    }

    public PlayQueue(PlayItemDestroyCallback playItemDestroyCallback) {
        this.callback = playItemDestroyCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnDestroyCallback(@Nullable PlayItem playItem) {
        if (playItem != null) {
            this.callback.onDestroy(playItem);
        }
    }

    public synchronized void clear() {
        try {
            Iterator<PlayItem> currentlyActivePlayItems = currentlyActivePlayItems();
            while (currentlyActivePlayItems.hasNext()) {
                currentlyActivePlayItems.next();
                currentlyActivePlayItems.remove();
            }
            Iterator<PlayItem> it2 = this.preparedPlayItems.iterator();
            while (it2.hasNext()) {
                callOnDestroyCallback(it2.next());
                it2.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public Iterator<PlayItem> currentlyActivePlayItems() {
        return new Iterator<PlayItem>() { // from class: com.amazon.alexa.client.alexaservice.audio.core.PlayQueue.1
            private PlayItem currentPlayItem;
            private final Iterator<PlayItem> iterator;

            {
                this.iterator = PlayQueue.this.playQueue.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public PlayItem next() {
                PlayItem next = this.iterator.next();
                this.currentPlayItem = next;
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                PlayItem playItem = this.currentPlayItem;
                if (playItem != null) {
                    PlayQueue.this.callOnDestroyCallback(playItem);
                    PlayQueue.this.preparedPlayItems.remove(this.currentPlayItem);
                    this.iterator.remove();
                }
            }
        };
    }

    public synchronized boolean enqueue(PlayItem playItem) {
        if (!this.preparedPlayItems.contains(playItem)) {
            Log.e(TAG, "Attempting to enqueue a play item that was never prepared");
            return false;
        }
        if (this.preparedPlayItems.size() <= this.playQueue.size()) {
            Log.e(TAG, "Mismatch between number of play items prepared and enqueued");
            return false;
        }
        if (this.preparedPlayItems.get(this.playQueue.size()).equals(playItem)) {
            return this.playQueue.offer(playItem);
        }
        Log.e(TAG, "Attempting to enqueue a play item that was prepared in the incorrect order");
        return false;
    }

    public synchronized Iterator<PlayItem> enqueuedPlayItems() {
        Iterator<PlayItem> currentlyActivePlayItems;
        currentlyActivePlayItems = currentlyActivePlayItems();
        if (currentlyActivePlayItems.hasNext()) {
            currentlyActivePlayItems.next();
        }
        return currentlyActivePlayItems;
    }

    public synchronized PlayItem getCurrentlyPlayingItem() {
        return this.playQueue.peek();
    }

    public synchronized PlayItem getNextItemToPrepare() {
        if (this.preparedPlayItems.size() <= 1) {
            return null;
        }
        return this.preparedPlayItems.get(1);
    }

    public synchronized PlayItem getPreparingPlayItem() {
        if (this.preparedPlayItems.isEmpty()) {
            return null;
        }
        return this.preparedPlayItems.get(0);
    }

    public synchronized boolean isCurrentlyActive(PlayItem playItem) {
        return this.playQueue.contains(playItem);
    }

    public synchronized boolean isEmpty() {
        return this.playQueue.isEmpty();
    }

    public synchronized boolean prepareToEnqueue(PlayItem playItem) {
        boolean z;
        z = this.preparedPlayItems.size() == 0;
        this.preparedPlayItems.add(playItem);
        return z;
    }

    public synchronized void removePlayItem(PlayItem playItem) {
        try {
            Objects.toString(playItem);
            if (!this.playQueue.contains(playItem)) {
                if (this.preparedPlayItems.contains(playItem)) {
                }
                this.playQueue.remove(playItem);
                this.preparedPlayItems.remove(playItem);
            }
            callOnDestroyCallback(playItem);
            this.playQueue.remove(playItem);
            this.preparedPlayItems.remove(playItem);
        } catch (Throwable th) {
            throw th;
        }
    }
}
