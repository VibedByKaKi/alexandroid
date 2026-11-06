package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DataRewinderRegistry {
    private static final DataRewinder.Factory<?> DEFAULT_FACTORY = new DataRewinder.Factory<Object>() { // from class: com.bumptech.glide.load.data.DataRewinderRegistry.1
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public DataRewinder<Object> build(@NonNull Object obj) {
            return new DefaultRewinder(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, DataRewinder.Factory<?>> rewinders = new HashMap();

    @NonNull
    public synchronized <T> DataRewinder<T> build(@NonNull T t) {
        DataRewinder.Factory<?> factory;
        try {
            Preconditions.checkNotNull(t);
            factory = this.rewinders.get(t.getClass());
            if (factory == null) {
                Iterator<DataRewinder.Factory<?>> it2 = this.rewinders.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DataRewinder.Factory<?> next = it2.next();
                    if (next.getDataClass().isAssignableFrom(t.getClass())) {
                        factory = next;
                        break;
                    }
                }
            }
            if (factory == null) {
                factory = DEFAULT_FACTORY;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (DataRewinder<T>) factory.build(t);
    }

    public synchronized void register(@NonNull DataRewinder.Factory<?> factory) {
        this.rewinders.put(factory.getDataClass(), factory);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DefaultRewinder implements DataRewinder<Object> {
        private final Object data;

        public DefaultRewinder(@NonNull Object obj) {
            this.data = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        @NonNull
        public Object rewindAndGet() {
            return this.data;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public void cleanup() {
        }
    }
}
