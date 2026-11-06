package com.amazon.dee.app.services.metrics.kinesis.context;

import com.amazon.dee.app.services.metrics.kinesis.system.AppDetails;
import com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails;
import com.amazon.dee.app.util.KinesisContextIdUtil;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Regions;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/context/KinesisContext;", "", "getAppID", "", "getKinesisStreamName", "getKinesisAwsRegion", "Lcom/amazonaws/regions/Regions;", "getUniqueId", "Lcom/amazon/dee/app/util/KinesisContextIdUtil;", "getDeviceDetails", "Lcom/amazon/dee/app/services/metrics/kinesis/system/DeviceDetails;", "getAppDetails", "Lcom/amazon/dee/app/services/metrics/kinesis/system/AppDetails;", "getAWSCredentialsProvider", "Lcom/amazonaws/auth/AWSCredentialsProvider;", "getCognitoIdentityPoolId", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KinesisContext {
    @NotNull
    AWSCredentialsProvider getAWSCredentialsProvider();

    @NotNull
    AppDetails getAppDetails();

    @NotNull
    String getAppID();

    @NotNull
    String getCognitoIdentityPoolId();

    @NotNull
    DeviceDetails getDeviceDetails();

    @NotNull
    Regions getKinesisAwsRegion();

    @NotNull
    String getKinesisStreamName();

    @NotNull
    KinesisContextIdUtil getUniqueId();
}
