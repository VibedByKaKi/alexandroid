package expo.modules.asset;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/asset/UnableToDownloadAssetException;", "Lexpo/modules/kotlin/exception/CodedException;", "url", "", "<init>", "(Ljava/lang/String;)V", "expo-asset_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UnableToDownloadAssetException extends CodedException {
    public UnableToDownloadAssetException(@NotNull String str) {
        super(ChatData$$ExternalSyntheticOutline0.m(str, "Unable to download asset from url: ", str), null, 2, null);
    }
}
