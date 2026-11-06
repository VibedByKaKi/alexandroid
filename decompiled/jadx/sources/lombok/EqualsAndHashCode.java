package lombok;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface EqualsAndHashCode {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({})
    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CacheStrategy {
        NEVER,
        LAZY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static CacheStrategy[] valuesCustom() {
            CacheStrategy[] valuesCustom = values();
            int length = valuesCustom.length;
            CacheStrategy[] cacheStrategyArr = new CacheStrategy[length];
            System.arraycopy(valuesCustom, 0, cacheStrategyArr, 0, length);
            return cacheStrategyArr;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Exclude {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Include {
        int rank() default 0;

        String replaces() default "";
    }

    CacheStrategy cacheStrategy() default CacheStrategy.NEVER;

    boolean callSuper() default false;

    boolean doNotUseGetters() default false;

    String[] exclude() default {};

    String[] of() default {};

    AnyAnnotation[] onParam() default {};

    boolean onlyExplicitlyIncluded() default false;
}
