package com.amazon.apl.viewhost.primitives;

import com.amazon.apl.viewhost.primitives.decoder.KeyedContainerDecoder;
import com.amazon.apl.viewhost.primitives.decoder.SingleValueDecoder;
import com.amazon.apl.viewhost.primitives.decoder.UnkeyedContainerDecoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Decodable extends Transcodable {
    KeyedContainerDecoder decodeKeyedContainer();

    SingleValueDecoder decodeSingleValue();

    UnkeyedContainerDecoder decodeUnkeyedContainer();
}
