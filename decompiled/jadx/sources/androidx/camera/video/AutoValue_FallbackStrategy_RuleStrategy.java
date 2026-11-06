package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.camera.video.FallbackStrategy;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends FallbackStrategy.RuleStrategy {
    private final Quality fallbackQuality;
    private final int fallbackRule;

    public AutoValue_FallbackStrategy_RuleStrategy(Quality quality, int i) {
        if (quality == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null fallbackQuality");
            throw null;
        }
        this.fallbackQuality = quality;
        this.fallbackRule = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FallbackStrategy.RuleStrategy) {
            FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) obj;
            if (this.fallbackQuality.equals(ruleStrategy.getFallbackQuality()) && this.fallbackRule == ruleStrategy.getFallbackRule()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    @NonNull
    public Quality getFallbackQuality() {
        return this.fallbackQuality;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public int getFallbackRule() {
        return this.fallbackRule;
    }

    public int hashCode() {
        return this.fallbackRule ^ ((this.fallbackQuality.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.fallbackQuality);
        sb.append(", fallbackRule=");
        return a$$ExternalSyntheticOutline0.m(sb, this.fallbackRule, StringSubstitutor.DEFAULT_VAR_END);
    }
}
