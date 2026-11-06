package com.mapbox.maps.extension.style.expressions.generated;

import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.hermes.intl.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.types.FormatSection;
import com.mapbox.maps.extension.style.types.ExpressionDsl;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import com.reactcommunity.rndatetimepicker.Common;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 &2\u00020\u0001:\t$%&'()*+,B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013B\u0015\b\u0012\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\u0010\u0015B\u0015\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\u0010\u0016B\u0015\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019B+\b\u0010\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001aj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001`\u001b¢\u0006\u0002\u0010\u001cJ\u0018\u0010!\u001a\u0004\u0018\u0001H\"\"\u0006\b\u0000\u0010\"\u0018\u0001H\u0086\b¢\u0006\u0002\u0010 J\u0006\u0010#\u001a\u00020\nR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/bindgen/Value;", "builder", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;)V", "value", "", "(D)V", "", "(J)V", "", "(Z)V", "", "(Ljava/lang/String;)V", "", "([D)V", "", "([J)V", "", "([Z)V", "", "([Ljava/lang/String;)V", "([[D)V", "", "", "(Ljava/util/List;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "<set-?>", "literalValue", "getLiteralValue", "()Ljava/lang/Object;", "getLiteral", ExifInterface.GPS_DIRECTION_TRUE, "isLiteral", "Builder", "CollatorBuilder", "Companion", "ExpressionBuilder", "FormatBuilder", "FormatSectionBuilder", "ImageBuilder", "InterpolatorBuilder", "NumberFormatBuilder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class Expression extends Value {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Object literalValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0002\b\u0011R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "", "operator", "", "(Ljava/lang/String;)V", "arguments", "Ljava/util/ArrayList;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lkotlin/collections/ArrayList;", "getArguments$extension_style_release", "()Ljava/util/ArrayList;", "getOperator$extension_style_release", "()Ljava/lang/String;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "contents", "", "Lcom/mapbox/bindgen/Value;", "contents$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Builder {

        @NotNull
        private final ArrayList<Expression> arguments;

        @NotNull
        private final String operator;

        public Builder(@NotNull String str) {
            str.getClass();
            this.operator = str;
            this.arguments = new ArrayList<>();
        }

        @NotNull
        public Expression build() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!Intrinsics.areEqual(this.operator, "match")) {
                return new Expression(this, defaultConstructorMarker);
            }
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("match");
            int size = this.arguments.size() - 1;
            int i = 0;
            for (Object obj : this.arguments) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Expression expression = (Expression) obj;
                if (i % 2 == 1 && i != size) {
                    expression = TypeUtilsKt.unwrapFromLiteralArray(expression);
                }
                expressionBuilder.addArgument(expression);
                i = i2;
            }
            return new Expression(expressionBuilder, defaultConstructorMarker);
        }

        @NotNull
        public final List<Value> contents$extension_style_release() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Value(this.operator));
            arrayList.addAll(this.arguments);
            return arrayList;
        }

        @NotNull
        public final ArrayList<Expression> getArguments$extension_style_release() {
            return this.arguments;
        }

        @NotNull
        /* renamed from: getOperator$extension_style_release, reason: from getter */
        public final String getOperator() {
            return this.operator;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u00020\u00002*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "()V", "imageOptions", "pairs", "", "Lkotlin/Pair;", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "([Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImageBuilder extends ExpressionBuilder {
        public ImageBuilder() {
            super("image");
        }

        @MapboxExperimental
        @NotNull
        public final ImageBuilder imageOptions(@NotNull Pair<String, Expression>... pairs) {
            pairs.getClass();
            getArguments$extension_style_release().add(new Expression((HashMap<String, Value>) MapsKt.hashMapOf(TuplesKt.to(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, Value.valueOf((HashMap<String, Value>) MapsKt.hashMapOf((Pair[]) Arrays.copyOf(pairs, pairs.length)))))));
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Expression(@org.jetbrains.annotations.NotNull double[][] r12) {
        /*
            r11 = this;
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L32
            r4 = r12[r3]
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r7 = r2
        L18:
            if (r7 >= r6) goto L27
            r8 = r4[r7]
            com.mapbox.bindgen.Value r10 = new com.mapbox.bindgen.Value
            r10.<init>(r8)
            r5.add(r10)
            int r7 = r7 + 1
            goto L18
        L27:
            com.mapbox.bindgen.Value r4 = new com.mapbox.bindgen.Value
            r4.<init>(r5)
            r0.add(r4)
            int r3 = r3 + 1
            goto Lc
        L32:
            r11.<init>(r0)
            r11.literalValue = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(double[][]):void");
    }

    @JvmStatic
    @NotNull
    public static final Expression abs(double d) {
        return INSTANCE.abs(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression accumulated() {
        return INSTANCE.accumulated();
    }

    @JvmStatic
    @NotNull
    public static final Expression acos(double d) {
        return INSTANCE.acos(d);
    }

    @JvmStatic
    @MapboxExperimental
    @NotNull
    public static final Expression activeAnchor() {
        return INSTANCE.activeAnchor();
    }

    @JvmStatic
    @NotNull
    public static final Expression all(@NotNull Expression... expressionArr) {
        return INSTANCE.all(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression any(@NotNull Expression... expressionArr) {
        return INSTANCE.any(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression array(@NotNull Expression... expressionArr) {
        return INSTANCE.array(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression asin(double d) {
        return INSTANCE.asin(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression at(double d, @NotNull Expression expression) {
        return INSTANCE.at(d, expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression atInterpolated(@NotNull Expression... expressionArr) {
        return INSTANCE.atInterpolated(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression atan(double d) {
        return INSTANCE.atan(d);
    }

    @JvmStatic
    @NotNull
    /* renamed from: boolean, reason: not valid java name */
    public static final Expression m24747boolean(@NotNull Expression... expressionArr) {
        return INSTANCE.m24749boolean(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression ceil(double d) {
        return INSTANCE.ceil(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression coalesce(@NotNull Expression... expressionArr) {
        return INSTANCE.coalesce(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression collator(@NotNull Expression expression, @NotNull Expression expression2, @NotNull Expression expression3) {
        return INSTANCE.collator(expression, expression2, expression3);
    }

    @JvmStatic
    @NotNull
    public static final Expression color(@ColorInt int i) {
        return INSTANCE.color(i);
    }

    @JvmStatic
    @NotNull
    public static final Expression concat(@NotNull Expression... expressionArr) {
        return INSTANCE.concat(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression config(@NotNull Expression... expressionArr) {
        return INSTANCE.config(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression cos(double d) {
        return INSTANCE.cos(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression cubicBezier(double d, double d2, double d3, double d4) {
        return INSTANCE.cubicBezier(d, d2, d3, d4);
    }

    @JvmStatic
    @NotNull
    public static final Expression cubicBezierInterpolator(double d, double d2, double d3, double d4, @NotNull Expression expression, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.cubicBezierInterpolator(d, d2, d3, d4, expression, pairArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression distance(@NotNull GeoJson geoJson) {
        return INSTANCE.distance(geoJson);
    }

    @JvmStatic
    @NotNull
    public static final Expression distanceFromCenter() {
        return INSTANCE.distanceFromCenter();
    }

    @JvmStatic
    @NotNull
    public static final Expression division(double d, double d2) {
        return INSTANCE.division(d, d2);
    }

    @JvmStatic
    @NotNull
    public static final Expression downcase(@NotNull String str) {
        return INSTANCE.downcase(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression e() {
        return INSTANCE.e();
    }

    @JvmStatic
    @NotNull
    public static final Expression eq(@NotNull Expression... expressionArr) {
        return INSTANCE.eq(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression exponential(double d) {
        return INSTANCE.exponential(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression exponentialInterpolator(double d, @NotNull Expression expression, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.exponentialInterpolator(d, expression, pairArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression featureState(@NotNull Expression... expressionArr) {
        return INSTANCE.featureState(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression floor(double d) {
        return INSTANCE.floor(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression format(@NotNull FormatSection... formatSectionArr) {
        return INSTANCE.format(formatSectionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression fromRaw(@NotNull String str) {
        return INSTANCE.fromRaw(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression geometryType() {
        return INSTANCE.geometryType();
    }

    @JvmStatic
    @NotNull
    public static final Expression get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression gt(@NotNull Expression... expressionArr) {
        return INSTANCE.gt(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression gte(@NotNull Expression... expressionArr) {
        return INSTANCE.gte(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression has(@NotNull String str) {
        return INSTANCE.has(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression heatmapDensity() {
        return INSTANCE.heatmapDensity();
    }

    @JvmStatic
    @NotNull
    public static final Expression hsl(@NotNull Expression... expressionArr) {
        return INSTANCE.hsl(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression hsla(@NotNull Expression... expressionArr) {
        return INSTANCE.hsla(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression id() {
        return INSTANCE.id();
    }

    @JvmStatic
    @MapboxExperimental
    @NotNull
    public static final Expression image(@NotNull Expression expression, @NotNull Map<String, Expression> map) {
        return INSTANCE.image(expression, map);
    }

    @JvmStatic
    @NotNull
    public static final Expression inExpression(double d, @NotNull Expression expression) {
        return INSTANCE.inExpression(d, expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression indexOf(@NotNull Expression... expressionArr) {
        return INSTANCE.indexOf(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression interpolate(@NotNull Expression... expressionArr) {
        return INSTANCE.interpolate(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression isSupportedScript(@NotNull String str) {
        return INSTANCE.isSupportedScript(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression length(@NotNull String str) {
        return INSTANCE.length(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression letExpression(@NotNull Expression... expressionArr) {
        return INSTANCE.letExpression(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression lineProgress() {
        return INSTANCE.lineProgress();
    }

    @JvmStatic
    @NotNull
    public static final Expression linear() {
        return INSTANCE.linear();
    }

    @JvmStatic
    @NotNull
    public static final Expression linearInterpolator(@NotNull Expression expression, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.linearInterpolator(expression, pairArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression literal(double d) {
        return INSTANCE.literal(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression ln(double d) {
        return INSTANCE.ln(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression ln2() {
        return INSTANCE.ln2();
    }

    @JvmStatic
    @NotNull
    public static final Expression log10(double d) {
        return INSTANCE.log10(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression log2(double d) {
        return INSTANCE.log2(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression lt(@NotNull Expression... expressionArr) {
        return INSTANCE.lt(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression lte(@NotNull Expression... expressionArr) {
        return INSTANCE.lte(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression match(@NotNull Expression expression, @NotNull Pair<Expression, Expression>[] pairArr, @NotNull Expression expression2) {
        return INSTANCE.match(expression, pairArr, expression2);
    }

    @JvmStatic
    @NotNull
    public static final Expression max(@NotNull double... dArr) {
        return INSTANCE.max(dArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression measureLight(@NotNull Expression... expressionArr) {
        return INSTANCE.measureLight(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression min(@NotNull double... dArr) {
        return INSTANCE.min(dArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression mod(double d, double d2) {
        return INSTANCE.mod(d, d2);
    }

    @JvmStatic
    @NotNull
    public static final Expression neq(@NotNull Expression... expressionArr) {
        return INSTANCE.neq(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression not(boolean z) {
        return INSTANCE.not(z);
    }

    @JvmStatic
    @NotNull
    public static final Expression number(@NotNull Expression... expressionArr) {
        return INSTANCE.number(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression numberFormat(@NotNull Expression expression, @Nullable Expression expression2, @Nullable Expression expression3, @Nullable Expression expression4, @Nullable Expression expression5) {
        return INSTANCE.numberFormat(expression, expression2, expression3, expression4, expression5);
    }

    @JvmStatic
    @NotNull
    public static final Expression objectExpression(@NotNull Expression... expressionArr) {
        return INSTANCE.objectExpression(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression pi() {
        return INSTANCE.pi();
    }

    @JvmStatic
    @NotNull
    public static final Expression pitch() {
        return INSTANCE.pitch();
    }

    @JvmStatic
    @NotNull
    public static final Expression pow(double d, double d2) {
        return INSTANCE.pow(d, d2);
    }

    @JvmStatic
    @NotNull
    public static final Expression product(@NotNull double... dArr) {
        return INSTANCE.product(dArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression properties() {
        return INSTANCE.properties();
    }

    @JvmStatic
    @NotNull
    public static final Expression random(@NotNull Expression... expressionArr) {
        return INSTANCE.random(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression rasterParticleSpeed() {
        return INSTANCE.rasterParticleSpeed();
    }

    @JvmStatic
    @NotNull
    public static final Expression rasterValue() {
        return INSTANCE.rasterValue();
    }

    @JvmStatic
    @NotNull
    public static final Expression resolvedLocale(@NotNull Expression... expressionArr) {
        return INSTANCE.resolvedLocale(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression rgb(double d, double d2, double d3) {
        return INSTANCE.rgb(d, d2, d3);
    }

    @JvmStatic
    @NotNull
    public static final Expression rgba(double d, double d2, double d3, double d4) {
        return INSTANCE.rgba(d, d2, d3, d4);
    }

    @JvmStatic
    @NotNull
    public static final Expression round(double d) {
        return INSTANCE.round(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression sin(double d) {
        return INSTANCE.sin(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression skyRadialProgress() {
        return INSTANCE.skyRadialProgress();
    }

    @JvmStatic
    @NotNull
    public static final Expression slice(@NotNull Expression... expressionArr) {
        return INSTANCE.slice(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression split(@NotNull Expression... expressionArr) {
        return INSTANCE.split(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression sqrt(double d) {
        return INSTANCE.sqrt(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression step(@NotNull Expression expression, @NotNull Expression expression2, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.step(expression, expression2, pairArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression string(@NotNull Expression... expressionArr) {
        return INSTANCE.string(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression subtract(double d) {
        return INSTANCE.subtract(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression sum(@NotNull double... dArr) {
        return INSTANCE.sum(dArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression switchCase(@NotNull Expression... expressionArr) {
        return INSTANCE.switchCase(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression tan(double d) {
        return INSTANCE.tan(d);
    }

    @JvmStatic
    @NotNull
    public static final Expression toBoolean(@NotNull Expression... expressionArr) {
        return INSTANCE.toBoolean(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression toColor(@NotNull Expression... expressionArr) {
        return INSTANCE.toColor(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression toHsla(@NotNull Expression... expressionArr) {
        return INSTANCE.toHsla(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression toNumber(@NotNull Expression... expressionArr) {
        return INSTANCE.toNumber(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression toRgba(@NotNull Expression... expressionArr) {
        return INSTANCE.toRgba(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression toString(@NotNull Expression... expressionArr) {
        return INSTANCE.toString(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression typeofExpression(@NotNull Expression... expressionArr) {
        return INSTANCE.typeofExpression(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression upcase(@NotNull String str) {
        return INSTANCE.upcase(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression varExpression(@NotNull String str) {
        return INSTANCE.varExpression(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression within(@NotNull Geometry geometry) {
        return INSTANCE.within(geometry);
    }

    @JvmStatic
    @MapboxExperimental
    @NotNull
    public static final Expression worldview(@NotNull Expression... expressionArr) {
        return INSTANCE.worldview(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression zoom() {
        return INSTANCE.zoom();
    }

    public final /* synthetic */ <T> T getLiteral() {
        Object literalValue = getLiteralValue();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (literalValue == null) {
            return null;
        }
        T t = (T) getLiteralValue();
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    @Nullable
    public final Object getLiteralValue() {
        return this.literalValue;
    }

    public final boolean isLiteral() {
        return this.literalValue != null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\u001f\u0010\u0010\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0010\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\u001f\u0010\u0012\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0013\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0014\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0015\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010\u0016\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0016\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u001f\u0010\u0018\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u0018\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u001a\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u001a\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010\u001b\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u001b\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u001c\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010\u001d\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\u001d\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0007J\u001f\u0010\u001e\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ$\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020#2\b\b\u0002\u0010 \u001a\u00020#2\u0006\u0010!\u001a\u00020$H\u0007J$\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020#2\b\b\u0002\u0010 \u001a\u00020#2\u0006\u0010!\u001a\u00020%H\u0007J\u0012\u0010&\u001a\u00020\u00042\b\b\u0001\u0010'\u001a\u00020(H\u0007J\u001f\u0010)\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010)\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ!\u0010)\u001a\u00020\u00042\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0\u000b\"\u00020%H\u0007¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010,\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010-\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010-\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J(\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0007J\u001f\u0010.\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ(\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000eH\u0007Ja\u00103\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u00109Ja\u00103\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=H\u0007J\b\u0010>\u001a\u00020\u0004H\u0007J\u001f\u0010?\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010?\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0007J\u001f\u0010B\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010B\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010B\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020%H\u0007J\b\u0010C\u001a\u00020\u0004H\u0007J\u001f\u0010D\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010D\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0007J\u001f\u0010E\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\u0010\u0010E\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007JI\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u0010IJI\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u0010JJ\u001f\u0010K\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010K\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010L\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010L\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010L\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010M\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010M\u001a\u00020\u00042\u0012\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u00020P0\u000b\"\u00020PH\u0007¢\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u00020\u00042\u0006\u0010F\u001a\u00020%H\u0007J\b\u0010S\u001a\u00020\u0004H\u0007J\u001f\u0010T\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010T\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020%H\u0007J\u0018\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020%2\u0006\u0010F\u001a\u00020\u0004H\u0007J\u001f\u0010V\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010V\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010W\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010W\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010X\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010X\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020%H\u0007J\u0018\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020%2\u0006\u0010F\u001a\u00020\u0004H\u0007J\b\u0010Z\u001a\u00020\u0004H\u0007J\u001f\u0010[\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010[\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\\\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010\\\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\b\u0010]\u001a\u00020\u0004H\u0007J$\u0010^\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u00042\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040`H\u0007J@\u0010^\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u00042\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040`2\u0006\u0010a\u001a\u00020\u00042\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040`H\u0007J\u001f\u0010^\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010^\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010d\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010d\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010d\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u0004H\u0007J\u0018\u0010d\u001a\u00020\u00042\u0006\u0010e\u001a\u00020%2\u0006\u0010f\u001a\u00020\u0004H\u0007J\u001f\u0010g\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010g\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010h\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010h\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010i\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010i\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010i\u001a\u00020\u00042\u0006\u0010j\u001a\u00020%H\u0007J\u001f\u0010k\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010k\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010k\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020%H\u0007J\u001f\u0010l\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010l\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\b\u0010m\u001a\u00020\u0004H\u0007J\b\u0010n\u001a\u00020\u0004H\u0007JA\u0010o\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020#H\u0007J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020rH\u0007J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020%H\u0007J1\u0010q\u001a\u00020\u00042\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010sj\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001`tH\u0001¢\u0006\u0002\buJ\u001b\u0010q\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010vH\u0001¢\u0006\u0002\buJ\u001f\u0010w\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010w\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010w\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010x\u001a\u00020\u0004H\u0007J\u001f\u0010y\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010y\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010y\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010z\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010z\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010z\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010{\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010{\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010|\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010|\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJI\u0010}\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004082\u0006\u0010~\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u007fJ\u001f\u0010}\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010}\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u0080\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0080\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0016\u0010\u0080\u0001\u001a\u00020\u00042\u000b\u0010*\u001a\u00030\u0081\u0001\"\u00020\u000eH\u0007J \u0010\u0082\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0082\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u0083\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0083\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0016\u0010\u0083\u0001\u001a\u00020\u00042\u000b\u0010*\u001a\u00030\u0081\u0001\"\u00020\u000eH\u0007J \u0010\u0084\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0084\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0019\u0010\u0084\u0001\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0007J \u0010\u0085\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0085\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u0086\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0086\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0012\u0010\u0086\u0001\u001a\u00020\u00042\u0007\u0010\u0087\u0001\u001a\u00020#H\u0007J \u0010\u0088\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0088\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ*\u0010\u0089\u0001\u001a\u00020\u00042\u0007\u0010\u0088\u0001\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJE\u0010\u0089\u0001\u001a\u00020\u00042\u0007\u0010\u0088\u0001\u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J+\u0010\u0089\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007J \u0010\u008e\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u008e\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u008f\u0001\u001a\u00020\u0004H\u0007J\t\u0010\u0090\u0001\u001a\u00020\u0004H\u0007J \u0010\u0091\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0091\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0019\u0010\u0091\u0001\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0007J \u0010\u0092\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0092\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0017\u0010\u0092\u0001\u001a\u00020\u00042\f\u0010\u0093\u0001\u001a\u00030\u0081\u0001\"\u00020\u000eH\u0007J\t\u0010\u0094\u0001\u001a\u00020\u0004H\u0007J \u0010\u0095\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0095\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0096\u0001\u001a\u00020\u0004H\u0007J\t\u0010\u0097\u0001\u001a\u00020\u0004H\u0007J \u0010\u0098\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0098\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u0099\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u0099\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ$\u0010\u0099\u0001\u001a\u00020\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u000e2\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009c\u0001\u001a\u00020\u000eH\u0007J \u0010\u009d\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u009d\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ-\u0010\u009d\u0001\u001a\u00020\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u000e2\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009c\u0001\u001a\u00020\u000e2\u0007\u0010\u009e\u0001\u001a\u00020\u000eH\u0007J \u0010\u009f\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u009f\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010 \u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010 \u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010 \u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\t\u0010¡\u0001\u001a\u00020\u0004H\u0007J \u0010¢\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¢\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010£\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010£\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010¤\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¤\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010¤\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007JK\u0010¥\u0001\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0007\u0010¦\u0001\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408H\u0007¢\u0006\u0002\u0010IJ \u0010¥\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¥\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010Y\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ!\u0010Y\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010§\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010§\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010§\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0019\u0010§\u0001\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0007J \u0010¨\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¨\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0017\u0010¨\u0001\u001a\u00020\u00042\f\u0010\u0093\u0001\u001a\u00030\u0081\u0001\"\u00020\u000eH\u0007J \u0010©\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010©\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJC\u0010©\u0001\u001a\u00020\u00042*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u000b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004082\u0006\u0010~\u001a\u00020\u0004H\u0007¢\u0006\u0003\u0010ª\u0001J \u0010«\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010«\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010«\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010¬\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¬\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010\u00ad\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010\u00ad\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010®\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010®\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010¯\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¯\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010°\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010°\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010±\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010±\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010²\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010²\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ \u0010³\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010³\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010³\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020%H\u0007J \u0010´\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010´\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\u0011\u0010´\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020%H\u0007J\u0013\u0010µ\u0001\u001a\u00020\u00042\b\u0010¶\u0001\u001a\u00030·\u0001H\u0007J \u0010¸\u0001\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\"\u0010¸\u0001\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ\t\u0010¹\u0001\u001a\u00020\u0004H\u0007¨\u0006º\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Companion;", "", "()V", "abs", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "expressions", "", "([Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "value", "", "accumulated", "acos", "activeAnchor", "all", Languages.ANY, "array", "asin", "at", "index", "atInterpolated", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "atan", TypedValues.Custom.S_BOOLEAN, "ceil", "coalesce", "collator", "caseSensitive", "diacriticSensitive", "locale", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "", "Ljava/util/Locale;", "", "color", "intColor", "", "concat", "values", "([Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "config", "cos", "cubicBezier", "x1", "x2", "x3", "x4", "cubicBezierInterpolator", "y1", "y2", "input", "stops", "Lkotlin/Pair;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(DDDDLcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "distance", "geojson", "Lcom/mapbox/geojson/GeoJson;", "distanceFromCenter", "division", DefaultPreloadManager.METRIC_PATH_FIRST, "second", "downcase", "e", "eq", "exponential", "expression", "exponentialInterpolator", "base", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(DLcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "featureState", "floor", "format", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "formatSections", "Lcom/mapbox/maps/extension/style/expressions/types/FormatSection;", "([Lcom/mapbox/maps/extension/style/expressions/types/FormatSection;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fromRaw", "geometryType", MetricsConstants.Method.CACHE_GET, "key", "gt", "gte", "has", TypedValues.Custom.S_STRING, "heatmapDensity", "hsl", "hsla", "id", "image", "options", "", "image2", "options2", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "inExpression", "needle", "haystack", "indexOf", "interpolate", "isSupportedScript", "script", "length", "letExpression", "lineProgress", "linear", "linearInterpolator", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "literal", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "literal$extension_style_release", "", "ln", "ln2", "log10", "log2", "lt", "lte", "match", "fallback", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lkotlin/Pair;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "", "measureLight", ReactProperties.GEOFENCE_MINIMUM_RANGE, "mod", "neq", SmartPlayConstants.SMART_PLAY_NOT_CONDITION_PREFIX, "bool", "number", "numberFormat", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "currency", "minFractionDigits", "maxFractionDigits", "objectExpression", ContextChain.TAG_PRODUCT_AND_INFRA, ResponseFields.PITCH, "pow", AMPDInformationProvider.DEVICE_PRODUCT_KEY, "double", "properties", "random", "rasterParticleSpeed", "rasterValue", "resolvedLocale", "rgb", "red", "green", "blue", "rgba", "alpha", "round", "sin", "skyRadialProgress", "slice", "split", "sqrt", "step", ContactsModuleConstants.OUTPUT, "subtract", "sum", "switchCase", "([Lkotlin/Pair;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "tan", "toBoolean", "toColor", "toHsla", "toNumber", "toRgba", "toString", "typeofExpression", "upcase", "varExpression", "within", "geometry", "Lcom/mapbox/geojson/Geometry;", "worldview", "zoom", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Expression collator$default(Companion companion, boolean z, boolean z2, Locale locale, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return companion.collator(z, z2, locale);
        }

        public static /* synthetic */ Expression numberFormat$default(Companion companion, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i, Object obj) {
            if ((i & 2) != 0) {
                expression2 = null;
            }
            if ((i & 4) != 0) {
                expression3 = null;
            }
            if ((i & 8) != 0) {
                expression4 = null;
            }
            if ((i & 16) != 0) {
                expression5 = null;
            }
            return companion.numberFormat(expression, expression2, expression3, expression4, expression5);
        }

        @JvmStatic
        @NotNull
        public final Expression abs(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "abs");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression accumulated() {
            return new ExpressionBuilder("accumulated").build();
        }

        @JvmStatic
        @NotNull
        public final Expression acos(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "acos");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @MapboxExperimental
        @NotNull
        public final Expression activeAnchor() {
            return new ExpressionBuilder("active-anchor").build();
        }

        @JvmStatic
        @NotNull
        public final Expression all(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "all");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression any(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, Languages.ANY);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression array(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "array");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression asin(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "asin");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression at(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "at");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression atInterpolated(@NotNull Expression... expressions) {
            expressions.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("at-interpolated");
            for (Expression expression : expressions) {
                interpolatorBuilder.addArgument(expression);
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression atan(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "atan");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        /* renamed from: boolean, reason: not valid java name */
        public final Expression m24749boolean(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, TypedValues.Custom.S_BOOLEAN);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression ceil(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "ceil");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression coalesce(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "coalesce");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression collator(@NotNull Expression caseSensitive, @NotNull Expression diacriticSensitive, @NotNull Expression locale) {
            caseSensitive.getClass();
            diacriticSensitive.getClass();
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        @JvmStatic
        @NotNull
        public final Expression color(@ColorInt int intColor) {
            float[] colorToRgbaArray = ColorUtils.INSTANCE.colorToRgbaArray(intColor);
            return rgba(literal(colorToRgbaArray[0]), literal(colorToRgbaArray[1]), literal(colorToRgbaArray[2]), literal(colorToRgbaArray[3]));
        }

        @JvmStatic
        @NotNull
        public final Expression concat(@NotNull String... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("concat");
            for (String str : values) {
                expressionBuilder.addArgument(literal(str));
            }
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression config(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "config");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression cos(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "cos");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression cubicBezier(double x1, double x2, double x3, double x4) {
            return new ExpressionBuilder("cubic-bezier").addArgument(literal(x1)).addArgument(literal(x2)).addArgument(literal(x3)).addArgument(literal(x4)).build();
        }

        @JvmStatic
        @NotNull
        public final Expression cubicBezierInterpolator(@NotNull Expression x1, @NotNull Expression y1, @NotNull Expression x2, @NotNull Expression y2, @NotNull Expression input, @NotNull Pair<Expression, Expression>... stops) {
            x1.getClass();
            y1.getClass();
            x2.getClass();
            y2.getClass();
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.cubicBezier(x1, y1, x2, y2);
            interpolatorBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                interpolatorBuilder.addArgument(pair.getFirst());
                interpolatorBuilder.addArgument(pair.getSecond());
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression distance(@NotNull GeoJson geojson) {
            geojson.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("distance");
            Expected<String, Value> fromJson = Value.fromJson(geojson.toJson());
            fromJson.getClass();
            Value value = fromJson.getValue();
            if (value == null) {
                Duration$$ExternalSyntheticBUOutline0.m$1(fromJson.getError());
                return null;
            }
            Object contents = value.getContents();
            contents.getClass();
            expressionBuilder.addArgument(new Expression((HashMap<String, Value>) contents));
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression distanceFromCenter() {
            return new ExpressionBuilder("distance-from-center").build();
        }

        @JvmStatic
        @NotNull
        public final Expression division(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "/");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression downcase(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "downcase");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression e() {
            return new ExpressionBuilder("e").build();
        }

        @JvmStatic
        @NotNull
        public final Expression eq(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "==");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression exponential(double value) {
            return new ExpressionBuilder("exponential").addArgument(literal(value)).build();
        }

        @JvmStatic
        @NotNull
        public final Expression exponentialInterpolator(@NotNull Expression base, @NotNull Expression input, @NotNull Pair<Expression, Expression>... stops) {
            base.getClass();
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.exponential(base);
            interpolatorBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                interpolatorBuilder.addArgument(pair.getFirst());
                interpolatorBuilder.addArgument(pair.getSecond());
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression featureState(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "feature-state");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression floor(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "floor");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression format(@NotNull FormatSection... formatSections) {
            formatSections.getClass();
            FormatBuilder formatBuilder = new FormatBuilder();
            for (FormatSection formatSection : formatSections) {
                FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(formatSection.getContent());
                Expression fontScale = formatSection.getFontScale();
                if (fontScale != null) {
                    formatSectionBuilder.fontScale(fontScale);
                }
                Expression textFont = formatSection.getTextFont();
                if (textFont != null) {
                    formatSectionBuilder.textFont(textFont);
                }
                Expression textColor = formatSection.getTextColor();
                if (textColor != null) {
                    formatSectionBuilder.textColor(textColor);
                }
                formatBuilder.getArguments$extension_style_release().addAll(formatSectionBuilder.build());
            }
            return formatBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression fromRaw(@NotNull String expression) {
            expression.getClass();
            Expected<String, Value> fromJson = Value.fromJson(expression);
            if (fromJson != null) {
                String error = fromJson.getError();
                if (error != null) {
                    Duration$$ExternalSyntheticBUOutline0.m$1(error);
                    return null;
                }
                Value value = fromJson.getValue();
                if (value != null) {
                    return TypeUtilsKt.unwrapToExpression(value);
                }
            }
            Duration$$ExternalSyntheticBUOutline0.m$1("Plugin is not added to Style yet.");
            return null;
        }

        @JvmStatic
        @NotNull
        public final Expression geometryType() {
            return new ExpressionBuilder("geometry-type").build();
        }

        @JvmStatic
        @NotNull
        public final Expression get(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, MetricsConstants.Method.CACHE_GET);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression gt(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, ">");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression gte(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, ">=");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression has(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "has");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression heatmapDensity() {
            return new ExpressionBuilder("heatmap-density").build();
        }

        @JvmStatic
        @NotNull
        public final Expression hsl(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "hsl");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression hsla(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "hsla");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression id() {
            return new ExpressionBuilder("id").build();
        }

        @JvmStatic
        @MapboxExperimental
        @NotNull
        public final Expression image(@NotNull Expression image, @NotNull Map<String, Expression> options, @NotNull Expression image2, @NotNull Map<String, Expression> options2) {
            image.getClass();
            options.getClass();
            image2.getClass();
            options2.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            imageBuilder.addArgument(image);
            ArrayList arrayList = new ArrayList(options.size());
            for (Map.Entry<String, Expression> entry : options.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            Object[] array = arrayList.toArray(new Pair[0]);
            array.getClass();
            Pair[] pairArr = (Pair[]) array;
            imageBuilder.imageOptions((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            imageBuilder.addArgument(image2);
            ArrayList arrayList2 = new ArrayList(options2.size());
            for (Map.Entry<String, Expression> entry2 : options2.entrySet()) {
                arrayList2.add(TuplesKt.to(entry2.getKey(), entry2.getValue()));
            }
            Object[] array2 = arrayList2.toArray(new Pair[0]);
            array2.getClass();
            Pair[] pairArr2 = (Pair[]) array2;
            imageBuilder.imageOptions((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            return imageBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression inExpression(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "in");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression indexOf(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "index-of");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression interpolate(@NotNull Expression... expressions) {
            expressions.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            for (Expression expression : expressions) {
                interpolatorBuilder.addArgument(expression);
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression isSupportedScript(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "is-supported-script");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression length(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "length");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression letExpression(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "let");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression lineProgress() {
            return new ExpressionBuilder("line-progress").build();
        }

        @JvmStatic
        @NotNull
        public final Expression linear() {
            return new ExpressionBuilder("linear").build();
        }

        @JvmStatic
        @NotNull
        public final Expression linearInterpolator(@NotNull Expression input, @NotNull Pair<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.linear();
            interpolatorBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                interpolatorBuilder.addArgument(pair.getFirst());
                interpolatorBuilder.addArgument(pair.getSecond());
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression literal(@NotNull String value) {
            value.getClass();
            return new Expression(value, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final Expression literal$extension_style_release(@NotNull HashMap<String, Object> value) {
            value.getClass();
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : value.entrySet()) {
                hashMap.put(entry.getKey(), TypeUtils.INSTANCE.wrapToValue(entry.getValue()));
            }
            return new ExpressionBuilder("literal").addArgument(new Expression((HashMap<String, Value>) hashMap)).build();
        }

        @JvmStatic
        @NotNull
        public final Expression ln(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "ln");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression ln2() {
            return new ExpressionBuilder("ln2").build();
        }

        @JvmStatic
        @NotNull
        public final Expression log10(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "log10");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression log2(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "log2");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression lt(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "<");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression lte(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "<=");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression match(@NotNull Expression input, @NotNull Pair<Expression, Expression>[] stops, @NotNull Expression fallback) {
            input.getClass();
            stops.getClass();
            fallback.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("match");
            expressionBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                expressionBuilder.addArgument(pair.getFirst());
                expressionBuilder.addArgument(pair.getSecond());
            }
            expressionBuilder.addArgument(fallback);
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression max(@NotNull double... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(ReactProperties.GEOFENCE_MAXIMUM_RANGE);
            for (double d : values) {
                expressionBuilder.addArgument(literal(d));
            }
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression measureLight(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "measure-light");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression min(@NotNull double... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(ReactProperties.GEOFENCE_MINIMUM_RANGE);
            for (double d : values) {
                expressionBuilder.addArgument(literal(d));
            }
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression mod(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "%");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression neq(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "!=");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression not(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, MarkdownConstants.EXCLAMATION_MARK);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression number(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "number");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression numberFormat(@NotNull Expression number, @Nullable Expression locale, @Nullable Expression currency, @Nullable Expression minFractionDigits, @Nullable Expression maxFractionDigits) {
            number.getClass();
            NumberFormatBuilder numberFormatBuilder = new NumberFormatBuilder(number);
            if (locale != null) {
                numberFormatBuilder.locale(locale);
            }
            if (currency != null) {
                numberFormatBuilder.currency(currency);
            }
            if (minFractionDigits != null) {
                numberFormatBuilder.minFractionDigits(minFractionDigits);
            }
            if (maxFractionDigits != null) {
                numberFormatBuilder.maxFractionDigits(maxFractionDigits);
            }
            return numberFormatBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression objectExpression(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "object");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression pi() {
            return new ExpressionBuilder(ContextChain.TAG_PRODUCT_AND_INFRA).build();
        }

        @JvmStatic
        @NotNull
        public final Expression pitch() {
            return new ExpressionBuilder(ResponseFields.PITCH).build();
        }

        @JvmStatic
        @NotNull
        public final Expression pow(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "^");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression product(@NotNull double... r6) {
            r6.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("*");
            for (double d : r6) {
                expressionBuilder.addArgument(literal(d));
            }
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression properties() {
            return new ExpressionBuilder("properties").build();
        }

        @JvmStatic
        @NotNull
        public final Expression random(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "random");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression rasterParticleSpeed() {
            return new ExpressionBuilder("raster-particle-speed").build();
        }

        @JvmStatic
        @NotNull
        public final Expression rasterValue() {
            return new ExpressionBuilder("raster-value").build();
        }

        @JvmStatic
        @NotNull
        public final Expression resolvedLocale(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "resolved-locale");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression rgb(double red, double green, double blue) {
            return new ExpressionBuilder("rgb").addArgument(literal(red)).addArgument(literal(green)).addArgument(literal(blue)).build();
        }

        @JvmStatic
        @NotNull
        public final Expression rgba(double red, double green, double blue, double alpha) {
            return new ExpressionBuilder("rgba").addArgument(literal(red)).addArgument(literal(green)).addArgument(literal(blue)).addArgument(literal(alpha)).build();
        }

        @JvmStatic
        @NotNull
        public final Expression round(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "round");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression sin(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "sin");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression skyRadialProgress() {
            return new ExpressionBuilder("sky-radial-progress").build();
        }

        @JvmStatic
        @NotNull
        public final Expression slice(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "slice");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression split(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "split");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression sqrt(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "sqrt");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression step(@NotNull Expression input, @NotNull Expression output, @NotNull Pair<Expression, Expression>... stops) {
            input.getClass();
            output.getClass();
            stops.getClass();
            ExpressionBuilder addArgument = new ExpressionBuilder("step").addArgument(input).addArgument(output);
            for (Pair<Expression, Expression> pair : stops) {
                addArgument.addArgument(pair.getFirst());
                addArgument.addArgument(pair.getSecond());
            }
            return addArgument.build();
        }

        @JvmStatic
        @NotNull
        public final Expression string(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, TypedValues.Custom.S_STRING);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression subtract(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "-");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression sum(@NotNull double... r6) {
            r6.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("+");
            for (double d : r6) {
                expressionBuilder.addArgument(literal(d));
            }
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression switchCase(@NotNull Pair<Expression, Expression>[] stops, @NotNull Expression fallback) {
            stops.getClass();
            fallback.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(Constants.SENSITIVITY_CASE);
            for (Pair<Expression, Expression> pair : stops) {
                expressionBuilder.addArgument(pair.getFirst());
                expressionBuilder.addArgument(pair.getSecond());
            }
            expressionBuilder.addArgument(fallback);
            return expressionBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression tan(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "tan");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toBoolean(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-boolean");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toColor(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-color");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toHsla(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-hsla");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toNumber(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-number");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toRgba(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-rgba");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression toString(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "to-string");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression typeofExpression(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "typeof");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression upcase(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "upcase");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression varExpression(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "var");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression within(@NotNull Geometry geometry) {
            geometry.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("within");
            Expected<String, Value> fromJson = Value.fromJson(geometry.toJson());
            fromJson.getClass();
            Value value = fromJson.getValue();
            if (value == null) {
                Duration$$ExternalSyntheticBUOutline0.m$1(fromJson.getError());
                return null;
            }
            Object contents = value.getContents();
            contents.getClass();
            expressionBuilder.addArgument(new Expression((HashMap<String, Value>) contents));
            return expressionBuilder.build();
        }

        @JvmStatic
        @MapboxExperimental
        @NotNull
        public final Expression worldview(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "worldview");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression zoom() {
            return new ExpressionBuilder("zoom").build();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Expression literal(long value) {
            return new Expression(value, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final Expression literal(boolean value) {
            return new Expression(value, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final Expression literal(double value) {
            return new Expression(value, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Expression collator$default(Companion companion, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return companion.collator(z, z2, str);
        }

        @JvmStatic
        @NotNull
        public final Expression exponential(@NotNull Expression expression) {
            expression.getClass();
            return new ExpressionBuilder("exponential").addArgument(expression).build();
        }

        @NotNull
        public final Expression exponential(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("exponential", block);
        }

        @NotNull
        public final Expression abs(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("abs", block);
        }

        @NotNull
        public final Expression acos(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("acos", block);
        }

        @NotNull
        public final Expression all(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("all", block);
        }

        @NotNull
        public final Expression any(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(Languages.ANY, block);
        }

        @NotNull
        public final Expression array(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("array", block);
        }

        @NotNull
        public final Expression asin(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("asin", block);
        }

        @NotNull
        public final Expression at(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("at", block);
        }

        @NotNull
        public final Expression atan(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("atan", block);
        }

        @NotNull
        /* renamed from: boolean, reason: not valid java name */
        public final Expression m24748boolean(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(TypedValues.Custom.S_BOOLEAN, block);
        }

        @NotNull
        public final Expression ceil(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("ceil", block);
        }

        @NotNull
        public final Expression coalesce(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("coalesce", block);
        }

        @NotNull
        public final Expression config(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("config", block);
        }

        @NotNull
        public final Expression cos(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("cos", block);
        }

        @NotNull
        public final Expression division(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("/", block);
        }

        @NotNull
        public final Expression downcase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("downcase", block);
        }

        @NotNull
        public final Expression eq(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("==", block);
        }

        @NotNull
        public final Expression featureState(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("feature-state", block);
        }

        @NotNull
        public final Expression floor(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("floor", block);
        }

        @NotNull
        public final Expression get(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(MetricsConstants.Method.CACHE_GET, block);
        }

        @NotNull
        public final Expression gt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(">", block);
        }

        @NotNull
        public final Expression gte(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(">=", block);
        }

        @NotNull
        public final Expression has(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("has", block);
        }

        @NotNull
        public final Expression hsl(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("hsl", block);
        }

        @NotNull
        public final Expression hsla(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("hsla", block);
        }

        @NotNull
        public final Expression inExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("in", block);
        }

        @NotNull
        public final Expression indexOf(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("index-of", block);
        }

        @NotNull
        public final Expression isSupportedScript(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("is-supported-script", block);
        }

        @NotNull
        public final Expression length(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("length", block);
        }

        @NotNull
        public final Expression letExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("let", block);
        }

        @NotNull
        public final Expression ln(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("ln", block);
        }

        @NotNull
        public final Expression log10(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("log10", block);
        }

        @NotNull
        public final Expression log2(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("log2", block);
        }

        @NotNull
        public final Expression lt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("<", block);
        }

        @NotNull
        public final Expression lte(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("<=", block);
        }

        @NotNull
        public final Expression measureLight(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("measure-light", block);
        }

        @NotNull
        public final Expression mod(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("%", block);
        }

        @NotNull
        public final Expression neq(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("!=", block);
        }

        @NotNull
        public final Expression not(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(MarkdownConstants.EXCLAMATION_MARK, block);
        }

        @NotNull
        public final Expression number(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("number", block);
        }

        @NotNull
        public final Expression objectExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("object", block);
        }

        @NotNull
        public final Expression pow(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("^", block);
        }

        @NotNull
        public final Expression random(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("random", block);
        }

        @NotNull
        public final Expression resolvedLocale(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("resolved-locale", block);
        }

        @NotNull
        public final Expression round(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("round", block);
        }

        @NotNull
        public final Expression sin(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("sin", block);
        }

        @NotNull
        public final Expression slice(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("slice", block);
        }

        @NotNull
        public final Expression split(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("split", block);
        }

        @NotNull
        public final Expression sqrt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("sqrt", block);
        }

        @NotNull
        public final Expression string(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(TypedValues.Custom.S_STRING, block);
        }

        @NotNull
        public final Expression subtract(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("-", block);
        }

        @NotNull
        public final Expression tan(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("tan", block);
        }

        @NotNull
        public final Expression toBoolean(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-boolean", block);
        }

        @NotNull
        public final Expression toColor(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-color", block);
        }

        @NotNull
        public final Expression toHsla(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-hsla", block);
        }

        @NotNull
        public final Expression toNumber(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-number", block);
        }

        @NotNull
        public final Expression toRgba(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-rgba", block);
        }

        @NotNull
        public final Expression toString(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("to-string", block);
        }

        @NotNull
        public final Expression typeofExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("typeof", block);
        }

        @NotNull
        public final Expression upcase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("upcase", block);
        }

        @NotNull
        public final Expression varExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("var", block);
        }

        @NotNull
        public final Expression worldview(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("worldview", block);
        }

        @JvmStatic
        @NotNull
        public final Expression abs(double value) {
            return abs(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression acos(double value) {
            return acos(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression asin(double value) {
            return asin(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression at(double index, @NotNull Expression array) {
            array.getClass();
            return at(literal(index), array);
        }

        @JvmStatic
        @NotNull
        public final Expression atan(double value) {
            return atan(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression ceil(double value) {
            return ceil(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression cos(double value) {
            return cos(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression division(double first, double second) {
            return division(literal(first), literal(second));
        }

        @JvmStatic
        @NotNull
        public final Expression downcase(@NotNull String value) {
            value.getClass();
            return downcase(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression floor(double value) {
            return floor(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression get(@NotNull String key) {
            key.getClass();
            return get(literal(key));
        }

        @JvmStatic
        @NotNull
        public final Expression has(@NotNull String string, @NotNull Expression expression) {
            string.getClass();
            expression.getClass();
            return has(literal(string), expression);
        }

        @JvmStatic
        @NotNull
        public final Expression inExpression(@NotNull String needle, @NotNull Expression haystack) {
            needle.getClass();
            haystack.getClass();
            return inExpression(literal(needle), haystack);
        }

        @JvmStatic
        @NotNull
        public final Expression isSupportedScript(@NotNull String script) {
            script.getClass();
            return isSupportedScript(literal(script));
        }

        @JvmStatic
        @NotNull
        public final Expression length(@NotNull String string) {
            string.getClass();
            return length(literal(string));
        }

        @JvmStatic
        @NotNull
        public final Expression ln(double value) {
            return ln(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression log10(double value) {
            return log10(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression log2(double value) {
            return log2(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression mod(double first, double second) {
            return mod(literal(first), literal(second));
        }

        @JvmStatic
        @NotNull
        public final Expression not(boolean bool) {
            return not(literal(bool));
        }

        @JvmStatic
        @NotNull
        public final Expression pow(double first, double second) {
            return pow(literal(first), literal(second));
        }

        @JvmStatic
        @NotNull
        public final Expression round(double value) {
            return round(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression sin(double value) {
            return sin(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression sqrt(double value) {
            return sqrt(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression subtract(double first, double second) {
            return subtract(literal(first), literal(second));
        }

        @JvmStatic
        @NotNull
        public final Expression tan(double value) {
            return tan(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression upcase(@NotNull String value) {
            value.getClass();
            return upcase(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression varExpression(@NotNull String value) {
            value.getClass();
            return varExpression(literal(value));
        }

        @JvmStatic
        @NotNull
        public final Expression get(@NotNull String key, @NotNull Expression expression) {
            key.getClass();
            expression.getClass();
            return get(literal(key), expression);
        }

        @JvmStatic
        @NotNull
        public final Expression has(@NotNull String string) {
            string.getClass();
            return has(literal(string));
        }

        @JvmStatic
        @NotNull
        public final Expression inExpression(double needle, @NotNull Expression haystack) {
            haystack.getClass();
            return inExpression(literal(needle), haystack);
        }

        @JvmStatic
        @NotNull
        public final Expression subtract(double value) {
            return subtract(literal(value));
        }

        @NotNull
        public final Expression atInterpolated(@NotNull Function1<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("at-interpolated");
            block.invoke(interpolatorBuilder);
            return interpolatorBuilder.build();
        }

        @NotNull
        public final Expression interpolate(@NotNull Function1<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            block.invoke(interpolatorBuilder);
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression collator(boolean caseSensitive, boolean diacriticSensitive, @NotNull String locale) {
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        @NotNull
        public final Expression concat(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("concat", block);
        }

        @NotNull
        public final Expression max(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(ReactProperties.GEOFENCE_MAXIMUM_RANGE, block);
        }

        @NotNull
        public final Expression min(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(ReactProperties.GEOFENCE_MINIMUM_RANGE, block);
        }

        @NotNull
        public final Expression product(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("*", block);
        }

        @NotNull
        public final Expression sum(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("+", block);
        }

        @JvmStatic
        @NotNull
        public final Expression collator(boolean caseSensitive, boolean diacriticSensitive, @NotNull Locale locale) {
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        @JvmStatic
        @NotNull
        public final Expression concat(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "concat");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression max(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, ReactProperties.GEOFENCE_MAXIMUM_RANGE);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression min(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, ReactProperties.GEOFENCE_MINIMUM_RANGE);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @NotNull
        public final Expression numberFormat(@NotNull Expression number, @NotNull Function1<? super NumberFormatBuilder, Unit> block) {
            number.getClass();
            block.getClass();
            NumberFormatBuilder numberFormatBuilder = new NumberFormatBuilder(number);
            block.invoke(numberFormatBuilder);
            return numberFormatBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression product(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "*");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression sum(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "+");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression numberFormat(double value, @NotNull Function1<? super NumberFormatBuilder, Unit> block) {
            block.getClass();
            return numberFormat(literal(value), block);
        }

        @NotNull
        public final Expression collator(@NotNull Function1<? super CollatorBuilder, Unit> block) {
            block.getClass();
            CollatorBuilder collatorBuilder = new CollatorBuilder();
            block.invoke(collatorBuilder);
            return collatorBuilder.build();
        }

        @NotNull
        public final Expression rgb(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("rgb", block);
        }

        @JvmStatic
        @NotNull
        public final Expression rgb(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "rgb");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression cubicBezier(@NotNull Expression x1, @NotNull Expression x2, @NotNull Expression x3, @NotNull Expression x4) {
            x1.getClass();
            x2.getClass();
            x3.getClass();
            x4.getClass();
            return new ExpressionBuilder("cubic-bezier").addArgument(x1).addArgument(x2).addArgument(x3).addArgument(x4).build();
        }

        @NotNull
        public final Expression rgba(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("rgba", block);
        }

        @NotNull
        public final Expression cubicBezier(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("cubic-bezier", block);
        }

        @JvmStatic
        @NotNull
        public final Expression rgba(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "rgba");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @NotNull
        public final Expression switchCase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m(Constants.SENSITIVITY_CASE, block);
        }

        @JvmStatic
        @NotNull
        public final Expression switchCase(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, Constants.SENSITIVITY_CASE);
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression exponentialInterpolator(double base, @NotNull Expression input, @NotNull Pair<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.exponential(base);
            interpolatorBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                interpolatorBuilder.addArgument(pair.getFirst());
                interpolatorBuilder.addArgument(pair.getSecond());
            }
            return interpolatorBuilder.build();
        }

        @NotNull
        public final Expression match(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("match", block);
        }

        @JvmStatic
        @NotNull
        public final Expression match(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "match");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @NotNull
        public final Expression step(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            return RegionDefaults$$ExternalSyntheticOutline0.m("step", block);
        }

        @JvmStatic
        @NotNull
        public final Expression step(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "step");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @JvmStatic
        @NotNull
        public final Expression cubicBezierInterpolator(double x1, double y1, double x2, double y2, @NotNull Expression input, @NotNull Pair<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.cubicBezier(x1, y1, x2, y2);
            interpolatorBuilder.addArgument(input);
            for (Pair<Expression, Expression> pair : stops) {
                interpolatorBuilder.addArgument(pair.getFirst());
                interpolatorBuilder.addArgument(pair.getSecond());
            }
            return interpolatorBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression literal$extension_style_release(@NotNull List<? extends Object> value) {
            value.getClass();
            return new ExpressionBuilder("literal").addArgument(new Expression(value)).build();
        }

        @NotNull
        public final Expression format(@NotNull Function1<? super FormatBuilder, Unit> block) {
            block.getClass();
            FormatBuilder formatBuilder = new FormatBuilder();
            block.invoke(formatBuilder);
            return formatBuilder.build();
        }

        @JvmStatic
        @MapboxExperimental
        @NotNull
        public final Expression image(@NotNull Expression image, @NotNull Map<String, Expression> options) {
            image.getClass();
            options.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            imageBuilder.addArgument(image);
            ArrayList arrayList = new ArrayList(options.size());
            for (Map.Entry<String, Expression> entry : options.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            Object[] array = arrayList.toArray(new Pair[0]);
            array.getClass();
            Pair[] pairArr = (Pair[]) array;
            imageBuilder.imageOptions((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            return imageBuilder.build();
        }

        @JvmStatic
        @NotNull
        public final Expression image(@NotNull Expression... expressions) {
            ExpressionBuilder m = RegionDefaults$$ExternalSyntheticOutline0.m(expressions, "image");
            for (Expression expression : expressions) {
                m.addArgument(expression);
            }
            return m.build();
        }

        @NotNull
        public final Expression image(@NotNull Function1<? super ImageBuilder, Unit> block) {
            block.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            block.invoke(imageBuilder);
            return imageBuilder.build();
        }
    }

    @JvmStatic
    @NotNull
    public static final Expression abs(@NotNull Expression... expressionArr) {
        return INSTANCE.abs(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression acos(@NotNull Expression... expressionArr) {
        return INSTANCE.acos(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression asin(@NotNull Expression... expressionArr) {
        return INSTANCE.asin(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression at(@NotNull Expression... expressionArr) {
        return INSTANCE.at(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression atan(@NotNull Expression... expressionArr) {
        return INSTANCE.atan(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression ceil(@NotNull Expression... expressionArr) {
        return INSTANCE.ceil(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression collator(boolean z, boolean z2, @NotNull String str) {
        return INSTANCE.collator(z, z2, str);
    }

    @JvmStatic
    @NotNull
    public static final Expression concat(@NotNull String... strArr) {
        return INSTANCE.concat(strArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression cos(@NotNull Expression... expressionArr) {
        return INSTANCE.cos(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression division(@NotNull Expression... expressionArr) {
        return INSTANCE.division(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression downcase(@NotNull Expression... expressionArr) {
        return INSTANCE.downcase(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression exponential(@NotNull Expression expression) {
        return INSTANCE.exponential(expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression exponentialInterpolator(@NotNull Expression expression, @NotNull Expression expression2, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.exponentialInterpolator(expression, expression2, pairArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression floor(@NotNull Expression... expressionArr) {
        return INSTANCE.floor(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression get(@NotNull String str, @NotNull Expression expression) {
        return INSTANCE.get(str, expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression has(@NotNull String str, @NotNull Expression expression) {
        return INSTANCE.has(str, expression);
    }

    @JvmStatic
    @MapboxExperimental
    @NotNull
    public static final Expression image(@NotNull Expression expression, @NotNull Map<String, Expression> map, @NotNull Expression expression2, @NotNull Map<String, Expression> map2) {
        return INSTANCE.image(expression, map, expression2, map2);
    }

    @JvmStatic
    @NotNull
    public static final Expression inExpression(@NotNull String str, @NotNull Expression expression) {
        return INSTANCE.inExpression(str, expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression isSupportedScript(@NotNull Expression... expressionArr) {
        return INSTANCE.isSupportedScript(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression length(@NotNull Expression... expressionArr) {
        return INSTANCE.length(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression literal(long j) {
        return INSTANCE.literal(j);
    }

    @JvmStatic
    @NotNull
    public static final Expression ln(@NotNull Expression... expressionArr) {
        return INSTANCE.ln(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression log10(@NotNull Expression... expressionArr) {
        return INSTANCE.log10(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression log2(@NotNull Expression... expressionArr) {
        return INSTANCE.log2(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression match(@NotNull Expression... expressionArr) {
        return INSTANCE.match(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression max(@NotNull Expression... expressionArr) {
        return INSTANCE.max(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression min(@NotNull Expression... expressionArr) {
        return INSTANCE.min(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression mod(@NotNull Expression... expressionArr) {
        return INSTANCE.mod(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression not(@NotNull Expression... expressionArr) {
        return INSTANCE.not(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression pow(@NotNull Expression... expressionArr) {
        return INSTANCE.pow(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression product(@NotNull Expression... expressionArr) {
        return INSTANCE.product(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression round(@NotNull Expression... expressionArr) {
        return INSTANCE.round(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression sin(@NotNull Expression... expressionArr) {
        return INSTANCE.sin(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression sqrt(@NotNull Expression... expressionArr) {
        return INSTANCE.sqrt(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression step(@NotNull Expression... expressionArr) {
        return INSTANCE.step(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression subtract(double d, double d2) {
        return INSTANCE.subtract(d, d2);
    }

    @JvmStatic
    @NotNull
    public static final Expression sum(@NotNull Expression... expressionArr) {
        return INSTANCE.sum(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression switchCase(@NotNull Pair<Expression, Expression>[] pairArr, @NotNull Expression expression) {
        return INSTANCE.switchCase(pairArr, expression);
    }

    @JvmStatic
    @NotNull
    public static final Expression tan(@NotNull Expression... expressionArr) {
        return INSTANCE.tan(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression upcase(@NotNull Expression... expressionArr) {
        return INSTANCE.upcase(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression varExpression(@NotNull Expression... expressionArr) {
        return INSTANCE.varExpression(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression collator(boolean z, boolean z2, @NotNull Locale locale) {
        return INSTANCE.collator(z, z2, locale);
    }

    @JvmStatic
    @NotNull
    public static final Expression get(@NotNull Expression... expressionArr) {
        return INSTANCE.get(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression has(@NotNull Expression... expressionArr) {
        return INSTANCE.has(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression image(@NotNull Expression... expressionArr) {
        return INSTANCE.image(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression inExpression(@NotNull Expression... expressionArr) {
        return INSTANCE.inExpression(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression literal(@NotNull String str) {
        return INSTANCE.literal(str);
    }

    @JvmStatic
    @NotNull
    public static final Expression subtract(@NotNull Expression... expressionArr) {
        return INSTANCE.subtract(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression literal(boolean z) {
        return INSTANCE.literal(z);
    }

    @JvmStatic
    @NotNull
    public static final Expression rgb(@NotNull Expression... expressionArr) {
        return INSTANCE.rgb(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression cubicBezier(@NotNull Expression expression, @NotNull Expression expression2, @NotNull Expression expression3, @NotNull Expression expression4) {
        return INSTANCE.cubicBezier(expression, expression2, expression3, expression4);
    }

    @JvmStatic
    @NotNull
    public static final Expression rgba(@NotNull Expression... expressionArr) {
        return INSTANCE.rgba(expressionArr);
    }

    @JvmStatic
    @NotNull
    public static final Expression numberFormat(double d, @NotNull Function1<? super NumberFormatBuilder, Unit> function1) {
        return INSTANCE.numberFormat(d, function1);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u001f\u0010\n\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u001f\u0010\u0011\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tJ\u001f\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "()V", "options", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "caseSensitive", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "", "diacriticSensitive", "locale", "Ljava/util/Locale;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CollatorBuilder extends Builder {

        @NotNull
        private final HashMap<String, Value> options;

        public CollatorBuilder() {
            super("collator");
            this.options = new HashMap<>();
        }

        public static /* synthetic */ CollatorBuilder caseSensitive$default(CollatorBuilder collatorBuilder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return collatorBuilder.caseSensitive(z);
        }

        public static /* synthetic */ CollatorBuilder diacriticSensitive$default(CollatorBuilder collatorBuilder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return collatorBuilder.diacriticSensitive(z);
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        @NotNull
        public Expression build() {
            getArguments$extension_style_release().add(new Expression(this.options));
            return super.build();
        }

        @NotNull
        public final CollatorBuilder caseSensitive(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("case-sensitive", Expression.INSTANCE.m24748boolean(block));
            return this;
        }

        @NotNull
        public final CollatorBuilder diacriticSensitive(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("diacritic-sensitive", Expression.INSTANCE.m24748boolean(block));
            return this;
        }

        @NotNull
        public final CollatorBuilder locale(@NotNull Locale locale) {
            locale.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            String country = locale.getCountry();
            country.getClass();
            if (country.length() > 0) {
                sb.append("-");
                sb.append(country);
            }
            this.options.put("locale", Expression.INSTANCE.literal(sb.toString()));
            return this;
        }

        @NotNull
        public final CollatorBuilder caseSensitive(@NotNull Expression caseSensitive) {
            caseSensitive.getClass();
            this.options.put("case-sensitive", caseSensitive);
            return this;
        }

        @NotNull
        public final CollatorBuilder diacriticSensitive(@NotNull Expression diacriticSensitive) {
            diacriticSensitive.getClass();
            this.options.put("diacritic-sensitive", diacriticSensitive);
            return this;
        }

        @NotNull
        public final CollatorBuilder caseSensitive(boolean caseSensitive) {
            this.options.put("case-sensitive", Expression.INSTANCE.literal(caseSensitive));
            return this;
        }

        @NotNull
        public final CollatorBuilder diacriticSensitive(boolean diacriticSensitive) {
            this.options.put("diacritic-sensitive", Expression.INSTANCE.literal(diacriticSensitive));
            return this;
        }

        @NotNull
        public final CollatorBuilder locale(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("locale", Expression.INSTANCE.string(block));
            return this;
        }

        @NotNull
        public final CollatorBuilder locale(@NotNull String locale) {
            locale.getClass();
            this.options.put("locale", Expression.INSTANCE.literal(locale));
            return this;
        }

        @NotNull
        public final CollatorBuilder locale(@NotNull Expression locale) {
            locale.getClass();
            this.options.put("locale", locale);
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0013\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0000J\u001f\u0010\r\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0000H\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u0015\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0011J\u001f\u0010\u0018\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u001a\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u001c\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\u001d\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\u001e\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\"J\u001f\u0010#\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010#\u001a\u00020\u00002\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030%\"\u00020\u0003¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010(\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u0000J\u001f\u0010-\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0016\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bJ\u001f\u00100\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\u0000J\u001f\u00102\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u00103\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u00104\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u00104\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u00105\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u00107\u001a\u00020\u0000J\u001f\u00108\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0003J\u0016\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\u001f\u0010:\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010;\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010<\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003J\u0016\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010>\u001a\u00020\u0000J\u001f\u0010?\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010@\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u0010A\u001a\u00020\u0000J\u001f\u0010B\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010D\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0016\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u0011J\u0016\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0011J\u001f\u0010G\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010H\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010I\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0003J\u001f\u0010K\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003J\u001f\u0010L\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u0010M\u001a\u00020\u0000J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020OJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020PJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J*\u0010N\u001a\u00020\u00002\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020R0Qj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020R`SJ\u0014\u0010N\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020R0TJ\u001f\u0010U\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010U\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010V\u001a\u00020\u0000J\u001f\u0010W\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010X\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010X\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010Y\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010Z\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010[\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010\\\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0012\u0010\\\u001a\u00020\u00002\n\u0010$\u001a\u00020]\"\u00020\u000bJ\u001f\u0010^\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010_\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0012\u0010_\u001a\u00020\u00002\n\u0010$\u001a\u00020]\"\u00020\u000bJ\u001f\u0010`\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0016\u0010`\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bJ\u001f\u0010a\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010b\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020OJ\u001f\u0010d\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ'\u0010e\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u00112\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ'\u0010e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010h\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u0010i\u001a\u00020\u0000J\u0006\u0010j\u001a\u00020\u0000J\u001f\u0010k\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0016\u0010k\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bJ\u001f\u0010l\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0012\u0010l\u001a\u00020\u00002\n\u0010m\u001a\u00020]\"\u00020\u000bJ\u0006\u0010n\u001a\u00020\u0000J\u001f\u0010o\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u0010p\u001a\u00020\u0000J\u0006\u0010q\u001a\u00020\u0000J\u001f\u0010r\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010s\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001e\u0010s\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020\u000bJ\u001f\u0010w\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ&\u0010w\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000bJ\u001f\u0010y\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010y\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010z\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010z\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010{\u001a\u00020\u0000J\u001f\u0010|\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010}\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010~\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000e\u0010~\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\u007f\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0018\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u00112\u0007\u0010\u0081\u0001\u001a\u00020\u0011J \u0010\u0080\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ(\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u000b2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0018\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020\u000bJ\u001d\u0010\u0080\u0001\u001a\u00020\u00002\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0083\u0001J\u001f\u0010=\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u0084\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0017\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bJ \u0010\u0085\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0013\u0010\u0085\u0001\u001a\u00020\u00002\n\u0010m\u001a\u00020]\"\u00020\u000bJ \u0010\u0086\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u0087\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0087\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0088\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u0089\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008a\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008b\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008c\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008d\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008e\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ \u0010\u008f\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u008f\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J \u0010\u0090\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0090\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u0011\u0010\u0091\u0001\u001a\u00020\u00002\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001J\"\u0010\u0094\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007J\u0007\u0010\u0095\u0001\u001a\u00020\u0000¨\u0006\u0096\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "operator", "", "(Ljava/lang/String;)V", "abs", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "value", "", "accumulated", "acos", "activeAnchor", "addArgument", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "all", Languages.ANY, "array", "asin", "at", "index", "atInterpolated", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "atan", TypedValues.Custom.S_BOOLEAN, "ceil", "coalesce", "collator", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "color", "intColor", "", "concat", "values", "", "([Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "config", "cos", "distance", "geojson", "Lcom/mapbox/geojson/GeoJson;", "distanceFromCenter", "division", DefaultPreloadManager.METRIC_PATH_FIRST, "second", "downcase", "e", "eq", "featureState", "floor", "format", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "geometryType", MetricsConstants.Method.CACHE_GET, "key", "gt", "gte", "has", TypedValues.Custom.S_STRING, "heatmapDensity", "hsl", "hsla", "id", "image", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "inExpression", "needle", "haystack", "indexOf", "interpolate", "isSupportedScript", "script", "length", "letExpression", "lineProgress", "literal", "", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "ln", "ln2", "log10", "log2", "lt", "lte", "match", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "", "measureLight", ReactProperties.GEOFENCE_MINIMUM_RANGE, "mod", "neq", SmartPlayConstants.SMART_PLAY_NOT_CONDITION_PREFIX, "bool", "number", "numberFormat", "input", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "objectExpression", ContextChain.TAG_PRODUCT_AND_INFRA, ResponseFields.PITCH, "pow", AMPDInformationProvider.DEVICE_PRODUCT_KEY, "double", "properties", "random", "rasterParticleSpeed", "rasterValue", "resolvedLocale", "rgb", "red", "green", "blue", "rgba", "alpha", "round", "sin", "skyRadialProgress", "slice", "split", "sqrt", "step", "stop", ContactsModuleConstants.OUTPUT, "pair", "Lkotlin/Pair;", "subtract", "sum", "switchCase", "tan", "toBoolean", "toColor", "toHsla", "toNumber", "toRgba", "toString", "typeofExpression", "upcase", "varExpression", "within", "geometry", "Lcom/mapbox/geojson/Geometry;", "worldview", "zoom", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class ExpressionBuilder extends Builder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpressionBuilder(@NotNull String str) {
            super(str);
            str.getClass();
        }

        @NotNull
        public final ExpressionBuilder abs(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.abs(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder accumulated() {
            getArguments$extension_style_release().add(Expression.INSTANCE.accumulated());
            return this;
        }

        @NotNull
        public final ExpressionBuilder acos(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.acos(block));
            return this;
        }

        @MapboxExperimental
        @NotNull
        public final ExpressionBuilder activeAnchor() {
            getArguments$extension_style_release().add(Expression.INSTANCE.activeAnchor());
            return this;
        }

        @NotNull
        public final ExpressionBuilder addArgument(@NotNull Expression expression) {
            expression.getClass();
            getArguments$extension_style_release().add(expression);
            return this;
        }

        @NotNull
        public final ExpressionBuilder all(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.all(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder any(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.any(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder array(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.array(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder asin(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.asin(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder at(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.at(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder atInterpolated(@NotNull Function1<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.atInterpolated(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder atan(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.atan(block));
            return this;
        }

        @NotNull
        /* renamed from: boolean, reason: not valid java name */
        public final ExpressionBuilder m24750boolean(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.m24748boolean(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder ceil(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.ceil(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder coalesce(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.coalesce(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder collator(@NotNull Function1<? super CollatorBuilder, Unit> block) {
            block.getClass();
            ArrayList<Expression> arguments$extension_style_release = getArguments$extension_style_release();
            CollatorBuilder collatorBuilder = new CollatorBuilder();
            block.invoke(collatorBuilder);
            arguments$extension_style_release.add(collatorBuilder.build());
            return this;
        }

        @NotNull
        public final ExpressionBuilder color(@ColorInt int intColor) {
            getArguments$extension_style_release().add(Expression.INSTANCE.color(intColor));
            return this;
        }

        @NotNull
        public final ExpressionBuilder concat(@NotNull String... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.concat((String[]) Arrays.copyOf(values, values.length)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder config(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.config(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder cos(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cos(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder distance(@NotNull GeoJson geojson) {
            geojson.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.distance(geojson));
            return this;
        }

        @NotNull
        public final ExpressionBuilder distanceFromCenter() {
            getArguments$extension_style_release().add(Expression.INSTANCE.distanceFromCenter());
            return this;
        }

        @NotNull
        public final ExpressionBuilder division(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.division(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder downcase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.downcase(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder e() {
            getArguments$extension_style_release().add(Expression.INSTANCE.e());
            return this;
        }

        @NotNull
        public final ExpressionBuilder eq(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.eq(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder featureState(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.featureState(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder floor(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.floor(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder format(@NotNull Function1<? super FormatBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.format(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder geometryType() {
            getArguments$extension_style_release().add(Expression.INSTANCE.geometryType());
            return this;
        }

        @NotNull
        public final ExpressionBuilder get(@NotNull String key, @NotNull Expression expression) {
            key.getClass();
            expression.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(key, expression));
            return this;
        }

        @NotNull
        public final ExpressionBuilder gt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.gt(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder gte(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.gte(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder has(@NotNull String string, @NotNull Expression expression) {
            string.getClass();
            expression.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(string, expression));
            return this;
        }

        @NotNull
        public final ExpressionBuilder heatmapDensity() {
            getArguments$extension_style_release().add(Expression.INSTANCE.heatmapDensity());
            return this;
        }

        @NotNull
        public final ExpressionBuilder hsl(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.hsl(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder hsla(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.hsla(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder id() {
            getArguments$extension_style_release().add(Expression.INSTANCE.id());
            return this;
        }

        @NotNull
        public final ExpressionBuilder image(@NotNull Function1<? super ImageBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.image(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder inExpression(@NotNull String needle, @NotNull Expression haystack) {
            needle.getClass();
            haystack.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(needle, haystack));
            return this;
        }

        @NotNull
        public final ExpressionBuilder indexOf(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.indexOf(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder interpolate(@NotNull Function1<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.interpolate(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder isSupportedScript(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.isSupportedScript(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder length(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.length(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder letExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.letExpression(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder lineProgress() {
            getArguments$extension_style_release().add(Expression.INSTANCE.lineProgress());
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(@NotNull String value) {
            value.getClass();
            getArguments$extension_style_release().add(new Expression(value, (DefaultConstructorMarker) null));
            return this;
        }

        @NotNull
        public final ExpressionBuilder ln(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.ln(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder ln2() {
            getArguments$extension_style_release().add(Expression.INSTANCE.ln2());
            return this;
        }

        @NotNull
        public final ExpressionBuilder log10(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.log10(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder log2(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.log2(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder lt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.lt(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder lte(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.lte(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder match(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.match(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder max(@NotNull double... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.max(Arrays.copyOf(values, values.length)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder measureLight(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.measureLight(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder min(@NotNull double... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.min(Arrays.copyOf(values, values.length)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder mod(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.mod(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder neq(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.neq(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder not(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.not(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder number(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.number(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder numberFormat(@NotNull Expression input, @NotNull Function1<? super NumberFormatBuilder, Unit> block) {
            input.getClass();
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.numberFormat(input, block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder objectExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.objectExpression(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder pi() {
            getArguments$extension_style_release().add(Expression.INSTANCE.pi());
            return this;
        }

        @NotNull
        public final ExpressionBuilder pitch() {
            getArguments$extension_style_release().add(Expression.INSTANCE.pitch());
            return this;
        }

        @NotNull
        public final ExpressionBuilder pow(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.pow(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder product(@NotNull double... r4) {
            r4.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.product(Arrays.copyOf(r4, r4.length)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder properties() {
            getArguments$extension_style_release().add(Expression.INSTANCE.properties());
            return this;
        }

        @NotNull
        public final ExpressionBuilder random(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.random(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder rasterParticleSpeed() {
            getArguments$extension_style_release().add(Expression.INSTANCE.rasterParticleSpeed());
            return this;
        }

        @NotNull
        public final ExpressionBuilder rasterValue() {
            getArguments$extension_style_release().add(Expression.INSTANCE.rasterValue());
            return this;
        }

        @NotNull
        public final ExpressionBuilder resolvedLocale(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.resolvedLocale(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder rgb(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.rgb(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder rgba(double red, double green, double blue, double alpha) {
            getArguments$extension_style_release().add(Expression.INSTANCE.rgba(red, green, blue, alpha));
            return this;
        }

        @NotNull
        public final ExpressionBuilder round(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.round(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sin(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sin(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder skyRadialProgress() {
            getArguments$extension_style_release().add(Expression.INSTANCE.skyRadialProgress());
            return this;
        }

        @NotNull
        public final ExpressionBuilder slice(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.slice(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder split(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.split(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sqrt(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sqrt(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder step(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.step(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder stop(@NotNull Pair<Expression, Expression> pair) {
            pair.getClass();
            addArgument(pair.getFirst()).addArgument(pair.getSecond());
            return this;
        }

        @NotNull
        public final ExpressionBuilder string(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.string(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder subtract(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sum(@NotNull double... r4) {
            r4.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sum(Arrays.copyOf(r4, r4.length)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder switchCase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.switchCase(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder tan(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.tan(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toBoolean(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toBoolean(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toColor(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toColor(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toHsla(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toHsla(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toNumber(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toNumber(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toRgba(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toRgba(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder toString(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toString(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder typeofExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.typeofExpression(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder upcase(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.upcase(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder varExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.varExpression(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder within(@NotNull Geometry geometry) {
            geometry.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.within(geometry));
            return this;
        }

        @MapboxExperimental
        @NotNull
        public final ExpressionBuilder worldview(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.worldview(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder zoom() {
            getArguments$extension_style_release().add(Expression.INSTANCE.zoom());
            return this;
        }

        @NotNull
        public final ExpressionBuilder abs(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.abs(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder acos(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.acos(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder asin(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.asin(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder at(double index, @NotNull Expression array) {
            array.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.at(index, array));
            return this;
        }

        @NotNull
        public final ExpressionBuilder atan(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.atan(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder ceil(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.ceil(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder cos(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.cos(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder division(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.division(first, second));
            return this;
        }

        @NotNull
        public final ExpressionBuilder downcase(@NotNull String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.downcase(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder floor(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.floor(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder isSupportedScript(@NotNull String script) {
            script.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.isSupportedScript(script));
            return this;
        }

        @NotNull
        public final ExpressionBuilder length(@NotNull String string) {
            string.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.length(string));
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(long value) {
            getArguments$extension_style_release().add(new Expression(value, (DefaultConstructorMarker) null));
            return this;
        }

        @NotNull
        public final ExpressionBuilder ln(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.ln(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder log10(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.log10(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder log2(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.log2(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder mod(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.mod(first, second));
            return this;
        }

        @NotNull
        public final ExpressionBuilder not(boolean bool) {
            getArguments$extension_style_release().add(Expression.INSTANCE.not(bool));
            return this;
        }

        @NotNull
        public final ExpressionBuilder pow(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.pow(first, second));
            return this;
        }

        @NotNull
        public final ExpressionBuilder rgb(double red, double green, double blue) {
            getArguments$extension_style_release().add(Expression.INSTANCE.rgb(red, green, blue));
            return this;
        }

        @NotNull
        public final ExpressionBuilder round(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.round(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sin(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.sin(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sqrt(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.sqrt(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder subtract(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(first, second));
            return this;
        }

        @NotNull
        public final ExpressionBuilder tan(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.tan(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder upcase(@NotNull String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.upcase(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder varExpression(@NotNull String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.varExpression(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(boolean value) {
            getArguments$extension_style_release().add(new Expression(value, (DefaultConstructorMarker) null));
            return this;
        }

        @NotNull
        public final ExpressionBuilder subtract(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(double value) {
            getArguments$extension_style_release().add(new Expression(value, (DefaultConstructorMarker) null));
            return this;
        }

        @NotNull
        public final ExpressionBuilder rgba(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.rgba(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder get(@NotNull String key) {
            key.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(key));
            return this;
        }

        @NotNull
        public final ExpressionBuilder has(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder inExpression(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(@NotNull HashMap<String, Object> value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.literal$extension_style_release(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder numberFormat(double value, @NotNull Function1<? super NumberFormatBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.numberFormat(value, block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder get(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder has(@NotNull String string) {
            string.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(string));
            return this;
        }

        @NotNull
        public final ExpressionBuilder inExpression(double needle, @NotNull Expression haystack) {
            haystack.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(needle, haystack));
            return this;
        }

        @NotNull
        public final ExpressionBuilder literal(@NotNull List<? extends Object> value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.literal$extension_style_release(value));
            return this;
        }

        @NotNull
        public final ExpressionBuilder max(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.max(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder min(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.min(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder product(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.product(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder sum(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sum(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder stop(double input, @NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            block.invoke(addArgument(Expression.INSTANCE.literal(input)));
            return this;
        }

        @NotNull
        public final ExpressionBuilder concat(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.concat(block));
            return this;
        }

        @NotNull
        public final ExpressionBuilder stop(@NotNull Expression input, @NotNull Expression output) {
            input.getClass();
            output.getClass();
            addArgument(input).addArgument(output);
            return this;
        }

        @NotNull
        public final ExpressionBuilder stop(double input, double output) {
            Companion companion = Expression.INSTANCE;
            addArgument(companion.literal(input)).addArgument(companion.literal(output));
            return this;
        }

        @NotNull
        public final ExpressionBuilder stop(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            block.invoke(this);
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003J\u001f\u0010\f\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011J\u0010\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", "content", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "options", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "fontScale", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "", Common.TEXT_COLOR, "", "textFont", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FormatSectionBuilder {

        @NotNull
        private final Expression content;

        @NotNull
        private final HashMap<String, Value> options;

        public FormatSectionBuilder(@NotNull Expression expression) {
            expression.getClass();
            this.content = expression;
            this.options = new HashMap<>();
        }

        @NotNull
        public final List<Expression> build() {
            return CollectionsKt.listOf((Object[]) new Expression[]{this.content, new Expression(this.options)});
        }

        @NotNull
        public final FormatSectionBuilder fontScale(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("font-scale", Expression.INSTANCE.number(block));
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textColor(@NotNull String textColor) {
            textColor.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.literal(textColor));
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textFont(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            HashMap<String, Value> hashMap = this.options;
            ExpressionBuilder addArgument = new ExpressionBuilder("array").addArgument(Expression.INSTANCE.literal(TypedValues.Custom.S_STRING));
            block.invoke(addArgument);
            hashMap.put("text-font", addArgument.build());
            return this;
        }

        @NotNull
        public final FormatSectionBuilder fontScale(@NotNull Expression fontScale) {
            fontScale.getClass();
            this.options.put("font-scale", fontScale);
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textColor(@ColorInt int textColor) {
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.color(textColor));
            return this;
        }

        @NotNull
        public final FormatSectionBuilder fontScale(double fontScale) {
            this.options.put("font-scale", Expression.INSTANCE.literal(fontScale));
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textColor(@NotNull Expression textColor) {
            textColor.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, textColor);
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textColor(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.toColor(block));
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textFont(@NotNull Expression textFont) {
            textFont.getClass();
            this.options.put("text-font", textFont);
            return this;
        }

        @NotNull
        public final FormatSectionBuilder textFont(@NotNull List<String> textFont) {
            textFont.getClass();
            this.options.put("text-font", Expression.INSTANCE.literal$extension_style_release(textFont));
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u001f\u0010\u0005\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eJ&\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u001f\u0010\u0010\u001a\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "operator", "", "(Ljava/lang/String;)V", "cubicBezier", "x1", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "x2", "x3", "x4", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "", "exponential", "value", "linear", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class InterpolatorBuilder extends ExpressionBuilder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterpolatorBuilder(@NotNull String str) {
            super(str);
            str.getClass();
        }

        @NotNull
        public final InterpolatorBuilder cubicBezier(@NotNull Expression x1, @NotNull Expression x2, @NotNull Expression x3, @NotNull Expression x4) {
            x1.getClass();
            x2.getClass();
            x3.getClass();
            x4.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(x1, x2, x3, x4));
            return this;
        }

        @NotNull
        public final InterpolatorBuilder exponential(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(block));
            return this;
        }

        @NotNull
        public final InterpolatorBuilder linear() {
            getArguments$extension_style_release().add(Expression.INSTANCE.linear());
            return this;
        }

        @NotNull
        public final InterpolatorBuilder exponential(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(value));
            return this;
        }

        @NotNull
        public final InterpolatorBuilder exponential(@NotNull Expression value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(value));
            return this;
        }

        @NotNull
        public final InterpolatorBuilder cubicBezier(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(block));
            return this;
        }

        @NotNull
        public final InterpolatorBuilder cubicBezier(double x1, double x2, double x3, double x4) {
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(x1, x2, x3, x4));
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "input", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "options", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "currency", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "locale", "maxFractionDigits", "", "minFractionDigits", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NumberFormatBuilder extends Builder {

        @NotNull
        private final Expression input;

        @NotNull
        private final HashMap<String, Value> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NumberFormatBuilder(@NotNull Expression expression) {
            super("number-format");
            expression.getClass();
            this.input = expression;
            this.options = new HashMap<>();
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        @NotNull
        public Expression build() {
            getArguments$extension_style_release().add(this.input);
            getArguments$extension_style_release().add(new Expression(this.options));
            return super.build();
        }

        @NotNull
        public final NumberFormatBuilder currency(@NotNull String currency) {
            currency.getClass();
            this.options.put("currency", Expression.INSTANCE.literal(currency));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder locale(@NotNull String locale) {
            locale.getClass();
            this.options.put("locale", Expression.INSTANCE.literal(locale));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder maxFractionDigits(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("max-fraction-digits", Expression.INSTANCE.number(block));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder minFractionDigits(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("min-fraction-digits", Expression.INSTANCE.number(block));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder currency(@NotNull Expression currency) {
            currency.getClass();
            this.options.put("currency", currency);
            return this;
        }

        @NotNull
        public final NumberFormatBuilder locale(@NotNull Expression locale) {
            locale.getClass();
            this.options.put("locale", locale);
            return this;
        }

        @NotNull
        public final NumberFormatBuilder maxFractionDigits(@NotNull Expression maxFractionDigits) {
            maxFractionDigits.getClass();
            this.options.put("max-fraction-digits", maxFractionDigits);
            return this;
        }

        @NotNull
        public final NumberFormatBuilder minFractionDigits(@NotNull Expression minFractionDigits) {
            minFractionDigits.getClass();
            this.options.put("min-fraction-digits", minFractionDigits);
            return this;
        }

        @NotNull
        public final NumberFormatBuilder currency(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("currency", Expression.INSTANCE.string(block));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder locale(@NotNull Function1<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("locale", Expression.INSTANCE.string(block));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder maxFractionDigits(int maxFractionDigits) {
            this.options.put("max-fraction-digits", Expression.INSTANCE.literal(maxFractionDigits));
            return this;
        }

        @NotNull
        public final NumberFormatBuilder minFractionDigits(int minFractionDigits) {
            this.options.put("min-fraction-digits", Expression.INSTANCE.literal(minFractionDigits));
            return this;
        }
    }

    @JvmStatic
    @NotNull
    public static final Expression cubicBezierInterpolator(@NotNull Expression expression, @NotNull Expression expression2, @NotNull Expression expression3, @NotNull Expression expression4, @NotNull Expression expression5, @NotNull Pair<Expression, Expression>... pairArr) {
        return INSTANCE.cubicBezierInterpolator(expression, expression2, expression3, expression4, expression5, pairArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExpressionDsl
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "()V", "sections", "Ljava/util/ArrayList;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lkotlin/collections/ArrayList;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "formatSection", "content", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "text", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FormatBuilder extends Builder {

        @NotNull
        private final ArrayList<Expression> sections;

        public FormatBuilder() {
            super("format");
            this.sections = new ArrayList<>();
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        @NotNull
        public Expression build() {
            getArguments$extension_style_release().addAll(this.sections);
            return super.build();
        }

        @NotNull
        public final FormatBuilder formatSection(@NotNull String text, @NotNull Function1<? super FormatSectionBuilder, Unit> block) {
            text.getClass();
            block.getClass();
            ArrayList<Expression> arrayList = this.sections;
            FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(Expression.INSTANCE.literal(text));
            block.invoke(formatSectionBuilder);
            arrayList.addAll(formatSectionBuilder.build());
            return this;
        }

        @NotNull
        public final FormatBuilder formatSection(@NotNull Expression content, @NotNull Function1<? super FormatSectionBuilder, Unit> block) {
            content.getClass();
            block.getClass();
            ArrayList<Expression> arrayList = this.sections;
            FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(content);
            block.invoke(formatSectionBuilder);
            arrayList.addAll(formatSectionBuilder.build());
            return this;
        }

        @NotNull
        public final FormatBuilder formatSection(@NotNull String text) {
            text.getClass();
            this.sections.addAll(new FormatSectionBuilder(Expression.INSTANCE.literal(text)).build());
            return this;
        }

        @NotNull
        public final FormatBuilder formatSection(@NotNull Expression content) {
            content.getClass();
            this.sections.addAll(new FormatSectionBuilder(content).build());
            return this;
        }
    }

    public /* synthetic */ Expression(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public /* synthetic */ Expression(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public /* synthetic */ Expression(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public /* synthetic */ Expression(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private Expression(Builder builder) {
        super(builder.contents$extension_style_release());
        if (Intrinsics.areEqual("literal", builder.getOperator())) {
            this.literalValue = ((Expression) CollectionsKt.last((List) builder.getArguments$extension_style_release())).literalValue;
        }
    }

    private Expression(double d) {
        super(d);
        this.literalValue = Double.valueOf(d);
    }

    private Expression(long j) {
        super(j);
        this.literalValue = Long.valueOf(j);
    }

    private Expression(boolean z) {
        super(z);
        this.literalValue = Boolean.valueOf(z);
    }

    private Expression(String str) {
        super(str);
        this.literalValue = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Expression(@org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r5) {
        /*
            r4 = this;
            r5.getClass()
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            com.mapbox.maps.extension.style.utils.TypeUtils r3 = com.mapbox.maps.extension.style.utils.TypeUtils.INSTANCE
            com.mapbox.bindgen.Value r2 = r3.wrapToValue(r2)
            r1.add(r2)
            goto L15
        L29:
            r4.<init>(r1)
            r4.literalValue = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(java.util.List):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Expression(@NotNull HashMap<String, Value> hashMap) {
        super(hashMap);
        hashMap.getClass();
        this.literalValue = hashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Expression(double[] r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r7[r2]
            com.mapbox.bindgen.Value r5 = new com.mapbox.bindgen.Value
            r5.<init>(r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L8
        L17:
            r6.<init>(r0)
            r6.literalValue = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(double[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Expression(long[] r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r7[r2]
            com.mapbox.bindgen.Value r5 = new com.mapbox.bindgen.Value
            r5.<init>(r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L8
        L17:
            r6.<init>(r0)
            r6.literalValue = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(long[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Expression(boolean[] r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            boolean r3 = r6[r2]
            com.mapbox.bindgen.Value r4 = new com.mapbox.bindgen.Value
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            r5.<init>(r0)
            r5.literalValue = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(boolean[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Expression(java.lang.String[] r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r6[r2]
            com.mapbox.bindgen.Value r4 = new com.mapbox.bindgen.Value
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            r5.<init>(r0)
            r5.literalValue = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.expressions.generated.Expression.<init>(java.lang.String[]):void");
    }

    public /* synthetic */ Expression(double d, DefaultConstructorMarker defaultConstructorMarker) {
        this(d);
    }
}
