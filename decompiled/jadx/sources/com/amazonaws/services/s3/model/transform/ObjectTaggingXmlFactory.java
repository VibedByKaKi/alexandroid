package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Tag;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ObjectTaggingXmlFactory {
    public byte[] convertToXmlByteArray(ObjectTagging objectTagging) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("Tagging").start("TagSet");
        for (Tag tag : objectTagging.getTagSet()) {
            xmlWriter.start("Tag");
            xmlWriter.start("Key").value(tag.getKey()).end();
            xmlWriter.start("Value").value(tag.getValue()).end();
            xmlWriter.end();
        }
        xmlWriter.end();
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
