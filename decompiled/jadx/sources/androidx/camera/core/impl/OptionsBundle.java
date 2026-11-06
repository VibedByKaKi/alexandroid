package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class OptionsBundle implements Config {
    private static final OptionsBundle EMPTY_BUNDLE;
    protected static final Comparator<Config.Option<?>> ID_COMPARE;
    protected final TreeMap<Config.Option<?>, Map<Config.OptionPriority, Object>> mOptions;

    static {
        OptionsBundle$$ExternalSyntheticLambda0 optionsBundle$$ExternalSyntheticLambda0 = new OptionsBundle$$ExternalSyntheticLambda0();
        ID_COMPARE = optionsBundle$$ExternalSyntheticLambda0;
        EMPTY_BUNDLE = new OptionsBundle(new TreeMap(optionsBundle$$ExternalSyntheticLambda0));
    }

    public OptionsBundle(TreeMap<Config.Option<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.mOptions = treeMap;
    }

    @NonNull
    public static OptionsBundle emptyBundle() {
        return EMPTY_BUNDLE;
    }

    @NonNull
    public static OptionsBundle from(@NonNull Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(ID_COMPARE);
        for (Config.Option<?> option : config.listOptions()) {
            Set<Config.OptionPriority> priorities = config.getPriorities(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Config.Option option, Config.Option option2) {
        return option.getId().compareTo(option2.getId());
    }

    @Override // androidx.camera.core.impl.Config
    public boolean containsOption(@NonNull Config.Option<?> option) {
        return this.mOptions.containsKey(option);
    }

    @Override // androidx.camera.core.impl.Config
    public void findOptions(@NonNull String str, @NonNull Config.OptionMatcher optionMatcher) {
        for (Map.Entry<Config.Option<?>, Map<Config.OptionPriority, Object>> entry : this.mOptions.tailMap(Config.Option.create(str, Void.class)).entrySet()) {
            if (!entry.getKey().getId().startsWith(str) || !optionMatcher.onOptionMatched(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public Config.OptionPriority getOptionPriority(@NonNull Config.Option<?> option) {
        Map<Config.OptionPriority, Object> map = this.mOptions.get(option);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) option, "Option does not exist: ");
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public Set<Config.OptionPriority> getPriorities(@NonNull Config.Option<?> option) {
        Map<Config.OptionPriority, Object> map = this.mOptions.get(option);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public Set<Config.Option<?>> listOptions() {
        return Collections.unmodifiableSet(this.mOptions.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public <ValueT> ValueT retrieveOption(@NonNull Config.Option<ValueT> option) {
        Map<Config.OptionPriority, Object> map = this.mOptions.get(option);
        if (map != null) {
            return (ValueT) map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) option, "Option does not exist: ");
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public <ValueT> ValueT retrieveOptionWithPriority(@NonNull Config.Option<ValueT> option, @NonNull Config.OptionPriority optionPriority) {
        Map<Config.OptionPriority, Object> map = this.mOptions.get(option);
        if (map == null) {
            Gson$$ExternalSyntheticBUOutline0.m((Object) option, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        Single$$ExternalSyntheticBUOutline0.m("Option does not exist: ", option, " with priority=", optionPriority);
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public <ValueT> ValueT retrieveOption(@NonNull Config.Option<ValueT> option, @Nullable ValueT valuet) {
        try {
            return (ValueT) retrieveOption(option);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }
}
