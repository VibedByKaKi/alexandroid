package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.SubscriberMethod;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SimpleSubscriberInfo extends AbstractSubscriberInfo {
    private final SubscriberMethodInfo[] methodInfos;

    public SimpleSubscriberInfo(Class cls, boolean z, SubscriberMethodInfo[] subscriberMethodInfoArr) {
        super(cls, null, z);
        this.methodInfos = subscriberMethodInfoArr;
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfo
    public synchronized SubscriberMethod[] getSubscriberMethods() {
        try {
            try {
                int length = this.methodInfos.length;
                SubscriberMethod[] subscriberMethodArr = new SubscriberMethod[length];
                int i = 0;
                while (i < length) {
                    SubscriberMethodInfo subscriberMethodInfo = this.methodInfos[i];
                    SimpleSubscriberInfo simpleSubscriberInfo = this;
                    subscriberMethodArr[i] = simpleSubscriberInfo.createSubscriberMethod(subscriberMethodInfo.methodName, subscriberMethodInfo.eventType, subscriberMethodInfo.threadMode, subscriberMethodInfo.priority, subscriberMethodInfo.sticky);
                    i++;
                    this = simpleSubscriberInfo;
                }
                return subscriberMethodArr;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            SimpleSubscriberInfo simpleSubscriberInfo2 = this;
            Throwable th22 = th;
            throw th22;
        }
    }
}
