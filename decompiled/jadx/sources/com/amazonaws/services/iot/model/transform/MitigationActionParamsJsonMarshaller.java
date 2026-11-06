package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AddThingsToThingGroupParams;
import com.amazonaws.services.iot.model.EnableIoTLoggingParams;
import com.amazonaws.services.iot.model.MitigationActionParams;
import com.amazonaws.services.iot.model.PublishFindingToSnsParams;
import com.amazonaws.services.iot.model.ReplaceDefaultPolicyVersionParams;
import com.amazonaws.services.iot.model.UpdateCACertificateParams;
import com.amazonaws.services.iot.model.UpdateDeviceCertificateParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MitigationActionParamsJsonMarshaller {
    private static MitigationActionParamsJsonMarshaller instance;

    public static MitigationActionParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MitigationActionParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MitigationActionParams mitigationActionParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (mitigationActionParams.getUpdateDeviceCertificateParams() != null) {
            UpdateDeviceCertificateParams updateDeviceCertificateParams = mitigationActionParams.getUpdateDeviceCertificateParams();
            awsJsonWriter.name("updateDeviceCertificateParams");
            UpdateDeviceCertificateParamsJsonMarshaller.getInstance().marshall(updateDeviceCertificateParams, awsJsonWriter);
        }
        if (mitigationActionParams.getUpdateCACertificateParams() != null) {
            UpdateCACertificateParams updateCACertificateParams = mitigationActionParams.getUpdateCACertificateParams();
            awsJsonWriter.name("updateCACertificateParams");
            UpdateCACertificateParamsJsonMarshaller.getInstance().marshall(updateCACertificateParams, awsJsonWriter);
        }
        if (mitigationActionParams.getAddThingsToThingGroupParams() != null) {
            AddThingsToThingGroupParams addThingsToThingGroupParams = mitigationActionParams.getAddThingsToThingGroupParams();
            awsJsonWriter.name("addThingsToThingGroupParams");
            AddThingsToThingGroupParamsJsonMarshaller.getInstance().marshall(addThingsToThingGroupParams, awsJsonWriter);
        }
        if (mitigationActionParams.getReplaceDefaultPolicyVersionParams() != null) {
            ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams = mitigationActionParams.getReplaceDefaultPolicyVersionParams();
            awsJsonWriter.name("replaceDefaultPolicyVersionParams");
            ReplaceDefaultPolicyVersionParamsJsonMarshaller.getInstance().marshall(replaceDefaultPolicyVersionParams, awsJsonWriter);
        }
        if (mitigationActionParams.getEnableIoTLoggingParams() != null) {
            EnableIoTLoggingParams enableIoTLoggingParams = mitigationActionParams.getEnableIoTLoggingParams();
            awsJsonWriter.name("enableIoTLoggingParams");
            EnableIoTLoggingParamsJsonMarshaller.getInstance().marshall(enableIoTLoggingParams, awsJsonWriter);
        }
        if (mitigationActionParams.getPublishFindingToSnsParams() != null) {
            PublishFindingToSnsParams publishFindingToSnsParams = mitigationActionParams.getPublishFindingToSnsParams();
            awsJsonWriter.name("publishFindingToSnsParams");
            PublishFindingToSnsParamsJsonMarshaller.getInstance().marshall(publishFindingToSnsParams, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
