package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.android.tools.r8.RecordTag;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelScaleMode;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelType;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009b\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000f\u0010\u0093\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u0094\u0001J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0017J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0011\u0010 \u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010 \u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0014H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\bH\u0016J\u0012\u0010(\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020+H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u000eH\u0016J\u0011\u00104\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u00104\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0011\u00106\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u00106\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\bH\u0017J\u0010\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0004H\u0017J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\bH\u0016J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u000eH\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\bH\u0016J\u0010\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u000eH\u0016J\u0011\u0010L\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010L\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\bH\u0016J\u0016\u0010N\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0OH\u0016J\u0011\u0010T\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010T\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\bH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0004H\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\bH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u000eH\u0016J\u0011\u0010^\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010^\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010`\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\bH\u0016J\u0010\u0010`\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u0014H\u0016J\u0010\u0010d\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\bH\u0016J\u0016\u0010d\u001a\u00020\u00002\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000e0OH\u0016J\u0011\u0010h\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010h\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\bH\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u000eH\u0016J\u0011\u0010n\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010n\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010p\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\bH\u0016J\u0016\u0010p\u001a\u00020\u00002\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000e0OH\u0016J\u0010\u0010t\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\bH\u0016J\u0010\u0010t\u001a\u00020\u00002\u0006\u0010t\u001a\u00020uH\u0016J\u0011\u0010z\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J&\u0010z\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\bH\u0016J\u0016\u0010|\u001a\u00020\u00002\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000e0OH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020!H\u0016J'\u0010\u0080\u0001\u001a\u00020\u00002\u001c\u0010\u0096\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0097\u0001¢\u0006\u0003\b\u009a\u0001H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\bH\u0016J\u0013\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J\u0012\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u00020\bH\u0016J\u0013\u0010\u008d\u0001\u001a\u00020\u00002\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\nR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0013\u0010&\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0013\u0010(\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0013\u0010*\u001a\u0004\u0018\u00010+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\nR\u0013\u00100\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\u0013\u00102\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\nR\u0013\u00104\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0013\u00106\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u001c\u00108\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\fR\u001c\u0010;\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0016\u001a\u0004\b=\u0010\nR\u0013\u0010>\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b?\u0010\u0010R\u0013\u0010@\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bA\u0010\nR\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010F\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bG\u0010\nR\u0013\u0010H\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bI\u0010\u0010R\u0013\u0010J\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bK\u0010\nR\u0013\u0010L\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bM\u0010#R\u0019\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010R\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bS\u0010\nR\u0013\u0010T\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bU\u0010#R\u0013\u0010V\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bW\u0010\fR\u0013\u0010X\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bY\u0010\nR\u0013\u0010Z\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b[\u0010\u0010R\u0013\u0010\\\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b]\u0010\nR\u0013\u0010^\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b_\u0010#R\u0013\u0010`\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\ba\u0010\u0018R\u0013\u0010b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bc\u0010\nR\u0019\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\be\u0010QR\u0013\u0010f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bg\u0010\nR\u0013\u0010h\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bi\u0010#R\u0013\u0010j\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bk\u0010\u0010R\u0013\u0010l\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bm\u0010\nR\u0013\u0010n\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bo\u0010#R\u0019\u0010p\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bq\u0010QR\u0013\u0010r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bs\u0010\nR\u0013\u0010t\u001a\u0004\u0018\u00010u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010x\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\by\u0010\nR\u0013\u0010z\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b{\u0010#R\u0019\u0010|\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\b}\u0010QR\u0013\u0010~\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010\nR\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010#R\u0017\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u00018F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\nR\u0018\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\fR\u0012\u0010\u0005\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\fR\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\fR\u001a\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\n¨\u0006\u009c\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/ModelLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "filter", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getLayerId", "()Ljava/lang/String;", "maxZoom", "", "getMaxZoom", "()Ljava/lang/Double;", "minZoom", "getMinZoom", "modelAllowDensityReduction", "", "getModelAllowDensityReduction$annotations", "()V", "getModelAllowDensityReduction", "()Ljava/lang/Boolean;", "modelAllowDensityReductionAsExpression", "getModelAllowDensityReductionAsExpression$annotations", "getModelAllowDensityReductionAsExpression", "modelAmbientOcclusionIntensity", "getModelAmbientOcclusionIntensity", "modelAmbientOcclusionIntensityAsExpression", "getModelAmbientOcclusionIntensityAsExpression", "modelAmbientOcclusionIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getModelAmbientOcclusionIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "modelCastShadows", "getModelCastShadows", "modelCastShadowsAsExpression", "getModelCastShadowsAsExpression", "modelColor", "getModelColor", "modelColorAsColorInt", "", "getModelColorAsColorInt", "()Ljava/lang/Integer;", "modelColorAsExpression", "getModelColorAsExpression", "modelColorMixIntensity", "getModelColorMixIntensity", "modelColorMixIntensityAsExpression", "getModelColorMixIntensityAsExpression", "modelColorMixIntensityTransition", "getModelColorMixIntensityTransition", "modelColorTransition", "getModelColorTransition", "modelColorUseTheme", "getModelColorUseTheme$annotations", "getModelColorUseTheme", "modelColorUseThemeAsExpression", "getModelColorUseThemeAsExpression$annotations", "getModelColorUseThemeAsExpression", "modelCutoffFadeRange", "getModelCutoffFadeRange", "modelCutoffFadeRangeAsExpression", "getModelCutoffFadeRangeAsExpression", "modelElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "getModelElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "modelElevationReferenceAsExpression", "getModelElevationReferenceAsExpression", "modelEmissiveStrength", "getModelEmissiveStrength", "modelEmissiveStrengthAsExpression", "getModelEmissiveStrengthAsExpression", "modelEmissiveStrengthTransition", "getModelEmissiveStrengthTransition", "modelHeightBasedEmissiveStrengthMultiplier", "", "getModelHeightBasedEmissiveStrengthMultiplier", "()Ljava/util/List;", "modelHeightBasedEmissiveStrengthMultiplierAsExpression", "getModelHeightBasedEmissiveStrengthMultiplierAsExpression", "modelHeightBasedEmissiveStrengthMultiplierTransition", "getModelHeightBasedEmissiveStrengthMultiplierTransition", "modelId", "getModelId", "modelIdAsExpression", "getModelIdAsExpression", "modelOpacity", "getModelOpacity", "modelOpacityAsExpression", "getModelOpacityAsExpression", "modelOpacityTransition", "getModelOpacityTransition", "modelReceiveShadows", "getModelReceiveShadows", "modelReceiveShadowsAsExpression", "getModelReceiveShadowsAsExpression", "modelRotation", "getModelRotation", "modelRotationAsExpression", "getModelRotationAsExpression", "modelRotationTransition", "getModelRotationTransition", "modelRoughness", "getModelRoughness", "modelRoughnessAsExpression", "getModelRoughnessAsExpression", "modelRoughnessTransition", "getModelRoughnessTransition", "modelScale", "getModelScale", "modelScaleAsExpression", "getModelScaleAsExpression", "modelScaleMode", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "getModelScaleMode", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "modelScaleModeAsExpression", "getModelScaleModeAsExpression", "modelScaleTransition", "getModelScaleTransition", "modelTranslation", "getModelTranslation", "modelTranslationAsExpression", "getModelTranslationAsExpression", "modelTranslationTransition", "getModelTranslationTransition", "modelType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "getModelType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "modelTypeAsExpression", "getModelTypeAsExpression", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class ModelLayer extends Layer implements ModelLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public ModelLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer filter(@NotNull Expression filter) {
        RecordTag.m(filter, "filter", filter, this);
        return this;
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

    @Nullable
    public final Boolean getModelAllowDensityReduction() {
        return (Boolean) getPropertyValueWithType("model-allow-density-reduction", Boolean.class);
    }

    @Nullable
    public final Expression getModelAllowDensityReductionAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-allow-density-reduction");
    }

    @Nullable
    public final Double getModelAmbientOcclusionIntensity() {
        return (Double) getPropertyValueWithType("model-ambient-occlusion-intensity", Double.class);
    }

    @Nullable
    public final Expression getModelAmbientOcclusionIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-ambient-occlusion-intensity");
    }

    @Nullable
    public final StyleTransition getModelAmbientOcclusionIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-ambient-occlusion-intensity-transition", StyleTransition.class);
    }

    @Nullable
    public final Boolean getModelCastShadows() {
        return (Boolean) getPropertyValueWithType("model-cast-shadows", Boolean.class);
    }

    @Nullable
    public final Expression getModelCastShadowsAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-cast-shadows");
    }

    @Nullable
    public final String getModelColor() {
        Expression modelColorAsExpression = getModelColorAsExpression();
        if (modelColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(modelColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getModelColorAsColorInt() {
        Expression modelColorAsExpression = getModelColorAsExpression();
        if (modelColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(modelColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getModelColorAsExpression() {
        return (Expression) getPropertyValueWithType("model-color", Expression.class);
    }

    @Nullable
    public final Double getModelColorMixIntensity() {
        return (Double) getPropertyValueWithType("model-color-mix-intensity", Double.class);
    }

    @Nullable
    public final Expression getModelColorMixIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-color-mix-intensity");
    }

    @Nullable
    public final StyleTransition getModelColorMixIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-color-mix-intensity-transition", StyleTransition.class);
    }

    @Nullable
    public final StyleTransition getModelColorTransition() {
        return (StyleTransition) getPropertyValueWithType("model-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getModelColorUseTheme() {
        return (String) getPropertyValueWithType("model-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getModelColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-color-use-theme");
    }

    @Nullable
    public final Double getModelCutoffFadeRange() {
        return (Double) getPropertyValueWithType("model-cutoff-fade-range", Double.class);
    }

    @Nullable
    public final Expression getModelCutoffFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-cutoff-fade-range");
    }

    @Nullable
    public final ModelElevationReference getModelElevationReference() {
        String str = (String) getPropertyValueWithType("model-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        ModelElevationReference.Companion companion = ModelElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getModelElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelElevationReference modelElevationReference = getModelElevationReference();
        if (modelElevationReference != null) {
            return Expression.INSTANCE.literal(modelElevationReference.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getModelEmissiveStrength() {
        return (Double) getPropertyValueWithType("model-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getModelEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-emissive-strength");
    }

    @Nullable
    public final StyleTransition getModelEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("model-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getModelHeightBasedEmissiveStrengthMultiplier() {
        return (List) getPropertyValueWithType("model-height-based-emissive-strength-multiplier", List.class);
    }

    @Nullable
    public final Expression getModelHeightBasedEmissiveStrengthMultiplierAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-height-based-emissive-strength-multiplier");
    }

    @Nullable
    public final StyleTransition getModelHeightBasedEmissiveStrengthMultiplierTransition() {
        return (StyleTransition) getPropertyValueWithType("model-height-based-emissive-strength-multiplier-transition", StyleTransition.class);
    }

    @Nullable
    public final String getModelId() {
        return (String) getPropertyValueWithType("model-id", String.class);
    }

    @Nullable
    public final Expression getModelIdAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-id");
    }

    @Nullable
    public final Double getModelOpacity() {
        return (Double) getPropertyValueWithType("model-opacity", Double.class);
    }

    @Nullable
    public final Expression getModelOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-opacity");
    }

    @Nullable
    public final StyleTransition getModelOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final Boolean getModelReceiveShadows() {
        return (Boolean) getPropertyValueWithType("model-receive-shadows", Boolean.class);
    }

    @Nullable
    public final Expression getModelReceiveShadowsAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-receive-shadows");
    }

    @Nullable
    public final List<Double> getModelRotation() {
        return (List) getPropertyValueWithType("model-rotation", List.class);
    }

    @Nullable
    public final Expression getModelRotationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-rotation");
    }

    @Nullable
    public final StyleTransition getModelRotationTransition() {
        return (StyleTransition) getPropertyValueWithType("model-rotation-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getModelRoughness() {
        return (Double) getPropertyValueWithType("model-roughness", Double.class);
    }

    @Nullable
    public final Expression getModelRoughnessAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-roughness");
    }

    @Nullable
    public final StyleTransition getModelRoughnessTransition() {
        return (StyleTransition) getPropertyValueWithType("model-roughness-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getModelScale() {
        return (List) getPropertyValueWithType("model-scale", List.class);
    }

    @Nullable
    public final Expression getModelScaleAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-scale");
    }

    @Nullable
    public final ModelScaleMode getModelScaleMode() {
        String str = (String) getPropertyValueWithType("model-scale-mode", String.class);
        if (str == null) {
            return null;
        }
        ModelScaleMode.Companion companion = ModelScaleMode.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getModelScaleModeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-scale-mode", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelScaleMode modelScaleMode = getModelScaleMode();
        if (modelScaleMode != null) {
            return Expression.INSTANCE.literal(modelScaleMode.getValue());
        }
        return null;
    }

    @Nullable
    public final StyleTransition getModelScaleTransition() {
        return (StyleTransition) getPropertyValueWithType("model-scale-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getModelTranslation() {
        return (List) getPropertyValueWithType("model-translation", List.class);
    }

    @Nullable
    public final Expression getModelTranslationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-translation");
    }

    @Nullable
    public final StyleTransition getModelTranslationTransition() {
        return (StyleTransition) getPropertyValueWithType("model-translation-transition", StyleTransition.class);
    }

    @Nullable
    public final ModelType getModelType() {
        String str = (String) getPropertyValueWithType("model-type", String.class);
        if (str == null) {
            return null;
        }
        ModelType.Companion companion = ModelType.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getModelTypeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-type", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelType modelType = getModelType();
        if (modelType != null) {
            return Expression.INSTANCE.literal(modelType.getValue());
        }
        return null;
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
        return "model";
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
    public ModelLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public ModelLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    @NotNull
    public ModelLayer modelAllowDensityReduction(boolean modelAllowDensityReduction) {
        setProperty$extension_style_release(new PropertyValue<>("model-allow-density-reduction", Boolean.valueOf(modelAllowDensityReduction)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelAmbientOcclusionIntensity(double modelAmbientOcclusionIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("model-ambient-occlusion-intensity", Double.valueOf(modelAmbientOcclusionIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelAmbientOcclusionIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelAmbientOcclusionIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelCastShadows(boolean modelCastShadows) {
        setProperty$extension_style_release(new PropertyValue<>("model-cast-shadows", Boolean.valueOf(modelCastShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColor(@ColorInt int modelColor) {
        setProperty$extension_style_release(new PropertyValue<>("model-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(modelColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorMixIntensity(double modelColorMixIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("model-color-mix-intensity", Double.valueOf(modelColorMixIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorMixIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelColorMixIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    @NotNull
    public ModelLayer modelColorUseTheme(@NotNull String modelColorUseTheme) {
        modelColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-use-theme", modelColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelCutoffFadeRange(double modelCutoffFadeRange) {
        setProperty$extension_style_release(new PropertyValue<>("model-cutoff-fade-range", Double.valueOf(modelCutoffFadeRange)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelElevationReference(@NotNull ModelElevationReference modelElevationReference) {
        modelElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-elevation-reference", modelElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelEmissiveStrength(double modelEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("model-emissive-strength", Double.valueOf(modelEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplier(@NotNull List<Double> modelHeightBasedEmissiveStrengthMultiplier) {
        modelHeightBasedEmissiveStrengthMultiplier.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-height-based-emissive-strength-multiplier", modelHeightBasedEmissiveStrengthMultiplier));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelHeightBasedEmissiveStrengthMultiplierTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelId(@NotNull String modelId) {
        modelId.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-id", modelId));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelOpacity(double modelOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("model-opacity", Double.valueOf(modelOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelReceiveShadows(boolean modelReceiveShadows) {
        setProperty$extension_style_release(new PropertyValue<>("model-receive-shadows", Boolean.valueOf(modelReceiveShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRotation(@NotNull List<Double> modelRotation) {
        modelRotation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-rotation", modelRotation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRotationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelRotationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRoughness(double modelRoughness) {
        setProperty$extension_style_release(new PropertyValue<>("model-roughness", Double.valueOf(modelRoughness)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRoughnessTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelRoughnessTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScale(@NotNull List<Double> modelScale) {
        modelScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale", modelScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScaleMode(@NotNull ModelScaleMode modelScaleMode) {
        modelScaleMode.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale-mode", modelScaleMode));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScaleTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelScaleTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelTranslation(@NotNull List<Double> modelTranslation) {
        modelTranslation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-translation", modelTranslation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelTranslationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelTranslationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelType(@NotNull ModelType modelType) {
        modelType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-type", modelType));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public ModelLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public ModelLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0012R\u0013\u0010)\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0013\u0010+\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0013\u0010/\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b0\u0010\u001aR\u001c\u00101\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0002\u001a\u0004\b3\u0010\"R\u001c\u00104\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0012R\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0013\u00109\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010\u0012R\u0013\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010?\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0012R\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0013\u0010C\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bD\u0010\u0012R\u0013\u0010E\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010\u001aR\u0019\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0013\u0010M\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bN\u0010\u001aR\u0013\u0010O\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bP\u0010\"R\u0013\u0010Q\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bR\u0010\u0012R\u0013\u0010S\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bT\u0010\u0006R\u0013\u0010U\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bV\u0010\u0012R\u0013\u0010W\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bX\u0010\u001aR\u0013\u0010Y\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010\rR\u0013\u0010[\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0012R\u0019\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\b^\u0010JR\u0013\u0010_\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b`\u0010\u0012R\u0013\u0010a\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bb\u0010\u001aR\u0013\u0010c\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u0013\u0010e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010\u0012R\u0013\u0010g\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010\u001aR\u0019\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bj\u0010JR\u0013\u0010k\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bl\u0010\u0012R\u0013\u0010m\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010q\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\br\u0010\u0012R\u0013\u0010s\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bt\u0010\u001aR\u0019\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bv\u0010JR\u0013\u0010w\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bx\u0010\u0012R\u0013\u0010y\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bz\u0010\u001aR\u0013\u0010{\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010\u007f\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0012R\u0017\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultModelAllowDensityReduction", "", "getDefaultModelAllowDensityReduction$annotations", "getDefaultModelAllowDensityReduction", "()Ljava/lang/Boolean;", "defaultModelAllowDensityReductionAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultModelAllowDensityReductionAsExpression$annotations", "getDefaultModelAllowDensityReductionAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultModelAmbientOcclusionIntensity", "getDefaultModelAmbientOcclusionIntensity", "defaultModelAmbientOcclusionIntensityAsExpression", "getDefaultModelAmbientOcclusionIntensityAsExpression", "defaultModelAmbientOcclusionIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultModelAmbientOcclusionIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultModelCastShadows", "getDefaultModelCastShadows", "defaultModelCastShadowsAsExpression", "getDefaultModelCastShadowsAsExpression", "defaultModelColor", "", "getDefaultModelColor", "()Ljava/lang/String;", "defaultModelColorAsColorInt", "", "getDefaultModelColorAsColorInt", "()Ljava/lang/Integer;", "defaultModelColorAsExpression", "getDefaultModelColorAsExpression", "defaultModelColorMixIntensity", "getDefaultModelColorMixIntensity", "defaultModelColorMixIntensityAsExpression", "getDefaultModelColorMixIntensityAsExpression", "defaultModelColorMixIntensityTransition", "getDefaultModelColorMixIntensityTransition", "defaultModelColorTransition", "getDefaultModelColorTransition", "defaultModelColorUseTheme", "getDefaultModelColorUseTheme$annotations", "getDefaultModelColorUseTheme", "defaultModelColorUseThemeAsExpression", "getDefaultModelColorUseThemeAsExpression$annotations", "getDefaultModelColorUseThemeAsExpression", "defaultModelCutoffFadeRange", "getDefaultModelCutoffFadeRange", "defaultModelCutoffFadeRangeAsExpression", "getDefaultModelCutoffFadeRangeAsExpression", "defaultModelElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "getDefaultModelElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "defaultModelElevationReferenceAsExpression", "getDefaultModelElevationReferenceAsExpression", "defaultModelEmissiveStrength", "getDefaultModelEmissiveStrength", "defaultModelEmissiveStrengthAsExpression", "getDefaultModelEmissiveStrengthAsExpression", "defaultModelEmissiveStrengthTransition", "getDefaultModelEmissiveStrengthTransition", "defaultModelHeightBasedEmissiveStrengthMultiplier", "", "getDefaultModelHeightBasedEmissiveStrengthMultiplier", "()Ljava/util/List;", "defaultModelHeightBasedEmissiveStrengthMultiplierAsExpression", "getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression", "defaultModelHeightBasedEmissiveStrengthMultiplierTransition", "getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition", "defaultModelId", "getDefaultModelId", "defaultModelIdAsExpression", "getDefaultModelIdAsExpression", "defaultModelOpacity", "getDefaultModelOpacity", "defaultModelOpacityAsExpression", "getDefaultModelOpacityAsExpression", "defaultModelOpacityTransition", "getDefaultModelOpacityTransition", "defaultModelReceiveShadows", "getDefaultModelReceiveShadows", "defaultModelReceiveShadowsAsExpression", "getDefaultModelReceiveShadowsAsExpression", "defaultModelRotation", "getDefaultModelRotation", "defaultModelRotationAsExpression", "getDefaultModelRotationAsExpression", "defaultModelRotationTransition", "getDefaultModelRotationTransition", "defaultModelRoughness", "getDefaultModelRoughness", "defaultModelRoughnessAsExpression", "getDefaultModelRoughnessAsExpression", "defaultModelRoughnessTransition", "getDefaultModelRoughnessTransition", "defaultModelScale", "getDefaultModelScale", "defaultModelScaleAsExpression", "getDefaultModelScaleAsExpression", "defaultModelScaleMode", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "getDefaultModelScaleMode", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "defaultModelScaleModeAsExpression", "getDefaultModelScaleModeAsExpression", "defaultModelScaleTransition", "getDefaultModelScaleTransition", "defaultModelTranslation", "getDefaultModelTranslation", "defaultModelTranslationAsExpression", "getDefaultModelTranslationAsExpression", "defaultModelTranslationTransition", "getDefaultModelTranslationTransition", "defaultModelType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "getDefaultModelType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "defaultModelTypeAsExpression", "getDefaultModelTypeAsExpression", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Boolean getDefaultModelAllowDensityReduction() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-allow-density-reduction");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultModelAllowDensityReductionAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-allow-density-reduction");
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
            Boolean defaultModelAllowDensityReduction = getDefaultModelAllowDensityReduction();
            if (defaultModelAllowDensityReduction == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelAllowDensityReduction.booleanValue());
        }

        @Nullable
        public final Double getDefaultModelAmbientOcclusionIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-ambient-occlusion-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelAmbientOcclusionIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-ambient-occlusion-intensity");
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
            Double defaultModelAmbientOcclusionIntensity = getDefaultModelAmbientOcclusionIntensity();
            if (defaultModelAmbientOcclusionIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelAmbientOcclusionIntensity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultModelAmbientOcclusionIntensityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-ambient-occlusion-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Boolean getDefaultModelCastShadows() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-cast-shadows");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultModelCastShadowsAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-cast-shadows");
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
            Boolean defaultModelCastShadows = getDefaultModelCastShadows();
            if (defaultModelCastShadows == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelCastShadows.booleanValue());
        }

        @Nullable
        public final String getDefaultModelColor() {
            Expression defaultModelColorAsExpression = getDefaultModelColorAsExpression();
            if (defaultModelColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultModelColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultModelColorAsColorInt() {
            Expression defaultModelColorAsExpression = getDefaultModelColorAsExpression();
            if (defaultModelColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultModelColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultModelColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color");
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
        public final Double getDefaultModelColorMixIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-mix-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelColorMixIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-mix-intensity");
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
            Double defaultModelColorMixIntensity = getDefaultModelColorMixIntensity();
            if (defaultModelColorMixIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelColorMixIntensity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultModelColorMixIntensityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-mix-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final StyleTransition getDefaultModelColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultModelColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultModelColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-color-use-theme");
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
            String defaultModelColorUseTheme = getDefaultModelColorUseTheme();
            if (defaultModelColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultModelColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultModelCutoffFadeRange() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-cutoff-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelCutoffFadeRangeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-cutoff-fade-range");
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
            Double defaultModelCutoffFadeRange = getDefaultModelCutoffFadeRange();
            if (defaultModelCutoffFadeRange == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelCutoffFadeRange.doubleValue());
        }

        @Nullable
        public final ModelElevationReference getDefaultModelElevationReference() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-elevation-reference");
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
            ModelElevationReference.Companion companion = ModelElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultModelElevationReferenceAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-elevation-reference");
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
            ModelElevationReference defaultModelElevationReference = getDefaultModelElevationReference();
            if (defaultModelElevationReference != null) {
                return Expression.INSTANCE.literal(defaultModelElevationReference.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultModelEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-emissive-strength");
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
            Double defaultModelEmissiveStrength = getDefaultModelEmissiveStrength();
            if (defaultModelEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultModelEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultModelHeightBasedEmissiveStrengthMultiplier() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-height-based-emissive-strength-multiplier");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-height-based-emissive-strength-multiplier");
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
            List<Double> defaultModelHeightBasedEmissiveStrengthMultiplier = getDefaultModelHeightBasedEmissiveStrengthMultiplier();
            if (defaultModelHeightBasedEmissiveStrengthMultiplier != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelHeightBasedEmissiveStrengthMultiplier);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-height-based-emissive-strength-multiplier-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultModelId() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-id");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultModelIdAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-id");
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
            String defaultModelId = getDefaultModelId();
            if (defaultModelId != null) {
                return Expression.INSTANCE.literal(defaultModelId);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultModelOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-opacity");
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
            Double defaultModelOpacity = getDefaultModelOpacity();
            if (defaultModelOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultModelOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Boolean getDefaultModelReceiveShadows() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-receive-shadows");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultModelReceiveShadowsAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-receive-shadows");
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
            Boolean defaultModelReceiveShadows = getDefaultModelReceiveShadows();
            if (defaultModelReceiveShadows == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelReceiveShadows.booleanValue());
        }

        @Nullable
        public final List<Double> getDefaultModelRotation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-rotation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultModelRotationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-rotation");
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
            List<Double> defaultModelRotation = getDefaultModelRotation();
            if (defaultModelRotation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelRotation);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultModelRotationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-rotation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultModelRoughness() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-roughness");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultModelRoughnessAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-roughness");
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
            Double defaultModelRoughness = getDefaultModelRoughness();
            if (defaultModelRoughness == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelRoughness.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultModelRoughnessTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-roughness-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultModelScale() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultModelScaleAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-scale");
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
            List<Double> defaultModelScale = getDefaultModelScale();
            if (defaultModelScale != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelScale);
            }
            return null;
        }

        @Nullable
        public final ModelScaleMode getDefaultModelScaleMode() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-scale-mode");
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
            ModelScaleMode.Companion companion = ModelScaleMode.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultModelScaleModeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-scale-mode");
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
            ModelScaleMode defaultModelScaleMode = getDefaultModelScaleMode();
            if (defaultModelScaleMode != null) {
                return Expression.INSTANCE.literal(defaultModelScaleMode.getValue());
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultModelScaleTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-scale-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultModelTranslation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-translation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultModelTranslationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-translation");
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
            List<Double> defaultModelTranslation = getDefaultModelTranslation();
            if (defaultModelTranslation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelTranslation);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultModelTranslationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-translation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final ModelType getDefaultModelType() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-type");
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
            ModelType.Companion companion = ModelType.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultModelTypeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "model-type");
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
            ModelType defaultModelType = getDefaultModelType();
            if (defaultModelType != null) {
                return Expression.INSTANCE.literal(defaultModelType.getValue());
            }
            return null;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("model", "visibility");
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
        public static /* synthetic */ void getDefaultModelAllowDensityReduction$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelAllowDensityReductionAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    @NotNull
    public ModelLayer modelColorUseTheme(@NotNull Expression modelColorUseTheme) {
        RecordTag.m(modelColorUseTheme, "model-color-use-theme", modelColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelElevationReference(@NotNull Expression modelElevationReference) {
        RecordTag.m(modelElevationReference, "model-elevation-reference", modelElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplier(@NotNull Expression modelHeightBasedEmissiveStrengthMultiplier) {
        RecordTag.m(modelHeightBasedEmissiveStrengthMultiplier, "model-height-based-emissive-strength-multiplier", modelHeightBasedEmissiveStrengthMultiplier, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelId(@NotNull Expression modelId) {
        RecordTag.m(modelId, "model-id", modelId, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRotation(@NotNull Expression modelRotation) {
        RecordTag.m(modelRotation, "model-rotation", modelRotation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScale(@NotNull Expression modelScale) {
        RecordTag.m(modelScale, "model-scale", modelScale, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScaleMode(@NotNull Expression modelScaleMode) {
        RecordTag.m(modelScaleMode, "model-scale-mode", modelScaleMode, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelTranslation(@NotNull Expression modelTranslation) {
        RecordTag.m(modelTranslation, "model-translation", modelTranslation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelType(@NotNull Expression modelType) {
        RecordTag.m(modelType, "model-type", modelType, this);
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAllowDensityReduction$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAllowDensityReductionAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    @NotNull
    public ModelLayer modelAllowDensityReduction(@NotNull Expression modelAllowDensityReduction) {
        RecordTag.m(modelAllowDensityReduction, "model-allow-density-reduction", modelAllowDensityReduction, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelAmbientOcclusionIntensity(@NotNull Expression modelAmbientOcclusionIntensity) {
        RecordTag.m(modelAmbientOcclusionIntensity, "model-ambient-occlusion-intensity", modelAmbientOcclusionIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelCastShadows(@NotNull Expression modelCastShadows) {
        RecordTag.m(modelCastShadows, "model-cast-shadows", modelCastShadows, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorMixIntensity(@NotNull Expression modelColorMixIntensity) {
        RecordTag.m(modelColorMixIntensity, "model-color-mix-intensity", modelColorMixIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelCutoffFadeRange(@NotNull Expression modelCutoffFadeRange) {
        RecordTag.m(modelCutoffFadeRange, "model-cutoff-fade-range", modelCutoffFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelEmissiveStrength(@NotNull Expression modelEmissiveStrength) {
        RecordTag.m(modelEmissiveStrength, "model-emissive-strength", modelEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelOpacity(@NotNull Expression modelOpacity) {
        RecordTag.m(modelOpacity, "model-opacity", modelOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelReceiveShadows(@NotNull Expression modelReceiveShadows) {
        RecordTag.m(modelReceiveShadows, "model-receive-shadows", modelReceiveShadows, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRoughness(@NotNull Expression modelRoughness) {
        RecordTag.m(modelRoughness, "model-roughness", modelRoughness, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public ModelLayer visibility(@NotNull Expression visibility) {
        RecordTag.m(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColor(@NotNull Expression modelColor) {
        RecordTag.m(modelColor, "model-color", modelColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelAmbientOcclusionIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-ambient-occlusion-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColor(@NotNull String modelColor) {
        modelColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color", modelColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorMixIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-mix-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-height-based-emissive-strength-multiplier-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRotationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-rotation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelRoughnessTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-roughness-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelScaleTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @NotNull
    public ModelLayer modelTranslationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-translation-transition", options));
        return this;
    }
}
