package com.amazon.tarazed.signaling.net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/signaling/net/DNSHelper;", "", "()V", "resolveIPv4Address", "Ljava/net/Inet4Address;", "hostname", "", "resolveIPv6Address", "Ljava/net/Inet6Address;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDNSHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DNSHelper.kt\ncom/amazon/tarazed/signaling/net/DNSHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n1282#2,2:37\n1282#2,2:39\n*S KotlinDebug\n*F\n+ 1 DNSHelper.kt\ncom/amazon/tarazed/signaling/net/DNSHelper\n*L\n21#1:37,2\n33#1:39,2\n*E\n"})
/* loaded from: classes19.dex */
public final class DNSHelper {

    @NotNull
    public static final DNSHelper INSTANCE = new DNSHelper();

    private DNSHelper() {
    }

    @Nullable
    public final Inet4Address resolveIPv4Address(@Nullable String hostname) {
        InetAddress inetAddress;
        InetAddress[] allByName = InetAddress.getAllByName(hostname);
        allByName.getClass();
        int length = allByName.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                inetAddress = null;
                break;
            }
            inetAddress = allByName[i];
            if (inetAddress instanceof Inet4Address) {
                break;
            }
            i++;
        }
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        return null;
    }

    @Nullable
    public final Inet6Address resolveIPv6Address(@Nullable String hostname) {
        InetAddress inetAddress;
        InetAddress[] allByName = InetAddress.getAllByName(hostname);
        allByName.getClass();
        int length = allByName.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                inetAddress = null;
                break;
            }
            inetAddress = allByName[i];
            if (inetAddress instanceof Inet6Address) {
                break;
            }
            i++;
        }
        if (inetAddress instanceof Inet6Address) {
            return (Inet6Address) inetAddress;
        }
        return null;
    }
}
