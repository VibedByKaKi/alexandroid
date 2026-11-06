package com.amazon.alexa.client.alexaservice.base.system;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.SettingsListener;
import com.amazon.alexa.client.alexaservice.base.events.UpdateSettingsEvent;
import com.amazon.alexa.client.alexaservice.base.system.payload.Setting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SettingsAuthority {
    private static final String TAG = "SettingsAuthority";
    private final AlexaClientEventBus eventBus;
    private final Set<SettingsListener> listeners = new CopyOnWriteArraySet();

    @Inject
    public SettingsAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private static Map<String, String> toMap(List<Setting> list) {
        HashMap hashMap = new HashMap();
        for (Setting setting : list) {
            if (setting != null && setting.getKey() != null) {
                hashMap.put(setting.getKey(), setting.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void deregisterListener(@NonNull SettingsListener settingsListener) {
        this.listeners.remove(settingsListener);
    }

    @VisibleForTesting
    public int getListenerCount() {
        return this.listeners.size();
    }

    @Subscribe
    public void on(UpdateSettingsEvent updateSettingsEvent) {
        if (updateSettingsEvent == null || updateSettingsEvent.getSettings() == null || updateSettingsEvent.getSettings().isEmpty()) {
            Log.w(TAG, "UpdateSettingsEvent empty - skipping dispatch.");
            return;
        }
        Map<String, String> map = toMap(updateSettingsEvent.getSettings());
        if (map.isEmpty()) {
            Log.w(TAG, "UpdateSettingsEvent contained no valid entries - skipping dispatch.");
            return;
        }
        this.listeners.size();
        Objects.toString(map.keySet());
        Iterator<SettingsListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onSettingsUpdated(map);
            } catch (Exception e) {
                Log.e(TAG, "Failed to deliver UpdateSettings to a listener; continuing.", e);
            }
        }
    }

    public void registerListener(@NonNull SettingsListener settingsListener) {
        this.listeners.add(settingsListener);
    }

    public void teardown() {
        this.eventBus.unregister(this);
        this.listeners.clear();
    }
}
