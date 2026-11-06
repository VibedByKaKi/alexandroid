package org.apache.logging.log4j;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.spi.CleanableThreadContextMap;
import org.apache.logging.log4j.spi.DefaultThreadContextMap;
import org.apache.logging.log4j.spi.DefaultThreadContextStack;
import org.apache.logging.log4j.spi.MutableThreadContextStack;
import org.apache.logging.log4j.spi.ReadOnlyThreadContextMap;
import org.apache.logging.log4j.spi.ThreadContextMap;
import org.apache.logging.log4j.spi.ThreadContextMap2;
import org.apache.logging.log4j.spi.ThreadContextMapFactory;
import org.apache.logging.log4j.spi.ThreadContextStack;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.apache.logging.log4j.util.ProviderUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class ThreadContext {
    private static final String DISABLE_ALL = "disableThreadContext";
    private static final String DISABLE_STACK = "disableThreadContextStack";
    public static final Map<String, String> EMPTY_MAP = Collections.EMPTY_MAP;
    public static final ThreadContextStack EMPTY_STACK = new EmptyThreadContextStack();
    private static ThreadContextMap contextMap;
    private static ThreadContextStack contextStack;
    private static ReadOnlyThreadContextMap readOnlyContextMap;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ContextStack extends Serializable, Collection<String> {
        List<String> asList();

        ContextStack copy();

        int getDepth();

        ContextStack getImmutableStackOrNull();

        String peek();

        String pop();

        void push(String str);

        void trim(int i);
    }

    static {
        init();
    }

    private ThreadContext() {
    }

    public static void clearAll() {
        clearMap();
        clearStack();
    }

    public static void clearMap() {
        contextMap.clear();
    }

    public static void clearStack() {
        contextStack.clear();
    }

    public static ContextStack cloneStack() {
        return contextStack.copy();
    }

    public static boolean containsKey(String str) {
        return contextMap.containsKey(str);
    }

    public static String get(String str) {
        return contextMap.get(str);
    }

    public static Map<String, String> getContext() {
        return contextMap.getCopy();
    }

    public static int getDepth() {
        return contextStack.getDepth();
    }

    public static Map<String, String> getImmutableContext() {
        Map<String, String> immutableMapOrNull = contextMap.getImmutableMapOrNull();
        return immutableMapOrNull == null ? EMPTY_MAP : immutableMapOrNull;
    }

    public static ContextStack getImmutableStack() {
        ContextStack immutableStackOrNull = contextStack.getImmutableStackOrNull();
        return immutableStackOrNull == null ? EMPTY_STACK : immutableStackOrNull;
    }

    public static ReadOnlyThreadContextMap getThreadContextMap() {
        return readOnlyContextMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void init() {
        PropertiesUtil properties = PropertiesUtil.getProperties();
        contextStack = (properties.getBooleanProperty(DISABLE_STACK) || properties.getBooleanProperty(DISABLE_ALL)) ? new NoOpThreadContextStack() : new DefaultThreadContextStack();
        ThreadContextMapFactory.init();
        ThreadContextMap threadContextMapInstance = ProviderUtil.getProvider().getThreadContextMapInstance();
        contextMap = threadContextMapInstance;
        readOnlyContextMap = threadContextMapInstance instanceof ReadOnlyThreadContextMap ? (ReadOnlyThreadContextMap) threadContextMapInstance : null;
    }

    public static boolean isEmpty() {
        return contextMap.isEmpty();
    }

    public static String peek() {
        return contextStack.peek();
    }

    public static String pop() {
        return contextStack.pop();
    }

    public static void push(String str, Object... objArr) {
        contextStack.push(ParameterizedMessage.format(str, objArr));
    }

    public static void put(String str, String str2) {
        contextMap.put(str, str2);
    }

    public static void putAll(Map<String, String> map) {
        ThreadContextMap threadContextMap = contextMap;
        if (threadContextMap instanceof ThreadContextMap2) {
            ((ThreadContextMap2) threadContextMap).putAll(map);
            return;
        }
        if (threadContextMap instanceof DefaultThreadContextMap) {
            ((DefaultThreadContextMap) threadContextMap).putAll(map);
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            contextMap.put(entry.getKey(), entry.getValue());
        }
    }

    public static void putIfNull(String str, String str2) {
        if (contextMap.containsKey(str)) {
            return;
        }
        contextMap.put(str, str2);
    }

    public static void remove(String str) {
        contextMap.remove(str);
    }

    public static void removeAll(Iterable<String> iterable) {
        ThreadContextMap threadContextMap = contextMap;
        if (threadContextMap instanceof CleanableThreadContextMap) {
            ((CleanableThreadContextMap) threadContextMap).removeAll(iterable);
            return;
        }
        if (threadContextMap instanceof DefaultThreadContextMap) {
            ((DefaultThreadContextMap) threadContextMap).removeAll(iterable);
            return;
        }
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            contextMap.remove(it2.next());
        }
    }

    public static void removeStack() {
        contextStack.clear();
    }

    public static void setStack(Collection<String> collection) {
        if (collection.isEmpty()) {
            return;
        }
        contextStack.clear();
        contextStack.addAll(collection);
    }

    public static void trim(int i) {
        contextStack.trim(i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EmptyThreadContextStack extends AbstractCollection<String> implements ThreadContextStack {
        private static final long serialVersionUID = 1;

        private EmptyThreadContextStack() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends String> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public List<String> asList() {
            return Collections.EMPTY_LIST;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public ContextStack copy() {
            return new MutableThreadContextStack();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            return (obj instanceof Collection) && ((Collection) obj).isEmpty();
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public int getDepth() {
            return 0;
        }

        @Override // java.util.Collection
        public int hashCode() {
            return 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<String> iterator() {
            return Collections.emptyIterator();
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public String peek() {
            return null;
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public String pop() {
            return null;
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public void push(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public ContextStack getImmutableStackOrNull() {
            return this;
        }

        @Override // org.apache.logging.log4j.ThreadContext.ContextStack
        public void trim(int i) {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoOpThreadContextStack extends EmptyThreadContextStack {
        private NoOpThreadContextStack() {
            super();
        }

        @Override // org.apache.logging.log4j.ThreadContext.EmptyThreadContextStack, java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends String> collection) {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return false;
        }

        @Override // org.apache.logging.log4j.ThreadContext.EmptyThreadContextStack, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override // org.apache.logging.log4j.ThreadContext.EmptyThreadContextStack, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override // org.apache.logging.log4j.ThreadContext.EmptyThreadContextStack, java.util.AbstractCollection, java.util.Collection
        public boolean add(String str) {
            return false;
        }

        @Override // org.apache.logging.log4j.ThreadContext.EmptyThreadContextStack, org.apache.logging.log4j.ThreadContext.ContextStack
        public void push(String str) {
        }
    }

    public static void push(String str) {
        contextStack.push(str);
    }
}
