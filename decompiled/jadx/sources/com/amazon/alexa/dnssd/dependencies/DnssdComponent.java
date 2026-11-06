package com.amazon.alexa.dnssd.dependencies;

import com.amazon.alexa.dnssd.DefaultDnssdService;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {DnssdModule.class})
@Singleton
/* loaded from: classes17.dex */
public interface DnssdComponent {
    void inject(DefaultDnssdService defaultDnssdService);
}
