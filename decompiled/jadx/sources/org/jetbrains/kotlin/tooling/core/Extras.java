package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0004\bf\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001:\u0003\u0013\u0014\u0015J\u0015\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\tH¦\u0002J(\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\tH¦\u0002¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0012H¦\u0002R\u001c\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Extras;", "", "Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;", "", "entries", "", "getEntries", "()Ljava/util/Set;", "keys", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "getKeys", "contains", "", "key", MetricsConstants.Method.CACHE_GET, ExifInterface.GPS_DIRECTION_TRUE, "(Lorg/jetbrains/kotlin/tooling/core/Extras$Key;)Ljava/lang/Object;", "iterator", "", "Entry", "Key", "Type", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface Extras extends Collection<Entry<? extends Object>>, KMappedMarker {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0016B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002J\u000e\u0010\u000e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/io/Serializable;", "key", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "value", "(Lorg/jetbrains/kotlin/tooling/core/Extras$Key;Ljava/lang/Object;)V", "getKey", "()Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Entry<T> implements Serializable {
        private static final long serialVersionUID = 0;

        @NotNull
        private final Key<T> key;

        @NotNull
        private final T value;

        public Entry(@NotNull Key<T> key, @NotNull T t) {
            key.getClass();
            t.getClass();
            this.key = key;
            this.value = t;
        }

        @NotNull
        public final Key<T> component1() {
            return this.key;
        }

        @NotNull
        public final T component2() {
            return this.value;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(entry.key, this.key) && Intrinsics.areEqual(entry.value, this.value);
        }

        @NotNull
        public final Key<T> getKey() {
            return this.key;
        }

        @NotNull
        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.key);
            sb.append('=');
            sb.append(this.value);
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Extras$Type;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", PayloadUtils.PayloadKeys.SIGNATURE, "", "(Ljava/lang/String;)V", "getSignature$kotlin_tooling_core", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Type<T> implements Serializable {
        private static final long serialVersionUID = 0;

        @NotNull
        private final String signature;

        @PublishedApi
        @UnsafeApi(message = "Use 'extrasTypeOf()' instead")
        public Type(@NotNull String str) {
            str.getClass();
            this.signature = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Type) && Intrinsics.areEqual(((Type) other).signature, this.signature);
        }

        @NotNull
        /* renamed from: getSignature$kotlin_tooling_core, reason: from getter */
        public final String getSignature() {
            return this.signature;
        }

        public int hashCode() {
            return this.signature.hashCode() * 31;
        }

        @NotNull
        public String toString() {
            return this.signature;
        }
    }

    boolean contains(@NotNull Key<?> key);

    @Nullable
    <T> T get(@NotNull Key<T> key);

    @NotNull
    Set<Entry<?>> getEntries();

    @NotNull
    Set<Key<?>> getKeys();

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    Iterator<Entry<? extends Object>> iterator();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0015B!\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/io/Serializable;", "type", "Lorg/jetbrains/kotlin/tooling/core/Extras$Type;", "name", "", "(Lorg/jetbrains/kotlin/tooling/core/Extras$Type;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "stableString", "getStableString", "getType", "()Lorg/jetbrains/kotlin/tooling/core/Extras$Type;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Key<T> implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Nullable
        private final String name;

        @NotNull
        private final Type<T> type;

        @PublishedApi
        public Key(@NotNull Type<T> type, @Nullable String str) {
            type.getClass();
            this.type = type;
            this.name = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.name, key.name) && Intrinsics.areEqual(this.type, key.type);
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getStableString() {
            String str = this.name;
            Type<T> type = this.type;
            if (str == null) {
                return type.getSignature();
            }
            return type.getSignature() + ';' + this.name;
        }

        @NotNull
        public final Type<T> getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.name;
            return this.type.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
        }

        @NotNull
        public String toString() {
            return getStableString();
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Extras$Key$Companion;", "", "()V", "serialVersionUID", "", "fromString", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "stableString", "", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final Key<?> fromString(@NotNull String stableString) {
                boolean contains$default;
                List split$default;
                stableString.getClass();
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) stableString, ';', false, 2, (Object) null);
                int i = 2;
                if (!contains$default) {
                    return new Key<>(new Type(stableString), null, i, 0 == true ? 1 : 0);
                }
                split$default = StringsKt__StringsKt.split$default(stableString, new char[]{';'}, false, 2, 2, (Object) null);
                return new Key<>(new Type((String) split$default.get(0)), (String) split$default.get(1));
            }

            private Companion() {
            }
        }

        public /* synthetic */ Key(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i & 2) != 0 ? null : str);
        }
    }
}
