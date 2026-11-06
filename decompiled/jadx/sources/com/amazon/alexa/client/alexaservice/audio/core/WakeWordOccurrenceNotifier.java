package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class WakeWordOccurrenceNotifier {
    private static final String TAG = "WakeWordOccurrenceNotifier";
    private final HashMap<AttachmentIdentifier, WakeWordOccurrenceSubscriber> subscriptions = new HashMap<>();

    @Inject
    public WakeWordOccurrenceNotifier() {
    }

    public void deregisterListener(AttachmentIdentifier attachmentIdentifier) {
        this.subscriptions.remove(attachmentIdentifier);
    }

    public void notify(AttachmentIdentifier attachmentIdentifier, long j) {
        synchronized (this.subscriptions) {
            try {
                if (this.subscriptions.containsKey(attachmentIdentifier)) {
                    this.subscriptions.get(attachmentIdentifier).onWakeWordOccurrence(j);
                } else {
                    this.subscriptions.put(attachmentIdentifier, new WakeWordOccurrenceSubscriber(Long.valueOf(j)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerListener(WakeWordOccurrenceListener wakeWordOccurrenceListener, AttachmentIdentifier attachmentIdentifier) {
        WakeWordOccurrenceSubscriber wakeWordOccurrenceSubscriber;
        synchronized (this.subscriptions) {
            try {
                if (this.subscriptions.containsKey(attachmentIdentifier)) {
                    wakeWordOccurrenceSubscriber = this.subscriptions.get(attachmentIdentifier);
                } else {
                    WakeWordOccurrenceSubscriber wakeWordOccurrenceSubscriber2 = new WakeWordOccurrenceSubscriber(wakeWordOccurrenceListener);
                    this.subscriptions.put(attachmentIdentifier, wakeWordOccurrenceSubscriber2);
                    wakeWordOccurrenceSubscriber = wakeWordOccurrenceSubscriber2;
                }
                wakeWordOccurrenceSubscriber.addListener(wakeWordOccurrenceListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WakeWordOccurrenceSubscriber implements WakeWordOccurrenceListener {
        private WakeWordOccurrenceListener listener;
        private final Queue<Long> occurrences;

        public WakeWordOccurrenceSubscriber(Long l) {
            PriorityQueue priorityQueue = new PriorityQueue();
            this.occurrences = priorityQueue;
            priorityQueue.add(l);
        }

        private void drainQueue() {
            synchronized (this.occurrences) {
                while (!this.occurrences.isEmpty()) {
                    try {
                        this.listener.onWakeWordOccurrence(this.occurrences.poll().longValue());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private boolean hasListener() {
            return this.listener != null;
        }

        public void addListener(WakeWordOccurrenceListener wakeWordOccurrenceListener) {
            if (hasListener()) {
                Log.w(WakeWordOccurrenceNotifier.TAG, "trying to add listener while already have one");
            } else {
                this.listener = wakeWordOccurrenceListener;
                drainQueue();
            }
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.WakeWordOccurrenceListener
        public void onWakeWordOccurrence(long j) {
            if (hasListener()) {
                this.listener.onWakeWordOccurrence(j);
            } else {
                this.occurrences.add(Long.valueOf(j));
            }
        }

        public WakeWordOccurrenceSubscriber(WakeWordOccurrenceListener wakeWordOccurrenceListener) {
            this.occurrences = new PriorityQueue();
            this.listener = wakeWordOccurrenceListener;
        }
    }
}
