package com.amazon.alexa.mobilytics.timeline;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.configuration.Constants;
import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import com.google.common.base.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class TimelineStorage {
    public static final String PERSISTANCE_KEY_TL_KEY_SET = "tl_key_set";
    public static final String PERSISTANCE_KEY_TL_SESSION_SET = "tl_set";
    private final Map<String, TimelineEvent> map = new HashMap();
    private final PersistentStorage sessionStorage;
    private final PersistentStorage timelineStorage;

    @NonNull
    private final String tlSessionId;

    @Inject
    public TimelineStorage(@NonNull PersistentStorage.Factory factory) {
        this.sessionStorage = ((PersistentStorage.Factory) Preconditions.checkNotNull(factory)).create(Constants.MOBILYTICS_SESSION_STORAGE);
        String generateTimelineSessionId = generateTimelineSessionId();
        this.tlSessionId = generateTimelineSessionId;
        this.timelineStorage = ((PersistentStorage.Factory) Preconditions.checkNotNull(factory)).create(generateTimelineSessionId);
        storeTimelineSessionId(generateTimelineSessionId);
    }

    @NonNull
    private String generateTimelineSessionId() {
        return "mobilytics.timeline_" + String.valueOf(System.currentTimeMillis());
    }

    private void persistanceClear(String str) {
        Set<String> stringSet = this.timelineStorage.getStringSet(PERSISTANCE_KEY_TL_KEY_SET, null);
        if (stringSet != null && stringSet.contains(str)) {
            stringSet.remove(str);
        }
        PersistentStorage.Transaction edit = this.timelineStorage.edit();
        if (stringSet == null || stringSet.isEmpty()) {
            edit.remove(PERSISTANCE_KEY_TL_KEY_SET);
        } else {
            edit.set(PERSISTANCE_KEY_TL_KEY_SET, stringSet);
        }
        edit.remove(str);
        edit.commit();
    }

    private void persistanceWrite(String str, TimelineEvent timelineEvent) {
        Set<String> stringSet = this.timelineStorage.getStringSet(PERSISTANCE_KEY_TL_KEY_SET, null);
        if (stringSet == null) {
            stringSet = new LinkedHashSet<>();
        }
        if (!stringSet.contains(str)) {
            stringSet.add(str);
        }
        this.timelineStorage.edit().set(str, timelineEvent.serializeToMap()).set(PERSISTANCE_KEY_TL_KEY_SET, stringSet).commit();
    }

    private void storeTimelineSessionId(@NonNull String str) {
        if (TextUtils.isEmpty(str) || this.sessionStorage == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.sessionStorage.getStringSet(PERSISTANCE_KEY_TL_SESSION_SET, new LinkedHashSet()));
        hashSet.add(str);
        this.sessionStorage.edit().set(PERSISTANCE_KEY_TL_SESSION_SET, hashSet).commit();
    }

    public boolean doesExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.map.containsKey(str);
    }

    public TimelineEvent get(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return this.map.get(getKey(str, str2));
    }

    public String getCurrentTimelineSessionId() {
        return this.tlSessionId;
    }

    public Iterator<TimelineEvent> getIterator() {
        return this.map.values().iterator();
    }

    public String getKey(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return a$$ExternalSyntheticOutline0.m$1(str, ".", str2);
    }

    public boolean isEmpty() {
        Map<String, TimelineEvent> map = this.map;
        return map == null || map.isEmpty();
    }

    public Set<String> readTimelineSessionSet() {
        PersistentStorage persistentStorage = this.sessionStorage;
        if (persistentStorage != null) {
            return persistentStorage.getStringSet(PERSISTANCE_KEY_TL_SESSION_SET, null);
        }
        return null;
    }

    public void remove(String str) {
        if (TextUtils.isEmpty(str) || !this.map.containsKey(str)) {
            return;
        }
        this.map.remove(str);
        persistanceClear(str);
    }

    public void saveSessionSet(Set<String> set) {
        PersistentStorage persistentStorage = this.sessionStorage;
        if (persistentStorage != null) {
            persistentStorage.edit().remove(PERSISTANCE_KEY_TL_SESSION_SET).set(PERSISTANCE_KEY_TL_SESSION_SET, set).commit();
        }
    }

    public int size() {
        Map<String, TimelineEvent> map = this.map;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public boolean store(String str, String str2, TimelineEvent timelineEvent) {
        if (timelineEvent == null) {
            return false;
        }
        String key = getKey(str, str2);
        if (TextUtils.isEmpty(key) || this.map.containsKey(key)) {
            return false;
        }
        this.map.put(key, timelineEvent);
        persistanceWrite(key, timelineEvent);
        return true;
    }

    public boolean doesExist(String str, String str2) {
        return doesExist(getKey(str, str2));
    }

    public void persistanceWrite(TimelineEvent timelineEvent) {
        persistanceWrite(getKey(timelineEvent.timelineName(), timelineEvent.timelineNamespace()), timelineEvent);
    }
}
