package com.squareup.kotlinpoet;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\rJ'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0016¢\u0006\u0002\u0010\u000bJ'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004H&¢\u0006\u0002\u0010\fR$\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/squareup/kotlinpoet/Taggable;", "", "tags", "", "Lkotlin/reflect/KClass;", "getTags", "()Ljava/util/Map;", "tag", ExifInterface.GPS_DIRECTION_TRUE, "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Builder", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Taggable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Map<KClass<?>, Object> getTags(@NotNull Taggable taggable) {
            taggable.getClass();
            return MapsKt.emptyMap();
        }

        @Nullable
        public static <T> T tag(@NotNull Taggable taggable, @NotNull Class<T> cls) {
            taggable.getClass();
            cls.getClass();
            return (T) taggable.tag(JvmClassMappingKt.getKotlinClass(cls));
        }
    }

    @NotNull
    Map<KClass<?>, Object> getTags();

    @Nullable
    <T> T tag(@NotNull Class<T> type);

    @Nullable
    <T> T tag(@NotNull KClass<T> type);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J#\u0010\b\u001a\u00028\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000bJ#\u0010\b\u001a\u00028\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\fR\"\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/squareup/kotlinpoet/Taggable$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "tags", "", "Lkotlin/reflect/KClass;", "getTags", "()Ljava/util/Map;", "tag", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lcom/squareup/kotlinpoet/Taggable$Builder;", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lcom/squareup/kotlinpoet/Taggable$Builder;", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Builder<T extends Builder<? extends T>> {
        @NotNull
        Map<KClass<?>, Object> getTags();

        @NotNull
        T tag(@NotNull Class<?> type, @Nullable Object tag);

        @NotNull
        T tag(@NotNull KClass<?> type, @Nullable Object tag);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static <T extends Builder<? extends T>> T tag(@NotNull Builder<? extends T> builder, @NotNull KClass<?> kClass, @Nullable Object obj) {
                builder.getClass();
                kClass.getClass();
                if (obj == null) {
                    builder.getTags().remove(kClass);
                    return builder;
                }
                builder.getTags().put(kClass, obj);
                return builder;
            }

            @NotNull
            public static <T extends Builder<? extends T>> T tag(@NotNull Builder<? extends T> builder, @NotNull Class<?> cls, @Nullable Object obj) {
                builder.getClass();
                cls.getClass();
                return builder.tag(JvmClassMappingKt.getKotlinClass(cls), obj);
            }
        }
    }
}
