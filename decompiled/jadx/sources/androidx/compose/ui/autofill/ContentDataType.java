package androidx.compose.ui.autofill;

import com.amazon.alexa.voice.tta.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "Companion", "Landroidx/compose/ui/autofill/AndroidContentDataType;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ContentDataType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "<init>", "()V", "None", "Landroidx/compose/ui/autofill/ContentDataType;", "getNone", "()Landroidx/compose/ui/autofill/ContentDataType;", Constants.Namespaces.TEXT, "getText", "List", "getList", "Date", "getDate", "Toggle", "getToggle", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContentDataType None = ContentDataType_androidKt.ContentDataType(0);

        @NotNull
        private static final ContentDataType Text = ContentDataType_androidKt.ContentDataType(1);

        @NotNull
        private static final ContentDataType List = ContentDataType_androidKt.ContentDataType(3);

        @NotNull
        private static final ContentDataType Date = ContentDataType_androidKt.ContentDataType(4);

        @NotNull
        private static final ContentDataType Toggle = ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        @NotNull
        public final ContentDataType getDate() {
            return Date;
        }

        @NotNull
        public final ContentDataType getList() {
            return List;
        }

        @NotNull
        public final ContentDataType getNone() {
            return None;
        }

        @NotNull
        public final ContentDataType getText() {
            return Text;
        }

        @NotNull
        public final ContentDataType getToggle() {
            return Toggle;
        }
    }
}
