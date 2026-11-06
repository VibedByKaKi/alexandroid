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
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.LineTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.LineWidthUnit;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationOptions;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u008c\u00022\u00020\u00012\u00020\u0002:\u0002\u008c\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000f\u0010\u0084\u0002\u001a\u00020\u0004H\u0010¢\u0006\u0003\b\u0085\u0002J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0011\u0010\u0013\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010\u0013\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0012\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u001aH\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0011\u0010\u001f\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010\u001f\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bH\u0017J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004H\u0017J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\bH\u0017J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\bH\u0017J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004H\u0017J\u0010\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000eH\u0016J\u0011\u00105\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u00105\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\bH\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\bH\u0016J\u0012\u0010=\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020\u001aH\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0004H\u0016J\u0011\u0010C\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010C\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\bH\u0017J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0004H\u0017J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\bH\u0017J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u000eH\u0017J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\bH\u0017J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000eH\u0017J\u0011\u0010W\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0017J&\u0010W\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0017J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\bH\u0017J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u000eH\u0017J\u0011\u0010`\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0017J&\u0010`\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0017J\u0010\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\bH\u0016J\u0016\u0010c\u001a\u00020\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000e0dH\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\bH\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0011\u0010m\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010m\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\bH\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u000eH\u0016J\u0011\u0010s\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010s\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0010\u0010u\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\bH\u0016J\u0010\u0010u\u001a\u00020\u00002\u0006\u0010u\u001a\u00020vH\u0016J\u0010\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\bH\u0016J\u0010\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u000eH\u0016J\u0011\u0010\u007f\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J&\u0010\u007f\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010\u0085\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\bH\u0017J\u0012\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u0004H\u0017J\u0012\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020\bH\u0016J\u0013\u0010\u008f\u0001\u001a\u00020\u00002\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0016J\u0012\u0010\u0095\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u0095\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010\u009d\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u009f\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u009f\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010£\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010£\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010¥\u0001\u001a\u00020\u00002\u0007\u0010¥\u0001\u001a\u00020\bH\u0016J\u0012\u0010¥\u0001\u001a\u00020\u00002\u0007\u0010¥\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010©\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010©\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010«\u0001\u001a\u00020\u00002\u0007\u0010«\u0001\u001a\u00020\bH\u0016J\u0012\u0010«\u0001\u001a\u00020\u00002\u0007\u0010«\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010¯\u0001\u001a\u00020\bH\u0016J\u0012\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010¯\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010³\u0001\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020\bH\u0016J\u0012\u0010³\u0001\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010·\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020\bH\u0016J\u0012\u0010·\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010»\u0001\u001a\u00020\u00002\u0007\u0010»\u0001\u001a\u00020\bH\u0016J\u0018\u0010»\u0001\u001a\u00020\u00002\r\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0dH\u0016J\u0012\u0010½\u0001\u001a\u00020\u00002\u0007\u0010½\u0001\u001a\u00020\bH\u0016J\u0013\u0010½\u0001\u001a\u00020\u00002\b\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0012\u0010Å\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010Å\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010Ç\u0001\u001a\u00020\u00002\u0007\u0010Ç\u0001\u001a\u00020\bH\u0017J\u0014\u0010Ç\u0001\u001a\u00020\u00002\t\b\u0001\u0010Ç\u0001\u001a\u00020\u001aH\u0017J\u0012\u0010Ç\u0001\u001a\u00020\u00002\u0007\u0010Ç\u0001\u001a\u00020\u0004H\u0017J\u0012\u0010Ð\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0017J'\u0010Ð\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0017J\u0012\u0010Ó\u0001\u001a\u00020\u00002\u0007\u0010Ó\u0001\u001a\u00020\bH\u0017J\u0012\u0010Ó\u0001\u001a\u00020\u00002\u0007\u0010Ó\u0001\u001a\u00020\u0004H\u0017J\u0012\u0010Ù\u0001\u001a\u00020\u00002\u0007\u0010Ù\u0001\u001a\u00020\bH\u0017J\u0018\u0010Ù\u0001\u001a\u00020\u00002\r\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0dH\u0017J\u0012\u0010ß\u0001\u001a\u00020\u00002\u0007\u0010ß\u0001\u001a\u00020\bH\u0016J\u0018\u0010ß\u0001\u001a\u00020\u00002\r\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0dH\u0016J\u0012\u0010ã\u0001\u001a\u00020\u00002\u0007\u0010ã\u0001\u001a\u00020\bH\u0016J\u0012\u0010ã\u0001\u001a\u00020\u00002\u0007\u0010ã\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010ç\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0002\u001a\u00020\u0014H\u0016J'\u0010ç\u0001\u001a\u00020\u00002\u001c\u0010\u0087\u0002\u001a\u0017\u0012\u0005\u0012\u00030\u0089\u0002\u0012\u0005\u0012\u00030\u008a\u00020\u0088\u0002¢\u0006\u0003\b\u008b\u0002H\u0016J\u0012\u0010é\u0001\u001a\u00020\u00002\u0007\u0010é\u0001\u001a\u00020\bH\u0017J\u0013\u0010é\u0001\u001a\u00020\u00002\b\u0010é\u0001\u001a\u00030ê\u0001H\u0017J\u0012\u0010ñ\u0001\u001a\u00020\u00002\u0007\u0010ñ\u0001\u001a\u00020\bH\u0016J\u0012\u0010ñ\u0001\u001a\u00020\u00002\u0007\u0010ñ\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010õ\u0001\u001a\u00020\u00002\u0007\u0010õ\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010÷\u0001\u001a\u00020\u00002\u0007\u0010÷\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010ù\u0001\u001a\u00020\u00002\u0007\u0010ù\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010ü\u0001\u001a\u00020\u00002\u0007\u0010ü\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010þ\u0001\u001a\u00020\u00002\u0007\u0010þ\u0001\u001a\u00020\bH\u0016J\u0013\u0010þ\u0001\u001a\u00020\u00002\b\u0010þ\u0001\u001a\u00030ÿ\u0001H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010%\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010#\u001a\u0004\b'\u0010\nR\u001c\u0010(\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010#\u001a\u0004\b*\u0010\nR\u001c\u0010+\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010#\u001a\u0004\b-\u0010\fR\u001c\u0010.\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010#\u001a\u0004\b0\u0010\nR\u0013\u00101\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u0013\u00103\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\nR\u0013\u00105\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010;\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b<\u0010\nR\u0013\u0010=\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010\fR\u0013\u0010?\u001a\u0004\u0018\u00010\u001a8G¢\u0006\u0006\u001a\u0004\b@\u0010\u001cR\u0013\u0010A\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bB\u0010\nR\u0013\u0010C\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bD\u0010\u0016R\u001c\u0010E\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010#\u001a\u0004\bG\u0010\fR\u001c\u0010H\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010#\u001a\u0004\bJ\u0010\nR\u001c\u0010K\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010#\u001a\u0004\bM\u0010\u0010R\u001c\u0010N\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010#\u001a\u0004\bP\u0010\nR\u001c\u0010Q\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010#\u001a\u0004\bS\u0010\u0010R\u001c\u0010T\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010#\u001a\u0004\bV\u0010\nR\u001c\u0010W\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010#\u001a\u0004\bY\u0010\u0016R\u001c\u0010Z\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010#\u001a\u0004\b\\\u0010\u0010R\u001c\u0010]\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010#\u001a\u0004\b_\u0010\nR\u001c\u0010`\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010#\u001a\u0004\bb\u0010\u0016R\u0019\u0010c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010g\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bh\u0010\nR\u0013\u0010i\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bj\u0010\u0010R\u0013\u0010k\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bl\u0010\nR\u0013\u0010m\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bn\u0010\u0016R\u0013\u0010o\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bp\u0010\u0010R\u0013\u0010q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\br\u0010\nR\u0013\u0010s\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bt\u0010\u0016R\u0013\u0010u\u001a\u0004\u0018\u00010v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010y\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bz\u0010\nR\u0013\u0010{\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b|\u0010\u0010R\u0013\u0010}\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b~\u0010\nR\u0014\u0010\u007f\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0016R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0010R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\nR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0016R\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\nR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008a\u0001\u0010#\u001a\u0005\b\u008b\u0001\u0010\fR\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008d\u0001\u0010#\u001a\u0005\b\u008e\u0001\u0010\nR\u0017\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\nR\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u0010R\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\nR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u0010R\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\nR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0016R\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0010R\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\nR\u0015\u0010£\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0016R\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0010R\u0015\u0010§\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\nR\u0015\u0010©\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0016R\u0015\u0010«\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\fR\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\nR\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\u0010R\u0015\u0010±\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\nR\u0015\u0010³\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0010R\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\nR\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0010R\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\nR\u001b\u0010»\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010fR\u0017\u0010½\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0015\u0010Á\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\nR\u0015\u0010Ã\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\nR\u0015\u0010Å\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0016R\u001f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÈ\u0001\u0010#\u001a\u0005\bÉ\u0001\u0010\fR\u001f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001a8GX\u0087\u0004¢\u0006\u000e\u0012\u0005\bË\u0001\u0010#\u001a\u0005\bÌ\u0001\u0010\u001cR\u001f\u0010Í\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÎ\u0001\u0010#\u001a\u0005\bÏ\u0001\u0010\nR\u001f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00148FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÑ\u0001\u0010#\u001a\u0005\bÒ\u0001\u0010\u0016R\u001f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÔ\u0001\u0010#\u001a\u0005\bÕ\u0001\u0010\fR\u001f\u0010Ö\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b×\u0001\u0010#\u001a\u0005\bØ\u0001\u0010\nR%\u0010Ù\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010d8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÚ\u0001\u0010#\u001a\u0005\bÛ\u0001\u0010fR\u001f\u0010Ü\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÝ\u0001\u0010#\u001a\u0005\bÞ\u0001\u0010\nR\u001b\u0010ß\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010fR\u0015\u0010á\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010\nR\u0015\u0010ã\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u0010R\u0015\u0010å\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\nR\u0015\u0010ç\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\u0016R!\u0010é\u0001\u001a\u0005\u0018\u00010ê\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bë\u0001\u0010#\u001a\u0006\bì\u0001\u0010í\u0001R\u001f\u0010î\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bï\u0001\u0010#\u001a\u0005\bð\u0001\u0010\nR\u0015\u0010ñ\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bò\u0001\u0010\u0010R\u0015\u0010ó\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bô\u0001\u0010\nR\u0018\u0010õ\u0001\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bö\u0001\u0010\u0010R\u0018\u0010÷\u0001\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010\u0010R\u0018\u0010ù\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bú\u0001\u0010\fR\u0012\u0010\u0005\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bû\u0001\u0010\fR\u0015\u0010ü\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bý\u0001\u0010\fR\u001a\u0010þ\u0001\u001a\u0005\u0018\u00010ÿ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0018\u0010\u0082\u0002\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010\n¨\u0006\u008d\u0002"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/LineLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "filter", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getLayerId", "()Ljava/lang/String;", "lineBlur", "", "getLineBlur", "()Ljava/lang/Double;", "lineBlurAsExpression", "getLineBlurAsExpression", "lineBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getLineBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "lineBorderColor", "getLineBorderColor", "lineBorderColorAsColorInt", "", "getLineBorderColorAsColorInt", "()Ljava/lang/Integer;", "lineBorderColorAsExpression", "getLineBorderColorAsExpression", "lineBorderColorTransition", "getLineBorderColorTransition", "lineBorderColorUseTheme", "getLineBorderColorUseTheme$annotations", "()V", "getLineBorderColorUseTheme", "lineBorderColorUseThemeAsExpression", "getLineBorderColorUseThemeAsExpression$annotations", "getLineBorderColorUseThemeAsExpression", "lineBorderGradient", "getLineBorderGradient$annotations", "getLineBorderGradient", "lineBorderGradientUseTheme", "getLineBorderGradientUseTheme$annotations", "getLineBorderGradientUseTheme", "lineBorderGradientUseThemeAsExpression", "getLineBorderGradientUseThemeAsExpression$annotations", "getLineBorderGradientUseThemeAsExpression", "lineBorderWidth", "getLineBorderWidth", "lineBorderWidthAsExpression", "getLineBorderWidthAsExpression", "lineBorderWidthTransition", "getLineBorderWidthTransition", "lineCap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "getLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "lineCapAsExpression", "getLineCapAsExpression", "lineColor", "getLineColor", "lineColorAsColorInt", "getLineColorAsColorInt", "lineColorAsExpression", "getLineColorAsExpression", "lineColorTransition", "getLineColorTransition", "lineColorUseTheme", "getLineColorUseTheme$annotations", "getLineColorUseTheme", "lineColorUseThemeAsExpression", "getLineColorUseThemeAsExpression$annotations", "getLineColorUseThemeAsExpression", "lineCrossSlope", "getLineCrossSlope$annotations", "getLineCrossSlope", "lineCrossSlopeAsExpression", "getLineCrossSlopeAsExpression$annotations", "getLineCrossSlopeAsExpression", "lineCutoutFadeWidth", "getLineCutoutFadeWidth$annotations", "getLineCutoutFadeWidth", "lineCutoutFadeWidthAsExpression", "getLineCutoutFadeWidthAsExpression$annotations", "getLineCutoutFadeWidthAsExpression", "lineCutoutFadeWidthTransition", "getLineCutoutFadeWidthTransition$annotations", "getLineCutoutFadeWidthTransition", "lineCutoutOpacity", "getLineCutoutOpacity$annotations", "getLineCutoutOpacity", "lineCutoutOpacityAsExpression", "getLineCutoutOpacityAsExpression$annotations", "getLineCutoutOpacityAsExpression", "lineCutoutOpacityTransition", "getLineCutoutOpacityTransition$annotations", "getLineCutoutOpacityTransition", "lineDasharray", "", "getLineDasharray", "()Ljava/util/List;", "lineDasharrayAsExpression", "getLineDasharrayAsExpression", "lineDepthOcclusionFactor", "getLineDepthOcclusionFactor", "lineDepthOcclusionFactorAsExpression", "getLineDepthOcclusionFactorAsExpression", "lineDepthOcclusionFactorTransition", "getLineDepthOcclusionFactorTransition", "lineElevationGroundScale", "getLineElevationGroundScale", "lineElevationGroundScaleAsExpression", "getLineElevationGroundScaleAsExpression", "lineElevationGroundScaleTransition", "getLineElevationGroundScaleTransition", "lineElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "getLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "lineElevationReferenceAsExpression", "getLineElevationReferenceAsExpression", "lineEmissiveStrength", "getLineEmissiveStrength", "lineEmissiveStrengthAsExpression", "getLineEmissiveStrengthAsExpression", "lineEmissiveStrengthTransition", "getLineEmissiveStrengthTransition", "lineGapWidth", "getLineGapWidth", "lineGapWidthAsExpression", "getLineGapWidthAsExpression", "lineGapWidthTransition", "getLineGapWidthTransition", "lineGradient", "getLineGradient", "lineGradientUseTheme", "getLineGradientUseTheme$annotations", "getLineGradientUseTheme", "lineGradientUseThemeAsExpression", "getLineGradientUseThemeAsExpression$annotations", "getLineGradientUseThemeAsExpression", "lineJoin", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoinAsExpression", "getLineJoinAsExpression", "lineMiterLimit", "getLineMiterLimit", "lineMiterLimitAsExpression", "getLineMiterLimitAsExpression", "lineOcclusionOpacity", "getLineOcclusionOpacity", "lineOcclusionOpacityAsExpression", "getLineOcclusionOpacityAsExpression", "lineOcclusionOpacityTransition", "getLineOcclusionOpacityTransition", "lineOffset", "getLineOffset", "lineOffsetAsExpression", "getLineOffsetAsExpression", "lineOffsetTransition", "getLineOffsetTransition", "lineOpacity", "getLineOpacity", "lineOpacityAsExpression", "getLineOpacityAsExpression", "lineOpacityTransition", "getLineOpacityTransition", "linePattern", "getLinePattern", "linePatternAsExpression", "getLinePatternAsExpression", "linePatternCrossFade", "getLinePatternCrossFade", "linePatternCrossFadeAsExpression", "getLinePatternCrossFadeAsExpression", "lineRoundLimit", "getLineRoundLimit", "lineRoundLimitAsExpression", "getLineRoundLimitAsExpression", "lineSortKey", "getLineSortKey", "lineSortKeyAsExpression", "getLineSortKeyAsExpression", "lineTranslate", "getLineTranslate", "lineTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "getLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "lineTranslateAnchorAsExpression", "getLineTranslateAnchorAsExpression", "lineTranslateAsExpression", "getLineTranslateAsExpression", "lineTranslateTransition", "getLineTranslateTransition", "lineTrimColor", "getLineTrimColor$annotations", "getLineTrimColor", "lineTrimColorAsColorInt", "getLineTrimColorAsColorInt$annotations", "getLineTrimColorAsColorInt", "lineTrimColorAsExpression", "getLineTrimColorAsExpression$annotations", "getLineTrimColorAsExpression", "lineTrimColorTransition", "getLineTrimColorTransition$annotations", "getLineTrimColorTransition", "lineTrimColorUseTheme", "getLineTrimColorUseTheme$annotations", "getLineTrimColorUseTheme", "lineTrimColorUseThemeAsExpression", "getLineTrimColorUseThemeAsExpression$annotations", "getLineTrimColorUseThemeAsExpression", "lineTrimFadeRange", "getLineTrimFadeRange$annotations", "getLineTrimFadeRange", "lineTrimFadeRangeAsExpression", "getLineTrimFadeRangeAsExpression$annotations", "getLineTrimFadeRangeAsExpression", "lineTrimOffset", "getLineTrimOffset", "lineTrimOffsetAsExpression", "getLineTrimOffsetAsExpression", "lineWidth", "getLineWidth", "lineWidthAsExpression", "getLineWidthAsExpression", "lineWidthTransition", "getLineWidthTransition", "lineWidthUnit", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "getLineWidthUnit$annotations", "getLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "lineWidthUnitAsExpression", "getLineWidthUnitAsExpression$annotations", "getLineWidthUnitAsExpression", "lineZOffset", "getLineZOffset", "lineZOffsetAsExpression", "getLineZOffsetAsExpression", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class LineLayer extends Layer implements LineLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public LineLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer filter(@NotNull Expression filter) {
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

    @Nullable
    public final Double getLineBlur() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, Double.class);
    }

    @Nullable
    public final Expression getLineBlurAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
    }

    @Nullable
    public final StyleTransition getLineBlurTransition() {
        return (StyleTransition) getPropertyValueWithType("line-blur-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLineBorderColor() {
        Expression lineBorderColorAsExpression = getLineBorderColorAsExpression();
        if (lineBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineBorderColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getLineBorderColorAsColorInt() {
        Expression lineBorderColorAsExpression = getLineBorderColorAsExpression();
        if (lineBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineBorderColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getLineBorderColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getLineBorderColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-border-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLineBorderColorUseTheme() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getLineBorderColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
    }

    @Nullable
    public final Expression getLineBorderGradient() {
        return (Expression) getPropertyValueWithType("line-border-gradient", Expression.class);
    }

    @Nullable
    public final String getLineBorderGradientUseTheme() {
        return (String) getPropertyValueWithType("line-border-gradient-use-theme", String.class);
    }

    @Nullable
    public final Expression getLineBorderGradientUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-border-gradient-use-theme");
    }

    @Nullable
    public final Double getLineBorderWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, Double.class);
    }

    @Nullable
    public final Expression getLineBorderWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
    }

    @Nullable
    public final StyleTransition getLineBorderWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-border-width-transition", StyleTransition.class);
    }

    @Nullable
    public final LineCap getLineCap() {
        String str = (String) getPropertyValueWithType("line-cap", String.class);
        if (str == null) {
            return null;
        }
        LineCap.Companion companion = LineCap.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getLineCapAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-cap", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineCap lineCap = getLineCap();
        if (lineCap != null) {
            return Expression.INSTANCE.literal(lineCap.getValue());
        }
        return null;
    }

    @Nullable
    public final String getLineColor() {
        Expression lineColorAsExpression = getLineColorAsExpression();
        if (lineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getLineColorAsColorInt() {
        Expression lineColorAsExpression = getLineColorAsExpression();
        if (lineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getLineColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, Expression.class);
    }

    @Nullable
    public final StyleTransition getLineColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLineColorUseTheme() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, String.class);
    }

    @Nullable
    public final Expression getLineColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
    }

    @Nullable
    public final Double getLineCrossSlope() {
        return (Double) getPropertyValueWithType("line-cross-slope", Double.class);
    }

    @Nullable
    public final Expression getLineCrossSlopeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-cross-slope");
    }

    @Nullable
    public final Double getLineCutoutFadeWidth() {
        return (Double) getPropertyValueWithType("line-cutout-fade-width", Double.class);
    }

    @Nullable
    public final Expression getLineCutoutFadeWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-cutout-fade-width");
    }

    @Nullable
    public final StyleTransition getLineCutoutFadeWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-cutout-fade-width-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getLineCutoutOpacity() {
        return (Double) getPropertyValueWithType("line-cutout-opacity", Double.class);
    }

    @Nullable
    public final Expression getLineCutoutOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-cutout-opacity");
    }

    @Nullable
    public final StyleTransition getLineCutoutOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("line-cutout-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final List<Double> getLineDasharray() {
        return (List) getPropertyValueWithType("line-dasharray", List.class);
    }

    @Nullable
    public final Expression getLineDasharrayAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-dasharray");
    }

    @Nullable
    public final Double getLineDepthOcclusionFactor() {
        return (Double) getPropertyValueWithType("line-depth-occlusion-factor", Double.class);
    }

    @Nullable
    public final Expression getLineDepthOcclusionFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-depth-occlusion-factor");
    }

    @Nullable
    public final StyleTransition getLineDepthOcclusionFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-depth-occlusion-factor-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getLineElevationGroundScale() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE, Double.class);
    }

    @Nullable
    public final Expression getLineElevationGroundScaleAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
    }

    @Nullable
    public final StyleTransition getLineElevationGroundScaleTransition() {
        return (StyleTransition) getPropertyValueWithType("line-elevation-ground-scale-transition", StyleTransition.class);
    }

    @Nullable
    public final LineElevationReference getLineElevationReference() {
        String str = (String) getPropertyValueWithType("line-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        LineElevationReference.Companion companion = LineElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getLineElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineElevationReference lineElevationReference = getLineElevationReference();
        if (lineElevationReference != null) {
            return Expression.INSTANCE.literal(lineElevationReference.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getLineEmissiveStrength() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH, Double.class);
    }

    @Nullable
    public final Expression getLineEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
    }

    @Nullable
    public final StyleTransition getLineEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getLineGapWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, Double.class);
    }

    @Nullable
    public final Expression getLineGapWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
    }

    @Nullable
    public final StyleTransition getLineGapWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-gap-width-transition", StyleTransition.class);
    }

    @Nullable
    public final Expression getLineGradient() {
        return (Expression) getPropertyValueWithType("line-gradient", Expression.class);
    }

    @Nullable
    public final String getLineGradientUseTheme() {
        return (String) getPropertyValueWithType("line-gradient-use-theme", String.class);
    }

    @Nullable
    public final Expression getLineGradientUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-gradient-use-theme");
    }

    @Nullable
    public final LineJoin getLineJoin() {
        String str = (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, String.class);
        if (str == null) {
            return null;
        }
        LineJoin.Companion companion = LineJoin.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getLineJoinAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, Expression.class);
        if (expression != null) {
            return expression;
        }
        LineJoin lineJoin = getLineJoin();
        if (lineJoin != null) {
            return Expression.INSTANCE.literal(lineJoin.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getLineMiterLimit() {
        return (Double) getPropertyValueWithType("line-miter-limit", Double.class);
    }

    @Nullable
    public final Expression getLineMiterLimitAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-miter-limit");
    }

    @Nullable
    public final Double getLineOcclusionOpacity() {
        return (Double) getPropertyValueWithType("line-occlusion-opacity", Double.class);
    }

    @Nullable
    public final Expression getLineOcclusionOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-occlusion-opacity");
    }

    @Nullable
    public final StyleTransition getLineOcclusionOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("line-occlusion-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getLineOffset() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, Double.class);
    }

    @Nullable
    public final Expression getLineOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
    }

    @Nullable
    public final StyleTransition getLineOffsetTransition() {
        return (StyleTransition) getPropertyValueWithType("line-offset-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getLineOpacity() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, Double.class);
    }

    @Nullable
    public final Expression getLineOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
    }

    @Nullable
    public final StyleTransition getLineOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("line-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLinePattern() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, String.class);
    }

    @Nullable
    public final Expression getLinePatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
    }

    @Nullable
    public final Double getLinePatternCrossFade() {
        return (Double) getPropertyValueWithType("line-pattern-cross-fade", Double.class);
    }

    @Nullable
    public final Expression getLinePatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-pattern-cross-fade");
    }

    @Nullable
    public final Double getLineRoundLimit() {
        return (Double) getPropertyValueWithType("line-round-limit", Double.class);
    }

    @Nullable
    public final Expression getLineRoundLimitAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-round-limit");
    }

    @Nullable
    public final Double getLineSortKey() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, Double.class);
    }

    @Nullable
    public final Expression getLineSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
    }

    @Nullable
    public final List<Double> getLineTranslate() {
        return (List) getPropertyValueWithType("line-translate", List.class);
    }

    @Nullable
    public final LineTranslateAnchor getLineTranslateAnchor() {
        String str = (String) getPropertyValueWithType("line-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        LineTranslateAnchor.Companion companion = LineTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getLineTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineTranslateAnchor lineTranslateAnchor = getLineTranslateAnchor();
        if (lineTranslateAnchor != null) {
            return Expression.INSTANCE.literal(lineTranslateAnchor.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getLineTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-translate");
    }

    @Nullable
    public final StyleTransition getLineTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("line-translate-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLineTrimColor() {
        Expression lineTrimColorAsExpression = getLineTrimColorAsExpression();
        if (lineTrimColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineTrimColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getLineTrimColorAsColorInt() {
        Expression lineTrimColorAsExpression = getLineTrimColorAsExpression();
        if (lineTrimColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineTrimColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getLineTrimColorAsExpression() {
        return (Expression) getPropertyValueWithType("line-trim-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getLineTrimColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-trim-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getLineTrimColorUseTheme() {
        return (String) getPropertyValueWithType("line-trim-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getLineTrimColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-color-use-theme");
    }

    @Nullable
    public final List<Double> getLineTrimFadeRange() {
        return (List) getPropertyValueWithType("line-trim-fade-range", List.class);
    }

    @Nullable
    public final Expression getLineTrimFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-fade-range");
    }

    @Nullable
    public final List<Double> getLineTrimOffset() {
        return (List) getPropertyValueWithType("line-trim-offset", List.class);
    }

    @Nullable
    public final Expression getLineTrimOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-offset");
    }

    @Nullable
    public final Double getLineWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, Double.class);
    }

    @Nullable
    public final Expression getLineWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
    }

    @Nullable
    public final StyleTransition getLineWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-width-transition", StyleTransition.class);
    }

    @Nullable
    public final LineWidthUnit getLineWidthUnit() {
        String str = (String) getPropertyValueWithType("line-width-unit", String.class);
        if (str == null) {
            return null;
        }
        LineWidthUnit.Companion companion = LineWidthUnit.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getLineWidthUnitAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-width-unit", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineWidthUnit lineWidthUnit = getLineWidthUnit();
        if (lineWidthUnit != null) {
            return Expression.INSTANCE.literal(lineWidthUnit.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getLineZOffset() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, Double.class);
    }

    @Nullable
    public final Expression getLineZOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
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
        return "line";
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

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBlur(double lineBlur) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, Double.valueOf(lineBlur)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBlurTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBlurTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderColor(@ColorInt int lineBorderColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(lineBorderColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBorderColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineBorderColorUseTheme(@NotNull String lineBorderColorUseTheme) {
        lineBorderColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, lineBorderColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineBorderGradient(@NotNull Expression lineBorderGradient) {
        RecordTag.m(lineBorderGradient, "line-border-gradient", lineBorderGradient, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineBorderGradientUseTheme(@NotNull String lineBorderGradientUseTheme) {
        lineBorderGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-border-gradient-use-theme", lineBorderGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderWidth(double lineBorderWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, Double.valueOf(lineBorderWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBorderWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineCap(@NotNull LineCap lineCap) {
        lineCap.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-cap", lineCap));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineColor(@ColorInt int lineColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(lineColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineColorUseTheme(@NotNull String lineColorUseTheme) {
        lineColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, lineColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCrossSlope(double lineCrossSlope) {
        setProperty$extension_style_release(new PropertyValue<>("line-cross-slope", Double.valueOf(lineCrossSlope)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutFadeWidth(double lineCutoutFadeWidth) {
        setProperty$extension_style_release(new PropertyValue<>("line-cutout-fade-width", Double.valueOf(lineCutoutFadeWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutFadeWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineCutoutFadeWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutOpacity(double lineCutoutOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("line-cutout-opacity", Double.valueOf(lineCutoutOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineCutoutOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDasharray(@NotNull List<Double> lineDasharray) {
        lineDasharray.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-dasharray", lineDasharray));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDepthOcclusionFactor(double lineDepthOcclusionFactor) {
        setProperty$extension_style_release(new PropertyValue<>("line-depth-occlusion-factor", Double.valueOf(lineDepthOcclusionFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDepthOcclusionFactorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineDepthOcclusionFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationGroundScale(double lineElevationGroundScale) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE, Double.valueOf(lineElevationGroundScale)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationGroundScaleTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineElevationGroundScaleTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationReference(@NotNull LineElevationReference lineElevationReference) {
        lineElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-elevation-reference", lineElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineEmissiveStrength(double lineEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH, Double.valueOf(lineEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineGapWidth(double lineGapWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, Double.valueOf(lineGapWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineGapWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineGapWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineGradient(@NotNull Expression lineGradient) {
        RecordTag.m(lineGradient, "line-gradient", lineGradient, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineGradientUseTheme(@NotNull String lineGradientUseTheme) {
        lineGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-gradient-use-theme", lineGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineJoin(@NotNull LineJoin lineJoin) {
        lineJoin.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineMiterLimit(double lineMiterLimit) {
        setProperty$extension_style_release(new PropertyValue<>("line-miter-limit", Double.valueOf(lineMiterLimit)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOcclusionOpacity(double lineOcclusionOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("line-occlusion-opacity", Double.valueOf(lineOcclusionOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOcclusionOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOcclusionOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOffset(double lineOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, Double.valueOf(lineOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOffsetTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOffsetTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOpacity(double lineOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, Double.valueOf(lineOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer linePattern(@NotNull String linePattern) {
        linePattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, linePattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer linePatternCrossFade(double linePatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("line-pattern-cross-fade", Double.valueOf(linePatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineRoundLimit(double lineRoundLimit) {
        setProperty$extension_style_release(new PropertyValue<>("line-round-limit", Double.valueOf(lineRoundLimit)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineSortKey(double lineSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, Double.valueOf(lineSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslate(@NotNull List<Double> lineTranslate) {
        lineTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate", lineTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslateAnchor(@NotNull LineTranslateAnchor lineTranslateAnchor) {
        lineTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate-anchor", lineTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslateTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColor(@ColorInt int lineTrimColor) {
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(lineTrimColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineTrimColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColorUseTheme(@NotNull String lineTrimColorUseTheme) {
        lineTrimColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color-use-theme", lineTrimColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimFadeRange(@NotNull List<Double> lineTrimFadeRange) {
        lineTrimFadeRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-fade-range", lineTrimFadeRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTrimOffset(@NotNull List<Double> lineTrimOffset) {
        lineTrimOffset.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-offset", lineTrimOffset));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineWidth(double lineWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, Double.valueOf(lineWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineWidthUnit(@NotNull LineWidthUnit lineWidthUnit) {
        lineWidthUnit.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-width-unit", lineWidthUnit));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineZOffset(double lineZOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, Double.valueOf(lineZOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LineLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LineLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LineLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LineLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0012R\u001c\u0010$\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\nR\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\nR\u0013\u0010+\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010\u0012R\u0013\u00105\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0013\u00107\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\nR\u0013\u00109\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0012R\u001c\u0010>\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\nR\u001c\u0010A\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0006R\u001c\u0010D\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\nR\u001c\u0010G\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0006R\u001c\u0010J\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\nR\u001c\u0010M\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u000eR\u001c\u0010P\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0006R\u001c\u0010S\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\nR\u001c\u0010V\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u000eR\u0019\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0013\u0010_\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bd\u0010\u000eR\u0013\u0010e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bf\u0010\u0006R\u0013\u0010g\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bh\u0010\nR\u0013\u0010i\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bj\u0010\u000eR\u0013\u0010k\u001a\u0004\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\br\u0010\u0006R\u0013\u0010s\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bt\u0010\nR\u0013\u0010u\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bv\u0010\u000eR\u0013\u0010w\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0013\u0010y\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bz\u0010\nR\u0013\u0010{\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b|\u0010\u000eR\u001c\u0010}\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010\u0002\u001a\u0004\b\u007f\u0010\u0012R\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010\u0002\u001a\u0005\b\u0082\u0001\u0010\nR\u0017\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\nR\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0006R\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\nR\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0006R\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\nR\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u000eR\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u0006R\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\nR\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u000eR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u0006R\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\nR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u000eR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0012R\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\nR\u0015\u0010£\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0006R\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\nR\u0015\u0010§\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0006R\u0015\u0010©\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\nR\u0015\u0010«\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0006R\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\nR\u001b\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010Z8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\\R\u0017\u0010±\u0001\u001a\u0005\u0018\u00010²\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\nR\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\nR\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u000eR\u001f\u0010»\u0001\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¼\u0001\u0010\u0002\u001a\u0005\b½\u0001\u0010\u0012R\u001f\u0010¾\u0001\u001a\u0004\u0018\u00010\u00148GX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¿\u0001\u0010\u0002\u001a\u0005\bÀ\u0001\u0010\u0016R\u001f\u0010Á\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÂ\u0001\u0010\u0002\u001a\u0005\bÃ\u0001\u0010\nR\u001f\u0010Ä\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÅ\u0001\u0010\u0002\u001a\u0005\bÆ\u0001\u0010\u000eR\u001f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÈ\u0001\u0010\u0002\u001a\u0005\bÉ\u0001\u0010\u0012R\u001f\u0010Ê\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bË\u0001\u0010\u0002\u001a\u0005\bÌ\u0001\u0010\nR%\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010Z8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÎ\u0001\u0010\u0002\u001a\u0005\bÏ\u0001\u0010\\R\u001f\u0010Ð\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÑ\u0001\u0010\u0002\u001a\u0005\bÒ\u0001\u0010\nR\u001b\u0010Ó\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010Z8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\\R\u0015\u0010Õ\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\nR\u0015\u0010×\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0006R\u0015\u0010Ù\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\nR\u0015\u0010Û\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u000eR!\u0010Ý\u0001\u001a\u0005\u0018\u00010Þ\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bß\u0001\u0010\u0002\u001a\u0006\bà\u0001\u0010á\u0001R\u001f\u0010â\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bã\u0001\u0010\u0002\u001a\u0005\bä\u0001\u0010\nR\u0015\u0010å\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\u0006R\u0015\u0010ç\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\nR\u0015\u0010é\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\u0006R\u0015\u0010ë\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u0006R\u0017\u0010í\u0001\u001a\u0005\u0018\u00010î\u00018F¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001¨\u0006ñ\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LineLayer$Companion;", "", "()V", "defaultLineBlur", "", "getDefaultLineBlur", "()Ljava/lang/Double;", "defaultLineBlurAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultLineBlurAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultLineBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultLineBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultLineBorderColor", "", "getDefaultLineBorderColor", "()Ljava/lang/String;", "defaultLineBorderColorAsColorInt", "", "getDefaultLineBorderColorAsColorInt", "()Ljava/lang/Integer;", "defaultLineBorderColorAsExpression", "getDefaultLineBorderColorAsExpression", "defaultLineBorderColorTransition", "getDefaultLineBorderColorTransition", "defaultLineBorderColorUseTheme", "getDefaultLineBorderColorUseTheme$annotations", "getDefaultLineBorderColorUseTheme", "defaultLineBorderColorUseThemeAsExpression", "getDefaultLineBorderColorUseThemeAsExpression$annotations", "getDefaultLineBorderColorUseThemeAsExpression", "defaultLineBorderGradientUseTheme", "getDefaultLineBorderGradientUseTheme$annotations", "getDefaultLineBorderGradientUseTheme", "defaultLineBorderGradientUseThemeAsExpression", "getDefaultLineBorderGradientUseThemeAsExpression$annotations", "getDefaultLineBorderGradientUseThemeAsExpression", "defaultLineBorderWidth", "getDefaultLineBorderWidth", "defaultLineBorderWidthAsExpression", "getDefaultLineBorderWidthAsExpression", "defaultLineBorderWidthTransition", "getDefaultLineBorderWidthTransition", "defaultLineCap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "getDefaultLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "defaultLineCapAsExpression", "getDefaultLineCapAsExpression", "defaultLineColor", "getDefaultLineColor", "defaultLineColorAsColorInt", "getDefaultLineColorAsColorInt", "defaultLineColorAsExpression", "getDefaultLineColorAsExpression", "defaultLineColorTransition", "getDefaultLineColorTransition", "defaultLineColorUseTheme", "getDefaultLineColorUseTheme$annotations", "getDefaultLineColorUseTheme", "defaultLineColorUseThemeAsExpression", "getDefaultLineColorUseThemeAsExpression$annotations", "getDefaultLineColorUseThemeAsExpression", "defaultLineCrossSlope", "getDefaultLineCrossSlope$annotations", "getDefaultLineCrossSlope", "defaultLineCrossSlopeAsExpression", "getDefaultLineCrossSlopeAsExpression$annotations", "getDefaultLineCrossSlopeAsExpression", "defaultLineCutoutFadeWidth", "getDefaultLineCutoutFadeWidth$annotations", "getDefaultLineCutoutFadeWidth", "defaultLineCutoutFadeWidthAsExpression", "getDefaultLineCutoutFadeWidthAsExpression$annotations", "getDefaultLineCutoutFadeWidthAsExpression", "defaultLineCutoutFadeWidthTransition", "getDefaultLineCutoutFadeWidthTransition$annotations", "getDefaultLineCutoutFadeWidthTransition", "defaultLineCutoutOpacity", "getDefaultLineCutoutOpacity$annotations", "getDefaultLineCutoutOpacity", "defaultLineCutoutOpacityAsExpression", "getDefaultLineCutoutOpacityAsExpression$annotations", "getDefaultLineCutoutOpacityAsExpression", "defaultLineCutoutOpacityTransition", "getDefaultLineCutoutOpacityTransition$annotations", "getDefaultLineCutoutOpacityTransition", "defaultLineDasharray", "", "getDefaultLineDasharray", "()Ljava/util/List;", "defaultLineDasharrayAsExpression", "getDefaultLineDasharrayAsExpression", "defaultLineDepthOcclusionFactor", "getDefaultLineDepthOcclusionFactor", "defaultLineDepthOcclusionFactorAsExpression", "getDefaultLineDepthOcclusionFactorAsExpression", "defaultLineDepthOcclusionFactorTransition", "getDefaultLineDepthOcclusionFactorTransition", "defaultLineElevationGroundScale", "getDefaultLineElevationGroundScale", "defaultLineElevationGroundScaleAsExpression", "getDefaultLineElevationGroundScaleAsExpression", "defaultLineElevationGroundScaleTransition", "getDefaultLineElevationGroundScaleTransition", "defaultLineElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "getDefaultLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "defaultLineElevationReferenceAsExpression", "getDefaultLineElevationReferenceAsExpression", "defaultLineEmissiveStrength", "getDefaultLineEmissiveStrength", "defaultLineEmissiveStrengthAsExpression", "getDefaultLineEmissiveStrengthAsExpression", "defaultLineEmissiveStrengthTransition", "getDefaultLineEmissiveStrengthTransition", "defaultLineGapWidth", "getDefaultLineGapWidth", "defaultLineGapWidthAsExpression", "getDefaultLineGapWidthAsExpression", "defaultLineGapWidthTransition", "getDefaultLineGapWidthTransition", "defaultLineGradientUseTheme", "getDefaultLineGradientUseTheme$annotations", "getDefaultLineGradientUseTheme", "defaultLineGradientUseThemeAsExpression", "getDefaultLineGradientUseThemeAsExpression$annotations", "getDefaultLineGradientUseThemeAsExpression", "defaultLineJoin", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "getDefaultLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "defaultLineJoinAsExpression", "getDefaultLineJoinAsExpression", "defaultLineMiterLimit", "getDefaultLineMiterLimit", "defaultLineMiterLimitAsExpression", "getDefaultLineMiterLimitAsExpression", "defaultLineOcclusionOpacity", "getDefaultLineOcclusionOpacity", "defaultLineOcclusionOpacityAsExpression", "getDefaultLineOcclusionOpacityAsExpression", "defaultLineOcclusionOpacityTransition", "getDefaultLineOcclusionOpacityTransition", "defaultLineOffset", "getDefaultLineOffset", "defaultLineOffsetAsExpression", "getDefaultLineOffsetAsExpression", "defaultLineOffsetTransition", "getDefaultLineOffsetTransition", "defaultLineOpacity", "getDefaultLineOpacity", "defaultLineOpacityAsExpression", "getDefaultLineOpacityAsExpression", "defaultLineOpacityTransition", "getDefaultLineOpacityTransition", "defaultLinePattern", "getDefaultLinePattern", "defaultLinePatternAsExpression", "getDefaultLinePatternAsExpression", "defaultLinePatternCrossFade", "getDefaultLinePatternCrossFade", "defaultLinePatternCrossFadeAsExpression", "getDefaultLinePatternCrossFadeAsExpression", "defaultLineRoundLimit", "getDefaultLineRoundLimit", "defaultLineRoundLimitAsExpression", "getDefaultLineRoundLimitAsExpression", "defaultLineSortKey", "getDefaultLineSortKey", "defaultLineSortKeyAsExpression", "getDefaultLineSortKeyAsExpression", "defaultLineTranslate", "getDefaultLineTranslate", "defaultLineTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "getDefaultLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "defaultLineTranslateAnchorAsExpression", "getDefaultLineTranslateAnchorAsExpression", "defaultLineTranslateAsExpression", "getDefaultLineTranslateAsExpression", "defaultLineTranslateTransition", "getDefaultLineTranslateTransition", "defaultLineTrimColor", "getDefaultLineTrimColor$annotations", "getDefaultLineTrimColor", "defaultLineTrimColorAsColorInt", "getDefaultLineTrimColorAsColorInt$annotations", "getDefaultLineTrimColorAsColorInt", "defaultLineTrimColorAsExpression", "getDefaultLineTrimColorAsExpression$annotations", "getDefaultLineTrimColorAsExpression", "defaultLineTrimColorTransition", "getDefaultLineTrimColorTransition$annotations", "getDefaultLineTrimColorTransition", "defaultLineTrimColorUseTheme", "getDefaultLineTrimColorUseTheme$annotations", "getDefaultLineTrimColorUseTheme", "defaultLineTrimColorUseThemeAsExpression", "getDefaultLineTrimColorUseThemeAsExpression$annotations", "getDefaultLineTrimColorUseThemeAsExpression", "defaultLineTrimFadeRange", "getDefaultLineTrimFadeRange$annotations", "getDefaultLineTrimFadeRange", "defaultLineTrimFadeRangeAsExpression", "getDefaultLineTrimFadeRangeAsExpression$annotations", "getDefaultLineTrimFadeRangeAsExpression", "defaultLineTrimOffset", "getDefaultLineTrimOffset", "defaultLineTrimOffsetAsExpression", "getDefaultLineTrimOffsetAsExpression", "defaultLineWidth", "getDefaultLineWidth", "defaultLineWidthAsExpression", "getDefaultLineWidthAsExpression", "defaultLineWidthTransition", "getDefaultLineWidthTransition", "defaultLineWidthUnit", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "getDefaultLineWidthUnit$annotations", "getDefaultLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "defaultLineWidthUnitAsExpression", "getDefaultLineWidthUnitAsExpression$annotations", "getDefaultLineWidthUnitAsExpression", "defaultLineZOffset", "getDefaultLineZOffset", "defaultLineZOffsetAsExpression", "getDefaultLineZOffsetAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultLineBlur() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineBlurAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
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
            Double defaultLineBlur = getDefaultLineBlur();
            if (defaultLineBlur == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineBlur.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineBlurTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-blur-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineBorderColor() {
            Expression defaultLineBorderColorAsExpression = getDefaultLineBorderColorAsExpression();
            if (defaultLineBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineBorderColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultLineBorderColorAsColorInt() {
            Expression defaultLineBorderColorAsExpression = getDefaultLineBorderColorAsExpression();
            if (defaultLineBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineBorderColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultLineBorderColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
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
        public final StyleTransition getDefaultLineBorderColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineBorderColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLineBorderColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
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
            String defaultLineBorderColorUseTheme = getDefaultLineBorderColorUseTheme();
            if (defaultLineBorderColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineBorderColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final String getDefaultLineBorderGradientUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-gradient-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLineBorderGradientUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-gradient-use-theme");
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
            String defaultLineBorderGradientUseTheme = getDefaultLineBorderGradientUseTheme();
            if (defaultLineBorderGradientUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineBorderGradientUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineBorderWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineBorderWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
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
            Double defaultLineBorderWidth = getDefaultLineBorderWidth();
            if (defaultLineBorderWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineBorderWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineBorderWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final LineCap getDefaultLineCap() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cap");
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
            LineCap.Companion companion = LineCap.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultLineCapAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cap");
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
            LineCap defaultLineCap = getDefaultLineCap();
            if (defaultLineCap != null) {
                return Expression.INSTANCE.literal(defaultLineCap.getValue());
            }
            return null;
        }

        @Nullable
        public final String getDefaultLineColor() {
            Expression defaultLineColorAsExpression = getDefaultLineColorAsExpression();
            if (defaultLineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultLineColorAsColorInt() {
            Expression defaultLineColorAsExpression = getDefaultLineColorAsExpression();
            if (defaultLineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultLineColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
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
        public final StyleTransition getDefaultLineColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLineColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
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
            String defaultLineColorUseTheme = getDefaultLineColorUseTheme();
            if (defaultLineColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineCrossSlope() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cross-slope");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineCrossSlopeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cross-slope");
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
            Double defaultLineCrossSlope = getDefaultLineCrossSlope();
            if (defaultLineCrossSlope == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineCrossSlope.doubleValue());
        }

        @Nullable
        public final Double getDefaultLineCutoutFadeWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-fade-width");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineCutoutFadeWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-fade-width");
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
            Double defaultLineCutoutFadeWidth = getDefaultLineCutoutFadeWidth();
            if (defaultLineCutoutFadeWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineCutoutFadeWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineCutoutFadeWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-fade-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultLineCutoutOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineCutoutOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-opacity");
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
            Double defaultLineCutoutOpacity = getDefaultLineCutoutOpacity();
            if (defaultLineCutoutOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineCutoutOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineCutoutOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cutout-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final List<Double> getDefaultLineDasharray() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-dasharray");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultLineDasharrayAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-dasharray");
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
            List<Double> defaultLineDasharray = getDefaultLineDasharray();
            if (defaultLineDasharray != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineDasharray);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineDepthOcclusionFactor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineDepthOcclusionFactorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor");
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
            Double defaultLineDepthOcclusionFactor = getDefaultLineDepthOcclusionFactor();
            if (defaultLineDepthOcclusionFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineDepthOcclusionFactor.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineDepthOcclusionFactorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultLineElevationGroundScale() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineElevationGroundScaleAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
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
            Double defaultLineElevationGroundScale = getDefaultLineElevationGroundScale();
            if (defaultLineElevationGroundScale == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineElevationGroundScale.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineElevationGroundScaleTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-elevation-ground-scale-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final LineElevationReference getDefaultLineElevationReference() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-elevation-reference");
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
            LineElevationReference.Companion companion = LineElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultLineElevationReferenceAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-elevation-reference");
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
            LineElevationReference defaultLineElevationReference = getDefaultLineElevationReference();
            if (defaultLineElevationReference != null) {
                return Expression.INSTANCE.literal(defaultLineElevationReference.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
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
            Double defaultLineEmissiveStrength = getDefaultLineEmissiveStrength();
            if (defaultLineEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultLineGapWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineGapWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
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
            Double defaultLineGapWidth = getDefaultLineGapWidth();
            if (defaultLineGapWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineGapWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineGapWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gap-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineGradientUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gradient-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLineGradientUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gradient-use-theme");
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
            String defaultLineGradientUseTheme = getDefaultLineGradientUseTheme();
            if (defaultLineGradientUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineGradientUseTheme);
            }
            return null;
        }

        @Nullable
        public final LineJoin getDefaultLineJoin() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
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
            LineJoin.Companion companion = LineJoin.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultLineJoinAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
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
            LineJoin defaultLineJoin = getDefaultLineJoin();
            if (defaultLineJoin != null) {
                return Expression.INSTANCE.literal(defaultLineJoin.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineMiterLimit() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-miter-limit");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineMiterLimitAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-miter-limit");
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
            Double defaultLineMiterLimit = getDefaultLineMiterLimit();
            if (defaultLineMiterLimit == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineMiterLimit.doubleValue());
        }

        @Nullable
        public final Double getDefaultLineOcclusionOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineOcclusionOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity");
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
            Double defaultLineOcclusionOpacity = getDefaultLineOcclusionOpacity();
            if (defaultLineOcclusionOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOcclusionOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineOcclusionOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultLineOffset() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineOffsetAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
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
            Double defaultLineOffset = getDefaultLineOffset();
            if (defaultLineOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOffset.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineOffsetTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-offset-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultLineOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
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
            Double defaultLineOpacity = getDefaultLineOpacity();
            if (defaultLineOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLinePattern() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLinePatternAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
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
            String defaultLinePattern = getDefaultLinePattern();
            if (defaultLinePattern != null) {
                return Expression.INSTANCE.literal(defaultLinePattern);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLinePatternCrossFade() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLinePatternCrossFadeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-pattern-cross-fade");
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
            Double defaultLinePatternCrossFade = getDefaultLinePatternCrossFade();
            if (defaultLinePatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLinePatternCrossFade.doubleValue());
        }

        @Nullable
        public final Double getDefaultLineRoundLimit() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-round-limit");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineRoundLimitAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-round-limit");
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
            Double defaultLineRoundLimit = getDefaultLineRoundLimit();
            if (defaultLineRoundLimit == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineRoundLimit.doubleValue());
        }

        @Nullable
        public final Double getDefaultLineSortKey() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineSortKeyAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
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
            Double defaultLineSortKey = getDefaultLineSortKey();
            if (defaultLineSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineSortKey.doubleValue());
        }

        @Nullable
        public final List<Double> getDefaultLineTranslate() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final LineTranslateAnchor getDefaultLineTranslateAnchor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-anchor");
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
            LineTranslateAnchor.Companion companion = LineTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultLineTranslateAnchorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-anchor");
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
            LineTranslateAnchor defaultLineTranslateAnchor = getDefaultLineTranslateAnchor();
            if (defaultLineTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultLineTranslateAnchor.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultLineTranslateAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate");
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
            List<Double> defaultLineTranslate = getDefaultLineTranslate();
            if (defaultLineTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTranslate);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultLineTranslateTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineTrimColor() {
            Expression defaultLineTrimColorAsExpression = getDefaultLineTrimColorAsExpression();
            if (defaultLineTrimColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineTrimColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultLineTrimColorAsColorInt() {
            Expression defaultLineTrimColorAsExpression = getDefaultLineTrimColorAsExpression();
            if (defaultLineTrimColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineTrimColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultLineTrimColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color");
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
        public final StyleTransition getDefaultLineTrimColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultLineTrimColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultLineTrimColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-use-theme");
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
            String defaultLineTrimColorUseTheme = getDefaultLineTrimColorUseTheme();
            if (defaultLineTrimColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineTrimColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final List<Double> getDefaultLineTrimFadeRange() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultLineTrimFadeRangeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-fade-range");
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
            List<Double> defaultLineTrimFadeRange = getDefaultLineTrimFadeRange();
            if (defaultLineTrimFadeRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTrimFadeRange);
            }
            return null;
        }

        @Nullable
        public final List<Double> getDefaultLineTrimOffset() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-offset");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultLineTrimOffsetAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-offset");
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
            List<Double> defaultLineTrimOffset = getDefaultLineTrimOffset();
            if (defaultLineTrimOffset != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTrimOffset);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
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
            Double defaultLineWidth = getDefaultLineWidth();
            if (defaultLineWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultLineWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final LineWidthUnit getDefaultLineWidthUnit() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-unit");
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
            LineWidthUnit.Companion companion = LineWidthUnit.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultLineWidthUnitAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-unit");
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
            LineWidthUnit defaultLineWidthUnit = getDefaultLineWidthUnit();
            if (defaultLineWidthUnit != null) {
                return Expression.INSTANCE.literal(defaultLineWidthUnit.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultLineZOffset() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultLineZOffsetAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
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
            Double defaultLineZOffset = getDefaultLineZOffset();
            if (defaultLineZOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineZOffset.doubleValue());
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "visibility");
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
        public static /* synthetic */ void getDefaultLineBorderColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineBorderColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineBorderGradientUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineBorderGradientUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCrossSlope$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCrossSlopeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutFadeWidth$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutFadeWidthAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutFadeWidthTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutOpacity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutOpacityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCutoutOpacityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineGradientUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineGradientUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimFadeRange$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimFadeRangeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineWidthUnit$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineWidthUnitAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineBorderColorUseTheme(@NotNull Expression lineBorderColorUseTheme) {
        RecordTag.m(lineBorderColorUseTheme, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, lineBorderColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineBorderGradientUseTheme(@NotNull Expression lineBorderGradientUseTheme) {
        RecordTag.m(lineBorderGradientUseTheme, "line-border-gradient-use-theme", lineBorderGradientUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineCap(@NotNull Expression lineCap) {
        RecordTag.m(lineCap, "line-cap", lineCap, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineColorUseTheme(@NotNull Expression lineColorUseTheme) {
        RecordTag.m(lineColorUseTheme, PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, lineColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDasharray(@NotNull Expression lineDasharray) {
        RecordTag.m(lineDasharray, "line-dasharray", lineDasharray, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationReference(@NotNull Expression lineElevationReference) {
        RecordTag.m(lineElevationReference, "line-elevation-reference", lineElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineGradientUseTheme(@NotNull Expression lineGradientUseTheme) {
        RecordTag.m(lineGradientUseTheme, "line-gradient-use-theme", lineGradientUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineJoin(@NotNull Expression lineJoin) {
        RecordTag.m(lineJoin, PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer linePattern(@NotNull Expression linePattern) {
        RecordTag.m(linePattern, PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, linePattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslate(@NotNull Expression lineTranslate) {
        RecordTag.m(lineTranslate, "line-translate", lineTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslateAnchor(@NotNull Expression lineTranslateAnchor) {
        RecordTag.m(lineTranslateAnchor, "line-translate-anchor", lineTranslateAnchor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColorUseTheme(@NotNull Expression lineTrimColorUseTheme) {
        RecordTag.m(lineTrimColorUseTheme, "line-trim-color-use-theme", lineTrimColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimFadeRange(@NotNull Expression lineTrimFadeRange) {
        RecordTag.m(lineTrimFadeRange, "line-trim-fade-range", lineTrimFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTrimOffset(@NotNull Expression lineTrimOffset) {
        RecordTag.m(lineTrimOffset, "line-trim-offset", lineTrimOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineWidthUnit(@NotNull Expression lineWidthUnit) {
        RecordTag.m(lineWidthUnit, "line-width-unit", lineWidthUnit, this);
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderGradient$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderGradientUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlope$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlopeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutFadeWidth$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutFadeWidthAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutFadeWidthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutOpacity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutOpacityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCutoutOpacityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRangeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnit$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnitAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBlur(@NotNull Expression lineBlur) {
        RecordTag.m(lineBlur, PolylineAnnotationOptions.PROPERTY_LINE_BLUR, lineBlur, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderWidth(@NotNull Expression lineBorderWidth) {
        RecordTag.m(lineBorderWidth, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, lineBorderWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCrossSlope(@NotNull Expression lineCrossSlope) {
        RecordTag.m(lineCrossSlope, "line-cross-slope", lineCrossSlope, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutFadeWidth(@NotNull Expression lineCutoutFadeWidth) {
        RecordTag.m(lineCutoutFadeWidth, "line-cutout-fade-width", lineCutoutFadeWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutOpacity(@NotNull Expression lineCutoutOpacity) {
        RecordTag.m(lineCutoutOpacity, "line-cutout-opacity", lineCutoutOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDepthOcclusionFactor(@NotNull Expression lineDepthOcclusionFactor) {
        RecordTag.m(lineDepthOcclusionFactor, "line-depth-occlusion-factor", lineDepthOcclusionFactor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationGroundScale(@NotNull Expression lineElevationGroundScale) {
        RecordTag.m(lineElevationGroundScale, PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE, lineElevationGroundScale, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineEmissiveStrength(@NotNull Expression lineEmissiveStrength) {
        RecordTag.m(lineEmissiveStrength, PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH, lineEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineGapWidth(@NotNull Expression lineGapWidth) {
        RecordTag.m(lineGapWidth, PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, lineGapWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineMiterLimit(@NotNull Expression lineMiterLimit) {
        RecordTag.m(lineMiterLimit, "line-miter-limit", lineMiterLimit, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOcclusionOpacity(@NotNull Expression lineOcclusionOpacity) {
        RecordTag.m(lineOcclusionOpacity, "line-occlusion-opacity", lineOcclusionOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOffset(@NotNull Expression lineOffset) {
        RecordTag.m(lineOffset, PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, lineOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOpacity(@NotNull Expression lineOpacity) {
        RecordTag.m(lineOpacity, PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, lineOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer linePatternCrossFade(@NotNull Expression linePatternCrossFade) {
        RecordTag.m(linePatternCrossFade, "line-pattern-cross-fade", linePatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineRoundLimit(@NotNull Expression lineRoundLimit) {
        RecordTag.m(lineRoundLimit, "line-round-limit", lineRoundLimit, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineSortKey(@NotNull Expression lineSortKey) {
        RecordTag.m(lineSortKey, PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, lineSortKey, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineWidth(@NotNull Expression lineWidth) {
        RecordTag.m(lineWidth, PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, lineWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineZOffset(@NotNull Expression lineZOffset) {
        RecordTag.m(lineZOffset, PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, lineZOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public LineLayer visibility(@NotNull Expression visibility) {
        RecordTag.m(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderColor(@NotNull Expression lineBorderColor) {
        RecordTag.m(lineBorderColor, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, lineBorderColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineColor(@NotNull Expression lineColor) {
        RecordTag.m(lineColor, PolylineAnnotationOptions.PROPERTY_LINE_COLOR, lineColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColor(@NotNull Expression lineTrimColor) {
        RecordTag.m(lineTrimColor, "line-trim-color", lineTrimColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBlurTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-blur-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderColor(@NotNull String lineBorderColor) {
        lineBorderColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, lineBorderColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-border-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineBorderWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-border-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineColor(@NotNull String lineColor) {
        lineColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, lineColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutFadeWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-cutout-fade-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineCutoutOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-cutout-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineDepthOcclusionFactorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-depth-occlusion-factor-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineElevationGroundScaleTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-elevation-ground-scale-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineGapWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-gap-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOcclusionOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-occlusion-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOffsetTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-offset-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineTranslateTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColor(@NotNull String lineTrimColor) {
        lineTrimColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color", lineTrimColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    @NotNull
    public LineLayer lineTrimColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @NotNull
    public LineLayer lineWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-width-transition", options));
        return this;
    }
}
