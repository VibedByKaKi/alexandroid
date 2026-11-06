package com.horcrux.svg;

import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class FilterProperties {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EdgeMode {
        UNKNOWN("unknown"),
        DUPLICATE("duplicate"),
        WRAP("wrap"),
        NONE("none");

        private static final Map<String, EdgeMode> edgeModeToEnum = new HashMap();
        private final String edgeMode;

        static {
            for (EdgeMode edgeMode : values()) {
                edgeModeToEnum.put(edgeMode.edgeMode, edgeMode);
            }
        }

        EdgeMode(String str) {
            this.edgeMode = str;
        }

        public static EdgeMode getEnum(String str) {
            Map<String, EdgeMode> map = edgeModeToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown 'edgeMode' Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.edgeMode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FeBlendMode {
        UNKNOWN("unknown"),
        NORMAL(BaseTemplateProvider.NON_INVITATION_KEY),
        MULTIPLY("multiply"),
        SCREEN("screen"),
        DARKEN("darken"),
        LIGHTEN("lighten");

        private static final Map<String, FeBlendMode> typeToEnum = new HashMap();
        private final String mode;

        static {
            for (FeBlendMode feBlendMode : values()) {
                typeToEnum.put(feBlendMode.mode, feBlendMode);
            }
        }

        FeBlendMode(String str) {
            this.mode = str;
        }

        public static FeBlendMode getEnum(String str) {
            Map<String, FeBlendMode> map = typeToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown String Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.mode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FeColorMatrixType {
        MATRIX("matrix"),
        SATURATE("saturate"),
        HUE_ROTATE("hueRotate"),
        LUMINANCE_TO_ALPHA("luminanceToAlpha");

        private static final Map<String, FeColorMatrixType> typeToEnum = new HashMap();
        private final String type;

        static {
            for (FeColorMatrixType feColorMatrixType : values()) {
                typeToEnum.put(feColorMatrixType.type, feColorMatrixType);
            }
        }

        FeColorMatrixType(String str) {
            this.type = str;
        }

        public static FeColorMatrixType getEnum(String str) {
            Map<String, FeColorMatrixType> map = typeToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown String Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.type;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FeCompositeOperator {
        OVER("over"),
        IN("in"),
        OUT("out"),
        ATOP("atop"),
        XOR("xor"),
        ARITHMETIC("arithmetic");

        private static final Map<String, FeCompositeOperator> typeToEnum = new HashMap();
        private final String type;

        static {
            for (FeCompositeOperator feCompositeOperator : values()) {
                typeToEnum.put(feCompositeOperator.type, feCompositeOperator);
            }
        }

        FeCompositeOperator(String str) {
            this.type = str;
        }

        public static FeCompositeOperator getEnum(String str) {
            Map<String, FeCompositeOperator> map = typeToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown String Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.type;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Units {
        OBJECT_BOUNDING_BOX("objectBoundingBox"),
        USER_SPACE_ON_USE("userSpaceOnUse");

        private static final Map<String, Units> unitsToEnum = new HashMap();
        private final String units;

        static {
            for (Units units : values()) {
                unitsToEnum.put(units.units, units);
            }
        }

        Units(String str) {
            this.units = str;
        }

        public static Units getEnum(String str) {
            Map<String, Units> map = unitsToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown 'Unit' Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.units;
        }
    }
}
