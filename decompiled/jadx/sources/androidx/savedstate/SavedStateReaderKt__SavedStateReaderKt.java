package androidx.savedstate;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"keyOrValueNotFoundError", "", "key", "", "savedstate"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateReaderKt")
/* loaded from: classes14.dex */
final /* synthetic */ class SavedStateReaderKt__SavedStateReaderKt {
    @PublishedApi
    @NotNull
    public static final Void keyOrValueNotFoundError(@NotNull String str) {
        str.getClass();
        throw new IllegalArgumentException(a$$ExternalSyntheticOutline0.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
