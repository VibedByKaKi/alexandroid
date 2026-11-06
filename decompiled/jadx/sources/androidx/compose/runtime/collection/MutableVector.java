package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.react.uimanager.ViewProps;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003uvwB!\b\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086\bJ\u0017\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010$J\u001c\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J(\u0010&\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010)\u001a\u00020\u001b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0006\u0010+\u001a\u00020\u001eJ\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001dJ\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010-\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0011\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0007H\u0086\bJ\u0010\u00102\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0007H\u0001J\u000b\u00103\u001a\u00028\u0000¢\u0006\u0002\u00104J-\u00103\u001a\u00028\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u000207H\u0081\bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001J\u0010\u0010:\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00104J/\u0010:\u001a\u0004\u0018\u00018\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105JP\u0010;\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2'\u0010>\u001a#\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010CJe\u0010D\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2<\u0010>\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010FJP\u0010G\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2'\u0010>\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010CJe\u0010H\u001a\u0002H<\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u0002H<2<\u0010>\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H<¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u0002H<0EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010FJ(\u0010I\u001a\u00020\u001e2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010K\u001a\u00020\u001e2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010L\u001a\u00020\u001e2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010M\u001a\u00020\u001e2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010N\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0086\n¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010QJ(\u0010R\u001a\u00020\u00072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010S\u001a\u00020\u00072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010T\u001a\u00020\u001bH\u0086\bJ\t\u0010U\u001a\u00020\u001bH\u0086\bJ\u000b\u0010V\u001a\u00028\u0000¢\u0006\u0002\u00104J-\u0010V\u001a\u00028\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J\u0013\u0010W\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010QJ\u0010\u0010X\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u00104J/\u0010X\u001a\u0004\u0018\u00018\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00105J;\u0010Y\u001a\b\u0012\u0004\u0012\u0002H<0\u0005\"\u0006\b\u0001\u0010<\u0018\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010[JP\u0010\\\u001a\b\u0012\u0004\u0012\u0002H<0\u0005\"\u0006\b\u0001\u0010<\u0018\u00012'\u0010Z\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010]JM\u0010^\u001a\b\u0012\u0004\u0012\u0002H<0\u0000\"\u0006\b\u0001\u0010<\u0018\u00012)\u0010Z\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H<0?H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010_\u001a\b\u0012\u0004\u0012\u0002H<0\u0000\"\u0006\b\u0001\u0010<\u0018\u00012\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H<0(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010`\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010aJ\u0016\u0010b\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010aJ\u0013\u0010c\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010d\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u0013\u0010e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0002\u0010OJ\u0016\u0010f\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007J\u0010\u0010i\u001a\u00020\u001e2\u0006\u0010j\u001a\u00020\u0007H\u0001J\u001d\u0010k\u001a\u00020\u001e2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0(H\u0086\bJ\u0014\u0010l\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000%J\u001e\u0010m\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010nJ\u001e\u0010o\u001a\u00020\u001e2\u0016\u0010p\u001a\u0012\u0012\u0004\u0012\u00028\u00000qj\b\u0012\u0004\u0012\u00028\u0000`rJ(\u0010s\u001a\u00020\u00072\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070(H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u00158Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006x"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "<init>", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "[Ljava/lang/Object;", "list", "", "value", "getSize", "()I", "lastIndex", "getLastIndex", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "getContent", "()[Ljava/lang/Object;", BulkOperationType.add, "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "([Ljava/lang/Object;)Z", "", Languages.ANY, "predicate", "Lkotlin/Function1;", "reversedAny", "asMutableList", MetricsConstants.Method.CACHE_CLEAR, "contains", "containsAll", "contentEquals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ensureCapacity", "capacity", "resizeStorage", DefaultPreloadManager.METRIC_PATH_FIRST, "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "throwNoSuchElementException", "", "message", "", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", MetricsConstants.Method.CACHE_GET, "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", BuildConfig.FLAVOR_authType, ViewProps.TRANSFORM, "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", BulkOperationType.remove, "removeAll", "removeAt", "removeRange", "start", "end", "setSize", "newSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "VectorListIterator", "MutableVectorList", "SubList", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1116:1\n289#1,4:1117\n289#1,4:1121\n289#1,4:1127\n289#1,4:1133\n289#1,4:1141\n289#1,4:1147\n44#1:1157\n472#1:1158\n48#1:1161\n472#1:1162\n44#1:1163\n472#1:1164\n516#1:1167\n332#1:1168\n472#1:1169\n516#1:1170\n472#1:1171\n516#1:1172\n44#1:1173\n472#1:1174\n516#1:1175\n44#1:1176\n472#1:1177\n472#1:1178\n472#1:1179\n44#1:1180\n472#1:1181\n44#1:1184\n44#1:1189\n44#1:1190\n472#1:1191\n27#2,2:1125\n27#2,2:1131\n27#2,2:1137\n27#2,2:1139\n27#2,2:1145\n27#2,2:1151\n27#2,2:1165\n27#2,2:1185\n27#2,2:1187\n1872#3,3:1153\n1863#3,2:1159\n1863#3,2:1182\n1#4:1156\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1117,4\n66#1:1121,4\n87#1:1127,4\n111#1:1133,4\n156#1:1141,4\n169#1:1147,4\n234#1:1157\n235#1:1158\n265#1:1161\n266#1:1162\n279#1:1163\n280#1:1164\n309#1:1167\n310#1:1168\n312#1:1169\n340#1:1170\n340#1:1171\n526#1:1172\n529#1:1173\n529#1:1174\n563#1:1175\n563#1:1176\n563#1:1177\n588#1:1178\n598#1:1179\n680#1:1180\n681#1:1181\n702#1:1184\n727#1:1189\n761#1:1190\n762#1:1191\n69#1:1125,2\n90#1:1131,2\n114#1:1137,2\n121#1:1139,2\n157#1:1145,2\n172#1:1151,2\n300#1:1165,2\n703#1:1185,2\n719#1:1187,2\n179#1:1153,3\n256#1:1159,2\n694#1:1182,2\n*E\n"})
/* loaded from: classes13.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public T[] content;

    @Nullable
    private List<T> list;
    private int size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\r\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "", "index", "", "<init>", "(Ljava/util/List;I)V", "hasNext", "", "next", "()Ljava/lang/Object;", BulkOperationType.remove, "", "hasPrevious", "nextIndex", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "previousIndex", BulkOperationType.add, "element", "(Ljava/lang/Object;)V", "set", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;

        @NotNull
        private final List<T> list;

        public VectorListIterator(@NotNull List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @PublishedApi
    public MutableVector(@NotNull T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    public final void add(int index, T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(tArr, index, tArr, index + 1, i2 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(tArr, index, tArr, index + size, i3 - index);
        }
        for (T t : elements) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i + index] = t;
            i = i4;
        }
        this.size += size;
        return true;
    }

    public final boolean any(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (predicate.invoke(tArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.areEqual(this.content[i], element); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        IntRange until = RangesKt.until(0, elements.getSize());
        int first = until.getFirst();
        int last = until.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.content[first])) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.areEqual(other.content[i], this.content[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        if (this.content.length < capacity) {
            resizeStorage(capacity);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r3 = (Object) tArr[i];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Nullable
    public final T firstOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r2 = (Object) tArr[i];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = operation.invoke(initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = operation.invoke(Integer.valueOf(i), initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(Integer.valueOf(size), tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(tArr[i]);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(Integer.valueOf(i), tArr[i]);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super T, Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int index) {
        return this.content[index];
    }

    @PublishedApi
    @NotNull
    public final T[] getContent() {
        return this.content;
    }

    @NotNull
    public final IntRange getIndices() {
        return RangesKt.until(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T element) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.areEqual(element, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (predicate.invoke(tArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (Object) tArr[size];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public final int lastIndexOf(T element) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(element, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @Nullable
    public final T lastOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r1 = (Object) tArr[size];
            if (predicate.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(Integer.valueOf(i), this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R invoke = transform.invoke(Integer.valueOf(i2), tArr[i2]);
            if (invoke != null) {
                objArr[i] = invoke;
                i++;
            }
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R invoke = transform.invoke(tArr[i2]);
            if (invoke != null) {
                objArr[i] = invoke;
                i++;
            }
        }
        return new MutableVector<>(objArr, i);
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final boolean remove(T element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        return i != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t = tArr[index];
        if (index != getSize() - 1) {
            int i = index + 1;
            System.arraycopy(tArr, i, tArr, index, this.size - i);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeIf(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            T[] tArr = this.content;
            if (i >= size) {
                int i3 = size - i2;
                ArraysKt.fill(tArr, (Object) null, i3, size);
                setSize(i3);
                return;
            } else {
                if (predicate.invoke(tArr[i]).booleanValue()) {
                    i2++;
                } else if (i2 > 0) {
                    T[] tArr2 = this.content;
                    tArr2[i - i2] = tArr2[i];
                }
                i++;
            }
        }
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i - end);
            }
            int i2 = this.size - (end - start);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.size = i2;
        }
    }

    @PublishedApi
    public final void resizeStorage(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final boolean reversedAny(@NotNull Function1<? super T, Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t = tArr[index];
        tArr[index] = element;
        return t;
    }

    @PublishedApi
    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@NotNull Function1<? super T, Integer> selector) {
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < getSize(); i2++) {
            i += selector.invoke(tArr[i2]).intValue();
        }
        return i;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0096\u0002J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u001e\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", MetricsConstants.Method.CACHE_GET, "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", BulkOperationType.add, "", "(ILjava/lang/Object;)V", "addAll", MetricsConstants.Method.CACHE_CLEAR, "listIterator", "", BulkOperationType.remove, "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1116:1\n472#2:1117\n516#2:1118\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n852#1:1117\n857#1:1118\n*E\n"})
    public static final class MutableVectorList<T> implements List<T>, KMutableList {

        @NotNull
        private final MutableVector<T> vector;

        public MutableVectorList(@NotNull MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.add(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            return this.vector.addAll(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<?> elements) {
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.content[index];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<?> elements) {
            return this.vector.removeAll(elements);
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<?> elements) {
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.set(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.add(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            return this.vector.addAll(elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\rH\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0016\u0010\u001f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000fJ\u0016\u0010$\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0015J\u0016\u0010&\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u001e\u0010'\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "start", "", "end", "<init>", "(Ljava/util/List;II)V", "size", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", MetricsConstants.Method.CACHE_GET, "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", BulkOperationType.add, "", "(ILjava/lang/Object;)V", "addAll", MetricsConstants.Method.CACHE_CLEAR, "listIterator", "", BulkOperationType.remove, "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1116:1\n1863#2,2:1117\n1863#2,2:1119\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n924#1:1117,2\n1008#1:1119,2\n*E\n"})
    public static final class SubList<T> implements List<T>, KMutableList {
        private int end;

        @NotNull
        private final List<T> list;
        private final int start;

        public SubList(@NotNull List<T> list, int i, int i2) {
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<?> elements) {
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.get(index + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<?> elements) {
            int i = this.end;
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                remove(it2.next());
            }
            return i != this.end;
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<?> elements) {
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, element);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException(@NotNull String message) {
        throw new NoSuchElementException(message);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @Nullable
    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    @Nullable
    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean add(T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = element;
        this.size = i2 + 1;
        return true;
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.content[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        int i = this.size;
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
        return i != this.size;
    }

    public final boolean addAll(int index, @NotNull MutableVector<T> elements) {
        int i = elements.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size + i;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(tArr, index, tArr, index + i, i3 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i);
        this.size += i;
        return true;
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        int length = elements.length;
        if (length == 0) {
            return false;
        }
        int i = this.size + length;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        System.arraycopy(elements, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int index, @NotNull List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i = this.size + size;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(tArr, index, tArr, index + size, i2 - index);
        }
        int size2 = elements.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tArr[index + i3] = elements.get(i3);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }
}
