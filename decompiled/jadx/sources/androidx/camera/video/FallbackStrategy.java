package androidx.camera.video;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class FallbackStrategy {
    static final int FALLBACK_RULE_HIGHER = 2;
    static final int FALLBACK_RULE_HIGHER_OR_LOWER = 1;
    static final int FALLBACK_RULE_LOWER = 4;
    static final int FALLBACK_RULE_LOWER_OR_HIGHER = 3;
    static final int FALLBACK_RULE_NONE = 0;
    static final FallbackStrategy NONE = new AutoValue_FallbackStrategy_RuleStrategy(Quality.NONE, 0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class RuleStrategy extends FallbackStrategy {
        public RuleStrategy() {
            super();
        }

        @NonNull
        public abstract Quality getFallbackQuality();

        public abstract int getFallbackRule();
    }

    @NonNull
    public static FallbackStrategy higherQualityOrLowerThan(@NonNull Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 1);
    }

    @NonNull
    public static FallbackStrategy higherQualityThan(@NonNull Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 2);
    }

    @NonNull
    public static FallbackStrategy lowerQualityOrHigherThan(@NonNull Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 3);
    }

    @NonNull
    public static FallbackStrategy lowerQualityThan(@NonNull Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 4);
    }

    private FallbackStrategy() {
    }
}
