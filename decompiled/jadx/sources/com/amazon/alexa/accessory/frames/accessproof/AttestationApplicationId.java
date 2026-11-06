package com.amazon.alexa.accessory.frames.accessproof;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AttestationApplicationId {
    private static final int ELEMENTS = 2;
    private static final int MAX_SET_ENTRIES = 32;
    private static final int PACKAGE_INFO_ELEMENTS = 2;
    private static final int SIGNATURE_DIGEST_LENGTH = 32;
    private final List<PackageInfo> packageInfos;
    private final List<byte[]> signatureDigests;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PackageInfo {
        private final String packageName;
        private final long version;

        public PackageInfo(String str, long j) {
            this.packageName = str;
            this.version = j;
        }

        public String packageName() {
            return this.packageName;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PackageInfo{");
            sb.append(this.packageName);
            sb.append(", version=");
            return a$$ExternalSyntheticOutline0.m(this.version, StringSubstitutor.DEFAULT_VAR_END, sb);
        }

        public long version() {
            return this.version;
        }
    }

    public AttestationApplicationId(List<PackageInfo> list, List<byte[]> list2) {
        this.packageInfos = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<byte[]> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add((byte[]) it2.next().clone());
        }
        this.signatureDigests = Collections.unmodifiableList(arrayList);
    }

    private static ASN1Set asSet(ASN1Encodable aSN1Encodable, String str) {
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        if (!(aSN1Primitive instanceof ASN1Set)) {
            throw new AttestationParseException(BitVector$$ExternalSyntheticOutline0.m(str, " is not a SET"));
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        if (aSN1Set.size() == 0) {
            throw new AttestationParseException(BitVector$$ExternalSyntheticOutline0.m(str, " is empty"));
        }
        if (aSN1Set.size() <= 32) {
            return aSN1Set;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, " has ");
        m1m.append(aSN1Set.size());
        m1m.append(" entries, more than the 32 allowed");
        throw new AttestationParseException(m1m.toString());
    }

    public static AttestationApplicationId parse(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new AttestationParseException("no attestationApplicationId bytes to parse");
        }
        try {
            return parseChecked(bArr);
        } catch (AttestationParseException e) {
            throw e;
        } catch (IOException e2) {
            throw new AttestationParseException(Automotive$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed attestationApplicationId: ")));
        } catch (RuntimeException e3) {
            throw new AttestationParseException("malformed attestationApplicationId: " + e3.getClass().getSimpleName() + ": " + e3.getMessage());
        }
    }

    private static AttestationApplicationId parseChecked(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (aSN1InputStream.readObject() != null) {
                throw new AttestationParseException("trailing data after attestationApplicationId");
            }
            aSN1InputStream.close();
            if (!(readObject instanceof ASN1Sequence)) {
                throw new AttestationParseException("attestationApplicationId is not a SEQUENCE");
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) readObject;
            if (aSN1Sequence.size() == 2) {
                return new AttestationApplicationId(parsePackageInfos(asSet(aSN1Sequence.getObjectAt(0), "packageInfos")), parseSignatureDigests(asSet(aSN1Sequence.getObjectAt(1), "signatureDigests")));
            }
            throw new AttestationParseException("attestationApplicationId has " + aSN1Sequence.size() + " elements, expected 2");
        } catch (Throwable th) {
            try {
                aSN1InputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static List<PackageInfo> parsePackageInfos(ASN1Set aSN1Set) {
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        for (int i = 0; i < aSN1Set.size(); i++) {
            ASN1Primitive aSN1Primitive = aSN1Set.getObjectAt(i).toASN1Primitive();
            if (!(aSN1Primitive instanceof ASN1Sequence)) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "packageInfos[", "] is not a SEQUENCE"));
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            if (aSN1Sequence.size() != 2) {
                StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "packageInfos[", "] has ");
                m0m.append(aSN1Sequence.size());
                m0m.append(" elements, expected 2");
                throw new AttestationParseException(m0m.toString());
            }
            ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(0).toASN1Primitive();
            if (!(aSN1Primitive2 instanceof ASN1OctetString)) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "packageInfos[", "] packageName is not an OCTET STRING"));
            }
            byte[] octets = ((ASN1OctetString) aSN1Primitive2).getOctets();
            if (octets.length == 0) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "packageInfos[", "] packageName is empty"));
            }
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(octets, charset);
            if (!Arrays.equals(octets, str.getBytes(charset))) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "packageInfos[", "] packageName is not valid UTF-8"));
            }
            ASN1Primitive aSN1Primitive3 = aSN1Sequence.getObjectAt(1).toASN1Primitive();
            if (!(aSN1Primitive3 instanceof ASN1Integer)) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "packageInfos[", "] version is not an INTEGER"));
            }
            long longValueExact = ((ASN1Integer) aSN1Primitive3).getValue().longValueExact();
            if (longValueExact < 0) {
                throw new AttestationParseException(ParcelCompat$$ExternalSyntheticOutline0.m(longValueExact, "packageInfos[", i, "] version is negative: "));
            }
            arrayList.add(new PackageInfo(str, longValueExact));
        }
        return arrayList;
    }

    private static List<byte[]> parseSignatureDigests(ASN1Set aSN1Set) {
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        for (int i = 0; i < aSN1Set.size(); i++) {
            ASN1Primitive aSN1Primitive = aSN1Set.getObjectAt(i).toASN1Primitive();
            if (!(aSN1Primitive instanceof ASN1OctetString)) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(i, "signatureDigests[", "] is not an OCTET STRING"));
            }
            byte[] octets = ((ASN1OctetString) aSN1Primitive).getOctets();
            if (octets.length != 32) {
                throw new AttestationParseException(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "signatureDigests[", "] is "), octets.length, " bytes, expected 32"));
            }
            arrayList.add(octets);
        }
        return arrayList;
    }

    public boolean matches(String str, byte[] bArr) {
        if (str != null && !str.isEmpty() && bArr != null && bArr.length == 32) {
            Iterator<PackageInfo> it2 = this.packageInfos.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().packageName().equals(str)) {
                    Iterator<byte[]> it3 = this.signatureDigests.iterator();
                    while (it3.hasNext()) {
                        if (MessageDigest.isEqual(it3.next(), bArr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public List<PackageInfo> packageInfos() {
        return this.packageInfos;
    }

    public List<byte[]> signatureDigests() {
        ArrayList arrayList = new ArrayList(this.signatureDigests.size());
        Iterator<byte[]> it2 = this.signatureDigests.iterator();
        while (it2.hasNext()) {
            arrayList.add((byte[]) it2.next().clone());
        }
        return arrayList;
    }

    public String toString() {
        return "AttestationApplicationId{packages=" + this.packageInfos + ", signatureDigests=" + this.signatureDigests.size() + StringSubstitutor.DEFAULT_VAR_END;
    }
}
