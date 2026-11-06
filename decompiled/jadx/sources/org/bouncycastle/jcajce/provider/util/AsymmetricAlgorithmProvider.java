package org.bouncycastle.jcajce.provider.util;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import okio.JvmSystemFileSystem$$ExternalSyntheticOutline2;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes11.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String m$1 = a$$ExternalSyntheticOutline0.m$1(str, "WITH", str2);
        String m$12 = a$$ExternalSyntheticOutline0.m$1(str, JsonPOJOBuilder.DEFAULT_WITH_PREFIX, str2);
        String m$13 = a$$ExternalSyntheticOutline0.m$1(str, "With", str2);
        String m$14 = a$$ExternalSyntheticOutline0.m$1(str, "/", str2);
        configurableProvider.addAlgorithm("Signature.".concat(m$1), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m$12), m$1);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m$13), m$1);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m$14), m$1);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, m$1);
            JvmSystemFileSystem$$ExternalSyntheticOutline2.m(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, m$1);
        }
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        JvmSystemFileSystem$$ExternalSyntheticOutline2.m(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        JvmSystemFileSystem$$ExternalSyntheticOutline2.m(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        JvmSystemFileSystem$$ExternalSyntheticOutline2.m(JvmSystemFileSystem$$ExternalSyntheticOutline2.m(new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifier, configurableProvider, str, "Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
