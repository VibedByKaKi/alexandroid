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
import com.mapbox.maps.extension.style.layers.properties.generated.FillElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.FillTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u00020\u0002:\u0002®\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0017J\u0012\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0015H\u0017J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0017J\u0011\u0010\u001c\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0017J&\u0010\u001c\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0017J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fH\u0017J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004H\u0017J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0016J\u0012\u0010'\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004H\u0016J\u0011\u0010-\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0016J&\u0010-\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\fH\u0017J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004H\u0017J\u0010\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\fH\u0017J\u0010\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\bH\u0017J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\fH\u0017J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<H\u0017J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\fH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020DH\u0016J\u0011\u0010I\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0016J&\u0010I\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\fH\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020DH\u0016J\u0011\u0010O\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0016J&\u0010O\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0016J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\fH\u0016J\u0012\u0010Q\u001a\u00020\u00002\b\b\u0001\u0010Q\u001a\u00020\u0015H\u0016J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0004H\u0016J\u0011\u0010W\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0016J&\u0010W\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\fH\u0017J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0004H\u0017J\u0010\u0010_\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\fH\u0016J\u0010\u0010_\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\u0004H\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020DH\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010g\u001a\u00020DH\u0016J\u0010\u0010k\u001a\u00020\u00002\u0006\u0010k\u001a\u00020\fH\u0016J\u0016\u0010k\u001a\u00020\u00002\f\u0010k\u001a\b\u0012\u0004\u0012\u00020D0lH\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\fH\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020pH\u0016J\u0011\u0010w\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0016J&\u0010w\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0016J\u0010\u0010y\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\fH\u0017J\u0012\u0010y\u001a\u00020\u00002\b\b\u0001\u0010y\u001a\u00020\u0015H\u0017J\u0010\u0010y\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u0004H\u0017J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0017J'\u0010\u0082\u0001\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0017J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0017J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0004H\u0017J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0017J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020DH\u0017J\u0012\u0010\u0091\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u001dH\u0017J'\u0010\u0091\u0001\u001a\u00020\u00002\u001c\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010¨\u0001¢\u0006\u0003\b«\u0001H\u0017J\u0012\u0010\u0094\u0001\u001a\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020\fH\u0016J\u000f\u0010¬\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u00ad\u0001J\u0012\u0010\u0097\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020DH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020DH\u0016J\u0012\u0010\u009b\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u009e\u0001\u001a\u00020\u00002\u0007\u0010\u009e\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010 \u0001\u001a\u00020\u00002\u0007\u0010 \u0001\u001a\u00020\fH\u0016J\u0013\u0010 \u0001\u001a\u00020\u00002\b\u0010 \u0001\u001a\u00030¡\u0001H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001c\u0010$\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u000eR\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0013\u0010)\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0013\u0010+\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b.\u0010 R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u001c\u00102\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u000eR\u001c\u00105\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0011\u001a\u0004\b7\u0010\nR\u001c\u00108\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0011\u001a\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\u0004\u0018\u00010<8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0011\u001a\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0011\u001a\u0004\bB\u0010\u000eR\u0013\u0010C\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010G\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000eR\u0013\u0010I\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0013\u0010K\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bL\u0010FR\u0013\u0010M\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bN\u0010\u000eR\u0013\u0010O\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bR\u0010\u0013R\u0013\u0010S\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\bT\u0010\u0018R\u0013\u0010U\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bV\u0010\u000eR\u0013\u0010W\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bX\u0010 R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010\u0011\u001a\u0004\b[\u0010\u0013R\u001c\u0010\\\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010\u0011\u001a\u0004\b^\u0010\u000eR\u0013\u0010_\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010\u0013R\u0013\u0010a\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bb\u0010\u000eR\u0013\u0010c\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bd\u0010FR\u0013\u0010e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bf\u0010\u000eR\u0013\u0010g\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bh\u0010FR\u0013\u0010i\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bj\u0010\u000eR\u0019\u0010k\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010o\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010s\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bt\u0010\u000eR\u0013\u0010u\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bv\u0010\u000eR\u0013\u0010w\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bx\u0010 R\u001c\u0010y\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010\u0011\u001a\u0004\b{\u0010\u0013R\u001c\u0010|\u001a\u0004\u0018\u00010\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010\u0011\u001a\u0004\b~\u0010\u0018R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0080\u0001\u0010\u0011\u001a\u0005\b\u0081\u0001\u0010\u000eR\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010\u0011\u001a\u0005\b\u0084\u0001\u0010 R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010\u0011\u001a\u0005\b\u0087\u0001\u0010\u0013R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010\u0011\u001a\u0005\b\u008a\u0001\u0010\u000eR\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010D8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008c\u0001\u0010\u0011\u001a\u0005\b\u008d\u0001\u0010FR\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008f\u0001\u0010\u0011\u001a\u0005\b\u0090\u0001\u0010\u000eR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0092\u0001\u0010\u0011\u001a\u0005\b\u0093\u0001\u0010 R\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u000eR\u0015\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0013R\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010D8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010FR\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u00010D8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010FR\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u0013R\u0012\u0010\u0005\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0013R\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u0013R\u001a\u0010 \u0001\u001a\u0005\u0018\u00010¡\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¤\u0001\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\u000e¨\u0006¯\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/FillLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "fillAntialias", "", "getFillAntialias", "()Ljava/lang/Boolean;", "fillAntialiasAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFillAntialiasAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fillBridgeGuardRailColor", "getFillBridgeGuardRailColor$annotations", "()V", "getFillBridgeGuardRailColor", "()Ljava/lang/String;", "fillBridgeGuardRailColorAsColorInt", "", "getFillBridgeGuardRailColorAsColorInt$annotations", "getFillBridgeGuardRailColorAsColorInt", "()Ljava/lang/Integer;", "fillBridgeGuardRailColorAsExpression", "getFillBridgeGuardRailColorAsExpression$annotations", "getFillBridgeGuardRailColorAsExpression", "fillBridgeGuardRailColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getFillBridgeGuardRailColorTransition$annotations", "getFillBridgeGuardRailColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "fillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme$annotations", "getFillBridgeGuardRailColorUseTheme", "fillBridgeGuardRailColorUseThemeAsExpression", "getFillBridgeGuardRailColorUseThemeAsExpression$annotations", "getFillBridgeGuardRailColorUseThemeAsExpression", "fillColor", "getFillColor", "fillColorAsColorInt", "getFillColorAsColorInt", "fillColorAsExpression", "getFillColorAsExpression", "fillColorTransition", "getFillColorTransition", "fillColorUseTheme", "getFillColorUseTheme$annotations", "getFillColorUseTheme", "fillColorUseThemeAsExpression", "getFillColorUseThemeAsExpression$annotations", "getFillColorUseThemeAsExpression", "fillConstructBridgeGuardRail", "getFillConstructBridgeGuardRail$annotations", "getFillConstructBridgeGuardRail", "fillConstructBridgeGuardRailAsExpression", "getFillConstructBridgeGuardRailAsExpression$annotations", "getFillConstructBridgeGuardRailAsExpression", "fillElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "getFillElevationReference$annotations", "getFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "fillElevationReferenceAsExpression", "getFillElevationReferenceAsExpression$annotations", "getFillElevationReferenceAsExpression", "fillEmissiveStrength", "", "getFillEmissiveStrength", "()Ljava/lang/Double;", "fillEmissiveStrengthAsExpression", "getFillEmissiveStrengthAsExpression", "fillEmissiveStrengthTransition", "getFillEmissiveStrengthTransition", "fillOpacity", "getFillOpacity", "fillOpacityAsExpression", "getFillOpacityAsExpression", "fillOpacityTransition", "getFillOpacityTransition", "fillOutlineColor", "getFillOutlineColor", "fillOutlineColorAsColorInt", "getFillOutlineColorAsColorInt", "fillOutlineColorAsExpression", "getFillOutlineColorAsExpression", "fillOutlineColorTransition", "getFillOutlineColorTransition", "fillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "getFillOutlineColorUseTheme", "fillOutlineColorUseThemeAsExpression", "getFillOutlineColorUseThemeAsExpression$annotations", "getFillOutlineColorUseThemeAsExpression", "fillPattern", "getFillPattern", "fillPatternAsExpression", "getFillPatternAsExpression", "fillPatternCrossFade", "getFillPatternCrossFade", "fillPatternCrossFadeAsExpression", "getFillPatternCrossFadeAsExpression", "fillSortKey", "getFillSortKey", "fillSortKeyAsExpression", "getFillSortKeyAsExpression", "fillTranslate", "", "getFillTranslate", "()Ljava/util/List;", "fillTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "getFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "fillTranslateAnchorAsExpression", "getFillTranslateAnchorAsExpression", "fillTranslateAsExpression", "getFillTranslateAsExpression", "fillTranslateTransition", "getFillTranslateTransition", "fillTunnelStructureColor", "getFillTunnelStructureColor$annotations", "getFillTunnelStructureColor", "fillTunnelStructureColorAsColorInt", "getFillTunnelStructureColorAsColorInt$annotations", "getFillTunnelStructureColorAsColorInt", "fillTunnelStructureColorAsExpression", "getFillTunnelStructureColorAsExpression$annotations", "getFillTunnelStructureColorAsExpression", "fillTunnelStructureColorTransition", "getFillTunnelStructureColorTransition$annotations", "getFillTunnelStructureColorTransition", "fillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "getFillTunnelStructureColorUseTheme", "fillTunnelStructureColorUseThemeAsExpression", "getFillTunnelStructureColorUseThemeAsExpression$annotations", "getFillTunnelStructureColorUseThemeAsExpression", "fillZOffset", "getFillZOffset$annotations", "getFillZOffset", "fillZOffsetAsExpression", "getFillZOffsetAsExpression$annotations", "getFillZOffsetAsExpression", "fillZOffsetTransition", "getFillZOffsetTransition$annotations", "getFillZOffsetTransition", "filter", "getFilter", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class FillLayer extends Layer implements FillLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public FillLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillAntialias(boolean fillAntialias) {
        setProperty$extension_style_release(new PropertyValue<>("fill-antialias", Boolean.valueOf(fillAntialias)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColor(@ColorInt int fillBridgeGuardRailColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillBridgeGuardRailColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillBridgeGuardRailColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColorUseTheme(@NotNull String fillBridgeGuardRailColorUseTheme) {
        fillBridgeGuardRailColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, fillBridgeGuardRailColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillColor(@ColorInt int fillColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillColorUseTheme(@NotNull String fillColorUseTheme) {
        fillColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, fillColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillConstructBridgeGuardRail(boolean fillConstructBridgeGuardRail) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, Boolean.valueOf(fillConstructBridgeGuardRail)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillElevationReference(@NotNull FillElevationReference fillElevationReference) {
        fillElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-elevation-reference", fillElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillEmissiveStrength(double fillEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("fill-emissive-strength", Double.valueOf(fillEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOpacity(double fillOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, Double.valueOf(fillOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOutlineColor(@ColorInt int fillOutlineColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillOutlineColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOutlineColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillOutlineColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillOutlineColorUseTheme(@NotNull String fillOutlineColorUseTheme) {
        fillOutlineColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, fillOutlineColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillPattern(@NotNull String fillPattern) {
        fillPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, fillPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillPatternCrossFade(double fillPatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("fill-pattern-cross-fade", Double.valueOf(fillPatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillSortKey(double fillSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, Double.valueOf(fillSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslate(@NotNull List<Double> fillTranslate) {
        fillTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate", fillTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslateAnchor(@NotNull FillTranslateAnchor fillTranslateAnchor) {
        fillTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate-anchor", fillTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslateTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColor(@ColorInt int fillTunnelStructureColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillTunnelStructureColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillTunnelStructureColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColorUseTheme(@NotNull String fillTunnelStructureColorUseTheme) {
        fillTunnelStructureColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, fillTunnelStructureColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillZOffset(double fillZOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, Double.valueOf(fillZOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillZOffsetTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillZOffsetTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer filter(@NotNull Expression filter) {
        RecordTag.m(filter, "filter", filter, this);
        return this;
    }

    @Nullable
    public final Boolean getFillAntialias() {
        return (Boolean) getPropertyValueWithType("fill-antialias", Boolean.class);
    }

    @Nullable
    public final Expression getFillAntialiasAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-antialias");
    }

    @Nullable
    public final String getFillBridgeGuardRailColor() {
        Expression fillBridgeGuardRailColorAsExpression = getFillBridgeGuardRailColorAsExpression();
        if (fillBridgeGuardRailColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillBridgeGuardRailColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillBridgeGuardRailColorAsColorInt() {
        Expression fillBridgeGuardRailColorAsExpression = getFillBridgeGuardRailColorAsExpression();
        if (fillBridgeGuardRailColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillBridgeGuardRailColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillBridgeGuardRailColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getFillBridgeGuardRailColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-bridge-guard-rail-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillBridgeGuardRailColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getFillBridgeGuardRailColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
    }

    @Nullable
    public final String getFillColor() {
        Expression fillColorAsExpression = getFillColorAsExpression();
        if (fillColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillColorAsColorInt() {
        Expression fillColorAsExpression = getFillColorAsExpression();
        if (fillColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getFillColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getFillColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
    }

    @Nullable
    public final Boolean getFillConstructBridgeGuardRail() {
        return (Boolean) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, Boolean.class);
    }

    @Nullable
    public final Expression getFillConstructBridgeGuardRailAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
    }

    @Nullable
    public final FillElevationReference getFillElevationReference() {
        String str = (String) getPropertyValueWithType("fill-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        FillElevationReference.Companion companion = FillElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getFillElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillElevationReference fillElevationReference = getFillElevationReference();
        if (fillElevationReference != null) {
            return Expression.INSTANCE.literal(fillElevationReference.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getFillEmissiveStrength() {
        return (Double) getPropertyValueWithType("fill-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getFillEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-emissive-strength");
    }

    @Nullable
    public final StyleTransition getFillEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillOpacity() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, Double.class);
    }

    @Nullable
    public final Expression getFillOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
    }

    @Nullable
    public final StyleTransition getFillOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillOutlineColor() {
        Expression fillOutlineColorAsExpression = getFillOutlineColorAsExpression();
        if (fillOutlineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillOutlineColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillOutlineColorAsColorInt() {
        Expression fillOutlineColorAsExpression = getFillOutlineColorAsExpression();
        if (fillOutlineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillOutlineColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillOutlineColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getFillOutlineColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-outline-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillOutlineColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getFillOutlineColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
    }

    @Nullable
    public final String getFillPattern() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, String.class);
    }

    @Nullable
    public final Expression getFillPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
    }

    @Nullable
    public final Double getFillPatternCrossFade() {
        return (Double) getPropertyValueWithType("fill-pattern-cross-fade", Double.class);
    }

    @Nullable
    public final Expression getFillPatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-pattern-cross-fade");
    }

    @Nullable
    public final Double getFillSortKey() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, Double.class);
    }

    @Nullable
    public final Expression getFillSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
    }

    @Nullable
    public final List<Double> getFillTranslate() {
        return (List) getPropertyValueWithType("fill-translate", List.class);
    }

    @Nullable
    public final FillTranslateAnchor getFillTranslateAnchor() {
        String str = (String) getPropertyValueWithType("fill-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        FillTranslateAnchor.Companion companion = FillTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getFillTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillTranslateAnchor fillTranslateAnchor = getFillTranslateAnchor();
        if (fillTranslateAnchor != null) {
            return Expression.INSTANCE.literal(fillTranslateAnchor.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getFillTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-translate");
    }

    @Nullable
    public final StyleTransition getFillTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-translate-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillTunnelStructureColor() {
        Expression fillTunnelStructureColorAsExpression = getFillTunnelStructureColorAsExpression();
        if (fillTunnelStructureColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillTunnelStructureColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillTunnelStructureColorAsColorInt() {
        Expression fillTunnelStructureColorAsExpression = getFillTunnelStructureColorAsExpression();
        if (fillTunnelStructureColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillTunnelStructureColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillTunnelStructureColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getFillTunnelStructureColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-tunnel-structure-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillTunnelStructureColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getFillTunnelStructureColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
    }

    @Nullable
    public final Double getFillZOffset() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, Double.class);
    }

    @Nullable
    public final Expression getFillZOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
    }

    @Nullable
    public final StyleTransition getFillZOffsetTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-z-offset-transition", StyleTransition.class);
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
        return "fill";
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
    public FillLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\nR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000fR\u0013\u0010%\u001a\u0004\u0018\u00010\u00118G¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0013\u0010'\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0013\u0010)\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u001c\u0010+\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\nR\u001c\u00101\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0002\u001a\u0004\b3\u0010\u0006R\u001c\u00104\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\nR\u001c\u00107\u001a\u0004\u0018\u0001088FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bF\u0010\u001cR\u0013\u0010G\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0013\u0010I\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\nR\u0013\u0010K\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bL\u0010\u001cR\u0013\u0010M\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bN\u0010\u000fR\u0013\u0010O\u001a\u0004\u0018\u00010\u00118G¢\u0006\u0006\u001a\u0004\bP\u0010\u0014R\u0013\u0010Q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bR\u0010\nR\u0013\u0010S\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010\u001cR\u001c\u0010U\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0002\u001a\u0004\bW\u0010\u000fR\u001c\u0010X\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010\u0002\u001a\u0004\bZ\u0010\nR\u0013\u0010[\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u000fR\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0013\u0010_\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\b`\u0010BR\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bd\u0010BR\u0013\u0010e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bf\u0010\nR\u0019\u0010g\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010k\u001a\u0004\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\br\u0010\nR\u0013\u0010s\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bt\u0010\u001cR\u001c\u0010u\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0002\u001a\u0004\bw\u0010\u000fR\u001c\u0010x\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0002\u001a\u0004\bz\u0010\u0014R\u001c\u0010{\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0002\u001a\u0004\b}\u0010\nR\u001d\u0010~\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\r\u0012\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010\u001cR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0002\u001a\u0005\b\u0083\u0001\u0010\u000fR\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010\nR\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010@8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\u0002\u001a\u0005\b\u0089\u0001\u0010BR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\u0002\u001a\u0005\b\u008c\u0001\u0010\nR\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0005\b\u008f\u0001\u0010\u001cR\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010BR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010BR\u0017\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillLayer$Companion;", "", "()V", "defaultFillAntialias", "", "getDefaultFillAntialias", "()Ljava/lang/Boolean;", "defaultFillAntialiasAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultFillAntialiasAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultFillBridgeGuardRailColor", "", "getDefaultFillBridgeGuardRailColor$annotations", "getDefaultFillBridgeGuardRailColor", "()Ljava/lang/String;", "defaultFillBridgeGuardRailColorAsColorInt", "", "getDefaultFillBridgeGuardRailColorAsColorInt$annotations", "getDefaultFillBridgeGuardRailColorAsColorInt", "()Ljava/lang/Integer;", "defaultFillBridgeGuardRailColorAsExpression", "getDefaultFillBridgeGuardRailColorAsExpression$annotations", "getDefaultFillBridgeGuardRailColorAsExpression", "defaultFillBridgeGuardRailColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultFillBridgeGuardRailColorTransition$annotations", "getDefaultFillBridgeGuardRailColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultFillBridgeGuardRailColorUseTheme", "getDefaultFillBridgeGuardRailColorUseTheme$annotations", "getDefaultFillBridgeGuardRailColorUseTheme", "defaultFillBridgeGuardRailColorUseThemeAsExpression", "getDefaultFillBridgeGuardRailColorUseThemeAsExpression$annotations", "getDefaultFillBridgeGuardRailColorUseThemeAsExpression", "defaultFillColor", "getDefaultFillColor", "defaultFillColorAsColorInt", "getDefaultFillColorAsColorInt", "defaultFillColorAsExpression", "getDefaultFillColorAsExpression", "defaultFillColorTransition", "getDefaultFillColorTransition", "defaultFillColorUseTheme", "getDefaultFillColorUseTheme$annotations", "getDefaultFillColorUseTheme", "defaultFillColorUseThemeAsExpression", "getDefaultFillColorUseThemeAsExpression$annotations", "getDefaultFillColorUseThemeAsExpression", "defaultFillConstructBridgeGuardRail", "getDefaultFillConstructBridgeGuardRail$annotations", "getDefaultFillConstructBridgeGuardRail", "defaultFillConstructBridgeGuardRailAsExpression", "getDefaultFillConstructBridgeGuardRailAsExpression$annotations", "getDefaultFillConstructBridgeGuardRailAsExpression", "defaultFillElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "getDefaultFillElevationReference$annotations", "getDefaultFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "defaultFillElevationReferenceAsExpression", "getDefaultFillElevationReferenceAsExpression$annotations", "getDefaultFillElevationReferenceAsExpression", "defaultFillEmissiveStrength", "", "getDefaultFillEmissiveStrength", "()Ljava/lang/Double;", "defaultFillEmissiveStrengthAsExpression", "getDefaultFillEmissiveStrengthAsExpression", "defaultFillEmissiveStrengthTransition", "getDefaultFillEmissiveStrengthTransition", "defaultFillOpacity", "getDefaultFillOpacity", "defaultFillOpacityAsExpression", "getDefaultFillOpacityAsExpression", "defaultFillOpacityTransition", "getDefaultFillOpacityTransition", "defaultFillOutlineColor", "getDefaultFillOutlineColor", "defaultFillOutlineColorAsColorInt", "getDefaultFillOutlineColorAsColorInt", "defaultFillOutlineColorAsExpression", "getDefaultFillOutlineColorAsExpression", "defaultFillOutlineColorTransition", "getDefaultFillOutlineColorTransition", "defaultFillOutlineColorUseTheme", "getDefaultFillOutlineColorUseTheme$annotations", "getDefaultFillOutlineColorUseTheme", "defaultFillOutlineColorUseThemeAsExpression", "getDefaultFillOutlineColorUseThemeAsExpression$annotations", "getDefaultFillOutlineColorUseThemeAsExpression", "defaultFillPattern", "getDefaultFillPattern", "defaultFillPatternAsExpression", "getDefaultFillPatternAsExpression", "defaultFillPatternCrossFade", "getDefaultFillPatternCrossFade", "defaultFillPatternCrossFadeAsExpression", "getDefaultFillPatternCrossFadeAsExpression", "defaultFillSortKey", "getDefaultFillSortKey", "defaultFillSortKeyAsExpression", "getDefaultFillSortKeyAsExpression", "defaultFillTranslate", "", "getDefaultFillTranslate", "()Ljava/util/List;", "defaultFillTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "getDefaultFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "defaultFillTranslateAnchorAsExpression", "getDefaultFillTranslateAnchorAsExpression", "defaultFillTranslateAsExpression", "getDefaultFillTranslateAsExpression", "defaultFillTranslateTransition", "getDefaultFillTranslateTransition", "defaultFillTunnelStructureColor", "getDefaultFillTunnelStructureColor$annotations", "getDefaultFillTunnelStructureColor", "defaultFillTunnelStructureColorAsColorInt", "getDefaultFillTunnelStructureColorAsColorInt$annotations", "getDefaultFillTunnelStructureColorAsColorInt", "defaultFillTunnelStructureColorAsExpression", "getDefaultFillTunnelStructureColorAsExpression$annotations", "getDefaultFillTunnelStructureColorAsExpression", "defaultFillTunnelStructureColorTransition", "getDefaultFillTunnelStructureColorTransition$annotations", "getDefaultFillTunnelStructureColorTransition", "defaultFillTunnelStructureColorUseTheme", "getDefaultFillTunnelStructureColorUseTheme$annotations", "getDefaultFillTunnelStructureColorUseTheme", "defaultFillTunnelStructureColorUseThemeAsExpression", "getDefaultFillTunnelStructureColorUseThemeAsExpression$annotations", "getDefaultFillTunnelStructureColorUseThemeAsExpression", "defaultFillZOffset", "getDefaultFillZOffset$annotations", "getDefaultFillZOffset", "defaultFillZOffsetAsExpression", "getDefaultFillZOffsetAsExpression$annotations", "getDefaultFillZOffsetAsExpression", "defaultFillZOffsetTransition", "getDefaultFillZOffsetTransition$annotations", "getDefaultFillZOffsetTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Boolean getDefaultFillAntialias() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-antialias");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultFillAntialiasAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-antialias");
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
            Boolean defaultFillAntialias = getDefaultFillAntialias();
            if (defaultFillAntialias == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillAntialias.booleanValue());
        }

        @Nullable
        public final String getDefaultFillBridgeGuardRailColor() {
            Expression defaultFillBridgeGuardRailColorAsExpression = getDefaultFillBridgeGuardRailColorAsExpression();
            if (defaultFillBridgeGuardRailColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillBridgeGuardRailColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillBridgeGuardRailColorAsColorInt() {
            Expression defaultFillBridgeGuardRailColorAsExpression = getDefaultFillBridgeGuardRailColorAsExpression();
            if (defaultFillBridgeGuardRailColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillBridgeGuardRailColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillBridgeGuardRailColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
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
        public final StyleTransition getDefaultFillBridgeGuardRailColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-bridge-guard-rail-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillBridgeGuardRailColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillBridgeGuardRailColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
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
            String defaultFillBridgeGuardRailColorUseTheme = getDefaultFillBridgeGuardRailColorUseTheme();
            if (defaultFillBridgeGuardRailColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillBridgeGuardRailColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final String getDefaultFillColor() {
            Expression defaultFillColorAsExpression = getDefaultFillColorAsExpression();
            if (defaultFillColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillColorAsColorInt() {
            Expression defaultFillColorAsExpression = getDefaultFillColorAsExpression();
            if (defaultFillColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
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
        public final StyleTransition getDefaultFillColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
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
            String defaultFillColorUseTheme = getDefaultFillColorUseTheme();
            if (defaultFillColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Boolean getDefaultFillConstructBridgeGuardRail() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultFillConstructBridgeGuardRailAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
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
            Boolean defaultFillConstructBridgeGuardRail = getDefaultFillConstructBridgeGuardRail();
            if (defaultFillConstructBridgeGuardRail == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillConstructBridgeGuardRail.booleanValue());
        }

        @Nullable
        public final FillElevationReference getDefaultFillElevationReference() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-elevation-reference");
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
            FillElevationReference.Companion companion = FillElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultFillElevationReferenceAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-elevation-reference");
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
            FillElevationReference defaultFillElevationReference = getDefaultFillElevationReference();
            if (defaultFillElevationReference != null) {
                return Expression.INSTANCE.literal(defaultFillElevationReference.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength");
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
            Double defaultFillEmissiveStrength = getDefaultFillEmissiveStrength();
            if (defaultFillEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
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
            Double defaultFillOpacity = getDefaultFillOpacity();
            if (defaultFillOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillOutlineColor() {
            Expression defaultFillOutlineColorAsExpression = getDefaultFillOutlineColorAsExpression();
            if (defaultFillOutlineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillOutlineColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillOutlineColorAsColorInt() {
            Expression defaultFillOutlineColorAsExpression = getDefaultFillOutlineColorAsExpression();
            if (defaultFillOutlineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillOutlineColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillOutlineColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
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
        public final StyleTransition getDefaultFillOutlineColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-outline-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillOutlineColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillOutlineColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
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
            String defaultFillOutlineColorUseTheme = getDefaultFillOutlineColorUseTheme();
            if (defaultFillOutlineColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillOutlineColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final String getDefaultFillPattern() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillPatternAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
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
            String defaultFillPattern = getDefaultFillPattern();
            if (defaultFillPattern != null) {
                return Expression.INSTANCE.literal(defaultFillPattern);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillPatternCrossFade() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillPatternCrossFadeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-pattern-cross-fade");
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
            Double defaultFillPatternCrossFade = getDefaultFillPatternCrossFade();
            if (defaultFillPatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillPatternCrossFade.doubleValue());
        }

        @Nullable
        public final Double getDefaultFillSortKey() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillSortKeyAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
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
            Double defaultFillSortKey = getDefaultFillSortKey();
            if (defaultFillSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillSortKey.doubleValue());
        }

        @Nullable
        public final List<Double> getDefaultFillTranslate() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final FillTranslateAnchor getDefaultFillTranslateAnchor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-anchor");
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
            FillTranslateAnchor.Companion companion = FillTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultFillTranslateAnchorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-anchor");
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
            FillTranslateAnchor defaultFillTranslateAnchor = getDefaultFillTranslateAnchor();
            if (defaultFillTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultFillTranslateAnchor.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillTranslateAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate");
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
            List<Double> defaultFillTranslate = getDefaultFillTranslate();
            if (defaultFillTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultFillTranslate);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultFillTranslateTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillTunnelStructureColor() {
            Expression defaultFillTunnelStructureColorAsExpression = getDefaultFillTunnelStructureColorAsExpression();
            if (defaultFillTunnelStructureColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillTunnelStructureColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillTunnelStructureColorAsColorInt() {
            Expression defaultFillTunnelStructureColorAsExpression = getDefaultFillTunnelStructureColorAsExpression();
            if (defaultFillTunnelStructureColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillTunnelStructureColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillTunnelStructureColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
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
        public final StyleTransition getDefaultFillTunnelStructureColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-tunnel-structure-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillTunnelStructureColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillTunnelStructureColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
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
            String defaultFillTunnelStructureColorUseTheme = getDefaultFillTunnelStructureColorUseTheme();
            if (defaultFillTunnelStructureColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillTunnelStructureColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillZOffset() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillZOffsetAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
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
            Double defaultFillZOffset = getDefaultFillZOffset();
            if (defaultFillZOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillZOffset.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillZOffsetTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-z-offset-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "visibility");
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
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillConstructBridgeGuardRail$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillConstructBridgeGuardRailAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillOutlineColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillOutlineColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffset$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffsetAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffsetTransition$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColorUseTheme(@NotNull Expression fillBridgeGuardRailColorUseTheme) {
        RecordTag.m(fillBridgeGuardRailColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, fillBridgeGuardRailColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillColorUseTheme(@NotNull Expression fillColorUseTheme) {
        RecordTag.m(fillColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, fillColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillElevationReference(@NotNull Expression fillElevationReference) {
        RecordTag.m(fillElevationReference, "fill-elevation-reference", fillElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillOutlineColorUseTheme(@NotNull Expression fillOutlineColorUseTheme) {
        RecordTag.m(fillOutlineColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, fillOutlineColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillPattern(@NotNull Expression fillPattern) {
        RecordTag.m(fillPattern, PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, fillPattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslate(@NotNull Expression fillTranslate) {
        RecordTag.m(fillTranslate, "fill-translate", fillTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslateAnchor(@NotNull Expression fillTranslateAnchor) {
        RecordTag.m(fillTranslateAnchor, "fill-translate-anchor", fillTranslateAnchor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColorUseTheme(@NotNull Expression fillTunnelStructureColorUseTheme) {
        RecordTag.m(fillTunnelStructureColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, fillTunnelStructureColorUseTheme, this);
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRail$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRailAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffsetAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffsetTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillAntialias(@NotNull Expression fillAntialias) {
        RecordTag.m(fillAntialias, "fill-antialias", fillAntialias, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillConstructBridgeGuardRail(@NotNull Expression fillConstructBridgeGuardRail) {
        RecordTag.m(fillConstructBridgeGuardRail, PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, fillConstructBridgeGuardRail, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillEmissiveStrength(@NotNull Expression fillEmissiveStrength) {
        RecordTag.m(fillEmissiveStrength, "fill-emissive-strength", fillEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOpacity(@NotNull Expression fillOpacity) {
        RecordTag.m(fillOpacity, PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, fillOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillPatternCrossFade(@NotNull Expression fillPatternCrossFade) {
        RecordTag.m(fillPatternCrossFade, "fill-pattern-cross-fade", fillPatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillSortKey(@NotNull Expression fillSortKey) {
        RecordTag.m(fillSortKey, PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, fillSortKey, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillZOffset(@NotNull Expression fillZOffset) {
        RecordTag.m(fillZOffset, PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, fillZOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillLayer visibility(@NotNull Expression visibility) {
        RecordTag.m(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColor(@NotNull Expression fillBridgeGuardRailColor) {
        RecordTag.m(fillBridgeGuardRailColor, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, fillBridgeGuardRailColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillColor(@NotNull Expression fillColor) {
        RecordTag.m(fillColor, PolygonAnnotationOptions.PROPERTY_FILL_COLOR, fillColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOutlineColor(@NotNull Expression fillOutlineColor) {
        RecordTag.m(fillOutlineColor, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, fillOutlineColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColor(@NotNull Expression fillTunnelStructureColor) {
        RecordTag.m(fillTunnelStructureColor, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, fillTunnelStructureColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColor(@NotNull String fillBridgeGuardRailColor) {
        fillBridgeGuardRailColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, fillBridgeGuardRailColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillBridgeGuardRailColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-bridge-guard-rail-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillColor(@NotNull String fillColor) {
        fillColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, fillColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOutlineColor(@NotNull String fillOutlineColor) {
        fillOutlineColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, fillOutlineColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillOutlineColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-outline-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @NotNull
    public FillLayer fillTranslateTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColor(@NotNull String fillTunnelStructureColor) {
        fillTunnelStructureColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, fillTunnelStructureColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillTunnelStructureColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-tunnel-structure-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    @NotNull
    public FillLayer fillZOffsetTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-z-offset-transition", options));
        return this;
    }
}
