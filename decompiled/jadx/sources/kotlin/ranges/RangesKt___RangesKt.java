package kotlin.ranges;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt$$ExternalSyntheticBUOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjdk.tools.javac.code.Flags;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0003*\u00020\u000fH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0005*\u00020\u0010H\u0087\b\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000fH\u0087\b¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\u0010\u001c\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0087\n¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\u0010\u001e\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0*2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0001H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020\u0003H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0006*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\n\u0010.\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010.\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010.\u001a\u00020\u0006*\u00020\u0006\u001a\u0015\u0010/\u001a\u00020\u0002*\u00020\u00022\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00042\u0006\u0010/\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0001H\u0000¢\u0006\u0002\u00101\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0000¢\u0006\u0002\u00102\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020$H\u0000¢\u0006\u0002\u00103\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020&H\u0000¢\u0006\u0002\u00104\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020(H\u0000¢\u0006\u0002\u00105\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020&H\u0000¢\u0006\u0002\u00108\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020(H\u0000¢\u0006\u0002\u00109\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020&H\u0000¢\u0006\u0002\u0010;\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020(H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0001H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020&H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020(H\u0000¢\u0006\u0002\u0010A\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u0010*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a'\u0010C\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010F\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010C\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!\u001a\u0012\u0010C\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010C\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u0003\u001a\u0012\u0010C\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(\u001a\u0012\u0010C\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&\u001a'\u0010H\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010I\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010H\u001a\u00020!*\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u0012\u0010H\u001a\u00020$*\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u0012\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u0012\u0010H\u001a\u00020\u0003*\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u0012\u0010H\u001a\u00020(*\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u0012\u0010H\u001a\u00020&*\u00020&2\u0006\u0010I\u001a\u00020&\u001a3\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\b\u0010F\u001a\u0004\u0018\u0001HD2\b\u0010I\u001a\u0004\u0018\u0001HD¢\u0006\u0002\u0010K\u001a\u001a\u0010J\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u001a\u0010J\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u001a\u0010J\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u001a\u0010J\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u001a\u0010J\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u001a\u0010J\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&2\u0006\u0010I\u001a\u00020&\u001a/\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0MH\u0007¢\u0006\u0002\u0010N\u001a-\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0\u001f¢\u0006\u0002\u0010O\u001a\u0018\u0010J\u001a\u00020\u0001*\u00020\u00012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f\u001a\u0018\u0010J\u001a\u00020\u0003*\u00020\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¨\u0006P"}, d2 = {DefaultPreloadManager.METRIC_PATH_FIRST, "", "Lkotlin/ranges/IntProgression;", "", "Lkotlin/ranges/LongProgression;", "", "Lkotlin/ranges/CharProgression;", "firstOrNull", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "last", "lastOrNull", "random", "Lkotlin/ranges/IntRange;", "Lkotlin/ranges/LongRange;", "Lkotlin/ranges/CharRange;", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "contains", "", "element", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "Lkotlin/ranges/ClosedRange;", "value", "", "intRangeContains", "longRangeContains", "", "shortRangeContains", "", "doubleRangeContains", "", "floatRangeContains", "Lkotlin/ranges/OpenEndRange;", "byteRangeContains", "downTo", TypedValues.TransitionType.S_TO, "reversed", "step", "toByteExactOrNull", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "toIntExactOrNull", "(J)Ljava/lang/Integer;", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "until", "coerceAtLeast", ExifInterface.GPS_DIRECTION_TRUE, "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
/* loaded from: classes10.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d) {
        closedRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t, @NotNull T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t, @NotNull T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    public static long coerceIn(long j, @NotNull ClosedRange<Long> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j), (ClosedFloatingPointRange<Long>) closedRange)).longValue();
        }
        if (!closedRange.isEmpty()) {
            return j < closedRange.getStart().longValue() ? closedRange.getStart().longValue() : j > closedRange.getEndInclusive().longValue() ? closedRange.getEndInclusive().longValue() : j;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedRange);
        return 0L;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        intRange.getClass();
        return num != null && intRange.contains(num.intValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b) {
        closedRange.getClass();
        return closedRange.contains(Double.valueOf(b));
    }

    @NotNull
    public static final LongProgression downTo(long j, byte b) {
        return LongProgression.INSTANCE.fromClosedRange(j, b, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull LongProgression longProgression) {
        longProgression.getClass();
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(longProgression);
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer firstOrNull(@NotNull IntProgression intProgression) {
        intProgression.getClass();
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b) {
        closedRange.getClass();
        return closedRange.contains(Float.valueOf(b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d) {
        closedRange.getClass();
        Integer intExactOrNull = toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull LongProgression longProgression) {
        longProgression.getClass();
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(longProgression);
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer lastOrNull(@NotNull IntProgression intProgression) {
        intProgression.getClass();
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d) {
        closedRange.getClass();
        Long longExactOrNull = toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharRange charRange, @NotNull Random random) {
        charRange.getClass();
        random.getClass();
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e) {
            PathKt$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return (char) 0;
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull CharRange charRange, @NotNull Random random) {
        charRange.getClass();
        random.getClass();
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @NotNull
    public static IntProgression reversed(@NotNull IntProgression intProgression) {
        intProgression.getClass();
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d) {
        closedRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final LongProgression step(@NotNull LongProgression longProgression, long j) {
        longProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    @Nullable
    public static final Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    @Nullable
    public static final Integer toIntExactOrNull(long j) {
        if (SieveCacheKt.NodeMetaAndPreviousMask > j || j >= Flags.BRIDGE) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    @Nullable
    public static final Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @Nullable
    public static final Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    @NotNull
    public static final CharRange until(char c, char c2) {
        return Intrinsics.compare((int) c2, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c, (char) (c2 - 1));
    }

    @NotNull
    public static final IntProgression downTo(int i, byte b) {
        return IntProgression.INSTANCE.fromClosedRange(i, b, -1);
    }

    @NotNull
    public static final IntProgression downTo(byte b, byte b2) {
        return IntProgression.INSTANCE.fromClosedRange(b, b2, -1);
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> closedRange, float f) {
        closedRange.getClass();
        return closedRange.contains(Double.valueOf(f));
    }

    @NotNull
    public static final IntProgression downTo(short s, byte b) {
        return IntProgression.INSTANCE.fromClosedRange(s, b, -1);
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange<Float> closedRange, double d) {
        closedRange.getClass();
        return closedRange.contains(Float.valueOf((float) d));
    }

    public static double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> openEndRange, float f) {
        openEndRange.getClass();
        return openEndRange.contains(Double.valueOf(f));
    }

    @NotNull
    public static final CharProgression downTo(char c, char c2) {
        return CharProgression.INSTANCE.fromClosedRange(c, c2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i) {
        closedRange.getClass();
        return closedRange.contains(Float.valueOf(i));
    }

    public static float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i) {
        closedRange.getClass();
        return closedRange.contains(Double.valueOf(i));
    }

    @NotNull
    public static IntProgression downTo(int i, int i2) {
        return IntProgression.INSTANCE.fromClosedRange(i, i2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j) {
        closedRange.getClass();
        return closedRange.contains(Float.valueOf(j));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f) {
        closedRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j) {
        closedRange.getClass();
        return closedRange.contains(Double.valueOf(j));
    }

    @NotNull
    public static final LongProgression downTo(long j, int i) {
        return LongProgression.INSTANCE.fromClosedRange(j, i, -1L);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s) {
        closedRange.getClass();
        return closedRange.contains(Float.valueOf(s));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, byte b) {
        openEndRange.getClass();
        return openEndRange.contains(Integer.valueOf(b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, byte b) {
        openEndRange.getClass();
        return openEndRange.contains(Long.valueOf(b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, byte b) {
        openEndRange.getClass();
        return openEndRange.contains(Short.valueOf(b));
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, int i) {
        closedRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s) {
        closedRange.getClass();
        return closedRange.contains(Double.valueOf(s));
    }

    @NotNull
    public static final IntProgression downTo(byte b, int i) {
        return IntProgression.INSTANCE.fromClosedRange(b, i, -1);
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, byte b) {
        closedRange.getClass();
        return closedRange.contains(Integer.valueOf(b));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, byte b) {
        closedRange.getClass();
        return closedRange.contains(Long.valueOf(b));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, byte b) {
        closedRange.getClass();
        return closedRange.contains(Short.valueOf(b));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, int i) {
        openEndRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @NotNull
    public static final IntProgression downTo(short s, int i) {
        return IntProgression.INSTANCE.fromClosedRange(s, i, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f) {
        closedRange.getClass();
        Integer intExactOrNull = toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f) {
        closedRange.getClass();
        Long longExactOrNull = toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f) {
        closedRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, long j) {
        closedRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l) {
        longRange.getClass();
        return l != null && longRange.contains(l.longValue());
    }

    @NotNull
    public static final LongProgression downTo(int i, long j) {
        return LongProgression.INSTANCE.fromClosedRange(i, j, -1L);
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, long j) {
        closedRange.getClass();
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, int i) {
        closedRange.getClass();
        return closedRange.contains(Long.valueOf(i));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, int i) {
        closedRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, long j) {
        openEndRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch) {
        charRange.getClass();
        return ch != null && charRange.contains(ch.charValue());
    }

    @NotNull
    public static final LongProgression downTo(long j, long j2) {
        return LongProgression.INSTANCE.fromClosedRange(j, j2, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull IntProgression intProgression) {
        intProgression.getClass();
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(intProgression);
        return 0;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression longProgression) {
        longProgression.getClass();
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, long j) {
        openEndRange.getClass();
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull IntProgression intProgression) {
        intProgression.getClass();
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(intProgression);
        return 0;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long lastOrNull(@NotNull LongProgression longProgression) {
        longProgression.getClass();
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, int i) {
        openEndRange.getClass();
        return openEndRange.contains(Long.valueOf(i));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, int i) {
        openEndRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Nullable
    public static final Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, short s) {
        closedRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b) {
        intRange.getClass();
        return intRangeContains((ClosedRange<Integer>) intRange, b);
    }

    @NotNull
    public static final LongProgression downTo(byte b, long j) {
        return LongProgression.INSTANCE.fromClosedRange(b, j, -1L);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character firstOrNull(@NotNull CharProgression charProgression) {
        charProgression.getClass();
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, short s) {
        closedRange.getClass();
        return closedRange.contains(Integer.valueOf(s));
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character lastOrNull(@NotNull CharProgression charProgression) {
        charProgression.getClass();
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, short s) {
        closedRange.getClass();
        return closedRange.contains(Long.valueOf(s));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, long j) {
        closedRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, short s) {
        openEndRange.getClass();
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b) {
        longRange.getClass();
        return longRangeContains((ClosedRange<Long>) longRange, b);
    }

    @NotNull
    public static final LongProgression downTo(short s, long j) {
        return LongProgression.INSTANCE.fromClosedRange(s, j, -1L);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, short s) {
        openEndRange.getClass();
        return openEndRange.contains(Integer.valueOf(s));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, short s) {
        openEndRange.getClass();
        return openEndRange.contains(Long.valueOf(s));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, long j) {
        openEndRange.getClass();
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i) {
        longRange.getClass();
        return longRangeContains((ClosedRange<Long>) longRange, i);
    }

    @NotNull
    public static final IntProgression downTo(int i, short s) {
        return IntProgression.INSTANCE.fromClosedRange(i, s, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(@NotNull CharProgression charProgression) {
        charProgression.getClass();
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(charProgression);
        return (char) 0;
    }

    @SinceKotlin(version = "1.7")
    public static final char last(@NotNull CharProgression charProgression) {
        charProgression.getClass();
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        PathKt$$ExternalSyntheticBUOutline0.m$1(charProgression);
        return (char) 0;
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression) {
        longProgression.getClass();
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @NotNull
    public static final LongRange until(long j, byte b) {
        return new LongRange(j, b - 1);
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j) {
        intRange.getClass();
        return intRangeContains((ClosedRange<Integer>) intRange, j);
    }

    @NotNull
    public static final LongProgression downTo(long j, short s) {
        return LongProgression.INSTANCE.fromClosedRange(j, s, -1L);
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression charProgression) {
        charProgression.getClass();
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Nullable
    public static final Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j);
    }

    @Nullable
    public static final Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @Nullable
    public static final Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= 32768) {
            return null;
        }
        return Short.valueOf((short) j);
    }

    @NotNull
    public static final IntRange until(byte b, byte b2) {
        return new IntRange(b, b2 - 1);
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s) {
        intRange.getClass();
        return intRangeContains((ClosedRange<Integer>) intRange, s);
    }

    @NotNull
    public static final IntProgression downTo(byte b, short s) {
        return IntProgression.INSTANCE.fromClosedRange(b, s, -1);
    }

    @Nullable
    public static final Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s);
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @Nullable
    public static final Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return Short.valueOf((short) i);
    }

    @NotNull
    public static final IntRange until(short s, byte b) {
        return new IntRange(s, b - 1);
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s) {
        longRange.getClass();
        return longRangeContains((ClosedRange<Long>) longRange, s);
    }

    @NotNull
    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.INSTANCE.fromClosedRange(s, s2, -1);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i);
    }

    @Nullable
    public static final Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    @NotNull
    public static final IntRange until(int i, byte b) {
        return new IntRange(i, b - 1);
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    @NotNull
    public static IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i, i2 - 1);
    }

    @NotNull
    public static final LongRange until(long j, int i) {
        return new LongRange(j, i - 1);
    }

    @NotNull
    public static final IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b, i - 1);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        longRange.getClass();
        return random(longRange, Random.INSTANCE);
    }

    @NotNull
    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s, i - 1);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        charRange.getClass();
        return random(charRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull IntRange intRange, @NotNull Random random) {
        intRange.getClass();
        random.getClass();
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e) {
            PathKt$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return 0;
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        longRange.getClass();
        return randomOrNull(longRange, Random.INSTANCE);
    }

    @NotNull
    public static final LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i, j - 1);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        charRange.getClass();
        return randomOrNull(charRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull LongRange longRange, @NotNull Random random) {
        longRange.getClass();
        random.getClass();
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e) {
            PathKt$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return 0L;
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer randomOrNull(@NotNull IntRange intRange, @NotNull Random random) {
        intRange.getClass();
        random.getClass();
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @NotNull
    public static LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j, j2 - 1);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        intRange.getClass();
        return random(intRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange longRange, @NotNull Random random) {
        longRange.getClass();
        random.getClass();
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @NotNull
    public static final LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b, j - 1);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        intRange.getClass();
        return randomOrNull(intRange, Random.INSTANCE);
    }

    @NotNull
    public static final LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s, j - 1);
    }

    @NotNull
    public static final IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    @NotNull
    public static final LongRange until(long j, short s) {
        return new LongRange(j, s - 1);
    }

    @NotNull
    public static final IntRange until(byte b, short s) {
        return new IntRange(b, s - 1);
    }

    @NotNull
    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    @NotNull
    public static IntProgression step(@NotNull IntProgression intProgression, int i) {
        intProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression charProgression, int i) {
        charProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(b3, b2);
        return (byte) 0;
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(s3, s2);
        return (short) 0;
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(i3, i2);
        return 0;
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
        return 0L;
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Cannot coerce value to an empty range: maximum ", d3, " is less than minimum ");
        m.append(d2);
        m.append('.');
        throw new IllegalArgumentException(m.toString());
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull ClosedFloatingPointRange<T> closedFloatingPointRange) {
        t.getClass();
        closedFloatingPointRange.getClass();
        if (!closedFloatingPointRange.isEmpty()) {
            return (!closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getStart()) || closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getStart(), t)) ? (!closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getEndInclusive(), t) || closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getEndInclusive())) ? t : closedFloatingPointRange.getEndInclusive() : closedFloatingPointRange.getStart();
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedFloatingPointRange);
        return null;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull ClosedRange<T> closedRange) {
        t.getClass();
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t, (ClosedFloatingPointRange) closedRange);
        }
        if (!closedRange.isEmpty()) {
            return t.compareTo(closedRange.getStart()) < 0 ? closedRange.getStart() : t.compareTo(closedRange.getEndInclusive()) > 0 ? closedRange.getEndInclusive() : t;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedRange);
        return null;
    }

    public static int coerceIn(int i, @NotNull ClosedRange<Integer> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i), (ClosedFloatingPointRange<Integer>) closedRange)).intValue();
        }
        if (!closedRange.isEmpty()) {
            return i < closedRange.getStart().intValue() ? closedRange.getStart().intValue() : i > closedRange.getEndInclusive().intValue() ? closedRange.getEndInclusive().intValue() : i;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(46, "Cannot coerce value to an empty range: ", closedRange);
        return 0;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        t.getClass();
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) <= 0) {
                if (t.compareTo(t2) < 0) {
                    return t2;
                }
                if (t.compareTo(t3) > 0) {
                    return t3;
                }
            } else {
                BundleKt$$ExternalSyntheticBUOutline0.m(46, t3, " is less than minimum ", t2, "Cannot coerce value to an empty range: maximum ");
                return null;
            }
        } else {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }
}
