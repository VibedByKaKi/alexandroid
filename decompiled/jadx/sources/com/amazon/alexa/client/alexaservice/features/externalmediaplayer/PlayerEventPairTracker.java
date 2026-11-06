package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.text.TextUtils;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlayerEventPairTracker {
    private static final int MAX_QUEUE_SIZE = 5;
    private final LinkedList<SessionEventPairTracker> sessionEventTrackers = new LinkedList<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EventPair {
        final PlayerEvent start;
        final PlayerEvent stop;
        static final Map<PlayerEvent, EventPair> START_EVENT_MAPPING = new HashMap();
        static final Set<PlayerEvent> STOP_EVENTS = new HashSet();
        private static final EventPair PLAYBACK = new EventPair(PlayerEvent.PLAYBACK_STARTED, PlayerEvent.PLAYBACK_STOPPED);
        private static final EventPair SESSION = new EventPair(PlayerEvent.PLAYBACK_SESSION_STARTED, PlayerEvent.PLAYBACK_SESSION_ENDED);

        private EventPair(PlayerEvent playerEvent, PlayerEvent playerEvent2) {
            this.start = playerEvent;
            this.stop = playerEvent2;
            START_EVENT_MAPPING.put(playerEvent, this);
            STOP_EVENTS.add(playerEvent2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SessionEventPairTracker {
        final List<EventPair> eventPairs = new ArrayList();
        final PlaybackSessionIdentifier sessionId;

        public SessionEventPairTracker(PlaybackSessionIdentifier playbackSessionIdentifier) {
            this.sessionId = playbackSessionIdentifier;
        }

        public List<PlayerEvent> getStopEvents() {
            ArrayList arrayList = new ArrayList();
            Iterator<EventPair> it2 = this.eventPairs.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().stop);
            }
            return arrayList;
        }

        public boolean trackEvent(PlayerEvent playerEvent) {
            for (EventPair eventPair : this.eventPairs) {
                if (playerEvent == eventPair.start) {
                    return false;
                }
                if (playerEvent == eventPair.stop) {
                    this.eventPairs.remove(eventPair);
                    return true;
                }
            }
            if (EventPair.STOP_EVENTS.contains(playerEvent)) {
                return false;
            }
            EventPair eventPair2 = EventPair.START_EVENT_MAPPING.get(playerEvent);
            if (eventPair2 != null) {
                this.eventPairs.add(eventPair2);
            }
            return true;
        }
    }

    private SessionEventPairTracker findTracker(PlaybackSessionIdentifier playbackSessionIdentifier) {
        Iterator<SessionEventPairTracker> it2 = this.sessionEventTrackers.iterator();
        while (it2.hasNext()) {
            SessionEventPairTracker next = it2.next();
            if (next.sessionId.equals(playbackSessionIdentifier)) {
                return next;
            }
        }
        return null;
    }

    private SessionEventPairTracker getTracker(PlaybackSessionIdentifier playbackSessionIdentifier) {
        SessionEventPairTracker findTracker = findTracker(playbackSessionIdentifier);
        if (findTracker != null) {
            return findTracker;
        }
        if (this.sessionEventTrackers.size() >= 5) {
            this.sessionEventTrackers.removeFirst();
        }
        this.sessionEventTrackers.addLast(new SessionEventPairTracker(playbackSessionIdentifier));
        return this.sessionEventTrackers.peekLast();
    }

    public List<PlaybackSessionIdentifier> getInactiveSessions() {
        if (this.sessionEventTrackers.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        PlaybackSessionIdentifier playbackSessionIdentifier = this.sessionEventTrackers.peekLast().sessionId;
        ArrayList arrayList = new ArrayList();
        Iterator<SessionEventPairTracker> it2 = this.sessionEventTrackers.iterator();
        while (it2.hasNext()) {
            SessionEventPairTracker next = it2.next();
            if (!next.sessionId.equals(playbackSessionIdentifier)) {
                arrayList.add(next.sessionId);
            }
        }
        return arrayList;
    }

    public List<PlayerEvent> getStopEvents(PlaybackSessionIdentifier playbackSessionIdentifier) {
        SessionEventPairTracker findTracker = findTracker(playbackSessionIdentifier);
        return findTracker == null ? Collections.EMPTY_LIST : findTracker.getStopEvents();
    }

    public boolean trackEvent(PlaybackSessionIdentifier playbackSessionIdentifier, PlayerEvent playerEvent) {
        if (playbackSessionIdentifier.equals(PlaybackSessionIdentifier.NONE) || TextUtils.isEmpty(playbackSessionIdentifier.getValue())) {
            return true;
        }
        return getTracker(playbackSessionIdentifier).trackEvent(playerEvent);
    }
}
