package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001RB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\rH\u0016J\u001f\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020\r2\u0014\u0010-\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016J\u0017\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0017\u00101\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00028\u0001H\u0000¢\u0006\u0004\b2\u0010\u0017J.\u00108\u001a\u00020\u00152\u001e\u00109\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u0004\u0012\u00020\u00150:H\u0080\b¢\u0006\u0002\b;J.\u0010<\u001a\u00020\u00152\u001e\u00109\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=\u0012\u0004\u0012\u00020\u00150:H\u0080\b¢\u0006\u0002\b>J.\u0010?\u001a\u00020\u00152\u001e\u00109\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=\u0012\u0004\u0012\u00020\u00150:H\u0080\b¢\u0006\u0002\b@J9\u0010E\u001a\u0002HF\"\u0004\b\u0002\u0010F2#\u0010G\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104\u0012\u0004\u0012\u0002HF0:¢\u0006\u0002\bHH\u0082\b¢\u0006\u0002\u0010IJ9\u0010J\u001a\u0002HF\"\u0004\b\u0002\u0010F2#\u0010G\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104\u0012\u0004\u0012\u0002HF0:¢\u0006\u0002\bHH\u0082\b¢\u0006\u0002\u0010IJ4\u0010K\u001a\u0002HF\"\u0004\b\u0002\u0010F2\u001e\u0010G\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002HF0:H\u0082\b¢\u0006\u0002\u0010IJ4\u0010L\u001a\u00020\u0015*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0006\u0010M\u001a\u00020\u00112\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0002J5\u0010P\u001a\u00020\r2*\u0010G\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0:H\u0082\bJ,\u0010Q\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0002R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010/\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0013R&\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048@X\u0080\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0006\u001a\u0004\b6\u00107R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8AX\u0080\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010D¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateObject;", "", "<init>", "()V", "value", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "", "toMap", "", "size", "", "getSize", "()I", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", MetricsConstants.Method.CACHE_GET, "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "values", "", "getValues", "()Ljava/util/Collection;", "toString", "", MetricsConstants.Method.CACHE_CLEAR, MetricsConstants.Method.CACHE_PUT, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", BulkOperationType.remove, "modification", "getModification$runtime", "removeValue", "removeValue$runtime", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime$annotations", "getReadable$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "removeIf", "predicate", "Lkotlin/Function1;", "removeIf$runtime", Languages.ANY, "", "any$runtime", "all", "all$runtime", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Map;", "withCurrent", "R", "block", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "mutate", "attemptUpdate", "currentModification", "newMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "update", "commitUpdate", "StateMapStateRecord", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n186#1:418\n150#1:419\n187#1,2:421\n154#1:423\n189#1:433\n157#1,5:434\n162#1:440\n150#1:441\n163#1,7:443\n154#1:450\n171#1:459\n157#1,5:460\n162#1:466\n150#1:467\n163#1,7:469\n154#1:476\n171#1:485\n157#1,5:486\n162#1:492\n150#1:493\n163#1,7:495\n154#1:502\n171#1:511\n157#1,5:514\n162#1:520\n150#1:521\n163#1,7:523\n154#1:530\n171#1:539\n150#1:540\n150#1:553\n154#1:555\n150#1:566\n154#1:568\n2474#2:417\n2474#2:420\n2364#2,2:424\n1893#2:426\n2366#2,4:428\n2474#2:442\n2364#2,2:451\n1893#2:453\n2366#2,4:454\n2474#2:468\n2364#2,2:477\n1893#2:479\n2366#2,4:480\n2474#2:494\n2364#2,2:503\n1893#2:505\n2366#2,4:506\n2474#2:522\n2364#2,2:531\n1893#2:533\n2366#2,4:534\n2474#2:541\n2474#2:542\n2364#2,2:543\n1893#2:545\n2366#2,4:547\n2474#2:554\n2364#2,2:556\n1893#2:558\n2366#2,4:560\n2474#2:567\n2364#2,2:569\n1893#2:571\n2366#2,4:573\n33#3:427\n33#3:439\n33#3:465\n33#3:491\n33#3:519\n33#3:546\n33#3:552\n33#3:559\n33#3:565\n33#3:572\n33#3:578\n1#4:432\n1#4:458\n1#4:484\n1#4:510\n1#4:538\n1#4:551\n1#4:564\n1#4:577\n295#5,2:512\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n90#1:418\n90#1:419\n90#1:421,2\n90#1:423\n90#1:433\n92#1:434,5\n92#1:440\n92#1:441\n92#1:443,7\n92#1:450\n92#1:459\n94#1:460,5\n94#1:466\n94#1:467\n94#1:469,7\n94#1:476\n94#1:485\n96#1:486,5\n96#1:492\n96#1:493\n96#1:495,7\n96#1:502\n96#1:511\n115#1:514,5\n115#1:520\n115#1:521\n115#1:523,7\n115#1:530\n115#1:539\n146#1:540\n162#1:553\n169#1:555\n186#1:566\n188#1:568\n86#1:417\n90#1:420\n90#1:424,2\n90#1:426\n90#1:428,4\n92#1:442\n92#1:451,2\n92#1:453\n92#1:454,4\n94#1:468\n94#1:477,2\n94#1:479\n94#1:480,4\n96#1:494\n96#1:503,2\n96#1:505\n96#1:506,4\n115#1:522\n115#1:531,2\n115#1:533\n115#1:534,4\n146#1:541\n150#1:542\n154#1:543,2\n154#1:545\n154#1:547,4\n162#1:554\n169#1:556,2\n169#1:558\n169#1:560,4\n186#1:567\n188#1:569,2\n188#1:571\n188#1:573,4\n90#1:427\n92#1:439\n94#1:465\n96#1:491\n115#1:519\n154#1:546\n161#1:552\n169#1:559\n178#1:565\n188#1:572\n193#1:578\n90#1:432\n92#1:458\n94#1:484\n96#1:510\n115#1:538\n154#1:551\n169#1:564\n188#1:577\n103#1:512,2\n*E\n"})
/* loaded from: classes13.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {
    public static final int $stable = 0;

    @NotNull
    private final Set<Map.Entry<K, V>> entries;

    @NotNull
    private StateRecord firstStateRecord;

    @NotNull
    private final Set<K> keys;

    @NotNull
    private final Collection<V> values;

    public SnapshotStateMap() {
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(currentSnapshot.getSnapshotId(), persistentHashMapOf);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.setNext$runtime(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentHashMapOf));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateMapStateRecord<K, V> stateMapStateRecord, int i, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        boolean z;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            if (stateMapStateRecord.getModification() == i) {
                stateMapStateRecord.setMap$runtime(persistentMap);
                z = true;
                stateMapStateRecord.setModification$runtime(stateMapStateRecord.getModification() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    private final int commitUpdate(StateMapStateRecord<K, V> stateMapStateRecord, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        int modification;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            stateMapStateRecord.setMap$runtime(persistentMap);
            modification = stateMapStateRecord.getModification();
            stateMapStateRecord.setModification$runtime(modification + 1);
        }
        return modification;
    }

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> block) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification;
        R invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    firstStateRecord.getClass();
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime = stateMapStateRecord.getMap$runtime();
                    modification = stateMapStateRecord.getModification();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            invoke = block.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return invoke;
    }

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> block) {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> invoke = block.invoke(stateMapStateRecord.getMap$runtime());
        if (invoke != stateMapStateRecord.getMap$runtime()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), invoke);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return block.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                invoke = block.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    public final boolean all$runtime(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it2 = ((ImmutableSet) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it2.hasNext()) {
            if (!predicate.invoke((Map.Entry) it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it2 = ((ImmutableSet) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it2.hasNext()) {
            if (predicate.invoke((Map.Entry) it2.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime();
        PersistentMap<K, ? extends V> persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentHashMapOf);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime().getMap$runtime().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime().getMap$runtime().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getReadable$runtime().getMap$runtime().get(key);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime() {
        return getReadable$runtime().getModification();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime().getMap$runtime().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime().getMap$runtime().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.getClass();
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification;
        V put;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            put = builder.put(key, value);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return put;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            builder.putAll(from);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, map$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification;
        V remove;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            remove = builder.remove(key);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return remove;
    }

    public final boolean removeIf$runtime(@NotNull Function1<? super Map.Entry<K, V>, Boolean> predicate) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification;
        Snapshot current;
        boolean attemptUpdate;
        boolean z = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    firstStateRecord.getClass();
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime = stateMapStateRecord.getMap$runtime();
                    modification = stateMapStateRecord.getModification();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification, build);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return z;
    }

    public final boolean removeValue$runtime(V value) {
        Object obj;
        Iterator<T> it2 = entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final Map<K, V> toMap() {
        return getReadable$runtime().getMap$runtime();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime$annotations() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0019\u0010\u0018\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0002\u0010\u0019R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", BuildConfig.FLAVOR_authType, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "modification", "", "getModification$runtime", "()I", "setModification$runtime", "(I)V", "assign", "", "value", "create", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,416:1\n33#2:417\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n206#1:417\n*E\n"})
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;

        @NotNull
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(long j, @NotNull PersistentMap<K, ? extends V> persistentMap) {
            super(j);
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Object obj;
            value.getClass();
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime() {
            return this.map;
        }

        /* renamed from: getModification$runtime, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setMap$runtime(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime(int i) {
            this.modification = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create(long snapshotId) {
            return new StateMapStateRecord(snapshotId, this.map);
        }
    }
}
