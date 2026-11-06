package com.amazon.comms.calling.sipclient;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import com.amazon.deecomms.common.Constants;
import com.amazon.photos.uploader.cds.error.CdsErrorCodes;
import org.apache.commons.net.nntp.NNTPReply;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TSX_TIMEOUT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SipStatusCode {
    private static final /* synthetic */ SipStatusCode[] $VALUES;
    public static final SipStatusCode ADDRESS_INCOMPLETE;
    public static final SipStatusCode AMBIGUOUS;
    public static final SipStatusCode BAD_EVENT;
    public static final SipStatusCode BAD_EXTENSION;
    public static final SipStatusCode BAD_GATEWAY;
    public static final SipStatusCode BUSY_EVERYWHERE;
    public static final SipStatusCode BUSY_HERE;
    public static final SipStatusCode CALL_TSX_DOES_NOT_EXIST;
    public static final SipStatusCode CSMS_TOKEN_REFRESH_ERROR;
    public static final SipStatusCode DECLINE;
    public static final SipStatusCode DOES_NOT_EXIST_ANYWHERE;
    public static final SipStatusCode EXTENSION_REQUIRED;
    public static final SipStatusCode GONE;
    public static final SipStatusCode INTERNAL_SERVER_ERROR;
    public static final SipStatusCode INTERVAL_TOO_BRIEF;
    public static final SipStatusCode LOOP_DETECTED;
    public static final SipStatusCode MESSAGE_TOO_LARGE;
    public static final SipStatusCode NOT_ACCEPTABLE_ANYWHERE;
    public static final SipStatusCode NOT_ACCEPTABLE_HERE;
    public static final SipStatusCode NOT_IMPLEMENTED;
    public static final SipStatusCode NO_FUNDS_AVAILABLE;
    public static final SipStatusCode PRECONDITION_FAILURE;
    public static final SipStatusCode REQUEST_ENTITY_TOO_LARGE;
    public static final SipStatusCode REQUEST_PENDING;
    public static final SipStatusCode REQUEST_TERMINATED;
    public static final SipStatusCode REQUEST_TIMEOUT;
    public static final SipStatusCode REQUEST_UPDATED;
    public static final SipStatusCode REQUEST_URI_TOO_LONG;
    public static final SipStatusCode SERVER_TIMEOUT;
    public static final SipStatusCode SERVICE_UNAVAILABLE;
    public static final SipStatusCode SESSION_TIMER_TOO_SMALL;
    public static final SipStatusCode TEMPORARILY_UNAVAILABLE;
    public static final SipStatusCode TOO_MANY_HOPS;
    public static final SipStatusCode TSX_TIMEOUT;
    public static final SipStatusCode TSX_TRANSPORT_ERROR;
    public static final SipStatusCode UNDECIPHERABLE;
    public static final SipStatusCode UNSUPPORTED_MEDIA_TYPE;
    public static final SipStatusCode UNSUPPORTED_URI_SCHEME;
    public static final SipStatusCode VERSION_NOT_SUPPORTED;
    public static final SipStatusCode _force_32bit;
    private int mCode;
    public static final SipStatusCode TRYING = new SipStatusCode("TRYING", 0, 100);
    public static final SipStatusCode RINGING = new SipStatusCode("RINGING", 1, 180);
    public static final SipStatusCode CALL_BEING_FORWARDED = new SipStatusCode("CALL_BEING_FORWARDED", 2, 181);
    public static final SipStatusCode QUEUED = new SipStatusCode("QUEUED", 3, 182);
    public static final SipStatusCode PROGRESS = new SipStatusCode("PROGRESS", 4, 183);
    public static final SipStatusCode OK = new SipStatusCode("OK", 5, 200);
    public static final SipStatusCode ACCEPTED = new SipStatusCode("ACCEPTED", 6, 202);
    public static final SipStatusCode MULTIPLE_CHOICES = new SipStatusCode("MULTIPLE_CHOICES", 7, 300);
    public static final SipStatusCode MOVED_PERMANENTLY = new SipStatusCode("MOVED_PERMANENTLY", 8, 301);
    public static final SipStatusCode MOVED_TEMPORARILY = new SipStatusCode("MOVED_TEMPORARILY", 9, 302);
    public static final SipStatusCode USE_PROXY = new SipStatusCode("USE_PROXY", 10, 305);
    public static final SipStatusCode ALTERNATIVE_SERVICE = new SipStatusCode("ALTERNATIVE_SERVICE", 11, 380);
    public static final SipStatusCode BAD_REQUEST = new SipStatusCode("BAD_REQUEST", 12, 400);
    public static final SipStatusCode UNAUTHORIZED = new SipStatusCode(ErrorConstants.UNAUTHORIZED, 13, 401);
    public static final SipStatusCode PAYMENT_REQUIRED = new SipStatusCode("PAYMENT_REQUIRED", 14, 402);
    public static final SipStatusCode FORBIDDEN = new SipStatusCode("FORBIDDEN", 15, 403);
    public static final SipStatusCode NOT_FOUND = new SipStatusCode("NOT_FOUND", 16, 404);
    public static final SipStatusCode METHOD_NOT_ALLOWED = new SipStatusCode("METHOD_NOT_ALLOWED", 17, 405);
    public static final SipStatusCode NOT_ACCEPTABLE = new SipStatusCode("NOT_ACCEPTABLE", 18, 406);
    public static final SipStatusCode PROXY_AUTHENTICATION_REQUIRED = new SipStatusCode("PROXY_AUTHENTICATION_REQUIRED", 19, 407);

    private static /* synthetic */ SipStatusCode[] $values() {
        return new SipStatusCode[]{TRYING, RINGING, CALL_BEING_FORWARDED, QUEUED, PROGRESS, OK, ACCEPTED, MULTIPLE_CHOICES, MOVED_PERMANENTLY, MOVED_TEMPORARILY, USE_PROXY, ALTERNATIVE_SERVICE, BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE, PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT, GONE, REQUEST_ENTITY_TOO_LARGE, REQUEST_URI_TOO_LONG, UNSUPPORTED_MEDIA_TYPE, UNSUPPORTED_URI_SCHEME, BAD_EXTENSION, EXTENSION_REQUIRED, SESSION_TIMER_TOO_SMALL, INTERVAL_TOO_BRIEF, CSMS_TOKEN_REFRESH_ERROR, NO_FUNDS_AVAILABLE, TEMPORARILY_UNAVAILABLE, CALL_TSX_DOES_NOT_EXIST, LOOP_DETECTED, TOO_MANY_HOPS, ADDRESS_INCOMPLETE, AMBIGUOUS, BUSY_HERE, REQUEST_TERMINATED, NOT_ACCEPTABLE_HERE, BAD_EVENT, REQUEST_UPDATED, REQUEST_PENDING, UNDECIPHERABLE, INTERNAL_SERVER_ERROR, NOT_IMPLEMENTED, BAD_GATEWAY, SERVICE_UNAVAILABLE, SERVER_TIMEOUT, VERSION_NOT_SUPPORTED, MESSAGE_TOO_LARGE, PRECONDITION_FAILURE, BUSY_EVERYWHERE, DECLINE, DOES_NOT_EXIST_ANYWHERE, NOT_ACCEPTABLE_ANYWHERE, TSX_TIMEOUT, TSX_TRANSPORT_ERROR, _force_32bit};
    }

    static {
        SipStatusCode sipStatusCode = new SipStatusCode("REQUEST_TIMEOUT", 20, 408);
        REQUEST_TIMEOUT = sipStatusCode;
        GONE = new SipStatusCode(Constants.GONE, 21, 410);
        REQUEST_ENTITY_TOO_LARGE = new SipStatusCode("REQUEST_ENTITY_TOO_LARGE", 22, 413);
        REQUEST_URI_TOO_LONG = new SipStatusCode("REQUEST_URI_TOO_LONG", 23, 414);
        UNSUPPORTED_MEDIA_TYPE = new SipStatusCode("UNSUPPORTED_MEDIA_TYPE", 24, 415);
        UNSUPPORTED_URI_SCHEME = new SipStatusCode("UNSUPPORTED_URI_SCHEME", 25, 416);
        BAD_EXTENSION = new SipStatusCode("BAD_EXTENSION", 26, 420);
        EXTENSION_REQUIRED = new SipStatusCode("EXTENSION_REQUIRED", 27, 421);
        SESSION_TIMER_TOO_SMALL = new SipStatusCode("SESSION_TIMER_TOO_SMALL", 28, 422);
        INTERVAL_TOO_BRIEF = new SipStatusCode("INTERVAL_TOO_BRIEF", 29, 423);
        CSMS_TOKEN_REFRESH_ERROR = new SipStatusCode("CSMS_TOKEN_REFRESH_ERROR", 30, 446);
        NO_FUNDS_AVAILABLE = new SipStatusCode("NO_FUNDS_AVAILABLE", 31, 472);
        TEMPORARILY_UNAVAILABLE = new SipStatusCode("TEMPORARILY_UNAVAILABLE", 32, 480);
        CALL_TSX_DOES_NOT_EXIST = new SipStatusCode("CALL_TSX_DOES_NOT_EXIST", 33, 481);
        LOOP_DETECTED = new SipStatusCode("LOOP_DETECTED", 34, NNTPReply.AUTHENTICATION_REJECTED);
        TOO_MANY_HOPS = new SipStatusCode("TOO_MANY_HOPS", 35, 483);
        ADDRESS_INCOMPLETE = new SipStatusCode("ADDRESS_INCOMPLETE", 36, 484);
        AMBIGUOUS = new SipStatusCode("AMBIGUOUS", 37, 485);
        BUSY_HERE = new SipStatusCode("BUSY_HERE", 38, 486);
        REQUEST_TERMINATED = new SipStatusCode("REQUEST_TERMINATED", 39, 487);
        NOT_ACCEPTABLE_HERE = new SipStatusCode("NOT_ACCEPTABLE_HERE", 40, 488);
        BAD_EVENT = new SipStatusCode("BAD_EVENT", 41, 489);
        REQUEST_UPDATED = new SipStatusCode("REQUEST_UPDATED", 42, 490);
        REQUEST_PENDING = new SipStatusCode("REQUEST_PENDING", 43, 491);
        UNDECIPHERABLE = new SipStatusCode("UNDECIPHERABLE", 44, 493);
        INTERNAL_SERVER_ERROR = new SipStatusCode(CdsErrorCodes.internalServerError, 45, 500);
        NOT_IMPLEMENTED = new SipStatusCode("NOT_IMPLEMENTED", 46, 501);
        BAD_GATEWAY = new SipStatusCode("BAD_GATEWAY", 47, 502);
        SipStatusCode sipStatusCode2 = new SipStatusCode("SERVICE_UNAVAILABLE", 48, 503);
        SERVICE_UNAVAILABLE = sipStatusCode2;
        SERVER_TIMEOUT = new SipStatusCode("SERVER_TIMEOUT", 49, 504);
        VERSION_NOT_SUPPORTED = new SipStatusCode("VERSION_NOT_SUPPORTED", 50, 505);
        MESSAGE_TOO_LARGE = new SipStatusCode("MESSAGE_TOO_LARGE", 51, 513);
        PRECONDITION_FAILURE = new SipStatusCode("PRECONDITION_FAILURE", 52, 580);
        BUSY_EVERYWHERE = new SipStatusCode("BUSY_EVERYWHERE", 53, 600);
        DECLINE = new SipStatusCode("DECLINE", 54, TypedValues.MotionType.TYPE_EASING);
        DOES_NOT_EXIST_ANYWHERE = new SipStatusCode("DOES_NOT_EXIST_ANYWHERE", 55, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR);
        NOT_ACCEPTABLE_ANYWHERE = new SipStatusCode("NOT_ACCEPTABLE_ANYWHERE", 56, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
        TSX_TIMEOUT = new SipStatusCode("TSX_TIMEOUT", 57, sipStatusCode.getCode());
        TSX_TRANSPORT_ERROR = new SipStatusCode("TSX_TRANSPORT_ERROR", 58, sipStatusCode2.getCode());
        _force_32bit = new SipStatusCode("_force_32bit", 59, Integer.MAX_VALUE);
        $VALUES = $values();
    }

    private SipStatusCode(String str, int i, int i2) {
        this.mCode = i2;
    }

    public static SipStatusCode valueOf(String str) {
        return (SipStatusCode) Enum.valueOf(SipStatusCode.class, str);
    }

    public static SipStatusCode[] values() {
        return (SipStatusCode[]) $VALUES.clone();
    }

    public int getCode() {
        return this.mCode;
    }
}
