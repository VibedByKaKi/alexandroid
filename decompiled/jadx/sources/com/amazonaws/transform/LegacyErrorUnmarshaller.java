package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LegacyErrorUnmarshaller implements Unmarshaller<AmazonServiceException, Node> {
    private final Class<? extends AmazonServiceException> exceptionClass;

    public LegacyErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public String getErrorPropertyPath(String str) {
        return a$$ExternalSyntheticOutline0.m("Response/Errors/Error/", str);
    }

    public String parseErrorCode(Node node) throws Exception {
        return XpathUtils.asString("Response/Errors/Error/Code", node);
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        String parseErrorCode = parseErrorCode(node);
        String asString = XpathUtils.asString("Response/Errors/Error/Message", node);
        String asString2 = XpathUtils.asString("Response/RequestID", node);
        String asString3 = XpathUtils.asString("Response/Errors/Error/Type", node);
        AmazonServiceException newInstance = this.exceptionClass.getConstructor(String.class).newInstance(asString);
        newInstance.setErrorCode(parseErrorCode);
        newInstance.setRequestId(asString2);
        if (asString3 == null) {
            newInstance.setErrorType(AmazonServiceException.ErrorType.Unknown);
            return newInstance;
        }
        if ("server".equalsIgnoreCase(asString3)) {
            newInstance.setErrorType(AmazonServiceException.ErrorType.Service);
            return newInstance;
        }
        if ("client".equalsIgnoreCase(asString3)) {
            newInstance.setErrorType(AmazonServiceException.ErrorType.Client);
        }
        return newInstance;
    }

    public LegacyErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.exceptionClass = cls;
    }
}
