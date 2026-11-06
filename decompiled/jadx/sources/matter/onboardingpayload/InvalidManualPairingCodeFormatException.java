package matter.onboardingpayload;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lmatter/onboardingpayload/InvalidManualPairingCodeFormatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "entryCode", "", "<init>", "(Ljava/lang/String;)V", "Companion", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InvalidManualPairingCodeFormatException extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidManualPairingCodeFormatException(@NotNull String str) {
        super(String.format("Invalid format for entry code string: %s", Arrays.copyOf(new Object[]{str}, 1)), null);
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
    }
}
