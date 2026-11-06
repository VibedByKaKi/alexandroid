package com.amazon.coral.reflect;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.google.common.collect.ImmutableList;
import com.amazon.coral.google.common.collect.ImmutableMap;
import com.amazon.coral.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ClassInfo {
    static final ClassInfo EMPTY;
    private final ImmutableMap<ImmutableList<String>, Instantiator<?>> constructor;
    private final Map<String, Invoker> getter;
    private final ImmutableMap<String, Invoker> setter;

    static {
        Map map = Collections.EMPTY_MAP;
        EMPTY = create(map, map, map);
    }

    private ClassInfo(Map<String, Invoker> map, Map<String, Invoker> map2, Map<String[], Instantiator<?>> map3) {
        if (map == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (map2 == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (map3 == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        Iterator<Map.Entry<String, Invoker>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Invoker value = it2.next().getValue();
            if (value == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            if (value.getSignature().getParameters().length != 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
        }
        Iterator<Map.Entry<String, Invoker>> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Invoker value2 = it3.next().getValue();
            if (value2 == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            if (value2.getSignature().getParameters().length != 1) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Map.Entry<String[], Instantiator<?>> entry : map3.entrySet()) {
            String[] key = entry.getKey();
            Instantiator<?> value3 = entry.getValue();
            if (entry.getValue() == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            for (String str : key) {
                if (str == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    throw null;
                }
            }
            if (value3.getSignature().getParameters().length != key.length) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            builder.put(ImmutableList.copyOf(key), value3);
        }
        this.getter = orderPreservingUnmodifiableCopy(map);
        this.setter = ImmutableMap.copyOf((Map) map2);
        this.constructor = builder.build();
    }

    public static ClassInfo create(Map<String, Invoker> map, Map<String, Invoker> map2, Map<String[], Instantiator<?>> map3) {
        return new ClassInfo(map, map2, map3);
    }

    private Map<String, Invoker> orderPreservingUnmodifiableCopy(Map<String, Invoker> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassInfo)) {
            return false;
        }
        ClassInfo classInfo = (ClassInfo) obj;
        for (Map.Entry<String, Invoker> entry : this.getter.entrySet()) {
            if (!entry.getValue().equals(classInfo.getGetter(entry.getKey()))) {
                return false;
            }
        }
        UnmodifiableIterator<Map.Entry<String, Invoker>> it2 = this.setter.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Invoker> next = it2.next();
            if (!next.getValue().equals(classInfo.getSetter(next.getKey()))) {
                return false;
            }
        }
        UnmodifiableIterator<Map.Entry<ImmutableList<String>, Instantiator<?>>> it3 = this.constructor.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<ImmutableList<String>, Instantiator<?>> next2 = it3.next();
            if (!next2.getValue().equals(classInfo.getInstantiator(next2.getKey()))) {
                return false;
            }
        }
        int i = 0;
        for (List<String> list : classInfo.getInstantiatorProperties()) {
            i++;
        }
        if (i != this.constructor.size()) {
            return false;
        }
        int i2 = 0;
        for (String str : classInfo.getGetterProperties()) {
            i2++;
        }
        if (i2 != this.getter.size()) {
            return false;
        }
        int i3 = 0;
        for (String str2 : classInfo.getSetterProperties()) {
            i3++;
        }
        return i3 == this.setter.size();
    }

    public Invoker getGetter(String str) {
        if (str != null) {
            return this.getter.get(str);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public Iterable<String> getGetterProperties() {
        return this.getter.keySet();
    }

    public Instantiator<?> getInstantiator(List<String> list) {
        if (list != null) {
            return this.constructor.get(list);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public Iterable<List<String>> getInstantiatorProperties() {
        return this.constructor.keySet();
    }

    public Invoker getSetter(String str) {
        if (str != null) {
            return this.setter.get(str);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public Iterable<String> getSetterProperties() {
        return this.setter.keySet();
    }

    public int hashCode() {
        return ((this.constructor.hashCode() + this.setter.hashCode()) >> 127) ^ this.getter.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (Map.Entry<String, Invoker> entry : this.getter.entrySet()) {
            sb.append(" '");
            sb.append(entry.getValue());
            sb.append("' : ['");
            sb.append(entry.getKey());
            sb.append("'],\n");
        }
        UnmodifiableIterator<Map.Entry<String, Invoker>> it2 = this.setter.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Invoker> next = it2.next();
            sb.append(" '");
            sb.append(next.getValue());
            sb.append("' : ['");
            sb.append(next.getKey());
            sb.append("'],\n");
        }
        UnmodifiableIterator<Map.Entry<ImmutableList<String>, Instantiator<?>>> it3 = this.constructor.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<ImmutableList<String>, Instantiator<?>> next2 = it3.next();
            sb.append(" '");
            sb.append(next2.getValue());
            sb.append("' : ");
            sb.append(MarkdownConstants.LEFT_BRACKET);
            int length = sb.length();
            UnmodifiableIterator<String> it4 = next2.getKey().iterator();
            while (it4.hasNext()) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "'", it4.next(), "',");
            }
            if (sb.length() > length) {
                sb.replace(sb.length() - 1, sb.length(), "");
            }
            sb.append("],\n");
        }
        if (sb.length() > 1) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(" }");
        return sb.toString();
    }
}
