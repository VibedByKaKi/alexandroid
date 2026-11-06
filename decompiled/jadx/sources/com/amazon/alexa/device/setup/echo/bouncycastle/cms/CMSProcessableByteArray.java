package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CMSProcessableByteArray implements CMSTypedData, CMSReadable {
    private final byte[] bytes;
    private final ASN1ObjectIdentifier type;

    public CMSProcessableByteArray(byte[] bArr) {
        this(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), bArr);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.bytes.clone();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException, CMSException {
        outputStream.write(this.bytes);
    }

    public CMSProcessableByteArray(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.type = aSN1ObjectIdentifier;
        this.bytes = bArr;
    }
}
