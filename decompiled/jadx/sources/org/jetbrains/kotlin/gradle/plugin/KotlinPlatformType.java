package org.jetbrains.kotlin.gradle.plugin;

import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.gradle.api.Named;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.attributes.AttributeCompatibilityRule;
import org.gradle.api.attributes.AttributeDisambiguationRule;
import org.gradle.api.attributes.AttributeMatchingStrategy;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.attributes.CompatibilityCheckDetails;
import org.gradle.api.attributes.MultipleCandidatesDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;
import org.jetbrains.kotlin.project.model.KotlinPlatformTypeAttribute;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0003\u000e\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "", "Lorg/gradle/api/Named;", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "getName", "", "toString", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_COMMON_LIBS_DIR, KotlinPlatformTypeAttribute.JVM, KotlinPlatformTypeAttribute.JS, KotlinPlatformTypeAttribute.ANDROID_JVM, "native", "wasm", "Companion", "CompatibilityRule", "DisambiguationRule", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum KotlinPlatformType implements Named, Serializable {
    common,
    jvm,
    js,
    androidJvm,
    f356native,
    wasm;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Attribute<KotlinPlatformType> attribute = Attribute.of("org.jetbrains.kotlin.platform.type", KotlinPlatformType.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType$CompatibilityRule;", "Lorg/gradle/api/attributes/AttributeCompatibilityRule;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "()V", "execute", "", "details", "Lorg/gradle/api/attributes/CompatibilityCheckDetails;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CompatibilityRule implements AttributeCompatibilityRule<KotlinPlatformType> {
        public void execute(@NotNull CompatibilityCheckDetails<KotlinPlatformType> details) {
            details.getClass();
            if (details.getProducerValue() == KotlinPlatformType.jvm && details.getConsumerValue() == KotlinPlatformType.androidJvm) {
                details.compatible();
            }
            if (details.getConsumerValue() == KotlinPlatformType.common) {
                details.compatible();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType$DisambiguationRule;", "Lorg/gradle/api/attributes/AttributeDisambiguationRule;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "()V", "execute", "", "details", "Lorg/gradle/api/attributes/MultipleCandidatesDetails;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DisambiguationRule implements AttributeDisambiguationRule<KotlinPlatformType> {
        public void execute(@NotNull MultipleCandidatesDetails<KotlinPlatformType> details) {
            details.getClass();
            if (details.getCandidateValues().contains(details.getConsumerValue())) {
                Object consumerValue = details.getConsumerValue();
                if (consumerValue != null) {
                    details.closestMatch(consumerValue);
                    return;
                } else {
                    Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
                    return;
                }
            }
            if (details.getConsumerValue() == null && details.getCandidateValues().contains(KotlinPlatformType.androidJvm)) {
                Set candidateValues = details.getCandidateValues();
                KotlinPlatformType kotlinPlatformType = KotlinPlatformType.jvm;
                if (candidateValues.contains(kotlinPlatformType)) {
                    details.closestMatch(kotlinPlatformType);
                    return;
                }
            }
            Set candidateValues2 = details.getCandidateValues();
            KotlinPlatformType kotlinPlatformType2 = KotlinPlatformType.common;
            if (!candidateValues2.contains(kotlinPlatformType2) || details.getCandidateValues().contains(KotlinPlatformType.jvm) || details.getCandidateValues().contains(KotlinPlatformType.androidJvm)) {
                return;
            }
            details.closestMatch(kotlinPlatformType2);
        }
    }

    @NotNull
    public String getName() {
        return name();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType$Companion;", "", "()V", "attribute", "Lorg/gradle/api/attributes/Attribute;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "kotlin.jvm.PlatformType", "getAttribute", "()Lorg/gradle/api/attributes/Attribute;", "setupAttributesMatchingStrategy", "", "attributesSchema", "Lorg/gradle/api/attributes/AttributesSchema;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Attribute<KotlinPlatformType> getAttribute() {
            return KotlinPlatformType.attribute;
        }

        public final void setupAttributesMatchingStrategy(@NotNull AttributesSchema attributesSchema) {
            attributesSchema.getClass();
            AttributeMatchingStrategy attribute = attributesSchema.attribute(KotlinPlatformType.INSTANCE.getAttribute());
            attribute.getCompatibilityRules().add(CompatibilityRule.class);
            attribute.getDisambiguationRules().add(DisambiguationRule.class);
        }

        private Companion() {
        }
    }
}
