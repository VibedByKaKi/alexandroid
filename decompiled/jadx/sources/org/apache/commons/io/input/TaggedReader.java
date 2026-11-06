package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TaggedReader extends ProxyReader {
    private final Serializable tag;

    public TaggedReader(Reader reader) {
        super(reader);
        this.tag = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.ProxyReader
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        return TaggedIOException.isTaggedWith(th, this.tag);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th, this.tag);
    }
}
