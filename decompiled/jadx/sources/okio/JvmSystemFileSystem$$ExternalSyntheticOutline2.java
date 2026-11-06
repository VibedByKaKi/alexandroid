package okio;

import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.io.charsets.UTFKt;
import kotlinx.metadata.internal.protobuf.CodedOutputStream;
import kotlinx.serialization.json.JsonElement;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class JvmSystemFileSystem$$ExternalSyntheticOutline2 {
    public static void m(Class cls, StringBuilder sb, String str, JsonElement jsonElement, String str2) {
        sb.append(Reflection.getOrCreateKotlinClass(cls).getSimpleName());
        sb.append(str);
        sb.append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName());
        sb.append(str2);
    }

    public static StringBuilder m$1(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static long m$1(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        byteBuffer.position(i);
        return UTFKt.decodeUtf8Result(i2 - i3, i4);
    }

    public static int m(CharSequence charSequence, Function1 function1) {
        charSequence.getClass();
        function1.getClass();
        return charSequence.length();
    }

    public static long m(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        byteBuffer.position(byteBuffer.position() - i);
        return UTFKt.decodeUtf8Result(i2 - i3, i4);
    }

    public static Object m(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }

    public static String m(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String m(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String m(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String m(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String m(Path path, String str) {
        return str + path;
    }

    public static String m(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static StringBuilder m(StringBuilder sb, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2, String str3) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder m(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    public static StringBuilder m(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static StringBuilder m(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static Iterator m(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return sequence.iterator();
    }

    public static KotlinNothingValueException m() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static FqName m(String str, FqName fqName) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return fqName.child(identifier);
    }

    public static ASN1EncodableVector m(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static ASN1ObjectIdentifier m(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static ECFieldElement m(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static int m(int i, Integer num) {
        return CodedOutputStream.computeInt32SizeNoTag(num.intValue()) + i;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m27202m(StringBuilder sb, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    public static void m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static void m(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m27203m(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    public static byte[] m(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }
}
