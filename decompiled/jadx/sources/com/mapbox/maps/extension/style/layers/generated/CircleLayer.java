package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchScale;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u0002:\u0002\u0091\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0011\u0010\u000f\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010\u000f\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0017H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0011\u0010\u001c\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010\u001c\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fH\u0017J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0017J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0017J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&H\u0017J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\fH\u0016J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\bH\u0016J\u0011\u00101\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u00101\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\bH\u0016J\u0011\u00107\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u00107\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\fH\u0016J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\fH\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\bH\u0016J\u0011\u0010I\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010I\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\fH\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\bH\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\fH\u0016J\u0012\u0010O\u001a\u00020\u00002\b\b\u0001\u0010O\u001a\u00020\u0017H\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0004H\u0016J\u0011\u0010U\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010U\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0017J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0004H\u0017J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\fH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\bH\u0016J\u0011\u0010a\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010a\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\bH\u0016J\u0011\u0010g\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010g\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\fH\u0016J\u0016\u0010i\u001a\u00020\u00002\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\b0jH\u0016J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\fH\u0016J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010m\u001a\u00020nH\u0016J\u0011\u0010u\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0016J&\u0010u\u001a\u00020\u00002\u001c\u0010\u008a\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008d\u00010\u008b\u0001¢\u0006\u0003\b\u008e\u0001H\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\fH\u0016J\u000f\u0010\u008f\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u0090\u0001J\u0010\u0010z\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\bH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\bH\u0016J\u0010\u0010~\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\u0004H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020\fH\u0016J\u0013\u0010\u0083\u0001\u001a\u00020\u00002\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010&8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010 \u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0013\u0010/\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u0013\u00101\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010\u0012R\u0013\u00103\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\nR\u0013\u00105\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b6\u0010\u000eR\u0013\u00107\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b>\u0010\u000eR\u0013\u0010?\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0013\u0010E\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bF\u0010\nR\u0013\u0010G\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000eR\u0013\u0010I\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0012R\u0013\u0010K\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bL\u0010\nR\u0013\u0010M\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bN\u0010\u000eR\u0013\u0010O\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bP\u0010\u0015R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\bR\u0010\u0019R\u0013\u0010S\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bT\u0010\u000eR\u0013\u0010U\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bV\u0010\u0012R\u001c\u0010W\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010 \u001a\u0004\bY\u0010\u0015R\u001c\u0010Z\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010 \u001a\u0004\b\\\u0010\u000eR\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0013\u0010_\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b`\u0010\u000eR\u0013\u0010a\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bb\u0010\u0012R\u0013\u0010c\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bd\u0010\nR\u0013\u0010e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bf\u0010\u000eR\u0013\u0010g\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bh\u0010\u0012R\u0019\u0010i\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010m\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\br\u0010\u000eR\u0013\u0010s\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bt\u0010\u000eR\u0013\u0010u\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bv\u0010\u0012R\u0013\u0010w\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bx\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010\u0015R\u0016\u0010z\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\nR\u0016\u0010|\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\nR\u0016\u0010~\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0015R\u0012\u0010\u0005\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0015R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0015R\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u000e¨\u0006\u0092\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/CircleLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "circleBlur", "", "getCircleBlur", "()Ljava/lang/Double;", "circleBlurAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getCircleBlurAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "circleBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getCircleBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "circleColor", "getCircleColor", "()Ljava/lang/String;", "circleColorAsColorInt", "", "getCircleColorAsColorInt", "()Ljava/lang/Integer;", "circleColorAsExpression", "getCircleColorAsExpression", "circleColorTransition", "getCircleColorTransition", "circleColorUseTheme", "getCircleColorUseTheme$annotations", "()V", "getCircleColorUseTheme", "circleColorUseThemeAsExpression", "getCircleColorUseThemeAsExpression$annotations", "getCircleColorUseThemeAsExpression", "circleElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "getCircleElevationReference$annotations", "getCircleElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "circleElevationReferenceAsExpression", "getCircleElevationReferenceAsExpression$annotations", "getCircleElevationReferenceAsExpression", "circleEmissiveStrength", "getCircleEmissiveStrength", "circleEmissiveStrengthAsExpression", "getCircleEmissiveStrengthAsExpression", "circleEmissiveStrengthTransition", "getCircleEmissiveStrengthTransition", "circleOpacity", "getCircleOpacity", "circleOpacityAsExpression", "getCircleOpacityAsExpression", "circleOpacityTransition", "getCircleOpacityTransition", "circlePitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "getCirclePitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "circlePitchAlignmentAsExpression", "getCirclePitchAlignmentAsExpression", "circlePitchScale", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "getCirclePitchScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "circlePitchScaleAsExpression", "getCirclePitchScaleAsExpression", "circleRadius", "getCircleRadius", "circleRadiusAsExpression", "getCircleRadiusAsExpression", "circleRadiusTransition", "getCircleRadiusTransition", "circleSortKey", "getCircleSortKey", "circleSortKeyAsExpression", "getCircleSortKeyAsExpression", "circleStrokeColor", "getCircleStrokeColor", "circleStrokeColorAsColorInt", "getCircleStrokeColorAsColorInt", "circleStrokeColorAsExpression", "getCircleStrokeColorAsExpression", "circleStrokeColorTransition", "getCircleStrokeColorTransition", "circleStrokeColorUseTheme", "getCircleStrokeColorUseTheme$annotations", "getCircleStrokeColorUseTheme", "circleStrokeColorUseThemeAsExpression", "getCircleStrokeColorUseThemeAsExpression$annotations", "getCircleStrokeColorUseThemeAsExpression", "circleStrokeOpacity", "getCircleStrokeOpacity", "circleStrokeOpacityAsExpression", "getCircleStrokeOpacityAsExpression", "circleStrokeOpacityTransition", "getCircleStrokeOpacityTransition", "circleStrokeWidth", "getCircleStrokeWidth", "circleStrokeWidthAsExpression", "getCircleStrokeWidthAsExpression", "circleStrokeWidthTransition", "getCircleStrokeWidthTransition", "circleTranslate", "", "getCircleTranslate", "()Ljava/util/List;", "circleTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "getCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "circleTranslateAnchorAsExpression", "getCircleTranslateAnchorAsExpression", "circleTranslateAsExpression", "getCircleTranslateAsExpression", "circleTranslateTransition", "getCircleTranslateTransition", "filter", "getFilter", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class CircleLayer extends Layer implements CircleLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public CircleLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleBlur(double circleBlur) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, Double.valueOf(circleBlur)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleBlurTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleBlurTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleColor(@ColorInt int circleColor) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(circleColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleColorUseTheme(@NotNull String circleColorUseTheme) {
        circleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, circleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleElevationReference(@NotNull CircleElevationReference circleElevationReference) {
        circleElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-elevation-reference", circleElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleEmissiveStrength(double circleEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength", Double.valueOf(circleEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleOpacity(double circleOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, Double.valueOf(circleOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circlePitchAlignment(@NotNull CirclePitchAlignment circlePitchAlignment) {
        circlePitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-alignment", circlePitchAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circlePitchScale(@NotNull CirclePitchScale circlePitchScale) {
        circlePitchScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-scale", circlePitchScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleRadius(double circleRadius) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, Double.valueOf(circleRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleSortKey(double circleSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, Double.valueOf(circleSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeColor(@ColorInt int circleStrokeColor) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(circleStrokeColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleStrokeColorUseTheme(@NotNull String circleStrokeColorUseTheme) {
        circleStrokeColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, circleStrokeColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeOpacity(double circleStrokeOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, Double.valueOf(circleStrokeOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeWidth(double circleStrokeWidth) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, Double.valueOf(circleStrokeWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslate(@NotNull List<Double> circleTranslate) {
        circleTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate", circleTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslateAnchor(@NotNull CircleTranslateAnchor circleTranslateAnchor) {
        circleTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-anchor", circleTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslateTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer filter(@NotNull Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    @Nullable
    public final Double getCircleBlur() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, Double.class);
    }

    @Nullable
    public final Expression getCircleBlurAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
    }

    @Nullable
    public final StyleTransition getCircleBlurTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-blur-transition", StyleTransition.class);
    }

    @Nullable
    public final String getCircleColor() {
        Expression circleColorAsExpression = getCircleColorAsExpression();
        if (circleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(circleColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getCircleColorAsColorInt() {
        Expression circleColorAsExpression = getCircleColorAsExpression();
        if (circleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(circleColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getCircleColorAsExpression() {
        return (Expression) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getCircleColorTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getCircleColorUseTheme() {
        return (String) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getCircleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
    }

    @Nullable
    public final CircleElevationReference getCircleElevationReference() {
        String str = (String) getPropertyValueWithType("circle-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        CircleElevationReference.Companion companion = CircleElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getCircleElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        CircleElevationReference circleElevationReference = getCircleElevationReference();
        if (circleElevationReference != null) {
            return Expression.INSTANCE.literal(circleElevationReference.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getCircleEmissiveStrength() {
        return (Double) getPropertyValueWithType("circle-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getCircleEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("circle-emissive-strength");
    }

    @Nullable
    public final StyleTransition getCircleEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getCircleOpacity() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, Double.class);
    }

    @Nullable
    public final Expression getCircleOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
    }

    @Nullable
    public final StyleTransition getCircleOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final CirclePitchAlignment getCirclePitchAlignment() {
        String str = (String) getPropertyValueWithType("circle-pitch-alignment", String.class);
        if (str == null) {
            return null;
        }
        CirclePitchAlignment.Companion companion = CirclePitchAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getCirclePitchAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-pitch-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        CirclePitchAlignment circlePitchAlignment = getCirclePitchAlignment();
        if (circlePitchAlignment != null) {
            return Expression.INSTANCE.literal(circlePitchAlignment.getValue());
        }
        return null;
    }

    @Nullable
    public final CirclePitchScale getCirclePitchScale() {
        String str = (String) getPropertyValueWithType("circle-pitch-scale", String.class);
        if (str == null) {
            return null;
        }
        CirclePitchScale.Companion companion = CirclePitchScale.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getCirclePitchScaleAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-pitch-scale", Expression.class);
        if (expression != null) {
            return expression;
        }
        CirclePitchScale circlePitchScale = getCirclePitchScale();
        if (circlePitchScale != null) {
            return Expression.INSTANCE.literal(circlePitchScale.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getCircleRadius() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, Double.class);
    }

    @Nullable
    public final Expression getCircleRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
    }

    @Nullable
    public final StyleTransition getCircleRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getCircleSortKey() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, Double.class);
    }

    @Nullable
    public final Expression getCircleSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
    }

    @Nullable
    public final String getCircleStrokeColor() {
        Expression circleStrokeColorAsExpression = getCircleStrokeColorAsExpression();
        if (circleStrokeColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(circleStrokeColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getCircleStrokeColorAsColorInt() {
        Expression circleStrokeColorAsExpression = getCircleStrokeColorAsExpression();
        if (circleStrokeColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(circleStrokeColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getCircleStrokeColorAsExpression() {
        return (Expression) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getCircleStrokeColorTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getCircleStrokeColorUseTheme() {
        return (String) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getCircleStrokeColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
    }

    @Nullable
    public final Double getCircleStrokeOpacity() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, Double.class);
    }

    @Nullable
    public final Expression getCircleStrokeOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
    }

    @Nullable
    public final StyleTransition getCircleStrokeOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getCircleStrokeWidth() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, Double.class);
    }

    @Nullable
    public final Expression getCircleStrokeWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
    }

    @Nullable
    public final StyleTransition getCircleStrokeWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-width-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getCircleTranslate() {
        return (List) getPropertyValueWithType("circle-translate", List.class);
    }

    @Nullable
    public final CircleTranslateAnchor getCircleTranslateAnchor() {
        String str = (String) getPropertyValueWithType("circle-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        CircleTranslateAnchor.Companion companion = CircleTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getCircleTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        CircleTranslateAnchor circleTranslateAnchor = getCircleTranslateAnchor();
        if (circleTranslateAnchor != null) {
            return Expression.INSTANCE.literal(circleTranslateAnchor.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getCircleTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("circle-translate");
    }

    @Nullable
    public final StyleTransition getCircleTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-translate-transition", StyleTransition.class);
    }

    @Nullable
    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
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
        return "circle";
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
    public CircleLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public CircleLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public CircleLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public CircleLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\"8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\nR\u0013\u0010)\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0013\u0010+\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\nR\u0013\u0010-\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR\u0013\u0010/\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\nR\u0013\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010?\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b@\u0010\nR\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0013\u0010G\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0013\u0010I\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\nR\u0013\u0010K\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0013\u0010M\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\bN\u0010\u0016R\u0013\u0010O\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bP\u0010\nR\u0013\u0010Q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0012R\u001c\u0010V\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\nR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u0013\u0010[\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010\nR\u0013\u0010]\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b^\u0010\u000eR\u0013\u0010_\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bd\u0010\u000eR\u0019\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010i\u001a\u0004\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010m\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bn\u0010\nR\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\br\u0010\u000eR\u0013\u0010s\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bt\u0010\u0006R\u0013\u0010u\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bv\u0010\u0006R\u0013\u0010w\u001a\u0004\u0018\u00010x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer$Companion;", "", "()V", "defaultCircleBlur", "", "getDefaultCircleBlur", "()Ljava/lang/Double;", "defaultCircleBlurAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultCircleBlurAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultCircleBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultCircleBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultCircleColor", "", "getDefaultCircleColor", "()Ljava/lang/String;", "defaultCircleColorAsColorInt", "", "getDefaultCircleColorAsColorInt", "()Ljava/lang/Integer;", "defaultCircleColorAsExpression", "getDefaultCircleColorAsExpression", "defaultCircleColorTransition", "getDefaultCircleColorTransition", "defaultCircleColorUseTheme", "getDefaultCircleColorUseTheme$annotations", "getDefaultCircleColorUseTheme", "defaultCircleColorUseThemeAsExpression", "getDefaultCircleColorUseThemeAsExpression$annotations", "getDefaultCircleColorUseThemeAsExpression", "defaultCircleElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "getDefaultCircleElevationReference$annotations", "getDefaultCircleElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "defaultCircleElevationReferenceAsExpression", "getDefaultCircleElevationReferenceAsExpression$annotations", "getDefaultCircleElevationReferenceAsExpression", "defaultCircleEmissiveStrength", "getDefaultCircleEmissiveStrength", "defaultCircleEmissiveStrengthAsExpression", "getDefaultCircleEmissiveStrengthAsExpression", "defaultCircleEmissiveStrengthTransition", "getDefaultCircleEmissiveStrengthTransition", "defaultCircleOpacity", "getDefaultCircleOpacity", "defaultCircleOpacityAsExpression", "getDefaultCircleOpacityAsExpression", "defaultCircleOpacityTransition", "getDefaultCircleOpacityTransition", "defaultCirclePitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "getDefaultCirclePitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "defaultCirclePitchAlignmentAsExpression", "getDefaultCirclePitchAlignmentAsExpression", "defaultCirclePitchScale", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "getDefaultCirclePitchScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "defaultCirclePitchScaleAsExpression", "getDefaultCirclePitchScaleAsExpression", "defaultCircleRadius", "getDefaultCircleRadius", "defaultCircleRadiusAsExpression", "getDefaultCircleRadiusAsExpression", "defaultCircleRadiusTransition", "getDefaultCircleRadiusTransition", "defaultCircleSortKey", "getDefaultCircleSortKey", "defaultCircleSortKeyAsExpression", "getDefaultCircleSortKeyAsExpression", "defaultCircleStrokeColor", "getDefaultCircleStrokeColor", "defaultCircleStrokeColorAsColorInt", "getDefaultCircleStrokeColorAsColorInt", "defaultCircleStrokeColorAsExpression", "getDefaultCircleStrokeColorAsExpression", "defaultCircleStrokeColorTransition", "getDefaultCircleStrokeColorTransition", "defaultCircleStrokeColorUseTheme", "getDefaultCircleStrokeColorUseTheme$annotations", "getDefaultCircleStrokeColorUseTheme", "defaultCircleStrokeColorUseThemeAsExpression", "getDefaultCircleStrokeColorUseThemeAsExpression$annotations", "getDefaultCircleStrokeColorUseThemeAsExpression", "defaultCircleStrokeOpacity", "getDefaultCircleStrokeOpacity", "defaultCircleStrokeOpacityAsExpression", "getDefaultCircleStrokeOpacityAsExpression", "defaultCircleStrokeOpacityTransition", "getDefaultCircleStrokeOpacityTransition", "defaultCircleStrokeWidth", "getDefaultCircleStrokeWidth", "defaultCircleStrokeWidthAsExpression", "getDefaultCircleStrokeWidthAsExpression", "defaultCircleStrokeWidthTransition", "getDefaultCircleStrokeWidthTransition", "defaultCircleTranslate", "", "getDefaultCircleTranslate", "()Ljava/util/List;", "defaultCircleTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "getDefaultCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "defaultCircleTranslateAnchorAsExpression", "getDefaultCircleTranslateAnchorAsExpression", "defaultCircleTranslateAsExpression", "getDefaultCircleTranslateAsExpression", "defaultCircleTranslateTransition", "getDefaultCircleTranslateTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultCircleBlur() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleBlurAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
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
            Double defaultCircleBlur = getDefaultCircleBlur();
            if (defaultCircleBlur == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleBlur.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleBlurTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-blur-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultCircleColor() {
            Expression defaultCircleColorAsExpression = getDefaultCircleColorAsExpression();
            if (defaultCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultCircleColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultCircleColorAsColorInt() {
            Expression defaultCircleColorAsExpression = getDefaultCircleColorAsExpression();
            if (defaultCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultCircleColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultCircleColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
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
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultCircleColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultCircleColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultCircleColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
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
            String defaultCircleColorUseTheme = getDefaultCircleColorUseTheme();
            if (defaultCircleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultCircleColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final CircleElevationReference getDefaultCircleElevationReference() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-elevation-reference");
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
            CircleElevationReference.Companion companion = CircleElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultCircleElevationReferenceAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-elevation-reference");
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
            CircleElevationReference defaultCircleElevationReference = getDefaultCircleElevationReference();
            if (defaultCircleElevationReference != null) {
                return Expression.INSTANCE.literal(defaultCircleElevationReference.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultCircleEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-emissive-strength");
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
            Double defaultCircleEmissiveStrength = getDefaultCircleEmissiveStrength();
            if (defaultCircleEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultCircleOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
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
            Double defaultCircleOpacity = getDefaultCircleOpacity();
            if (defaultCircleOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final CirclePitchAlignment getDefaultCirclePitchAlignment() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-pitch-alignment");
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
            CirclePitchAlignment.Companion companion = CirclePitchAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultCirclePitchAlignmentAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-pitch-alignment");
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
            CirclePitchAlignment defaultCirclePitchAlignment = getDefaultCirclePitchAlignment();
            if (defaultCirclePitchAlignment != null) {
                return Expression.INSTANCE.literal(defaultCirclePitchAlignment.getValue());
            }
            return null;
        }

        @Nullable
        public final CirclePitchScale getDefaultCirclePitchScale() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-pitch-scale");
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
            CirclePitchScale.Companion companion = CirclePitchScale.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultCirclePitchScaleAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-pitch-scale");
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
            CirclePitchScale defaultCirclePitchScale = getDefaultCirclePitchScale();
            if (defaultCirclePitchScale != null) {
                return Expression.INSTANCE.literal(defaultCirclePitchScale.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultCircleRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
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
            Double defaultCircleRadius = getDefaultCircleRadius();
            if (defaultCircleRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultCircleSortKey() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleSortKeyAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
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
            Double defaultCircleSortKey = getDefaultCircleSortKey();
            if (defaultCircleSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleSortKey.doubleValue());
        }

        @Nullable
        public final String getDefaultCircleStrokeColor() {
            Expression defaultCircleStrokeColorAsExpression = getDefaultCircleStrokeColorAsExpression();
            if (defaultCircleStrokeColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultCircleStrokeColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultCircleStrokeColorAsColorInt() {
            Expression defaultCircleStrokeColorAsExpression = getDefaultCircleStrokeColorAsExpression();
            if (defaultCircleStrokeColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultCircleStrokeColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultCircleStrokeColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
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
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultCircleStrokeColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-stroke-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultCircleStrokeColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultCircleStrokeColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
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
            String defaultCircleStrokeColorUseTheme = getDefaultCircleStrokeColorUseTheme();
            if (defaultCircleStrokeColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultCircleStrokeColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultCircleStrokeOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleStrokeOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
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
            Double defaultCircleStrokeOpacity = getDefaultCircleStrokeOpacity();
            if (defaultCircleStrokeOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleStrokeOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleStrokeOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-stroke-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultCircleStrokeWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultCircleStrokeWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
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
            Double defaultCircleStrokeWidth = getDefaultCircleStrokeWidth();
            if (defaultCircleStrokeWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleStrokeWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultCircleStrokeWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-stroke-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultCircleTranslate() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final CircleTranslateAnchor getDefaultCircleTranslateAnchor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-translate-anchor");
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
            CircleTranslateAnchor.Companion companion = CircleTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultCircleTranslateAnchorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-translate-anchor");
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
            CircleTranslateAnchor defaultCircleTranslateAnchor = getDefaultCircleTranslateAnchor();
            if (defaultCircleTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultCircleTranslateAnchor.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultCircleTranslateAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-translate");
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
            List<Double> defaultCircleTranslate = getDefaultCircleTranslate();
            if (defaultCircleTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultCircleTranslate);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultCircleTranslateTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "circle-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("circle", "visibility");
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
        public static /* synthetic */ void getDefaultCircleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleStrokeColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleStrokeColorUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleColorUseTheme(@NotNull Expression circleColorUseTheme) {
        circleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, circleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleElevationReference(@NotNull Expression circleElevationReference) {
        circleElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-elevation-reference", circleElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circlePitchAlignment(@NotNull Expression circlePitchAlignment) {
        circlePitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-alignment", circlePitchAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circlePitchScale(@NotNull Expression circlePitchScale) {
        circlePitchScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-scale", circlePitchScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    @NotNull
    public CircleLayer circleStrokeColorUseTheme(@NotNull Expression circleStrokeColorUseTheme) {
        circleStrokeColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, circleStrokeColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslate(@NotNull Expression circleTranslate) {
        circleTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate", circleTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslateAnchor(@NotNull Expression circleTranslateAnchor) {
        circleTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-anchor", circleTranslateAnchor));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleBlur(@NotNull Expression circleBlur) {
        circleBlur.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, circleBlur));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleEmissiveStrength(@NotNull Expression circleEmissiveStrength) {
        circleEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength", circleEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleOpacity(@NotNull Expression circleOpacity) {
        circleOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, circleOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleRadius(@NotNull Expression circleRadius) {
        circleRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, circleRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleSortKey(@NotNull Expression circleSortKey) {
        circleSortKey.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, circleSortKey));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeOpacity(@NotNull Expression circleStrokeOpacity) {
        circleStrokeOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, circleStrokeOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeWidth(@NotNull Expression circleStrokeWidth) {
        circleStrokeWidth.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, circleStrokeWidth));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public CircleLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleColor(@NotNull Expression circleColor) {
        circleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, circleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeColor(@NotNull Expression circleStrokeColor) {
        circleStrokeColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, circleStrokeColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleBlurTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-blur-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleColor(@NotNull String circleColor) {
        circleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, circleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeColor(@NotNull String circleStrokeColor) {
        circleStrokeColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, circleStrokeColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleStrokeWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @NotNull
    public CircleLayer circleTranslateTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-transition", options));
        return this;
    }
}
