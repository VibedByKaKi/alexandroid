package com.amazon.ds2.oobe.metrics;

import chip.platform.ConfigurationManager;
import com.amazon.alexa.accessory.avsclient.metrics.AccessoryMetricsConstants;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.device.DefaultDeviceInformation;
import com.amazon.alexa.devicesetup.sdk.whisperjoin.helper.ProvisioningConstants;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.ds2.oobe.metrics.result.AuthenticationResult;
import com.amazon.ds2.oobe.metrics.result.OobeResult;
import com.amazon.ds2.oobe.metrics.result.Result;
import com.amazon.tarazed.logging.TarazedLogFormatter;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Key {
    public static final TypedKey<String> ADVERTISED_PRODUCT_ID = new TypedKey<>("advertisedProductId");
    public static final TypedKey<String> APP_ID = new TypedKey<>(SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY);
    public static final TypedKey<String> APP_VERSION = new TypedKey<>("appVersion");
    public static final TypedKey<String> AUTH_MATERIAL_INDEX = new TypedKey<>(ProvisioningConstants.DEVICE_SETUP_AUTH_MATERIAL_INDEX);
    public static final TypedKey<String> AUTHENTICATION_CHALLENGE = new TypedKey<>("authenticationChallenge");
    public static final TypedKey<String> AUTHENTICATION_ERROR = new TypedKey<>("authenticationError");
    public static final TypedKey<String> AUTHENTICATION_MODE = new TypedKey<>("authenticationMode");
    public static final TypedKey<AuthenticationResult> AUTHENTICATION_RESULT = new TypedKey<>("authenticationResult");
    public static final TypedKey<String> AUTHENTICATION_STEP = new TypedKey<>("authenticationStep");
    public static final TypedKey<String> BATCH_ID = new TypedKey<>("batchId");
    public static final TypedKey<Long> BATCH_NUMBER = new TypedKey<>("batchNumber");
    public static final TypedKey<String> CONNECTION_ERROR = new TypedKey<>(MetricsConstants.Session.SESSION_RELEASED_REASON_CONNECTION_ERROR);
    public static final TypedKey<String> CONNECTION_EVENT = new TypedKey<>("connectionEvent");
    public static final TypedKey<String> CONNECTION_MODE = new TypedKey<>("connectionMode");
    public static final TypedKey<String> CONNECTION_STATE = new TypedKey<>("connectionState");
    public static final TypedKey<Long> COUNT = new TypedKey<>("count");
    public static final TypedKey<Long> DURATION = new TypedKey<>("duration");
    public static final TypedKey<Long> EPOCH_TIME = new TypedKey<>("epochTime");
    public static final TypedKey<String> EVENT_ID = new TypedKey<>("eventId");
    public static final TypedKey<String> EVENT_SOURCE = new TypedKey<>("eventSource");
    public static final TypedKey<String> EXPERIMENT_ID = new TypedKey<>(PayloadUtils.PayloadKeys.EXPERIMENT_ID);
    public static final TypedKey<String> EXPERIMENT_SOURCE = new TypedKey<>("experimentSource");
    public static final TypedKey<String> EXPERIMENT_TREATMENT = new TypedKey<>("experimentTreatment");
    public static final TypedKey<Long> EXPIRATION = new TypedKey<>(FragmentMetaData.EXPIRATION);
    public static final TypedKey<String> FFS_ERROR = new TypedKey<>("ffsError");
    public static final TypedKey<String> FFS_MODE = new TypedKey<>("ffsMode");
    public static final TypedKey<String> FFS_NONCE = new TypedKey<>("ffsNonce");
    public static final TypedKey<String> NETWORK_INTERFACE = new TypedKey<>("networkInterface");
    public static final TypedKey<String> NETWORK_SECURITY = new TypedKey<>("networkSecurity");
    public static final TypedKey<OobeResult> OOBE_RESULT = new TypedKey<>("oobeResult");
    public static final TypedKey<String> OTA_ERROR = new TypedKey<>("otaError");
    public static final TypedKey<String> OTA_EVENT = new TypedKey<>("otaEvent");
    public static final TypedKey<Boolean> OTA_REBOOT = new TypedKey<>("otaReboot");
    public static final TypedKey<String> OTA_STATE = new TypedKey<>("otaState");
    public static final TypedKey<String> OTA_TYPE = new TypedKey<>("otaType");
    public static final TypedKey<String> PROVISIONEE_ID = new TypedKey<>("provisioneeId");
    public static final TypedKey<String> PROVISIONING_MODE = new TypedKey<>("provisioningMode");
    public static final TypedKey<String> REGISTRATION_ERROR = new TypedKey<>("registrationError");
    public static final TypedKey<String> REGISTRATION_MODE = new TypedKey<>("registrationMode");
    public static final TypedKey<Result> RESULT = new TypedKey<>("result");
    public static final TypedKey<Double> RSSI = new TypedKey<>("rssi");
    public static final TypedKey<String> SCAN_ERROR = new TypedKey<>("scanError");
    public static final TypedKey<String> SCHEMA_VERSION = new TypedKey<>("schemaVersion");
    public static final TypedKey<Long> SEQUENCE_NUMBER = new TypedKey<>(AccessoryMetricsConstants.CustomAttribute.SEQUENCE_NUMBER);
    public static final TypedKey<String> SESSION_ID = new TypedKey<>(LiveTranslationCapabilityConstants.KEY_SESSION_ID);
    public static final TypedKey<String> UNIQUE_ID = new TypedKey<>(ConfigurationManager.kConfigKey_UniqueId);
    public static final TypedKey<String> UPSELL_ID = new TypedKey<>("upsellId");
    public static final TypedKey<String> UPSELL_RESULT = new TypedKey<>("upsellResult");
    public static final TypedKey<Long> UPTIME = new TypedKey<>("uptime");
    public static final TypedKey<String> VIEW_ID = new TypedKey<>("viewId");
    public static final TypedKey<String> EVENT = new TypedKey<>("event");
    public static final TypedKey<String> TRIGGER = new TypedKey<>("trigger");
    public static final TypedKey<String> SEQUENCE_SESSION = new TypedKey<>(MetricsConstants.ProtoMetricsKey.SEQUENCE_SESSION);
    public static final TypedKey<Long> SEQUENCE = new TypedKey<>("sequence");
    public static final TypedKey<String> PROTO_VERSION = new TypedKey<>(MetricsConstants.ProtoMetricsKey.PROTO_VERSION);

    private Key() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TypedKey valueOf(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2046652343:
                if (str.equals("UNIQUE_ID")) {
                    c = 0;
                    break;
                }
                break;
            case -2029859848:
                if (str.equals("SEQUENCE_SESSION")) {
                    c = 1;
                    break;
                }
                break;
            case -1905424057:
                if (str.equals("CONNECTION_ERROR")) {
                    c = 2;
                    break;
                }
                break;
            case -1905317415:
                if (str.equals("CONNECTION_EVENT")) {
                    c = 3;
                    break;
                }
                break;
            case -1892451376:
                if (str.equals("CONNECTION_STATE")) {
                    c = 4;
                    break;
                }
                break;
            case -1881097187:
                if (str.equals(SimbaEventProcessor.SOURCE_RESULT)) {
                    c = 5;
                    break;
                }
                break;
            case -1856611961:
                if (str.equals("SEQUENCE_NUMBER")) {
                    c = 6;
                    break;
                }
                break;
            case -1809090333:
                if (str.equals("EPOCH_TIME")) {
                    c = 7;
                    break;
                }
                break;
            case -1785032728:
                if (str.equals("UPTIME")) {
                    c = '\b';
                    break;
                }
                break;
            case -1772641915:
                if (str.equals("PROVISIONEE_ID")) {
                    c = '\t';
                    break;
                }
                break;
            case -1701600696:
                if (str.equals("OTA_REBOOT")) {
                    c = '\n';
                    break;
                }
                break;
            case -1679304979:
                if (str.equals("ADVERTISED_PRODUCT_ID")) {
                    c = 11;
                    break;
                }
                break;
            case -1477191359:
                if (str.equals("PROTO_VERSION")) {
                    c = '\f';
                    break;
                }
                break;
            case -1434760863:
                if (str.equals("AUTHENTICATION_ERROR")) {
                    c = '\r';
                    break;
                }
                break;
            case -1397840535:
                if (str.equals("REGISTRATION_MODE")) {
                    c = 14;
                    break;
                }
                break;
            case -1209385580:
                if (str.equals("DURATION")) {
                    c = 15;
                    break;
                }
                break;
            case -1172986840:
                if (str.equals("NETWORK_INTERFACE")) {
                    c = 16;
                    break;
                }
                break;
            case -1167705148:
                if (str.equals("AUTHENTICATION_RESULT")) {
                    c = 17;
                    break;
                }
                break;
            case -1090710980:
                if (str.equals("FFS_ERROR")) {
                    c = 18;
                    break;
                }
                break;
            case -1082492893:
                if (str.equals("FFS_NONCE")) {
                    c = 19;
                    break;
                }
                break;
            case -1075609159:
                if (str.equals("OOBE_RESULT")) {
                    c = 20;
                    break;
                }
                break;
            case -1015986129:
                if (str.equals("UPSELL_RESULT")) {
                    c = 21;
                    break;
                }
                break;
            case -911474592:
                if (str.equals("BATCH_ID")) {
                    c = 22;
                    break;
                }
                break;
            case -835237731:
                if (str.equals("EXPERIMENT_ID")) {
                    c = 23;
                    break;
                }
                break;
            case -744948811:
                if (str.equals("PROVISIONING_MODE")) {
                    c = 24;
                    break;
                }
                break;
            case -564819299:
                if (str.equals("OTA_TYPE")) {
                    c = 25;
                    break;
                }
                break;
            case -560642022:
                if (str.equals("SCHEMA_VERSION")) {
                    c = 26;
                    break;
                }
                break;
            case -492948842:
                if (str.equals("EXPERIMENT_TREATMENT")) {
                    c = 27;
                    break;
                }
                break;
            case -390668574:
                if (str.equals("REGISTRATION_ERROR")) {
                    c = TarazedLogFormatter.FILE_SEPARATOR;
                    break;
                }
                break;
            case -352373073:
                if (str.equals("EXPIRATION")) {
                    c = 29;
                    break;
                }
                break;
            case -343588123:
                if (str.equals("OTA_ERROR")) {
                    c = 30;
                    break;
                }
                break;
            case -343481481:
                if (str.equals("OTA_EVENT")) {
                    c = 31;
                    break;
                }
                break;
            case -341909096:
                if (str.equals("TRIGGER")) {
                    c = ' ';
                    break;
                }
                break;
            case -339015011:
                if (str.equals("EXPERIMENT_SOURCE")) {
                    c = '!';
                    break;
                }
                break;
            case -330615442:
                if (str.equals("OTA_STATE")) {
                    c = '\"';
                    break;
                }
                break;
            case 2525271:
                if (str.equals("RSSI")) {
                    c = '#';
                    break;
                }
                break;
            case 64313583:
                if (str.equals("COUNT")) {
                    c = '$';
                    break;
                }
                break;
            case 66353786:
                if (str.equals("EVENT")) {
                    c = '%';
                    break;
                }
                break;
            case 92499722:
                if (str.equals("AUTHENTICATION_MODE")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 92683315:
                if (str.equals("AUTHENTICATION_STEP")) {
                    c = '\'';
                    break;
                }
                break;
            case 579902478:
                if (str.equals("BATCH_NUMBER")) {
                    c = '(';
                    break;
                }
                break;
            case 639265190:
                if (str.equals("SCAN_ERROR")) {
                    c = ')';
                    break;
                }
                break;
            case 648069905:
                if (str.equals("AUTH_MATERIAL_INDEX")) {
                    c = '*';
                    break;
                }
                break;
            case 756523601:
                if (str.equals("NETWORK_SECURITY")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case 1058314044:
                if (str.equals("AUTHENTICATION_CHALLENGE")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 1060776192:
                if (str.equals("EVENT_ID")) {
                    c = '-';
                    break;
                }
                break;
            case 1172241653:
                if (str.equals("VIEW_ID")) {
                    c = '.';
                    break;
                }
                break;
            case 1186446458:
                if (str.equals(DefaultDeviceInformation.APP_VERSION)) {
                    c = '/';
                    break;
                }
                break;
            case 1372417581:
                if (str.equals("UPSELL_ID")) {
                    c = '0';
                    break;
                }
                break;
            case 1708196224:
                if (str.equals("EVENT_SOURCE")) {
                    c = '1';
                    break;
                }
                break;
            case 1878432356:
                if (str.equals("CONNECTION_MODE")) {
                    c = '2';
                    break;
                }
                break;
            case 1904713423:
                if (str.equals("FFS_MODE")) {
                    c = '3';
                    break;
                }
                break;
            case 1937253401:
                if (str.equals("APP_ID")) {
                    c = '4';
                    break;
                }
                break;
            case 2132174785:
                if (str.equals("SEQUENCE")) {
                    c = '5';
                    break;
                }
                break;
            case 2146976644:
                if (str.equals("SESSION_ID")) {
                    c = '6';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return UNIQUE_ID;
            case 1:
                return SEQUENCE_SESSION;
            case 2:
                return CONNECTION_ERROR;
            case 3:
                return CONNECTION_EVENT;
            case 4:
                return CONNECTION_STATE;
            case 5:
                return RESULT;
            case 6:
                return SEQUENCE_NUMBER;
            case 7:
                return EPOCH_TIME;
            case '\b':
                return UPTIME;
            case '\t':
                return PROVISIONEE_ID;
            case '\n':
                return OTA_REBOOT;
            case 11:
                return ADVERTISED_PRODUCT_ID;
            case '\f':
                return PROTO_VERSION;
            case '\r':
                return AUTHENTICATION_ERROR;
            case 14:
                return REGISTRATION_MODE;
            case 15:
                return DURATION;
            case 16:
                return NETWORK_INTERFACE;
            case 17:
                return AUTHENTICATION_RESULT;
            case 18:
                return FFS_ERROR;
            case 19:
                return FFS_NONCE;
            case 20:
                return OOBE_RESULT;
            case 21:
                return UPSELL_RESULT;
            case 22:
                return BATCH_ID;
            case 23:
                return EXPERIMENT_ID;
            case 24:
                return PROVISIONING_MODE;
            case 25:
                return OTA_TYPE;
            case 26:
                return SCHEMA_VERSION;
            case 27:
                return EXPERIMENT_TREATMENT;
            case 28:
                return REGISTRATION_ERROR;
            case 29:
                return EXPIRATION;
            case 30:
                return OTA_ERROR;
            case 31:
                return OTA_EVENT;
            case ' ':
                return TRIGGER;
            case '!':
                return EXPERIMENT_SOURCE;
            case '\"':
                return OTA_STATE;
            case '#':
                return RSSI;
            case '$':
                return COUNT;
            case '%':
                return EVENT;
            case '&':
                return AUTHENTICATION_MODE;
            case '\'':
                return AUTHENTICATION_STEP;
            case '(':
                return BATCH_NUMBER;
            case ')':
                return SCAN_ERROR;
            case '*':
                return AUTH_MATERIAL_INDEX;
            case '+':
                return NETWORK_SECURITY;
            case ',':
                return AUTHENTICATION_CHALLENGE;
            case '-':
                return EVENT_ID;
            case '.':
                return VIEW_ID;
            case '/':
                return APP_VERSION;
            case '0':
                return UPSELL_ID;
            case '1':
                return EVENT_SOURCE;
            case '2':
                return CONNECTION_MODE;
            case '3':
                return FFS_MODE;
            case '4':
                return APP_ID;
            case '5':
                return SEQUENCE;
            case '6':
                return SESSION_ID;
            default:
                Single$$ExternalSyntheticBUOutline0.m$3("Unknown Key: ".concat(str));
                return null;
        }
    }
}
