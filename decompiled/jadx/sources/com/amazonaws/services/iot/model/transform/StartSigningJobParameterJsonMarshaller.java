package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazonaws.services.iot.model.Destination;
import com.amazonaws.services.iot.model.SigningProfileParameter;
import com.amazonaws.services.iot.model.StartSigningJobParameter;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StartSigningJobParameterJsonMarshaller {
    private static StartSigningJobParameterJsonMarshaller instance;

    public static StartSigningJobParameterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StartSigningJobParameterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StartSigningJobParameter startSigningJobParameter, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (startSigningJobParameter.getSigningProfileParameter() != null) {
            SigningProfileParameter signingProfileParameter = startSigningJobParameter.getSigningProfileParameter();
            awsJsonWriter.name("signingProfileParameter");
            SigningProfileParameterJsonMarshaller.getInstance().marshall(signingProfileParameter, awsJsonWriter);
        }
        if (startSigningJobParameter.getSigningProfileName() != null) {
            String signingProfileName = startSigningJobParameter.getSigningProfileName();
            awsJsonWriter.name("signingProfileName");
            awsJsonWriter.value(signingProfileName);
        }
        if (startSigningJobParameter.getDestination() != null) {
            Destination destination = startSigningJobParameter.getDestination();
            awsJsonWriter.name(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY);
            DestinationJsonMarshaller.getInstance().marshall(destination, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
