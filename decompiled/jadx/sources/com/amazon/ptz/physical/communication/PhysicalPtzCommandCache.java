package com.amazon.ptz.physical.communication;

import android.os.Handler;
import com.amazon.alexa.directive.AlexaDirective;
import com.amazon.ptz.physical.events.PhysicalPtzEvent;
import com.amazon.ptz.util.LogTag;
import com.amazon.ptz.util.Qualifiers;
import com.google.common.cache.Cache;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Nonnull;
import lombok.Generated;
import org.greenrobot.eventbus.EventBus;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PhysicalPtzCommandCache {
    private static final String TAG = LogTag.forClass(PhysicalPtzCommandCache.class);

    @Nonnull
    private EventBus eventBus;

    @Nonnull
    @Qualifiers.UiThread
    private Handler handler;

    @Nonnull
    private Cache<String, AlexaDirective> pendingPtzCommandsCache;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PhysicalPtzCommandCache(@Nonnull Cache<String, AlexaDirective> cache, @Nonnull Handler handler, @Nonnull EventBus eventBus) {
        if (cache == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("pendingPtzCommandsCache is marked non-null but is null");
            throw null;
        }
        if (handler == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("handler is marked non-null but is null");
            throw null;
        }
        if (eventBus == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("eventBus is marked non-null but is null");
            throw null;
        }
        this.pendingPtzCommandsCache = cache;
        this.handler = handler;
        this.eventBus = eventBus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanUpCache() {
        this.pendingPtzCommandsCache.cleanUp();
        if (this.pendingPtzCommandsCache.size() == 0) {
            this.eventBus.post(PhysicalPtzEvent.MOTION_ENDED);
            return;
        }
        long size = this.pendingPtzCommandsCache.size();
        StringBuilder sb = new StringBuilder("Cache still contain [");
        sb.append(size);
        sb.append("] pending commands. Ignoring stop animation.");
    }

    public void onNewCommandSent(String str, AlexaDirective alexaDirective) {
        StringBuilder sb = new StringBuilder("Adding correlationToken[");
        sb.append(str);
        sb.append("] to cache");
        this.pendingPtzCommandsCache.put(str, alexaDirective);
        this.eventBus.post(PhysicalPtzEvent.DIRECTIVE_SENT);
        this.handler.postDelayed(new Runnable() { // from class: com.amazon.ptz.physical.communication.PhysicalPtzCommandCache.1
            @Override // java.lang.Runnable
            public void run() {
                PhysicalPtzCommandCache.this.cleanUpCache();
            }
        }, 5000L);
    }

    public void onResponseReceived(String str) {
        StringBuilder sb = new StringBuilder("Removing correlationToken[");
        sb.append(str);
        sb.append("] from cache");
        if (this.pendingPtzCommandsCache.getIfPresent(str) != null) {
            this.pendingPtzCommandsCache.invalidate(str);
            cleanUpCache();
        } else {
            StringBuilder sb2 = new StringBuilder("correlationToken[");
            sb2.append(str);
            sb2.append("] not found in the cache.");
        }
    }
}
