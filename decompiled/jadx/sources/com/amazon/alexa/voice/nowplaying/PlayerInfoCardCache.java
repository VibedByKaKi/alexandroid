package com.amazon.alexa.voice.nowplaying;

import com.amazon.alexa.voice.ui.player.PlayerCardModel;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class PlayerInfoCardCache {
    private static final int DEFAULT_CACHE_SIZE = 5;
    private final Queue<String> audioItemIds;
    private final int cacheSize;
    private final Map<String, PlayerCardModel> playerCardsCache;

    private PlayerInfoCardCache(int i) {
        this.cacheSize = i;
        this.playerCardsCache = new HashMap();
        this.audioItemIds = new LinkedList();
    }

    public synchronized boolean contains(String str) {
        return this.playerCardsCache.containsKey(str);
    }

    public synchronized PlayerCardModel get(String str) {
        return this.playerCardsCache.get(str);
    }

    public synchronized void put(PlayerCardModel playerCardModel) {
        try {
            String audioItemId = playerCardModel.getAudioItemId();
            if (this.audioItemIds.contains(audioItemId)) {
                this.audioItemIds.remove(audioItemId);
            }
            this.audioItemIds.add(audioItemId);
            this.playerCardsCache.put(audioItemId, playerCardModel);
            if (this.playerCardsCache.size() > this.cacheSize) {
                this.playerCardsCache.remove(this.audioItemIds.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public PlayerInfoCardCache() {
        this(5);
    }
}
