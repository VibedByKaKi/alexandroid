package com.amazon.alexa.device.setup.echo.bouncycastle.asn1.x509;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Encodable;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1EncodableVector;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Sequence;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1SequenceParser;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1TaggedObject;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.DERNull;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.DERObjectIdentifier;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlgorithmIdentifier extends ASN1Object {
    private final ASN1ObjectIdentifier objectId;
    private ASN1Encodable parameters;
    private boolean parametersDefined;

    public AlgorithmIdentifier(ASN1Sequence aSN1Sequence) {
        this.parametersDefined = false;
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            CrlID$$ExternalSyntheticBUOutline0.m(aSN1Sequence.size(), "Bad sequence size: ");
            throw null;
        }
        this.objectId = DERObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() != 2) {
            this.parameters = null;
        } else {
            this.parametersDefined = true;
            this.parameters = aSN1Sequence.getObjectAt(1);
        }
    }

    public static AlgorithmIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof AlgorithmIdentifier)) {
            return (AlgorithmIdentifier) obj;
        }
        if (obj instanceof ASN1ObjectIdentifier) {
            return new AlgorithmIdentifier((ASN1ObjectIdentifier) obj);
        }
        if (obj instanceof String) {
            return new AlgorithmIdentifier((String) obj);
        }
        if ((obj instanceof ASN1Sequence) || (obj instanceof ASN1SequenceParser)) {
            return new AlgorithmIdentifier(ASN1Sequence.getInstance(obj));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "unknown object in factory: "));
        return null;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return new ASN1ObjectIdentifier(this.objectId.getId());
    }

    public ASN1ObjectIdentifier getObjectId() {
        return this.objectId;
    }

    public ASN1Encodable getParameters() {
        return this.parameters;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.objectId);
        if (this.parametersDefined) {
            ASN1Encodable aSN1Encodable = this.parameters;
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(aSN1Encodable);
            } else {
                aSN1EncodableVector.add(DERNull.INSTANCE);
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public AlgorithmIdentifier(String str) {
        this.parametersDefined = false;
        this.objectId = new ASN1ObjectIdentifier(str);
    }

    public AlgorithmIdentifier(DERObjectIdentifier dERObjectIdentifier) {
        this.parametersDefined = false;
        this.objectId = new ASN1ObjectIdentifier(dERObjectIdentifier.getId());
    }

    public static AlgorithmIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public AlgorithmIdentifier(DERObjectIdentifier dERObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.parametersDefined = true;
        this.objectId = new ASN1ObjectIdentifier(dERObjectIdentifier.getId());
        this.parameters = aSN1Encodable;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.parametersDefined = true;
        this.objectId = aSN1ObjectIdentifier;
        this.parameters = aSN1Encodable;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.parametersDefined = false;
        this.objectId = aSN1ObjectIdentifier;
    }
}
