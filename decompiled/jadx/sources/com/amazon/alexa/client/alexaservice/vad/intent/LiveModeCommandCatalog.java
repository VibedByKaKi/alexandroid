package com.amazon.alexa.client.alexaservice.vad.intent;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class LiveModeCommandCatalog {
    private static final String TAG = "LiveModeCommandCatalog";
    private final Map<String, Commands> byLocale = new HashMap();
    private final Context context;

    @Inject
    public LiveModeCommandCatalog(@NonNull Context context) {
        this.context = context;
    }

    @Nullable
    private Commands load(Locale locale) {
        Resources localizedResources = localizedResources(locale);
        if (localizedResources == null) {
            return null;
        }
        Set<String> read = read(localizedResources, R.array.amazon_avs_live_mode_commands_exit, locale);
        Set<String> read2 = read(localizedResources, R.array.amazon_avs_live_mode_commands_mute, locale);
        read2.removeAll(read);
        if (!read2.isEmpty() && !read.isEmpty()) {
            return new Commands(read2, read, 0);
        }
        Log.w(TAG, "No usable Live Mode commands for " + locale);
        return null;
    }

    @Nullable
    private Resources localizedResources(Locale locale) {
        try {
            Configuration configuration = new Configuration(this.context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return this.context.createConfigurationContext(configuration).getResources();
        } catch (RuntimeException e) {
            Log.e(TAG, "Failed to resolve resources for " + locale, e);
            return null;
        }
    }

    private static Set<String> read(Resources resources, int i, Locale locale) {
        HashSet hashSet = new HashSet();
        try {
            for (String str : resources.getStringArray(i)) {
                String normalize = LiveModeCommandNormalizer.normalize(str, locale);
                if (!normalize.isEmpty()) {
                    hashSet.add(normalize);
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Missing command resource for " + locale, e);
            return hashSet;
        }
    }

    @Nullable
    public synchronized Commands get(@Nullable Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (language != null && !language.isEmpty()) {
            String locale2 = locale.toString();
            Commands commands = this.byLocale.get(locale2);
            if (commands != null) {
                return commands;
            }
            Commands load = load(locale);
            if (load != null) {
                this.byLocale.put(locale2, load);
            }
            return load;
        }
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Commands {
        private final Set<String> exit;
        private final Set<String> mute;

        private Commands(Set<String> set, Set<String> set2) {
            this.mute = Collections.unmodifiableSet(set);
            this.exit = Collections.unmodifiableSet(set2);
        }

        public boolean isExit(@NonNull String str) {
            return this.exit.contains(str);
        }

        public boolean isMute(@NonNull String str) {
            return this.mute.contains(str);
        }

        public /* synthetic */ Commands(Set set, Set set2, int i) {
            this(set, set2);
        }
    }
}
