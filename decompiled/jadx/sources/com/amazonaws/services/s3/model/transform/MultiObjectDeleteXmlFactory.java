package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MultiObjectDeleteXmlFactory {
    private void writeKeyVersion(XmlWriter xmlWriter, DeleteObjectsRequest.KeyVersion keyVersion) {
        xmlWriter.start("Object");
        xmlWriter.start("Key").value(keyVersion.getKey()).end();
        if (keyVersion.getVersion() != null) {
            xmlWriter.start("VersionId").value(keyVersion.getVersion()).end();
        }
        xmlWriter.end();
    }

    public byte[] convertToXmlByteArray(DeleteObjectsRequest deleteObjectsRequest) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("Delete");
        if (deleteObjectsRequest.getQuiet()) {
            xmlWriter.start("Quiet").value("true").end();
        }
        Iterator<DeleteObjectsRequest.KeyVersion> it2 = deleteObjectsRequest.getKeys().iterator();
        while (it2.hasNext()) {
            writeKeyVersion(xmlWriter, it2.next());
        }
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
