package com.amazon.alexa.accessory.internal.session;

import com.amazon.alexa.accessory.capabilities.Capability;
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
/* loaded from: classes15.dex */
public class AccessorySessionCapabilityResolver {
    private static final Map<Capability, List<Capability>> CAPABILITY_DEPENDENCY_GRAPH;
    private static final Set<Capability> NON_DEFAULT_CAPABILITIES;

    static {
        HashMap hashMap = new HashMap();
        CAPABILITY_DEPENDENCY_GRAPH = hashMap;
        HashSet hashSet = new HashSet();
        NON_DEFAULT_CAPABILITIES = hashSet;
        Capability capability = Capability.SPEECH_RECOGNITION;
        Capability capability2 = Capability.DEVICE;
        Capability capability3 = Capability.FIRMWARE;
        Capability capability4 = Capability.SYSTEM;
        hashMap.put(capability, Arrays.asList(capability2, capability3, capability4));
        hashMap.put(Capability.BULK_DATA, Arrays.asList(capability2));
        hashMap.put(Capability.TRANSPORT, Arrays.asList(capability2));
        hashMap.put(capability3, Arrays.asList(capability2));
        List list = Collections.EMPTY_LIST;
        hashMap.put(capability2, list);
        hashMap.put(Capability.DEVICE_PROXIMITY, list);
        hashMap.put(Capability.KEY_EXCHANGE, list);
        hashMap.put(Capability.STATE, list);
        hashMap.put(Capability.DIAGNOSTIC, list);
        hashMap.put(Capability.CALLING, list);
        hashMap.put(Capability.CBL, list);
        hashMap.put(Capability.AAMB, list);
        hashMap.put(capability4, list);
        hashMap.put(Capability.CENTRAL, list);
        hashMap.put(Capability.METRICS, list);
        hashMap.put(Capability.FITNESS, list);
        hashMap.put(Capability.INSTRUMENTATION, list);
        hashMap.put(Capability.INPUT_EVENTS, list);
        hashMap.put(Capability.DISPLAY_CONTENT, list);
        hashMap.put(Capability.MEDIA, list);
        Capability capability5 = Capability.SIDEWALK;
        hashMap.put(capability5, list);
        hashMap.put(Capability.HEARING_ENHANCEMENT, list);
        hashMap.put(Capability.NON_HFP_CALLING, list);
        hashMap.put(Capability.NOTIFICATION, list);
        hashMap.put(Capability.CLOUD_PAIRING, list);
        hashMap.put(Capability.ACCESSORY_CONTEXT, list);
        hashMap.put(Capability.WIFI_CONFIG, list);
        hashMap.put(Capability.CAMERA, list);
        hashMap.put(Capability.LCRC, list);
        hashMap.put(Capability.ASSET_TRANSFER, list);
        hashMap.put(Capability.AMBIENT_CONTEXT, Arrays.asList(capability2));
        hashMap.put(Capability.VISION_CAPTURE, Arrays.asList(capability2));
        hashMap.put(Capability.VOICE_STREAMING, list);
        hashMap.put(Capability.TRANSLATION, list);
        hashMap.put(Capability.NATURAL_TURN_DETECTION, list);
        hashMap.put(Capability.WIFI_AWARE, list);
        hashMap.put(Capability.ACCESS_PROOF, Arrays.asList(capability2));
        hashSet.add(capability5);
    }

    private Set<Capability> getDefaultCapabilities() {
        Set<Capability> keySet = CAPABILITY_DEPENDENCY_GRAPH.keySet();
        HashSet hashSet = new HashSet();
        Iterator<Capability> it2 = keySet.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next());
        }
        hashSet.removeAll(NON_DEFAULT_CAPABILITIES);
        return hashSet;
    }

    public Set<Capability> getRequiredCapabilities(List<Capability> list) {
        if (list == null || list.size() == 0) {
            return getDefaultCapabilities();
        }
        HashSet hashSet = new HashSet();
        for (Capability capability : list) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(CAPABILITY_DEPENDENCY_GRAPH.get(capability));
            while (arrayList.size() != 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Capability capability2 = (Capability) arrayList.remove(i);
                    hashSet.add(capability2);
                    arrayList.addAll(CAPABILITY_DEPENDENCY_GRAPH.get(capability2));
                }
            }
        }
        hashSet.addAll(list);
        return hashSet;
    }
}
