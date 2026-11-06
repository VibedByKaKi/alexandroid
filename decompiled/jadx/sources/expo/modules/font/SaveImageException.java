package expo.modules.font;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/font/SaveImageException;", "Lexpo/modules/kotlin/exception/CodedException;", "uri", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SaveImageException extends CodedException {
    public SaveImageException(@NotNull String str, @Nullable Throwable th) {
        super(TableInfo$$ExternalSyntheticOutline0.m(str, "Could not save image to '", str, "'"), th);
    }

    public /* synthetic */ SaveImageException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
