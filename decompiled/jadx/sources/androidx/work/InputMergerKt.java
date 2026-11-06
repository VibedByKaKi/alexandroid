package androidx.work;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {Constants.LOG_TAG, "", "fromClassName", "Landroidx/work/InputMerger;", "className", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InputMergerKt {

    @NotNull
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("InputMerger");
        tagWithPrefix.getClass();
        TAG = tagWithPrefix;
    }

    @Nullable
    public static final InputMerger fromClassName(@NotNull String str) {
        str.getClass();
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (InputMerger) newInstance;
        } catch (Exception e) {
            Logger.get().error(TAG, "Trouble instantiating " + str, e);
            return null;
        }
    }
}
