package org.apache.http;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TruncatedChunkException extends MalformedChunkCodingException {
    private static final long serialVersionUID = -23506263930279460L;

    public TruncatedChunkException(String str, Object... objArr) {
        super(HttpException.clean(String.format(str, objArr)));
    }

    public TruncatedChunkException(String str) {
        super(str);
    }
}
