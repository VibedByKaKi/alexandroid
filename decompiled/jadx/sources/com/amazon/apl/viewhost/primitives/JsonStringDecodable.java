package com.amazon.apl.viewhost.primitives;

import com.amazon.apl.viewhost.primitives.decoder.KeyedContainerDecoder;
import com.amazon.apl.viewhost.primitives.decoder.SingleValueDecoder;
import com.amazon.apl.viewhost.primitives.decoder.UnkeyedContainerDecoder;
import com.amazon.apl.viewhost.primitives.transcoder.Transcoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class JsonStringDecodable implements Decodable {
    private final String mJsonString;

    public JsonStringDecodable(String str) {
        this.mJsonString = str;
    }

    @Override // com.amazon.apl.viewhost.primitives.Decodable
    public KeyedContainerDecoder decodeKeyedContainer() {
        return null;
    }

    @Override // com.amazon.apl.viewhost.primitives.Decodable
    public SingleValueDecoder decodeSingleValue() {
        return null;
    }

    @Override // com.amazon.apl.viewhost.primitives.Decodable
    public UnkeyedContainerDecoder decodeUnkeyedContainer() {
        return null;
    }

    public String getString() {
        return this.mJsonString;
    }

    @Override // com.amazon.apl.viewhost.primitives.Transcodable
    public boolean transcode(Transcoder transcoder) {
        return false;
    }
}
