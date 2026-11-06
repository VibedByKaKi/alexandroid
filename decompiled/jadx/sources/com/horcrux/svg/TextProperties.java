package com.horcrux.svg;

import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.here.sdk.search.PlaceCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class TextProperties {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AlignmentBaseline {
        baseline("baseline"),
        textBottom("text-bottom"),
        alphabetic("alphabetic"),
        ideographic("ideographic"),
        middle("middle"),
        central("central"),
        mathematical("mathematical"),
        textTop("text-top"),
        bottom("bottom"),
        center("center"),
        top("top"),
        textBeforeEdge("text-before-edge"),
        textAfterEdge("text-after-edge"),
        beforeEdge("before-edge"),
        afterEdge("after-edge"),
        hanging("hanging");

        private static final Map<String, AlignmentBaseline> alignmentToEnum = new HashMap();
        private final String alignment;

        static {
            for (AlignmentBaseline alignmentBaseline : values()) {
                alignmentToEnum.put(alignmentBaseline.alignment, alignmentBaseline);
            }
        }

        AlignmentBaseline(String str) {
            this.alignment = str;
        }

        public static AlignmentBaseline getEnum(String str) {
            Map<String, AlignmentBaseline> map = alignmentToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown String Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.alignment;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Direction {
        ltr,
        rtl
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FontStyle {
        normal,
        italic,
        oblique
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FontVariantLigatures {
        normal,
        none
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FontWeight {
        Normal(BaseTemplateProvider.NON_INVITATION_KEY),
        Bold("bold"),
        w100(PlaceCategory.EAT_AND_DRINK),
        w200("200"),
        w300(PlaceCategory.SIGHTS_AND_MUSEUMS),
        w400(PlaceCategory.TRANSPORT),
        w500(PlaceCategory.ACCOMMODATION),
        w600(PlaceCategory.SHOPPING),
        w700(PlaceCategory.BUSINESS_AND_SERVICES),
        w800(PlaceCategory.FACILITIES),
        w900(PlaceCategory.AREAS_AND_BUILDINGS),
        Bolder("bolder"),
        Lighter("lighter");

        private static final Map<String, FontWeight> weightToEnum = new HashMap();
        private final String weight;

        static {
            for (FontWeight fontWeight : values()) {
                weightToEnum.put(fontWeight.weight, fontWeight);
            }
        }

        FontWeight(String str) {
            this.weight = str;
        }

        public static FontWeight get(String str) {
            return weightToEnum.get(str);
        }

        public static boolean hasEnum(String str) {
            return weightToEnum.containsKey(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.weight;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextAnchor {
        start,
        middle,
        end
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextDecoration {
        None("none"),
        Underline("underline"),
        Overline("overline"),
        LineThrough("line-through"),
        Blink("blink");

        private static final Map<String, TextDecoration> decorationToEnum = new HashMap();
        private final String decoration;

        static {
            for (TextDecoration textDecoration : values()) {
                decorationToEnum.put(textDecoration.decoration, textDecoration);
            }
        }

        TextDecoration(String str) {
            this.decoration = str;
        }

        public static TextDecoration getEnum(String str) {
            Map<String, TextDecoration> map = decorationToEnum;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown String Value: ", str));
            return null;
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.decoration;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextLengthAdjust {
        spacing,
        spacingAndGlyphs
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextPathMethod {
        align,
        stretch
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextPathMidLine {
        sharp,
        smooth
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextPathSide {
        left,
        right
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TextPathSpacing {
        auto,
        exact
    }
}
