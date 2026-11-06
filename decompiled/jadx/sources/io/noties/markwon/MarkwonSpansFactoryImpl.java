package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.MarkwonSpansFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.commonmark.node.Node;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class MarkwonSpansFactoryImpl implements MarkwonSpansFactory {
    private final Map<Class<? extends Node>, SpanFactory> factories;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BuilderImpl implements MarkwonSpansFactory.Builder {
        private final Map<Class<? extends Node>, SpanFactory> factories = new HashMap(3);

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        @Deprecated
        public <N extends Node> MarkwonSpansFactory.Builder addFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory) {
            return prependFactory(cls, spanFactory);
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        public <N extends Node> MarkwonSpansFactory.Builder appendFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory) {
            SpanFactory spanFactory2 = this.factories.get(cls);
            if (spanFactory2 == null) {
                this.factories.put(cls, spanFactory);
                return this;
            }
            if (spanFactory2 instanceof CompositeSpanFactory) {
                ((CompositeSpanFactory) spanFactory2).factories.add(0, spanFactory);
                return this;
            }
            this.factories.put(cls, new CompositeSpanFactory(spanFactory, spanFactory2));
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        public MarkwonSpansFactory build() {
            return new MarkwonSpansFactoryImpl(Collections.unmodifiableMap(this.factories));
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @Nullable
        public <N extends Node> SpanFactory getFactory(@NonNull Class<N> cls) {
            return this.factories.get(cls);
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        public <N extends Node> MarkwonSpansFactory.Builder prependFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory) {
            SpanFactory spanFactory2 = this.factories.get(cls);
            if (spanFactory2 == null) {
                this.factories.put(cls, spanFactory);
                return this;
            }
            if (spanFactory2 instanceof CompositeSpanFactory) {
                ((CompositeSpanFactory) spanFactory2).factories.add(spanFactory);
                return this;
            }
            this.factories.put(cls, new CompositeSpanFactory(spanFactory2, spanFactory));
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        public <N extends Node> SpanFactory requireFactory(@NonNull Class<N> cls) {
            SpanFactory factory = getFactory(cls);
            if (factory != null) {
                return factory;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(cls.getName());
            return null;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        @NonNull
        public <N extends Node> MarkwonSpansFactory.Builder setFactory(@NonNull Class<N> cls, @Nullable SpanFactory spanFactory) {
            Map<Class<? extends Node>, SpanFactory> map = this.factories;
            if (spanFactory == null) {
                map.remove(cls);
                return this;
            }
            map.put(cls, spanFactory);
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CompositeSpanFactory implements SpanFactory {
        final List<SpanFactory> factories;

        public CompositeSpanFactory(@NonNull SpanFactory spanFactory, @NonNull SpanFactory spanFactory2) {
            ArrayList arrayList = new ArrayList(3);
            this.factories = arrayList;
            arrayList.add(spanFactory);
            arrayList.add(spanFactory2);
        }

        @Override // io.noties.markwon.SpanFactory
        @Nullable
        public Object getSpans(@NonNull MarkwonConfiguration markwonConfiguration, @NonNull RenderProps renderProps) {
            int size = this.factories.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = this.factories.get(i).getSpans(markwonConfiguration, renderProps);
            }
            return objArr;
        }
    }

    public MarkwonSpansFactoryImpl(@NonNull Map<Class<? extends Node>, SpanFactory> map) {
        this.factories = map;
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    @Nullable
    public <N extends Node> SpanFactory get(@NonNull Class<N> cls) {
        return this.factories.get(cls);
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    @NonNull
    public <N extends Node> SpanFactory require(@NonNull Class<N> cls) {
        SpanFactory spanFactory = get(cls);
        if (spanFactory != null) {
            return spanFactory;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(cls.getName());
        return null;
    }
}
