package matter.onboardingpayload;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import chip.platform.ConfigurationManager;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Z2\u00020\u0001:\u0001ZB]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0011J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00107\u001a\u000208H\u0016J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020,J\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020\fJ\u000e\u0010>\u001a\u00020:2\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010?\u001a\u00020:2\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020\u0003J\u0006\u0010A\u001a\u00020\u0003J\u0006\u0010B\u001a\u00020\u000eJ\u000e\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020\u000eJ\u0014\u0010C\u001a\u00020:2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0EJ\u000e\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u000208J\u000e\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020\u0003J\u0006\u0010H\u001a\u000208J\u0006\u0010I\u001a\u00020:J\u0010\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u0003H\u0002J\u0010\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u0003H\u0002J\u0016\u0010M\u001a\u00020:2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u000208J\u0016\u0010M\u001a\u00020:2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003J\u0010\u0010M\u001a\u00020:2\u0006\u0010;\u001a\u00020,H\u0002J\u000e\u0010O\u001a\u00020:2\u0006\u0010K\u001a\u00020\u0003J\f\u0010P\u001a\b\u0012\u0004\u0012\u00020,0QJ\u0010\u0010R\u001a\u00020:2\u0006\u0010;\u001a\u000204H\u0002J\f\u0010S\u001a\b\u0012\u0004\u0012\u0002040QJ\u0010\u0010T\u001a\u00020,2\u0006\u0010K\u001a\u00020\u0003H\u0002J\u0010\u0010U\u001a\u0002042\u0006\u0010K\u001a\u00020\u0003H\u0002J\u0010\u0010V\u001a\u00020W2\u0006\u0010K\u001a\u00020\u0003H\u0002J\b\u0010X\u001a\u00020\fH\u0002J\u0010\u0010Y\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,`-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,`-X\u0082\u0004¢\u0006\u0002\n\u0000R*\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002040+j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000204`-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lmatter/onboardingpayload/OnboardingPayload;", "", "version", "", "vendorId", "productId", "commissioningFlow", "discoveryCapabilities", "", "Lmatter/onboardingpayload/DiscoveryCapability;", ConfigurationManager.kConfigKey_SetupDiscriminator, "hasShortDiscriminator", "", "setupPinCode", "", "<init>", "(IIIILjava/util/Set;IZJ)V", "(IIIILjava/util/Set;IJ)V", "getVersion", "()I", "setVersion", "(I)V", "getVendorId", "setVendorId", "getProductId", "setProductId", "getCommissioningFlow", "setCommissioningFlow", "getDiscoveryCapabilities", "()Ljava/util/Set;", "setDiscoveryCapabilities", "(Ljava/util/Set;)V", "getDiscriminator", "setDiscriminator", "getHasShortDiscriminator", "()Z", "setHasShortDiscriminator", "(Z)V", "getSetupPinCode", "()J", "setSetupPinCode", "(J)V", "optionalQRCodeInfo", "Ljava/util/HashMap;", "Lmatter/onboardingpayload/OptionalQRCodeInfo;", "Lkotlin/collections/HashMap;", "getOptionalQRCodeInfo", "()Ljava/util/HashMap;", "setOptionalQRCodeInfo", "(Ljava/util/HashMap;)V", "optionalVendorData", "optionalExtensionData", "Lmatter/onboardingpayload/OptionalQRCodeInfoExtension;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", "addOptionalQRCodeInfo", "", LogLevel.INFO, "isValidManualCode", "isValidQRCodePayload", "setShortDiscriminatorValue", "setLongDiscriminatorValue", "getShortDiscriminatorValue", "getLongDiscriminatorValue", "getRendezvousInformation", "setRendezvousInformation", "rendezvousInfo", "", "addSerialNumber", Constants.BUNDLE_SERIAL_NUMBER, "getSerialNumber", "removeSerialNumber", "isCommonTag", "tag", "isVendorTag", "addOptionalVendorData", "data", "removeOptionalVendorData", "getAllOptionalVendorData", "", "addOptionalExtensionData", "getAllOptionalExtensionData", "getOptionalVendorData", "getOptionalExtensionData", "getNumericTypeFor", "Lmatter/onboardingpayload/OptionalQRCodeInfoType;", "checkPayloadCommonConstraints", "isVendorIdValidOperationally", "Companion", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnboardingPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingPayload.kt\nmatter/onboardingpayload/OnboardingPayload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,573:1\n1747#2,3:574\n*S KotlinDebug\n*F\n+ 1 OnboardingPayload.kt\nmatter/onboardingpayload/OnboardingPayload\n*L\n211#1:574,3\n*E\n"})
/* loaded from: classes10.dex */
public final class OnboardingPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int commissioningFlow;

    @NotNull
    private Set<DiscoveryCapability> discoveryCapabilities;
    private int discriminator;
    private boolean hasShortDiscriminator;

    @NotNull
    private final HashMap<Integer, OptionalQRCodeInfoExtension> optionalExtensionData;

    @NotNull
    private HashMap<Integer, OptionalQRCodeInfo> optionalQRCodeInfo;

    @NotNull
    private final HashMap<Integer, OptionalQRCodeInfo> optionalVendorData;
    private int productId;
    private long setupPinCode;
    private int vendorId;
    private int version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionalQRCodeInfoType.values().length];
            try {
                iArr[OptionalQRCodeInfoType.TYPE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionalQRCodeInfoType.TYPE_UINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ OnboardingPayload(int i, int i2, int i3, int i4, Set set, int i5, boolean z, long j, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? new LinkedHashSet() : set, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? 0L : j);
    }

    private final void addOptionalExtensionData(OptionalQRCodeInfoExtension info) {
        if (isCommonTag(info.getTag())) {
            this.optionalExtensionData.put(Integer.valueOf(info.getTag()), info);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
        }
    }

    private final void addOptionalVendorData(OptionalQRCodeInfo info) {
        if (isVendorTag(info.getTag())) {
            this.optionalVendorData.put(Integer.valueOf(info.getTag()), info);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
        }
    }

    private final boolean checkPayloadCommonConstraints() {
        if (this.version != 0 || !INSTANCE.isValidSetupPIN(this.setupPinCode)) {
            return false;
        }
        if (isVendorIdValidOperationally(this.vendorId) || this.vendorId == VendorId.UNSPECIFIED.getValue()) {
            return this.productId != 0 || this.vendorId == VendorId.UNSPECIFIED.getValue();
        }
        return false;
    }

    private final OptionalQRCodeInfoType getNumericTypeFor(int tag) {
        return isVendorTag(tag) ? OptionalQRCodeInfoType.TYPE_INT32 : tag == 0 ? OptionalQRCodeInfoType.TYPE_UINT32 : OptionalQRCodeInfoType.TYPE_UNKNOWN;
    }

    private final OptionalQRCodeInfoExtension getOptionalExtensionData(int tag) {
        OptionalQRCodeInfoExtension optionalQRCodeInfoExtension = this.optionalExtensionData.get(Integer.valueOf(tag));
        if (optionalQRCodeInfoExtension != null) {
            return optionalQRCodeInfoExtension;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("Key not found");
        return null;
    }

    private final OptionalQRCodeInfo getOptionalVendorData(int tag) {
        OptionalQRCodeInfo optionalQRCodeInfo = this.optionalVendorData.get(Integer.valueOf(tag));
        if (optionalQRCodeInfo != null) {
            return optionalQRCodeInfo;
        }
        Buffer$$ExternalSyntheticBUOutline0.m("Key not found");
        return null;
    }

    private final boolean isCommonTag(int tag) {
        return tag < 128;
    }

    private final boolean isVendorIdValidOperationally(int vendorId) {
        return vendorId != VendorId.UNSPECIFIED.getValue() && vendorId <= VendorId.TESTVENDOR4.getValue();
    }

    private final boolean isVendorTag(int tag) {
        return !isCommonTag(tag);
    }

    public final void addOptionalQRCodeInfo(@NotNull OptionalQRCodeInfo info) {
        info.getClass();
        this.optionalQRCodeInfo.put(Integer.valueOf(info.getTag()), info);
    }

    public final void addSerialNumber(int serialNumber) {
        OptionalQRCodeInfoExtension optionalQRCodeInfoExtension = new OptionalQRCodeInfoExtension();
        optionalQRCodeInfoExtension.setTag(0);
        optionalQRCodeInfoExtension.setType(OptionalQRCodeInfoType.TYPE_UINT32);
        optionalQRCodeInfoExtension.m26997setUint32WZ4Q5Ns(UInt.m25389constructorimpl(serialNumber));
        addOptionalExtensionData(optionalQRCodeInfoExtension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingPayload)) {
            return false;
        }
        OnboardingPayload onboardingPayload = (OnboardingPayload) other;
        return this.version == onboardingPayload.version && this.vendorId == onboardingPayload.vendorId && this.productId == onboardingPayload.productId && this.commissioningFlow == onboardingPayload.commissioningFlow && Intrinsics.areEqual(this.discoveryCapabilities, onboardingPayload.discoveryCapabilities) && this.discriminator == onboardingPayload.discriminator && this.hasShortDiscriminator == onboardingPayload.hasShortDiscriminator && this.setupPinCode == onboardingPayload.setupPinCode;
    }

    @NotNull
    public final List<OptionalQRCodeInfoExtension> getAllOptionalExtensionData() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, OptionalQRCodeInfoExtension>> it2 = this.optionalExtensionData.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        return arrayList;
    }

    @NotNull
    public final List<OptionalQRCodeInfo> getAllOptionalVendorData() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, OptionalQRCodeInfo>> it2 = this.optionalVendorData.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        return arrayList;
    }

    public final int getCommissioningFlow() {
        return this.commissioningFlow;
    }

    @NotNull
    public final Set<DiscoveryCapability> getDiscoveryCapabilities() {
        return this.discoveryCapabilities;
    }

    public final int getDiscriminator() {
        return this.discriminator;
    }

    public final boolean getHasShortDiscriminator() {
        return this.hasShortDiscriminator;
    }

    public final int getLongDiscriminatorValue() {
        boolean z = this.hasShortDiscriminator;
        int i = this.discriminator;
        return z ? INSTANCE.shortToLongValue(i) : i;
    }

    @NotNull
    public final HashMap<Integer, OptionalQRCodeInfo> getOptionalQRCodeInfo() {
        return this.optionalQRCodeInfo;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final long getRendezvousInformation() {
        Iterator<DiscoveryCapability> it2 = this.discoveryCapabilities.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j |= 1 << it2.next().getBitIndex();
        }
        return j;
    }

    @NotNull
    public final String getSerialNumber() {
        StringBuilder sb = new StringBuilder();
        OptionalQRCodeInfoExtension optionalExtensionData = getOptionalExtensionData(0);
        int i = WhenMappings.$EnumSwitchMapping$0[optionalExtensionData.getType().ordinal()];
        if (i == 1) {
            sb.append(optionalExtensionData.getData());
        } else {
            if (i != 2) {
                Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
                return null;
            }
            sb.append(UInt.m25383boximpl(optionalExtensionData.getUint32()));
        }
        return sb.toString();
    }

    public final long getSetupPinCode() {
        return this.setupPinCode;
    }

    public final int getShortDiscriminatorValue() {
        boolean z = this.hasShortDiscriminator;
        int i = this.discriminator;
        return z ? i : INSTANCE.longToShortValue(i);
    }

    public final int getVendorId() {
        return this.vendorId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isValidManualCode() {
        if (this.setupPinCode >= 134217728) {
            return false;
        }
        return checkPayloadCommonConstraints();
    }

    public final boolean isValidQRCodePayload() {
        if (this.version >= 8 || Integer.compareUnsigned(UInt.m25389constructorimpl(this.commissioningFlow), UInt.m25389constructorimpl(3)) > 0) {
            return false;
        }
        if (this.commissioningFlow != CommissioningFlow.STANDARD.getValue() && this.commissioningFlow != CommissioningFlow.USER_ACTION_REQUIRED.getValue() && this.commissioningFlow != CommissioningFlow.CUSTOM.getValue()) {
            return false;
        }
        Set of = SetsKt.setOf((Object[]) new DiscoveryCapability[]{DiscoveryCapability.BLE, DiscoveryCapability.ON_NETWORK, DiscoveryCapability.SOFT_AP, DiscoveryCapability.NFC});
        if (!this.discoveryCapabilities.isEmpty()) {
            Set<DiscoveryCapability> set = this.discoveryCapabilities;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!of.contains((DiscoveryCapability) it2.next())) {
                        return false;
                    }
                }
            }
        }
        if (this.setupPinCode >= 134217728) {
            return false;
        }
        return checkPayloadCommonConstraints();
    }

    public final void removeOptionalVendorData(int tag) {
        if (this.optionalVendorData.containsKey(Integer.valueOf(tag))) {
            this.optionalVendorData.remove(Integer.valueOf(tag));
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m("Key not found");
        }
    }

    public final void removeSerialNumber() {
        if (this.optionalExtensionData.containsKey(0)) {
            this.optionalExtensionData.remove(0);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m("Key not found");
        }
    }

    public final void setCommissioningFlow(int i) {
        this.commissioningFlow = i;
    }

    public final void setDiscoveryCapabilities(@NotNull Set<DiscoveryCapability> set) {
        set.getClass();
        this.discoveryCapabilities = set;
    }

    public final void setDiscriminator(int i) {
        this.discriminator = i;
    }

    public final void setHasShortDiscriminator(boolean z) {
        this.hasShortDiscriminator = z;
    }

    public final void setLongDiscriminatorValue(int discriminator) {
        int i = discriminator & 4095;
        if (discriminator != i) {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
        } else {
            this.discriminator = i;
            this.hasShortDiscriminator = false;
        }
    }

    public final void setOptionalQRCodeInfo(@NotNull HashMap<Integer, OptionalQRCodeInfo> hashMap) {
        hashMap.getClass();
        this.optionalQRCodeInfo = hashMap;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final void setRendezvousInformation(long rendezvousInfo) {
        this.discoveryCapabilities.clear();
        for (DiscoveryCapability discoveryCapability : DiscoveryCapability.values()) {
            if (((1 << discoveryCapability.getBitIndex()) & rendezvousInfo) != 0) {
                this.discoveryCapabilities.add(discoveryCapability);
            }
        }
    }

    public final void setSetupPinCode(long j) {
        this.setupPinCode = j;
    }

    public final void setShortDiscriminatorValue(int discriminator) {
        int i = discriminator & 15;
        if (discriminator != i) {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
        } else {
            this.discriminator = i;
            this.hasShortDiscriminator = true;
        }
    }

    public final void setVendorId(int i) {
        this.vendorId = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        int i = this.version;
        int i2 = this.vendorId;
        int i3 = this.productId;
        int i4 = this.commissioningFlow;
        Set<DiscoveryCapability> set = this.discoveryCapabilities;
        int i5 = this.discriminator;
        boolean z = this.hasShortDiscriminator;
        long j = this.setupPinCode;
        HashMap<Integer, OptionalQRCodeInfo> hashMap = this.optionalQRCodeInfo;
        HashMap<Integer, OptionalQRCodeInfo> hashMap2 = this.optionalVendorData;
        HashMap<Integer, OptionalQRCodeInfoExtension> hashMap3 = this.optionalExtensionData;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "OnboardingPayload(version=", ", vendorId=", ", productId=");
        TableInfo$$ExternalSyntheticOutline0.m(m29m, i3, ", commissioningFlow=", i4, ", discoveryCapabilities=");
        m29m.append(set);
        m29m.append(", discriminator=");
        m29m.append(i5);
        m29m.append(", hasShortDiscriminator=");
        m29m.append(z);
        m29m.append(", setupPinCode=");
        m29m.append(j);
        m29m.append(", optionalQRCodeInfo=");
        m29m.append(hashMap);
        m29m.append(", optionalVendorData=");
        m29m.append(hashMap2);
        m29m.append(", optionalExtensionData=");
        m29m.append(hashMap3);
        m29m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m29m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lmatter/onboardingpayload/OnboardingPayload$Companion;", "", "<init>", "()V", "isValidSetupPIN", "", "setupPIN", "", "longToShortValue", "", "longValue", "shortToLongValue", "shortValue", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isValidSetupPIN(long setupPIN) {
            return (setupPIN == 0 || setupPIN > OnboardingPayloadKt.kSetupPINCodeMaximumValue || setupPIN == 11111111 || setupPIN == 22222222 || setupPIN == 33333333 || setupPIN == 44444444 || setupPIN == 55555555 || setupPIN == 66666666 || setupPIN == 77777777 || setupPIN == 88888888 || setupPIN == 12345678 || setupPIN == 87654321) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int longToShortValue(int longValue) {
            return longValue >> 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int shortToLongValue(int shortValue) {
            return shortValue << 8;
        }

        private Companion() {
        }
    }

    public final void addSerialNumber(@NotNull String serialNumber) {
        serialNumber.getClass();
        OptionalQRCodeInfoExtension optionalQRCodeInfoExtension = new OptionalQRCodeInfoExtension();
        optionalQRCodeInfoExtension.setTag(0);
        optionalQRCodeInfoExtension.setType(OptionalQRCodeInfoType.TYPE_STRING);
        optionalQRCodeInfoExtension.setData(serialNumber);
        addOptionalExtensionData(optionalQRCodeInfoExtension);
    }

    public final void addOptionalVendorData(int tag, int data) {
        OptionalQRCodeInfo optionalQRCodeInfo = new OptionalQRCodeInfo();
        optionalQRCodeInfo.setTag(tag);
        optionalQRCodeInfo.setType(OptionalQRCodeInfoType.TYPE_INT32);
        optionalQRCodeInfo.setInt32(data);
        addOptionalVendorData(optionalQRCodeInfo);
    }

    public final void addOptionalVendorData(int tag, @NotNull String data) {
        data.getClass();
        OptionalQRCodeInfo optionalQRCodeInfo = new OptionalQRCodeInfo();
        optionalQRCodeInfo.setTag(tag);
        optionalQRCodeInfo.setType(OptionalQRCodeInfoType.TYPE_STRING);
        optionalQRCodeInfo.setData(data);
        addOptionalVendorData(optionalQRCodeInfo);
    }

    public final void setRendezvousInformation(@NotNull Set<? extends DiscoveryCapability> rendezvousInfo) {
        rendezvousInfo.getClass();
        this.discoveryCapabilities.clear();
        this.discoveryCapabilities.addAll(rendezvousInfo);
    }

    public OnboardingPayload(int i, int i2, int i3, int i4, @NotNull Set<DiscoveryCapability> set, int i5, boolean z, long j) {
        set.getClass();
        this.version = i;
        this.vendorId = i2;
        this.productId = i3;
        this.commissioningFlow = i4;
        this.discoveryCapabilities = set;
        this.discriminator = i5;
        this.hasShortDiscriminator = z;
        this.setupPinCode = j;
        this.optionalQRCodeInfo = new HashMap<>();
        this.optionalVendorData = new HashMap<>();
        this.optionalExtensionData = new HashMap<>();
    }

    public OnboardingPayload() {
        this(0, 0, 0, 0, null, 0, false, 0L, 255, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingPayload(int i, int i2, int i3, int i4, @NotNull Set<DiscoveryCapability> set, int i5, long j) {
        this(i, i2, i3, i4, set, i5, false, j);
        set.getClass();
    }
}
