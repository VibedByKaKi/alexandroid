package autovalue.shaded.com.google.common.base;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public class Joiner {
    private final String separator;

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    private static Iterable<Object> iterable(@CheckForNull final Object obj, @CheckForNull final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: autovalue.shaded.com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            @CheckForNull
            public Object get(int i) {
                return i != 0 ? i != 1 ? objArr[i - 2] : obj2 : obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(char c) {
        return new Joiner(String.valueOf(c));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterator<? extends Object> it2) throws IOException {
        Preconditions.checkNotNull(a2);
        if (it2.hasNext()) {
            a2.append(toString(it2.next()));
            while (it2.hasNext()) {
                a2.append(this.separator);
                a2.append(toString(it2.next()));
            }
        }
        return a2;
    }

    public final String join(Iterator<? extends Object> it2) {
        return appendTo(new StringBuilder(), it2).toString();
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: autovalue.shaded.com.google.common.base.Joiner.2
            @Override // autovalue.shaded.com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a2, Iterator<? extends Object> it2) throws IOException {
                Preconditions.checkNotNull(a2, "appendable");
                Preconditions.checkNotNull(it2, "parts");
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next != null) {
                        a2.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 != null) {
                        a2.append(Joiner.this.separator);
                        a2.append(Joiner.this.toString(next2));
                    }
                }
                return a2;
            }

            @Override // autovalue.shaded.com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // autovalue.shaded.com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public CharSequence toString(@CheckForNull Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this) { // from class: autovalue.shaded.com.google.common.base.Joiner.1
            @Override // autovalue.shaded.com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // autovalue.shaded.com.google.common.base.Joiner
            public CharSequence toString(@CheckForNull Object obj) {
                return obj == null ? str : Joiner.this.toString(obj);
            }

            @Override // autovalue.shaded.com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c) {
        return withKeyValueSeparator(String.valueOf(c));
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Iterator<? extends Map.Entry<?, ?>> it2) throws IOException {
            Preconditions.checkNotNull(a2);
            if (it2.hasNext()) {
                Map.Entry<?, ?> next = it2.next();
                a2.append(this.joiner.toString(next.getKey()));
                a2.append(this.keyValueSeparator);
                a2.append(this.joiner.toString(next.getValue()));
                while (it2.hasNext()) {
                    a2.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = it2.next();
                    a2.append(this.joiner.toString(next2.getKey()));
                    a2.append(this.keyValueSeparator);
                    a2.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a2;
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it2) {
            return appendTo(new StringBuilder(), it2).toString();
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo((MapJoiner) a2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Map<?, ?> map) throws IOException {
            return (A) appendTo((MapJoiner) a2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it2) {
            try {
                appendTo((MapJoiner) sb, it2);
                return sb;
            } catch (IOException e) {
                Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
                return null;
            }
        }
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public final String join(@CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo((Joiner) a2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) throws IOException {
        return (A) appendTo((Joiner) a2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) appendTo((Joiner) a2, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<? extends Object> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Object> it2) {
        try {
            appendTo((Joiner) sb, it2);
            return sb;
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return appendTo(sb, iterable(obj, obj2, objArr));
    }
}
