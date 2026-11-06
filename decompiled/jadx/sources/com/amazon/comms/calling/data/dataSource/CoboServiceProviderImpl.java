package com.amazon.comms.calling.data.dataSource;

import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.ShortNumberInfo;
import defpackage.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CoboServiceProviderImpl;", "Lcom/amazon/comms/calling/data/dataSource/CoboServiceProvider;", "arcusConfig", "Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;", "<init>", "(Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;)V", "getArcusConfig", "()Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;", "phoneNumberUtil", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "kotlin.jvm.PlatformType", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "shortNumberInfo", "Lcom/google/i18n/phonenumbers/ShortNumberInfo;", "Lcom/google/i18n/phonenumbers/ShortNumberInfo;", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "getPhoneNumberFromSipUri", "", "sipURI", "generatePstnSipUri", "phoneNumber", "formatPhoneNumber", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CoboServiceProviderImpl implements CoboServiceProvider {

    @NotNull
    public static final String DEFAULT_REGION = "US";

    @NotNull
    public static final String PHONE_NUMBER = "PHONE_NUMBER";

    @NotNull
    public static final String SIP_PSTN_URI_FORMAT_KEY = "SIPProxy.PstnUriFormats.PFM.${PFM}";

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final AlexaCommsCoreRemoteConfigurationService arcusConfig;
    private final PhoneNumberUtil phoneNumberUtil;
    private final ShortNumberInfo shortNumberInfo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CoboServiceProviderImpl.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern PATTERN_PHONE_NUMBER = Pattern.compile("(sips:([^@]+))");

    @Inject
    public CoboServiceProviderImpl(@NotNull AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService) {
        alexaCommsCoreRemoteConfigurationService.getClass();
        this.arcusConfig = alexaCommsCoreRemoteConfigurationService;
        this.phoneNumberUtil = PhoneNumberUtil.getInstance();
        this.shortNumberInfo = ShortNumberInfo.getInstance();
        this.LOG = new CallingLogger();
    }

    private final String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 0) {
            return null;
        }
        try {
            Phonenumber.PhoneNumber parse = this.phoneNumberUtil.parse(phoneNumber, "US");
            return !this.shortNumberInfo.isPossibleShortNumber(parse) ? this.phoneNumberUtil.format(parse, PhoneNumberUtil.PhoneNumberFormat.E164) : phoneNumber;
        } catch (NumberParseException e) {
            this.getLOG().e("Could not format phone number: " + this.getLOG().sensitive(phoneNumber), e);
            return phoneNumber;
        }
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.comms.calling.data.dataSource.CoboServiceProvider
    @Nullable
    public String generatePstnSipUri(@NotNull String phoneNumber) {
        String replace$default;
        String replace$default2;
        phoneNumber.getClass();
        if (phoneNumber.length() == 0) {
            getLOG().e("Invalid pstn uri format: null");
            return null;
        }
        String obj = this.arcusConfig.getRemoteConfiguration("SIPProxy.PstnUriFormats.PFM.${PFM}", "").toString();
        if (obj.length() == 0) {
            getLOG().e("Invalid pstn uri format: null");
            return null;
        }
        String formatPhoneNumber = formatPhoneNumber(phoneNumber);
        if (formatPhoneNumber != null) {
            replace$default2 = StringsKt__StringsJVMKt.replace$default(obj, "PHONE_NUMBER", formatPhoneNumber, false, 4, (Object) null);
            return replace$default2;
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(obj, "PHONE_NUMBER", phoneNumber, false, 4, (Object) null);
        return replace$default;
    }

    @NotNull
    public final AlexaCommsCoreRemoteConfigurationService getArcusConfig() {
        return this.arcusConfig;
    }

    @Override // com.amazon.comms.calling.data.dataSource.CoboServiceProvider
    @Nullable
    public String getPhoneNumberFromSipUri(@NotNull String sipURI) {
        sipURI.getClass();
        if (sipURI.length() == 0) {
            return null;
        }
        Matcher matcher = PATTERN_PHONE_NUMBER.matcher(sipURI);
        if (matcher.find()) {
            return matcher.group(matcher.groupCount());
        }
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CoboServiceProviderImpl$Companion;", "", "<init>", "()V", "SIP_PSTN_URI_FORMAT_KEY", "", "DEFAULT_REGION", "PHONE_NUMBER", "PATTERN_PHONE_NUMBER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getPATTERN_PHONE_NUMBER", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pattern getPATTERN_PHONE_NUMBER() {
            return CoboServiceProviderImpl.PATTERN_PHONE_NUMBER;
        }

        private Companion() {
        }
    }
}
