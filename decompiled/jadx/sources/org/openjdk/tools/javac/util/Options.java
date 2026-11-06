package org.openjdk.tools.javac.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.openjdk.tools.javac.main.Option;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Options {
    public static final Context.Key<Options> optionsKey = new Context.Key<>();
    private static final long serialVersionUID = 0;
    private List<Runnable> listeners = List.nil();
    private LinkedHashMap<String, String> values = new LinkedHashMap<>();

    public Options(Context context) {
        context.put((Context.Key<Context.Key<Options>>) optionsKey, (Context.Key<Options>) this);
    }

    public static Options instance(Context context) {
        Options options = (Options) context.get(optionsKey);
        return options == null ? new Options(context) : options;
    }

    public void addListener(Runnable runnable) {
        this.listeners = this.listeners.prepend(runnable);
    }

    public String get(Option option) {
        return this.values.get(option.primaryName);
    }

    public boolean getBoolean(String str, boolean z) {
        String str2 = get(str);
        return str2 == null ? z : Boolean.parseBoolean(str2);
    }

    public boolean isLintSet(String str) {
        Option option = Option.XLINT_CUSTOM;
        if (isSet(option, str)) {
            return true;
        }
        if (!isSet(Option.XLINT) && !isSet(option, "all")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("-");
        sb.append(str);
        return isUnset(option, sb.toString());
    }

    public boolean isSet(Option option, String str) {
        LinkedHashMap<String, String> linkedHashMap = this.values;
        StringBuilder sb = new StringBuilder();
        sb.append(option.primaryName);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) != null;
    }

    public boolean isUnset(Option option, String str) {
        LinkedHashMap<String, String> linkedHashMap = this.values;
        StringBuilder sb = new StringBuilder();
        sb.append(option.primaryName);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) == null;
    }

    public Set<String> keySet() {
        return this.values.keySet();
    }

    public void notifyListeners() {
        Iterator<Runnable> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
    }

    public void put(Option option, String str) {
        this.values.put(option.primaryName, str);
    }

    public void putAll(Options options) {
        this.values.putAll(options.values);
    }

    public void remove(String str) {
        this.values.remove(str);
    }

    public int size() {
        return this.values.size();
    }

    public void put(String str, String str2) {
        this.values.put(str, str2);
    }

    public String get(String str) {
        return this.values.get(str);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean isSet(Option option) {
        return this.values.get(option.primaryName) != null;
    }

    public boolean isUnset(Option option) {
        return this.values.get(option.primaryName) == null;
    }

    public boolean isSet(String str) {
        return this.values.get(str) != null;
    }

    public boolean isUnset(String str) {
        return this.values.get(str) == null;
    }
}
