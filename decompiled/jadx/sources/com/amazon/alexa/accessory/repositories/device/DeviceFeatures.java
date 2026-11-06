package com.amazon.alexa.accessory.repositories.device;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Device;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DeviceFeatures {
    private static final int FEATURES_PER_INT = 32;
    public static final int FEATURE_ID_AUDIO_PLAYBACK_STATUS_OBSERVER = 18;
    private static final int INITIAL_FEATURE_NUMBER = 1;
    private static final String TAG = "DeviceFeatures";
    private List<DeviceFeature> features;

    public DeviceFeatures(List<DeviceFeature> list) {
        Preconditions.notNull(list, CamerasRouteParameter.FEATURES);
        this.features = list;
    }

    public static DeviceFeatures fromProtobuf(Device.DeviceFeatures deviceFeatures) {
        Preconditions.notNull(deviceFeatures, CamerasRouteParameter.FEATURES);
        LinkedList newLinkedList = Lists.newLinkedList();
        Map<Integer, Device.FeatureProperties> indexPropertiesById = indexPropertiesById(deviceFeatures.getFeaturePropertiesList());
        int i = 0;
        processFeatureBank(deviceFeatures.getFeatures(), 0, newLinkedList, indexPropertiesById);
        try {
            List<Integer> extendedFeaturesList = deviceFeatures.getExtendedFeaturesList();
            while (i < extendedFeaturesList.size()) {
                int i2 = i + 1;
                processFeatureBank(extendedFeaturesList.get(i).intValue(), i2, newLinkedList, indexPropertiesById);
                i = i2;
            }
        } catch (Exception unused) {
            Logger.d("%s Cannot access extended_features field in DeviceFeatures", TAG);
        }
        return new DeviceFeatures(newLinkedList);
    }

    @VisibleForTesting
    public static int generateId(int i, int i2) {
        return BitVector$$ExternalSyntheticOutline0.m(i, 32, i2, 1);
    }

    private static Map<Integer, Device.FeatureProperties> indexPropertiesById(List<Device.FeatureProperties> list) {
        HashMap hashMap = new HashMap();
        for (Device.FeatureProperties featureProperties : list) {
            if (hashMap.containsKey(Integer.valueOf(featureProperties.getFeatureId()))) {
                Logger.e("%s: Found multiple properties with the same id: %d. Using the last version.", TAG, Integer.valueOf(featureProperties.getFeatureId()));
            }
            hashMap.put(Integer.valueOf(featureProperties.getFeatureId()), featureProperties);
        }
        return hashMap;
    }

    private static void processFeatureBank(int i, int i2, List<DeviceFeature> list, Map<Integer, Device.FeatureProperties> map) {
        for (int i3 = 0; i3 < 32; i3++) {
            if (((1 << i3) & i) != 0) {
                int generateId = generateId(i2, i3);
                list.add(new DeviceFeature(generateId, map.get(Integer.valueOf(generateId))));
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return Objects.equals(this.features, ((DeviceFeatures) obj).features);
    }

    public List<DeviceFeature> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        return Objects.hash(this.features);
    }
}
