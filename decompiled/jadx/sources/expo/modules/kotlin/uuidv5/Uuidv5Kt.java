package expo.modules.kotlin.uuidv5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.Charsets;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"uuidv5", "Ljava/util/UUID;", "namespace", "name", "", "toBytes", "", "uuid", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Uuidv5Kt {
    @NotNull
    public static final byte[] toBytes(@NotNull UUID uuid) {
        uuid.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        array.getClass();
        return array;
    }

    @NotNull
    public static final UUID uuidv5(@NotNull UUID uuid, @NotNull String str) {
        uuid.getClass();
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(toBytes(uuid));
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        digest[6] = (byte) ((digest[6] & 15) | 80);
        digest[8] = (byte) ((digest[8] & Utf8.REPLACEMENT_BYTE) | 128);
        ByteBuffer wrap = ByteBuffer.wrap(digest);
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
