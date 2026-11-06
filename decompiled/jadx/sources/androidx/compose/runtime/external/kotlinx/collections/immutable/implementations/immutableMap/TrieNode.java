package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.dee.app.metrics.MetricsConstants;
import com.mapbox.common.HttpHeaders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ~*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002}~B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\u000b\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0002J\r\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\"J!\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J1\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010(J9\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0002\u0010+J)\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010-J=\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002¢\u0006\u0002\u00101J8\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J8\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010*\u001a\u00020\nH\u0002J&\u00105\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J.\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\nH\u0002JO\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010<JI\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010>JQ\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0002\u0010@J[\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00028\u00002\u0006\u0010D\u001a\u00028\u00012\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00028\u00002\u0006\u0010G\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J:\u0010J\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002J\u001e\u0010K\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010L\u001a\u00020\u0005H\u0002J2\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010L\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002J\u0015\u0010N\u001a\u00020\u00182\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010OJ\u0017\u0010P\u001a\u0004\u0018\u00018\u00012\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010QJ+\u0010R\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010SJ=\u0010T\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002¢\u0006\u0002\u0010UJ#\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010WJ7\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00028\u00002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002¢\u0006\u0002\u0010YJ+\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010ZJ?\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002¢\u0006\u0002\u0010UJ8\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010*\u001a\u00020\nH\u0002JT\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0006\u0010]\u001a\u00020^2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002J\b\u0010`\u001a\u00020\u0005H\u0002J\u001c\u0010a\u001a\u00020\u00182\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J#\u0010b\u001a\u00020\u00182\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010dJ%\u0010e\u001a\u0004\u0018\u00018\u00012\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010fJJ\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00052\u0006\u0010]\u001a\u00020^2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100J9\u0010h\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010iJK\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0002\u0010kJ1\u0010l\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010mJP\u0010n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002JE\u0010p\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0002\u0010qJX\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\nH\u0002J9\u0010l\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0002\u0010sJM\u0010p\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010c\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0002\u0010kJ\u0091\u0001\u0010t\u001a\u00020u2\u0081\u0001\u0010v\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(z\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b({\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020u0wH\u0000¢\u0006\u0002\b|J\u009c\u0001\u0010t\u001a\u00020u2\u0081\u0001\u0010v\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(z\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b({\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020u0w2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u007f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "dataMap", "", "nodeMap", "buffer", "", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "asInsertResult", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "value", "getBuffer$runtime", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "entryCount", "entryCount$runtime", "hasEntryAt", "", "positionMask", "hasEntryAt$runtime", "hasNodeAt", "entryKeyIndex", "entryKeyIndex$runtime", "nodeIndex", "nodeIndex$runtime", "keyAtIndex", "keyIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", "nodeAtIndex", "nodeAtIndex$runtime", "insertEntryAt", "key", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableInsertEntryAt", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateValueAtIndex", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateNodeAtIndex", "newNode", "mutableUpdateNodeAtIndex", "removeNodeAtIndex", "mutableRemoveNodeAtIndex", "bufferMoveEntryToNode", "newKeyHash", "newKey", "newValue", "shift", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "collisionRemoveEntryAtIndex", "i", "mutableCollisionRemoveEntryAtIndex", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "otherNode", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutablePutAllFromOtherNodeCell", "calculateSize", "elementsIdentityEquals", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", MetricsConstants.Method.CACHE_GET, "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", MetricsConstants.Method.CACHE_PUT, "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", BulkOperationType.remove, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "replaceNode", "targetNode", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableReplaceNode", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", HttpHeaders.ACCEPT, "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "hash", "accept$runtime", "ModificationResult", "Companion", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:913\n10#2,9:922\n58#3,4:909\n84#4:931\n1#5:932\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:913,9\n652#1:922,9\n640#1:909,4\n700#1:931\n700#1:932\n*E\n"})
/* loaded from: classes13.dex */
public final class TrieNode<K, V> {

    @NotNull
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;

    @Nullable
    private final MutabilityOwnership ownedBy;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0011\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0012H\u0086\bR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;

        @NotNull
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i, int i2, @NotNull Object[] objArr, @Nullable MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor, int hash, int shift) {
        visitor.invoke(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i = this.nodeMap;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            nodeAtIndex$runtime(nodeIndex$runtime(lowestOneBit)).accept(visitor, (Integer.numberOfTrailingZeros(lowestOneBit) << shift) + hash, shift + 5);
            i -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        Object[] replaceEntryWithNode;
        K keyAtIndex = keyAtIndex(keyIndex);
        replaceEntryWithNode = TrieNodeKt.replaceEntryWithNode(this.buffer, keyIndex, nodeIndex$runtime(positionMask) + 1, makeNode(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
        return replaceEntryWithNode;
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K key) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, this.buffer[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K key) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
            if (first == last) {
                return null;
            }
            first += step2;
        }
        return valueAtKeyIndex(first);
    }

    private final ModificationResult<K, V> collisionPut(K key, V value) {
        IntProgression step;
        Object[] insertEntryAtIndex;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            if (value == valueAtKeyIndex(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[first + 1] = value;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value);
        return new TrieNode(0, 0, insertEntryAtIndex).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K key, V value) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(key, keyAtIndex(first)) || !Intrinsics.areEqual(value, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step2;
                } else {
                    return collisionRemoveEntryAtIndex(first);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
        return new TrieNode<>(0, 0, removeEntryAtIndex);
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int positionMask) {
        return (this.nodeMap & positionMask) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int positionMask, K key, V value) {
        Object[] insertEntryAtIndex;
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(positionMask), key, value);
        return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, insertEntryAtIndex);
    }

    private final K keyAtIndex(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final TrieNode<K, V> makeNode(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int indexSegment = TrieNodeKt.indexSegment(keyHash1, shift);
        int indexSegment2 = TrieNodeKt.indexSegment(keyHash2, shift);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final TrieNode<K, V> moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new TrieNode<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        IntProgression step;
        Object[] insertEntryAtIndex;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            mutator.setOperationResult$runtime(valueAtKeyIndex(first));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[first + 1] = value;
                return this;
            }
            mutator.setModCount$runtime(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[first + 1] = value;
            return new TrieNode<>(0, 0, copyOf, mutator.getOwnership());
        }
        mutator.setSize(mutator.size() + 1);
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value);
        return new TrieNode<>(0, 0, insertEntryAtIndex, mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        IntProgression step;
        CommonFunctionsKt.m4079assert(this.nodeMap == 0);
        CommonFunctionsKt.m4079assert(this.dataMap == 0);
        CommonFunctionsKt.m4079assert(otherNode.nodeMap == 0);
        CommonFunctionsKt.m4079assert(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        int length = this.buffer.length;
        step = RangesKt___RangesKt.step(RangesKt.until(0, otherNode.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (collisionContainsKey(otherNode.buffer[first])) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        return length == this.buffer.length ? this : length == otherNode.buffer.length ? otherNode : length == copyOf.length ? new TrieNode<>(0, 0, copyOf, owner) : new TrieNode<>(0, 0, Arrays.copyOf(copyOf, length), owner);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(key, keyAtIndex(first)) || !Intrinsics.areEqual(value, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step2;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(first, mutator);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> mutator) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = mutator.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
            return new TrieNode<>(0, 0, removeEntryAtIndex, mutator.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(objArr, i);
        this.buffer = removeEntryAtIndex2;
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int positionMask, K key, V value, MutabilityOwnership owner) {
        Object[] insertEntryAtIndex;
        Object[] insertEntryAtIndex2;
        int entryKeyIndex$runtime = entryKeyIndex$runtime(positionMask);
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != owner) {
            insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(objArr, entryKeyIndex$runtime, key, value);
            return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, insertEntryAtIndex, owner);
        }
        insertEntryAtIndex2 = TrieNodeKt.insertEntryAtIndex(objArr, entryKeyIndex$runtime, key, value);
        this.buffer = insertEntryAtIndex2;
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> mutator) {
        if (hasNodeAt(positionMask)) {
            TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(positionMask));
            if (otherNode.hasNodeAt(positionMask)) {
                return nodeAtIndex$runtime.mutablePutAll(otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.hasEntryAt$runtime(positionMask)) {
                return nodeAtIndex$runtime;
            }
            int entryKeyIndex$runtime = otherNode.entryKeyIndex$runtime(positionMask);
            K keyAtIndex = otherNode.keyAtIndex(entryKeyIndex$runtime);
            V valueAtKeyIndex = otherNode.valueAtKeyIndex(entryKeyIndex$runtime);
            int size = mutator.size();
            TrieNode<K, V> mutablePut = nodeAtIndex$runtime.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.setCount(intersectionCounter.getCount() + 1);
            }
            return mutablePut;
        }
        if (!otherNode.hasNodeAt(positionMask)) {
            int entryKeyIndex$runtime2 = entryKeyIndex$runtime(positionMask);
            K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime2);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime2);
            int entryKeyIndex$runtime3 = otherNode.entryKeyIndex$runtime(positionMask);
            K keyAtIndex3 = otherNode.keyAtIndex(entryKeyIndex$runtime3);
            return makeNode(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex2, keyAtIndex3 != null ? keyAtIndex3.hashCode() : 0, keyAtIndex3, otherNode.valueAtKeyIndex(entryKeyIndex$runtime3), shift + 5, mutator.getOwnership());
        }
        TrieNode<K, V> nodeAtIndex$runtime2 = otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask));
        if (!hasEntryAt$runtime(positionMask)) {
            return nodeAtIndex$runtime2;
        }
        int entryKeyIndex$runtime4 = entryKeyIndex$runtime(positionMask);
        K keyAtIndex4 = keyAtIndex(entryKeyIndex$runtime4);
        int i = shift + 5;
        if (!nodeAtIndex$runtime2.containsKey(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, i)) {
            return nodeAtIndex$runtime2.mutablePut(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, valueAtKeyIndex(entryKeyIndex$runtime4), i, mutator);
        }
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
        return nodeAtIndex$runtime2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder<K, V> mutator) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime(valueAtKeyIndex(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = mutator.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, keyIndex);
            return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, removeEntryAtIndex, mutator.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(objArr, keyIndex);
        this.buffer = removeEntryAtIndex2;
        this.dataMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        Object[] removeNodeAtIndex;
        Object[] removeNodeAtIndex2;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
            return new TrieNode<>(this.dataMap, this.nodeMap ^ positionMask, removeNodeAtIndex, owner);
        }
        removeNodeAtIndex2 = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        this.buffer = removeNodeAtIndex2;
        this.nodeMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        return newNode == null ? mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner) : (this.ownedBy == owner || targetNode != newNode) ? mutableUpdateNodeAtIndex(nodeIndex, newNode, owner) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<K, V> newNode, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[nodeIndex] = newNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, owner);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int keyIndex, V value, PersistentHashMapBuilder<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.setModCount$runtime(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutator.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int keyIndex, int positionMask) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, keyIndex);
        return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, removeEntryAtIndex);
    }

    private final TrieNode<K, V> removeNodeAtIndex(int nodeIndex, int positionMask) {
        Object[] removeNodeAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        return new TrieNode<>(this.dataMap, this.nodeMap ^ positionMask, removeNodeAtIndex);
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask) {
        return newNode == null ? removeNodeAtIndex(nodeIndex, positionMask) : targetNode != newNode ? updateNodeAtIndex(nodeIndex, positionMask, newNode) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode<K, V> newNode) {
        Object[] replaceNodeWithEntry;
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[nodeIndex] = newNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        replaceNodeWithEntry = TrieNodeKt.replaceNodeWithEntry(this.buffer, nodeIndex, entryKeyIndex$runtime(positionMask), objArr[0], objArr[1]);
        return new TrieNode<>(this.dataMap ^ positionMask, this.nodeMap ^ positionMask, replaceNodeWithEntry);
    }

    private final TrieNode<K, V> updateValueAtIndex(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    public final void accept$runtime(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        accept(visitor, 0, 0);
    }

    public final boolean containsKey(int keyHash, K key, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime(indexSegment)));
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        return shift == 30 ? nodeAtIndex$runtime.collisionContainsKey(key) : nodeAtIndex$runtime.containsKey(keyHash, key, shift + 5);
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime(int positionMask) {
        return Integer.bitCount(this.dataMap & (positionMask - 1)) * 2;
    }

    @Nullable
    public final V get(int keyHash, K key, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                return valueAtKeyIndex(entryKeyIndex$runtime);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        return shift == 30 ? nodeAtIndex$runtime.collisionGet(key) : nodeAtIndex$runtime.get(keyHash, key, shift + 5);
    }

    @NotNull
    /* renamed from: getBuffer$runtime, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime(int positionMask) {
        return (this.dataMap & positionMask) != 0;
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                mutator.setOperationResult$runtime(valueAtKeyIndex(entryKeyIndex$runtime));
                return valueAtKeyIndex(entryKeyIndex$runtime) == value ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime, value, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!hasNodeAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(indexSegment, key, value, mutator.getOwnership());
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        TrieNode<K, V> mutableCollisionPut = shift == 30 ? nodeAtIndex$runtime.mutableCollisionPut(key, value, mutator) : nodeAtIndex$runtime.mutablePut(keyHash, key, value, shift + 5, mutator);
        return nodeAtIndex$runtime == mutableCollisionPut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime, mutableCollisionPut, mutator.getOwnership());
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int shift, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        }
        int i = shift;
        if (i > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i2 = this.nodeMap | otherNode.nodeMap;
        int i3 = this.dataMap;
        int i4 = otherNode.dataMap;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime(lowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime(lowestOneBit)))) {
                i5 |= lowestOneBit;
            } else {
                i2 |= lowestOneBit;
            }
            i6 ^= lowestOneBit;
        }
        int i7 = 0;
        if (!((i2 & i5) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && this.dataMap == i5 && this.nodeMap == i2) ? this : new TrieNode<>(i5, i2, new Object[Integer.bitCount(i2) + (Integer.bitCount(i5) * 2)]);
        int i8 = i2;
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i8);
            Object[] objArr = trieNode.buffer;
            objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(otherNode, lowestOneBit2, i, intersectionCounter, mutator);
            i9++;
            i8 ^= lowestOneBit2;
            i = shift;
        }
        while (i5 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i5);
            int i10 = i7 * 2;
            if (otherNode.hasEntryAt$runtime(lowestOneBit3)) {
                int entryKeyIndex$runtime = otherNode.entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = otherNode.keyAtIndex(entryKeyIndex$runtime);
                trieNode.buffer[i10 + 1] = otherNode.valueAtKeyIndex(entryKeyIndex$runtime);
                if (hasEntryAt$runtime(lowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
            } else {
                int entryKeyIndex$runtime2 = entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = keyAtIndex(entryKeyIndex$runtime2);
                trieNode.buffer[i10 + 1] = valueAtKeyIndex(entryKeyIndex$runtime2);
            }
            i7++;
            i5 ^= lowestOneBit3;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder;
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) && Intrinsics.areEqual(value, valueAtKeyIndex(entryKeyIndex$runtime))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, mutator) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(key, value, mutator);
            persistentHashMapBuilder = mutator;
        } else {
            persistentHashMapBuilder = mutator;
            mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, value, shift + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, persistentHashMapBuilder.getOwnership());
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (positionMask - 1));
    }

    @Nullable
    public final ModificationResult<K, V> put(int keyHash, K key, V value, int shift) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (!Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                return moveEntryToNode(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift).asInsertResult();
            }
            if (valueAtKeyIndex(entryKeyIndex$runtime) == value) {
                return null;
            }
            return updateValueAtIndex(entryKeyIndex$runtime, value).asUpdateResult();
        }
        if (!hasNodeAt(indexSegment)) {
            return insertEntryAt(indexSegment, key, value).asInsertResult();
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            put = nodeAtIndex$runtime.collisionPut(key, value);
            if (put == null) {
                return null;
            }
        } else {
            put = nodeAtIndex$runtime.put(keyHash, key, value, shift + 5);
            if (put == null) {
                return null;
            }
        }
        put.setNode(updateNodeAtIndex(nodeIndex$runtime, indexSegment, put.getNode()));
        return put;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, V value, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) && Intrinsics.areEqual(value, valueAtKeyIndex(entryKeyIndex$runtime))) ? removeEntryAtIndex(entryKeyIndex$runtime, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        return replaceNode(nodeAtIndex$runtime, shift == 30 ? nodeAtIndex$runtime.collisionRemove(key, value) : nodeAtIndex$runtime.remove(keyHash, key, value, shift + 5), nodeIndex$runtime, indexSegment);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "<init>", "()V", SimbaEventProcessor.SOURCE_EMPTY, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    public TrieNode(int i, int i2, @NotNull Object[] objArr) {
        this(i, i2, objArr, null);
    }

    private final TrieNode<K, V> collisionRemove(K key) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return collisionRemoveEntryAtIndex(first);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, PersistentHashMapBuilder<K, V> mutator) {
        IntProgression step;
        step = RangesKt___RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(first, mutator);
        }
        return this;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, int shift) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) ? removeEntryAtIndex(entryKeyIndex$runtime, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            remove = nodeAtIndex$runtime.collisionRemove(key);
        } else {
            remove = nodeAtIndex$runtime.remove(keyHash, key, shift + 5);
        }
        return replaceNode(nodeAtIndex$runtime, remove, nodeIndex$runtime, indexSegment);
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                return mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, mutator);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift == 30) {
                mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(key, mutator);
            } else {
                mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, shift + 5, mutator);
            }
            return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, mutator.getOwnership());
        }
        return this;
    }
}
