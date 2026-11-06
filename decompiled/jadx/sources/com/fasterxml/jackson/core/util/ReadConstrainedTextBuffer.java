package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ReadConstrainedTextBuffer extends TextBuffer {
    private final StreamReadConstraints _streamReadConstraints;

    public ReadConstrainedTextBuffer(StreamReadConstraints streamReadConstraints, BufferRecycler bufferRecycler) {
        super(bufferRecycler);
        this._streamReadConstraints = streamReadConstraints;
    }

    @Override // com.fasterxml.jackson.core.util.TextBuffer
    public void validateStringLength(int i) throws StreamConstraintsException {
        this._streamReadConstraints.validateStringLength(i);
    }
}
