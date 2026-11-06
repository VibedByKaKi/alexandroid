package com.amazon.alexa.enrollment.unified.speakerid.error;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.enrollment.unified.R;
import com.amazon.alexa.enrollment.unified.speakerid.metrics.SpeakerIDMetricsConstants;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.dee.app.http.CoralServiceException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpeakerIDErrorParser {
    public static final String BLANK_NAME = "";
    public static final int INDICATE_SHOW_DYNAMIC_TEXT_TO_UI_LAYER = 0;
    private static final String TAG = "SpeakerIDErrorParser";
    private final Context mContext;
    private static final int DEFAULT_TITLE_RESOURCE_ID = R.string.handle_non_retry_title;
    private static final int DEFAULT_MESSAGE_RESOURCE_ID = R.string.handle_non_retry_msg;

    public SpeakerIDErrorParser(Context context) {
        this.mContext = context;
    }

    private SpeakerIDEnrollmentError getNetworkUnavailableError(Throwable th) {
        return new SpeakerIDEnrollmentError(R.string.internet_alert_dialog_title, R.string.internet_alert_dialog_description, "", th, true, SpeakerIDMetricsConstants.ErrorType.NETWORK_UNAVAILABLE, new SpeakerIDErrorParser(this.mContext));
    }

    private boolean isConnectedToNetwork() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public EnrollmentErrorContract getEnrollmentErrorContract(@NonNull Throwable th) {
        return getEnrollmentErrorContract(getSpeakerIDEnrollmentError(th));
    }

    @Nullable
    public SpeakerIDMetricsConstants.ErrorType getErrorType(Throwable th) {
        if (th instanceof NonRetryableSilenceException) {
            return SpeakerIDMetricsConstants.ErrorType.SILENCE_NON_RETRYABLE;
        }
        if (th instanceof HandleSilenceException) {
            return SpeakerIDMetricsConstants.ErrorType.SILENCE_RETRYABLE;
        }
        if (th instanceof NonRetryableQualityFailureException) {
            return SpeakerIDMetricsConstants.ErrorType.LOW_QUALITY_UTTERANCE_NON_RETRYABLE;
        }
        if (th instanceof RetryableQualityFailureException) {
            return SpeakerIDMetricsConstants.ErrorType.LOW_QUALITY_UTTERANCE_RETRYABLE;
        }
        if (th instanceof UserCancelledException) {
            return SpeakerIDMetricsConstants.ErrorType.USER_CANCELLED_EXCEPTION;
        }
        return null;
    }

    public SpeakerIDEnrollmentError getSpeakerIDEnrollmentError(@NonNull Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        String str = TAG;
        Log.i(str, "enrollment status error: " + th.getMessage());
        if ((th instanceof CoralServiceException) && !isConnectedToNetwork()) {
            return getNetworkUnavailableError(th);
        }
        if (!(th instanceof EnrollmentException)) {
            Log.e(str, "Unrecognized exception, returning generic error");
            return new GenericSpeakerIDEnrollmentError(DEFAULT_TITLE_RESOURCE_ID, DEFAULT_MESSAGE_RESOURCE_ID, "", th, true, this.mContext);
        }
        boolean canShowInlineError = ((EnrollmentException) th).canShowInlineError();
        boolean z = !canShowInlineError;
        if (canShowInlineError) {
            i = 0;
            i2 = 0;
        } else {
            if (!(th instanceof EnrollmentDialogException)) {
                i3 = DEFAULT_TITLE_RESOURCE_ID;
                i4 = DEFAULT_MESSAGE_RESOURCE_ID;
            } else if ((th instanceof NonRetryableException) || (th instanceof InvalidEnrollmentStatusException)) {
                i3 = R.string.handle_non_retry_title;
                i4 = R.string.handle_non_retry_msg;
            } else if (th instanceof VoiceProfileAlreadyExistsException) {
                i3 = R.string.voice_profile_exist_error_title;
                i4 = R.string.voice_profile_exist_error_desc;
            } else {
                EnrollmentDialogException enrollmentDialogException = (EnrollmentDialogException) th;
                int titleResId = enrollmentDialogException.getTitleResId();
                i2 = enrollmentDialogException.getMessageResId();
                i = titleResId;
            }
            i = i3;
            i2 = i4;
        }
        return new SpeakerIDEnrollmentError(i, i2, "", th, z, getErrorType(th), new SpeakerIDErrorParser(this.mContext));
    }

    public EnrollmentErrorContract getEnrollmentErrorContract(@NonNull final SpeakerIDEnrollmentError speakerIDEnrollmentError) {
        return new EnrollmentErrorContract() { // from class: com.amazon.alexa.enrollment.unified.speakerid.error.SpeakerIDErrorParser.1
            @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
            public String getErrorCode() {
                return speakerIDEnrollmentError.getErrorCode();
            }

            @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
            public String getName() {
                return speakerIDEnrollmentError.getName();
            }

            @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
            public int getReasonRes() {
                return speakerIDEnrollmentError.getReasonRes();
            }

            @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
            public int getReasonTitleRes() {
                return speakerIDEnrollmentError.getReasonTitleRes();
            }

            @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
            public boolean isTerminalError() {
                return speakerIDEnrollmentError.isTerminalError();
            }
        };
    }
}
