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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010 \n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009b\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0011\u0010\u0017\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010\u0017\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0017J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0017J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0011\u0010(\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010(\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bH\u0017J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004H\u0017J\u0011\u00100\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u00100\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0004H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0007H\u0016J\u0011\u0010>\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010>\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0011\u0010@\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010@\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u000bH\u0016J\u0012\u0010B\u001a\u00020\u00002\b\b\u0001\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0004H\u0016J\u0011\u0010H\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010H\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u000bH\u0017J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0004H\u0017J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u000bH\u0016J\u0016\u0010P\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070QH\u0016J\u0011\u0010V\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010V\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u000bH\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0007H\u0016J\u0011\u0010\\\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010\\\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u000f\u0010\u0099\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u009a\u0001J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u000bH\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u0007H\u0016J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u000bH\u0016J\u0016\u0010c\u001a\u00020\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070QH\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u000bH\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0007H\u0016J\u0011\u0010k\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010k\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0011\u0010m\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010m\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u0007H\u0016J\u0010\u0010q\u001a\u00020\u00002\u0006\u0010q\u001a\u00020\u0007H\u0016J\u0010\u0010s\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000bH\u0016J\u0010\u0010s\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u0007H\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u000bH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0004H\u0016J\u0010\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u000bH\u0016J\u0010\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0007H\u0016J\u0011\u0010\u007f\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J&\u0010\u007f\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016J'\u0010\u008b\u0001\u001a\u00020\u00002\u001c\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u0001¢\u0006\u0003\b\u0098\u0001H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u00020\u000bH\u0016J\u0013\u0010\u008d\u0001\u001a\u00020\u00002\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\rR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u0013\u0010$\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010&\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\rR\u0013\u0010(\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u001c\u0010*\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u0010R\u001c\u0010-\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\rR\u0013\u00100\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0013\u00102\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010\tR\u0013\u00104\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010\rR\u0013\u00106\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\u0010R\u0013\u00108\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010\rR\u0013\u0010:\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010\tR\u0013\u0010<\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010\rR\u0013\u0010>\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b?\u0010\u001aR\u0013\u0010@\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010\u001aR\u0013\u0010B\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010\u0010R\u0013\u0010D\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\bE\u0010\u0014R\u0013\u0010F\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u0013\u0010H\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bI\u0010\u001aR\u001c\u0010J\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u001d\u001a\u0004\bL\u0010\u0010R\u001c\u0010M\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u001d\u001a\u0004\bO\u0010\rR\u0019\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010T\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bU\u0010\rR\u0013\u0010V\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bW\u0010\u001aR\u0013\u0010X\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bY\u0010\tR\u0013\u0010Z\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b[\u0010\rR\u0013\u0010\\\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b]\u0010\u001aR\u0013\u0010^\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b_\u0010\tR\u0013\u0010`\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\ba\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0010R\u0019\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bd\u0010SR\u0013\u0010e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bf\u0010\rR\u0013\u0010g\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010\tR\u0013\u0010i\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010\rR\u0013\u0010k\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bl\u0010\u001aR\u0013\u0010m\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bn\u0010\u001aR\u0016\u0010o\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\tR\u0016\u0010q\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010\tR\u0013\u0010s\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010\tR\u0013\u0010u\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bv\u0010\rR\u0013\u0010w\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010\u0010R\u0013\u0010y\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bz\u0010\rR\u0013\u0010{\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b|\u0010\tR\u0013\u0010}\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b~\u0010\rR\u0014\u0010\u007f\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u001aR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0010R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0010R\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\rR\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\tR\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\rR\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u001aR\u001a\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\r¨\u0006\u009c\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "(Ljava/lang/String;)V", "accuracyRadius", "", "getAccuracyRadius", "()Ljava/lang/Double;", "accuracyRadiusAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getAccuracyRadiusAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "accuracyRadiusBorderColor", "getAccuracyRadiusBorderColor", "()Ljava/lang/String;", "accuracyRadiusBorderColorAsColorInt", "", "getAccuracyRadiusBorderColorAsColorInt", "()Ljava/lang/Integer;", "accuracyRadiusBorderColorAsExpression", "getAccuracyRadiusBorderColorAsExpression", "accuracyRadiusBorderColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getAccuracyRadiusBorderColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "accuracyRadiusBorderColorUseTheme", "getAccuracyRadiusBorderColorUseTheme$annotations", "()V", "getAccuracyRadiusBorderColorUseTheme", "accuracyRadiusBorderColorUseThemeAsExpression", "getAccuracyRadiusBorderColorUseThemeAsExpression$annotations", "getAccuracyRadiusBorderColorUseThemeAsExpression", "accuracyRadiusColor", "getAccuracyRadiusColor", "accuracyRadiusColorAsColorInt", "getAccuracyRadiusColorAsColorInt", "accuracyRadiusColorAsExpression", "getAccuracyRadiusColorAsExpression", "accuracyRadiusColorTransition", "getAccuracyRadiusColorTransition", "accuracyRadiusColorUseTheme", "getAccuracyRadiusColorUseTheme$annotations", "getAccuracyRadiusColorUseTheme", "accuracyRadiusColorUseThemeAsExpression", "getAccuracyRadiusColorUseThemeAsExpression$annotations", "getAccuracyRadiusColorUseThemeAsExpression", "accuracyRadiusTransition", "getAccuracyRadiusTransition", "bearing", "getBearing", "bearingAsExpression", "getBearingAsExpression", "bearingImage", "getBearingImage", "bearingImageAsExpression", "getBearingImageAsExpression", "bearingImageSize", "getBearingImageSize", "bearingImageSizeAsExpression", "getBearingImageSizeAsExpression", "bearingImageSizeTransition", "getBearingImageSizeTransition", "bearingTransition", "getBearingTransition", "emphasisCircleColor", "getEmphasisCircleColor", "emphasisCircleColorAsColorInt", "getEmphasisCircleColorAsColorInt", "emphasisCircleColorAsExpression", "getEmphasisCircleColorAsExpression", "emphasisCircleColorTransition", "getEmphasisCircleColorTransition", "emphasisCircleColorUseTheme", "getEmphasisCircleColorUseTheme$annotations", "getEmphasisCircleColorUseTheme", "emphasisCircleColorUseThemeAsExpression", "getEmphasisCircleColorUseThemeAsExpression$annotations", "getEmphasisCircleColorUseThemeAsExpression", "emphasisCircleGlowRange", "", "getEmphasisCircleGlowRange", "()Ljava/util/List;", "emphasisCircleGlowRangeAsExpression", "getEmphasisCircleGlowRangeAsExpression", "emphasisCircleGlowRangeTransition", "getEmphasisCircleGlowRangeTransition", "emphasisCircleRadius", "getEmphasisCircleRadius", "emphasisCircleRadiusAsExpression", "getEmphasisCircleRadiusAsExpression", "emphasisCircleRadiusTransition", "getEmphasisCircleRadiusTransition", "imagePitchDisplacement", "getImagePitchDisplacement", "imagePitchDisplacementAsExpression", "getImagePitchDisplacementAsExpression", "getLayerId", "location", "getLocation", "locationAsExpression", "getLocationAsExpression", "locationIndicatorOpacity", "getLocationIndicatorOpacity", "locationIndicatorOpacityAsExpression", "getLocationIndicatorOpacityAsExpression", "locationIndicatorOpacityTransition", "getLocationIndicatorOpacityTransition", "locationTransition", "getLocationTransition", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "perspectiveCompensation", "getPerspectiveCompensation", "perspectiveCompensationAsExpression", "getPerspectiveCompensationAsExpression", "shadowImage", "getShadowImage", "shadowImageAsExpression", "getShadowImageAsExpression", "shadowImageSize", "getShadowImageSize", "shadowImageSizeAsExpression", "getShadowImageSizeAsExpression", "shadowImageSizeTransition", "getShadowImageSizeTransition", "slot", "getSlot", "topImage", "getTopImage", "topImageAsExpression", "getTopImageAsExpression", "topImageSize", "getTopImageSize", "topImageSizeAsExpression", "getTopImageSizeAsExpression", "topImageSizeTransition", "getTopImageSizeTransition", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class LocationIndicatorLayer extends Layer implements LocationIndicatorLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    public LocationIndicatorLayer(@NotNull String str) {
        str.getClass();
        this.layerId = str;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadius(double accuracyRadius) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius", Double.valueOf(accuracyRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColor(@ColorInt int accuracyRadiusBorderColor) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(accuracyRadiusBorderColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusBorderColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(@NotNull String accuracyRadiusBorderColorUseTheme) {
        accuracyRadiusBorderColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color-use-theme", accuracyRadiusBorderColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColor(@ColorInt int accuracyRadiusColor) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(accuracyRadiusColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColorUseTheme(@NotNull String accuracyRadiusColorUseTheme) {
        accuracyRadiusColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color-use-theme", accuracyRadiusColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearing(double bearing) {
        setProperty$extension_style_release(new PropertyValue<>("bearing", Double.valueOf(bearing)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImage(@NotNull String bearingImage) {
        bearingImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-image", bearingImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImageSize(double bearingImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("bearing-image-size", Double.valueOf(bearingImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImageSizeTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        bearingImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        bearingTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleColor(@ColorInt int emphasisCircleColor) {
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(emphasisCircleColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer emphasisCircleColorUseTheme(@NotNull String emphasisCircleColorUseTheme) {
        emphasisCircleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color-use-theme", emphasisCircleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleGlowRange(@NotNull List<Double> emphasisCircleGlowRange) {
        emphasisCircleGlowRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-glow-range", emphasisCircleGlowRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleGlowRangeTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleGlowRangeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleRadius(double emphasisCircleRadius) {
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-radius", Double.valueOf(emphasisCircleRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleRadiusTransition(builder.build());
        return this;
    }

    @Nullable
    public final Double getAccuracyRadius() {
        return (Double) getPropertyValueWithType("accuracy-radius", Double.class);
    }

    @Nullable
    public final Expression getAccuracyRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius");
    }

    @Nullable
    public final String getAccuracyRadiusBorderColor() {
        Expression accuracyRadiusBorderColorAsExpression = getAccuracyRadiusBorderColorAsExpression();
        if (accuracyRadiusBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(accuracyRadiusBorderColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getAccuracyRadiusBorderColorAsColorInt() {
        Expression accuracyRadiusBorderColorAsExpression = getAccuracyRadiusBorderColorAsExpression();
        if (accuracyRadiusBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(accuracyRadiusBorderColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getAccuracyRadiusBorderColorAsExpression() {
        return (Expression) getPropertyValueWithType("accuracy-radius-border-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getAccuracyRadiusBorderColorTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-border-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getAccuracyRadiusBorderColorUseTheme() {
        return (String) getPropertyValueWithType("accuracy-radius-border-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getAccuracyRadiusBorderColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius-border-color-use-theme");
    }

    @Nullable
    public final String getAccuracyRadiusColor() {
        Expression accuracyRadiusColorAsExpression = getAccuracyRadiusColorAsExpression();
        if (accuracyRadiusColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(accuracyRadiusColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getAccuracyRadiusColorAsColorInt() {
        Expression accuracyRadiusColorAsExpression = getAccuracyRadiusColorAsExpression();
        if (accuracyRadiusColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(accuracyRadiusColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getAccuracyRadiusColorAsExpression() {
        return (Expression) getPropertyValueWithType("accuracy-radius-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getAccuracyRadiusColorTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getAccuracyRadiusColorUseTheme() {
        return (String) getPropertyValueWithType("accuracy-radius-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getAccuracyRadiusColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius-color-use-theme");
    }

    @Nullable
    public final StyleTransition getAccuracyRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getBearing() {
        return (Double) getPropertyValueWithType("bearing", Double.class);
    }

    @Nullable
    public final Expression getBearingAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing");
    }

    @Nullable
    public final String getBearingImage() {
        return (String) getPropertyValueWithType("bearing-image", String.class);
    }

    @Nullable
    public final Expression getBearingImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing-image");
    }

    @Nullable
    public final Double getBearingImageSize() {
        return (Double) getPropertyValueWithType("bearing-image-size", Double.class);
    }

    @Nullable
    public final Expression getBearingImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing-image-size");
    }

    @Nullable
    public final StyleTransition getBearingImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("bearing-image-size-transition", StyleTransition.class);
    }

    @Nullable
    public final StyleTransition getBearingTransition() {
        return (StyleTransition) getPropertyValueWithType("bearing-transition", StyleTransition.class);
    }

    @Nullable
    public final String getEmphasisCircleColor() {
        Expression emphasisCircleColorAsExpression = getEmphasisCircleColorAsExpression();
        if (emphasisCircleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(emphasisCircleColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getEmphasisCircleColorAsColorInt() {
        Expression emphasisCircleColorAsExpression = getEmphasisCircleColorAsExpression();
        if (emphasisCircleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(emphasisCircleColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getEmphasisCircleColorAsExpression() {
        return (Expression) getPropertyValueWithType("emphasis-circle-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getEmphasisCircleColorTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getEmphasisCircleColorUseTheme() {
        return (String) getPropertyValueWithType("emphasis-circle-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getEmphasisCircleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-color-use-theme");
    }

    @Nullable
    public final List<Double> getEmphasisCircleGlowRange() {
        return (List) getPropertyValueWithType("emphasis-circle-glow-range", List.class);
    }

    @Nullable
    public final Expression getEmphasisCircleGlowRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-glow-range");
    }

    @Nullable
    public final StyleTransition getEmphasisCircleGlowRangeTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-glow-range-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getEmphasisCircleRadius() {
        return (Double) getPropertyValueWithType("emphasis-circle-radius", Double.class);
    }

    @Nullable
    public final Expression getEmphasisCircleRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-radius");
    }

    @Nullable
    public final StyleTransition getEmphasisCircleRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getImagePitchDisplacement() {
        return (Double) getPropertyValueWithType("image-pitch-displacement", Double.class);
    }

    @Nullable
    public final Expression getImagePitchDisplacementAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("image-pitch-displacement");
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getLayerId() {
        return this.layerId;
    }

    @Nullable
    public final List<Double> getLocation() {
        return (List) getPropertyValueWithType("location", List.class);
    }

    @Nullable
    public final Expression getLocationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("location");
    }

    @Nullable
    public final Double getLocationIndicatorOpacity() {
        return (Double) getPropertyValueWithType("location-indicator-opacity", Double.class);
    }

    @Nullable
    public final Expression getLocationIndicatorOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("location-indicator-opacity");
    }

    @Nullable
    public final StyleTransition getLocationIndicatorOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("location-indicator-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final StyleTransition getLocationTransition() {
        return (StyleTransition) getPropertyValueWithType("location-transition", StyleTransition.class);
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
    public final Double getPerspectiveCompensation() {
        return (Double) getPropertyValueWithType("perspective-compensation", Double.class);
    }

    @Nullable
    public final Expression getPerspectiveCompensationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("perspective-compensation");
    }

    @Nullable
    public final String getShadowImage() {
        return (String) getPropertyValueWithType("shadow-image", String.class);
    }

    @Nullable
    public final Expression getShadowImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("shadow-image");
    }

    @Nullable
    public final Double getShadowImageSize() {
        return (Double) getPropertyValueWithType("shadow-image-size", Double.class);
    }

    @Nullable
    public final Expression getShadowImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("shadow-image-size");
    }

    @Nullable
    public final StyleTransition getShadowImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("shadow-image-size-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @Nullable
    public final String getTopImage() {
        return (String) getPropertyValueWithType("top-image", String.class);
    }

    @Nullable
    public final Expression getTopImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("top-image");
    }

    @Nullable
    public final Double getTopImageSize() {
        return (Double) getPropertyValueWithType("top-image-size", Double.class);
    }

    @Nullable
    public final Expression getTopImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("top-image-size");
    }

    @Nullable
    public final StyleTransition getTopImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("top-image-size-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getType$extension_style_release() {
        return "location-indicator";
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

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer imagePitchDisplacement(double imagePitchDisplacement) {
        setProperty$extension_style_release(new PropertyValue<>("image-pitch-displacement", Double.valueOf(imagePitchDisplacement)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer location(@NotNull List<Double> location) {
        location.getClass();
        setProperty$extension_style_release(new PropertyValue<>("location", location));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationIndicatorOpacity(double locationIndicatorOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("location-indicator-opacity", Double.valueOf(locationIndicatorOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationIndicatorOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        locationIndicatorOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        locationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LocationIndicatorLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LocationIndicatorLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer perspectiveCompensation(double perspectiveCompensation) {
        setProperty$extension_style_release(new PropertyValue<>("perspective-compensation", Double.valueOf(perspectiveCompensation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImage(@NotNull String shadowImage) {
        shadowImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-image", shadowImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImageSize(double shadowImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("shadow-image-size", Double.valueOf(shadowImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImageSizeTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        shadowImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LocationIndicatorLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImage(@NotNull String topImage) {
        topImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("top-image", topImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImageSize(double topImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("top-image-size", Double.valueOf(topImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImageSizeTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        topImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LocationIndicatorLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\nR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0013\u0010%\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\nR\u0013\u0010-\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010/\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\nR\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0013\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\nR\u0013\u0010;\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010\u0018R\u0013\u0010=\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b>\u0010\u0018R\u0013\u0010?\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b@\u0010\u000eR\u0013\u0010A\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\bB\u0010\u0012R\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bF\u0010\u0018R\u001c\u0010G\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u000eR\u001c\u0010J\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\nR\u0019\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010Q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bR\u0010\nR\u0013\u0010S\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bT\u0010\u0018R\u0013\u0010U\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0013\u0010W\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bX\u0010\nR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0018R\u0013\u0010[\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0019\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\b`\u0010PR\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u0013\u0010e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bf\u0010\nR\u0013\u0010g\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bh\u0010\u0018R\u0013\u0010i\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bj\u0010\u0018R\u0013\u0010k\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bl\u0010\u0006R\u0013\u0010m\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u0013\u0010o\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010\u0006R\u0013\u0010q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\br\u0010\nR\u0013\u0010s\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bt\u0010\u000eR\u0013\u0010u\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bv\u0010\nR\u0013\u0010w\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0013\u0010y\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bz\u0010\nR\u0013\u0010{\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b|\u0010\u0018R\u0013\u0010}\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b~\u0010\u000eR\u0014\u0010\u007f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\nR\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0006R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\nR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0018R\u0017\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer$Companion;", "", "()V", "defaultAccuracyRadius", "", "getDefaultAccuracyRadius", "()Ljava/lang/Double;", "defaultAccuracyRadiusAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultAccuracyRadiusAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultAccuracyRadiusBorderColor", "", "getDefaultAccuracyRadiusBorderColor", "()Ljava/lang/String;", "defaultAccuracyRadiusBorderColorAsColorInt", "", "getDefaultAccuracyRadiusBorderColorAsColorInt", "()Ljava/lang/Integer;", "defaultAccuracyRadiusBorderColorAsExpression", "getDefaultAccuracyRadiusBorderColorAsExpression", "defaultAccuracyRadiusBorderColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultAccuracyRadiusBorderColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultAccuracyRadiusBorderColorUseTheme", "getDefaultAccuracyRadiusBorderColorUseTheme$annotations", "getDefaultAccuracyRadiusBorderColorUseTheme", "defaultAccuracyRadiusBorderColorUseThemeAsExpression", "getDefaultAccuracyRadiusBorderColorUseThemeAsExpression$annotations", "getDefaultAccuracyRadiusBorderColorUseThemeAsExpression", "defaultAccuracyRadiusColor", "getDefaultAccuracyRadiusColor", "defaultAccuracyRadiusColorAsColorInt", "getDefaultAccuracyRadiusColorAsColorInt", "defaultAccuracyRadiusColorAsExpression", "getDefaultAccuracyRadiusColorAsExpression", "defaultAccuracyRadiusColorTransition", "getDefaultAccuracyRadiusColorTransition", "defaultAccuracyRadiusColorUseTheme", "getDefaultAccuracyRadiusColorUseTheme$annotations", "getDefaultAccuracyRadiusColorUseTheme", "defaultAccuracyRadiusColorUseThemeAsExpression", "getDefaultAccuracyRadiusColorUseThemeAsExpression$annotations", "getDefaultAccuracyRadiusColorUseThemeAsExpression", "defaultAccuracyRadiusTransition", "getDefaultAccuracyRadiusTransition", "defaultBearing", "getDefaultBearing", "defaultBearingAsExpression", "getDefaultBearingAsExpression", "defaultBearingImage", "getDefaultBearingImage", "defaultBearingImageAsExpression", "getDefaultBearingImageAsExpression", "defaultBearingImageSize", "getDefaultBearingImageSize", "defaultBearingImageSizeAsExpression", "getDefaultBearingImageSizeAsExpression", "defaultBearingImageSizeTransition", "getDefaultBearingImageSizeTransition", "defaultBearingTransition", "getDefaultBearingTransition", "defaultEmphasisCircleColor", "getDefaultEmphasisCircleColor", "defaultEmphasisCircleColorAsColorInt", "getDefaultEmphasisCircleColorAsColorInt", "defaultEmphasisCircleColorAsExpression", "getDefaultEmphasisCircleColorAsExpression", "defaultEmphasisCircleColorTransition", "getDefaultEmphasisCircleColorTransition", "defaultEmphasisCircleColorUseTheme", "getDefaultEmphasisCircleColorUseTheme$annotations", "getDefaultEmphasisCircleColorUseTheme", "defaultEmphasisCircleColorUseThemeAsExpression", "getDefaultEmphasisCircleColorUseThemeAsExpression$annotations", "getDefaultEmphasisCircleColorUseThemeAsExpression", "defaultEmphasisCircleGlowRange", "", "getDefaultEmphasisCircleGlowRange", "()Ljava/util/List;", "defaultEmphasisCircleGlowRangeAsExpression", "getDefaultEmphasisCircleGlowRangeAsExpression", "defaultEmphasisCircleGlowRangeTransition", "getDefaultEmphasisCircleGlowRangeTransition", "defaultEmphasisCircleRadius", "getDefaultEmphasisCircleRadius", "defaultEmphasisCircleRadiusAsExpression", "getDefaultEmphasisCircleRadiusAsExpression", "defaultEmphasisCircleRadiusTransition", "getDefaultEmphasisCircleRadiusTransition", "defaultImagePitchDisplacement", "getDefaultImagePitchDisplacement", "defaultImagePitchDisplacementAsExpression", "getDefaultImagePitchDisplacementAsExpression", "defaultLocation", "getDefaultLocation", "defaultLocationAsExpression", "getDefaultLocationAsExpression", "defaultLocationIndicatorOpacity", "getDefaultLocationIndicatorOpacity", "defaultLocationIndicatorOpacityAsExpression", "getDefaultLocationIndicatorOpacityAsExpression", "defaultLocationIndicatorOpacityTransition", "getDefaultLocationIndicatorOpacityTransition", "defaultLocationTransition", "getDefaultLocationTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultPerspectiveCompensation", "getDefaultPerspectiveCompensation", "defaultPerspectiveCompensationAsExpression", "getDefaultPerspectiveCompensationAsExpression", "defaultShadowImage", "getDefaultShadowImage", "defaultShadowImageAsExpression", "getDefaultShadowImageAsExpression", "defaultShadowImageSize", "getDefaultShadowImageSize", "defaultShadowImageSizeAsExpression", "getDefaultShadowImageSizeAsExpression", "defaultShadowImageSizeTransition", "getDefaultShadowImageSizeTransition", "defaultTopImage", "getDefaultTopImage", "defaultTopImageAsExpression", "getDefaultTopImageAsExpression", "defaultTopImageSize", "getDefaultTopImageSize", "defaultTopImageSizeAsExpression", "getDefaultTopImageSizeAsExpression", "defaultTopImageSizeTransition", "getDefaultTopImageSizeTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultAccuracyRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultAccuracyRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius");
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
            Double defaultAccuracyRadius = getDefaultAccuracyRadius();
            if (defaultAccuracyRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultAccuracyRadius.doubleValue());
        }

        @Nullable
        public final String getDefaultAccuracyRadiusBorderColor() {
            Expression defaultAccuracyRadiusBorderColorAsExpression = getDefaultAccuracyRadiusBorderColorAsExpression();
            if (defaultAccuracyRadiusBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultAccuracyRadiusBorderColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultAccuracyRadiusBorderColorAsColorInt() {
            Expression defaultAccuracyRadiusBorderColorAsExpression = getDefaultAccuracyRadiusBorderColorAsExpression();
            if (defaultAccuracyRadiusBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultAccuracyRadiusBorderColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultAccuracyRadiusBorderColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color");
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
        public final StyleTransition getDefaultAccuracyRadiusBorderColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultAccuracyRadiusBorderColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultAccuracyRadiusBorderColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-use-theme");
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
            String defaultAccuracyRadiusBorderColorUseTheme = getDefaultAccuracyRadiusBorderColorUseTheme();
            if (defaultAccuracyRadiusBorderColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultAccuracyRadiusBorderColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final String getDefaultAccuracyRadiusColor() {
            Expression defaultAccuracyRadiusColorAsExpression = getDefaultAccuracyRadiusColorAsExpression();
            if (defaultAccuracyRadiusColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultAccuracyRadiusColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultAccuracyRadiusColorAsColorInt() {
            Expression defaultAccuracyRadiusColorAsExpression = getDefaultAccuracyRadiusColorAsExpression();
            if (defaultAccuracyRadiusColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultAccuracyRadiusColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultAccuracyRadiusColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color");
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
        public final StyleTransition getDefaultAccuracyRadiusColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultAccuracyRadiusColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultAccuracyRadiusColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-use-theme");
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
            String defaultAccuracyRadiusColorUseTheme = getDefaultAccuracyRadiusColorUseTheme();
            if (defaultAccuracyRadiusColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultAccuracyRadiusColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultAccuracyRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultBearing() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultBearingAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing");
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
            Double defaultBearing = getDefaultBearing();
            if (defaultBearing == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBearing.doubleValue());
        }

        @Nullable
        public final String getDefaultBearingImage() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultBearingImageAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image");
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
            String defaultBearingImage = getDefaultBearingImage();
            if (defaultBearingImage != null) {
                return Expression.INSTANCE.literal(defaultBearingImage);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultBearingImageSize() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultBearingImageSizeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size");
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
            Double defaultBearingImageSize = getDefaultBearingImageSize();
            if (defaultBearingImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBearingImageSize.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultBearingImageSizeTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final StyleTransition getDefaultBearingTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultEmphasisCircleColor() {
            Expression defaultEmphasisCircleColorAsExpression = getDefaultEmphasisCircleColorAsExpression();
            if (defaultEmphasisCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultEmphasisCircleColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultEmphasisCircleColorAsColorInt() {
            Expression defaultEmphasisCircleColorAsExpression = getDefaultEmphasisCircleColorAsExpression();
            if (defaultEmphasisCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultEmphasisCircleColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultEmphasisCircleColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color");
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
        public final StyleTransition getDefaultEmphasisCircleColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultEmphasisCircleColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultEmphasisCircleColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-use-theme");
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
            String defaultEmphasisCircleColorUseTheme = getDefaultEmphasisCircleColorUseTheme();
            if (defaultEmphasisCircleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultEmphasisCircleColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final List<Double> getDefaultEmphasisCircleGlowRange() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultEmphasisCircleGlowRangeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range");
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
            List<Double> defaultEmphasisCircleGlowRange = getDefaultEmphasisCircleGlowRange();
            if (defaultEmphasisCircleGlowRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultEmphasisCircleGlowRange);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultEmphasisCircleGlowRangeTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultEmphasisCircleRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultEmphasisCircleRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius");
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
            Double defaultEmphasisCircleRadius = getDefaultEmphasisCircleRadius();
            if (defaultEmphasisCircleRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultEmphasisCircleRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultEmphasisCircleRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultImagePitchDisplacement() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "image-pitch-displacement");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultImagePitchDisplacementAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "image-pitch-displacement");
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
            Double defaultImagePitchDisplacement = getDefaultImagePitchDisplacement();
            if (defaultImagePitchDisplacement == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultImagePitchDisplacement.doubleValue());
        }

        @Nullable
        public final List<Double> getDefaultLocation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultLocationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location");
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
            List<Double> defaultLocation = getDefaultLocation();
            if (defaultLocation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLocation);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLocationIndicatorOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLocationIndicatorOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity");
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
            Double defaultLocationIndicatorOpacity = getDefaultLocationIndicatorOpacity();
            if (defaultLocationIndicatorOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLocationIndicatorOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLocationIndicatorOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final StyleTransition getDefaultLocationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Double getDefaultPerspectiveCompensation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "perspective-compensation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultPerspectiveCompensationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "perspective-compensation");
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
            Double defaultPerspectiveCompensation = getDefaultPerspectiveCompensation();
            if (defaultPerspectiveCompensation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultPerspectiveCompensation.doubleValue());
        }

        @Nullable
        public final String getDefaultShadowImage() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultShadowImageAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image");
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
            String defaultShadowImage = getDefaultShadowImage();
            if (defaultShadowImage != null) {
                return Expression.INSTANCE.literal(defaultShadowImage);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultShadowImageSize() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultShadowImageSizeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size");
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
            Double defaultShadowImageSize = getDefaultShadowImageSize();
            if (defaultShadowImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultShadowImageSize.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultShadowImageSizeTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultTopImage() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultTopImageAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image");
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
            String defaultTopImage = getDefaultTopImage();
            if (defaultTopImage != null) {
                return Expression.INSTANCE.literal(defaultTopImage);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultTopImageSize() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultTopImageSizeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size");
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
            Double defaultTopImageSize = getDefaultTopImageSize();
            if (defaultTopImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultTopImageSize.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultTopImageSizeTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "visibility");
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
        public static /* synthetic */ void getDefaultAccuracyRadiusBorderColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusBorderColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultEmphasisCircleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultEmphasisCircleColorUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(@NotNull Expression accuracyRadiusBorderColorUseTheme) {
        RecordTag.m(accuracyRadiusBorderColorUseTheme, "accuracy-radius-border-color-use-theme", accuracyRadiusBorderColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColorUseTheme(@NotNull Expression accuracyRadiusColorUseTheme) {
        RecordTag.m(accuracyRadiusColorUseTheme, "accuracy-radius-color-use-theme", accuracyRadiusColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImage(@NotNull Expression bearingImage) {
        RecordTag.m(bearingImage, "bearing-image", bearingImage, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    @NotNull
    public LocationIndicatorLayer emphasisCircleColorUseTheme(@NotNull Expression emphasisCircleColorUseTheme) {
        RecordTag.m(emphasisCircleColorUseTheme, "emphasis-circle-color-use-theme", emphasisCircleColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleGlowRange(@NotNull Expression emphasisCircleGlowRange) {
        RecordTag.m(emphasisCircleGlowRange, "emphasis-circle-glow-range", emphasisCircleGlowRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer location(@NotNull Expression location) {
        RecordTag.m(location, "location", location, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImage(@NotNull Expression shadowImage) {
        RecordTag.m(shadowImage, "shadow-image", shadowImage, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImage(@NotNull Expression topImage) {
        RecordTag.m(topImage, "top-image", topImage, this);
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusBorderColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmphasisCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmphasisCircleColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadius(@NotNull Expression accuracyRadius) {
        RecordTag.m(accuracyRadius, "accuracy-radius", accuracyRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearing(@NotNull Expression bearing) {
        RecordTag.m(bearing, "bearing", bearing, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImageSize(@NotNull Expression bearingImageSize) {
        RecordTag.m(bearingImageSize, "bearing-image-size", bearingImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleRadius(@NotNull Expression emphasisCircleRadius) {
        RecordTag.m(emphasisCircleRadius, "emphasis-circle-radius", emphasisCircleRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer imagePitchDisplacement(@NotNull Expression imagePitchDisplacement) {
        RecordTag.m(imagePitchDisplacement, "image-pitch-displacement", imagePitchDisplacement, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationIndicatorOpacity(@NotNull Expression locationIndicatorOpacity) {
        RecordTag.m(locationIndicatorOpacity, "location-indicator-opacity", locationIndicatorOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer perspectiveCompensation(@NotNull Expression perspectiveCompensation) {
        RecordTag.m(perspectiveCompensation, "perspective-compensation", perspectiveCompensation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImageSize(@NotNull Expression shadowImageSize) {
        RecordTag.m(shadowImageSize, "shadow-image-size", shadowImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImageSize(@NotNull Expression topImageSize) {
        RecordTag.m(topImageSize, "top-image-size", topImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LocationIndicatorLayer visibility(@NotNull Expression visibility) {
        RecordTag.m(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColor(@NotNull Expression accuracyRadiusBorderColor) {
        RecordTag.m(accuracyRadiusBorderColor, "accuracy-radius-border-color", accuracyRadiusBorderColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColor(@NotNull Expression accuracyRadiusColor) {
        RecordTag.m(accuracyRadiusColor, "accuracy-radius-color", accuracyRadiusColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleColor(@NotNull Expression emphasisCircleColor) {
        RecordTag.m(emphasisCircleColor, "emphasis-circle-color", emphasisCircleColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColor(@NotNull String accuracyRadiusBorderColor) {
        accuracyRadiusBorderColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color", accuracyRadiusBorderColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusBorderColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColor(@NotNull String accuracyRadiusColor) {
        accuracyRadiusColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color", accuracyRadiusColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer accuracyRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingImageSizeTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-image-size-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer bearingTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleColor(@NotNull String emphasisCircleColor) {
        emphasisCircleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color", emphasisCircleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleGlowRangeTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-glow-range-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer emphasisCircleRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationIndicatorOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("location-indicator-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer locationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("location-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer shadowImageSizeTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-image-size-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @NotNull
    public LocationIndicatorLayer topImageSizeTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("top-image-size-transition", options));
        return this;
    }
}
