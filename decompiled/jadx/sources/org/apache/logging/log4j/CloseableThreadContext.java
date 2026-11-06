package org.apache.logging.log4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CloseableThreadContext {
    private CloseableThreadContext() {
    }

    public static Instance push(String str) {
        return new Instance().push(str);
    }

    public static Instance pushAll(List<String> list) {
        return new Instance().pushAll(list);
    }

    public static Instance put(String str, String str2) {
        return new Instance().put(str, str2);
    }

    public static Instance putAll(Map<String, String> map) {
        return new Instance().putAll(map);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Instance implements AutoCloseable {
        private final Map<String, String> originalValues;
        private int pushCount;

        private Instance() {
            this.pushCount = 0;
            this.originalValues = new HashMap();
        }

        private void closeMap() {
            HashMap hashMap = new HashMap(this.originalValues.size());
            ArrayList arrayList = new ArrayList(this.originalValues.size());
            for (Map.Entry<String, String> entry : this.originalValues.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    arrayList.add(key);
                } else {
                    hashMap.put(key, value);
                }
            }
            if (!hashMap.isEmpty()) {
                ThreadContext.putAll(hashMap);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ThreadContext.removeAll(arrayList);
        }

        private void closeStack() {
            for (int i = 0; i < this.pushCount; i++) {
                ThreadContext.pop();
            }
            this.pushCount = 0;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            closeStack();
            closeMap();
        }

        public Instance push(String str) {
            ThreadContext.push(str);
            this.pushCount++;
            return this;
        }

        public Instance pushAll(List<String> list) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                push(it2.next());
            }
            return this;
        }

        public Instance put(String str, String str2) {
            if (!this.originalValues.containsKey(str)) {
                this.originalValues.put(str, ThreadContext.get(str));
            }
            ThreadContext.put(str, str2);
            return this;
        }

        public Instance putAll(Map<String, String> map) {
            Map<String, String> context = ThreadContext.getContext();
            ThreadContext.putAll(map);
            for (String str : map.keySet()) {
                if (!this.originalValues.containsKey(str)) {
                    this.originalValues.put(str, context.get(str));
                }
            }
            return this;
        }

        public Instance push(String str, Object[] objArr) {
            ThreadContext.push(str, objArr);
            this.pushCount++;
            return this;
        }
    }

    public static Instance push(String str, Object... objArr) {
        return new Instance().push(str, objArr);
    }
}
