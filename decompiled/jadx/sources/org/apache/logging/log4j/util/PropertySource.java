package org.apache.logging.log4j.util;

import com.amazon.alexa.auth.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.spi.DefaultThreadContextMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface PropertySource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Comparator implements java.util.Comparator<PropertySource>, Serializable {
        static final Comparator INSTANCE = new Comparator();
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        public int compare(PropertySource propertySource, PropertySource propertySource2) {
            Objects.requireNonNull(propertySource);
            int priority = propertySource.getPriority();
            Objects.requireNonNull(propertySource2);
            return Integer.compare(priority, propertySource2.getPriority());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Util {
        private static final Map<CharSequence, List<CharSequence>> CACHE;
        private static final Pattern PREFIX_PATTERN = Pattern.compile("(^log4j2?[-._/]?|^org\\.apache\\.logging\\.log4j\\.)|(?=AsyncLogger(Config)?\\.)", 2);
        private static final Pattern PROPERTY_TOKENIZER = Pattern.compile("([A-Z]*[a-z0-9]+|[A-Z0-9]+)[-._/]?");

        static {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            CACHE = concurrentHashMap;
            concurrentHashMap.put("disableThreadContext", Arrays.asList("disable", "thread", "context"));
            concurrentHashMap.put("disableThreadContextStack", Arrays.asList("disable", "thread", "context", "stack"));
            concurrentHashMap.put("disableThreadContextMap", Arrays.asList("disable", "thread", "context", BuildConfig.FLAVOR_authType));
            concurrentHashMap.put(DefaultThreadContextMap.INHERITABLE_MAP, Arrays.asList("is", "thread", "context", BuildConfig.FLAVOR_authType, "inheritable"));
        }

        private Util() {
        }

        public static CharSequence joinAsCamelCase(Iterable<? extends CharSequence> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (CharSequence charSequence : iterable) {
                if (z) {
                    sb.append(charSequence);
                } else {
                    sb.append(Character.toUpperCase(charSequence.charAt(0)));
                    if (charSequence.length() > 1) {
                        sb.append(charSequence.subSequence(1, charSequence.length()));
                    }
                }
                z = false;
            }
            return sb.toString();
        }

        public static List<CharSequence> tokenize(CharSequence charSequence) {
            Map<CharSequence, List<CharSequence>> map = CACHE;
            if (map.containsKey(charSequence.toString())) {
                return map.get(charSequence.toString());
            }
            ArrayList arrayList = new ArrayList();
            Matcher matcher = PREFIX_PATTERN.matcher(charSequence);
            if (matcher.find(0)) {
                Matcher matcher2 = PROPERTY_TOKENIZER.matcher(charSequence);
                for (int end = matcher.end(); matcher2.find(end); end = matcher2.end()) {
                    arrayList.add(Strings.toRootLowerCase(matcher2.group(1)));
                }
            }
            CACHE.put(charSequence, arrayList);
            return arrayList;
        }
    }

    default boolean containsProperty(String str) {
        return false;
    }

    default CharSequence getNormalForm(Iterable<? extends CharSequence> iterable) {
        return null;
    }

    int getPriority();

    default String getProperty(String str) {
        return null;
    }

    default Collection<String> getPropertyNames() {
        return Collections.EMPTY_SET;
    }

    default void forEach(BiConsumer<String, String> biConsumer) {
    }
}
