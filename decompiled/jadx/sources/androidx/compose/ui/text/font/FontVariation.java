package androidx.compose.ui.text.font;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0015\u0004\u001e\u001f B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0013J1\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001b\"\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "<init>", "()V", "Setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "name", "", "value", "", "italic", "opticalSizing", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "slant", "width", "weight", "", "grade", MetricsConstants.UserInteractionMetrics.SETTINGS_PREFIX, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "settings", "", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "SettingFloat", "SettingTextUnit", "SettingInt", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n118#2,4:351\n118#2,4:355\n118#2,4:359\n118#2,4:363\n118#2,4:367\n118#2,4:371\n118#2,4:375\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n*L\n211#1:351,4\n233#1:355,4\n255#1:359,4\n270#1:363,4\n286#1:367,4\n311#1:371,4\n333#1:375,4\n*E\n"})
/* loaded from: classes13.dex */
public final class FontVariation {
    public static final int $stable = 0;

    @NotNull
    public static final FontVariation INSTANCE = new FontVariation();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "needsDensity", "", "getNeedsDensity", "()Z", "axisName", "", "getAxisName", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Setting {
        @NotNull
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@Nullable Density density);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "<init>", "(Ljava/lang/String;F)V", "getAxisName", "()Ljava/lang/String;", "getValue", "()F", "toVariationValue", "density", "Landroidx/compose/ui/unit/Density;", "needsDensity", "", "getNeedsDensity", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SettingFloat implements Setting {

        @NotNull
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(@NotNull String str, float f) {
            this.axisName = str;
            this.value = f;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) other;
            return Intrinsics.areEqual(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.hashCode(this.value) + (getAxisName().hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return DoubleList$$ExternalSyntheticOutline0.m(sb, this.value, ')');
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@Nullable Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "<init>", "(Ljava/lang/String;I)V", "getAxisName", "()Ljava/lang/String;", "getValue", "()I", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "needsDensity", "", "getNeedsDensity", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SettingInt implements Setting {

        @NotNull
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(@NotNull String str, int i) {
            this.axisName = str;
            this.value = i;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) other;
            return Intrinsics.areEqual(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.value, ')');
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@Nullable Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "settings", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "<init>", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "", "getSettings", "()Ljava/util/List;", "needsDensity", "", "getNeedsDensity$ui_text", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n10613#2:351\n10838#2,3:352\n10841#2,3:362\n381#3,7:355\n77#4:365\n97#4,5:366\n103#5:371\n35#5,5:372\n104#5:377\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n54#1:351\n54#1:352,3\n54#1:362,3\n54#1:355,7\n55#1:365\n55#1:366,5\n63#1:371\n63#1:372,5\n63#1:377\n*E\n"})
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;

        @NotNull
        private final List<Setting> settings;

        public Settings(@NotNull Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, CollectionsKt.joinToString$default(list, null, null, null, null, 63), a$$ExternalSyntheticOutline0.m2m("'", str, "' must be unique. Actual [ [")));
                    throw null;
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((Setting) arrayList2.get(i)).getNeedsDensity()) {
                    z = true;
                    break;
                }
                i++;
            }
            this.needsDensity = z;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Settings) && Intrinsics.areEqual(this.settings, ((Settings) other).settings);
        }

        /* renamed from: getNeedsDensity$ui_text, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @NotNull
        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    @NotNull
    public final Setting Setting(@NotNull String name, float value) {
        if (!(name.length() == 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + name + '\'');
        }
        return new SettingFloat(name, value);
    }

    @NotNull
    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m6965Settings6EWAqTQ(@NotNull FontWeight weight, int style, @NotNull Setting... settings) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(weight(weight.getWeight()));
        spreadBuilder.add(italic(style));
        spreadBuilder.addSpread(settings);
        return new Settings((Setting[]) spreadBuilder.toArray(new Setting[spreadBuilder.size()]));
    }

    @NotNull
    public final Setting grade(int value) {
        boolean z = false;
        if (-1000 <= value && value < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", value);
    }

    @NotNull
    public final Setting italic(float value) {
        boolean z = false;
        if (0.0f <= value && value <= 1.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + value);
        }
        return new SettingFloat("ital", value);
    }

    @NotNull
    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m6966opticalSizingR2X_6o(long textSize) {
        if (!TextUnit.m7565isSpimpl(textSize)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", textSize, null);
    }

    @NotNull
    public final Setting slant(float value) {
        boolean z = false;
        if (-90.0f <= value && value <= 90.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + value);
        }
        return new SettingFloat("slnt", value);
    }

    @NotNull
    public final Setting weight(int value) {
        boolean z = false;
        if (1 <= value && value < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + value);
        }
        return new SettingInt("wght", value);
    }

    @NotNull
    public final Setting width(float value) {
        if (!(value > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + value);
        }
        return new SettingFloat("wdth", value);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0013\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "Landroidx/compose/ui/unit/TextUnit;", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAxisName", "()Ljava/lang/String;", "getValue-XSAIIZE", "()J", "J", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "needsDensity", "", "getNeedsDensity", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n136#2,5:351\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n*L\n135#1:351,5\n*E\n"})
    public static final class SettingTextUnit implements Setting {

        @NotNull
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        private SettingTextUnit(String str, long j) {
            this.axisName = str;
            this.value = j;
            this.needsDensity = true;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) other;
            return Intrinsics.areEqual(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m7559equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name and from getter */
        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return TextUnit.m7563hashCodeimpl(this.value) + (getAxisName().hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m7569toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@Nullable Density density) {
            if (density != null) {
                return density.getFontScale() * TextUnit.m7562getValueimpl(this.value);
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            PathKt$$ExternalSyntheticBUOutline0.m$1();
            return 0.0f;
        }

        public /* synthetic */ SettingTextUnit(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }
    }
}
