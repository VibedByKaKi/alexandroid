package com.amazon.matter.identity;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.device.api.AuthenticationType;
import com.amazon.matter.net.AuthenticatedURLConnectionFactory;
import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetCustomerTimezoneClient {
    private static final int DCAS_CONNECTION_TIMEOUT_MILLIS = (int) 30000;
    private static final int DCAS_REQUEST_TIMEOUT_MILLIS = (int) 1000;
    private static final String TAG = "GetCustomerTimezoneClient";
    private final AuthenticatedURLConnectionFactory authenticatedURLConnectionFactory;
    private final Context context;
    private final URL dcasGetCustomerTimezoneUrl;
    private final Gson gson;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CustomerTimezoneOutput {
        private final String countryCode;
        private final double latitude;
        private final String localTimeOffset;
        private final String localTimeOffsetInMillis;
        private final double longitude;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerTimezoneOutput(String str, String str2, String str3, double d, double d2) {
            this.countryCode = str;
            this.localTimeOffset = str2;
            this.localTimeOffsetInMillis = str3;
            this.latitude = d;
            this.longitude = d2;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String getCountryCode() {
            return this.countryCode;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public double getLatitude() {
            return this.latitude;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String getLocalTimeOffset() {
            return this.localTimeOffset;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String getLocalTimeOffsetInMillis() {
            return this.localTimeOffsetInMillis;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public double getLongitude() {
            return this.longitude;
        }
    }

    @Inject
    public GetCustomerTimezoneClient(Context context, Gson gson, AuthenticatedURLConnectionFactory authenticatedURLConnectionFactory, @Named("DigitalCustomerAttributeService.getCustomerTimezone") URL url) {
        this.context = context;
        this.gson = gson;
        this.authenticatedURLConnectionFactory = authenticatedURLConnectionFactory;
        this.dcasGetCustomerTimezoneUrl = url;
    }

    @NonNull
    public CustomerTimezoneOutput getCustomerTimezone() throws GetCustomerTimezoneException {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection authenticatedURLConnection = this.authenticatedURLConnectionFactory.getAuthenticatedURLConnection(this.dcasGetCustomerTimezoneUrl, AuthenticationType.ADPAuthenticator);
                authenticatedURLConnection.setRequestMethod("GET");
                authenticatedURLConnection.setRequestProperty("Accept", "application/json");
                authenticatedURLConnection.setRequestProperty("X-Amzn-RequestId", UUID.randomUUID().toString());
                authenticatedURLConnection.setConnectTimeout(DCAS_CONNECTION_TIMEOUT_MILLIS);
                authenticatedURLConnection.setReadTimeout(DCAS_REQUEST_TIMEOUT_MILLIS);
                int responseCode = authenticatedURLConnection.getResponseCode();
                String.format("DCAS getCustomerTimezone response code: %d", Integer.valueOf(responseCode));
                if (responseCode != 200) {
                    throw new GetCustomerTimezoneException(String.format("Request response (%d) not OK", Integer.valueOf(responseCode)));
                }
                InputStreamReader inputStreamReader = new InputStreamReader(authenticatedURLConnection.getInputStream(), StandardCharsets.UTF_8);
                try {
                    String charStreams = CharStreams.toString(inputStreamReader);
                    inputStreamReader.close();
                    CustomerTimezoneOutput customerTimezoneOutput = (CustomerTimezoneOutput) this.gson.fromJson(charStreams, CustomerTimezoneOutput.class);
                    if (customerTimezoneOutput.countryCode == null || customerTimezoneOutput.localTimeOffset == null || customerTimezoneOutput.localTimeOffsetInMillis == null) {
                        throw new GetCustomerTimezoneException("Unexpected response body.");
                    }
                    authenticatedURLConnection.disconnect();
                    return customerTimezoneOutput;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th3;
            }
        } catch (Exception e) {
            throw new GetCustomerTimezoneException(e.getMessage(), e);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetCustomerTimezoneException extends Exception {
        public GetCustomerTimezoneException(String str) {
            super(str);
        }

        public GetCustomerTimezoneException(String str, Throwable th) {
            super(str, th);
        }
    }
}
