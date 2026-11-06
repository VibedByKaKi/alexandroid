package com.amazon.whisperjoin.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class SDKVersioningIndexClass {
    private static Descriptors.FileDescriptor descriptor;

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\nGWhisperJoinProtocolBuffersModel/schema/version/SDKVersioningIndex.proto\u0012\bprotobuf*á\u0002\n\u0012SDKVersioningIndex\u0012\u0013\n\u000fVERSION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007V1_14_0\u0010\u0001\u0012\u000b\n\u0007V1_14_1\u0010\u0002\u0012\u000b\n\u0007V1_15_0\u0010\u0003\u0012\u000b\n\u0007V1_15_1\u0010\u0004\u0012\u000b\n\u0007V1_16_0\u0010\u0005\u0012\u000b\n\u0007V1_16_1\u0010\u0006\u0012\u000b\n\u0007V1_17_0\u0010\u0007\u0012\u000b\n\u0007V1_17_1\u0010\b\u0012\u000b\n\u0007V1_18_0\u0010\t\u0012\u000b\n\u0007V1_18_1\u0010\n\u0012\u000b\n\u0007V1_19_0\u0010\u000b\u0012\u000b\n\u0007V1_19_1\u0010\f\u0012\u000b\n\u0007V1_20_0\u0010\r\u0012\u000b\n\u0007V1_20_1\u0010\u000e\u0012\u000b\n\u0007V1_21_0\u0010\u000f\u0012\u000b\n\u0007V1_21_1\u0010\u0010\u0012\u000b\n\u0007V1_22_0\u0010\u0011\u0012\u000b\n\u0007V1_22_1\u0010\u0012\u0012\u000b\n\u0007V1_23_0\u0010\u0013\u0012\u000b\n\u0007V1_23_1\u0010\u0014\u0012\u000b\n\u0007V1_24_0\u0010\u0015\u0012\u000b\n\u0007V1_24_1\u0010\u0016\u0012\u000b\n\u0007V1_25_0\u0010\u0017\u0012\u000b\n\u0007V1_25_1\u0010\u0018B@\n\u001fcom.amazon.whisperjoin.protobufB\u0017SDKVersioningIndexClass¢\u0002\u0003PWJ"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.amazon.whisperjoin.protobuf.SDKVersioningIndexClass.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                SDKVersioningIndexClass.descriptor = fileDescriptor;
                return null;
            }
        });
    }

    private SDKVersioningIndexClass() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SDKVersioningIndex implements ProtocolMessageEnum {
        VERSION_UNKNOWN(0),
        V1_14_0(1),
        V1_14_1(2),
        V1_15_0(3),
        V1_15_1(4),
        V1_16_0(5),
        V1_16_1(6),
        V1_17_0(7),
        V1_17_1(8),
        V1_18_0(9),
        V1_18_1(10),
        V1_19_0(11),
        V1_19_1(12),
        V1_20_0(13),
        V1_20_1(14),
        V1_21_0(15),
        V1_21_1(16),
        V1_22_0(17),
        V1_22_1(18),
        V1_23_0(19),
        V1_23_1(20),
        V1_24_0(21),
        V1_24_1(22),
        V1_25_0(23),
        V1_25_1(24);

        public static final int V1_14_0_VALUE = 1;
        public static final int V1_14_1_VALUE = 2;
        public static final int V1_15_0_VALUE = 3;
        public static final int V1_15_1_VALUE = 4;
        public static final int V1_16_0_VALUE = 5;
        public static final int V1_16_1_VALUE = 6;
        public static final int V1_17_0_VALUE = 7;
        public static final int V1_17_1_VALUE = 8;
        public static final int V1_18_0_VALUE = 9;
        public static final int V1_18_1_VALUE = 10;
        public static final int V1_19_0_VALUE = 11;
        public static final int V1_19_1_VALUE = 12;
        public static final int V1_20_0_VALUE = 13;
        public static final int V1_20_1_VALUE = 14;
        public static final int V1_21_0_VALUE = 15;
        public static final int V1_21_1_VALUE = 16;
        public static final int V1_22_0_VALUE = 17;
        public static final int V1_22_1_VALUE = 18;
        public static final int V1_23_0_VALUE = 19;
        public static final int V1_23_1_VALUE = 20;
        public static final int V1_24_0_VALUE = 21;
        public static final int V1_24_1_VALUE = 22;
        public static final int V1_25_0_VALUE = 23;
        public static final int V1_25_1_VALUE = 24;
        public static final int VERSION_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SDKVersioningIndex> internalValueMap = new Internal.EnumLiteMap<SDKVersioningIndex>() { // from class: com.amazon.whisperjoin.protobuf.SDKVersioningIndexClass.SDKVersioningIndex.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SDKVersioningIndex findValueByNumber(int i) {
                return SDKVersioningIndex.forNumber(i);
            }
        };
        private static final SDKVersioningIndex[] VALUES = values();

        SDKVersioningIndex(int i) {
            this.value = i;
        }

        public static SDKVersioningIndex forNumber(int i) {
            switch (i) {
                case 0:
                    return VERSION_UNKNOWN;
                case 1:
                    return V1_14_0;
                case 2:
                    return V1_14_1;
                case 3:
                    return V1_15_0;
                case 4:
                    return V1_15_1;
                case 5:
                    return V1_16_0;
                case 6:
                    return V1_16_1;
                case 7:
                    return V1_17_0;
                case 8:
                    return V1_17_1;
                case 9:
                    return V1_18_0;
                case 10:
                    return V1_18_1;
                case 11:
                    return V1_19_0;
                case 12:
                    return V1_19_1;
                case 13:
                    return V1_20_0;
                case 14:
                    return V1_20_1;
                case 15:
                    return V1_21_0;
                case 16:
                    return V1_21_1;
                case 17:
                    return V1_22_0;
                case 18:
                    return V1_22_1;
                case 19:
                    return V1_23_0;
                case 20:
                    return V1_23_1;
                case 21:
                    return V1_24_0;
                case 22:
                    return V1_24_1;
                case 23:
                    return V1_25_0;
                case 24:
                    return V1_25_1;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SDKVersioningIndexClass.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SDKVersioningIndex> internalGetValueMap() {
            return internalValueMap;
        }

        public static SDKVersioningIndex valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("EnumValueDescriptor is not for this type.");
            return null;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static SDKVersioningIndex valueOf(int i) {
            return forNumber(i);
        }
    }
}
