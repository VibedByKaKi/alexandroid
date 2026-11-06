package com.amazon.alexa.presence.bleconn.identity.encryption;

import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class EncryptionModuleFactoryImpl implements EncryptionModuleFactory {
    private final EncryptionModes encryptionMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactoryImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes;

        static {
            int[] iArr = new int[EncryptionModes.values().length];
            $SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes = iArr;
            try {
                iArr[EncryptionModes.NO_ENCRYPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes[EncryptionModes.IDENTITY_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes[EncryptionModes.RELATIONSHIP_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EncryptionModes {
        NO_ENCRYPTION,
        IDENTITY_TOKEN,
        RELATIONSHIP_TOKEN
    }

    public EncryptionModuleFactoryImpl(EncryptionModes encryptionModes) {
        Objects.requireNonNull(encryptionModes);
        this.encryptionMode = encryptionModes;
    }

    private DecryptionModule buildNoOpDecryptionModule() {
        return new EncryptionModuleFactoryImpl$$ExternalSyntheticLambda1();
    }

    private EncryptionModule buildNoOpEncryptionModule() {
        return new EncryptionModuleFactoryImpl$$ExternalSyntheticLambda0();
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactory
    public DecryptionModule buildDecryptionModuleForKey(byte[] bArr, boolean z) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes[this.encryptionMode.ordinal()];
        if (i == 1) {
            return buildNoOpDecryptionModule();
        }
        if (i == 2) {
            return new IdentityTokenCryptographyModule(null, bArr, z);
        }
        if (i == 3) {
            return new RelationshipTokenCryptographyModule(bArr, z);
        }
        Single$$ExternalSyntheticBUOutline0.m("Illegal Argument, unsupported mode: ".concat(String.valueOf(this.encryptionMode)));
        return null;
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactory
    public EncryptionModule buildEncryptionModuleForKey(byte[] bArr, boolean z) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$presence$bleconn$identity$encryption$EncryptionModuleFactoryImpl$EncryptionModes[this.encryptionMode.ordinal()];
        if (i == 1) {
            return buildNoOpEncryptionModule();
        }
        if (i == 2) {
            return new IdentityTokenCryptographyModule(bArr, null, z);
        }
        if (i == 3) {
            return new RelationshipTokenCryptographyModule(bArr, z);
        }
        Single$$ExternalSyntheticBUOutline0.m("Illegal Argument, unsupported mode: ".concat(String.valueOf(this.encryptionMode)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$buildNoOpDecryptionModule$1(byte[] bArr) {
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$buildNoOpEncryptionModule$0(byte[] bArr) {
        return bArr;
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactory
    public DecryptionModule buildDecryptionModuleForKey(byte[] bArr) {
        return buildDecryptionModuleForKey(bArr, false);
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModuleFactory
    public EncryptionModule buildEncryptionModuleForKey(byte[] bArr) {
        return buildEncryptionModuleForKey(bArr, false);
    }
}
