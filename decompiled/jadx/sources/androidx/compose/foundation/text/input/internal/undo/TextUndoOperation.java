package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "index", "", "preText", "", "postText", "preSelection", "Landroidx/compose/ui/text/TextRange;", "postSelection", "timeInMillis", "", "canMerge", "", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanMerge", "()Z", "deletionType", "Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getDeletionType", "()Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getIndex", "()I", "getPostSelection-d9O1mEE", "()J", "J", "getPostText", "()Ljava/lang/String;", "getPreSelection-d9O1mEE", "getPreText", "textEditType", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTextEditType", "()Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTimeInMillis", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        @NotNull
        public TextUndoOperation restore(@NotNull Object value) {
            value.getClass();
            List list = (List) value;
            Object obj = list.get(0);
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            String str = (String) obj2;
            Object obj3 = list.get(2);
            obj3.getClass();
            String str2 = (String) obj3;
            Object obj4 = list.get(3);
            obj4.getClass();
            int intValue2 = ((Integer) obj4).intValue();
            Object obj5 = list.get(4);
            obj5.getClass();
            long TextRange = TextRangeKt.TextRange(intValue2, ((Integer) obj5).intValue());
            Object obj6 = list.get(5);
            obj6.getClass();
            int intValue3 = ((Integer) obj6).intValue();
            Object obj7 = list.get(6);
            obj7.getClass();
            long TextRange2 = TextRangeKt.TextRange(intValue3, ((Integer) obj7).intValue());
            Object obj8 = list.get(7);
            obj8.getClass();
            return new TextUndoOperation(intValue, str, str2, TextRange, TextRange2, ((Long) obj8).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        @NotNull
        public Object save(@NotNull SaverScope saverScope, @NotNull TextUndoOperation textUndoOperation) {
            return CollectionsKt.listOf(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m6830getStartimpl(textUndoOperation.getPreSelection())), Integer.valueOf(TextRange.m6825getEndimpl(textUndoOperation.getPreSelection())), Integer.valueOf(TextRange.m6830getStartimpl(textUndoOperation.getPostSelection())), Integer.valueOf(TextRange.m6825getEndimpl(textUndoOperation.getPostSelection())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;

    @NotNull
    private final String postText;
    private final long preSelection;

    @NotNull
    private final String preText;

    @NotNull
    private final TextEditType textEditType;
    private final long timeInMillis;

    private TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z) {
        this.index = i;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j;
        this.postSelection = j2;
        this.timeInMillis = j3;
        this.canMerge = z;
        if (str.length() == 0 && str2.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Either pre or post text must not be empty");
            throw null;
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    @NotNull
    public final TextDeleteType getDeletionType() {
        if (this.textEditType != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        if (!TextRange.m6824getCollapsedimpl(this.postSelection)) {
            return TextDeleteType.NotByUser;
        }
        boolean m6824getCollapsedimpl = TextRange.m6824getCollapsedimpl(this.preSelection);
        long j = this.preSelection;
        return m6824getCollapsedimpl ? TextRange.m6830getStartimpl(j) > TextRange.m6830getStartimpl(this.postSelection) ? TextDeleteType.Start : TextDeleteType.End : (TextRange.m6830getStartimpl(j) == TextRange.m6830getStartimpl(this.postSelection) && TextRange.m6830getStartimpl(this.preSelection) == this.index) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPostSelection() {
        return this.postSelection;
    }

    @NotNull
    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreSelection() {
        return this.preSelection;
    }

    @NotNull
    public final String getPreText() {
        return this.preText;
    }

    @NotNull
    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, j2, j3, z);
    }

    public /* synthetic */ TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, j2, (i2 & 32) != 0 ? UndoManager_jvmKt.timeNowMillis() : j3, (i2 & 64) != 0 ? true : z, null);
    }
}
