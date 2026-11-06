package chip.platform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface ServiceResolver {
    void publish(String str, String str2, String str3, int i, String[] strArr, byte[][] bArr, String[] strArr2);

    void removeServices();

    void resolve(String str, String str2, long j, long j2, ChipMdnsCallback chipMdnsCallback);
}
