package expo.modules.kotlin.views;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.Filter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/views/FilteredReadableMapKeySetIterator;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "iterator", "filter", "Lexpo/modules/kotlin/Filter;", "", "<init>", "(Lcom/facebook/react/bridge/ReadableMapKeySetIterator;Lexpo/modules/kotlin/Filter;)V", "next", "hasNextKey", "", "nextKey", "findNext", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FilteredReadableMapKeySetIterator implements ReadableMapKeySetIterator {

    @NotNull
    private final Filter<String> filter;

    @NotNull
    private final ReadableMapKeySetIterator iterator;

    @Nullable
    private String next;

    public FilteredReadableMapKeySetIterator(@NotNull ReadableMapKeySetIterator readableMapKeySetIterator, @NotNull Filter<String> filter) {
        readableMapKeySetIterator.getClass();
        filter.getClass();
        this.iterator = readableMapKeySetIterator;
        this.filter = filter;
        findNext();
    }

    private final void findNext() {
        while (this.iterator.hasNextKey()) {
            String nextKey = this.iterator.nextKey();
            this.next = nextKey;
            if (this.filter.apply(nextKey)) {
                return;
            }
        }
        this.next = null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return this.next != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    @NotNull
    public String nextKey() {
        String str = this.next;
        str.getClass();
        findNext();
        return str;
    }
}
