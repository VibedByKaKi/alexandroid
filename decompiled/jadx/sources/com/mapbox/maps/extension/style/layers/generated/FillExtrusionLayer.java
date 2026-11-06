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
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionBaseAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionHeightAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionTranslateAnchor;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0080\u00022\u00020\u00012\u00020\u0002:\u0002\u0080\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0017J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0011\u0010\u0012\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J&\u0010\u0012\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000eH\u0017J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0017J\u0011\u0010\u001d\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J&\u0010\u001d\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH\u0016J\u0011\u0010$\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J&\u0010$\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\bH\u0016J\u0011\u0010*\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J&\u0010*\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000eH\u0017J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\bH\u0017J\u0011\u00102\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J&\u00102\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0010\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000eH\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\bH\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000eH\u0017J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000208H\u0017J\u0011\u0010A\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J&\u0010A\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000eH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u000eH\u0016J\u0012\u0010I\u001a\u00020\u00002\b\b\u0001\u0010I\u001a\u00020MH\u0016J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0004H\u0016J\u0011\u0010R\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J&\u0010R\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000eH\u0017J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0004H\u0017J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u000eH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\bH\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u000eH\u0017J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\bH\u0017J\u0010\u0010d\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u000eH\u0016J\u0010\u0010d\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\bH\u0016J\u0011\u0010h\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J&\u0010h\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u000eH\u0017J\u0012\u0010j\u001a\u00020\u00002\b\b\u0001\u0010j\u001a\u00020MH\u0017J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0004H\u0017J\u0011\u0010s\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J&\u0010s\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0010\u0010v\u001a\u00020\u00002\u0006\u0010v\u001a\u00020\u000eH\u0017J\u0010\u0010v\u001a\u00020\u00002\u0006\u0010v\u001a\u00020\u0004H\u0017J\u0010\u0010|\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000eH\u0017J\u0010\u0010|\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\bH\u0017J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010\u0082\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\bH\u0017J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010\u008b\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\bH\u0017J\u0012\u0010\u0094\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010\u0094\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010\u0097\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010\u0097\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020\bH\u0017J\u0012\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010\u009d\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010 \u0001\u001a\u00020\u00002\u0007\u0010 \u0001\u001a\u00020\u000eH\u0016J\u0012\u0010 \u0001\u001a\u00020\u00002\u0007\u0010 \u0001\u001a\u00020\bH\u0016J\u0012\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010¢\u0001\u001a\u00020\u000eH\u0017J\u0013\u0010¢\u0001\u001a\u00020\u00002\b\u0010¢\u0001\u001a\u00030£\u0001H\u0017J\u0012\u0010¬\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J'\u0010¬\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0012\u0010®\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010®\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\bH\u0017J\u0012\u0010´\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010´\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010·\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010·\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020\bH\u0016J\u0012\u0010»\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J'\u0010»\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0012\u0010½\u0001\u001a\u00020\u00002\u0007\u0010½\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010½\u0001\u001a\u00020\u00002\u0007\u0010½\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010Á\u0001\u001a\u00020\u00002\u0007\u0010Á\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010Á\u0001\u001a\u00020\u00002\u0007\u0010Á\u0001\u001a\u00020\bH\u0016J\u0012\u0010Å\u0001\u001a\u00020\u00002\u0007\u0010Å\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010Å\u0001\u001a\u00020\u00002\u0007\u0010Å\u0001\u001a\u00020DH\u0017J\u0012\u0010Ë\u0001\u001a\u00020\u00002\u0007\u0010Ë\u0001\u001a\u00020\u000eH\u0016J\u0019\u0010Ë\u0001\u001a\u00020\u00002\u000e\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Ì\u0001H\u0016J\u0012\u0010Ï\u0001\u001a\u00020\u00002\u0007\u0010Ï\u0001\u001a\u00020\u000eH\u0016J\u0013\u0010Ï\u0001\u001a\u00020\u00002\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0016J\u0012\u0010×\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0016J'\u0010×\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0016J\u0012\u0010Ù\u0001\u001a\u00020\u00002\u0007\u0010Ù\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010Ù\u0001\u001a\u00020\u00002\u0007\u0010Ù\u0001\u001a\u00020DH\u0016J\u0012\u0010Ý\u0001\u001a\u00020\u00002\u0007\u0010Ý\u0001\u001a\u00020\u000eH\u0017J\u0012\u0010Ý\u0001\u001a\u00020\u00002\u0007\u0010Ý\u0001\u001a\u00020\bH\u0017J\u0012\u0010ã\u0001\u001a\u00020\u00002\u0007\u0010ø\u0001\u001a\u00020\u0013H\u0017J'\u0010ã\u0001\u001a\u00020\u00002\u001c\u0010ù\u0001\u001a\u0017\u0012\u0005\u0012\u00030û\u0001\u0012\u0005\u0012\u00030ü\u00010ú\u0001¢\u0006\u0003\bý\u0001H\u0017J\u0012\u0010æ\u0001\u001a\u00020\u00002\u0007\u0010æ\u0001\u001a\u00020\u000eH\u0016J\u000f\u0010þ\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0003\bÿ\u0001J\u0012\u0010é\u0001\u001a\u00020\u00002\u0007\u0010é\u0001\u001a\u00020\bH\u0016J\u0012\u0010ë\u0001\u001a\u00020\u00002\u0007\u0010ë\u0001\u001a\u00020\bH\u0016J\u0012\u0010í\u0001\u001a\u00020\u00002\u0007\u0010í\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010ð\u0001\u001a\u00020\u00002\u0007\u0010ð\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010ò\u0001\u001a\u00020\u00002\u0007\u0010ò\u0001\u001a\u00020\u000eH\u0016J\u0013\u0010ò\u0001\u001a\u00020\u00002\b\u0010ò\u0001\u001a\u00030ó\u0001H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010 \u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0013\u0010$\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0013\u0010&\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\fR\u0013\u0010(\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0013\u0010*\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u001c\u0010,\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001c\u0010/\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\n\u001a\u0004\b1\u0010\u0011R\u001c\u00102\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\n\u001a\u0004\b4\u0010\u0016R\u0013\u00105\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\fR\u001c\u00107\u001a\u0004\u0018\u0001088FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\n\u001a\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\n\u001a\u0004\b>\u0010\u0011R\u0013\u0010?\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0011R\u0013\u0010A\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bB\u0010\u0016R\u0013\u0010C\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010G\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0011R\u0013\u0010I\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010M8G¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0011R\u0013\u0010R\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bS\u0010\u0016R\u001c\u0010T\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010\n\u001a\u0004\bV\u0010KR\u001c\u0010W\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\n\u001a\u0004\bY\u0010\u0011R\u0013\u0010Z\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b[\u0010\fR\u0013\u0010\\\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b]\u0010\u0011R\u001c\u0010^\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001c\u0010a\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010\n\u001a\u0004\bc\u0010\u0011R\u0013\u0010d\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\be\u0010\fR\u0013\u0010f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bg\u0010\u0011R\u0013\u0010h\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bi\u0010\u0016R\u001c\u0010j\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010\n\u001a\u0004\bl\u0010KR\u001c\u0010m\u001a\u0004\u0018\u00010M8GX\u0087\u0004¢\u0006\f\u0012\u0004\bn\u0010\n\u001a\u0004\bo\u0010OR\u001c\u0010p\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\n\u001a\u0004\br\u0010\u0011R\u001c\u0010s\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010\n\u001a\u0004\bu\u0010\u0016R\u001c\u0010v\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bw\u0010\n\u001a\u0004\bx\u0010KR\u001c\u0010y\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010\n\u001a\u0004\b{\u0010\u0011R\u001c\u0010|\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010\n\u001a\u0004\b~\u0010\fR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0080\u0001\u0010\n\u001a\u0005\b\u0081\u0001\u0010\u0011R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\u0016R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010\n\u001a\u0005\b\u0087\u0001\u0010\fR\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\u0011R\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008c\u0001\u0010\n\u001a\u0005\b\u008d\u0001\u0010\u0016R\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008f\u0001\u0010\n\u001a\u0005\b\u0090\u0001\u0010\fR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0092\u0001\u0010\n\u001a\u0005\b\u0093\u0001\u0010\u0011R\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0095\u0001\u0010\n\u001a\u0005\b\u0096\u0001\u0010\u0016R\u001f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0098\u0001\u0010\n\u001a\u0005\b\u0099\u0001\u0010\fR\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009b\u0001\u0010\n\u001a\u0005\b\u009c\u0001\u0010\u0011R\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\n\u001a\u0005\b\u009f\u0001\u0010\u0016R\u0015\u0010 \u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\fR!\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¤\u0001\u0010\n\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010§\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¨\u0001\u0010\n\u001a\u0005\b©\u0001\u0010\u0011R\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u0011R\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010\u0016R\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¯\u0001\u0010\n\u001a\u0005\b°\u0001\u0010\fR\u001f\u0010±\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b²\u0001\u0010\n\u001a\u0005\b³\u0001\u0010\u0011R\u001f\u0010´\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bµ\u0001\u0010\n\u001a\u0005\b¶\u0001\u0010\u0016R\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\fR\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u0011R\u0015\u0010»\u0001\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u0016R\u0015\u0010½\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010KR\u0015\u0010¿\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\u0011R\u0015\u0010Á\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\fR\u0015\u0010Ã\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\u0011R\u001f\u0010Å\u0001\u001a\u0004\u0018\u00010D8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÆ\u0001\u0010\n\u001a\u0005\bÇ\u0001\u0010FR\u001f\u0010È\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÉ\u0001\u0010\n\u001a\u0005\bÊ\u0001\u0010\u0011R\u001d\u0010Ë\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010Ì\u00018F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0017\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u00018F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0015\u0010Ó\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u0011R\u0015\u0010Õ\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u0011R\u0015\u0010×\u0001\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u0016R\u0015\u0010Ù\u0001\u001a\u0004\u0018\u00010D8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010FR\u0015\u0010Û\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u0011R\u001f\u0010Ý\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÞ\u0001\u0010\n\u001a\u0005\bß\u0001\u0010\fR\u001f\u0010à\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bá\u0001\u0010\n\u001a\u0005\bâ\u0001\u0010\u0011R\u001f\u0010ã\u0001\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bä\u0001\u0010\n\u001a\u0005\bå\u0001\u0010\u0016R\u0015\u0010æ\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bç\u0001\u0010\u0011R\u0015\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010KR\u0018\u0010é\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\fR\u0018\u0010ë\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\fR\u0018\u0010í\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u0010KR\u0012\u0010\u0005\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bï\u0001\u0010KR\u0015\u0010ð\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bñ\u0001\u0010KR\u001a\u0010ò\u0001\u001a\u0005\u0018\u00010ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0018\u0010ö\u0001\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010\u0011¨\u0006\u0081\u0002"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "fillExtrusionAmbientOcclusionGroundAttenuation", "", "getFillExtrusionAmbientOcclusionGroundAttenuation$annotations", "()V", "getFillExtrusionAmbientOcclusionGroundAttenuation", "()Ljava/lang/Double;", "fillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations", "getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fillExtrusionAmbientOcclusionGroundAttenuationTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "fillExtrusionAmbientOcclusionGroundRadius", "getFillExtrusionAmbientOcclusionGroundRadius$annotations", "getFillExtrusionAmbientOcclusionGroundRadius", "fillExtrusionAmbientOcclusionGroundRadiusAsExpression", "getFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations", "getFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "fillExtrusionAmbientOcclusionGroundRadiusTransition", "getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations", "getFillExtrusionAmbientOcclusionGroundRadiusTransition", "fillExtrusionAmbientOcclusionIntensity", "getFillExtrusionAmbientOcclusionIntensity", "fillExtrusionAmbientOcclusionIntensityAsExpression", "getFillExtrusionAmbientOcclusionIntensityAsExpression", "fillExtrusionAmbientOcclusionIntensityTransition", "getFillExtrusionAmbientOcclusionIntensityTransition", "fillExtrusionAmbientOcclusionRadius", "getFillExtrusionAmbientOcclusionRadius", "fillExtrusionAmbientOcclusionRadiusAsExpression", "getFillExtrusionAmbientOcclusionRadiusAsExpression", "fillExtrusionAmbientOcclusionRadiusTransition", "getFillExtrusionAmbientOcclusionRadiusTransition", "fillExtrusionAmbientOcclusionWallRadius", "getFillExtrusionAmbientOcclusionWallRadius$annotations", "getFillExtrusionAmbientOcclusionWallRadius", "fillExtrusionAmbientOcclusionWallRadiusAsExpression", "getFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations", "getFillExtrusionAmbientOcclusionWallRadiusAsExpression", "fillExtrusionAmbientOcclusionWallRadiusTransition", "getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations", "getFillExtrusionAmbientOcclusionWallRadiusTransition", "fillExtrusionBase", "getFillExtrusionBase", "fillExtrusionBaseAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "getFillExtrusionBaseAlignment$annotations", "getFillExtrusionBaseAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "fillExtrusionBaseAlignmentAsExpression", "getFillExtrusionBaseAlignmentAsExpression$annotations", "getFillExtrusionBaseAlignmentAsExpression", "fillExtrusionBaseAsExpression", "getFillExtrusionBaseAsExpression", "fillExtrusionBaseTransition", "getFillExtrusionBaseTransition", "fillExtrusionCastShadows", "", "getFillExtrusionCastShadows", "()Ljava/lang/Boolean;", "fillExtrusionCastShadowsAsExpression", "getFillExtrusionCastShadowsAsExpression", "fillExtrusionColor", "getFillExtrusionColor", "()Ljava/lang/String;", "fillExtrusionColorAsColorInt", "", "getFillExtrusionColorAsColorInt", "()Ljava/lang/Integer;", "fillExtrusionColorAsExpression", "getFillExtrusionColorAsExpression", "fillExtrusionColorTransition", "getFillExtrusionColorTransition", "fillExtrusionColorUseTheme", "getFillExtrusionColorUseTheme$annotations", "getFillExtrusionColorUseTheme", "fillExtrusionColorUseThemeAsExpression", "getFillExtrusionColorUseThemeAsExpression$annotations", "getFillExtrusionColorUseThemeAsExpression", "fillExtrusionCutoffFadeRange", "getFillExtrusionCutoffFadeRange", "fillExtrusionCutoffFadeRangeAsExpression", "getFillExtrusionCutoffFadeRangeAsExpression", "fillExtrusionEdgeRadius", "getFillExtrusionEdgeRadius$annotations", "getFillExtrusionEdgeRadius", "fillExtrusionEdgeRadiusAsExpression", "getFillExtrusionEdgeRadiusAsExpression$annotations", "getFillExtrusionEdgeRadiusAsExpression", "fillExtrusionEmissiveStrength", "getFillExtrusionEmissiveStrength", "fillExtrusionEmissiveStrengthAsExpression", "getFillExtrusionEmissiveStrengthAsExpression", "fillExtrusionEmissiveStrengthTransition", "getFillExtrusionEmissiveStrengthTransition", "fillExtrusionFloodLightColor", "getFillExtrusionFloodLightColor$annotations", "getFillExtrusionFloodLightColor", "fillExtrusionFloodLightColorAsColorInt", "getFillExtrusionFloodLightColorAsColorInt$annotations", "getFillExtrusionFloodLightColorAsColorInt", "fillExtrusionFloodLightColorAsExpression", "getFillExtrusionFloodLightColorAsExpression$annotations", "getFillExtrusionFloodLightColorAsExpression", "fillExtrusionFloodLightColorTransition", "getFillExtrusionFloodLightColorTransition$annotations", "getFillExtrusionFloodLightColorTransition", "fillExtrusionFloodLightColorUseTheme", "getFillExtrusionFloodLightColorUseTheme$annotations", "getFillExtrusionFloodLightColorUseTheme", "fillExtrusionFloodLightColorUseThemeAsExpression", "getFillExtrusionFloodLightColorUseThemeAsExpression$annotations", "getFillExtrusionFloodLightColorUseThemeAsExpression", "fillExtrusionFloodLightGroundAttenuation", "getFillExtrusionFloodLightGroundAttenuation$annotations", "getFillExtrusionFloodLightGroundAttenuation", "fillExtrusionFloodLightGroundAttenuationAsExpression", "getFillExtrusionFloodLightGroundAttenuationAsExpression$annotations", "getFillExtrusionFloodLightGroundAttenuationAsExpression", "fillExtrusionFloodLightGroundAttenuationTransition", "getFillExtrusionFloodLightGroundAttenuationTransition$annotations", "getFillExtrusionFloodLightGroundAttenuationTransition", "fillExtrusionFloodLightGroundRadius", "getFillExtrusionFloodLightGroundRadius$annotations", "getFillExtrusionFloodLightGroundRadius", "fillExtrusionFloodLightGroundRadiusAsExpression", "getFillExtrusionFloodLightGroundRadiusAsExpression$annotations", "getFillExtrusionFloodLightGroundRadiusAsExpression", "fillExtrusionFloodLightGroundRadiusTransition", "getFillExtrusionFloodLightGroundRadiusTransition$annotations", "getFillExtrusionFloodLightGroundRadiusTransition", "fillExtrusionFloodLightIntensity", "getFillExtrusionFloodLightIntensity$annotations", "getFillExtrusionFloodLightIntensity", "fillExtrusionFloodLightIntensityAsExpression", "getFillExtrusionFloodLightIntensityAsExpression$annotations", "getFillExtrusionFloodLightIntensityAsExpression", "fillExtrusionFloodLightIntensityTransition", "getFillExtrusionFloodLightIntensityTransition$annotations", "getFillExtrusionFloodLightIntensityTransition", "fillExtrusionFloodLightWallRadius", "getFillExtrusionFloodLightWallRadius$annotations", "getFillExtrusionFloodLightWallRadius", "fillExtrusionFloodLightWallRadiusAsExpression", "getFillExtrusionFloodLightWallRadiusAsExpression$annotations", "getFillExtrusionFloodLightWallRadiusAsExpression", "fillExtrusionFloodLightWallRadiusTransition", "getFillExtrusionFloodLightWallRadiusTransition$annotations", "getFillExtrusionFloodLightWallRadiusTransition", "fillExtrusionHeight", "getFillExtrusionHeight", "fillExtrusionHeightAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "getFillExtrusionHeightAlignment$annotations", "getFillExtrusionHeightAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "fillExtrusionHeightAlignmentAsExpression", "getFillExtrusionHeightAlignmentAsExpression$annotations", "getFillExtrusionHeightAlignmentAsExpression", "fillExtrusionHeightAsExpression", "getFillExtrusionHeightAsExpression", "fillExtrusionHeightTransition", "getFillExtrusionHeightTransition", "fillExtrusionLineWidth", "getFillExtrusionLineWidth$annotations", "getFillExtrusionLineWidth", "fillExtrusionLineWidthAsExpression", "getFillExtrusionLineWidthAsExpression$annotations", "getFillExtrusionLineWidthAsExpression", "fillExtrusionLineWidthTransition", "getFillExtrusionLineWidthTransition$annotations", "getFillExtrusionLineWidthTransition", "fillExtrusionOpacity", "getFillExtrusionOpacity", "fillExtrusionOpacityAsExpression", "getFillExtrusionOpacityAsExpression", "fillExtrusionOpacityTransition", "getFillExtrusionOpacityTransition", "fillExtrusionPattern", "getFillExtrusionPattern", "fillExtrusionPatternAsExpression", "getFillExtrusionPatternAsExpression", "fillExtrusionPatternCrossFade", "getFillExtrusionPatternCrossFade", "fillExtrusionPatternCrossFadeAsExpression", "getFillExtrusionPatternCrossFadeAsExpression", "fillExtrusionRoundedRoof", "getFillExtrusionRoundedRoof$annotations", "getFillExtrusionRoundedRoof", "fillExtrusionRoundedRoofAsExpression", "getFillExtrusionRoundedRoofAsExpression$annotations", "getFillExtrusionRoundedRoofAsExpression", "fillExtrusionTranslate", "", "getFillExtrusionTranslate", "()Ljava/util/List;", "fillExtrusionTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "getFillExtrusionTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "fillExtrusionTranslateAnchorAsExpression", "getFillExtrusionTranslateAnchorAsExpression", "fillExtrusionTranslateAsExpression", "getFillExtrusionTranslateAsExpression", "fillExtrusionTranslateTransition", "getFillExtrusionTranslateTransition", "fillExtrusionVerticalGradient", "getFillExtrusionVerticalGradient", "fillExtrusionVerticalGradientAsExpression", "getFillExtrusionVerticalGradientAsExpression", "fillExtrusionVerticalScale", "getFillExtrusionVerticalScale$annotations", "getFillExtrusionVerticalScale", "fillExtrusionVerticalScaleAsExpression", "getFillExtrusionVerticalScaleAsExpression$annotations", "getFillExtrusionVerticalScaleAsExpression", "fillExtrusionVerticalScaleTransition", "getFillExtrusionVerticalScaleTransition$annotations", "getFillExtrusionVerticalScaleTransition", "filter", "getFilter", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class FillExtrusionLayer extends Layer implements FillExtrusionLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public FillExtrusionLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(double fillExtrusionAmbientOcclusionGroundAttenuation) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-attenuation", Double.valueOf(fillExtrusionAmbientOcclusionGroundAttenuation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionGroundAttenuationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(double fillExtrusionAmbientOcclusionGroundRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-radius", Double.valueOf(fillExtrusionAmbientOcclusionGroundRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionGroundRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(double fillExtrusionAmbientOcclusionIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-intensity", Double.valueOf(fillExtrusionAmbientOcclusionIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(double fillExtrusionAmbientOcclusionRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-radius", Double.valueOf(fillExtrusionAmbientOcclusionRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(double fillExtrusionAmbientOcclusionWallRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-wall-radius", Double.valueOf(fillExtrusionAmbientOcclusionWallRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionWallRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionBase(double fillExtrusionBase) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base", Double.valueOf(fillExtrusionBase)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionBaseAlignment(@NotNull FillExtrusionBaseAlignment fillExtrusionBaseAlignment) {
        fillExtrusionBaseAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base-alignment", fillExtrusionBaseAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionBaseTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionBaseTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionCastShadows(boolean fillExtrusionCastShadows) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-cast-shadows", Boolean.valueOf(fillExtrusionCastShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionColor(@ColorInt int fillExtrusionColor) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(fillExtrusionColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionColorUseTheme(@NotNull String fillExtrusionColorUseTheme) {
        fillExtrusionColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color-use-theme", fillExtrusionColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionCutoffFadeRange(double fillExtrusionCutoffFadeRange) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-cutoff-fade-range", Double.valueOf(fillExtrusionCutoffFadeRange)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionEdgeRadius(double fillExtrusionEdgeRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-edge-radius", Double.valueOf(fillExtrusionEdgeRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionEmissiveStrength(double fillExtrusionEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-emissive-strength", Double.valueOf(fillExtrusionEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColor(@ColorInt int fillExtrusionFloodLightColor) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(fillExtrusionFloodLightColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(@NotNull String fillExtrusionFloodLightColorUseTheme) {
        fillExtrusionFloodLightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color-use-theme", fillExtrusionFloodLightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(double fillExtrusionFloodLightGroundAttenuation) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-attenuation", Double.valueOf(fillExtrusionFloodLightGroundAttenuation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightGroundAttenuationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadius(double fillExtrusionFloodLightGroundRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-radius", Double.valueOf(fillExtrusionFloodLightGroundRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightGroundRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightIntensity(double fillExtrusionFloodLightIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-intensity", Double.valueOf(fillExtrusionFloodLightIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightWallRadius(double fillExtrusionFloodLightWallRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-wall-radius", Double.valueOf(fillExtrusionFloodLightWallRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightWallRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionHeight(double fillExtrusionHeight) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height", Double.valueOf(fillExtrusionHeight)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionHeightAlignment(@NotNull FillExtrusionHeightAlignment fillExtrusionHeightAlignment) {
        fillExtrusionHeightAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height-alignment", fillExtrusionHeightAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionHeightTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionHeightTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionLineWidth(double fillExtrusionLineWidth) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-line-width", Double.valueOf(fillExtrusionLineWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionLineWidthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionLineWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionOpacity(double fillExtrusionOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-opacity", Double.valueOf(fillExtrusionOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionPattern(@NotNull String fillExtrusionPattern) {
        fillExtrusionPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-pattern", fillExtrusionPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionPatternCrossFade(double fillExtrusionPatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-pattern-cross-fade", Double.valueOf(fillExtrusionPatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionRoundedRoof(boolean fillExtrusionRoundedRoof) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-rounded-roof", Boolean.valueOf(fillExtrusionRoundedRoof)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslate(@NotNull List<Double> fillExtrusionTranslate) {
        fillExtrusionTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate", fillExtrusionTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslateAnchor(@NotNull FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor) {
        fillExtrusionTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate-anchor", fillExtrusionTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslateTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalGradient(boolean fillExtrusionVerticalGradient) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-gradient", Boolean.valueOf(fillExtrusionVerticalGradient)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalScale(double fillExtrusionVerticalScale) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-scale", Double.valueOf(fillExtrusionVerticalScale)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalScaleTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionVerticalScaleTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer filter(@NotNull Expression filter) {
        RegionDefaults$$ExternalSyntheticOutline0.m(filter, "filter", filter, this);
        return this;
    }

    @Nullable
    public final Double getFillExtrusionAmbientOcclusionGroundAttenuation() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-attenuation", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-ground-attenuation");
    }

    @Nullable
    public final StyleTransition getFillExtrusionAmbientOcclusionGroundAttenuationTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-attenuation-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionAmbientOcclusionGroundRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionAmbientOcclusionGroundRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-ground-radius");
    }

    @Nullable
    public final StyleTransition getFillExtrusionAmbientOcclusionGroundRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionAmbientOcclusionIntensity() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-intensity", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionAmbientOcclusionIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-intensity");
    }

    @Nullable
    public final StyleTransition getFillExtrusionAmbientOcclusionIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-intensity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionAmbientOcclusionRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionAmbientOcclusionRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-radius");
    }

    @Nullable
    public final StyleTransition getFillExtrusionAmbientOcclusionRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionAmbientOcclusionWallRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-wall-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionAmbientOcclusionWallRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-wall-radius");
    }

    @Nullable
    public final StyleTransition getFillExtrusionAmbientOcclusionWallRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-wall-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionBase() {
        return (Double) getPropertyValueWithType("fill-extrusion-base", Double.class);
    }

    @Nullable
    public final FillExtrusionBaseAlignment getFillExtrusionBaseAlignment() {
        String str = (String) getPropertyValueWithType("fill-extrusion-base-alignment", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionBaseAlignment.Companion companion = FillExtrusionBaseAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getFillExtrusionBaseAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-base-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionBaseAlignment fillExtrusionBaseAlignment = getFillExtrusionBaseAlignment();
        if (fillExtrusionBaseAlignment != null) {
            return Expression.INSTANCE.literal(fillExtrusionBaseAlignment.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getFillExtrusionBaseAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-base");
    }

    @Nullable
    public final StyleTransition getFillExtrusionBaseTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-base-transition", StyleTransition.class);
    }

    @Nullable
    public final Boolean getFillExtrusionCastShadows() {
        return (Boolean) getPropertyValueWithType("fill-extrusion-cast-shadows", Boolean.class);
    }

    @Nullable
    public final Expression getFillExtrusionCastShadowsAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-cast-shadows");
    }

    @Nullable
    public final String getFillExtrusionColor() {
        Expression fillExtrusionColorAsExpression = getFillExtrusionColorAsExpression();
        if (fillExtrusionColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillExtrusionColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillExtrusionColorAsColorInt() {
        Expression fillExtrusionColorAsExpression = getFillExtrusionColorAsExpression();
        if (fillExtrusionColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillExtrusionColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillExtrusionColorAsExpression() {
        return (Expression) getPropertyValueWithType("fill-extrusion-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getFillExtrusionColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillExtrusionColorUseTheme() {
        return (String) getPropertyValueWithType("fill-extrusion-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getFillExtrusionColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-color-use-theme");
    }

    @Nullable
    public final Double getFillExtrusionCutoffFadeRange() {
        return (Double) getPropertyValueWithType("fill-extrusion-cutoff-fade-range", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionCutoffFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-cutoff-fade-range");
    }

    @Nullable
    public final Double getFillExtrusionEdgeRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-edge-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionEdgeRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-edge-radius");
    }

    @Nullable
    public final Double getFillExtrusionEmissiveStrength() {
        return (Double) getPropertyValueWithType("fill-extrusion-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-emissive-strength");
    }

    @Nullable
    public final StyleTransition getFillExtrusionEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillExtrusionFloodLightColor() {
        Expression fillExtrusionFloodLightColorAsExpression = getFillExtrusionFloodLightColorAsExpression();
        if (fillExtrusionFloodLightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillExtrusionFloodLightColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillExtrusionFloodLightColorAsColorInt() {
        Expression fillExtrusionFloodLightColorAsExpression = getFillExtrusionFloodLightColorAsExpression();
        if (fillExtrusionFloodLightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillExtrusionFloodLightColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightColorAsExpression() {
        return (Expression) getPropertyValueWithType("fill-extrusion-flood-light-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getFillExtrusionFloodLightColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillExtrusionFloodLightColorUseTheme() {
        return (String) getPropertyValueWithType("fill-extrusion-flood-light-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-color-use-theme");
    }

    @Nullable
    public final Double getFillExtrusionFloodLightGroundAttenuation() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-ground-attenuation", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightGroundAttenuationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-ground-attenuation");
    }

    @Nullable
    public final StyleTransition getFillExtrusionFloodLightGroundAttenuationTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-ground-attenuation-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionFloodLightGroundRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-ground-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightGroundRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-ground-radius");
    }

    @Nullable
    public final StyleTransition getFillExtrusionFloodLightGroundRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-ground-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionFloodLightIntensity() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-intensity", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-intensity");
    }

    @Nullable
    public final StyleTransition getFillExtrusionFloodLightIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-intensity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionFloodLightWallRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-wall-radius", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionFloodLightWallRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-wall-radius");
    }

    @Nullable
    public final StyleTransition getFillExtrusionFloodLightWallRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-wall-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionHeight() {
        return (Double) getPropertyValueWithType("fill-extrusion-height", Double.class);
    }

    @Nullable
    public final FillExtrusionHeightAlignment getFillExtrusionHeightAlignment() {
        String str = (String) getPropertyValueWithType("fill-extrusion-height-alignment", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionHeightAlignment.Companion companion = FillExtrusionHeightAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getFillExtrusionHeightAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-height-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionHeightAlignment fillExtrusionHeightAlignment = getFillExtrusionHeightAlignment();
        if (fillExtrusionHeightAlignment != null) {
            return Expression.INSTANCE.literal(fillExtrusionHeightAlignment.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getFillExtrusionHeightAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-height");
    }

    @Nullable
    public final StyleTransition getFillExtrusionHeightTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-height-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionLineWidth() {
        return (Double) getPropertyValueWithType("fill-extrusion-line-width", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionLineWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-line-width");
    }

    @Nullable
    public final StyleTransition getFillExtrusionLineWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-line-width-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getFillExtrusionOpacity() {
        return (Double) getPropertyValueWithType("fill-extrusion-opacity", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-opacity");
    }

    @Nullable
    public final StyleTransition getFillExtrusionOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final String getFillExtrusionPattern() {
        return (String) getPropertyValueWithType("fill-extrusion-pattern", String.class);
    }

    @Nullable
    public final Expression getFillExtrusionPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-pattern");
    }

    @Nullable
    public final Double getFillExtrusionPatternCrossFade() {
        return (Double) getPropertyValueWithType("fill-extrusion-pattern-cross-fade", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionPatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-pattern-cross-fade");
    }

    @Nullable
    public final Boolean getFillExtrusionRoundedRoof() {
        return (Boolean) getPropertyValueWithType("fill-extrusion-rounded-roof", Boolean.class);
    }

    @Nullable
    public final Expression getFillExtrusionRoundedRoofAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-rounded-roof");
    }

    @Nullable
    public final List<Double> getFillExtrusionTranslate() {
        return (List) getPropertyValueWithType("fill-extrusion-translate", List.class);
    }

    @Nullable
    public final FillExtrusionTranslateAnchor getFillExtrusionTranslateAnchor() {
        String str = (String) getPropertyValueWithType("fill-extrusion-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionTranslateAnchor.Companion companion = FillExtrusionTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getFillExtrusionTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor = getFillExtrusionTranslateAnchor();
        if (fillExtrusionTranslateAnchor != null) {
            return Expression.INSTANCE.literal(fillExtrusionTranslateAnchor.getValue());
        }
        return null;
    }

    @Nullable
    public final Expression getFillExtrusionTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-translate");
    }

    @Nullable
    public final StyleTransition getFillExtrusionTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-translate-transition", StyleTransition.class);
    }

    @Nullable
    public final Boolean getFillExtrusionVerticalGradient() {
        return (Boolean) getPropertyValueWithType("fill-extrusion-vertical-gradient", Boolean.class);
    }

    @Nullable
    public final Expression getFillExtrusionVerticalGradientAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-vertical-gradient");
    }

    @Nullable
    public final Double getFillExtrusionVerticalScale() {
        return (Double) getPropertyValueWithType("fill-extrusion-vertical-scale", Double.class);
    }

    @Nullable
    public final Expression getFillExtrusionVerticalScaleAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-vertical-scale");
    }

    @Nullable
    public final StyleTransition getFillExtrusionVerticalScaleTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-vertical-scale-transition", StyleTransition.class);
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
        return "fill-extrusion";
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
    public FillExtrusionLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillExtrusionLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillExtrusionLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillExtrusionLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0013\u0010%\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u001c\u0010'\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R\u001c\u0010*\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\fR\u001c\u0010-\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010\u0011R\u0013\u00100\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u0004\u0018\u0001038FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\fR\u0013\u0010:\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0013\u0010<\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010\u0011R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bC\u0010\fR\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010I8G¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bM\u0010\fR\u0013\u0010N\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010\u0011R\u001c\u0010P\u001a\u0004\u0018\u00010E8FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010GR\u001c\u0010S\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\fR\u0013\u0010V\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bW\u0010\u0007R\u0013\u0010X\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bY\u0010\fR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0002\u001a\u0004\b\\\u0010\u0007R\u001c\u0010]\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0002\u001a\u0004\b_\u0010\fR\u0013\u0010`\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\ba\u0010\u0007R\u0013\u0010b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bc\u0010\fR\u0013\u0010d\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\be\u0010\u0011R\u001c\u0010f\u001a\u0004\u0018\u00010E8FX\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010\u0002\u001a\u0004\bh\u0010GR\u001c\u0010i\u001a\u0004\u0018\u00010I8GX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0002\u001a\u0004\bk\u0010KR\u001c\u0010l\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0002\u001a\u0004\bn\u0010\fR\u001c\u0010o\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0002\u001a\u0004\bq\u0010\u0011R\u001c\u0010r\u001a\u0004\u0018\u00010E8FX\u0087\u0004¢\u0006\f\u0012\u0004\bs\u0010\u0002\u001a\u0004\bt\u0010GR\u001c\u0010u\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0002\u001a\u0004\bw\u0010\fR\u001c\u0010x\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0002\u001a\u0004\bz\u0010\u0007R\u001c\u0010{\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0002\u001a\u0004\b}\u0010\fR\u001d\u0010~\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\r\u0012\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010\u0011R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0002\u001a\u0005\b\u0083\u0001\u0010\u0007R\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010\fR\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\u0002\u001a\u0005\b\u0089\u0001\u0010\u0011R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\u0002\u001a\u0005\b\u008c\u0001\u0010\u0007R\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0005\b\u008f\u0001\u0010\fR\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010\u0002\u001a\u0005\b\u0092\u0001\u0010\u0011R\u001f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0094\u0001\u0010\u0002\u001a\u0005\b\u0095\u0001\u0010\u0007R\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0097\u0001\u0010\u0002\u001a\u0005\b\u0098\u0001\u0010\fR\u001f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009a\u0001\u0010\u0002\u001a\u0005\b\u009b\u0001\u0010\u0011R\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0007R!\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b \u0001\u0010\u0002\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001f\u0010£\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¤\u0001\u0010\u0002\u001a\u0005\b¥\u0001\u0010\fR\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\fR\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\u0011R\u001f\u0010ª\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b«\u0001\u0010\u0002\u001a\u0005\b¬\u0001\u0010\u0007R\u001f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b®\u0001\u0010\u0002\u001a\u0005\b¯\u0001\u0010\fR\u001f\u0010°\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b±\u0001\u0010\u0002\u001a\u0005\b²\u0001\u0010\u0011R\u0015\u0010³\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0007R\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\fR\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0011R\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010E8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010GR\u0015\u0010»\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\fR\u0015\u0010½\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u0007R\u0015\u0010¿\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\fR\u001f\u0010Á\u0001\u001a\u0004\u0018\u00010?8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÂ\u0001\u0010\u0002\u001a\u0005\bÃ\u0001\u0010AR\u001f\u0010Ä\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÅ\u0001\u0010\u0002\u001a\u0005\bÆ\u0001\u0010\fR\u001d\u0010Ç\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010È\u00018F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u00018F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\fR\u0015\u0010Ñ\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\fR\u0015\u0010Ó\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u0011R\u0015\u0010Õ\u0001\u001a\u0004\u0018\u00010?8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010AR\u0015\u0010×\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\fR\u001f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÚ\u0001\u0010\u0002\u001a\u0005\bÛ\u0001\u0010\u0007R\u001f\u0010Ü\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÝ\u0001\u0010\u0002\u001a\u0005\bÞ\u0001\u0010\fR\u001f\u0010ß\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bà\u0001\u0010\u0002\u001a\u0005\bá\u0001\u0010\u0011R\u0015\u0010â\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bã\u0001\u0010\u0007R\u0015\u0010ä\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bå\u0001\u0010\u0007R\u0017\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u00018F¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001¨\u0006ê\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer$Companion;", "", "()V", "defaultFillExtrusionAmbientOcclusionGroundAttenuation", "", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuation$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuation", "()Ljava/lang/Double;", "defaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultFillExtrusionAmbientOcclusionGroundAttenuationTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultFillExtrusionAmbientOcclusionGroundRadius", "getDefaultFillExtrusionAmbientOcclusionGroundRadius$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadius", "defaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionGroundRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition", "defaultFillExtrusionAmbientOcclusionIntensity", "getDefaultFillExtrusionAmbientOcclusionIntensity", "defaultFillExtrusionAmbientOcclusionIntensityAsExpression", "getDefaultFillExtrusionAmbientOcclusionIntensityAsExpression", "defaultFillExtrusionAmbientOcclusionIntensityTransition", "getDefaultFillExtrusionAmbientOcclusionIntensityTransition", "defaultFillExtrusionAmbientOcclusionRadius", "getDefaultFillExtrusionAmbientOcclusionRadius", "defaultFillExtrusionAmbientOcclusionRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionRadiusTransition", "defaultFillExtrusionAmbientOcclusionWallRadius", "getDefaultFillExtrusionAmbientOcclusionWallRadius$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadius", "defaultFillExtrusionAmbientOcclusionWallRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionWallRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition", "defaultFillExtrusionBase", "getDefaultFillExtrusionBase", "defaultFillExtrusionBaseAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "getDefaultFillExtrusionBaseAlignment$annotations", "getDefaultFillExtrusionBaseAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "defaultFillExtrusionBaseAlignmentAsExpression", "getDefaultFillExtrusionBaseAlignmentAsExpression$annotations", "getDefaultFillExtrusionBaseAlignmentAsExpression", "defaultFillExtrusionBaseAsExpression", "getDefaultFillExtrusionBaseAsExpression", "defaultFillExtrusionBaseTransition", "getDefaultFillExtrusionBaseTransition", "defaultFillExtrusionCastShadows", "", "getDefaultFillExtrusionCastShadows", "()Ljava/lang/Boolean;", "defaultFillExtrusionCastShadowsAsExpression", "getDefaultFillExtrusionCastShadowsAsExpression", "defaultFillExtrusionColor", "", "getDefaultFillExtrusionColor", "()Ljava/lang/String;", "defaultFillExtrusionColorAsColorInt", "", "getDefaultFillExtrusionColorAsColorInt", "()Ljava/lang/Integer;", "defaultFillExtrusionColorAsExpression", "getDefaultFillExtrusionColorAsExpression", "defaultFillExtrusionColorTransition", "getDefaultFillExtrusionColorTransition", "defaultFillExtrusionColorUseTheme", "getDefaultFillExtrusionColorUseTheme$annotations", "getDefaultFillExtrusionColorUseTheme", "defaultFillExtrusionColorUseThemeAsExpression", "getDefaultFillExtrusionColorUseThemeAsExpression$annotations", "getDefaultFillExtrusionColorUseThemeAsExpression", "defaultFillExtrusionCutoffFadeRange", "getDefaultFillExtrusionCutoffFadeRange", "defaultFillExtrusionCutoffFadeRangeAsExpression", "getDefaultFillExtrusionCutoffFadeRangeAsExpression", "defaultFillExtrusionEdgeRadius", "getDefaultFillExtrusionEdgeRadius$annotations", "getDefaultFillExtrusionEdgeRadius", "defaultFillExtrusionEdgeRadiusAsExpression", "getDefaultFillExtrusionEdgeRadiusAsExpression$annotations", "getDefaultFillExtrusionEdgeRadiusAsExpression", "defaultFillExtrusionEmissiveStrength", "getDefaultFillExtrusionEmissiveStrength", "defaultFillExtrusionEmissiveStrengthAsExpression", "getDefaultFillExtrusionEmissiveStrengthAsExpression", "defaultFillExtrusionEmissiveStrengthTransition", "getDefaultFillExtrusionEmissiveStrengthTransition", "defaultFillExtrusionFloodLightColor", "getDefaultFillExtrusionFloodLightColor$annotations", "getDefaultFillExtrusionFloodLightColor", "defaultFillExtrusionFloodLightColorAsColorInt", "getDefaultFillExtrusionFloodLightColorAsColorInt$annotations", "getDefaultFillExtrusionFloodLightColorAsColorInt", "defaultFillExtrusionFloodLightColorAsExpression", "getDefaultFillExtrusionFloodLightColorAsExpression$annotations", "getDefaultFillExtrusionFloodLightColorAsExpression", "defaultFillExtrusionFloodLightColorTransition", "getDefaultFillExtrusionFloodLightColorTransition$annotations", "getDefaultFillExtrusionFloodLightColorTransition", "defaultFillExtrusionFloodLightColorUseTheme", "getDefaultFillExtrusionFloodLightColorUseTheme$annotations", "getDefaultFillExtrusionFloodLightColorUseTheme", "defaultFillExtrusionFloodLightColorUseThemeAsExpression", "getDefaultFillExtrusionFloodLightColorUseThemeAsExpression$annotations", "getDefaultFillExtrusionFloodLightColorUseThemeAsExpression", "defaultFillExtrusionFloodLightGroundAttenuation", "getDefaultFillExtrusionFloodLightGroundAttenuation$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuation", "defaultFillExtrusionFloodLightGroundAttenuationAsExpression", "getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression", "defaultFillExtrusionFloodLightGroundAttenuationTransition", "getDefaultFillExtrusionFloodLightGroundAttenuationTransition$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuationTransition", "defaultFillExtrusionFloodLightGroundRadius", "getDefaultFillExtrusionFloodLightGroundRadius$annotations", "getDefaultFillExtrusionFloodLightGroundRadius", "defaultFillExtrusionFloodLightGroundRadiusAsExpression", "getDefaultFillExtrusionFloodLightGroundRadiusAsExpression$annotations", "getDefaultFillExtrusionFloodLightGroundRadiusAsExpression", "defaultFillExtrusionFloodLightGroundRadiusTransition", "getDefaultFillExtrusionFloodLightGroundRadiusTransition$annotations", "getDefaultFillExtrusionFloodLightGroundRadiusTransition", "defaultFillExtrusionFloodLightIntensity", "getDefaultFillExtrusionFloodLightIntensity$annotations", "getDefaultFillExtrusionFloodLightIntensity", "defaultFillExtrusionFloodLightIntensityAsExpression", "getDefaultFillExtrusionFloodLightIntensityAsExpression$annotations", "getDefaultFillExtrusionFloodLightIntensityAsExpression", "defaultFillExtrusionFloodLightIntensityTransition", "getDefaultFillExtrusionFloodLightIntensityTransition$annotations", "getDefaultFillExtrusionFloodLightIntensityTransition", "defaultFillExtrusionFloodLightWallRadius", "getDefaultFillExtrusionFloodLightWallRadius$annotations", "getDefaultFillExtrusionFloodLightWallRadius", "defaultFillExtrusionFloodLightWallRadiusAsExpression", "getDefaultFillExtrusionFloodLightWallRadiusAsExpression$annotations", "getDefaultFillExtrusionFloodLightWallRadiusAsExpression", "defaultFillExtrusionFloodLightWallRadiusTransition", "getDefaultFillExtrusionFloodLightWallRadiusTransition$annotations", "getDefaultFillExtrusionFloodLightWallRadiusTransition", "defaultFillExtrusionHeight", "getDefaultFillExtrusionHeight", "defaultFillExtrusionHeightAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "getDefaultFillExtrusionHeightAlignment$annotations", "getDefaultFillExtrusionHeightAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "defaultFillExtrusionHeightAlignmentAsExpression", "getDefaultFillExtrusionHeightAlignmentAsExpression$annotations", "getDefaultFillExtrusionHeightAlignmentAsExpression", "defaultFillExtrusionHeightAsExpression", "getDefaultFillExtrusionHeightAsExpression", "defaultFillExtrusionHeightTransition", "getDefaultFillExtrusionHeightTransition", "defaultFillExtrusionLineWidth", "getDefaultFillExtrusionLineWidth$annotations", "getDefaultFillExtrusionLineWidth", "defaultFillExtrusionLineWidthAsExpression", "getDefaultFillExtrusionLineWidthAsExpression$annotations", "getDefaultFillExtrusionLineWidthAsExpression", "defaultFillExtrusionLineWidthTransition", "getDefaultFillExtrusionLineWidthTransition$annotations", "getDefaultFillExtrusionLineWidthTransition", "defaultFillExtrusionOpacity", "getDefaultFillExtrusionOpacity", "defaultFillExtrusionOpacityAsExpression", "getDefaultFillExtrusionOpacityAsExpression", "defaultFillExtrusionOpacityTransition", "getDefaultFillExtrusionOpacityTransition", "defaultFillExtrusionPattern", "getDefaultFillExtrusionPattern", "defaultFillExtrusionPatternAsExpression", "getDefaultFillExtrusionPatternAsExpression", "defaultFillExtrusionPatternCrossFade", "getDefaultFillExtrusionPatternCrossFade", "defaultFillExtrusionPatternCrossFadeAsExpression", "getDefaultFillExtrusionPatternCrossFadeAsExpression", "defaultFillExtrusionRoundedRoof", "getDefaultFillExtrusionRoundedRoof$annotations", "getDefaultFillExtrusionRoundedRoof", "defaultFillExtrusionRoundedRoofAsExpression", "getDefaultFillExtrusionRoundedRoofAsExpression$annotations", "getDefaultFillExtrusionRoundedRoofAsExpression", "defaultFillExtrusionTranslate", "", "getDefaultFillExtrusionTranslate", "()Ljava/util/List;", "defaultFillExtrusionTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "getDefaultFillExtrusionTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "defaultFillExtrusionTranslateAnchorAsExpression", "getDefaultFillExtrusionTranslateAnchorAsExpression", "defaultFillExtrusionTranslateAsExpression", "getDefaultFillExtrusionTranslateAsExpression", "defaultFillExtrusionTranslateTransition", "getDefaultFillExtrusionTranslateTransition", "defaultFillExtrusionVerticalGradient", "getDefaultFillExtrusionVerticalGradient", "defaultFillExtrusionVerticalGradientAsExpression", "getDefaultFillExtrusionVerticalGradientAsExpression", "defaultFillExtrusionVerticalScale", "getDefaultFillExtrusionVerticalScale$annotations", "getDefaultFillExtrusionVerticalScale", "defaultFillExtrusionVerticalScaleAsExpression", "getDefaultFillExtrusionVerticalScaleAsExpression$annotations", "getDefaultFillExtrusionVerticalScaleAsExpression", "defaultFillExtrusionVerticalScaleTransition", "getDefaultFillExtrusionVerticalScaleTransition$annotations", "getDefaultFillExtrusionVerticalScaleTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultFillExtrusionAmbientOcclusionGroundAttenuation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation");
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
            Double defaultFillExtrusionAmbientOcclusionGroundAttenuation = getDefaultFillExtrusionAmbientOcclusionGroundAttenuation();
            if (defaultFillExtrusionAmbientOcclusionGroundAttenuation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionGroundAttenuation.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionAmbientOcclusionGroundRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius");
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
            Double defaultFillExtrusionAmbientOcclusionGroundRadius = getDefaultFillExtrusionAmbientOcclusionGroundRadius();
            if (defaultFillExtrusionAmbientOcclusionGroundRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionGroundRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionAmbientOcclusionIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionAmbientOcclusionIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity");
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
            Double defaultFillExtrusionAmbientOcclusionIntensity = getDefaultFillExtrusionAmbientOcclusionIntensity();
            if (defaultFillExtrusionAmbientOcclusionIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionIntensity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionIntensityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionAmbientOcclusionRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionAmbientOcclusionRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius");
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
            Double defaultFillExtrusionAmbientOcclusionRadius = getDefaultFillExtrusionAmbientOcclusionRadius();
            if (defaultFillExtrusionAmbientOcclusionRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionAmbientOcclusionWallRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius");
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
            Double defaultFillExtrusionAmbientOcclusionWallRadius = getDefaultFillExtrusionAmbientOcclusionWallRadius();
            if (defaultFillExtrusionAmbientOcclusionWallRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionWallRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionBase() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final FillExtrusionBaseAlignment getDefaultFillExtrusionBaseAlignment() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-alignment");
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
            FillExtrusionBaseAlignment.Companion companion = FillExtrusionBaseAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultFillExtrusionBaseAlignmentAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-alignment");
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
            FillExtrusionBaseAlignment defaultFillExtrusionBaseAlignment = getDefaultFillExtrusionBaseAlignment();
            if (defaultFillExtrusionBaseAlignment != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionBaseAlignment.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionBaseAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base");
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
            Double defaultFillExtrusionBase = getDefaultFillExtrusionBase();
            if (defaultFillExtrusionBase == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionBase.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionBaseTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Boolean getDefaultFillExtrusionCastShadows() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cast-shadows");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionCastShadowsAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cast-shadows");
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
            Boolean defaultFillExtrusionCastShadows = getDefaultFillExtrusionCastShadows();
            if (defaultFillExtrusionCastShadows == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionCastShadows.booleanValue());
        }

        @Nullable
        public final String getDefaultFillExtrusionColor() {
            Expression defaultFillExtrusionColorAsExpression = getDefaultFillExtrusionColorAsExpression();
            if (defaultFillExtrusionColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillExtrusionColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillExtrusionColorAsColorInt() {
            Expression defaultFillExtrusionColorAsExpression = getDefaultFillExtrusionColorAsExpression();
            if (defaultFillExtrusionColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillExtrusionColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color");
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
        public final StyleTransition getDefaultFillExtrusionColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillExtrusionColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-use-theme");
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
            String defaultFillExtrusionColorUseTheme = getDefaultFillExtrusionColorUseTheme();
            if (defaultFillExtrusionColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillExtrusionCutoffFadeRange() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cutoff-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionCutoffFadeRangeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cutoff-fade-range");
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
            Double defaultFillExtrusionCutoffFadeRange = getDefaultFillExtrusionCutoffFadeRange();
            if (defaultFillExtrusionCutoffFadeRange == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionCutoffFadeRange.doubleValue());
        }

        @Nullable
        public final Double getDefaultFillExtrusionEdgeRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-edge-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionEdgeRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-edge-radius");
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
            Double defaultFillExtrusionEdgeRadius = getDefaultFillExtrusionEdgeRadius();
            if (defaultFillExtrusionEdgeRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionEdgeRadius.doubleValue());
        }

        @Nullable
        public final Double getDefaultFillExtrusionEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength");
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
            Double defaultFillExtrusionEmissiveStrength = getDefaultFillExtrusionEmissiveStrength();
            if (defaultFillExtrusionEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillExtrusionFloodLightColor() {
            Expression defaultFillExtrusionFloodLightColorAsExpression = getDefaultFillExtrusionFloodLightColorAsExpression();
            if (defaultFillExtrusionFloodLightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillExtrusionFloodLightColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultFillExtrusionFloodLightColorAsColorInt() {
            Expression defaultFillExtrusionFloodLightColorAsExpression = getDefaultFillExtrusionFloodLightColorAsExpression();
            if (defaultFillExtrusionFloodLightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillExtrusionFloodLightColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color");
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
        public final StyleTransition getDefaultFillExtrusionFloodLightColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillExtrusionFloodLightColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-use-theme");
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
            String defaultFillExtrusionFloodLightColorUseTheme = getDefaultFillExtrusionFloodLightColorUseTheme();
            if (defaultFillExtrusionFloodLightColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillExtrusionFloodLightGroundAttenuation() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation");
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
            Double defaultFillExtrusionFloodLightGroundAttenuation = getDefaultFillExtrusionFloodLightGroundAttenuation();
            if (defaultFillExtrusionFloodLightGroundAttenuation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightGroundAttenuation.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionFloodLightGroundAttenuationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionFloodLightGroundRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightGroundRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius");
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
            Double defaultFillExtrusionFloodLightGroundRadius = getDefaultFillExtrusionFloodLightGroundRadius();
            if (defaultFillExtrusionFloodLightGroundRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightGroundRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionFloodLightGroundRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionFloodLightIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity");
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
            Double defaultFillExtrusionFloodLightIntensity = getDefaultFillExtrusionFloodLightIntensity();
            if (defaultFillExtrusionFloodLightIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightIntensity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionFloodLightIntensityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionFloodLightWallRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionFloodLightWallRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius");
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
            Double defaultFillExtrusionFloodLightWallRadius = getDefaultFillExtrusionFloodLightWallRadius();
            if (defaultFillExtrusionFloodLightWallRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightWallRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionFloodLightWallRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionHeight() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final FillExtrusionHeightAlignment getDefaultFillExtrusionHeightAlignment() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-alignment");
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
            FillExtrusionHeightAlignment.Companion companion = FillExtrusionHeightAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultFillExtrusionHeightAlignmentAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-alignment");
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
            FillExtrusionHeightAlignment defaultFillExtrusionHeightAlignment = getDefaultFillExtrusionHeightAlignment();
            if (defaultFillExtrusionHeightAlignment != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionHeightAlignment.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionHeightAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height");
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
            Double defaultFillExtrusionHeight = getDefaultFillExtrusionHeight();
            if (defaultFillExtrusionHeight == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionHeight.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionHeightTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionLineWidth() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionLineWidthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width");
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
            Double defaultFillExtrusionLineWidth = getDefaultFillExtrusionLineWidth();
            if (defaultFillExtrusionLineWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionLineWidth.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionLineWidthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultFillExtrusionOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity");
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
            Double defaultFillExtrusionOpacity = getDefaultFillExtrusionOpacity();
            if (defaultFillExtrusionOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultFillExtrusionPattern() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionPatternAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern");
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
            String defaultFillExtrusionPattern = getDefaultFillExtrusionPattern();
            if (defaultFillExtrusionPattern != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionPattern);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultFillExtrusionPatternCrossFade() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionPatternCrossFadeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern-cross-fade");
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
            Double defaultFillExtrusionPatternCrossFade = getDefaultFillExtrusionPatternCrossFade();
            if (defaultFillExtrusionPatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionPatternCrossFade.doubleValue());
        }

        @Nullable
        public final Boolean getDefaultFillExtrusionRoundedRoof() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-rounded-roof");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionRoundedRoofAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-rounded-roof");
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
            Boolean defaultFillExtrusionRoundedRoof = getDefaultFillExtrusionRoundedRoof();
            if (defaultFillExtrusionRoundedRoof == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionRoundedRoof.booleanValue());
        }

        @Nullable
        public final List<Double> getDefaultFillExtrusionTranslate() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final FillExtrusionTranslateAnchor getDefaultFillExtrusionTranslateAnchor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-anchor");
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
            FillExtrusionTranslateAnchor.Companion companion = FillExtrusionTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultFillExtrusionTranslateAnchorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-anchor");
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
            FillExtrusionTranslateAnchor defaultFillExtrusionTranslateAnchor = getDefaultFillExtrusionTranslateAnchor();
            if (defaultFillExtrusionTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionTranslateAnchor.getValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionTranslateAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate");
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
            List<Double> defaultFillExtrusionTranslate = getDefaultFillExtrusionTranslate();
            if (defaultFillExtrusionTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultFillExtrusionTranslate);
            }
            return null;
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionTranslateTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Boolean getDefaultFillExtrusionVerticalGradient() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-gradient");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionVerticalGradientAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-gradient");
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
            Boolean defaultFillExtrusionVerticalGradient = getDefaultFillExtrusionVerticalGradient();
            if (defaultFillExtrusionVerticalGradient == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionVerticalGradient.booleanValue());
        }

        @Nullable
        public final Double getDefaultFillExtrusionVerticalScale() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultFillExtrusionVerticalScaleAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale");
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
            Double defaultFillExtrusionVerticalScale = getDefaultFillExtrusionVerticalScale();
            if (defaultFillExtrusionVerticalScale == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionVerticalScale.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultFillExtrusionVerticalScaleTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "visibility");
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
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionBaseAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionBaseAlignmentAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionEdgeRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionEdgeRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionHeightAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionHeightAlignmentAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidth$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidthAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidthTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionRoundedRoof$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionRoundedRoofAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScale$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScaleAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScaleTransition$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionBaseAlignment(@NotNull Expression fillExtrusionBaseAlignment) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionBaseAlignment, "fill-extrusion-base-alignment", fillExtrusionBaseAlignment, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionColorUseTheme(@NotNull Expression fillExtrusionColorUseTheme) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionColorUseTheme, "fill-extrusion-color-use-theme", fillExtrusionColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(@NotNull Expression fillExtrusionFloodLightColorUseTheme) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightColorUseTheme, "fill-extrusion-flood-light-color-use-theme", fillExtrusionFloodLightColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionHeightAlignment(@NotNull Expression fillExtrusionHeightAlignment) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionHeightAlignment, "fill-extrusion-height-alignment", fillExtrusionHeightAlignment, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionPattern(@NotNull Expression fillExtrusionPattern) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionPattern, "fill-extrusion-pattern", fillExtrusionPattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslate(@NotNull Expression fillExtrusionTranslate) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionTranslate, "fill-extrusion-translate", fillExtrusionTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslateAnchor(@NotNull Expression fillExtrusionTranslateAnchor) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionTranslateAnchor, "fill-extrusion-translate-anchor", fillExtrusionTranslateAnchor, this);
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionBaseAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionBaseAlignmentAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionEdgeRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionEdgeRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionHeightAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionHeightAlignmentAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidth$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidthAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionRoundedRoof$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionRoundedRoofAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScale$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScaleAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScaleTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(@NotNull Expression fillExtrusionAmbientOcclusionGroundAttenuation) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionAmbientOcclusionGroundAttenuation, "fill-extrusion-ambient-occlusion-ground-attenuation", fillExtrusionAmbientOcclusionGroundAttenuation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(@NotNull Expression fillExtrusionAmbientOcclusionGroundRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionAmbientOcclusionGroundRadius, "fill-extrusion-ambient-occlusion-ground-radius", fillExtrusionAmbientOcclusionGroundRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(@NotNull Expression fillExtrusionAmbientOcclusionIntensity) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionAmbientOcclusionIntensity, "fill-extrusion-ambient-occlusion-intensity", fillExtrusionAmbientOcclusionIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(@NotNull Expression fillExtrusionAmbientOcclusionRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionAmbientOcclusionRadius, "fill-extrusion-ambient-occlusion-radius", fillExtrusionAmbientOcclusionRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(@NotNull Expression fillExtrusionAmbientOcclusionWallRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionAmbientOcclusionWallRadius, "fill-extrusion-ambient-occlusion-wall-radius", fillExtrusionAmbientOcclusionWallRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionBase(@NotNull Expression fillExtrusionBase) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionBase, "fill-extrusion-base", fillExtrusionBase, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionCastShadows(@NotNull Expression fillExtrusionCastShadows) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionCastShadows, "fill-extrusion-cast-shadows", fillExtrusionCastShadows, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionCutoffFadeRange(@NotNull Expression fillExtrusionCutoffFadeRange) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionCutoffFadeRange, "fill-extrusion-cutoff-fade-range", fillExtrusionCutoffFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionEdgeRadius(@NotNull Expression fillExtrusionEdgeRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionEdgeRadius, "fill-extrusion-edge-radius", fillExtrusionEdgeRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionEmissiveStrength(@NotNull Expression fillExtrusionEmissiveStrength) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionEmissiveStrength, "fill-extrusion-emissive-strength", fillExtrusionEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(@NotNull Expression fillExtrusionFloodLightGroundAttenuation) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightGroundAttenuation, "fill-extrusion-flood-light-ground-attenuation", fillExtrusionFloodLightGroundAttenuation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadius(@NotNull Expression fillExtrusionFloodLightGroundRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightGroundRadius, "fill-extrusion-flood-light-ground-radius", fillExtrusionFloodLightGroundRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightIntensity(@NotNull Expression fillExtrusionFloodLightIntensity) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightIntensity, "fill-extrusion-flood-light-intensity", fillExtrusionFloodLightIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightWallRadius(@NotNull Expression fillExtrusionFloodLightWallRadius) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightWallRadius, "fill-extrusion-flood-light-wall-radius", fillExtrusionFloodLightWallRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionHeight(@NotNull Expression fillExtrusionHeight) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionHeight, "fill-extrusion-height", fillExtrusionHeight, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionLineWidth(@NotNull Expression fillExtrusionLineWidth) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionLineWidth, "fill-extrusion-line-width", fillExtrusionLineWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionOpacity(@NotNull Expression fillExtrusionOpacity) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionOpacity, "fill-extrusion-opacity", fillExtrusionOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionPatternCrossFade(@NotNull Expression fillExtrusionPatternCrossFade) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionPatternCrossFade, "fill-extrusion-pattern-cross-fade", fillExtrusionPatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionRoundedRoof(@NotNull Expression fillExtrusionRoundedRoof) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionRoundedRoof, "fill-extrusion-rounded-roof", fillExtrusionRoundedRoof, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalGradient(@NotNull Expression fillExtrusionVerticalGradient) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionVerticalGradient, "fill-extrusion-vertical-gradient", fillExtrusionVerticalGradient, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalScale(@NotNull Expression fillExtrusionVerticalScale) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionVerticalScale, "fill-extrusion-vertical-scale", fillExtrusionVerticalScale, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public FillExtrusionLayer visibility(@NotNull Expression visibility) {
        RegionDefaults$$ExternalSyntheticOutline0.m(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionColor(@NotNull Expression fillExtrusionColor) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionColor, "fill-extrusion-color", fillExtrusionColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColor(@NotNull Expression fillExtrusionFloodLightColor) {
        RegionDefaults$$ExternalSyntheticOutline0.m(fillExtrusionFloodLightColor, "fill-extrusion-flood-light-color", fillExtrusionFloodLightColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-attenuation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-wall-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionBaseTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionColor(@NotNull String fillExtrusionColor) {
        fillExtrusionColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color", fillExtrusionColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColor(@NotNull String fillExtrusionFloodLightColor) {
        fillExtrusionFloodLightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color", fillExtrusionFloodLightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-attenuation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-wall-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionHeightTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionLineWidthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-line-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @NotNull
    public FillExtrusionLayer fillExtrusionTranslateTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    @NotNull
    public FillExtrusionLayer fillExtrusionVerticalScaleTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-scale-transition", options));
        return this;
    }
}
