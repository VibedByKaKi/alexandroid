package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0000¢\u0006\u0002\b\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "slotTable", "Landroidx/compose/runtime/SlotTable;", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "extractNestedStates", "Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "applier", "Landroidx/compose/runtime/Applier;", Content.REFERENCES, "Landroidx/collection/ObjectList;", "extractNestedStates$runtime", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalComposeApi
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,5012:1\n29#2,8:5013\n37#2:5027\n287#3,6:5021\n287#3,6:5034\n919#4,2:5028\n175#5,4:5030\n180#5,3:5041\n1#6:5040\n4788#7,4:5044\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n423#1:5013,8\n423#1:5027\n423#1:5021,6\n446#1:5034,6\n423#1:5028,2\n427#1:5030,4\n427#1:5041,3\n427#1:5040\n443#1:5044,4\n*E\n"})
/* loaded from: classes13.dex */
public final class MovableContentState {
    public static final int $stable = 8;

    @NotNull
    private final SlotTable slotTable;

    public MovableContentState(@NotNull SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer extractNestedStates$lambda$1(MovableContentState movableContentState, MovableContentStateReference movableContentStateReference) {
        return Integer.valueOf(movableContentState.slotTable.anchorIndex(movableContentStateReference.getAnchor()));
    }

    private static final void extractNestedStates$lambda$4$closeToGroupContaining(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$4$openParent(SlotWriter slotWriter, int i) {
        int nextGroup;
        extractNestedStates$lambda$4$closeToGroupContaining(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.isGroupEnd()) {
            nextGroup = ComposerKt.getNextGroup(slotWriter);
            if (i < nextGroup) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    @NotNull
    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime(@NotNull Applier<?> applier, @NotNull ObjectList<MovableContentStateReference> references) {
        Object[] objArr = references.content;
        int i = references._size;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= i) {
                break;
            }
            if (this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i3]).getAnchor())) {
                i3++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(i2, i4, null);
                Object[] objArr2 = references.content;
                int i5 = references._size;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor())) {
                        mutableObjectList.add(obj);
                    }
                }
                references = mutableObjectList;
            }
        }
        ObjectList sortedBy = ExtensionsKt.sortedBy(references, new Recomposer$$ExternalSyntheticLambda1(this, 4));
        if (sortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter openWriter = this.slotTable.openWriter();
        try {
            Object[] objArr3 = sortedBy.content;
            int i7 = sortedBy._size;
            for (int i8 = 0; i8 < i7; i8++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i8];
                int anchorIndex = openWriter.anchorIndex(movableContentStateReference.getAnchor());
                int parent = openWriter.parent(anchorIndex);
                extractNestedStates$lambda$4$closeToGroupContaining(openWriter, parent);
                extractNestedStates$lambda$4$openParent(openWriter, parent);
                openWriter.advanceBy(anchorIndex - openWriter.getCurrentGroup());
                mutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition(), movableContentStateReference, openWriter, applier));
            }
            extractNestedStates$lambda$4$closeToGroupContaining(openWriter, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            openWriter.close(true);
            return mutableScatterMapOf;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    @NotNull
    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }
}
