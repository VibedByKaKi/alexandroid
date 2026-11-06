package autovalue.shaded.net.ltgt.gradle.incap;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum IncrementalAnnotationProcessorType {
    ISOLATING(true),
    AGGREGATING(true),
    DYNAMIC(false);

    private final boolean hasProcessorOption;

    IncrementalAnnotationProcessorType(boolean z) {
        this.hasProcessorOption = z;
    }

    public String getProcessorOption() {
        if (!this.hasProcessorOption) {
            Duration$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return "org.gradle.annotation.processing." + name().toLowerCase(Locale.ROOT);
    }
}
