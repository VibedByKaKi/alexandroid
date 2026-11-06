package com.amazon.alexa.client.alexaservice.base.interactions.channels;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioTaskBehavior;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioInteractionLifecycle;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.Channel;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelAlwaysEnqueuePolicy;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelAlwaysReplacePolicy;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Channels {
    private static final String TAG = "Channels";
    private final ChannelAlwaysEnqueuePolicy channelAlwaysEnqueuePolicy;
    private final ChannelAlwaysReplacePolicy channelAlwaysReplacePolicy;
    private final Map<ChannelType, AudioChannel> channels;
    private final Set<Listener> listeners;
    private final Map<AudioChannel, ChannelSchedulePolicy> schedulePolicies;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.base.interactions.channels.Channels$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaAudioTaskBehavior;

        static {
            int[] iArr = new int[AlexaAudioTaskBehavior.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaAudioTaskBehavior = iArr;
            try {
                iArr[AlexaAudioTaskBehavior.ENQUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaAudioTaskBehavior[AlexaAudioTaskBehavior.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onChannelsUpdate();
    }

    @VisibleForTesting
    public Channels(ChannelAlwaysEnqueuePolicy channelAlwaysEnqueuePolicy, ChannelAlwaysReplacePolicy channelAlwaysReplacePolicy) {
        this.channels = new TreeMap();
        this.schedulePolicies = new HashMap();
        this.listeners = new CopyOnWriteArraySet();
        this.channelAlwaysEnqueuePolicy = channelAlwaysEnqueuePolicy;
        this.channelAlwaysReplacePolicy = channelAlwaysReplacePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyChannelsChanged() {
        synchronized (this.listeners) {
            try {
                Iterator<Listener> it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onChannelsUpdate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void add(ChannelType channelType, AudioInteractionLifecycle audioInteractionLifecycle, AlexaAudioTaskBehavior alexaAudioTaskBehavior) {
        try {
            if (this.channels.containsKey(channelType)) {
                AudioChannel audioChannel = this.channels.get(channelType);
                int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaAudioTaskBehavior[alexaAudioTaskBehavior.ordinal()];
                if (i == 1) {
                    this.channelAlwaysEnqueuePolicy.schedule(audioChannel, audioInteractionLifecycle);
                } else if (i != 2) {
                    this.schedulePolicies.get(audioChannel).schedule(audioChannel, audioInteractionLifecycle);
                } else {
                    this.channelAlwaysReplacePolicy.schedule(audioChannel, audioInteractionLifecycle);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void addChannel(AudioChannel audioChannel, ChannelSchedulePolicy channelSchedulePolicy) {
        audioChannel.registerListener(new ChannelListener(this, 0));
        this.channels.put(audioChannel.getType(), audioChannel);
        this.schedulePolicies.put(audioChannel, channelSchedulePolicy);
    }

    public synchronized void backgroundAllChannels() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().backgroundAll();
        }
    }

    public synchronized void backgroundAllChannelsButTopInteraction() {
        try {
            boolean z = false;
            for (AudioChannel audioChannel : this.channels.values()) {
                if (audioChannel.isEmpty() || z) {
                    audioChannel.backgroundAll();
                } else {
                    audioChannel.backgroundAllButTop();
                    z = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
    }

    public synchronized void clearAllChannelsRequiringAudioFocus() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().clearAllInteractionsRequiringAudioFocus();
        }
    }

    public synchronized boolean contains(InteractionIdentifier interactionIdentifier) {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(interactionIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public void deregisterListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public synchronized void foregroundTopInteraction() {
        if (!isEmpty()) {
            peek().enterForeground();
        }
    }

    public synchronized Set<AudioInteractionLifecycle> getAllInteractions() {
        HashSet hashSet;
        hashSet = new HashSet();
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().getAllInteractions());
        }
        return hashSet;
    }

    @VisibleForTesting
    public AudioChannel getChannelForInteractionIdentifier(InteractionIdentifier interactionIdentifier) {
        for (AudioChannel audioChannel : this.channels.values()) {
            if (audioChannel.contains(interactionIdentifier)) {
                return audioChannel;
            }
        }
        return null;
    }

    public synchronized Map<ChannelType, ChannelState> getStateReport() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (ChannelType channelType : this.channels.keySet()) {
            ChannelState channelState = this.channels.get(channelType).getChannelState();
            if (channelState != null) {
                hashMap.put(channelType, channelState);
            }
        }
        return hashMap;
    }

    public synchronized boolean hasInteractionsRequiringAudioFocus() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().hasAnyInteractionsRequiringAudioFocus()) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isEmpty() {
        boolean z;
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        z = true;
        while (it2.hasNext()) {
            z &= it2.next().isEmpty();
        }
        return z;
    }

    public synchronized void pauseAllChannels() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().pauseAll();
        }
    }

    public synchronized AudioInteractionLifecycle peek() {
        AudioChannel next;
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!next.isEmpty()) {
            }
        }
        throw new IllegalStateException("Must call isEmpty before calling peek.");
        return next.peek();
    }

    public synchronized AudioInteractionLifecycle pop() {
        AudioChannel next;
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!next.isEmpty()) {
            }
        }
        throw new IllegalStateException("Must call isEmpty before calling pop.");
        return next.pop();
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
    }

    public synchronized void remove(InteractionIdentifier interactionIdentifier) {
        AudioChannel channelForInteractionIdentifier = getChannelForInteractionIdentifier(interactionIdentifier);
        if (channelForInteractionIdentifier != null) {
            this.schedulePolicies.get(channelForInteractionIdentifier).unschedule(channelForInteractionIdentifier, interactionIdentifier);
        }
    }

    public synchronized boolean requiresAudioFocus(ChannelType channelType) {
        AudioChannel audioChannel = this.channels.get(channelType);
        if (audioChannel != null) {
            return audioChannel.hasAnyInteractionsRequiringAudioFocus();
        }
        Log.w(TAG, "requiresAudioFocus: no channel found for " + channelType.name());
        return false;
    }

    public synchronized void stopAllChannels() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().stopAll();
        }
    }

    public synchronized void stopAllChannelsRequiringAudioFocus() {
        Iterator<AudioChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().stopAllInteractionsRequiringAudioFocus();
        }
    }

    public synchronized void stopContentChannel() {
        for (AudioChannel audioChannel : this.channels.values()) {
            if (ChannelType.CONTENT.equals(audioChannel.getType())) {
                audioChannel.stopAll();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ChannelListener implements Channel.Listener {
        private ChannelListener() {
        }

        @Override // com.amazon.alexa.client.alexaservice.base.interactions.channels.Channel.Listener
        public void onUpdated() {
            Channels.this.notifyChannelsChanged();
        }

        public /* synthetic */ ChannelListener(Channels channels, int i) {
            this();
        }
    }

    public Channels() {
        this(ChannelAlwaysEnqueuePolicy.create(), ChannelAlwaysReplacePolicy.create());
    }
}
