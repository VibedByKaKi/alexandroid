package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006:\u0001HB\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001aH\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0002J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001e\u00102\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u00102\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\u0015\u00104\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u00105\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0015\u00106\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\"J\u0016\u00107\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u001e\u00108\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016J+\u0010;\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0016H\u0000¢\u0006\u0002\b>J\u0018\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0016H\u0016J\b\u0010G\u001a\u00020\u0016H\u0016R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148AX\u0080\u0004¢\u0006\f\u0012\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010B¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "persistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "value", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "", "toList", "", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", MetricsConstants.Method.CACHE_GET, "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", BulkOperationType.add, "(ILjava/lang/Object;)V", "addAll", MetricsConstants.Method.CACHE_CLEAR, BulkOperationType.remove, "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "retainAllInRange", "start", "end", "retainAllInRange$runtime", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "describeContents", "Companion", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateList.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateListKt\n+ 5 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n34#2,4:189\n2474#3:193\n2474#3:206\n2364#3,2:217\n1893#3:219\n2366#3,4:220\n2474#3:245\n2364#3,2:256\n1893#3:258\n2366#3,4:259\n2474#3:283\n2364#3,2:294\n1893#3:296\n2366#3,4:297\n2364#3,2:310\n1893#3:312\n2366#3,2:314\n2369#3:321\n2474#3:336\n2364#3,2:347\n1893#3:349\n2366#3,4:350\n2474#3:373\n2364#3,2:384\n1893#3:386\n2366#3,4:387\n2474#3:413\n2364#3,2:424\n1893#3:426\n2366#3,4:427\n2474#3:450\n2364#3,2:461\n1893#3:463\n2366#3,4:464\n2474#3:484\n2364#3,2:495\n1893#3:497\n2366#3,4:498\n2474#3:514\n2364#3,2:525\n1893#3:527\n2366#3,4:528\n2474#3:537\n160#4,9:194\n169#4:204\n115#4:205\n170#4,9:207\n111#4:216\n179#4,6:225\n142#4,5:231\n163#4,6:236\n169#4:243\n115#4:244\n170#4,9:246\n111#4:255\n179#4,6:264\n147#4:270\n160#4,9:271\n169#4:281\n115#4:282\n170#4,9:284\n111#4:293\n179#4,6:302\n151#4:308\n111#4:309\n152#4,5:316\n158#4:323\n160#4,9:324\n169#4:334\n115#4:335\n170#4,9:337\n111#4:346\n179#4,6:355\n160#4,9:361\n169#4:371\n115#4:372\n170#4,9:374\n111#4:383\n179#4,6:392\n142#4,5:399\n163#4,6:404\n169#4:411\n115#4:412\n170#4,9:414\n111#4:423\n179#4,6:432\n147#4:438\n146#4:440\n163#4,6:441\n169#4:448\n115#4:449\n170#4,9:451\n111#4:460\n179#4,6:469\n147#4:475\n121#4,5:476\n126#4:482\n115#4:483\n127#4,9:485\n111#4:494\n137#4,3:503\n121#4,5:506\n126#4:512\n115#4:513\n127#4,9:515\n111#4:524\n137#4,3:533\n115#4:536\n33#5:203\n33#5:242\n33#5:280\n33#5:313\n33#5:333\n33#5:370\n33#5:410\n33#5:447\n33#5:481\n33#5:511\n1#6:224\n1#6:263\n1#6:301\n1#6:322\n1#6:354\n1#6:391\n1#6:398\n1#6:431\n1#6:439\n1#6:468\n1#6:502\n1#6:532\n1#6:538\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n95#1:189,4\n103#1:193\n107#1:206\n107#1:217,2\n107#1:219\n107#1:220,4\n109#1:245\n109#1:256,2\n109#1:258\n109#1:259,4\n115#1:283\n115#1:294,2\n115#1:296\n115#1:297,4\n119#1:310,2\n119#1:312\n119#1:314,2\n119#1:321\n121#1:336\n121#1:347,2\n121#1:349\n121#1:350,4\n123#1:373\n123#1:384,2\n123#1:386\n123#1:387,4\n127#1:413\n127#1:424,2\n127#1:426\n127#1:427,4\n134#1:450\n134#1:461,2\n134#1:463\n134#1:464,4\n137#1:484\n137#1:495,2\n137#1:497\n137#1:498,4\n142#1:514\n142#1:525,2\n142#1:527\n142#1:528,4\n152#1:537\n107#1:194,9\n107#1:204\n107#1:205\n107#1:207,9\n107#1:216\n107#1:225,6\n109#1:231,5\n109#1:236,6\n109#1:243\n109#1:244\n109#1:246,9\n109#1:255\n109#1:264,6\n109#1:270\n115#1:271,9\n115#1:281\n115#1:282\n115#1:284,9\n115#1:293\n115#1:302,6\n119#1:308\n119#1:309\n119#1:316,5\n119#1:323\n121#1:324,9\n121#1:334\n121#1:335\n121#1:337,9\n121#1:346\n121#1:355,6\n123#1:361,9\n123#1:371\n123#1:372\n123#1:374,9\n123#1:383\n123#1:392,6\n127#1:399,5\n127#1:404,6\n127#1:411\n127#1:412\n127#1:414,9\n127#1:423\n127#1:432,6\n127#1:438\n134#1:440\n134#1:441,6\n134#1:448\n134#1:449\n134#1:451,9\n134#1:460\n134#1:469,6\n134#1:475\n137#1:476,5\n137#1:482\n137#1:483\n137#1:485,9\n137#1:494\n137#1:503,3\n142#1:506,5\n142#1:512\n142#1:513\n142#1:515,9\n142#1:524\n142#1:533,3\n152#1:536\n107#1:203\n109#1:242\n115#1:280\n119#1:313\n121#1:333\n123#1:370\n127#1:410\n134#1:447\n137#1:481\n142#1:511\n107#1:224\n109#1:263\n115#1:301\n119#1:322\n121#1:354\n123#1:391\n127#1:431\n134#1:468\n137#1:502\n142#1:532\n*E\n"})
/* loaded from: classes13.dex */
public final class SnapshotStateList<T> implements Parcelable, StateObject, List<T>, RandomAccess, KMutableList {
    public static final int $stable = 0;

    @NotNull
    private StateRecord firstStateRecord;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new SnapshotStateList$Companion$CREATOR$1();

    public SnapshotStateList(@NotNull PersistentList<? extends T> persistentList) {
        this.firstStateRecord = SnapshotStateListKt.stateRecordWith(this, persistentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addAll$lambda$4(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$10(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> add = list$runtime.add((PersistentList<T>) element);
            if (Intrinsics.areEqual(add, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> addAll = list$runtime.addAll(elements);
            if (Intrinsics.areEqual(addAll, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, addAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.sync) {
                stateListStateRecord2.setList$runtime(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.setStructuralChange$runtime(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int index) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().get(index);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int getSize() {
        return SnapshotStateListKt.getReadable(this).getList$runtime().size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return SnapshotStateListKt.getReadable(this).getList$runtime().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.setNext$runtime(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) value;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> remove = list$runtime.remove((PersistentList<T>) element);
            if (Intrinsics.areEqual(remove, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, remove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> removeAll = list$runtime.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.areEqual(removeAll, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, removeAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    public T removeAt(int index) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        T t = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> removeAt = list$runtime.removeAt(index);
            if (Intrinsics.areEqual(removeAt, list$runtime)) {
                return t;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, removeAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t;
    }

    public final void removeRange(int fromIndex, int toIndex) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            builder.subList(fromIndex, toIndex).clear();
            PersistentList<T> build = builder.build();
            if (Intrinsics.areEqual(build, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        return SnapshotStateListKt.mutateBoolean(this, new SnapshotStateSet$$ExternalSyntheticLambda0(elements, 4));
    }

    public final int retainAllInRange$runtime(@NotNull Collection<? extends T> elements, int start, int end) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList<T> build = builder.build();
            if (Intrinsics.areEqual(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        T t = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> persistentList = list$runtime.set(index, (int) element);
            if (Intrinsics.areEqual(persistentList, list$runtime)) {
                return t;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public final List<T> toList() {
        return SnapshotStateListKt.getReadable(this).getList$runtime();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        List<T> list = toList();
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(list.get(i));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getCREATOR$annotations", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime = stateListStateRecord.getList$runtime();
                Unit unit = Unit.INSTANCE;
            }
            list$runtime.getClass();
            PersistentList<T> add = list$runtime.add(index, (int) element);
            if (Intrinsics.areEqual(add, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        return SnapshotStateListKt.mutateBoolean(this, new SnapshotStateList$$ExternalSyntheticLambda1(index, elements, 0));
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }
}
