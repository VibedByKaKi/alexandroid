package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface DrmSessionEventListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysLoaded$1(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRemoved$4(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRestored$3(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionAcquired$0(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionManagerError$2(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionReleased$5(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(this, next.listener, 3));
            }
        }

        public void drmKeysRemoved() {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(this, next.listener, 0));
            }
        }

        public void drmKeysRestored() {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(this, next.listener, 2));
            }
        }

        public void drmSessionAcquired() {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(this, next.listener, 1));
            }
        }

        public void drmSessionManagerError(Exception exc) {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new EglRenderer$$ExternalSyntheticLambda6(this, 8, next.listener, exc));
            }
        }

        public void drmSessionReleased() {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                Util.postOrRun(next.handler, new DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(this, next.listener, 4));
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator<ListenerAndHandler> it2 = this.listenerAndHandlers.iterator();
            while (it2.hasNext()) {
                ListenerAndHandler next = it2.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }
    }

    default void onDrmKeysLoaded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionReleased(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionManagerError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }
}
