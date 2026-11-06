package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
