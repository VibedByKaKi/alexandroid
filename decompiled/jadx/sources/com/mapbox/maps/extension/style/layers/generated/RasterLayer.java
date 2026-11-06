package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.RasterColorScale;
import com.mapbox.maps.extension.style.layers.properties.generated.RasterResampling;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0080\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u0081\u0001J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0014H\u0017J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0011\u0010\u001c\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010\u001c\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\nH\u0016J\u0011\u0010$\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010$\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0014H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0014H\u0016J\u0016\u0010(\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016J\u0011\u0010.\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010.\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0014H\u0016J\u0016\u00100\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016J\u0011\u00104\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u00104\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0014H\u0017J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0017J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0014H\u0017J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004H\u0017J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0014H\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\nH\u0016J\u0011\u0010H\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010H\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0014H\u0017J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\nH\u0017J\u0011\u0010P\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0017J&\u0010P\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0017J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0014H\u0016J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\nH\u0016J\u0011\u0010W\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010W\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0014H\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u0014H\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\nH\u0016J\u0011\u0010a\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010a\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0014H\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\nH\u0016J\u0011\u0010g\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010g\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\u0014H\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020jH\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u0014H\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\nH\u0016J\u0011\u0010s\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u001dH\u0016J&\u0010s\u001a\u00020\u00002\u001c\u0010\u0083\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0086\u00010\u0084\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0010\u0010u\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u0004H\u0016J\u0010\u0010x\u001a\u00020\u00002\u0006\u0010x\u001a\u00020\u0004H\u0016J\u0010\u0010z\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u0014H\u0016J\u0010\u0010z\u001a\u00020\u00002\u0006\u0010z\u001a\u00020{H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0013\u0010$\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010&\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0013\u0010.\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001fR\u0019\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0013\u00102\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0013\u00104\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001fR\u001c\u00106\u001a\u0004\u0018\u0001078FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0011\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0011\u001a\u0004\b=\u0010\u0017R\u001c\u0010>\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0011\u001a\u0004\b@\u0010\bR\u001c\u0010A\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0011\u001a\u0004\bC\u0010\u0017R\u0013\u0010D\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bE\u0010\fR\u0013\u0010F\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bG\u0010\u0017R\u0013\u0010H\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001fR\u001c\u0010J\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0011\u001a\u0004\bL\u0010\fR\u001c\u0010M\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0011\u001a\u0004\bO\u0010\u0017R\u001c\u0010P\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0011\u001a\u0004\bR\u0010\u001fR\u0013\u0010S\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bT\u0010\fR\u0013\u0010U\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bV\u0010\u0017R\u0013\u0010W\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bX\u0010\u001fR\u0013\u0010Y\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010\fR\u0013\u0010[\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0017R\u0013\u0010]\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b^\u0010\fR\u0013\u0010_\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b`\u0010\u0017R\u0013\u0010a\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bb\u0010\u001fR\u0013\u0010c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bd\u0010\fR\u0013\u0010e\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bf\u0010\u0017R\u0013\u0010g\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bh\u0010\u001fR\u0013\u0010i\u001a\u0004\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010m\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bn\u0010\u0017R\u0013\u0010o\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bp\u0010\fR\u0013\u0010q\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\br\u0010\u0017R\u0013\u0010s\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bt\u0010\u001fR\u0016\u0010u\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010\bR\u0013\u0010x\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\by\u0010\bR\u0016\u0010z\u001a\u0004\u0018\u00010{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0017¨\u0006\u0089\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/RasterLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLayerId", "()Ljava/lang/String;", "maxZoom", "", "getMaxZoom", "()Ljava/lang/Double;", "minZoom", "getMinZoom", "rasterArrayBand", "getRasterArrayBand$annotations", "()V", "getRasterArrayBand", "rasterArrayBandAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getRasterArrayBandAsExpression$annotations", "getRasterArrayBandAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "rasterBrightnessMax", "getRasterBrightnessMax", "rasterBrightnessMaxAsExpression", "getRasterBrightnessMaxAsExpression", "rasterBrightnessMaxTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getRasterBrightnessMaxTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "rasterBrightnessMin", "getRasterBrightnessMin", "rasterBrightnessMinAsExpression", "getRasterBrightnessMinAsExpression", "rasterBrightnessMinTransition", "getRasterBrightnessMinTransition", "rasterColor", "getRasterColor", "rasterColorMix", "", "getRasterColorMix", "()Ljava/util/List;", "rasterColorMixAsExpression", "getRasterColorMixAsExpression", "rasterColorMixTransition", "getRasterColorMixTransition", "rasterColorRange", "getRasterColorRange", "rasterColorRangeAsExpression", "getRasterColorRangeAsExpression", "rasterColorRangeTransition", "getRasterColorRangeTransition", "rasterColorScale", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "getRasterColorScale$annotations", "getRasterColorScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "rasterColorScaleAsExpression", "getRasterColorScaleAsExpression$annotations", "getRasterColorScaleAsExpression", "rasterColorUseTheme", "getRasterColorUseTheme$annotations", "getRasterColorUseTheme", "rasterColorUseThemeAsExpression", "getRasterColorUseThemeAsExpression$annotations", "getRasterColorUseThemeAsExpression", "rasterContrast", "getRasterContrast", "rasterContrastAsExpression", "getRasterContrastAsExpression", "rasterContrastTransition", "getRasterContrastTransition", "rasterElevation", "getRasterElevation$annotations", "getRasterElevation", "rasterElevationAsExpression", "getRasterElevationAsExpression$annotations", "getRasterElevationAsExpression", "rasterElevationTransition", "getRasterElevationTransition$annotations", "getRasterElevationTransition", "rasterEmissiveStrength", "getRasterEmissiveStrength", "rasterEmissiveStrengthAsExpression", "getRasterEmissiveStrengthAsExpression", "rasterEmissiveStrengthTransition", "getRasterEmissiveStrengthTransition", "rasterFadeDuration", "getRasterFadeDuration", "rasterFadeDurationAsExpression", "getRasterFadeDurationAsExpression", "rasterHueRotate", "getRasterHueRotate", "rasterHueRotateAsExpression", "getRasterHueRotateAsExpression", "rasterHueRotateTransition", "getRasterHueRotateTransition", "rasterOpacity", "getRasterOpacity", "rasterOpacityAsExpression", "getRasterOpacityAsExpression", "rasterOpacityTransition", "getRasterOpacityTransition", "rasterResampling", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "getRasterResampling", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "rasterResamplingAsExpression", "getRasterResamplingAsExpression", "rasterSaturation", "getRasterSaturation", "rasterSaturationAsExpression", "getRasterSaturationAsExpression", "rasterSaturationTransition", "getRasterSaturationTransition", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class RasterLayer extends Layer implements RasterLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public RasterLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    @Nullable
    public final String getRasterArrayBand() {
        return (String) getPropertyValueWithType("raster-array-band", String.class);
    }

    @Nullable
    public final Expression getRasterArrayBandAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-array-band");
    }

    @Nullable
    public final Double getRasterBrightnessMax() {
        return (Double) getPropertyValueWithType("raster-brightness-max", Double.class);
    }

    @Nullable
    public final Expression getRasterBrightnessMaxAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-brightness-max");
    }

    @Nullable
    public final StyleTransition getRasterBrightnessMaxTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-brightness-max-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterBrightnessMin() {
        return (Double) getPropertyValueWithType("raster-brightness-min", Double.class);
    }

    @Nullable
    public final Expression getRasterBrightnessMinAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-brightness-min");
    }

    @Nullable
    public final StyleTransition getRasterBrightnessMinTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-brightness-min-transition", StyleTransition.class);
    }

    @Nullable
    public final Expression getRasterColor() {
        return (Expression) getPropertyValueWithType("raster-color", Expression.class);
    }

    @Nullable
    public final List<Double> getRasterColorMix() {
        return (List) getPropertyValueWithType("raster-color-mix", List.class);
    }

    @Nullable
    public final Expression getRasterColorMixAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-mix");
    }

    @Nullable
    public final StyleTransition getRasterColorMixTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-color-mix-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getRasterColorRange() {
        return (List) getPropertyValueWithType("raster-color-range", List.class);
    }

    @Nullable
    public final Expression getRasterColorRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-range");
    }

    @Nullable
    public final StyleTransition getRasterColorRangeTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-color-range-transition", StyleTransition.class);
    }

    @Nullable
    public final RasterColorScale getRasterColorScale() {
        String str = (String) getPropertyValueWithType("raster-color-scale", String.class);
        if (str == null) {
            return null;
        }
        RasterColorScale.Companion companion = RasterColorScale.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getRasterColorScaleAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("raster-color-scale", Expression.class);
        if (expression != null) {
            return expression;
        }
        RasterColorScale rasterColorScale = getRasterColorScale();
        if (rasterColorScale != null) {
            return Expression.INSTANCE.literal(rasterColorScale.getValue());
        }
        return null;
    }

    @Nullable
    public final String getRasterColorUseTheme() {
        return (String) getPropertyValueWithType("raster-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getRasterColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-use-theme");
    }

    @Nullable
    public final Double getRasterContrast() {
        return (Double) getPropertyValueWithType("raster-contrast", Double.class);
    }

    @Nullable
    public final Expression getRasterContrastAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-contrast");
    }

    @Nullable
    public final StyleTransition getRasterContrastTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-contrast-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterElevation() {
        return (Double) getPropertyValueWithType("raster-elevation", Double.class);
    }

    @Nullable
    public final Expression getRasterElevationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-elevation");
    }

    @Nullable
    public final StyleTransition getRasterElevationTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-elevation-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterEmissiveStrength() {
        return (Double) getPropertyValueWithType("raster-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getRasterEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-emissive-strength");
    }

    @Nullable
    public final StyleTransition getRasterEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterFadeDuration() {
        return (Double) getPropertyValueWithType("raster-fade-duration", Double.class);
    }

    @Nullable
    public final Expression getRasterFadeDurationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-fade-duration");
    }

    @Nullable
    public final Double getRasterHueRotate() {
        return (Double) getPropertyValueWithType("raster-hue-rotate", Double.class);
    }

    @Nullable
    public final Expression getRasterHueRotateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-hue-rotate");
    }

    @Nullable
    public final StyleTransition getRasterHueRotateTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-hue-rotate-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterOpacity() {
        return (Double) getPropertyValueWithType("raster-opacity", Double.class);
    }

    @Nullable
    public final Expression getRasterOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-opacity");
    }

    @Nullable
    public final StyleTransition getRasterOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final RasterResampling getRasterResampling() {
        String str = (String) getPropertyValueWithType("raster-resampling", String.class);
        if (str == null) {
            return null;
        }
        RasterResampling.Companion companion = RasterResampling.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getRasterResamplingAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("raster-resampling", Expression.class);
        if (expression != null) {
            return expression;
        }
        RasterResampling rasterResampling = getRasterResampling();
        if (rasterResampling != null) {
            return Expression.INSTANCE.literal(rasterResampling.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getRasterSaturation() {
        return (Double) getPropertyValueWithType("raster-saturation", Double.class);
    }

    @Nullable
    public final Expression getRasterSaturationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-saturation");
    }

    @Nullable
    public final StyleTransition getRasterSaturationTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-saturation-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @NotNull
    public final String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getType$extension_style_release() {
        return "raster";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterArrayBand(@NotNull String rasterArrayBand) {
        rasterArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-array-band", rasterArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMax(double rasterBrightnessMax) {
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max", Double.valueOf(rasterBrightnessMax)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMaxTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterBrightnessMaxTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMin(double rasterBrightnessMin) {
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min", Double.valueOf(rasterBrightnessMin)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMinTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterBrightnessMinTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColor(@NotNull Expression rasterColor) {
        rasterColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color", rasterColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorMix(@NotNull List<Double> rasterColorMix) {
        rasterColorMix.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix", rasterColorMix));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorMixTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterColorMixTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorRange(@NotNull List<Double> rasterColorRange) {
        rasterColorRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range", rasterColorRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorRangeTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterColorRangeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterColorScale(@NotNull RasterColorScale rasterColorScale) {
        rasterColorScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-scale", rasterColorScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterColorUseTheme(@NotNull String rasterColorUseTheme) {
        rasterColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-use-theme", rasterColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterContrast(double rasterContrast) {
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast", Double.valueOf(rasterContrast)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterContrastTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterContrastTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterElevation(double rasterElevation) {
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation", Double.valueOf(rasterElevation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterElevationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterElevationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterEmissiveStrength(double rasterEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength", Double.valueOf(rasterEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterFadeDuration(double rasterFadeDuration) {
        setProperty$extension_style_release(new PropertyValue<>("raster-fade-duration", Double.valueOf(rasterFadeDuration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterHueRotate(double rasterHueRotate) {
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate", Double.valueOf(rasterHueRotate)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterHueRotateTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterHueRotateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterOpacity(double rasterOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity", Double.valueOf(rasterOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterResampling(@NotNull RasterResampling rasterResampling) {
        rasterResampling.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-resampling", rasterResampling));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterSaturation(double rasterSaturation) {
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation", Double.valueOf(rasterSaturation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterSaturationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterSaturationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0013\u0010+\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u001c\u0010/\u001a\u0004\u0018\u0001008FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0012R\u001c\u00107\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\rR\u001c\u0010:\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0012R\u0013\u0010=\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0013\u0010?\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0012R\u0013\u0010A\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bB\u0010\u001aR\u001c\u0010C\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0002\u001a\u0004\bE\u0010\u0006R\u001c\u0010F\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010\u0012R\u001c\u0010I\u001a\u0004\u0018\u00010\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0002\u001a\u0004\bK\u0010\u001aR\u0013\u0010L\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bM\u0010\u0006R\u0013\u0010N\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010\u0012R\u0013\u0010P\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001aR\u0013\u0010R\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bS\u0010\u0006R\u0013\u0010T\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bU\u0010\u0012R\u0013\u0010V\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bW\u0010\u0006R\u0013\u0010X\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bY\u0010\u0012R\u0013\u0010Z\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b[\u0010\u001aR\u0013\u0010\\\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b]\u0010\u0006R\u0013\u0010^\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0012R\u0013\u0010`\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\ba\u0010\u001aR\u0013\u0010b\u001a\u0004\u0018\u00010c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bg\u0010\u0012R\u0013\u0010h\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bi\u0010\u0006R\u0013\u0010j\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bk\u0010\u0012R\u0013\u0010l\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bm\u0010\u001aR\u0013\u0010n\u001a\u0004\u0018\u00010o8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultRasterArrayBand", "", "getDefaultRasterArrayBand$annotations", "getDefaultRasterArrayBand", "()Ljava/lang/String;", "defaultRasterArrayBandAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultRasterArrayBandAsExpression$annotations", "getDefaultRasterArrayBandAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultRasterBrightnessMax", "getDefaultRasterBrightnessMax", "defaultRasterBrightnessMaxAsExpression", "getDefaultRasterBrightnessMaxAsExpression", "defaultRasterBrightnessMaxTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultRasterBrightnessMaxTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultRasterBrightnessMin", "getDefaultRasterBrightnessMin", "defaultRasterBrightnessMinAsExpression", "getDefaultRasterBrightnessMinAsExpression", "defaultRasterBrightnessMinTransition", "getDefaultRasterBrightnessMinTransition", "defaultRasterColorMix", "", "getDefaultRasterColorMix", "()Ljava/util/List;", "defaultRasterColorMixAsExpression", "getDefaultRasterColorMixAsExpression", "defaultRasterColorMixTransition", "getDefaultRasterColorMixTransition", "defaultRasterColorRange", "getDefaultRasterColorRange", "defaultRasterColorRangeAsExpression", "getDefaultRasterColorRangeAsExpression", "defaultRasterColorRangeTransition", "getDefaultRasterColorRangeTransition", "defaultRasterColorScale", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "getDefaultRasterColorScale$annotations", "getDefaultRasterColorScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "defaultRasterColorScaleAsExpression", "getDefaultRasterColorScaleAsExpression$annotations", "getDefaultRasterColorScaleAsExpression", "defaultRasterColorUseTheme", "getDefaultRasterColorUseTheme$annotations", "getDefaultRasterColorUseTheme", "defaultRasterColorUseThemeAsExpression", "getDefaultRasterColorUseThemeAsExpression$annotations", "getDefaultRasterColorUseThemeAsExpression", "defaultRasterContrast", "getDefaultRasterContrast", "defaultRasterContrastAsExpression", "getDefaultRasterContrastAsExpression", "defaultRasterContrastTransition", "getDefaultRasterContrastTransition", "defaultRasterElevation", "getDefaultRasterElevation$annotations", "getDefaultRasterElevation", "defaultRasterElevationAsExpression", "getDefaultRasterElevationAsExpression$annotations", "getDefaultRasterElevationAsExpression", "defaultRasterElevationTransition", "getDefaultRasterElevationTransition$annotations", "getDefaultRasterElevationTransition", "defaultRasterEmissiveStrength", "getDefaultRasterEmissiveStrength", "defaultRasterEmissiveStrengthAsExpression", "getDefaultRasterEmissiveStrengthAsExpression", "defaultRasterEmissiveStrengthTransition", "getDefaultRasterEmissiveStrengthTransition", "defaultRasterFadeDuration", "getDefaultRasterFadeDuration", "defaultRasterFadeDurationAsExpression", "getDefaultRasterFadeDurationAsExpression", "defaultRasterHueRotate", "getDefaultRasterHueRotate", "defaultRasterHueRotateAsExpression", "getDefaultRasterHueRotateAsExpression", "defaultRasterHueRotateTransition", "getDefaultRasterHueRotateTransition", "defaultRasterOpacity", "getDefaultRasterOpacity", "defaultRasterOpacityAsExpression", "getDefaultRasterOpacityAsExpression", "defaultRasterOpacityTransition", "getDefaultRasterOpacityTransition", "defaultRasterResampling", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "getDefaultRasterResampling", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "defaultRasterResamplingAsExpression", "getDefaultRasterResamplingAsExpression", "defaultRasterSaturation", "getDefaultRasterSaturation", "defaultRasterSaturationAsExpression", "getDefaultRasterSaturationAsExpression", "defaultRasterSaturationTransition", "getDefaultRasterSaturationTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Double getDefaultMinZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final String getDefaultRasterArrayBand() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultRasterArrayBandAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            String defaultRasterArrayBand = getDefaultRasterArrayBand();
            if (defaultRasterArrayBand != null) {
                return Expression.INSTANCE.literal(defaultRasterArrayBand);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultRasterBrightnessMax() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterBrightnessMaxAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterBrightnessMax = getDefaultRasterBrightnessMax();
            if (defaultRasterBrightnessMax == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterBrightnessMax.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterBrightnessMaxTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterBrightnessMin() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterBrightnessMinAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterBrightnessMin = getDefaultRasterBrightnessMin();
            if (defaultRasterBrightnessMin == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterBrightnessMin.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterBrightnessMinTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultRasterColorMix() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultRasterColorMixAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultRasterColorMix = getDefaultRasterColorMix();
            if (defaultRasterColorMix != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultRasterColorMix);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultRasterColorMixTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultRasterColorRange() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultRasterColorRangeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultRasterColorRange = getDefaultRasterColorRange();
            if (defaultRasterColorRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultRasterColorRange);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultRasterColorRangeTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final RasterColorScale getDefaultRasterColorScale() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            RasterColorScale.Companion companion = RasterColorScale.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultRasterColorScaleAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            RasterColorScale defaultRasterColorScale = getDefaultRasterColorScale();
            if (defaultRasterColorScale != null) {
                return Expression.INSTANCE.literal(defaultRasterColorScale.getValue());
            }
            return null;
        }

        @Nullable
        public final String getDefaultRasterColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultRasterColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            String defaultRasterColorUseTheme = getDefaultRasterColorUseTheme();
            if (defaultRasterColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultRasterColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultRasterContrast() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterContrastAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterContrast = getDefaultRasterContrast();
            if (defaultRasterContrast == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterContrast.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterContrastTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterElevation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterElevationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterElevation = getDefaultRasterElevation();
            if (defaultRasterElevation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterElevation.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterElevationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterEmissiveStrength = getDefaultRasterEmissiveStrength();
            if (defaultRasterEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterFadeDuration() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterFadeDurationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterFadeDuration = getDefaultRasterFadeDuration();
            if (defaultRasterFadeDuration == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterFadeDuration.doubleValue());
        }

        @Nullable
        public final Double getDefaultRasterHueRotate() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterHueRotateAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterHueRotate = getDefaultRasterHueRotate();
            if (defaultRasterHueRotate == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterHueRotate.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterHueRotateTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterOpacity = getDefaultRasterOpacity();
            if (defaultRasterOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final RasterResampling getDefaultRasterResampling() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            RasterResampling.Companion companion = RasterResampling.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultRasterResamplingAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            RasterResampling defaultRasterResampling = getDefaultRasterResampling();
            if (defaultRasterResampling != null) {
                return Expression.INSTANCE.literal(defaultRasterResampling.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultRasterSaturation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterSaturationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterSaturation = getDefaultRasterSaturation();
            if (defaultRasterSaturation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterSaturation.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterSaturationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterArrayBand$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterArrayBandAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorScale$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorScaleAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevationTransition$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterArrayBand(@NotNull Expression rasterArrayBand) {
        rasterArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-array-band", rasterArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorMix(@NotNull Expression rasterColorMix) {
        rasterColorMix.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix", rasterColorMix));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorRange(@NotNull Expression rasterColorRange) {
        rasterColorRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range", rasterColorRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterColorScale(@NotNull Expression rasterColorScale) {
        rasterColorScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-scale", rasterColorScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterColorUseTheme(@NotNull Expression rasterColorUseTheme) {
        rasterColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-use-theme", rasterColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterResampling(@NotNull Expression rasterResampling) {
        rasterResampling.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-resampling", rasterResampling));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterArrayBand$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterArrayBandAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorScale$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorScaleAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevationTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMax(@NotNull Expression rasterBrightnessMax) {
        rasterBrightnessMax.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max", rasterBrightnessMax));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMin(@NotNull Expression rasterBrightnessMin) {
        rasterBrightnessMin.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min", rasterBrightnessMin));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterContrast(@NotNull Expression rasterContrast) {
        rasterContrast.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast", rasterContrast));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterElevation(@NotNull Expression rasterElevation) {
        rasterElevation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation", rasterElevation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterEmissiveStrength(@NotNull Expression rasterEmissiveStrength) {
        rasterEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength", rasterEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterFadeDuration(@NotNull Expression rasterFadeDuration) {
        rasterFadeDuration.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-fade-duration", rasterFadeDuration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterHueRotate(@NotNull Expression rasterHueRotate) {
        rasterHueRotate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate", rasterHueRotate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterOpacity(@NotNull Expression rasterOpacity) {
        rasterOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity", rasterOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterSaturation(@NotNull Expression rasterSaturation) {
        rasterSaturation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation", rasterSaturation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMaxTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterBrightnessMinTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorMixTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterColorRangeTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterContrastTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterLayer rasterElevationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterHueRotateTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @NotNull
    public RasterLayer rasterSaturationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation-transition", options));
        return this;
    }
}
