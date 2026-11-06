package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class JvmDescriptorTypeWriter<T> {

    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;

    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T t) {
        t.getClass();
        writeJvmTypeAsIs(t);
    }

    public final void writeJvmTypeAsIs(@NotNull T t) {
        String repeat;
        t.getClass();
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                JvmTypeFactory<T> jvmTypeFactory = this.jvmTypeFactory;
                StringBuilder sb = new StringBuilder();
                repeat = StringsKt__StringsJVMKt.repeat(MarkdownConstants.LEFT_BRACKET, this.jvmCurrentTypeArrayLevel);
                sb.append(repeat);
                sb.append(this.jvmTypeFactory.toString(t));
                t = jvmTypeFactory.createFromString(sb.toString());
            }
            this.jvmCurrentType = t;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t) {
        name.getClass();
        t.getClass();
        writeJvmTypeAsIs(t);
    }

    public void writeArrayEnd() {
    }
}
