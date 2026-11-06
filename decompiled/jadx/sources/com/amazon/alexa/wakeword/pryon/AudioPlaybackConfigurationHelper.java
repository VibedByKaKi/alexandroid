package com.amazon.alexa.wakeword.pryon;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.pryon.android.asr.PryonLite2000;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioPlaybackConfigurationHelper {
    private static final Map<Integer, List<PryonLite2000.ClientProperty>> AUDIO_ATTRIBUTES_TO_CLIENT_PROPERTIES;

    @VisibleForTesting
    static final Set<PryonLite2000.ClientProperty> CLIENT_PROPERTIES;
    private static final String TAG = "AudioPlaybackConfigurationHelper";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InstanceHolder {
        private static final AudioPlaybackConfigurationHelper INSTANCE = new AudioPlaybackConfigurationHelper(0);

        private InstanceHolder() {
        }
    }

    static {
        PryonLite2000.ClientProperty clientProperty = PryonLite2000.ClientProperty.AUDIO_PLAYBACK;
        PryonLite2000.ClientProperty clientProperty2 = PryonLite2000.ClientProperty.ALARM_STATE;
        PryonLite2000.ClientProperty clientProperty3 = PryonLite2000.ClientProperty.MEDIA_PLAYER_STATE;
        PryonLite2000.ClientProperty clientProperty4 = PryonLite2000.ClientProperty.EARCON_PLAYER_STATE;
        PryonLite2000.ClientProperty clientProperty5 = PryonLite2000.ClientProperty.TTS_PLAYER_STATE;
        CLIENT_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(clientProperty, clientProperty2, clientProperty3, clientProperty4, clientProperty5)));
        AUDIO_ATTRIBUTES_TO_CLIENT_PROPERTIES = new HashMap();
        addAttributeToClientProperties(1, clientProperty3);
        addAttributeToClientProperties(16);
        addAttributeToClientProperties(11, clientProperty5);
        addAttributeToClientProperties(4, clientProperty2);
        addAttributeToClientProperties(6, clientProperty2);
        addAttributeToClientProperties(3, clientProperty2);
        addAttributeToClientProperties(14);
        addAttributeToClientProperties(5, clientProperty4);
        addAttributeToClientProperties(10, clientProperty4);
        addAttributeToClientProperties(2);
        addAttributeToClientProperties(13, clientProperty4);
        addAttributeToClientProperties(7, clientProperty4);
        addAttributeToClientProperties(8, clientProperty4);
        addAttributeToClientProperties(9, clientProperty4);
    }

    public /* synthetic */ AudioPlaybackConfigurationHelper(int i) {
        this();
    }

    private static void addAttributeToClientProperties(Integer num, @Nullable PryonLite2000.ClientProperty clientProperty) {
        ArrayList arrayList = new ArrayList(Arrays.asList(PryonLite2000.ClientProperty.AUDIO_PLAYBACK));
        if (clientProperty != null) {
            arrayList.add(clientProperty);
        }
        AUDIO_ATTRIBUTES_TO_CLIENT_PROPERTIES.put(num, arrayList);
    }

    public static AudioPlaybackConfigurationHelper getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private void initClientProperty(Map<PryonLite2000.ClientProperty, Integer> map, int i) {
        Iterator<PryonLite2000.ClientProperty> it2 = CLIENT_PROPERTIES.iterator();
        while (it2.hasNext()) {
            map.put(it2.next(), Integer.valueOf(i));
        }
    }

    private void setClientProperty(Map<PryonLite2000.ClientProperty, Integer> map, PryonLite2000.ClientProperty clientProperty) {
        map.put(clientProperty, 1);
    }

    public Map<PryonLite2000.ClientProperty, Integer> getClientPropertiesMap(AudioManager audioManager) {
        HashMap hashMap = new HashMap();
        List<AudioPlaybackConfiguration> activePlaybackConfigurations = audioManager.getActivePlaybackConfigurations();
        if (activePlaybackConfigurations.isEmpty()) {
            Log.i(TAG, "No audio being detected");
            initClientProperty(hashMap, 0);
            return Collections.unmodifiableMap(hashMap);
        }
        if (activePlaybackConfigurations.size() == 1 && activePlaybackConfigurations.get(0).getAudioAttributes().getUsage() == 0) {
            Log.i(TAG, "Attribute COMMON_UNKNOWN is detected");
            initClientProperty(hashMap, -1);
            return Collections.unmodifiableMap(hashMap);
        }
        initClientProperty(hashMap, 0);
        Iterator<AudioPlaybackConfiguration> it2 = activePlaybackConfigurations.iterator();
        while (it2.hasNext()) {
            int usage = it2.next().getAudioAttributes().getUsage();
            Log.i(TAG, String.format("Audio attribute %d detected", Integer.valueOf(usage)));
            Map<Integer, List<PryonLite2000.ClientProperty>> map = AUDIO_ATTRIBUTES_TO_CLIENT_PROPERTIES;
            if (map.containsKey(Integer.valueOf(usage))) {
                for (PryonLite2000.ClientProperty clientProperty : map.get(Integer.valueOf(usage))) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder("Update client property with group Id ");
                    sb.append(clientProperty.groupId);
                    sb.append(" and property Id ");
                    Automotive$$ExternalSyntheticOutline0.m(str, clientProperty.propertyId, sb);
                    setClientProperty(hashMap, clientProperty);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private AudioPlaybackConfigurationHelper() {
    }

    private static void addAttributeToClientProperties(Integer num) {
        addAttributeToClientProperties(num, null);
    }
}
