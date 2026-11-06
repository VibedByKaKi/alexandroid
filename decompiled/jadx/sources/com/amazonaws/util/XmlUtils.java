package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class XmlUtils {
    public static XMLReader parse(InputStream inputStream, ContentHandler contentHandler) throws SAXException, IOException {
        XMLReader createXMLReader = XMLReaderFactory.createXMLReader();
        createXMLReader.setContentHandler(contentHandler);
        createXMLReader.parse(new InputSource(inputStream));
        inputStream.close();
        return createXMLReader;
    }
}
