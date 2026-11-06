package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StandardErrorUnmarshaller extends AbstractErrorUnmarshaller<Node> {
    public StandardErrorUnmarshaller() {
    }

    public String getErrorPropertyPath(String str) {
        return a$$ExternalSyntheticOutline0.m("ErrorResponse/Error/", str);
    }

    public String parseErrorCode(Node node) throws Exception {
        return XpathUtils.asString("ErrorResponse/Error/Code", node);
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        String parseErrorCode = parseErrorCode(node);
        String asString = XpathUtils.asString("ErrorResponse/Error/Type", node);
        String asString2 = XpathUtils.asString("ErrorResponse/RequestId", node);
        AmazonServiceException newException = newException(XpathUtils.asString("ErrorResponse/Error/Message", node));
        newException.setErrorCode(parseErrorCode);
        newException.setRequestId(asString2);
        if (asString == null) {
            newException.setErrorType(AmazonServiceException.ErrorType.Unknown);
            return newException;
        }
        if ("Receiver".equalsIgnoreCase(asString)) {
            newException.setErrorType(AmazonServiceException.ErrorType.Service);
            return newException;
        }
        if ("Sender".equalsIgnoreCase(asString)) {
            newException.setErrorType(AmazonServiceException.ErrorType.Client);
        }
        return newException;
    }

    public StandardErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }
}
