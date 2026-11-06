package com.amazon.alexa.presence.library.storage;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PersistentLocalStorage {
    private static final int CLEAR_MAX_RETRY = 3;
    public static final String FILE_NAME = "presence_domain_preferences";
    public static final String PREFERENCE_KEY_PRESENCE_ENABLED = "presenceEnabled";
    private static final String TAG = "com.amazon.alexa.presence.library.storage.PersistentLocalStorage";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PresenceDataStore {
        boolean addDomain(String str, Context context);

        void clearStorage(Context context);

        Set<String> getDomains(Context context);

        boolean presenceRequested(Context context);

        boolean removeDomain(String str, Context context);
    }

    private PersistentLocalStorage() {
    }

    public static boolean addDomain(String str, Context context) {
        boolean z;
        Set<String> set;
        a$$ExternalSyntheticOutline0.m3m("Adding domain: ", str, TAG);
        Set<String> domains = getDomains(context);
        if (domains == null || domains.isEmpty()) {
            Set<String> singleton = Collections.singleton(str);
            z = true;
            set = singleton;
        } else {
            HashSet hashSet = new HashSet(domains);
            hashSet.add(str);
            z = false;
            set = hashSet;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(FILE_NAME, 0).edit();
        edit.putStringSet(PREFERENCE_KEY_PRESENCE_ENABLED, set);
        edit.apply();
        return z;
    }

    public static void clearStorage(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(FILE_NAME, 0).edit();
        edit.clear();
        for (int i = 0; i < 3 && !edit.commit(); i++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<String> getDomains(Context context) {
        return Collections.unmodifiableSet(context.getSharedPreferences(FILE_NAME, 0).getStringSet(PREFERENCE_KEY_PRESENCE_ENABLED, new HashSet()));
    }

    public static PresenceDataStore getWrapper() {
        return new Wrapper(0);
    }

    public static boolean presenceRequested(Context context) {
        Set<String> domains = getDomains(context);
        return (domains == null || domains.isEmpty()) ? false : true;
    }

    public static boolean removeDomain(String str, Context context) {
        Set<String> set;
        boolean z;
        Set<String> set2;
        a$$ExternalSyntheticOutline0.m3m("Removing domain: ", str, TAG);
        Set<String> domains = getDomains(context);
        if (domains == null || domains.isEmpty()) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(domains);
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            set = hashSet;
            if (isEmpty) {
                z = true;
                set2 = hashSet;
                SharedPreferences.Editor edit = context.getSharedPreferences(FILE_NAME, 0).edit();
                edit.putStringSet(PREFERENCE_KEY_PRESENCE_ENABLED, set2);
                edit.apply();
                return z;
            }
        }
        z = false;
        set2 = set;
        SharedPreferences.Editor edit2 = context.getSharedPreferences(FILE_NAME, 0).edit();
        edit2.putStringSet(PREFERENCE_KEY_PRESENCE_ENABLED, set2);
        edit2.apply();
        return z;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Wrapper implements PresenceDataStore {
        public /* synthetic */ Wrapper(int i) {
            this();
        }

        @Override // com.amazon.alexa.presence.library.storage.PersistentLocalStorage.PresenceDataStore
        public boolean addDomain(String str, Context context) {
            return PersistentLocalStorage.addDomain(str, context);
        }

        @Override // com.amazon.alexa.presence.library.storage.PersistentLocalStorage.PresenceDataStore
        public void clearStorage(Context context) {
            PersistentLocalStorage.clearStorage(context);
        }

        @Override // com.amazon.alexa.presence.library.storage.PersistentLocalStorage.PresenceDataStore
        public Set<String> getDomains(Context context) {
            return PersistentLocalStorage.getDomains(context);
        }

        @Override // com.amazon.alexa.presence.library.storage.PersistentLocalStorage.PresenceDataStore
        public boolean presenceRequested(Context context) {
            return PersistentLocalStorage.presenceRequested(context);
        }

        @Override // com.amazon.alexa.presence.library.storage.PersistentLocalStorage.PresenceDataStore
        public boolean removeDomain(String str, Context context) {
            return PersistentLocalStorage.removeDomain(str, context);
        }

        private Wrapper() {
        }
    }
}
