package org.json.simple.parser;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ContentHandler {
    boolean endArray() throws ParseException, IOException;

    void endJSON() throws ParseException, IOException;

    boolean endObject() throws ParseException, IOException;

    boolean endObjectEntry() throws ParseException, IOException;

    boolean primitive(Object obj) throws ParseException, IOException;

    boolean startArray() throws ParseException, IOException;

    void startJSON() throws ParseException, IOException;

    boolean startObject() throws ParseException, IOException;

    boolean startObjectEntry(String str) throws ParseException, IOException;
}
