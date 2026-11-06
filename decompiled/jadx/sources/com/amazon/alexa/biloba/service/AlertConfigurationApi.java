package com.amazon.alexa.biloba.service;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.biloba.generated.network.StringUtil;
import com.amazon.alexa.biloba.model.AlertConfiguration;
import com.amazon.alexa.biloba.model.AlertConfigurationsResponse;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.dee.app.http.CoralService;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertConfigurationApi {
    public static final String TAG = "AlertConfigurationApi";
    CoralService coralService;
    PersonIdProvider personIdProvider;
    SchedulerProvider schedulerProvider;

    public AlertConfigurationApi(CoralService coralService, PersonIdProvider personIdProvider, SchedulerProvider schedulerProvider) {
        this.coralService = coralService;
        this.personIdProvider = personIdProvider;
        this.schedulerProvider = schedulerProvider;
    }

    private CoralService.Request createAlertConfigurationRequest(String str, AlertConfiguration alertConfiguration) {
        StringBuilder sb = new StringBuilder("/api/biloba/v1/alertConfigurations");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            if (sb2.length() == 0) {
                sb2.append("?");
            } else {
                sb2.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            ChatData$$ExternalSyntheticOutline0.m(sb2, FragmentMetaData.GROUP_ID, "=", str);
        }
        sb.append((CharSequence) sb2);
        return this.coralService.request(sb.toString()).withHeader("X-Amzn-OperatorId", this.personIdProvider.getPersonId());
    }

    private CoralService.Request deleteAlertConfigurationRequest(String str, String str2) {
        StringBuilder sb = new StringBuilder("/api/biloba/v1/alertConfigurations/{alertConfigurationId}".replaceAll("\\{alertConfigurationId\\}", StringUtil.escapeString(str == null ? null : StringUtil.escapeString(str))));
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            if (sb2.length() == 0) {
                sb2.append("?");
            } else {
                sb2.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            ChatData$$ExternalSyntheticOutline0.m(sb2, FragmentMetaData.GROUP_ID, "=", str2);
        }
        sb.append((CharSequence) sb2);
        return this.coralService.request(sb.toString()).withHeader("X-Amzn-OperatorId", this.personIdProvider.getPersonId());
    }

    private CoralService.Request getAlertConfigurationsRequest(String str, String str2, Integer num) {
        StringBuilder sb = new StringBuilder("/api/biloba/v1/alertConfigurations");
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("?cachebreak=");
        m.append(System.currentTimeMillis());
        if (str != null) {
            if (m.length() == 0) {
                m.append("?");
            } else {
                m.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            ChatData$$ExternalSyntheticOutline0.m(m, FragmentMetaData.GROUP_ID, "=", str);
        }
        if (str2 != null) {
            if (m.length() == 0) {
                m.append("?");
            } else {
                m.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            ChatData$$ExternalSyntheticOutline0.m(m, AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN, "=", str2);
        }
        if (num != null) {
            if (m.length() == 0) {
                m.append("?");
            } else {
                m.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            m.append("maxResults");
            m.append("=");
            m.append(StringUtil.parameterToString(num));
        }
        sb.append((CharSequence) m);
        return this.coralService.request(sb.toString()).withHeader("X-Amzn-OperatorId", this.personIdProvider.getPersonId());
    }

    private CoralService.Request updateAlertConfigurationRequest(String str, String str2, AlertConfiguration alertConfiguration) {
        StringBuilder sb = new StringBuilder("/api/biloba/v1/alertConfigurations/{alertConfigurationId}".replaceAll("\\{alertConfigurationId\\}", StringUtil.escapeString(str == null ? null : StringUtil.escapeString(str))));
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            if (sb2.length() == 0) {
                sb2.append("?");
            } else {
                sb2.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            ChatData$$ExternalSyntheticOutline0.m(sb2, FragmentMetaData.GROUP_ID, "=", str2);
        }
        sb.append((CharSequence) sb2);
        return this.coralService.request(sb.toString()).withHeader("X-Amzn-OperatorId", this.personIdProvider.getPersonId());
    }

    public Observable<AlertConfiguration> createAlertConfigurationObservable(String str, AlertConfiguration alertConfiguration) {
        return createAlertConfigurationRequest(str, alertConfiguration).post(alertConfiguration).as(AlertConfiguration.class).toObservable().observeOn(this.schedulerProvider.ui()).subscribeOn(this.schedulerProvider.io());
    }

    public Observable<Void> deleteAlertConfigurationObservable(String str, String str2) {
        return deleteAlertConfigurationRequest(str, str2).delete().as(Void.class).toObservable().observeOn(this.schedulerProvider.ui()).subscribeOn(this.schedulerProvider.io());
    }

    public Observable<AlertConfigurationsResponse> getAlertConfigurationsObservable(String str, String str2, Integer num) {
        return getAlertConfigurationsRequest(str, str2, num).get().as(AlertConfigurationsResponse.class).toObservable().observeOn(this.schedulerProvider.ui()).subscribeOn(this.schedulerProvider.io());
    }

    public CoralService getCoralService() {
        return this.coralService;
    }

    public PersonIdProvider getPersonIdProvider() {
        return this.personIdProvider;
    }

    public SchedulerProvider getSchedulerProvider() {
        return this.schedulerProvider;
    }

    public void setCoralService(CoralService coralService) {
        this.coralService = coralService;
    }

    public void setPersonIdProvider(PersonIdProvider personIdProvider) {
        this.personIdProvider = personIdProvider;
    }

    public void setSchedulerProvider(SchedulerProvider schedulerProvider) {
        this.schedulerProvider = schedulerProvider;
    }

    public Observable<AlertConfiguration> updateAlertConfigurationObservable(String str, String str2, AlertConfiguration alertConfiguration) {
        return updateAlertConfigurationRequest(str, str2, alertConfiguration).put(alertConfiguration).as(AlertConfiguration.class).toObservable().observeOn(this.schedulerProvider.ui()).subscribeOn(this.schedulerProvider.io());
    }

    public AlertConfigurationApi() {
    }
}
